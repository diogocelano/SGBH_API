/**
 * 
 */
package com.bsp.hibernate

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

import com.bsp.hibernate.controller.Controller

/**
 * @author dcelano
 *
 */
class Bootstrap {

	static main(args) {
					
		//Raises Spring Context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/resources/application-context.xml")
		
		//Recupera controllers do contexto
		Controller JsonController = ctx.getBean("employeeController") as Controller
		Controller TemplateController = ctx.getBean("templateController") as Controller
						
		//Inicia os controladores
		JsonController.start()
		TemplateController.start()
	}
}
