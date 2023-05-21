package lec12

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

class Person private constructor(
    var name: String,
    var age: Int
) {

    companion object Factory : Log {  // 코틀린에서 companion object는 하나의 객체이기 때문에 인터페이스를 구현하거나 이름을 붙일 수 있다.
        const val MIN_AGE = 1   // const를 사용하면 컴파일 시에 변수가 할당 된다.

        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun Log() {
            println("나는 Person 클래스이 동행객체에요.")
        }
    }

}

object Singleton {  // 코틀린에서 싱글톤을 구현 할 때에는 object 하나면 가능하다
    var a: Int = 0
}