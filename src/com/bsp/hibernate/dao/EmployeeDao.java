/**
 * 
 */
package com.bsp.hibernate.dao;

import java.util.Collection;

import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessException;

import com.bsp.hibernate.vo.Employee;

/**
 * @author dcelano
 *
 */
public interface EmployeeDao {

	/**
	 * Sets Hibernate session factory
	 * 
	 * @param sessionFactory
	 */
	public void setSessionFactory(SessionFactory sessionFactory);
	
	
	/**
	 * Retorna Empregados
	 * @return Collection<Employee>
	 * @throws DataAccessException
	 */
	public Collection<Employee> findEmployee(String company) throws DataAccessException;
			
}
