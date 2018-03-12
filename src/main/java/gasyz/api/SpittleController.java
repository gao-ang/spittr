package gasyz.api;

import gasyz.common.BusinessException;
import gasyz.common.Code;
import gasyz.common.CommonResponse;
import gasyz.spittr.domain.Spitter;
import gasyz.spittr.service.SpitterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by gaoang on 2018/2/26.
 */
@RestController
@RequestMapping("/spittles")
public class SpittleController {

    @Resource
    private SpitterService spitterService;

    @RequestMapping("/get")
    public Object spilltes(Integer max) {
        if (max!=1) {
            throw new BusinessException("ERROR",max+"");
        }
     return new CommonResponse(Code.SUCCESS,"测试",max);
    }

    @RequestMapping("/findAll")
    public Object findAll() {
        List<Spitter> all = spitterService.findAll();
        return new CommonResponse(Code.SUCCESS,"所有数据",all);
    }

    @RequestMapping("/saveRedis")
    public Object saveRedis() {
        spitterService.saveRedis();
        return null;
    }
}
