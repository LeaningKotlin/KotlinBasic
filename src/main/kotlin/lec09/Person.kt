package lec09

fun main() {
    val person = Person("김장필")
    val person1 = Person()

    println(person.age)
    person.age = 20
    println(person.age)
    println(person1)
}

class Person(
    val name: String,
    var age: Int
) {

    // 커스텀 Getter
//    val name: String = name
//        get() = field.uppercase()   // field는 무한루프를 막기 위한 것으로 자기 자신을 뜻한다.

    // 프로퍼티로 처리하는 것이 편하다.
    val uppercaseName: String
        get() = this.name.uppercase()

    init {
        if (age < 0)
            throw IllegalArgumentException("나이는 $age 일 수 없습니다.")
        println("초기화 블럭")
    }

    val isAdult: Boolean
        get() = this.age >= 20

    // 새로운 생성자 추가
    // 부 생성자 보다는 Default Param을 사용하는 것이 좋다.
    constructor(name: String) : this(name, 1){
        println("첫 번째 부생성자")
    }
    constructor(): this ("홍길동"){
        println("두 번째 부생성자")
    }
}