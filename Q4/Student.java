package Q4;

import java.util.Scanner;

public class Student extends Person {

    // data members
    private String studentID;
    private double grade;

    // constructors
    public Student() {}

    public Student(
        String studentID,
        double grade,
        String firstName,
        String lastName,
        String fatherName,
        String nationalID,
        int birthYear,
        String address
    )

    {
        super(firstName, lastName, fatherName, nationalID, birthYear, address);
        this.studentID = studentID;

        // validity checking
        setGrade(grade);
    }

    // setters
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setGrade(double grade) {

        if (grade >= 0)
            this.grade = grade;

        else
            throw new IllegalArgumentException("Grade must be greater than 0. Got " + grade);
    }

    // getters
    public String getStudentID() {
        return this.studentID;
    }

    public double getGrade() {
        return this.grade;
    }

    // get the student info from the user
    @Override
    public void getInfo(Scanner scanner) {

        super.getInfo(scanner); // call the superclass method to read common data

        String info;

        System.out.printf("studentID: ");
        info = scanner.nextLine();
        this.setStudentID(info);
    }

    // subclass's overridden cleanup method
    @Override
    public void close() {
        System.out.println("Releasing Student class's resources");
    }
}
