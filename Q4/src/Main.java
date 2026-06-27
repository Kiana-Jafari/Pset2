package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 2 students were added for testing the program

        // Course:

        // "code": "CS101",
        // "title": "Introduction to Computer Science",
        // "credits": 3,
        // "type": 1

        // Lecturer:

        // "lecturerID": "L001",
        // "salary": 78500.0,
        // "firstName": "Jonathan",
        // "lastName": "Anderson",
        // "fatherName": "Robert Anderson",
        // "nationalID": "9876543210",
        // "birthYear": 1980,
        // "address": "456 University Avenue, College Town, ST 54321"

        // Students:

        // "studentID": "S001",
        // "grade": 85.5,
        // "firstName": "Olivia",
        // "lastName": "Smith",
        // "fatherName": "David Smith",
        // "nationalID": "1234567890",
        // "birthYear": 2005,
        // "address": "123 Maple Street, Springfield"

        // "studentID": "S002",
        // "grade": 92.1,
        // "firstName": "Ethan",
        // "lastName": "Johnson",
        // "fatherName": "Michael Johnson",
        // "nationalID": "2345678901",
        // "birthYear": 2004,
        // "address": "456 Oak Avenue, Rivertown"

        Course course = new Course();

        course.getCourseInfo(input); // for Lecturer, and Student personal info

        course.getStudentGrade(input); // for each student's grade

        course.sortGrades(); // sort grades in descending order using Bubble Sort

        course.displayGrades();

        course.save(); // save results to the file

        input.close();

        // close() methods should be called to release the memory usage of the classes.
        // Though, it is not required to have destructors in java,
        // since there is no manual memory management like in C
        // Memory management will be handled automatically
    }
}
