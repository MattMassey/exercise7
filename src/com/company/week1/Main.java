package com.company.week1;

//Matt Massey, 3/5/19
//Program demonstrates extending classes

public class Main {

    public static void main(String[] args) {
        Person me = new Person("Matt", "dummy-email@somewhere.com");
        System.out.println(me.toString());
        BusinessContact alsoMe = new BusinessContact("Matthew", "professional@here.rr.com", "614-000-1234");
        System.out.println(alsoMe.toString());
    }
}
