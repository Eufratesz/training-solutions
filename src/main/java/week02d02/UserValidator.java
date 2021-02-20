package week02d02;

public class UserValidator {
    public boolean isValidEmail(String email){
        System.out.println("Input: " + email);

        boolean containsAtSign = email.indexOf("@") >= 0;
        System.out.println("contains @: " + containsAtSign);

        boolean containsDot = email.indexOf(".") >= 0;
        System.out.println("contains . : " + containsDot);

        int atSignPosition = email.indexOf("@");
        int dotPosition = email.indexOf(".");
        boolean positionGood = atSignPosition+1  < dotPosition;
        System.out.println("positionGood: "+ positionGood);

        boolean canNotFirst = atSignPosition != 0;
        boolean canNotLast = dotPosition != email.length()-1;


        return containsAtSign && containsDot && positionGood && canNotFirst && canNotLast;

    }

    public static void main(String[] args) {
        UserValidator validator= new UserValidator();
        System.out.println(validator.isValidEmail("alma"));
        System.out.println(validator.isValidEmail("al@ma"));
        System.out.println(validator.isValidEmail("al@m.a"));
        System.out.println(validator.isValidEmail("alm.a"));
        System.out.println(validator.isValidEmail("a.lma"));
        System.out.println(validator.isValidEmail("alma@.a"));
        System.out.println(validator.isValidEmail("alma@m.a"));
    }
}
