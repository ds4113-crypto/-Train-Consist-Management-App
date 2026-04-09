import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // =========================
        // UC5: LinkedHashSet (Ordered + Unique)
        // =========================

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // 🚆 Add bogies (insertion order maintained)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // ❗ Attempt to add duplicate
        trainFormation.add("Sleeper"); // duplicate (ignored)

        // 📋 Display final formation
        System.out.println("\nFinal Train Formation (No duplicates, ordered):");
        System.out.println(trainFormation);

        // Total bogies
        System.out.println("\nTotal bogies: " + trainFormation.size());

        System.out.println("\nSystem preserves order and prevents duplicates.");
    }
}