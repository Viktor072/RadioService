package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioServiceTest {

    @Test
    public void setMaxStation() {
        RadioService radio = new RadioService();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(5);
        int excepted = 9;
        assertEquals(excepted, radio.getMaxStation());
    }

    @Test
    public void setMinStation() {
        RadioService radio = new RadioService();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(2);
        int excepted = 0;
        assertEquals(excepted, radio.getMinStation());
    }

    @Test
    public void setCurrentStation() {
        RadioService radioman = new RadioService();
        radioman.setMaxStation(9);
        radioman.setMinStation(0);
        radioman.setCurrentStation(3);
        int excepted = 3;
        assertEquals(excepted, radioman.getCurrentStation());
    }

    @Test
    public void setCurrentStationOverMaxStation() {
        RadioService radio = new RadioService();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(10);
        int excepted = 9;
        assertEquals(excepted, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationEquallyMinStation() {
        RadioService radio = new RadioService();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(0);
        int excepted = 0;
        assertEquals(excepted, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationUnderMinStation() {
        RadioService radio = new RadioService();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(-1);
        int excepted = 0;
        assertEquals(excepted, radio.getCurrentStation());
    }

    @Test
    public void setMaxVolume() {
        RadioService radio = new RadioService();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(4);
        int excepted = 10;
        assertEquals(excepted, radio.getMaxVolume());
    }

    @Test
    public void setMinVolume() {
        RadioService radio = new RadioService();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(80);
        int excepted = 0;
        assertEquals(excepted, radio.getMinVolume());
    }

    @Test
    public void setCurrentVolume() {
        RadioService radio = new RadioService();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(90);
        int excepted = 90;
        assertEquals(excepted, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeOverMaxVolume() {
        RadioService radio = new RadioService();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(120);
        int excepted = 100;
        assertEquals(excepted, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeEquallyMinVolume() {
        RadioService radio = new RadioService();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);
        int excepted = 0;
        assertEquals(excepted, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeUnderMinVolume() {
        RadioService radio = new RadioService();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(-2);
        int excepted = 0;
        assertEquals(excepted, radio.getCurrentVolume());
    }

    @Test
    public void upVolume() {
        RadioService radio = new RadioService();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(50);
        radio.upVolume();
        int excepted = 51;
        assertEquals(excepted, radio.getCurrentVolume());
    }

    @Test
    public void upVolumeOverMaxVolume() {
        RadioService radio = new RadioService();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(120);
        radio.upVolume();
        int excepted = 100;
        assertEquals(excepted, radio.getCurrentVolume());
    }

    @Test
    public void downVolume() {
        RadioService radio = new RadioService();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(50);
        radio.downVolume();
        int excepted = 49;
        assertEquals(excepted, radio.getCurrentVolume());
    }

    @Test
    public void downVolumeOverMinVolume() {
        RadioService radio = new RadioService();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(-50);
        radio.downVolume();
        int excepted = 0;
        assertEquals(excepted, radio.getCurrentVolume());
    }

    @Test
    public void nextStation() {
        RadioService radio = new RadioService();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(3);
        radio.nextStation();
        int excepted = 4;
        assertEquals(excepted, radio.getCurrentStation());
    }

    @Test
    public void nextStationAfterMaxStation() {
        RadioService radio = new RadioService();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(10);
        radio.nextStation();
        int excepted = 0;
        assertEquals(excepted, radio.getCurrentStation());
    }

    @Test
    public void prevStation() {
        RadioService radio = new RadioService();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(3);
        radio.prevStation();
        int excepted = 2;
        assertEquals(excepted, radio.getCurrentStation());
    }
    @Test
    public void prevStationAfterMinStation() {
        RadioService radio = new RadioService();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(-1);
        radio.prevStation();
        int excepted = 9;
        assertEquals(excepted, radio.getCurrentStation());
    }
}