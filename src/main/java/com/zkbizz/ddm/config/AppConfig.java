package com.zkbizz.ddm.config;

import com.zkbizz.ddm.annotations.Speedy;
import com.zkbizz.ddm.dao.BasicPaymentDao;
import com.zkbizz.ddm.dao.PaymentDao;
import com.zkbizz.ddm.dao.SmartPaymentDao;
import com.zkbizz.ddm.service.DefaultTransactionBo;
import com.zkbizz.ddm.service.SpeedyTransactionBo;
import com.zkbizz.ddm.service.TransactionBo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.enterprise.inject.Default;

@Configuration
@ComponentScan("com.zkbizz.ddm.service")
@PropertySource(value = "default.properties")
public class AppConfig {
      Environment environment;

//    @Inject
//    @Speedy
//    TransactionBo speedyTransactionBo;

//    @Bean
//    public PaymentResource paymentService(){
//        System.out.println("creating PaymentResource from App Config");
//        return new PaymentResource(speedyTransactionBo);
//    }

    @Bean
    TransactionBo transactionBo(){
        System.out.println("creating DefaultTransactionBo from App Config");
        return new DefaultTransactionBo();
    }

    @Bean
    @Speedy
    TransactionBo speedTransactionBo(){
        System.out.println("creating SpeedyTransactionBo from App Config");
        return new SpeedyTransactionBo();
    }

    @Bean
    @Default
    PaymentDao basic(){
        return new BasicPaymentDao();
    }

    @Bean
    @Speedy
    PaymentDao smart(){
        return new SmartPaymentDao();
    }
}
