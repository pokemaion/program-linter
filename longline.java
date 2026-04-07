// Name: Makayla Mai
// Date: 3/12/2026
// CSE 122
// P3: Program Linting
// TA: Dalton Brockett
// This class implements the Check interface and checks whether a given line of source code
// exceeds the maximum alowed line length of 100 characters

import java.util.*;

    // Behavior: 
    // - Checks if the given line exceeds 100 characters in length and returns
    // an error if the line is too long, otherwise null
    // Parameters:
    // - line: the line of code to check
    // - lineNumber: the line number of the given line
    // Returns:
    // - an Error with code 1 if the line exceeds 100 characters, null otherwise
public class LongLineCheck implements Check {
    public Error lint(String line, int lineNumber) {
        if (line.length() > 100) {
            return new Error(1, lineNumber, "you have an error");
        }
        return null;
    }
}
