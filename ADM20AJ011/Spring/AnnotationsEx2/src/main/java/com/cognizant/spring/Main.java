package com.cognizant.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		BeanA bean1 = context.getBean(BeanA.class);		
		System.out.println(bean1);
		
		BeanA bean2 = (BeanA)context.getBean("cog1");
		System.out.println(bean2);
		
		System.out.println("---------------------------");
		/*
		BeanB bean3 = context.getBean(BeanB.class);
		System.out.println(bean3);
		
		BeanB bean4 = (BeanB)context.getBean("getBeanB");
		System.out.println(bean4);
		*/
		BeanB bean3 = (BeanB) context.getBean("cog2");
		System.out.println(bean3);
		
		BeanB bean4 = (BeanB)context.getBean("cog3");
		System.out.println(bean4);
		
		System.out.println("----------------------------------");
		Work work1 = (Work) context.getBean("mywork");
		System.out.println(work1.hashCode());
		work1.doWork();
		
		Work work2 = (Work) context.getBean("mywork");
		System.out.println(work2.hashCode());
		work2.doWork();		
		System.out.println("----------------------------------");
		context.registerShutdownHook();
		context.close();
	}
}
