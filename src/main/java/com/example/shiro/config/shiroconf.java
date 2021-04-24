package com.example.shiro.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class shiroconf {


    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(@Qualifier("defaultWebSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager);
        return  shiroFilterFactoryBean;

    }


    @Bean
    public DefaultWebSecurityManager defaultWebSecurityManager(@Qualifier("shiroR") ShiroR ShiroR){

        System.out.println("sdassssssssssd");
        DefaultWebSecurityManager manager=new DefaultWebSecurityManager();
        manager.setRealm(ShiroR);
        return  manager;
    }

    @Bean
    public ShiroR shiroR(){
        return  new ShiroR();
    }
}
