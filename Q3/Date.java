package Q3;

public class Date {
    
    // data members
    private int day;
    private int month;
    private int year;

    // constructors
    Date() {}
    
    Date(
        int day,
        int month,
        int year
    )
    
    {
        // validity checking
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    // setters
    public void setDay(int day) {
        
        if (day >= 1 && day <= 31)
        this.day = day;

        else
        throw new IllegalArgumentException("Day must be between 1 and 31. Got " + day);
    }

    public void setMonth(int month) {
        
        if (month >= 1 && month <= 12)
        this.month = month;

        else
        throw new IllegalArgumentException("Month must be between 1 and 12. Got " + month);
    }

    public void setYear(int year) {
        this.year = year;
    } 

    // getters
    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }
}
