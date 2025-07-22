package homework;

import java.util.Scanner;


public class Biography {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Enter your age: ");
        int age = in.nextInt();
        in.nextLine();

        System.out.println("Your occupation: ");
        String job = in.nextLine();

        System.out.println("Your country: ");
        String country = in.nextLine();

        Person you = new Person(name, age, job, country);

        you.diplayBio();


    }

}

class Person {

    private String name;
    private int age;
    private String job;
    private String country;

    Person(String name, int age, String job, String country) {
        this.age = age;
        this.name = name;
        this.job = job;
        this.country = country;
    }

    void diplayBio() {
        System.out.printf("""
                My name is %s. 
                I'm %d years old.
                I work at/as a %s.
                I live in %s.
                """, name, age, job, country);
    }

}
