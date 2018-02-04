package cn.itech.spring.core.bean.create1;

public class SayHelloApi2Impl implements HelloApi {

	private String msg;
	
	public SayHelloApi2Impl() {}

	public SayHelloApi2Impl(String msg) {
		this.msg = msg;
	}
	
	@Override
	public void sayHello() {
		System.out.println(" called :" + msg);
	}

}
