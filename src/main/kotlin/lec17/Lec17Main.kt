package lec17

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000)
    )

    // 이름이 없는 람다 함수
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 다른 버전의 람다 함수
    val inApple2 = { fruit: Fruit -> fruit.name == "사과"}

    // 람다 호출
    isApple(fruits[0])
    isApple.invoke(fruits[0])

    // 함수 사용
    fruitFilter(fruits, isApple)
    fruitFilter(fruits) { it.name == "사과" } // 파라미터가 한개인 경우 it로 줄일 수 있음
}

private fun fruitFilter(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit))
            results.add(fruit)
    }
    return results
}