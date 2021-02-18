package week02d02;

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
        Phone phone = new Phone("Phone", 16);
        Phone anotherPhone = new Phone("Phone2", 32);
        System.out.println("Type: " + phone.getType() + ", memory: " + phone.getMem());
        System.out.println("Type: " + anotherPhone.getType() + ", memory: " + anotherPhone.getMem());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type of phone?");
        String type = scanner.nextLine();
        System.out.println("Size of memory?");
        int mem = scanner.nextInt();
        Phone thirdPhone = new Phone(type, mem);
        System.out.println("Type: " + thirdPhone.getType() + ", memory: " + thirdPhone.getMem());

    }
}
