package cn.itech.spring.core.bean.create1;
/**
 * 静态工厂方法
 * @author Administrator
 *
 */
public class HelloApiStaticFactory {

	// 工厂方法
	public static HelloApi newInstance(String msg) {
		// 返回实例
		return new SayHelloApi2Impl(msg);
	}
}
