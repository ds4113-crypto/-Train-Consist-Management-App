import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // =========================
        // UC11: Regex Validation
        // =========================

        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("\nEnter Train ID (format TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (format PET-AB): ");
        String cargoCode = scanner.nextLine();

        // Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainRegex = Pattern.compile(trainPattern);
        Pattern cargoRegex = Pattern.compile(cargoPattern);

        // Create matchers
        Matcher trainMatcher = trainRegex.matcher(trainId);
        Matcher cargoMatcher = cargoRegex.matcher(cargoCode);

        // Validate using matches()
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // Output results
        System.out.println("\nValidation Results:");

        if (isTrainValid) {
            System.out.println("Train ID is VALID.");
        } else {
            System.out.println("Train ID is INVALID.");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID.");
        } else {
            System.out.println("Cargo Code is INVALID.");
        }

        System.out.println("\nValidation completed.");

        scanner.close();
    }
}