package com.gasyz;

import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;

/**
 * Created by gaoang on 2018/3/13.
 */
@ContextConfiguration(value = {"classpath*:spring.xml"})
@Rollback(false)
public class SpringTransactionContextTestngTest extends AbstractTransactionalTestNGSpringContextTests {
}
