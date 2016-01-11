/**
 * 
 */
package com.bsp.hibernate.controller

import static spark.Spark.after
import groovy.json.JsonOutput

import com.bsp.hibernate.service.EmployeeService
import com.bsp.hibernate.vo.Employee

/**
 * @author dcelano
 *
 */
class EmployeeController implements Controller {

	EmployeeService service
	
	@Override
	public void start() {
		
		spark.Spark.get "/findAll/:company/json", { request, response ->												

			//Recupera parâmetro
			def company = request.params(":company")
			
			//Cria lista para receber empregados
			Collection<Employee> lista
			
			//Executa serviço, recuperando lista de empregados
			if (company)
				lista = service.findAll(company)
			
			//Retorna a lista de empregados no formato Json
			JsonOutput.toJson(lista)
				
		}
		
		//spark.Spark.after {request, response -> response.type("application/json")};
	}
}
