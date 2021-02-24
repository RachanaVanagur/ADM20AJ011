package com.cognizant.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
  //@Bean
  @Bean(name="cog1")	
  public BeanA getBeanA() {
	  System.out.println("--- inside getBeanA()");
	  BeanA bean = new BeanA();
	  bean.setName("Sunil");
	  return bean;
  }
  
  //@Bean
  @Bean(value = {"cog2","cog3"})
  public BeanB getBeanB() {
	  System.out.println("--- inside getbeanB()");
	  BeanB bean = new BeanB("Joseph");	  
	  return bean;
  }
  
  @Bean(name = "mywork", initMethod = "workInit", destroyMethod = "workDestroy")
  @Scope("singleton")
  //@Scope("prototype")
  @Lazy(true)
  public Work getWork() {
	  return new Work();
  }
}
