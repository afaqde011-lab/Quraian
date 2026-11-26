package androidx.media3.exoplayer.source;

import androidx.media3.common.ParserException;
import fh.d2;
import fh.t0;

public class UnrecognizedInputFormatException extends ParserException {
    public final t0 C;

    public UnrecognizedInputFormatException(String str, d2 d2Var) {
        super(str, null, false, 1);
        this.C = t0.o(d2Var);
    }

    @Override
    public final String getMessage() {
        String message = super.getMessage();
        t0 t0Var = this.C;
        if (t0Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + t0Var;
    }
}
