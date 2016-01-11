/**
 * 
 */
package com.groovy.tutorial.helloworld.lists

import com.groovy.tutorial.helloworld.classes.Person;

/**
 * @author dcelano
 *
 */
class Lists {

	static main(args) {
	
		List<Person> persons = []
		
		persons[0] = new Person(firstName:"Diogo", lastName:"Celano", age:34)
		persons[1] = new Person(firstName:"Thiago", lastName:"Celano", age:35)
		
		println persons.firstName
		
		println persons.findAll({ it.firstName == "Diogo" }).firstName
		
		def list2 = persons*.age
		println list2
		
		Person[] array
		array = persons
		
		println array.class.name				
	}

}
