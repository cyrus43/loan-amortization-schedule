package com.singlify.loanamortizationschedule.finance;


import com.singlify.loanamortizationschedule.finance.config.DispatcherConfig;
import com.singlify.loanamortizationschedule.finance.config.ThymeleafConfig;
import com.singlify.loanamortizationschedule.finance.config.WebInitializerConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Application configuration instead of web.xml config.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.singlify.loanamortizationschedule.finance")
@Import({ WebInitializerConfig.class, DispatcherConfig.class, ThymeleafConfig.class})
public class AppConfig
{
    // does nothing but scan and load
}