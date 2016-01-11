/**
 * 
 */
package com.bsp.hibernate.dao;

import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bsp.hibernate.vo.Employee;

/**
 * @author dcelano
 *
 */
@Repository
@Transactional(readOnly = true)
public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {

	/* (non-Javadoc)
	 * @see com.bsp.hibernate.EmployeeDao#findEmployee()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Collection<Employee> findEmployee(String company) throws DataAccessException {		
		return (Collection<Employee>) getHibernateTemplate().find("from Employee where filial = '" + company + "'");
	}
		
}
