import java.util.ArrayList;
import java.util.List;

// 🚆 Bogie Class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // =========================
        // UC10: Total Seat Calculation using reduce()
        // =========================

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Luxury AC", 80));

        // Display bogies
        System.out.println("\nBogie List:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 🔢 Calculate total capacity using Stream reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)        // extract capacity
                .reduce(0, Integer::sum);   // aggregate sum

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);

        // Verify original list unchanged
        System.out.println("\nOriginal List After Aggregation (Unchanged):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nAggregation completed successfully.");
    }
}