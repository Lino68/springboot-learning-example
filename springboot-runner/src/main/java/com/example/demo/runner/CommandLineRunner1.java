package com.example.demo.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Lino on 2017/6/22.
 */
@Component
@Order(2)
public class CommandLineRunner1 implements CommandLineRunner {
    Logger logger= LoggerFactory.getLogger(CommandLineRunner1.class);

    @Override
    public void run(String... strings) throws Exception {
        logger.info(" => This is CommandLineRunner1, order is 2");
    }
}
