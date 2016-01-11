/**
 * 
 */
package com.bsp.hibernate.service

import com.bsp.hibernate.aop.Auditable
import com.bsp.hibernate.aop.Auditable.AuditDestination;
import com.bsp.hibernate.dao.EmployeeDao
import com.bsp.hibernate.vo.Employee

/**
 * @author dcelano
 *
 */
class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDao employeeDao;
	
	/**
	 * @return
	 */
	@Auditable(AuditDestination.WEB_CLIENT)
	public Collection<Employee> findAll(String company) {				
		//Recupera e retorna a lista de empregados
		Collection<Employee> listaEmpregados = employeeDao.findEmployee(company)						
	}

}
