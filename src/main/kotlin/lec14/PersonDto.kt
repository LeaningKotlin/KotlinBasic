package lec14

fun main() {
    val personDto1 = PersonDto("김장필", 100)
    val personDto2 = PersonDto("김장필", 100)

    println(personDto1 == personDto2)
}

// 코틀린의 data class 는 equals, hashCode, toString을 자동으로 만들어 준다
data class PersonDto (
    val name: String,
    val age: Int
)