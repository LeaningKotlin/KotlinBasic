package lec08

fun main() {
    repeat("집에 가고 싶어요")

    // Named Args를 이용해 생성자 순서와 상관없이 값을 전달 할 수 있다.
    repeat("안돼", useNewLine = false)

    val array = arrayOf("집", "보", "내", "줘")
    printAll(*array) // spread 연산자를 이용해 , 를 사용하듯이 하나씩 꺼내 쓸 수 있다.

    printAll("집", "에", "갈", "래", "요")
}

/**
 * 함수의 결과가 하나 (Expression) 이라면 block 대신 =를 이용해 생략 할 수 있다.
 * block 이 아니기 떄문에 Type 을 자동으로 추론 해준다.
 */
fun sum(a: Int, b: Int) = if (a > b) a else b

// Kotlin의 Default 파라메터
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num)
        if (useNewLine)
            println(str)
        else
            print(str)
}

fun printAll(vararg strings: String) {
    strings.forEach { println(it) }
}