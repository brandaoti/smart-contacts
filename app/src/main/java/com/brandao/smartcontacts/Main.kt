package com.brandao.smartcontacts

fun main() {
    ContactService.addContact(Contact("Daniel", true, "0000000000"));
    ContactService.addContact(Contact("Ceyle", true, "1111111111"));
    ContactService.addContact(Contact("Anderson", true, "2222222222"));
    ContactService.addContact(Contact("Usuario Desconhecido", false, "3333333333"));


    val listOfFavorites = ContactService.listFavorites();

    println("Lista com nomes dos contatos favoritos: $listOfFavorites");


    val searchContacts = ContactService.searchContactByName("Daniel");

    searchContacts.forEach { contact ->
        println("Nome: ${contact.name} - Telefone: ${contact.phone} - Favorito: ${contact.isFavorite}")
    }

    ContactService.sendMessages("Ola Mundo!", "Daniel");
    ContactService.sendMessages("Ola, Daniel!");


}