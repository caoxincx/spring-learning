package it.caoxin.ioctest1_beanlife;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2020/3/5
 * 功能描述:Spring声明周期初步理解
 * 1.实例化  --->spring干
 * 2.属性赋值--->spring干
 * 3.初始化----->可以自定义
 * 4.销毁------>可以自定义
 * BeanPostProcessor分类
 * 1.影响多个bean,InstantialBeanPostProcessor,在实例化前后执行
 * 2.Aware获取Spring容器资源只调用一次，在初始化的前后
 * 3.生米周期的接口:初始化接口，销毁接口
 * 修改日期:2020/3/5
 * 修改描述:
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Person bean = context.getBean(Person.class);
		System.out.println(bean);
	}
}
