package ru.netology.javaqa.hwoop.radio;

public class Radio {
    private int fm;
    private int volume;

    public int getFm() {
        return fm;
    }

    public void setFm(int fm) {
        if (fm < 0) {
            return;
        }
        if (fm > 9) {
            return;
        }
        this.fm = fm;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        this.volume = volume;
    }

    public void next() {  //AboveMaxFm
        if (fm != 9) {
            fm++;
        } else {
            fm = 0;
        }
    }

    public void AboveMinFm() {  //next
        if (fm != 0) {
            fm--;
        } else {
            fm = 9;
        }
    }


    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
        if (volume == 100) {
            volume = 100;
        }
    }

    public void turnDownVolume() {
        if (volume != 0) {
            volume--;
        }
    }

}
