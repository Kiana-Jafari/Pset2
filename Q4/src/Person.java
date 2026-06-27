package src;

import java.util.Scanner;

abstract class Person {

    // data members
    private String firstName;
    private String lastName;
    private String fatherName;
    private String nationalID;
    private int birthYear;
    private String address;

    // constructors
    public Person() {}
    
    public Person(
        String firstName,
        String lastName,
        String fatherName,
        String nationalID,
        int birthYear,
        String address
    )

    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.nationalID = nationalID;
        this.birthYear = birthYear;
        this.address = address;
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFatherName() {
        return this.fatherName;
    }

    public String getNationalID() {
        return this.nationalID;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public String getAddress() {
        return this.address;
    }

    // get the person's general info from the user
    public void getInfo(Scanner scanner) {

        String info;

        System.out.printf("first name: ");
        info = scanner.nextLine();
        this.setFirstName(info);

        System.out.printf("last name: ");
        info = scanner.nextLine();
        this.setLastName(info);

        System.out.printf("father name: ");
        info = scanner.nextLine();
        this.setFatherName(info);

        System.out.printf("nationalID: ");
        info = scanner.nextLine();
        this.setNationalID(info);

        System.out.printf("year of birth: ");
        info = scanner.nextLine();
        this.setBirthYear(Integer.parseInt(info));

        System.out.printf("address: ");
        info = scanner.nextLine();
        this.setAddress(info);
    }

    // manual cleanup method to release non-memory resources
    public void close() {
        System.out.println("Closing Scanner object to avoid data leakage");
    }
}
