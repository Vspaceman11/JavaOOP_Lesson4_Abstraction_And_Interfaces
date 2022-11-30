package com.java.study.lesson4.task2_player;

public class Player implements Playable, Recodable{
    public void play(){
        System.out.println("Start playback/Already playing");
    }
    public void pause(){
        System.out.println("Playback paused/Playback started");
    }
    public void stop(){
        System.out.println("Playback stopped/Recording stopped");
    }
    public void record(){
        System.out.println("Recording started/Already recording");
    }
}
