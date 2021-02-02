package ru.netology.stats;

public class StatsService {

    public long calculateSumAllValues(long[] values) {
        long sum = 0;
        for (long value : values) {
            sum = sum + value;
        }
        return sum;
    }

    public long calculateMiddleValuesPerMonth(long[] values) {
        long month = 0;
        long sum = 0;
        for (long value : values ) {
            month += 1;
            sum = sum + value;
        }
        long middle = sum / month;
        return middle;
    }
    public long calculateMonthMaxValues(long[] values) {
        long month = 0;
        long monthMax = 0;
        long valueMax = values[0];
        for (long value : values ) {
            month += 1;
            if (valueMax <= value) {
                valueMax = value;
                monthMax = month;
            }
        }
        return monthMax;
    }
    public long calculateMonthMinValues(long[] values) {
        long month = 0;
        long monthMin = 0;
        long valueMin = values[0];
        for (long value : values) {
            month += 1;
            if (valueMin >= value) {
                valueMin = value;
                monthMin = month;
            }
        }
        return monthMin;
    }
    public long calculateAmountLowerMiddleValues(long[] values) {
        long amountMonth = 0;
        long month = 0;
        long sum = 0;
        for (long value : values ) {
            month += 1;
            sum = sum + value;
        }
        long middle = sum / month;
        for (long value : values) {
            if (value < middle) {
                amountMonth += 1;

            }
        }
        return amountMonth;

    }
    public long calculateAmountUpMiddleValues(long[] values) {
        long amountMonth = 0;
        long month = 0;
        long sum = 0;
        for (long value : values ) {
            month += 1;
            sum = sum + value;
        }
        long middle = sum / month;
        for (long value : values) {
            if (value > middle) {
                amountMonth += 1;

            }
        }
        return amountMonth;

    }


}
