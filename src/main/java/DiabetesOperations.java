import java.util.List;

public class DiabetesOperations {
    private DiabetesDataJSON diabetesDataJSON;

    public DiabetesOperations(DiabetesDataJSON diabetesDataJSON) {
        this.diabetesDataJSON = diabetesDataJSON;
    }

    public static void updateSugarLevelStatus(Diabetic diabetic) {
        int sugarLevel = diabetic.getSugarLevel();
        if (sugarLevel > 400) {
            diabetic.setStatus(SugarLevelStatus.TOO_HIGH);
        } else if (sugarLevel < 40) {
            diabetic.setStatus(SugarLevelStatus.TOO_LOW);
        } else {
            diabetic.setStatus(SugarLevelStatus.STABLE);
        }
    }


    public static void showAllDiabetics(List<Diabetic> diabeticList) {
        System.out.println("Details of all diabetics:");

        diabeticList.forEach(diabetic -> {
            updateSugarLevelStatus(diabetic);
            System.out.println(diabetic.getName() + " - Sugar Level: " + diabetic.getSugarLevel()
                    + ", Status: " + diabetic.getStatus().getStatus());
        });
    }

    public static void showHighSugarLevelNames(List<Diabetic> diabeticList) {
        System.out.println("Names of people with high sugar level:");

        diabeticList.stream()
                .filter(diabetic -> diabetic.getSugarLevel() > 400)
                .map(Diabetic::getName)
                .forEach(System.out::println);
    }

    public static void showLowSugarLevelNames(List<Diabetic> diabeticList) {
        System.out.println("Names of people with too low sugar level:");

        diabeticList.stream()
                .filter(diabetic -> diabetic.getSugarLevel() < 40)
                .map(Diabetic::getName)
                .forEach(System.out::println);
    }

    public static void saveData(List<Diabetic> diabeticList, DiabetesDataJSON diabetesDataJSON) throws DiabetesDataException {
        if (diabetesDataJSON != null) {
            diabetesDataJSON.writeData(diabeticList);
            System.out.println("Data saved to file.");
        } else {
            System.err.println("DiabetesDataJSON is null. Unable to save data.");
        }
    }
}
