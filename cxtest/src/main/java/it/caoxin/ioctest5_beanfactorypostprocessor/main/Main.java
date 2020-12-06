package it.caoxin.ioctest5_beanfactorypostprocessor.main;

import it.caoxin.ioctest5_beanfactorypostprocessor.config.AppConfig;
import it.caoxin.ioctest5_beanfactorypostprocessor.postprocess.TestBeanFactoryRegisterPostProcess;
import it.caoxin.ioctest5_beanfactorypostprocessor.postprocess.TestBeanFactroyPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2020/3/14
 * 功能描述:
 * 修改日期:2020/3/14
 * 修改描述:
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.addBeanFactoryPostProcessor(new TestBeanFactroyPostProcessor());
		context.addBeanFactoryPostProcessor(new TestBeanFactoryRegisterPostProcess());
		context.refresh();
	}
}
