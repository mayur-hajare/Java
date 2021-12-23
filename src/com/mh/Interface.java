package com.mh;

import java.util.zip.Deflater;

interface tv {
    void On();
    void off();
}

interface SmartTv extends tv {
    void Son();

    void SOff();

}

interface TvRemote {
    void ChangeChannel();

    void IncreaseVolume();

    default void Mute() {
        System.out.println("Mute");
    }
}

class T implements SmartTv, TvRemote {
    public void On() {
        System.out.println("TV on");
    }

    public void off() {
        System.out.println("TV off");
    }

    public void ChangeChannel() {
        System.out.println("Channel Changed");
    }

    public void IncreaseVolume() {
        System.out.println("Volume Increased");
    }

    @Override
    public void Mute() {
        System.out.println("UnMute");
    }

    public void Son() {
        System.out.println("Smart Tv  on");
    }

    public void SOff() {
        System.out.println("Smart Tv off");
    }

}

public class Interface {
    public static void main(String[] args) {
        T tv = new T();
        tv.On();
        tv.Son();
        tv.ChangeChannel();
        tv.IncreaseVolume();
        tv.Mute();
        tv.off();
        tv.SOff();

    }
}
