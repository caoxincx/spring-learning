package it.caoxin.ioctest5_beanfactorypostprocessor.config;

import it.caoxin.ioctest5_beanfactorypostprocessor.bean.CxLifeCycle;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2020/3/14
 * 功能描述:
 * 修改日期:2020/3/14
 * 修改描述:
 */
@Import(CxLifeCycle.class)
@Configuration
@ComponentScan("it.caoxin.ioctest5_beanfactorypostprocessor")
public class AppConfig {
}
