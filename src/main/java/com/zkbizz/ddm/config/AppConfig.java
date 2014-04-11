package com.zkbizz.ddm.config;

import com.zkbizz.ddm.annotations.Speedy;
import com.zkbizz.ddm.service.DefaultTransactionBo;
import com.zkbizz.ddm.service.SpeedyTransactionBo;
import com.zkbizz.ddm.service.TransactionBo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.inject.Inject;

@Configuration
@ComponentScan(basePackages = "com.zkbizz.ddm.service")
@PropertySource(value = {"default.properties","dev.properties"})
public class AppConfig {
    @Inject
    Environment environment;

//    @Bean
//    TransactionBo transactionBo(){
//        String host = environment.getProperty("service.host");
//        String path = environment.getProperty("service.path");
//        System.out.println(String.format("**************** property value: %s/%s  **************", host,path));
//        System.out.println("creating DefaultTransactionBo from App Config");
//        return new DefaultTransactionBo();
//    }
//
//    @Bean
//    @Speedy
//    TransactionBo speedTransactionBo(){
//        System.out.println("creating SpeedyTransactionBo from App Config");
//        return new SpeedyTransactionBo();
//    }

//    @Bean
//    @Default
//    PaymentDao basic(){
//        return new BasicPaymentDao();
//    }
//
//    @Bean(name = "speedy")
//    PaymentDao smart(){
//        return new SmartPaymentDao();
//    }
}
