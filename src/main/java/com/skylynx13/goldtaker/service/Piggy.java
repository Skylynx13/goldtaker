package com.skylynx13.goldtaker.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;

public class Piggy {
    private static final Logger LOGGER = LoggerFactory.getLogger(Piggy.class);

    public String process(String body) {
        LOGGER.info("Piggy processing: [" + body + "]");
        return new String("Bank closed.");
    }
}
