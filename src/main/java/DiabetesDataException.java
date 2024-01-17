/**
 * Custom exception class for handling diabetes data errors.
 */
public class DiabetesDataException extends Exception {
    /**
     * Constructor for DiabetesDataException class.
     *
     * @param message The error message.
     */
    public DiabetesDataException(String message) {
        super(message);
    }

    /**
     * Get a string representation of the exception.
     *
     * @return The exception string.
     */
    @Override
    public String toString() {
        return "Diabetes data exception";
    }
}
