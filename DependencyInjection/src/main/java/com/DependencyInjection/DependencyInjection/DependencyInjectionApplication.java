package com.DependencyInjection.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		 /**This line in a Spring Boot application helps create the
		 IoC (Inversion of Control) container. Instead of
		 creating objects manually with the new keyword,
		 we let Spring Boot handle the creation and management of objects.
		 By doing this, we delegate control to Spring Boot, allowing it to manage dependencies
		 and object lifecycles for us
		 **/
		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		//We can create an object using new keyword as shown below.
		//But we want spring boot to create the object for us
		//Dev dev = new Dev();
		Dev dev = context.getBean(Dev.class);
		dev.build();
	}

}
