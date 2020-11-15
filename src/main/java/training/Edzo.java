package training;

//Gyakorlásképpen újra megoldom, Trainer szót Edzo-re cserélem.

public class Edzo {
    private String name;
    private int yearOfBirth;

    public String getName() {
        return name;
    }

    public String getNameAndYearOfBirth() {
        return name + " " + yearOfBirth;
    }

    public void changeName(String newName) {
        name = newName;
    }

    //getter és setter metódusok generálása:


    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
