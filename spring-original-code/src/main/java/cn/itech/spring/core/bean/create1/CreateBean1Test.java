package cn.itech.spring.core.bean.create1;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CreateBean1Test {

	
	@Test
	public void test1() {
		
		BeanFactory bean= new ClassPathXmlApplicationContext("core/create/spring-create.xml");
		HelloApi api1 = (HelloApi) bean.getBean("hello");
		System.out.println(api1);
		HelloApi api2 = (HelloApi) bean.getBean("hello2");
		api2.sayHello();
		System.out.println(api1);
		// 静态工厂方法
		HelloApi helloApi = bean.getBean("bean", HelloApi.class);
		System.out.println(helloApi);
		
		HelloApi bean2 = bean.getBean("bean2", HelloApi.class);
		System.out.println(bean2);
	}
	
}
