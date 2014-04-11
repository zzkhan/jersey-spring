package com.zkbizz.ddm.service;

import com.zkbizz.ddm.annotations.Speedy;

import javax.inject.Named;

import static java.lang.String.format;

@Speedy
@Named
public class SpeedyTransactionBo implements TransactionBo {
    @Override
    public void save() {
        System.out.println(format("saved called by %s",this.getClass().getName()));
    }
}
