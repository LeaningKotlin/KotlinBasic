package lec10

class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable{ // 인터페이스 구현도 : 를 사용한다.

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직입니다.")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }
}