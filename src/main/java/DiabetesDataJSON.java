public class DiabetesDataJSON implements DiabetesData {
    private String fileName;

    public DiabetesDataJSON(String fileName) {
        this.fileName = fileName;
    }

    public void saveData(Diabetic diabetic) {
        // Implementacja zapisu danych cukrzycy do pliku JSON
    }

    public Diabetic readData() {
        // Implementacja odczytu danych cukrzycy z pliku JSON
        return null;
    }
}

