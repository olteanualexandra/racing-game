package org.example;

import java.lang.reflect.Constructor;

// "is-a" relationship (inheritance)
public class Vehicle {
    //class variables
    static int totalVehicleCount;



    //instance variables
    String name;
    double fuelLevel;
    double mileage;
    double totalTraveledDistance;
    double maxSpeed;
    boolean damaged;
    String color;

    public Vehicle() {
        totalVehicleCount++;
    }

    public double accelerate(double speed, double durationInHours){
        if (fuelLevel <= 0 || damaged) {
            System.out.println("You cannot accelerate");
            return 0;
        }
        if(speed > maxSpeed){
            System.out.println("Max speed exceeded.");
            return 0;
        } else if(speed == maxSpeed) {
            System.out.println("Careful, max speed reached");
        }else{
                System.out.println("Valid speed entered");
            }


        System.out.println(name + " is accelerating with" + speed + " km/h for" + durationInHours + " h");
// local variable
        double distance = speed * durationInHours;
        totalTraveledDistance = totalTraveledDistance +distance;
        System.out.println(" Total traveled distance for vehicle " + name + ":" + totalTraveledDistance);

        double mileagemultiplier = 1;
        if(speed > 120){
            mileagemultiplier = speed/100;
        }
        double usedFuel = distance* mileage * mileagemultiplier/100;

        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel for vehicle " + name + "+" + fuelLevel);

        return distance;
    }

}
