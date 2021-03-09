package extrapractice.week02d02;

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
        Phone phone = new Phone("Phone1", 64);
        Phone otherPhone = new Phone("Phone2", 128);
        System.out.println("Type: " + phone.getType() + " memory: " + phone.getMem());
        System.out.println("Type: " + otherPhone.getType() + " memory: " + otherPhone.getMem());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type of phone?");
        String type = scanner.nextLine();
        System.out.println("Memory?");
        int mem = scanner.nextInt();
        scanner.nextLine();
        Phone thirdPhone = new Phone(type, mem);
        System.out.println("Data of your phone: " + type + " " + thirdPhone.mem);


    }
}
