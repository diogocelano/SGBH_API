/**
 *
 */
package com.bsp.hibernate.service

import java.util.Collection;

import com.bsp.hibernate.vo.Employee;

interface EmployeeService {
	
	/**
	 * @return
	 */
	Collection<Employee> findAll(String company)
	
}