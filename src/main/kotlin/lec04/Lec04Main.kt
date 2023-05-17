package lec04

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2)    // 코틀린에서는 비교 연산자 상황이 될 때 자동으로 `compareTo` 를 호출 해 준다.
        println("money1이 money2 보다 큽니다.")

    val money3 = JavaMoney(1_000L)
    val money4 = money1

    println(money2 == money3)
    println(money2 === money3)

    println(money1 == money4)
    println(money1 === money4)


    val foo = Money(1_000L)
    val bar = Money(1_000L)

    println(foo + bar)  // 따로 메서드가 구현 되어있지 않아도 연산자 오버로당을 통해 쉽게 사용 할 수 있다.
}