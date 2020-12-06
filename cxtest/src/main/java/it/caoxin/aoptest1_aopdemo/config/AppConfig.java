package it.caoxin.aoptest1_aopdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2020/3/9
 * 功能描述:
 * 修改日期:2020/3/9
 * 修改描述:
 */
@Configuration
@ComponentScan("it.caoxin.aoptest1_aopdemo")
@EnableAspectJAutoProxy
public class AppConfig {
}
