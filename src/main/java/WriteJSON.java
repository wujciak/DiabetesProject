import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Class responsible for writing output data to a new file.
 */
public class WriteJSON {
    private final String fileName;

    public WriteJSON(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Class responsible for writing data into JSON file with updated status of sugar level.
     *
     * @param diabeticList List of diabetics as objects.
     * @param newFileName Path of the file which will save output data.
     * @throws DiabetesDataException If there is an error writing the JSON data.
     */
    public void writeData(@NotNull List<Diabetic> diabeticList, String newFileName) throws DiabetesDataException {
        try {
            JSONArray jsonArray = new JSONArray();

            for (Diabetic diabetic : diabeticList) {
                JSONObject jsonDiabetic = new JSONObject();
                jsonDiabetic.put("name", diabetic.getName());
                jsonDiabetic.put("sugarLevel", diabetic.getSugarLevel());
                jsonDiabetic.put("status", diabetic.getStatus().getStatus());

                jsonArray.put(jsonDiabetic);
            }

            try (FileWriter fileWriter = new FileWriter(newFileName)) {
                fileWriter.write(jsonArray.toString());
            } catch (IOException e) {
                throw new DiabetesDataException("Error writing JSON data");
            }
        } catch (JSONException e) {
            throw new DiabetesDataException("Error creating JSON object");
        }
    }

    public String getFileName() {
        return fileName;
    }
}
