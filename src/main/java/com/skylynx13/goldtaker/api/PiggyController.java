package com.skylynx13.goldtaker.api;

import com.skylynx13.goldtaker.service.Piggy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PiggyController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PiggyController.class);
    @Autowired
    Piggy piggy;

    @RequestMapping(value = "/piggy", method = RequestMethod.POST)
    public ResponseEntity<String> process(@RequestBody String body) {
        LOGGER.info("Request body is: [" + body + "]");
        return new ResponseEntity<>(piggy.process(body), HttpStatus.ACCEPTED);
    }
}
