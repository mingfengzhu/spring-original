package cn.itech.spring.core.bean.init;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@Configurable
public class AppConfig {

	@Bean("helloService")
	public HelloService helloService() {
		return new HelloServiceImpl();
	}
	
	@Bean("aHelloService")
	@Primary
	public HelloService aHelloService() {
		return new AHelloSevice();
	}
	
	@Bean("bHelloService")
	@Primary
	public HelloService bHelloService() {
		return new BHelloService();
	}
	
}
