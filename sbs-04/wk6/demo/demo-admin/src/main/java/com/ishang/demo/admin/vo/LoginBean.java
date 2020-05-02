package com.ishang.demo.admin.vo;

/**
 * 登录接口封装对象
 * 
 *
 * create by zhayao 2020年3月31日
 */
public class LoginBean {
	private String account;//登录账号
	private String password;//登录密码
	private String captcha;//验证码
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCaptcha() {
		return captcha;
	}
	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}
	

}
