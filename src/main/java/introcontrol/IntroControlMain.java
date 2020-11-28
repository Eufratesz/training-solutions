package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introcontrol = new IntroControl();

        System.out.println(introcontrol.subtractTenIfGreaterThanTen(10));
        System.out.println(introcontrol.subtractTenIfGreaterThanTen(9));
        System.out.println(introcontrol.subtractTenIfGreaterThanTen(20));

        System.out.println(introcontrol.describeNumber(0));
        System.out.println(introcontrol.describeNumber(-5));
        System.out.println(introcontrol.describeNumber(10));

        System.out.println(introcontrol.greetingToJoe("Brian"));
        System.out.println(introcontrol.greetingToJoe("Joe"));

        System.out.println(introcontrol.calculateBonus(1_000_000));
        System.out.println(introcontrol.calculateBonus(1_000_100));
        System.out.println(introcontrol.calculateBonus(1_000));

        System.out.println(introcontrol.calculateConsumption(3000, 6000));
        System.out.println(introcontrol.calculateConsumption(5000, 5000));
        System.out.println(introcontrol.calculateConsumption(9000, 100));


        System.out.println("Print the numbers from  0 to max: ");
        introcontrol.printNumbers(5);

        System.out.println("Print the numbers between given minimum and maximum: ");
        introcontrol.printNumbersBetween(1,20);

        System.out.println("Print the numbers in any direction");
        introcontrol.printNumbersBetweenAnyDirection(1,5);
        introcontrol.printNumbersBetweenAnyDirection(10,6);

        System.out.println("Print odd numbers until given number: ");
        introcontrol.printOddNumbers(10);



    }
}
