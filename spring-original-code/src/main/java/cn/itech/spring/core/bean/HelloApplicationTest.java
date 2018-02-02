package cn.itech.spring.core.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloApplicationTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("cn.itech.spring.core.bean");
		context.refresh();
		HelloService bean = context.getBean(HelloService.class);
		System.out.println(bean);
	}
  
}
