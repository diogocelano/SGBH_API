package com.groovy.tutorial.helloworld.string

def name = "Diogo"
def s1 = "Hello $name"
def s2 = 'Hello $name'

println s1
println s2

println s1.class
println s2.class

def Date date = new Date()
println "We met at $date"
println "We met at ${date.format('MM/dd/yy')}"