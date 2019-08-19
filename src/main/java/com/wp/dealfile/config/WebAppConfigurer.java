package com.wp.dealfile.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.Resource;

@Configuration
public class WebAppConfigurer extends WebMvcConfigurerAdapter {
    @Value("spring.resources.static-locations")
    private String paths;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("file:d:/Users/dalaoyang/Downloads/");
        super.addResourceHandlers(registry);
    }
}
