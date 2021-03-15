package introexception.patient;

public class SsnValidator {

    public boolean isValidSsn(String ssn) {
        if (ssn.length() != 9) {
            return false;
        }
        try {
            int sum = 0;
            for (int i = 0; i < ssn.length() - 1; i += 2) {
                int oddPosition = i;
                sum += i * 3;
            }
            for (int j = 1; j < ssn.length() - 1; j += 2) {
                int evenPosition = j;
                sum += j * 7;
            }
            int lastPosition = Integer.parseInt(ssn.substring(8));

            return sum / 10 == lastPosition;

        } catch (IllegalArgumentException iae) {
            return false;
        }
    }


}
