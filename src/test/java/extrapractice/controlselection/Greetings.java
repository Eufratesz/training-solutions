package extrapractice.controlselection;

public class Greetings {

    public static final int MINUTES = 60;

    public String greeter(int hour, int minutes) {
        int timeInMinutes = hour * MINUTES + minutes;
        if (timeInMinutes >= 5 * MINUTES && timeInMinutes < 9 * MINUTES) {
            return "Jó reggelt!";
        } else if (timeInMinutes > 9 * MINUTES && timeInMinutes <= 18 * MINUTES + 30) {
            return "Jó napot!";
        } else if (timeInMinutes < 5 * MINUTES || timeInMinutes > 20 * MINUTES) {
            return "Jó éjszakát!";
        } else {
            return "Jó estét!";
        }
    }
}
