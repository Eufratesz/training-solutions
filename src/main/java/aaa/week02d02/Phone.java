package aaa.week02d02;

/*
Írj egy Phone osztályt, type (String) és mem (int) attribútumokkal! Generálj konstruktort, gettert és settert!
Írj bele egy main metódust, amivel példányosítasz egy osztályt, és kiírod az attribútumok értékeit!
 */

import java.util.Scanner;

public class Phone {

    private String type;
    private int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {
        Phone phone = new Phone("Nokia", 64);
        System.out.println(phone.getType());
        System.out.println(phone.getMem());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type of phone?");
        String phonetype = scanner.nextLine();
        System.out.println("Memory?");
        int phoneMemory = scanner.nextInt();
        System.out.println("Type of phone: " + phonetype + " Memory of phone: " + phoneMemory);



    }
}
