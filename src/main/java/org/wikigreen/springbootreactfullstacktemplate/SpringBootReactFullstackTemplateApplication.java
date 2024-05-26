package org.wikigreen.springbootreactfullstacktemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringBootReactFullstackTemplateApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootReactFullstackTemplateApplication.class, args);
    }

    public void addViewController(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index.html");
    }

}
