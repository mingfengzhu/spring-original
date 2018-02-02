package cn.itech.spring.core.bean;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class AppConfig {

	@Bean
	public HelloService helloService() {
		return new HelloServiceImpl();
	}
}
