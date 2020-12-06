package it.caoxin.ioctest3_factorypostprocessors.main;

import it.caoxin.ioctest3_factorypostprocessors.bean.CircularDependencyA;
import it.caoxin.ioctest3_factorypostprocessors.bean.CircularDependencyB;
import it.caoxin.ioctest3_factorypostprocessors.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2020/3/7
 * 功能描述:
 * 修改日期:2020/3/7
 * 修改描述:
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Config.class);
		System.out.println(context.getBean(CircularDependencyB.class));
	}
}
