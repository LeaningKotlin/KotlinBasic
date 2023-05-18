package lec05

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0)
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
}

fun getPassOfFail(score: Int): String {
    // 코틀린에서 if-else 문은 statement가 아닌 expression이므로 return 이나 변수에 할당 할 수 있다.
    return if (score >= 50)
        "P"
    else
        "F"
}

fun validation(score: Int) {
    if (score in 0..100) // 0 부터 100 까지
        println(score)
}

fun getGradeWithSwitch(score: Int): String {
    return when (score) {  // switch 문을 when을 사용해 구현 할 수 있다.
        // when의 조건문에는 어떠한 Expression이라도 들어 갈 수 있다 ex) is
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    return when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자 입니다.")
        else -> println("1, 0, -1 이 아닙니다.")
    }
}

fun judgeNumber2(number: Int) {
    return when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수 입니다.")
        else -> println("주어진 숫자는 홀수 입니다.")
    }
}