package it.caoxin.ioctest2_circulardependency.bean;

import org.springframework.beans.factory.annotation.Autowired;
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
public class CircularDependencyB {
	@Autowired
	private CircularDependencyA circularDependencyA;

	public CircularDependencyB() {
		System.out.println("invoke CircularDependencyB constractor");
	}

}
