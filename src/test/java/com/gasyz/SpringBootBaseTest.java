package com.gasyz;

import com.gasyz.spittr.service.SpitterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by gaoang on 2018/3/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootBaseTest {
    @Autowired
    private SpitterService spitterService;

    @Test
    public void test () {
        System.out.println("a");
    }
}
