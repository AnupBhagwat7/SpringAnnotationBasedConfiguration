package com.myjavablog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.myjavablog.beans.City;
import com.myjavablog.config.AnnotationConfig;

/**
 * Hello world!
 *
 */
public class SpringJavaBasedConfigMain {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		City cityObj = (City) appContext.getBean("cityObj");
		String cityName = cityObj.getcityName();

		System.out.println("City name: " + cityName);
	}
}
