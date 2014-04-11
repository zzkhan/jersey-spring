package com.zkbizz.ddm.service;

import org.springframework.stereotype.Service;

import javax.enterprise.inject.Default;
import javax.inject.Named;

import static java.lang.String.format;

@Service
public class DefaultTransactionBo implements TransactionBo {

    @Override
    public void save() {
        System.out.println(format("saved called by %s",this.getClass().getName()));
    }
}
