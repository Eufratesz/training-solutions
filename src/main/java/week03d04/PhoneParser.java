package week03d04;

public class PhoneParser {


    public Phone parse(String phoneNumber) {  //20-1234567
        String prefix = phoneNumber.substring(0, 2);
        String number = phoneNumber.substring(3);

        Phone phone = new Phone(prefix, number);
        return phone;
     //   return new Phone(phoneNumber.substring(0,2), phoneNumber.substring(3));  alternatív megoldás.
    }

    public static void main(String[] args) {
        String phoneNumber = "30-4567890";
        PhoneParser phoneParser = new PhoneParser();
        Phone phone = phoneParser.parse(phoneNumber);
        System.out.println(phone.getPrefix() + " " + phone.getNumber());
        System.out.println(phone); //meghívódik a toString metódusa.


    }




}
