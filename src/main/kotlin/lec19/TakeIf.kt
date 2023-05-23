package lec19




fun getNumberOrNullV1(number: Int): Int? {
    return if (number <= 0) null
    else number
}

fun getNumberOrNullV2(number: Int): Int? {
    // 주어진 조건에 만족하면 자신이 반환되고 그렇지 않으면 null이 반환된다.
    return number.takeIf { it > 0 }
}

fun getNuberOrNul(number: Int): Int? {
    // 주어진 조건에 만족하지 않으면 자신이 반환되고 그렇지 않으면 null이 반환된다.
    return number.takeUnless { it <= 0 }
}