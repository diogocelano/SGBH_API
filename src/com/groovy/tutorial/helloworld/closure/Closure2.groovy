package com.groovy.tutorial.helloworld.closure

class WithTestClass {
	String property1
	String property2
	List<String> list = []
	def addElement(value) {
	  list << value
	}
	def returnProperties () {
	  "Property 1: $property1, Property 2: $property2 "
	}
  }
  
  def sample = new WithTestClass()
  def result = sample.with {
	property1 = 'Input 1'
	property2 = 'This is cool'
	addElement 'Ubuntu'
	addElement 'Android'
	addElement 'Linux'
	returnProperties()
  }
  println "Result: " + result
  assert 3 == sample.list.size()
  assert 'Input 1' == sample.property1
  assert 'This is cool' == sample.property2
  assert 'Linux' == sample.list[2]