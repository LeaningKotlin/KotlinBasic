package lec02

import lec01.Person

fun main() {
    val person = Person("GGos3")
    startWithA(person.name) // Person 객체에서 @NotNull 어노테이션을 사용 하고있기 때문에 코틀린에서 이를 이해하고 경고해 준다.
}

fun startWithA(str: String?): Boolean {
    return str?.startsWith("A")
        ?: false
}