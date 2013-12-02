package com.zkbizz.ddm.service;

import com.zkbizz.ddm.annotations.Speedy;
import com.zkbizz.ddm.dao.PaymentDao;
import javax.inject.Inject;
import javax.inject.Named;

import static java.lang.String.format;

@Named
public class SpeedyTransactionBo implements TransactionBo {

    @Inject
    @Speedy
    PaymentDao paymentDao;

    @Override
    public void save() {
        System.out.println(format("saved called by %s",this.getClass().getName()));
    }
}
