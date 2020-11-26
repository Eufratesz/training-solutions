package statements;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }


    public int getInMinutes() {
        int minutesInHour = 60;                     // 1 óra = 60 perc
        return hours * minutesInHour + minutes;     //az órák számát megszörozza 60-nal, hozzáadja a perceket.
    }

    public int getInSeconds() {
        int secondsInMinute = 60;                   // 1 perc = 60 mp.
        return getInMinutes() * secondsInMinute + seconds;  // az előző eredményét megszorozza 60-nal, hozzáadja a mp-ket.
    }
        //az earlierThan metódusnál elakadtam, ezt meg kellett néznem.
        public boolean earlierThan(Time anotherTime){
            int thisTimeInSeconds = this.getInSeconds();
            int anotherTimeInSeconds = anotherTime.getInSeconds();
            return thisTimeInSeconds < anotherTimeInSeconds;
        }

        public String toString() {
            return hours + ": " + minutes + ": " + seconds;
        }

    }













