package com.groovy.tutorial.helloworld.lists

def list = ["Ubuntu", "Android", "Windows", "Mac OS X"]

def result = list.collectEntries {
	[(it):0]
}
println result

assert result.size() == 4
assert result.Ubuntu == 0

def map = list.collectEntries {[(it): it.contains("n")]}

println map
assert map.Windows && map.Ubuntu && map.Android && !map.'Mac OS X'