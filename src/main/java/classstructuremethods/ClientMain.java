package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();

        client.setName("Brad Pitt");
        client.setYear(1963);
        client.setAddress("Hollywood");

        System.out.println(client.getName());
        System.out.println(client.getYear());
        System.out.println(client.getAddress());

        client.migrate("Paris");
        System.out.println(client.getAddress());

        System.out.println("Your address has officially been changed!");
    }
}
