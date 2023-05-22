package lec16

fun main() {
    val str = "안녕하세요"
    println(str.lastChar())
}

fun String.lastChar(): Char {
    // this를 이용해 실제 클래스 안의 값에 접근
    return this[this.length -1]
}