1.创建bean
a.bean的命名:
  一个bean可以有一个或多个id(称为标识符或名字).在这里把第一个id称为"标识符", 其余id叫做"别名"
  这些id在IOC容器中必须是唯一的.
  1.不指定id, 只配置全限定类名. 由IOC容器为其默认生成一个标识, 
  	调用方通过接口 T getBean(Class<T> requiredType)获取bean
  	<bean class="..SayHelloImpl">
  2.指定id, 在IOC容器中唯一
  	<bean id = "hello" class="..SayHelloImpl">
  3.指定name , 这样name就是"标识符", 必须在IOC容器中唯一
  	<bean name="bean" class="..SayHelloImpl">
  4.指定id和name, id就是标识符, 而name就是别名, 必须在IOC容器中唯一
  	<bean id="bean1" name="alias1" class="..SayHelloImpl"/>
  	如果id和name一样, IOC容器能检测到, 则消除冲突
  	<bean id="bean3" name="alias3" class="..SayHelloImpl"/>
  5.指定多个name, 多个name用",",";"," " 分隔, 第一个被用作标识符, 其他的(alias1, alias2, alias3,)
  	是别名, 所有标识符也必须在IOC容器为唯一
  	<bean name="bean1;alias11,alias12;alias13 alias14" class="..SayHelloImpl">
  	当指定id时, name指定我i标识符的全部为别名
  	<bean id="bean2" name="alias21;alias22" class="..SayHelloImpl">
  6.使用<alias>标签指定别名, 别名也必须在IOC容器中唯一
  	<bean name="bean" class="..SayHelloImpl">
  	<alias alias="alias1" name="bean">
  	<alias alias="alias2" name="bean">
b.实例化bean
  1.使用构造器实例化bean : 默认空参构造器和有参构造器
  	有参构造器使用<constructor-arg>标签指定参数值, index表示位置, value表示常量值
  	指定引用, ref来引用另一个bean定义
  2.使用静态工厂方式实例化bean
  	这种方式除了指定必须的Class属性, 还要指定factory-method属性来指定实例化bean的方法,使用静态工厂方法也允许指定方法参数
  	spring IOC容器调用此属性指定的方法来获取bean
  3.实例化工厂方法实例bean
  	不能指定Class属性, 必须使用Factory-bean的属性来指定工厂bean, factory-method属性指定实例化bean的方法
  	而且使用实例化工厂方法允许指定方法参数, 方法和构造器方法一样
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	