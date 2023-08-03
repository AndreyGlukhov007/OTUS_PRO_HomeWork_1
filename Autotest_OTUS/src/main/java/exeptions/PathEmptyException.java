package exeptions;

import annotations.Path;

public class PathEmptyException extends Exception {
    public PathEmptyException() {
        super("Annotation Path not present on page class");
    }
}
