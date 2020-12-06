package it.caoxin.aoptest2_aopwhencircularreferened.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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
@Aspect
public class AopConfig {
	@Pointcut("execution(* it.caoxin.aoptest2_aopwhencircularreferened.bean.CircularReferenceA.*(..))")
	public void testAop() {

	}

	@Before("testAop()")
	public void before() {
		System.out.println("-------------testAop------------");
	}

}
