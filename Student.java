
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompil
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student First Name: ");
        this.firstName = sc.nextLine();
        System.out.print("Enter Student Last Name: ");
        this.lastName = sc.nextLine();
        System.out.print("1 - Martic\n2 - Intermediate\n3 - B.tech\n4 - M.tech\nEnter Student class level: ");
        this.gradeYear = sc.nextInt();
        this.setStudentID();
    }

    private void setStudentID() {
        ++id;
        this.studentID = String.valueOf(this.gradeYear) + id;
    }

    public void enroll() {
        while(true) {
            System.out.print("Enter Course to enroll (Q TO quit): ");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (course.equals("Q")) {
                return;
            }

            this.courses = this.courses + "\n  " + course;
            this.tuitionBalance += costOfCourse;
        }
    }

    public void viewBalance() {
        System.out.println("Your Balance is: $" + this.tuitionBalance);
    }

    public void payTuition() {
        this.viewBalance();
        System.out.print("Enter yout payment: ");
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();
        this.tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        this.viewBalance();
    }

    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName + "\nGrade Level: " + this.gradeYear + "\nStudent ID: " + this.studentID + "\nCourses Enrolled: " + this.courses + "\nBalance: $" + this.tuitionBalance;
    }
}
