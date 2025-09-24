package com.brandao.smartcontacts

data class Contact(
    val  name:  String,
    val isFavorite: Boolean,
    val phone: String = "Sem numero",
)

fun main() {
    val c = Contact("Daniel", true)
    println(c)
}