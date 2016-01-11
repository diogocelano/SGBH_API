/**
 * 
 */
package com.bsp.hibernate.aop

import java.lang.annotation.*

/**
 * @author dcelano
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Auditable {
	
	AuditDestination value()
	
	public enum AuditDestination {DATABASE, FILE_SYSTEM, WEB_CLIENT}
	
}
