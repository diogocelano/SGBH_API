/**
 * 
 */
package com.groovy.tutorial.helloworld.types

int i = 1
int j = i + 3
int k = i.plus(3)

assert(k==4)
println i.class
println j.class
println k.class

def value2 = 1
println value2.class

value2 = value2 / 2
println value2
println value2.class

10.times { println "Test" }
