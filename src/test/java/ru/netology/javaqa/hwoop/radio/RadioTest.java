package ru.netology.javaqa.hwoop.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetFm() {
        Radio radio = new Radio();

        radio.setFm(3);

        int expected = 3;
        int actual = radio.getFm();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AboveMaximumFm() {
        Radio radio = new Radio();
        radio.setFm(6);

        radio.next();

        int expected = 7;
        int actual = radio.getFm();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AboveMinimumFm() {
        Radio radio = new Radio();
        radio.setFm(5);

        radio.AboveMinFm();

        int expected = 4;
        int actual = radio.getFm();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessThanZeroFm() {
        Radio radio = new Radio();
        radio.setFm(0);

        radio.AboveMinFm();

        int expected = 9;
        int actual = radio.getFm();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreThanMaximumFm() {
        Radio radio = new Radio();
        radio.setFm(9);

        radio.next();

        int expected = 0;
        int actual = radio.getFm();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderlineOneFm() {
        Radio radio = new Radio();

        radio.setFm(1);

        int expected = 1;
        int actual = radio.getFm();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderlineEightFm() {
        Radio radio = new Radio();

        radio.setFm(8);

        int expected = 8;
        int actual = radio.getFm();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setVolume(76);

        int expected = 76;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AboveMaximumVolume() {
        Radio radio = new Radio();
        radio.setVolume(86);

        radio.increaseVolume();

        int expected = 87;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AboveMinimumVolume() {
        Radio radio = new Radio();
        radio.setVolume(39);

        radio.turnDownVolume();

        int expected = 38;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessThanZeroVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.AboveMinFm();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void moreThanMaximumVolumeBorder100() {
        Radio radio = new Radio();
        radio.setVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}
