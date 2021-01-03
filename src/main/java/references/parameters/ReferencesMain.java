package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {


        Person jim = new Person("Jim Smith", 20);
        Person sarah = jim;

        System.out.println(jim.getName() + " " + jim.getAge());
        System.out.println(sarah.getName() + " " + sarah.getAge());

        sarah.setName("Susan Jones");

        System.out.println(jim.getName() + " " + jim.getAge());
        System.out.println(sarah.getName() + " " + sarah.getAge()); //Ugyanarra az objektumra mutatnak - mindkettő Susan Jones lett.



        int number = 24;
        int otherNumber = number;

        otherNumber++;

        System.out.println(number);  //24
        System.out.println(otherNumber);  //25



        jim = new Person("Tom Black", 40);
        System.out.println(sarah.getName() + " " + sarah.getAge()); //Susan Jones
        System.out.println(jim.getName() + " " + jim.getAge()); //Tom Black -- különböző objektumokra mutatnak.



    }
}
