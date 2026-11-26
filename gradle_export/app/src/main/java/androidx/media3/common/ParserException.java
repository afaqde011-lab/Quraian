package androidx.media3.common;

import com.google.protobuf.RuntimeVersion;
import java.io.IOException;

public class ParserException extends IOException {
    public final boolean A;
    public final int B;

    public ParserException(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.A = z10;
        this.B = i10;
    }

    public static ParserException a(RuntimeException runtimeException, String str) {
        return new ParserException(str, runtimeException, true, 1);
    }

    public static ParserException b(String str, Exception exc) {
        return new ParserException(str, exc, true, 4);
    }

    public static ParserException c(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(message != null ? message.concat(" ") : RuntimeVersion.SUFFIX);
        sb2.append("{contentIsMalformed=");
        sb2.append(this.A);
        sb2.append(", dataType=");
        return g4.c.g(this.B, "}", sb2);
    }
}
