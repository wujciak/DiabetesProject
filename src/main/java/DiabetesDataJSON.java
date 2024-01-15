import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DiabetesDataJSON implements DiabetesData {
    private final String fileName;

    public DiabetesDataJSON(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(List<Diabetic> diabetics) throws DiabetesDataException {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            JSONArray jsonArray = new JSONArray();
            for (Diabetic diabetic : diabetics) {
                JSONObject jsonDiabetic = new JSONObject();
                jsonDiabetic.put("name", diabetic.getName());
                jsonDiabetic.put("sugarLevel", diabetic.getSugarLevel());
                jsonDiabetic.put("status", diabetic.getStatus());
                jsonArray.put(jsonDiabetic);
            }
            fileWriter.write(jsonArray.toString());
        } catch (IOException | JSONException e) {
            throw new DiabetesDataException("Error writing data to file", e);
        }
    }

    @Override
    public List<Diabetic> readData() throws DiabetesDataException {
        List<Diabetic> diabeticList = new ArrayList<>();
        try {
            String jsonData = new String(Files.readAllBytes(Paths.get(fileName)));
            JSONArray jsonDiabetics = new JSONArray(jsonData);

            for (int i = 0; i < jsonDiabetics.length(); i++) {
                JSONObject jsonDiabetic = jsonDiabetics.getJSONObject(i);
                Diabetic diabetic = new Diabetic(
                        jsonDiabetic.getString("name"),
                        jsonDiabetic.getInt("sugarLevel")
                );
                diabeticList.add(diabetic);
            }
        } catch (IOException | JSONException e) {
            throw new DiabetesDataException("Error reading data from JSON", e);
        }
        return diabeticList;
    }
}
