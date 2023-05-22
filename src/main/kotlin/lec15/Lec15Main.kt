package lec15

fun main() {
    val array = arrayOf(100, 200)
    val number = listOf(100, 200)
    val mutableNumber = mutableListOf<Int>(100, 200) // 변경이 가능한 리스트
    mutableNumber.add(300)

    useNumbers(emptyList()) // 이미 함수에서 type이 명시되어 있기 때문에 자동으로 추론해 준다.

    for (i in array.indices) {
        println("$i ${array[i]}")
    }

    for ((idx, value) in array.withIndex()) {
        println("$idx $value")
    }


    // Map

    val oldMap = mutableMapOf<Int, String>()

    oldMap.put(1, "MONDAY")
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println("key = ${key}")
        println("value = ${value}")
    }
}

private fun useNumbers(numbers: List<Int>) {

}