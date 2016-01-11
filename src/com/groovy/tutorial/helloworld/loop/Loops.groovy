package com.groovy.tutorial.helloworld.loop

5.times {println "Times + $it "}
1.upto(3) {println "Up + $it "}
4.downto(1) {println "Down + $it "}
def sum = 0
1.upto(10) {sum += it; print it + " " + sum + " "}
(1..6).each {println "Range $it"}

List<Integer> list = [5,6,7,8]
list.each({line -> println line})
list.each({println it})