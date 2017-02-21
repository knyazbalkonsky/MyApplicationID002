package com.example.stude.myapplicationid002.model;

import java.util.ArrayList;


/**
 * Created on 20.02.2017.
 * At 15:22.
 * Today is понедельник
 */
public class ContactList{
    private ArrayList<Contact> contacts;


    public ContactList setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
        return this;
    }

    ArrayList<Contact> getContacts() {
        return contacts;

    }

    ContactList(){
        contacts = new ArrayList<>();
    }

}
