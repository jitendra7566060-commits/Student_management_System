package Management_System;

import java.util.ArrayList;
import java.util.Scanner;

// Model Class
class Student {
    String rollNo, name, studentClass, course, mobileNo, admissionYear;
}

// Main Class
public class StudentManagementSystem {

    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // CREATE
    static void enter() {
        System.out.print("How many students do you want to enter? ");
        int ch = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < ch; i++) {
            Student s = new Student();

            System.out.println("\nEnter data of student " + (i + 1));

            System.out.print("Roll No: ");
            s.rollNo = sc.nextLine();

            System.out.print("Name: ");
            s.name = sc.nextLine();

            System.out.print("Class: ");
            s.studentClass = sc.nextLine();

            System.out.print("Course: ");
            s.course = sc.nextLine();

            System.out.print("Mobile No: ");
            s.mobileNo = sc.nextLine();

            System.out.print("Admission Year: ");
            s.admissionYear = sc.nextLine();

            list.add(s); // dynamic add
        }
    }

    // READ
    static void show() {
        if (list.isEmpty()) {
            System.out.println("No data is entered");
            return;
        }

        int i = 1;
        for (Student s : list) {
            System.out.println("\nStudent " + i++);
            System.out.println("Roll No: " + s.rollNo);
            System.out.println("Name: " + s.name);
            System.out.println("Class: " + s.studentClass);
            System.out.println("Course: " + s.course);
            System.out.println("Mobile No: " + s.mobileNo);
            System.out.println("Admission Year: " + s.admissionYear);
        }
    }

    // SEARCH
    static void search() {
        if (list.isEmpty()) {
            System.out.println("No data is entered");
            return;
        }

        System.out.print("Enter roll number to search: ");
        String roll = sc.nextLine();

        boolean found = false;

        for (Student s : list) {
            if (s.rollNo.equals(roll)) {
                System.out.println("\nStudent Found:");
                System.out.println("Name: " + s.name);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }
    }

    // UPDATE
    static void update() {
        if (list.isEmpty()) {
            System.out.println("No data is entered");
            return;
        }

        System.out.print("Enter roll number to update: ");
        String roll = sc.nextLine();

        boolean found = false;

        for (Student s : list) {
            if (s.rollNo.equals(roll)) {

                System.out.println("\nEnter new data:");

                System.out.print("Roll No: ");
                s.rollNo = sc.nextLine();

                System.out.print("Name: ");
                s.name = sc.nextLine();

                System.out.print("Class: ");
                s.studentClass = sc.nextLine();

                System.out.print("Course: ");
                s.course = sc.nextLine();

                System.out.print("Mobile No: ");
                s.mobileNo = sc.nextLine();

                System.out.print("Admission Year: ");
                s.admissionYear = sc.nextLine();

                System.out.println("Updated successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }
    }

    // DELETE
    static void delete() {
        if (list.isEmpty()) {
            System.out.println("No data is entered");
            return;
        }

        System.out.print("Enter roll number to delete: ");
        String roll = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).rollNo.equals(roll)) {
                list.remove(i); // dynamic delete
                System.out.println("Student deleted successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }
    }

    // MAIN
    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Enter Data");
            System.out.println("2. Show Data");
            System.out.println("3. Search Data");
            System.out.println("4. Update Data");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    enter();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    delete();
                    break;
                case 6:
                    System.out.println("Program exited.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}