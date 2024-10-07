package ie.atu.week4;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        String[] student1 = getDetails();
        String[] student2 = getDetails(); ///sfghworjngh90wnergiopwjne0gjwe
        String[] student3 = getDetails();
    }
    public static String[] getDetails(){

        Scanner sc = new Scanner(System.in);
        //prompt for details of student
        String[] details = new String[3];//three spaces needed

        System.out.println("Enter your student name: ");
        String studentName = sc.nextLine();

        System.out.println("Please enter your student email: ");
        String email = sc.nextLine();

        System.out.println("Please enter your course: ");
        String course = sc.nextLine();
        return details;
    }
}


