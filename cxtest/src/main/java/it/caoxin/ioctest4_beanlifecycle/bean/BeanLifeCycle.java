package it.caoxin.ioctest4_beanlifecycle.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2020/3/9
 * 功能描述:控制Spring Bean的声明周期
 * The InitializingBean and DisposableBean callback interfaces
 * Custom init() and destroy() methods
 * The @PostConstruct and @PreDestroy annotations. You can combine these mechanisms to control a given bean.
 * 修改日期:2020/3/9
 * 修改描述:
 */
@Component
public class BeanLifeCycle implements InitializingBean, DisposableBean {
	public BeanLifeCycle() {
		System.out.println("--------------------1.Constractor");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("---------------------2.postConstruct");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// 对应的代码配置代码
		// <bean id="exampleInitBean" class="examples.ExampleBean" init-method="init"/>
		System.out.println("--------------------3.afterPropertiesSet");
	}

	@PreDestroy
	public void preDestory() {
		System.out.println("---------------------4.preDestory");
	}
	@Override
	public void destroy() throws Exception {
		// 对应的配置代码
		// <bean id="exampleInitBean" class="examples.ExampleBean" destroy-method="cleanup"/>
		System.out.println("--------------------5.destory");
	}
}
