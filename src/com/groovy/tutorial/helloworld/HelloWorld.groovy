/**
 * 
 */
package com.groovy.tutorial.helloworld

import com.groovy.tutorial.helloworld.classes.Person;

/**
 * @author dcelano
 *
 */
class HelloWorld {

	static main(args) {
		
		Person person = new Person()
		person.setFirstName("Diogo")
		person.lastName = "Celano"
		person.address = "Homestreet 3"
				
		println (person.id + " " + person.firstName + " " + person.lastName)
		
		Person person2 = new Person(firstName:"Thiago", lastName:"Celano", address:"Arsenal")
		
		println (person2.firstName + " " + person2.lastName)
				
		def mylist = [1, 2, "Lars", "4", person, person2]
		
		mylist.each{println it}
		
		Person person3 = person2
		
		if (mylist[5] == person3)
			println "Sim =="
		
		if (person2 == person3)
			println "Sim =="
			
		if (person2.is(person3))
			println "Sim is()"
			
		if (person2.equals(person3))
			println "Sim equals()"
			
		println sum(mylist[0], mylist[1])					
		println sum(mylist[0], mylist[1], 3)
	}
	
	static sum(a, b, c=0) {
		a+b+c
	}

}
