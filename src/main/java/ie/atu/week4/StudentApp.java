package ie.atu.week4;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();//default to create object
        System.out.println("name: ");
        s1.setName(sc.nextLine());
        System.out.println("email: ");
        s1.setEmail(sc.nextLine());
        System.out.println("course: ");
        s1.setCourse(sc.nextLine());

        //instance 2
        System.out.println("name: ");
        Student s2 = new Student(sc.nextLine());
        System.out.println("email: ");
        s1.setEmail(sc.nextLine());
        System.out.println("course: ");
        s1.setCourse(sc.nextLine());

        //instance 3
        System.out.println("name: ");
        String name = sc.nextLine();
        System.out.println("email: ");
        String email = sc.nextLine();
        System.out.println("course: ");
        String course = sc.nextLine();
        Student s3 = new Student(name, email, course);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }


}


