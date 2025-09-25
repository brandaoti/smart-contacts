package com.brandao.smartcontacts

object ContactService {

    private val contacts = mutableListOf<Contact>()

    fun addContact(contact: Contact): Contact {
        contacts.add(contact);
        return contact;
    }

    fun listFavorites(): List<String>{
        return  contacts.filter{it.isFavorite}.map { it.name }.sorted();
    }

    fun searchContactByName(value: String): List<Contact>{
       val filteredContacts = contacts.filter{it.name.contains(value, ignoreCase = true)};
        return filteredContacts;
    }

    fun sendMessages(message: String , sender: String = "Sistema"){
        println("Mensagem enviada de $sender: $message");
    }

}
