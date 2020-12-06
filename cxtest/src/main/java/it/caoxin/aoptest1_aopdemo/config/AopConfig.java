package it.caoxin.aoptest1_aopdemo.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2020/3/9
 * 功能描述:测试aop在SpringBean声明周期的哪一步
 * 修改日期:2020/3/9
 * 修改描述:
 */
@Component
@Aspect
public class AopConfig {


	@Pointcut("execution(* it.caoxin.aoptest1_aopdemo.bean.AopBar.*(..))")
	public void doAccessCheck() {

	}

	@Before("doAccessCheck()")
	public void before() {
		System.out.println("---------------aoptest--------------");
	}
}
