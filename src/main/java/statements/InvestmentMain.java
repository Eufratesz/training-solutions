package statements;

import java.util.Scanner;

public class InvestmentMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("A befektetés összege: ");
        int amount = scanner.nextInt();
        System.out.println("Kamatláb: ");
        int interestRate = scanner.nextInt();

        Investment investment = new Investment(amount, interestRate);

        System.out.println("Tőke: ");
        System.out.println(investment.getFund());
        System.out.println("Hozam 50 napra: " + investment.getYield(50));
        System.out.println("Kivett összeg 90 nap után: " + investment.close(90));
        System.out.println("Kivett összeg 92 nap után: " + investment.close(92));



    }
}
