package constructoroverloading.bus;

public class SimpleTime {

    private int hours;
    private int minutes;
    private SimpleTime time;

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(int hours) {
        this.hours = hours;
    }

    public SimpleTime(SimpleTime time) {
        this.hours = time.hours;
        this.minutes= time.minutes;
    }

    public int difference(SimpleTime time){
        return (hours- time.hours) *60 + minutes- time.minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public SimpleTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;
    }
}
