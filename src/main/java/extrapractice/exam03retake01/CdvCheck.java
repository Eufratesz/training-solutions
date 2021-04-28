package extrapractice.exam03retake01;

public class CdvCheck {

//    public boolean check(String stringNumber) {
//       int sum = 0;
//        for (int i =0; i< 9; i++){
//            int number = Integer.parseInt(stringNumber.substring(i, i+1));
//            sum += number* (i+1);
//        }
//        System.out.println(sum);
//        return true;
//    }

    public boolean check(String stringNumber) {
        if (stringNumber.length() != 10 || notNumber(stringNumber)) {
            throw new IllegalArgumentException("invalid number");
        }
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int number = Integer.parseInt(Character.toString(stringNumber.charAt(i)));
            sum += number * (i + 1);
        }
        int lastNumber = Integer.parseInt(Character.toString(stringNumber.charAt(9)));
//        System.out.println(lastNumber);
//        System.out.println(sum % 11 );
        return sum % 11 == lastNumber;

    }

    private boolean notNumber(String s) {
        try {
            Long.parseLong(s);
            return false;
        } catch (NumberFormatException ne) {
            return true;
        }
    }

    public static void main(String[] args) {
        new CdvCheck().check("8365670003");
    }
}
