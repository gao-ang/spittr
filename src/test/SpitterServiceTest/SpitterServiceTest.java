package SpitterServiceTest;

import gasyz.spittr.service.SpitterService;

import javax.annotation.Resource;

/**
 * Created by gaoang on 2018/3/2.
 */
public class SpitterServiceTest extends SpringContextTestngTest {
    @Resource
    private SpitterService spitterService;

    public void test() {
        spitterService.test1();
    }
}
