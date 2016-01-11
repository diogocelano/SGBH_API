/**
 * 
 */
package com.groovy.tutorial.helloworld.classes

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component;;

/**
 * @author dcelano
 *
 */
@Component("person")
class Person {
	
	final id = "1234"
	String firstName = "Diogo"
	String lastName = "Celano"
	int age = 34
	@Autowired	
	Address address
	String phoneNumber = "22222222"
	
	def moveToNewPlace(inputAsMap, phoneNumber) {
		address.street = inputAsMap.street
		address.city = inputAsMap.city
		this.phoneNumber = phoneNumber
	}

}
