package cn.itech.spring.core.bean.init;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService{

	@Override
	public void hello() {
		System.out.println(" Hello world! ");
	}

}
