package week03d05;

import java.util.Scanner;

public class ReadNumbers {

    public int add(int i, int j){
        if(i<0) {
            throw new IllegalArgumentException("Cannot be less than 0");
        }
        return i+j;
    }

    public static void main(String[] args) {

        ReadNumbers readNumbers = new ReadNumbers();
        System.out.println((readNumbers.add(5,6)));
        System.out.println((readNumbers.add(-5, 6)));  //Kiírta a hibaüzenetet a konzolra.


         /*
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        try {
            int number = Integer.parseInt(line);
            System.out.println(number);
        }
        catch (NumberFormatException ne) {
            System.out.println("Not a number");

        }

          */
    }
}
