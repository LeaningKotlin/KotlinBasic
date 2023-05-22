package lec14

import lec14.Country.*

fun handleCountry(country: Country) {
    return when (country) {
        KOREA -> println("김치입니다.")
        AMERICA -> println("햄버거입니다.")
    }
}

enum class Country(
    private val code: String
) {
    KOREA("KR"),
    AMERICA("US")
}