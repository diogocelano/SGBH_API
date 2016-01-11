package com.groovy.tutorial.helloworld.methodmapping

import com.groovy.tutorial.helloworld.classes.Address
import com.groovy.tutorial.helloworld.classes.Person

def address = new Address(street:"Rua 1", city:"Niteroi")
def person = new Person(firstName:"Diogo", address:address, phoneNumber:"22222222")

person.moveToNewPlace(street:"Rua 2", "33333333", city:"Rio de Janeiro")

assert 'Diogo' == person.firstName
assert 'Rio de Janeiro' == person.address.city
assert 'Rua 2' == person.address.street
assert '33333333' == person.phoneNumber