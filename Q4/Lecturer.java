package Q4;

import java.util.Scanner;

public class Lecturer extends Person {

    // data members
    private String lecturerID;
    private double salary;

    // constructors
    public Lecturer() {}
    
    public Lecturer(
        String lecturerID,
        double salary,
        String firstName,
        String lastName,
        String fatherName,
        String nationalID,
        int birthYear,
        String address
    )

    {
        super(firstName, lastName, fatherName, nationalID, birthYear, address);
        this.lecturerID = lecturerID;

        // validity checking
        setSalary(salary);
    }

    // setters
    public void setLecturerID(String lecturerID) {
        this.lecturerID = lecturerID;
    }

    public void setSalary(double salary) {

        if (salary > 0)
            this.salary = salary;

        else
            throw new IllegalArgumentException("Salary must be greater than 0. Got " + salary);
    }

    // getters
    public String getLecturerID() {
        return this.lecturerID;
    }

    public double getSalary() {
        return this.salary;
    }

    // get the lecturer info from the user
    @Override
    public void getInfo(Scanner scanner) {

        super.getInfo(scanner);

        String info;

        System.out.printf("lecturerID: ");
        info = scanner.nextLine();
        this.setLecturerID(info);

        System.out.printf("lecturer's salary: ");
        info = scanner.nextLine();
        this.setSalary(Double.parseDouble(info));
    }

    // memory cleanup
    @Override
    public void close() {
        System.out.println("Releasing Lecturer class's resources");
    }
}
