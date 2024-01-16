import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Class responsible for operations on diabeticList  and diabetics.
 */
public class DiabetesOperations {

    public static void updateSugarLevelStatus(@NotNull Diabetic diabetic) {
        int sugarLevel = diabetic.getSugarLevel();
        if (sugarLevel > 400) {
            diabetic.setStatus(SugarLevelStatus.TOO_HIGH);
        } else if (sugarLevel < 40) {
            diabetic.setStatus(SugarLevelStatus.TOO_LOW);
        } else {
            diabetic.setStatus(SugarLevelStatus.STABLE);
        }
    }


    public static void showAllDiabetics(@NotNull List<Diabetic> diabeticList) {
        System.out.println("Details of all diabetics:");

        diabeticList.forEach(diabetic -> {
            updateSugarLevelStatus(diabetic);
            System.out.println(diabetic.getName() + " - Sugar Level: " + diabetic.getSugarLevel()
                    + ", Status: " + diabetic.getStatus().getStatus());
        });
    }

    public static void showHighSugarLevelNames(@NotNull List<Diabetic> diabeticList) {
        System.out.println("Names of people with high sugar level:");

        diabeticList.stream()
                .filter(diabetic -> diabetic.getSugarLevel() > 400)
                .map(Diabetic::getName)
                .forEach(System.out::println);
    }

    public static void showLowSugarLevelNames(@NotNull List<Diabetic> diabeticList) {
        System.out.println("Names of people with too low sugar level:");

        diabeticList.stream()
                .filter(diabetic -> diabetic.getSugarLevel() < 40)
                .map(Diabetic::getName)
                .forEach(System.out::println);
    }

}
