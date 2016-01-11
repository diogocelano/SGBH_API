/**
 * 
 */
package com.bsp.hibernate.controller

import spark.ModelAndView
import spark.template.velocity.VelocityTemplateEngine

import com.bsp.hibernate.service.EmployeeService
import com.bsp.hibernate.vo.Employee

/**
 * @author dcelano
 *
 */
class WebEmployeeController implements Controller {

	EmployeeService service
	
	@Override
	public void start() {
		
		spark.Spark.get "/findAll/:company/html", { request, response ->												

			//Recupera parâmetro
			def company = request.params(":company")
			
			//Cria lista para receber empregados
			Collection<Employee> lista
			
			//Executa serviço, recuperando lista de empregados
			if (company)
				lista = service.findAll(company)
			
			//Retorna a lista de empregados para o template do Velocity
			Map<String, Object> model = new HashMap<>()			
			model.put("list", lista)
			model.put("company", company)
			
			new ModelAndView(model, "/resources/templates/employees.vm")
							
		}, new VelocityTemplateEngine()
	}	
}
