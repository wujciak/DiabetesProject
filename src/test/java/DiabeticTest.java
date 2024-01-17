import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiabeticTest {

    @Test
    void testDiabeticConstructor() throws DiabetesDataException {
        Diabetic diabetic = new Diabetic("Jan Janowski", 160);
        assertEquals("Jan Janowski", diabetic.getName());
        assertEquals(160, diabetic.getSugarLevel());
        assertEquals(SugarLevelStatus.UNKNOWN, diabetic.getStatus());
    }

    @Test
    void testDiabeticConstructorNegativeSugarLevel() {
        assertThrows(DiabetesDataException.class, () -> new Diabetic("Jan Janowski", -40));
    }

    @Test
    void testDiabeticConstructorZeroSugarLevel() {
        assertThrows(DiabetesDataException.class, () -> new Diabetic("Jan Janowski", 0));
    }

}
