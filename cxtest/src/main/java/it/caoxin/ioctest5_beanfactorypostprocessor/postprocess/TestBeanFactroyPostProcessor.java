package it.caoxin.ioctest5_beanfactorypostprocessor.postprocess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2020/3/14
 * 功能描述:
 * 修改日期:2020/3/14
 * 修改描述:
 */
public class TestBeanFactroyPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("3.test beanfactorypostprocessors");
	}
}
