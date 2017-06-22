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
@Order(1)
public class CommandLineRunner2 implements CommandLineRunner {
    Logger logger= LoggerFactory.getLogger(CommandLineRunner2.class);

    @Override
    public void run(String... strings) throws Exception {
        logger.info(" => This is CommandLineRunner2, order is 1");
    }
}
