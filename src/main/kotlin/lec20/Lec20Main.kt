package lec20

import lec19.Person

fun main() {

}

fun printPerson(person: Person?) {
//    if (person != null) {
//        println(person.name)
//        println(person.age)
//    }

    // person이 null이 아닐 때 호출
    person?.let {
        println(it.name)
        println(it.age)
    }

}