package com.example.stude.myapplicationid002.model;

import org.junit.Test;

/**
 * Created on 20.02.2017.
 * At 21:22.
 * Today is понедельник
 */
public class ContactListTest {

    @Test
    public void setUp() throws Exception {
        final int RANDOM = (int) (Math.random() * 10);
        int i = 0;

        ContactList cl1 = new ContactList();

        while(Contact.getCount() != RANDOM) {
            cl1.getContacts().add(new Contact("phone" + ++i));
        }

        for (Contact c : cl1.getContacts()){
            System.out.println(c.toString());
        }
    }


}