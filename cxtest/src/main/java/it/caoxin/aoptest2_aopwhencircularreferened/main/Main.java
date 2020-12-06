package it.caoxin.aoptest2_aopwhencircularreferened.main;

import it.caoxin.aoptest2_aopwhencircularreferened.bean.CircularReferenceB;
import it.caoxin.aoptest2_aopwhencircularreferened.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2020/3/9
 * 功能描述:
 * 测试单例Bean中,Aop的如何实现的
 * 为什么要测试,因为解决循环用了IOC容器中的earlySingletonObjects,
 * 前一个SpringBean的声明周期并没有走到对象初始化阶段，所有也没有调用Bean
 * BeanPostProcessors处理器对应的AspectJAwareAdvisorAutoProxyCreator
 * (本次测试用中使用的是@Aspect注解去开发所以,BeanPostProcessor是从上述类实现AOP)?
 * 竟然没有调用,那么Spring如何实现的呢
 *
 * 执行结果如下
 * CircularReferenceA constracor
 * CircularReferenceB constractor
 * -------------testAop------------
 * i has replaced by proxy
 * 修改日期:2020/3/9
 * 修改描述:
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.getBean(CircularReferenceB.class).testAop();
	}
}
