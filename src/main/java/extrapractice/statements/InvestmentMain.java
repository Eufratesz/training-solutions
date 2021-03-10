package extrapractice.statements;

import java.util.Scanner;

public class InvestmentMain {

    public static void main(String[] args) {
        System.out.println("Mennyi a befektetett összeg?");

        Scanner scanner = new Scanner(System.in);
        int fund = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Mennyi a kamatláb?");
        int interestRate = scanner.nextInt();
        scanner.nextLine();

        Investment investment = new Investment(fund, interestRate);

        System.out.println("A tőke: " + investment.getFund());
        System.out.println("A hozam 50 napra: " + investment.getYield(50));
        System.out.println("A kivett összeg 80 nap után: " + investment.close(80));
        System.out.println("A kivett összeg 90 nap után: " + investment.close(90));

    }
}
