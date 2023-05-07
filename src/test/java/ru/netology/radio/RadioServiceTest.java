package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioServiceTest {

    @Test
    void setMaxOneArgStation() {
        RadioService radio = new RadioService(10);

        assertEquals(10, radio.getMaxStation());

    }

    @Test
    void setMaxNoArgsStation() {
        RadioService radio = new RadioService();

        assertEquals(9, radio.getMaxStation());
    }

    @Test
    void SetMinNoArgsStation() {
        RadioService radio = new RadioService();

        assertEquals(0, radio.getMinStation());
    }

    @Test
    void setMinArgsStation() {
        RadioService radio = new RadioService(9,0,5,100,0,50);

        assertEquals(0, radio.getMinStation());
    }

    @Test
    void setCurrentArgsStation() {
        RadioService radio = new RadioService(5,30);

        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void setCurrentStation() {
        RadioService radio = new RadioService(9,2,52);

        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    void setCurrentStationOverMaxStation() {
        RadioService radio = new RadioService(9,5,22);
        radio.setCurrentStation(20);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void setCurrentStationEquallyMinStation() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void setCurrentStationUnderMinStation() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentStation(-12);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void setMaxVolume() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);

        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    void setMinVolume() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);

        assertEquals(0, radio.getMinVolume());
    }

    @Test
    void setCurrentVolume() {
        RadioService radio = new RadioService(9,7,25);

        assertEquals(25, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeOverMaxVolume() {
        RadioService radio = new RadioService(9,0,5,100,0,100);
        radio.setCurrentVolume(102);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeEquallyMinVolume() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeUnderMinVolume() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentVolume(-2);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void upVolume() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentVolume(95);
        radio.upVolume();
        assertEquals(96, radio.getCurrentVolume());
    }

    @Test
    void upVolumeOverMaxVolume() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentVolume(105);
        radio.upVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void downVolume() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentVolume(5);
        radio.downVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void downVolumeOverMinVolume() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentVolume(-5);
        radio.downVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void nextStation() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentStation(3);
        radio.nextStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void nextStationAfterMaxStation() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentStation(10);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void prevStation() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentStation(3);
        radio.prevStation();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    void prevStationAfterMinStation() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentStation(-1);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }
}