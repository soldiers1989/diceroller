package com.dicero.diceroller.dal.mysql.repository;

import com.dicero.diceroller.domain.model.TradeOrderPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p></p>
 *
 * @author znz zengningzhong@souche.com
 * @version 2017/10/29
 */
public interface TradeOrderPORepository extends JpaRepository<TradeOrderPO, Integer> {
    TradeOrderPO findByTradeVoucherNo(String tradeVoucherNo);

    TradeOrderPO findByTradeSrcVoucherNo(String tradeSrcVoucherNo);
}