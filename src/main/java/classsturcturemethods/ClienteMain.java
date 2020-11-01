package classsturcturemethods;

public class ClienteMain {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setName("Brad Pitt");
        cliente.setYear(1963);
        cliente.setAddress("Hollywood");

        System.out.println(cliente.getName());
        System.out.println(cliente.getYear());
        System.out.println(cliente.getAddress());

        cliente.migrate("Paris");
        System.out.println(cliente.getAddress());

        System.out.println("Your address has officially been changed!");
    }
}
