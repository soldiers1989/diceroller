package com.dicero.diceroller.test.dal;

import com.dicero.diceroller.TestBase;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import com.dicero.diceroller.dal.mysql.repository.SettlementSessionPORepository;
import com.dicero.diceroller.domain.model.SettlementSessionPO;
import org.junit.Test;

/**
 * <p></p>
 *
 * @author znz zengningzhong@souche.com
 * @version 2017/10/29
 */
public class SettlementSessionPORepositoryTest extends TestBase {
    @Autowired
    SettlementSessionPORepository SettlementSessionPORepository;

    @Test
    public void findByIdTest() {
        // SettlementSessionPO record = SettlementSessionPOrepository.findById(1);
        // println(record);
        // Assert.assertNotNull(record);
    }
}
