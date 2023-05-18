package lec07

import kotlin.NumberFormatException

fun parseIntThrow(str: String): Int {
    // try-catch문 또한 if-else 문처럼 Expression이기 때문에 바로 return 할 수 있다.
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 문자열 $str 은 문자열이 아닙니다.")
    }
}