package com.example.stude.myapplicationid002.model;



/**
 * Created on 20.02.2017.
 * At 14:58.
 * Today is понедельник
 */

/**
 * Contact it's a class to keep contacts inside a structure
 *
 * count  needs to keep count of created Contacts
 */
public class Contact{

    private static int count = 0;

    public static int getCount() {
        return count;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        count--;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", mobileOperator='" + mobileOperator + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    private Contact(){
        count++;
    }

    public Contact(String phoneNumber){
        this();
        this.phoneNumber = phoneNumber;
    }

    private String name;

    public String getName() {
        return name;
    }



    public Contact setName(String name) {
        this.name = name;
        return this;
    }
    private String surname;

    public String getSurname() {
        return surname;
    }

    public Contact setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    private String patronymic;


    public String getPatronymic() {
        return patronymic;
    }

    public Contact setPatronymic(String patronymic) {
        this.patronymic = patronymic;
        return this;
    }
    private String phoneNumber;


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Contact setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    private String mobileOperator;

    public String getMobileOperator() {
        return mobileOperator;
    }

    public Contact setMobileOperator(String mobileOperator) {
        this.mobileOperator = mobileOperator;
        return this;
    }

    private String birthday;

    public String getBirthday() {
        return birthday;
    }

    public Contact setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }
}
