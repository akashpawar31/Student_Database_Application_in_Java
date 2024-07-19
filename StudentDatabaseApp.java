import java.util.Scanner;

public class StudentDatabaseApp {
    public StudentDatabaseApp() {
    }

    public static void main(String[] args) {
        System.out.print("Enter number of new students to enroll: ");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        Student[] students = new Student[numOfStudents];

        int n;
        for(n = 0; n < numOfStudents; ++n) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }

        for(n = 0; n < numOfStudents; ++n) {
            System.out.println(students[n].toString());
        }

    }
}

