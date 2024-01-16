import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Specify the path to your JSON file
        String jsonFilePath = "C:\\Users\\Jakub\\IdeaProjects\\DiabetesProject\\src\\main\\java\\projectData.json";

        // Create an instance of ReadJSON
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
        }
    }
}
