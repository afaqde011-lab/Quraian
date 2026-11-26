package androidx.constraintlayout.core.parser;

public class CLParsingException extends Exception {
    @Override
    public final String toString() {
        return "CLParsingException (" + hashCode() + ") : null (null at line 0)";
    }
}
