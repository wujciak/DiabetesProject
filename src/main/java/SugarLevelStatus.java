/**
 * Enum class representing values of SugarLevelStatus.
 */
public enum SugarLevelStatus {
    TOO_HIGH("Too High"),
    TOO_LOW("Too Low"),
    STABLE("Stable"),
    UNKNOWN("Unknown");

    private final String status;

    SugarLevelStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
