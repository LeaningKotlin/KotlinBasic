package lec10

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int // 추상 프로퍼티가 아니라면 상속 받을때 open을 꼭 붙여야 한다.
){
    abstract fun move()
}