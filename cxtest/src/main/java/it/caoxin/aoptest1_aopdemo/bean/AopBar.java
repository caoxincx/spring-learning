package it.caoxin.aoptest1_aopdemo.bean;

import org.springframework.stereotype.Component;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2020/3/9
 * 功能描述:
 * 修改日期:2020/3/9
 * 修改描述:
 */
@Component
public class AopBar {
	public void testAop() {
		System.out.println("i 'm aop bar...");
	}
}
