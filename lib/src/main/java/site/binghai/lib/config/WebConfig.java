package site.binghai.lib.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import site.binghai.lib.inters.WxLoginFilter;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //registry.addInterceptor(new MockUserFilter()).addPathPatterns("/user/**", "/shop/**");
        registry.addInterceptor(new WxLoginFilter()).addPathPatterns("/user/**", "/shop/**");
    }
}

