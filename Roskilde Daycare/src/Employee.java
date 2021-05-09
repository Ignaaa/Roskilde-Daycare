public class Employee extends Person {
    private int salary;
    //timetable

    //constructors
    public Employee() {
    }

    public Employee(String cpr, String classId, String firstName, String lastName, int age, String gender, String phoneNo, String address, int salary) {
        super(cpr, classId, firstName, lastName, age, gender, phoneNo, address);
        this.salary = salary;
    }

    //setters & getters
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "salary=" + salary +
                '}';
    }
}
