package com.example.stude.myapplicationid002;

import com.example.stude.myapplicationid002.model.Contact;
import org.junit.Test;

/**
 * Created on 20.02.2017.
 * At 15:36.
 * Today is понедельник
 */
public class UnitTest {

    @Test
    public void isAllWorking() throws Exception {
        Contact c1 = new Contact();
        c1.setName("Alexander");
        c1.setSurname("Popov");
        c1.setPatronymic("Vasilyevich");
        c1.setMobileOperator("MTS");
        c1.setBirthday("21.12.17");
        c1.setPhoneNumber("+77777777777");

        System.out.println(c1.toString());
    }
}
