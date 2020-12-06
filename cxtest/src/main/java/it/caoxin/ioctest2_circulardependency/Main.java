package it.caoxin.ioctest2_circulardependency;

import it.caoxin.ioctest2_circulardependency.bean.CircularDependencyA;
import it.caoxin.ioctest2_circulardependency.bean.CircularDependencyB;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2020/3/7
 * 功能描述:Spring循环依赖测试
 * 1.关闭循环依赖
 * 	Spring默认支持循环依赖:
 * 修改日期:2020/3/7
 * 修改描述:
 */

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Config.class);
		context.scan("xxxxxx");
		System.out.println(context.getBean(CircularDependencyA.class));
	}
}
