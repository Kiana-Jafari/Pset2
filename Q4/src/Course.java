package src;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Course {

    private final int capacity = 50; // a maximum of 50 students
    private int n; // keep track of the students

    private Lesson lesson;
    private Lecturer lecturer; // composition; HAS-A relationship
    private Student[] students = new Student[capacity];

    // default constructor
    public Course() {
        n = 0;
    }

    // function that gets the course info from the user
    public void getCourseInfo(Scanner scanner) {

        // get the course info
        System.out.println("\nEnter the course info:\n");
        lesson = new Lesson();
        lesson.getLessonInfo(scanner);

        // get lecturer info
        System.out.println("\nEnter the lecturer's info:\n");
        lecturer = new Lecturer();
        lecturer.getInfo(scanner);

        // get student info
        System.out.printf("\nHow many students do you want to add?: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) 
        {
            System.out.println("Enter the " + (i + 1) + " student info: ");
            addStudent(scanner);
        }
    }

    // function to add a new student
    public void addStudent(Scanner scanner) {

        Student newStudent = new Student();
        newStudent.getInfo(scanner);

        if (!isPresent(newStudent.getStudentID())) 
        {
            students[n] = newStudent;
            n++;
        }
    }

    // function for getting the students' grades from the user
    public void getStudentGrade(Scanner scanner) {

        double grade;

        for (int i = 0; i < n; i++) 
        {
            System.out.printf("\nEnter the " + (i + 1) + " student's grade: ");
            grade = scanner.nextDouble();
            students[i].setGrade(grade);
        }
    }

    // function to sort the student's grades in descending order
    public void sortGrades() {

        // sort the grades in descending order
        for (int i = 0; i < (n - 1); i++) 
        {
            for (int j = 0; j < (n - 1 - i); j++) 
            {
                Student temp = new Student();

                if (students[j].getGrade() < students[j + 1].getGrade()) 
                {
                    temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    // function to display student's grades along with their studentID
    public void displayGrades() {

        System.out.println("StudentID \t Grade");

        for (int i = 0; i < n; i++) 
        {
            System.out.println(students[i].getStudentID() + '\t' + students[i].getGrade());
        }
    }

    // store the student's IDs + grades in a text file
    public void save() {

        // try-with-resources
        try (FileWriter studentsInfo = new FileWriter("students.txt")) 
        {
            studentsInfo.write("course title | ccode | studentID | student grade\n");

            for (int i = 0; i < n; i++) 
            {
                studentsInfo.write(this.getTitle());
                studentsInfo.write(" ");
                studentsInfo.write(this.getCode());
                studentsInfo.write(" ");
                studentsInfo.write(students[i].getStudentID());
                studentsInfo.write(" ");
                studentsInfo.write(Double.toString(students[i].getGrade()));
                studentsInfo.write('\n');
            }
        }

        catch (IOException e) {
            System.out.println("Error saving students' info to the file");
        }
    }

    // utility function to check the existence of a student based on their ID
    private boolean isPresent(String studentID) {

        for (int i = 0; i < n; i++) 
        {
            if (students[i].getStudentID().equals(studentID))
                return true;
        }

        return false;
    }
}
