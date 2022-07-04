package cyou.luoyu.VueProvideAndInject.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * CrosConfig
 *
 * @author 王一峰
 * @date 2022/06/23
 */
@Configuration
public class CrosConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedHeaders("*").allowedOrigins("*");
        WebMvcConfigurer.super.addCorsMappings(registry);
    }
}
