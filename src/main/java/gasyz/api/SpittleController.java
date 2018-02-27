package gasyz.api;

import gasyz.common.BusinessException;
import gasyz.common.Code;
import gasyz.common.CommonResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaoang on 2018/2/26.
 */
@RestController
@RequestMapping("/spittles")
public class SpittleController {

    @RequestMapping("/get")
    public Object spilltes(Integer max) {
        if (max!=1) {
            throw new BusinessException("ERROR",max+"");
        }
     return new CommonResponse(Code.SUCCESS,"测试",max);
    }
}
