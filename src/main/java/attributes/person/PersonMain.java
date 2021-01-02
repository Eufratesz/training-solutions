package attributes.person;

public class PersonMain {

    public static void main(String[] args) {
         Person person = new Person("John Smith","123456");
        System.out.println(person.personToString());

        Address address = new Address("Australia","Sydney", "Hollow Str. 3", "1234");
        System.out.println(address.addressToString());

        person.moveTo(address);
        System.out.println(person.getAddress().addressToString());

        person.correctData("Jim Smith", "987654");
        System.out.println(person.personToString());

        person.getAddress().correctData("India", "New Delhi", "Yoga str. 2", "7364");
        System.out.println(person.getAddress().addressToString());


        Address newAddress = new Address("New Zealand", "Auckland", "Mall str 5", "284765");
        person.moveTo(newAddress);
        System.out.println(person.getAddress().addressToString());
    }
}
