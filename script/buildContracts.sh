#!/usr/bin/env bash

set -e
set -o pipefail

baseDir="./diceroller-code-parent/diceroller-core-engine/src/main/resources/solidity"

targets="
greeter/TxAttackWallet
"

for target in ${targets}; do
    dirName=$(dirname "${target}")
    fileName=$(basename "${target}")

    cd $baseDir
    echo "Compiling Solidity file ${target}.sol"

    solc --bin --abi --optimize --overwrite \
            --allow-paths "$(pwd)" \
            ${dirName}/${fileName}.sol -o ${dirName}/build/
    echo "Complete"

    echo "Generating contract bindings"
    web3j solidity generate \
        ${dirName}/build/${fileName}.bin \
        ${dirName}/build/${fileName}.abi \
        -p com.dicero.diceroller.core.coin.contracts \
        -o ../../java/ > /dev/null
    echo "Complete"

    cd -
done