package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioServiceTest {

    @Test
    public void setMaxOneArgStation() {
        RadioService radio = new RadioService(10);

        assertEquals(9, radio.getMaxStation());

    }

    @Test
    public void setMaxNoArgsStation() {
        RadioService radio = new RadioService();

        assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void SetMinNoArgsStation() {
        RadioService radio = new RadioService();

        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void setMinArgsStation() {
        RadioService radio = new RadioService(9,0,5,100,0,50);

        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void setCurrentArgsStation() {
        RadioService radio = new RadioService(5,30);

        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStation() {
        RadioService radio = new RadioService(9,2,52);

        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationOverMaxStation() {
        RadioService radio = new RadioService(9,5,22);
        radio.setCurrentStation(20);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationEquallyMinStation() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationUnderMinStation() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentStation(-12);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setMaxVolume() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);

        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void setMinVolume() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);

        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void setCurrentVolume() {
        RadioService radio = new RadioService(9,7,25);

        assertEquals(25, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeOverMaxVolume() {
        RadioService radio = new RadioService(9,0,5,100,0,100);
        radio.setCurrentVolume(102);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeEquallyMinVolume() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeUnderMinVolume() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentVolume(-2);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void upVolume() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentVolume(95);
        radio.upVolume();
        assertEquals(96, radio.getCurrentVolume());
    }

    @Test
    public void upVolumeOverMaxVolume() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentVolume(105);
        radio.upVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void downVolume() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentVolume(5);
        radio.downVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void downVolumeOverMinVolume() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentVolume(-5);
        radio.downVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void nextStation() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentStation(3);
        radio.nextStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void nextStationAfterMaxStation() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentStation(10);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevStation() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentStation(3);
        radio.prevStation();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void prevStationAfterMinStation() {
        RadioService radio = new RadioService(9, 0, 5, 100, 0, 50);
        radio.setCurrentStation(-1);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }
}