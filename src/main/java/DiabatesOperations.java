import java.util.ArrayList;
import java.util.List;

public class DiabatesOperations {
    private List<Diabetic> diabeticList;

    public DiabatesOperations() {
        this.diabeticList = new ArrayList<>();
    }

    public void dodajCukrzyka(Diabetic diabetic) {
        this.diabeticList.add(diabetic);
    }

    // Inne operacje na liście cukrzyków
}
