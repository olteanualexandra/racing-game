package org.example;

import org.example.utils.ScannerUtils;

import java.util.Scanner;

public class Game {

    public void start() {
        System.out.println("Welcome to the racing game");
        int playerCount = getPlayerCountFromUser();
        System.out.println("Player count:" + playerCount);

        String vehicleName = getVehicleNameFromUser();
        System.out.println("Vehicle name: " + vehicleName);

    }

    private int getPlayerCountFromUser() {
        System.out.println("Please enter number of players:");
        return ScannerUtils.nextIntAndMoveToNextLine();
    }
    private String getVehicleNameFromUser(){
        System.out.println("Please enter vehicle name");
        return ScannerUtils.nextLine();
}
}
