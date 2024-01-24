/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Student extends Person {
    int numCourses;
    String[] courses;
    int[] grades;

    void inputStudentInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter address: ");
        address = scanner.nextLine();

        System.out.print("Enter the number of courses (max 5): ");
        numCourses = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        if (numCourses > 5) {
            System.out.println("Error: Number of courses cannot exceed 5.");
            return;
        }

        courses = new String[numCourses];
        grades = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter course " + (i + 1) + ": ");
            courses[i] = scanner.nextLine();

            System.out.print("Enter grade for course " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
        }
    }

    void displayStudentInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Courses:");

        for (int i = 0; i < numCourses; i++) {
            System.out.println("  Course: " + courses[i] + ", Grade: " + grades[i]);
        }
    }
}
