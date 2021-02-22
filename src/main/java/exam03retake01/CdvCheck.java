package exam03retake01;

public class CdvCheck {

    public boolean check(String cdv){
        String partToCheck = cdv.substring(0, 8);

        for(int i=0; i < partToCheck.length(); i++){
            int number = Integer.parseInt(partToCheck);
            int multiplied = number * i;

            int sum += multiplied;

            if((sum % 11) == Integer.parseInt(partToCheck.substring(9))){
                return true;
            }


        }
        if(cdv.length()!=10){
            throw new IllegalArgumentException("Number is not valid!");
        }
    }

}


