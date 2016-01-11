/**
 * 
 */
package com.bsp.hibernate.aop.service

import java.util.Collection;

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.*

import com.bsp.hibernate.aop.Auditable
import com.bsp.hibernate.vo.Employee;

/**
 * @author dcelano
 *
 */
@Aspect
class EmployeeServiceLogging {

	@Before("args(company) && @annotation(auditable)")
	void auditBefore(String company, Auditable auditable) {
		println "Audit account access: $company. Audit destination: " + auditable.value();
	}
	
	@AfterReturning(pointcut="execution(* EmployeeServiceImpl.*(..))",returning ="returnValue")
	void auditAfter(String returnValue) {
		println "Employees List Provided. Total of $returnValue employees"
	}
	
}
