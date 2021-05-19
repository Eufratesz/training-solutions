package aaa.week02d05;

/*
Hozz létre egy Languages osztályt, main metódussal! Ebben hozz létre egy listát, mely karakterláncokat tartalmaz!
Vegyetek fel 3 elemet: Java, Python, JavaScript!
Írd ki, az öt karakternél hosszabb programozási nyelveket!

 */

import java.util.ArrayList;
import java.util.List;

public class Languages {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Java");
        myList.add("Python");
        myList.add("JavaScript");

        for (String language : myList) {
            if (language.length() > 5) {
                System.out.println(language);
            }
        }
    }
}
