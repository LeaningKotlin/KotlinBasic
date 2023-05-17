package lec03

import lec01.Person

fun main() {
    val number1 = 3
    // Java에서는 허용 하지만 Kotlin에서는 허용하지 않는다.
    // var number2: Long = number1
    var number2: Long = number1.toLong()

    val person = Person("김장필", 19)
    otherPrintAgeIsPerson(person)
}

fun printAgeIsPerson(obj: Any) {
    if (obj is Person) {    // 반대는 !is 로 사용할 수 있다.
        val person = obj as Person  // 생략 가능
        println(person.age)
    }
}

fun otherPrintAgeIsPerson(obj: Any?) {
    val person = obj as? Person // obj 가 Null 이라면 코드 전체가 Null이 된다.
    println(person?.age) // person이 null 이기 때문에 null이 출력된다.
}