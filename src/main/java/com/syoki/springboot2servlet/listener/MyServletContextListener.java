package com.syoki.springboot2servlet.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 使用@WebListener注解，实现ServletContextListener接口
 * 
 * @author Angel(QQ:412887952)
 * @version v.0.1
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("ServletContex销毁");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		 System.out.println("ServletContex初始化");
	}
}
