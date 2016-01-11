/**
 * 
 */
package com.groovy.tutorial.helloworld.lists

/**
 * @author dcelano
 *
 */
class Maps {

	static main(args) {
	
		def myMap = [1:"Diogo Celano", 2:"Thiago Celano", 3:"Raphael Celano"]
		
		myMap.each {entry -> println (entry.key > 1)}
		myMap.each {key, value -> println key + " " + value}
		myMap.each {key, value -> println (key < 2)}
				
		println "Raphael: " + myMap.any {entry -> entry.value.contains("Raphael")}
		println "Every key small than 4: " + myMap.every {entry -> entry.key < 4}

		def result = ''
		for (key in myMap.keySet()) {
		  result += key
		}
		println result	
		
		println myMap.findAll {it.key < 2}
		def map = myMap.findAll {it.key < 2}
		println map.get(1).value	
	}

}
