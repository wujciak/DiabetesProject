import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiabetesOperationsTest {

    @Test
    void testUpdateSugarLevelStatusTooHigh() throws DiabetesDataException {
        Diabetic diabetic = new Diabetic("Anna Annowska", 410);
        DiabetesOperations.updateSugarLevelStatus(diabetic);
        assertEquals(SugarLevelStatus.TOO_HIGH, diabetic.getStatus());
    }

    @Test
    void testUpdateSugarLevelStatusTooLow() throws DiabetesDataException {
        Diabetic diabetic = new Diabetic("Jan Janowski", 20);
        DiabetesOperations.updateSugarLevelStatus(diabetic);
        assertEquals(SugarLevelStatus.TOO_LOW, diabetic.getStatus());
    }

    @Test
    void testUpdateSugarLevelStatusStable() throws DiabetesDataException {
        Diabetic diabetic = new Diabetic("Kamil Kamilowski", 125);
        DiabetesOperations.updateSugarLevelStatus(diabetic);
        assertEquals(SugarLevelStatus.STABLE, diabetic.getStatus());
    }

}
