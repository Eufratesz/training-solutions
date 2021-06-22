package aaa.week03;

/*
Írj egy Phone oszályt, melynek van egy prefix és egy number String attribútuma! Írj egy PhoneParser osztályt egy
 parse(String) metódussal, ami beolvas egy 10-1234567 formátumú szöveget, és visszaad egy Phone objektumot,
 feltöltve a prefix értékét 10, a number értékét 1234567 értékekkel!
 */

public class PhoneParser {



    public Phone parse(String prefixAndNumber){
        String prefix = prefixAndNumber.substring(0,2);
        String number = prefixAndNumber.substring(3);
        Phone phone = new Phone(prefix, number);

        return phone;

    }

    public static void main(String[] args) {
        PhoneParser phoneParser = new PhoneParser();
        Phone phone = phoneParser.parse("20-3249053");
        System.out.println(phone.getPrefix());
        System.out.println(phone.getNumber());
        System.out.println(phone.toString());
    }


}
