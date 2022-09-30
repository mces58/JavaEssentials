package com.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy // proxy'leri kullanilabilir hale getirir.
@ComponentScan(basePackages = "com.aop")
public class Config {

}
