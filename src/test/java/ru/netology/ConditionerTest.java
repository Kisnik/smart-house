package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
        //увеличение температуры без выхода за допустимый предел
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        conditioner.setMaxTemperature(50);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        int expected = 31;
        assertEquals(expected, actual);
    }

    @Test
        //увеличение температуры с выходом за допустимый предел
    void increaseOverMaxCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        conditioner.setMaxTemperature(50);
        conditioner.setCurrentTemperature(50);
        conditioner.increaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        int expected = 50;
        assertEquals(expected, actual);
    }

    @Test
        //уменьшение температуры без выхода за допустимый предел
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        conditioner.setMaxTemperature(50);
        conditioner.setCurrentTemperature(30);
        conditioner.decreaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        int expected = 29;
        assertEquals(expected, actual);
    }

    @Test
        //уменьшение температуры с выходом за допустимый предел
    void decreaseOverMaxCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        conditioner.setMaxTemperature(50);
        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        int expected = 10;
        assertEquals(expected, actual);
    }


}