import java.util.ArrayList;
import java.util.List;

// 🚆 Goods Bogie Class
class GoodsBogie {
    String type;   // Cylindrical, Open, Box
    String cargo;  // Petroleum, Coal, Grain

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String toString() {
        return type + " -> " + cargo;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // =========================
        // UC12: Safety Compliance Check
        // =========================

        // Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        // Uncomment below to test invalid case
        // goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // Display bogies
        System.out.println("\nGoods Bogies:");
        for (GoodsBogie g : goodsBogies) {
            System.out.println(g);
        }

        // 🔍 Safety validation using Stream
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical") ||
                                b.cargo.equalsIgnoreCase("Petroleum")
                );

        // Display result
        System.out.println("\nSafety Compliance Check:");

        if (isSafe) {
            System.out.println("Train is SAFE for operation.");
        } else {
            System.out.println("Train is UNSAFE! Invalid cargo detected.");
        }

        System.out.println("\nSafety validation completed.");
    }
}