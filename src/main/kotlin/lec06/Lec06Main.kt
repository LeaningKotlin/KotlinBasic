package lec06

fun main() {
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers)
        println(number)

    for (i in 1..3)
        println(i)

    // i--
    for (i in 3 downTo 1)
        println(i)

    // 2씩 증가
    for (i in 1..5 step 2)
        println(i)
}