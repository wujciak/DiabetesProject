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

    /**
     * Get the string representation of the SugarLevelStatus.
     *
     * @return The status as a String.
     */
    public String getStatus() {
        return status;
    }
}
