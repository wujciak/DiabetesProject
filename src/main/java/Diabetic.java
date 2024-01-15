/**
 * Class representing sugar level of diabetic.
 */
public class Diabetic {
    private String name;
    private int sugarLevel;
    private SugarLevelStatus status;

    public Diabetic(String name, int sugarLevel) {
        this.name = name;
        this.sugarLevel = Math.max(0, sugarLevel);
        this.status = SugarLevelStatus.UNKNOWN;
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

    public void setStatus(SugarLevelStatus status) {
        this.status = status;
    }

    public SugarLevelStatus getStatus() {
        return status;
    }
}
