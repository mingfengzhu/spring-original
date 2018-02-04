package cn.itech.spring.core.bean.create1;
/**
 * 实例化工厂类
 * @author Administrator
 *
 */
public class HelloApiInstanceFactory {

	public HelloApi newInstance(String msg) {
		return new SayHelloApi2Impl(msg);
	}
}
