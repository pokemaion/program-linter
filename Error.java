// Name: Makayla Mai
// Date: 3/5/2026
// CSE 122
// P3: Program Linting
// TA: Dalton Brockett
// This class represents a linting error found in a source file. It stores
// the error code, line number, and message associated with the error

// This class represents a linting error found in a source file. It stores
// the error code, line number, and message associated with the error
public class Error {
    private int code;
    private int lineNumber;
    private String message;

    // Behavior: 
    // - Constructs an Error with the given error code, line number, and message
    // Parameters:
    // - code: the error code
    // - lineNumber: the line the error occurred on
    // - message: description of the error
    public Error(int code, int lineNumber, String message) {
        this.code = code;
        this.lineNumber = lineNumber;
        this.message = message;
    }
    
    // Behavior: 
    // - Returns a String representation of this error formatted as:
    // For example: "(Line: 122) has error code 5: Some message"
    // - String representation of this error
    public String toString() {
        return "(Line: " + lineNumber + ") has error code " + code + ": " + message; 
    }

    // Behavior: 
    // - returns the line number on which this error occurred
    // Return:
    // - int representing the line number
    public int getLineNumber() {
        return lineNumber;
    }
    
    // Behavior: 
    // - Returns the error code of this error
    // Returns:
    // - int representing the error code
    public int getCode() {
        return code;
    }

    // Behavior: 
    // - returns the message describing this error
    // Returns:
    // - String representing the error message
    public String getMessage() {
        return message;
    }
}
