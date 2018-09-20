package com.lwaiting;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Yang
 * 2018-06-02 17:44
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
//@Data
public class LoggerTest {

    @Test
    public void test1() {
        String name = "lwaiting";
        String password = "123456";
        log.debug("debug...");
        log.info("name: " + name + " ,password: " + password);
        log.info("name: {}, password: {}", name, password);
        log.error("error...");
        log.warn("warn...");
    }
}