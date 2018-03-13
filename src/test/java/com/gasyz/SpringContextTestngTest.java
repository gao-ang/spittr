package com.gasyz;

import com.gasyz.config.RootConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * Created by gaoang on 2018/3/2.
 */
@ContextConfiguration(classes = {RootConfig.class})
public class SpringContextTestngTest extends AbstractTestNGSpringContextTests {
}
