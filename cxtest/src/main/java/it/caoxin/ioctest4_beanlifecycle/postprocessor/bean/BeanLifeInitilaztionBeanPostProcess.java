package it.caoxin.ioctest4_beanlifecycle.postprocessor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2020/3/11
 * 功能描述:
 * 修改日期:2020/3/11
 * 修改描述:
 */
@Component
public class BeanLifeInitilaztionBeanPostProcess implements InstantiationAwareBeanPostProcessor {
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println(beanName+"--------1.BeanInitilaztion before---------");
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println(beanName+"--------2.BeanInitilaztion after---------");
		return true;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		System.out.println(beanName+"--------3.BeanInitilaztion propertyvalue---------");
		return null;
	}
}
