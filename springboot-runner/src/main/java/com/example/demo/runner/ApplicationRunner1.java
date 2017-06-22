package com.example.demo.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Lino on 2017/6/22.
 */
@Component
@Order(4)
public class ApplicationRunner1 implements ApplicationRunner {
    Logger logger= LoggerFactory.getLogger(ApplicationRunner1.class);

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        logger.info(" => This is ApplicationRunner1, order is 4");
    }
}
