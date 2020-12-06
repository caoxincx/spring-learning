package it.caoxin.ioctest4_beanlifecycle.postprocessor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
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
public class BeanLifeBeanPostProcess implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName+"---------1.BeanLifeBeanPost before------");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName+"---------2.BeanLifeBeanPost after------");
		return bean;
	}
}
