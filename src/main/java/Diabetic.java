/**
 * Class representing sugar level of diabetic.
 */
public class Diabetic {
    private String name;
    private int sugarLevel;
    private SugarLevelStatus status;

    /**
     * Constructor for Diabetic class.
     *
     * @param name The name of the diabetic.
     * @param sugarLevel The sugar level of the diabetic.
     * @throws DiabetesDataException If sugarLevel is negative.
     */
    public Diabetic(String name, int sugarLevel) throws DiabetesDataException {
        if (sugarLevel <= 0) {
            throw new DiabetesDataException("Sugar level must be positive number!");
        }
        this.name = name;
        this.sugarLevel = sugarLevel;
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
