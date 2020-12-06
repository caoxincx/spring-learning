package it.caoxin.ioctest3_factorypostprocessors.beanfactoryprocessor;

import it.caoxin.ioctest3_factorypostprocessors.bean.CircularDependencyB;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2020/3/7
 * 功能描述:
 * 修改日期:2020/3/7
 * 修改描述:
 */
@Component
public class ModifyClassBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition beanDefinition =
				(GenericBeanDefinition) beanFactory.getBeanDefinition("circularDependencyA");
		beanDefinition.setBeanClass(CircularDependencyB.class);
	}
}
