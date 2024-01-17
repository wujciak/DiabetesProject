import java.util.List;
import java.util.Scanner;

/**
 * Class Main demonstrates the functionality of the entire project.
 */
public class Main {
    /**
     * Main method to execute the project.
     *
     * @param args Arguments.
     */
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

                // Prompt the user for the new file name
                System.out.println("Enter the path for the new JSON file: ");
                String newJsonFilePath = scanner.nextLine();

                // Write data to the new JSON file with updated status
                WriteJSON writeJSON = new WriteJSON(jsonFilePath);
                writeJSON.writeData(diabeticList, newJsonFilePath);
            } else {
                System.out.println("Diabetic list is null.");
            }
        } catch (DiabetesDataException e) {
            System.out.println("File contains wrong data!");
        } finally {
            scanner.close();
        }
    }
}
