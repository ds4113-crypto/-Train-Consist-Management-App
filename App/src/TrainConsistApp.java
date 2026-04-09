import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // =========================
        // UC6: Bogie → Capacity Mapping
        // =========================

        // Create HashMap (Bogie Name → Capacity)
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // 🚆 Insert bogie capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 24);

        // 📋 Display bogie capacities
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogie = entry.getKey();
            int capacity = entry.getValue();

            System.out.println(bogie + " -> Capacity: " + capacity);
        }

        System.out.println("\nTotal bogie types: " + bogieCapacityMap.size());

        System.out.println("\nSystem supports capacity mapping and fast lookup.");
    }
}