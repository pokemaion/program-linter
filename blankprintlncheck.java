// Name: Makayla Mai
// Date: 3/5/2026
// CSE 122
// P3: Program Linting
// TA: Dalton Brockett
// This class implements the Check interface and checks for blank println
// statements (System.out.println("")) in a given line of source code

import java.util.*;

public class BlankPrintlnCheck implements Check {

    // Behavior: 
    // - Checks if the given line contains a blank println statement and
    // returns an error if System.out.println("") is found, otherwise null
    // Parameters:
    // - line: the line of code to check
    // - lineNumber - the line number of the given line
    // Return:
    // - an Error with code 3 if the pattern is found, null otherwise
    public Error lint(String line, int lineNumber) {
        if (line.contains("System.out.println(\"\")")) {
            return new Error(3, lineNumber, "you have an error");
        }
        return null;
    } 
}
