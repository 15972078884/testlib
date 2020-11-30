package com.formovie.mylib

data class Country(val name: String, val persons: Int)

class CountryApp {
    fun filterCountries(countries: List<Country>, condition: (Country) -> Boolean): List<Country> {
        val list = mutableListOf<Country>()
        countries.forEach {
            if (condition(it)) {
                list.add(it)
            }
        }
        return list
    }
}