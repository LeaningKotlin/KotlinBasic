package lec19

// as를 사용하여 이름이 같은 함수를 구분 할 수 있음
import lec19.a.printHelloWorld as printHelloWorldA
import lec19.b.printHelloWorld as printHelloWorldB

// data class는 componentN 함수도 생성해준다.
data class Person(
    val name: String,
    val age: Int
)

class OtherPerson(
    val name: String,
    val age: Int
) {
    // ComponentN 함수는 연산자의 속성을 가지고 있어 operator가 필요하다
    operator fun component1(): String{
        return this.name
    }

    operator fun component2(): Int{
        return this.age
    }
}

fun main() {

    printHelloWorldA()
    printHelloWorldB()

    val person = Person("김장필", 19)
    // 구조분해 문법
    val (name, age) = Person("김장필", 19)
    // 위 코드의 동작 원리
//    val name = person.component1()
//    val age = person.component2()


    println("이름 : $name, 나이 : $age")

}