// Name: Makayla Mai
// Date: 3/5/2026
// CSE 122
// P3: Program Linting
// TA: Dalton Brockett
// This class represents a linter that runs a set of checks on a given source
// file line by line and collects all errors found

import java.util.*;
import java.io.*;

public class Linter {
    private List<Check> checks;

    // Behavior: 
    // - Constructs a Linter with the given list of checks to run
    // Parameters:
    // - checks: the list of Check objects to apply during linting
    public Linter(List<Check> checks) {
        this.checks = checks;
    }

    // Behavior: 
    // - reads the given file line by line and runs all checks on each line and
    // collects and returns all non-null errors found
    // Parameters:
    // - fileName: the name of the file to lint
    // Returns:
    // - list of all Errors found in the file
    public List<Error> lint(String fileName) throws FileNotFoundException {
        List<Error> errors = new ArrayList<>();
        Scanner scan = new Scanner(new File(fileName));
        int lineNumber = 1;

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            for (Check check : checks) {
                Error e = check.lint(line, lineNumber);
                if (e != null) {
                    errors.add(e);
                }
            }
            lineNumber++;
        }
        return errors;
    }
}                   
