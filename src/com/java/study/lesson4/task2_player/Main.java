package com.java.study.lesson4.task2_player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playerCommand = input.next().toLowerCase();
        Player player = new Player();
        while (true){
            switch (playerCommand){
                case "play":
                    player.play();
                    break;
                case "pause":
                    player.pause();
                    break;
                case "stop":
                    player.stop();
                    break;
                case "record":
                    player.record();
                    break;
                default:
                    System.out.println("Incorrect command, try again");
                    break;
            }
            playerCommand = input.next().toLowerCase();
            if (playerCommand.equals("close")) {
                System.out.println("Player closed");
                break;
            }
        }
    }
}
