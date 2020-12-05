package staticattrmeth;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankTransaction {

    private static final long MIN_TRX_VALUE = 1;
    private static final long MAX_TRX_VALUE = 10_000_000;
    private static long countTrx = 0;
    private static BigDecimal sumOfTrx = new BigDecimal("0");
    public static long currentMinValue =  MIN_TRX_VALUE;
    public static long currentMaxValue = MAX_TRX_VALUE;

    private long trxValue;

    public BankTransaction(long trxValue) {
        if (trxValue <= MIN_TRX_VALUE && trxValue >= MAX_TRX_VALUE) {
            throw new IllegalArgumentException("This transaction cannot be accepted!" + trxValue);
        }
        countTrx++;
        sumOfTrx = sumOfTrx.add(new BigDecimal(Long.toString(trxValue)));
        if (trxValue < currentMinValue) currentMinValue = trxValue;
        if (trxValue > currentMaxValue) currentMaxValue = trxValue;
        this.trxValue = trxValue;
    }

    public static void initTheDay(){
        countTrx = 0;
        sumOfTrx = new BigDecimal("0");
        currentMinValue =  MIN_TRX_VALUE;
        currentMaxValue = MAX_TRX_VALUE;

    }

    public static BigDecimal averageOfTransaction() {
        return countTrx == 0 ? new BigDecimal("0") : sumOfTrx.divide(new BigDecimal(Long.toString(countTrx)), 0, RoundingMode.HALF_UP);
    }

    public static long getCurrentMinValue() {
        return countTrx ==0 ? 0: currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return countTrx == 0 ? 0: currentMaxValue;
    }

    public static BigDecimal getSumOfTrx() {
        return sumOfTrx;
    }

    public long getTrxValue(){
    return trxValue;
}
}