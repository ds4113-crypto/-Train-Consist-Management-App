import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        // =========================
        // UC1: Initialize Train
        // =========================
        System.out.println("=== Train Consist Management App ===");

        // Train consist (all bogies)
        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // =========================
        // UC2: Passenger Bogie Operations
        // =========================

        // Create passenger bogies list
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Add to main train consist
        trainConsist.addAll(passengerBogies);

        System.out.println("\nPassenger bogies added:");
        System.out.println(passengerBogies);

        // Display full consist
        System.out.println("\nCurrent Train Consist:");
        System.out.println(trainConsist);

        // Remove a bogie
        passengerBogies.remove("AC Chair");
        trainConsist.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(trainConsist);

        // Check existence
        if (trainConsist.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie not found.");
        }

        // Final state
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nTotal bogies now: " + trainConsist.size());

        System.out.println("\nSystem ready for next operations...");
    }
}