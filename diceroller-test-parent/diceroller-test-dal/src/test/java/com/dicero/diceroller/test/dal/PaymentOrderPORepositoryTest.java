package com.dicero.diceroller.test.dal;

import com.dicero.diceroller.TestBase;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import com.dicero.diceroller.dal.mysql.repository.PaymentOrderPORepository;
import com.dicero.diceroller.domain.model.PaymentOrderPO;
import org.junit.Test;

/**
 * <p></p>
 *
 * @author znz zengningzhong@souche.com
 * @version 2017/10/29
 */
public class PaymentOrderPORepositoryTest extends TestBase {
    @Autowired
    PaymentOrderPORepository PaymentOrderPORepository;

    @Test
    public void findByIdTest() {
        // PaymentOrderPO record = PaymentOrderPOrepository.findById(1);
        //  println(record);
        // Assert.assertNotNull(record);
    }
}
