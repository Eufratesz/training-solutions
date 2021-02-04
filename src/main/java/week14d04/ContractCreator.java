package week14d04;
/*
Legyen egy ContractCreator osztály, melynek van egy ContractCreator(String client, List<Integer> monthlyPrices)
konstruktora, mely létrehoz egy szerződéssablont, a paraméterként
megadott adatokkal, melyet összesen EGY attribútumban tárolj!
Majd írj egy create(String name) metódust, mely a sablon alapján létrehoz egy
új szerződést, de a nevet kicseréli a paraméterként megadott névre.
 */

import java.util.ArrayList;
import java.util.List;

public class ContractCreator {

    private Contract template;


    public ContractCreator(String client, List<Integer> monthlyPrices) {
        template = new Contract(client, monthlyPrices);
    }

    public Contract create(String client){
       return new Contract(client, new ArrayList<>(template.getMonthlyPrices()));

    }

    public static void main(String[] args) {
        ContractCreator cr = new ContractCreator("Gipsz Jakab", new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12))); //Új listába átmásolja az elemeket
        Contract contract1 = cr.create("Jack Smith");
        Contract contract2 = cr.create("Mary Johnes");

        System.out.println(cr);
        System.out.println(contract1);
        System.out.println(contract2);
        //Nem lehet így átállítani az 1. hónap összegét:
        contract1.getMonthlyPrices().set(0,20);  //Immutable ->UnsopportedOperationException
        System.out.println(contract1);
        System.out.println(contract2);
    }
}
