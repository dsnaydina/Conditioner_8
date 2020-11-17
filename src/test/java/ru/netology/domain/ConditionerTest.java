package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldIncreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        conditioner.setMaxTemperature(35);
        conditioner.increaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldNotIncreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(35);
        conditioner.setMaxTemperature(35);
        conditioner.increaseCurrentTemperature();
        assertEquals(35, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        conditioner.setMinTemperature(15);
        conditioner.decreaseCurrentTemperature();
        assertEquals(19, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldNotDecreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(15);
        conditioner.setMinTemperature(15);
        conditioner.decreaseCurrentTemperature();
        assertEquals(15, conditioner.getCurrentTemperature());
    }
}