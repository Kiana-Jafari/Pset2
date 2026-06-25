package Q4;

import java.util.Scanner;

abstract class Lesson {

    // data members
    private String code;
    private String title;
    private int credits;
    private int type; // can be either 1, 2, or 3

    // constructors
    public Lesson() {}

    public Lesson(
        String code,
        String title,
        int credits,
        int type
    )

    {
        this.code = code;
        this.title = title;

        // validity checking
        setCredits(credits);
        setType(type);
    }

    // setters
    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCredits(int credits) {

        if (credits > 0)
            this.credits = credits;

        else
            throw new IllegalArgumentException("Credits must be positive. Got " + credits);
    }

    public void setType(int type) {

        if (type == 1 || type == 2 || type == 3)
            this.type = type;

        else
            throw new IllegalArgumentException("Lesson type must be either 1, 2, or 3. Got " + type);
    }

    // getters
    public String getCode() {
        return this.code;
    }

    public String getTitle() {
        return this.title;
    }

    public int getCredits() {
        return this.credits;
    }

    public int getType() {
        return this.type;
    }

    // get lesson's info from the user
    public void getLessonInfo(Scanner scanner) {

        String info;

        System.out.println("Enter a course's info:");

        System.out.printf("code: ");
        info = scanner.nextLine();
        this.setCode(info);

        System.out.printf("title: ");
        info = scanner.nextLine();
        this.setTitle(info);

        System.out.printf("credits: ");
        info = scanner.nextLine();
        this.setCredits(Integer.parseInt(info));

        System.out.printf("type: ");
        info = scanner.nextLine();
        this.setType(Integer.parseInt(info));
    }

    // memory cleanup
    public void close() {
        System.out.println("Releasing Lesson's class resources");
    }
}
