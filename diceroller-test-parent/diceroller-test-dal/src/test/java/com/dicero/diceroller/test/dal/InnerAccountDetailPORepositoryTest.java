package com.dicero.diceroller.test.dal;

import com.dicero.diceroller.TestBase;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import com.dicero.diceroller.dal.mysql.repository.InnerAccountDetailPORepository;
import com.dicero.diceroller.domain.model.InnerAccountDetailPO;
import org.junit.Test;

/**
 * <p></p>
 *
 * @author znz zengningzhong@souche.com
 * @version 2017/10/29
 */
public class InnerAccountDetailPORepositoryTest extends TestBase {
    @Autowired
    InnerAccountDetailPORepository InnerAccountDetailPORepository;

    @Test
    public void findByIdTest() {
        // InnerAccountDetailPO record = InnerAccountDetailPOrepository.findById(1);
        //  println(record);
        // Assert.assertNotNull(record);
    }
}
