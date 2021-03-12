package extrapractice.stringtype;

public class UserValidator {

    public boolean isValidUserName(String userName) {
        return !userName.isBlank();
    }

    public boolean isValidPassWord(String password1, String password2){
        return (password1.length()>= 8 && password1.equals(password2));

    }

    public boolean isValidEmail(String email){
        int atSignIndex = email.indexOf("@");
        int dotIndex = email.indexOf(".");

        return atSignIndex> 0
                && atSignIndex < dotIndex
                && dotIndex != email.length() - 1;

    }


}
