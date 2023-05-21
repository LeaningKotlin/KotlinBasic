package lec10

class Cat (
    species: String
) : Animal(species, 4){ // 코틀린에서 상속을 받을 때 에는 :을 사용한다

    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~")
    }
}