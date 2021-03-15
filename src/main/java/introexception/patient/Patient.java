package introexception.patient;

public class Patient {

    private String name;

    private String socialSecurityNumber;

    private int yearOfBirth;

    public Patient(String name, String ssn, int yearOfBirth) {
        if (name.isEmpty() || name == null) {
            throw new IllegalArgumentException("Name must be given");
        }
        if (yearOfBirth< 1900){
            throw new IllegalArgumentException("Invalid year : " + yearOfBirth);
        }
        this.name = name;
        this.socialSecurityNumber = ssn;
        this.yearOfBirth = yearOfBirth;
    }


    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
