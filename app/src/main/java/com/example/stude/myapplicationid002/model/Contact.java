package com.example.stude.myapplicationid002.model;



/**
 * Created on 20.02.2017.
 * At 14:58.
 * Today is понедельник
 */
public class Contact implements Comparable<Contact>{
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
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

    public Contact setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Contact setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Contact setPatronymic(String patronymic) {
        this.patronymic = patronymic;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Contact setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getMobileOperator() {
        return mobileOperator;
    }

    public Contact setMobileOperator(String mobileOperator) {
        this.mobileOperator = mobileOperator;
        return this;
    }

    public String getBirthday() {
        return birthday;
    }

    public Contact setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    private String name;
    private String surname;
    private String patronymic;

    private String phoneNumber;

    private String mobileOperator;

    private String birthday;


    @Override
    public int compareTo(Contact o) {
        return 0;
    }
}
