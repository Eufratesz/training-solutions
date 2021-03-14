package extrapractice.attributes;

public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person("Trevor Noah", "1232456789");

        System.out.println(person.personToString());
        person.correctData("John Oliver", "987654321");
        System.out.println(person.personToString());

        Address address = new Address("England","London" ,"2 Noname str", "1234");
        person.moveTo(address);
        System.out.println(address.addressToString());
        address.correctData("USA", "NY", "2 Fifth ave.", "9876");
        System.out.println(address.addressToString());

    }
}
