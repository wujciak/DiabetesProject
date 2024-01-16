import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Class ReadJSON is responsible for handling JSON file as a data input.
 */
public class ReadJSON {
    private final String fileName;

    public ReadJSON(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Method readData is responsible for reading data from JSON and creating ArrayList with objects of Diabetic class.
     * @return diabeticList list of objects representing every diabetic in our data
     * @throws DiabetesDataException
     */
    public List<Diabetic> readData() throws DiabetesDataException {
        try {
            String jsonString = new String(Files.readAllBytes(Paths.get(fileName)));
            JSONArray jsonArray = new JSONArray(jsonString);

            List<Diabetic> diabeticList = new ArrayList<>();

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonDiabetic = jsonArray.getJSONObject(i);

                String name = jsonDiabetic.getString("name");
                int sugarLevel = jsonDiabetic.getInt("sugarLevel");

                Diabetic diabetic = new Diabetic(name, sugarLevel);
                diabeticList.add(diabetic);
            }

            return diabeticList;
        } catch (IOException | JSONException e) {
            throw new DiabetesDataException("Error reading JSON data", e);
        }
    }
}
