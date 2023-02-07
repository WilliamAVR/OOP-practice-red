package task2;

public class Employee {
    private String firstName;
    private String lastName;
    private Date birthday;
    private Date employmentStartDate;

    public Employee(String firstName, String lastName, Date birthday, Date employmentStartDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.employmentStartDate = employmentStartDate;
    }

    @Override
    public String toString() {
        return String.format("%s %s, born on %s, employed since %s",firstName,lastName,birthday,employmentStartDate);
    }
}
