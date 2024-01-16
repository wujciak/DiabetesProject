import java.util.List;
import java.util.Scanner;

/**
 * Class Main demonstrates whole project funcionality.
 */
public class Main {
    public static void main(String[] args) {
        // Use Scanner to get the path from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path to the JSON file: ");
        String jsonFilePath = scanner.nextLine();

        ReadJSON readJSON = new ReadJSON(jsonFilePath);

        try {
            // Read data from the JSON file and get a list of Diabetic objects
            List<Diabetic> diabeticList = readJSON.readData();

            if (diabeticList != null) {
                // Show all diabetics with updated status
                DiabetesOperations.showAllDiabetics(diabeticList);

                // Show names of diabetics with too high sugar level
                DiabetesOperations.showHighSugarLevelNames(diabeticList);

                // Show names of diabetics with too low sugar level
                DiabetesOperations.showLowSugarLevelNames(diabeticList);
            } else {
                System.out.println("Diabetic list is null.");
            }
        } catch (DiabetesDataException e) {
            // Handle exception appropriately
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
