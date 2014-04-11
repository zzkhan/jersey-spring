package com.zkbizz.ddm.rest;

import com.zkbizz.ddm.annotations.Speedy;
import com.zkbizz.ddm.service.DefaultTransactionBo;
import com.zkbizz.ddm.service.SpeedyTransactionBo;
import com.zkbizz.ddm.service.TransactionBo;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

/**
 * Created with IntelliJ IDEA.
 * User: zzkhan
 * Date: 01/12/2013
 * Time: 16:52
 * To change this template use File | Settings | File Templates.
 */
public class MyApplicationBinder extends AbstractBinder {
    @Override
    protected void configure() {
        System.out.println("MyApplicationBinder doing shit........");
    }
}
