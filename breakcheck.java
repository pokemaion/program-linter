// Name: Makayla Mai
// Date: 3/5/2026
// CSE 122
// P3: Program Linting
// TA: Dalton Brockett
// This class implements the Check interface and checks for the break keyword
// outside of single line comments (//) in a given line of source code

import java.util.*;

// Behavior: 
// - Checks if the given line contains the break keyword outside of a
// single line comment (//). Returns an error if found, otherwise null
// Parameters:
// - line: the line of code to check
// - lineNumber - the line number of the given line
// Returns:
// - an Error with code 2 if break is found outside a comment, null otherwise
public class BreakCheck implements Check {
    public Error lint(String line, int lineNumber) {
        int breakIndex = line.indexOf("break");
        int commentIndex = line.indexOf("//");

        if (breakIndex != -1) {
            if (commentIndex == -1 || commentIndex > breakIndex) {
                return new Error(2, lineNumber, "you have an error");
            }
        }
        return null;
    } 
}
