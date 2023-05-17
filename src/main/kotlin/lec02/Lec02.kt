package lec02

fun main() {
    var str: String? = "ABC"
     println(str?.length)

    str = null
    println(str?.length ?: 0)   // 엘비스 연산자 사용
}

fun startWithA1(str: String?): Boolean {
//    if (str == null)
//        throw IllegalArgumentException("null이 들어왔습니다.")
//    return str.startsWith("A")

    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.") // Kotlin식 코드 변환
}

fun startWithA2(str: String?): Boolean? {
//    if (str == null)
//        return null
//    return str.startsWith("A")

    return str?.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
//    if (str == null)
//        return false
//    return str.startsWith("A")

    return str?.startsWith("A") ?: false
}

fun startWith(str: String?): Boolean {
    return str!! .startsWith("A")
}