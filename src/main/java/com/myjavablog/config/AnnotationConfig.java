/**
 * 
 */
package com.myjavablog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.myjavablog.beans.City;

/**
 * @author anupb
 *
 */
@Configuration
public class AnnotationConfig {

	 
	 @Bean(name="cityObj")
	 public City getCountry()
	 {
	  return new City("Pune");
	 }
}
