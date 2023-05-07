package ru.netology.radio;

public class RadioService {

    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public RadioService (int maxStation, int minStation, int currentStation, int maxVolume, int
            minVolume, int currentVolume) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = currentStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
    }

    public RadioService() {
    }

    public RadioService(int maxStation) {
        this.maxStation = maxStation;
    }

    public RadioService(int maxStation, int currentStation, int currentVolume) {
        this.maxStation = maxStation;
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
    }

    public RadioService(int currentStation, int currentVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }


    public int getMinStation() {
        return minStation;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }


    public int getMinVolume() {
        return minVolume;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }

        this.currentVolume = currentVolume;
    }

    public void upVolume() {
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        this.currentVolume++;
    }

    public void downVolume() {
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume--;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation++;
    }

    public void prevStation() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation--;
    }

}