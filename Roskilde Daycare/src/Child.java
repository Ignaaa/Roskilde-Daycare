public class Child extends Person {

    private String guardianFirstName;
    private String guardianLastName;
    // teacher


    //constructors
    public Child() {
    }

    public Child(String cpr, String classId, String firstName, String lastName, int age, String gender, String phoneNo, String address, String guardianFirstName, String guardianLastName) {
        super(cpr, classId, firstName, lastName, age, gender, phoneNo, address);
        this.guardianFirstName = guardianFirstName;
        this.guardianLastName = guardianLastName;
    }

    //setters & getters
    public String getGuardianFirstName() {
        return guardianFirstName;
    }

    public void setGuardianFirstName(String guardianFirstName) {
        this.guardianFirstName = guardianFirstName;
    }

    public String getGuardianLastName() {
        return guardianLastName;
    }

    public void setGuardianLastName(String guardianLastName) {
        this.guardianLastName = guardianLastName;
    }

    @Override
    public String toString() {
        return super.toString() +
                "guardianFirstName='" + guardianFirstName + '\'' +
                ", guardianLastName='" + guardianLastName + '\'' +
                '}';
    }
}
