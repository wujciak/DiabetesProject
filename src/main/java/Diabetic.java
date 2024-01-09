import org.json.JSONObject;

/**
 * Class representing sugar level of diabetic.
 */
public class Diabetic {
    private String name;
    private int sugarLevel;

    public Diabetic(String name, int sugarLevel) {
        this.name = name;
        this.sugarLevel = sugarLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSugarLevel(int sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    public int getSugarLevel() {
        return sugarLevel;
    }

    public JSONObject toJSON() {
        JSONObject jsonDiabetic = new JSONObject();
        jsonDiabetic.put("name", this.name);
        jsonDiabetic.put("sugarLevel", this.sugarLevel);
        return jsonDiabetic;
    }

    public void fromJSON(JSONObject jsonDiabetic) {
        this.name = jsonDiabetic.getString("name");
        this.sugarLevel = jsonDiabetic.getInt("sugarLevel");
    }
}
