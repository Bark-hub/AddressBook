package com.company;

// Mubarik Abdi 2/17/2020

import java.util.*;


public class AddressBook {

    static Map<String, String> people = new HashMap<>();
    static Scanner input = new Scanner(System.in);
    static String userChoice = "";

    public static void main(String[] args){


        Person person1 = new Person("Bat Trent", "BatMail@gmail.com");
        Person person2 = new Person("Sponge Gaige", "BikinieBottom@gmail.com");

        people.put(person1.getName(), person1.getEmail());

        people.put(person2.getName(), person2.getEmail());

        enterInfo();
        retrieveInfo();

    }

    static void enterInfo(){
        System.out.println("Do you want to enter a person? enter yes");
        userChoice = input.nextLine();

        for ( int i = 0; userChoice.equals("yes"); i++) {
            System.out.println("Enter Name:");
            String newName = input.nextLine();
            System.out.println("Enter Email:");
            String newEmail = input.nextLine();
            Person person = new Person(newName, newEmail);
            people.put(person.getName(), person.getEmail());
            System.out.println("------NEW--LOOP--------");
            System.out.println("Again? enter yes if well yes");
            userChoice = input.nextLine();
        }
    }

    static void retrieveInfo() {
        System.out.println("Do you want to retrieve someones personal data? enter yes");
        userChoice = input.nextLine();
        while (userChoice.equals("yes")) {
            System.out.println("Who is the person? enter existing name");
            String name = input.nextLine();
            System.out.println(people.get(name));
            System.out.println("------NEW--LOOP--------");
            System.out.println("Again? enter yes if well yes");
            userChoice = input.nextLine();
        }
    }
}