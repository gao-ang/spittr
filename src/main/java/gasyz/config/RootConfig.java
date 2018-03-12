package gasyz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by gaoang on 2018/2/26.
 */
@Configuration
@Import({RedisConfig.class,SpringDBConfig.class,WebConfig.class})
@ComponentScan(basePackages = {"gasyz.*"},excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)})
public class RootConfig {

}
