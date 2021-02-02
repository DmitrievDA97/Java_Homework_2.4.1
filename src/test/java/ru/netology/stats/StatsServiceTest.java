package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSumAllValues() {
        StatsService service = new StatsService();

        long[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSumAllValues(values);
        assertEquals(expected,actual);
    }
    @Test
    void calculateMiddleValuesPerMonth() {
        StatsService service = new StatsService();

        long[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.calculateMiddleValuesPerMonth(values);
        assertEquals(expected,actual);


    }
    @Test
    void calculateMonthMaxValues() {
        StatsService service = new StatsService();

        long[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.calculateMonthMaxValues(values);
        assertEquals(expected,actual);

    }
    @Test
    void calculateMonthMinValues() {
        StatsService service = new StatsService();

        long[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.calculateMonthMinValues(values);
        assertEquals(expected,actual);

    }
    @Test
    void calculateAmountLowerMiddleValues() {
        StatsService service = new StatsService();

        long[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.calculateAmountLowerMiddleValues(values);
        assertEquals(expected,actual);

    }
    @Test
    void calculateAmountUpMiddleValues() {
        StatsService service = new StatsService();

        long[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.calculateAmountUpMiddleValues(values);
        assertEquals(expected,actual);

    }
}