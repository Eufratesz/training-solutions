package methodvarargs;

public class ExamStats {

    private double maxPoints;

    public ExamStats(int maxPoints) {

        this.maxPoints = maxPoints;
    }

    //a köszöbérték(%) és a vizsgaeredmények felsorolásával kiszámolja a küszöbérték feletti eredmények számát.
    public int getNumberOfTopGrades(int limitPerCent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        int numberOfTop = 0;
        for (int point : results) {
            if (point > (1.0 * limitPerCent / 100) * maxPoints) {
                numberOfTop++;
            }
        }
        return numberOfTop;
    }

    //Az alsó küszöbérték(%) megadása és a vizsgaeredmény felsorolás megadásával -- bukott-e vki?
    public boolean hasAnyFailed(int limitInPercent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }

        for (int point : results) {
            if( point < (1.0 * limitInPercent / 100) * maxPoints){
                return true;
            }
        }
        return false;

    }
}
