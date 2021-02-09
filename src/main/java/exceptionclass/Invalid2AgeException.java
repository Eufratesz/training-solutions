package exceptionclass;

public class Invalid2AgeException extends RuntimeException{

    private int parameterAge;
    private int minAge;

    public Invalid2AgeException(String message, int parameterAge, int minAge) {
        super(message);
        this.parameterAge = parameterAge;
        this.minAge = minAge;
    }

    public int getParameterAge() {
        return parameterAge;
    }

    public int getMinAge() {
        return minAge;
    }
}
