package com.upskill.springbootjenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinsApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);

    @Test
    void contextLoads() {
        logger.info("Test case is executing....");
    }

}
