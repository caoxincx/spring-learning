package it.caoxin.ioctest1_beanlife;

import org.springframework.stereotype.Component;

/**
 * 需求编号:2019D0519
 * 问题编号:
 * 开发人员: caoxin
 * 创建日期:2020/3/5
 * 功能描述:
 * 修改日期:2020/3/5
 * 修改描述:
 */
@Component
public class Person {
	private String usrname;
	private String password;

	public Person() {
	}

	public Person(String usrname, String password) {
		this.usrname = usrname;
		this.password = password;
	}

	public String getUsrname() {
		return usrname;
	}

	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
