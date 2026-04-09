import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 🚆 Bogie Class (same as UC7)
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
        // UC8: Stream Filtering
        // =========================

        // Create bogie list (same as UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Luxury AC", 80));

        // Display original list
        System.out.println("\nOriginal Bogie List:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 🔍 Filter bogies with capacity > 60
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered list
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }

        // Verify original list unchanged
        System.out.println("\nOriginal List After Filtering (Unchanged):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nStream filtering completed successfully.");
    }
}