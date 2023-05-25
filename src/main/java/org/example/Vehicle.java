package org.example;
// "is-a" relationship (inheritance)
public class Vehicle {
    //instance variables
    String name;
    double fuelLevel;
    double mileage;
    double totalTraveledDistance;
    double maxSpeed;
    boolean damaged;
    String color;

    public double accelerate(double speed, double durationInHours){
        //ferrari is accelerating with 100 km/h for 1h
        System.out.println(name + " is accelerating with" + speed + " km/h for" + durationInHours + " h");
// local variable
        double distance = speed * durationInHours;
        totalTraveledDistance = totalTraveledDistance +distance;
        System.out.println(" Total traveled distance for vehicle " + name + ":" + totalTraveledDistance);

        double usedFuel = distance* mileage/100;

        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel for vehicle " + name + "+" + fuelLevel);

        return distance;
    }

}
