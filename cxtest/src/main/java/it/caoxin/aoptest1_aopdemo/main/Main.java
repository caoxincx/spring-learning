package it.caoxin.aoptest1_aopdemo.main;

import it.caoxin.aoptest1_aopdemo.bean.AopBar;
import it.caoxin.aoptest1_aopdemo.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.File;

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
		AopBar bean = context.getBean(AopBar.class);
		bean.testAop();
	}
}