package lec16

fun Person.nextYearAge(): Int {
    println("확장 함수입니다.")
    return this.age + 1
}

fun main() {
    val person = Person("한", "재범", 100)

    // 확장 함수와 멤버 함수의 시그니쳐가 동일하면 멤버 함수가 먼저 호출된다.
    person.nextYearAge()
}