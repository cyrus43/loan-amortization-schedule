package com.singlify.loanamortizationschedule.finance.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;

@Configuration
@PropertySource("classpath:thymeleaf.properties")
public class ThymeleafConfig {
    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setPrefix("/WEB-INF/templates/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode("HTML5");

        return templateResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver());
        return templateEngine;
    }

    /** View resolver for Thymeleaf templates. */
    @Bean
    public ViewResolver viewResolver() {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine());
        viewResolver.setOrder(1);

        return viewResolver;
    }

    /** View resolver for standard jsp */
    // @Bean
    // public ViewResolver viewResolver() {
    //     System.out.println("Inside View Resolver...");
    //     InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
    //     viewResolver.setViewClass(JstlView.class);
    //     viewResolver.setPrefix("/WEB-INF/views/");
    //     viewResolver.setSuffix(".jsp");
    //     return viewResolver;
    // }

}
