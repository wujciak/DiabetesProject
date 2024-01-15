import java.util.List;

/**
 * Interface with methods of writing and reading data.
 */
public interface DiabetesData {
    List<Diabetic> readData() throws DiabetesDataException;
    void writeData(List<Diabetic> diabeticList) throws DiabetesDataException;
}
