package it.caoxin.aoptest2_aopwhencircularreferened.bean;

import org.springframework.beans.factory.annotation.Autowired;
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
public class CircularReferenceB {

	public CircularReferenceB() {
		System.out.println("CircularReferenceB constractor");
	}

	@Autowired
	private CircularReferenceA circularReferenceA;

	public void testAop() {
		circularReferenceA.testAop();
	}
}
