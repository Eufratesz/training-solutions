package ioreadwritebytes.temperatures;

public class Temperatures {
    private byte[]data;

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public double getYearAverage() {
        double YearAverage = 0;
        for (byte temperature : data){
            YearAverage+= temperature;
        }
        return YearAverage/365;
    }

    public double getMonthAverage(){
        double MonthAverage = 0;
        for (int i = data.length -1; i > data.length -31; i--){         //A tömb utolsó 30 eleme
            MonthAverage+= data[i];
        }
        return MonthAverage/30;
    }
}
