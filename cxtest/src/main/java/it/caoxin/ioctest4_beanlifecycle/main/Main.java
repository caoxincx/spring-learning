package it.caoxin.ioctest4_beanlifecycle.main;

import it.caoxin.ioctest4_beanlifecycle.bean.BeanLifeCycle;
import it.caoxin.ioctest4_beanlifecycle.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2020/3/9
 * 功能描述:
 * 修改日期:2020/3/9
 * 修改描述:
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.getBean(BeanLifeCycle.class);
		context.close();
	}
}
