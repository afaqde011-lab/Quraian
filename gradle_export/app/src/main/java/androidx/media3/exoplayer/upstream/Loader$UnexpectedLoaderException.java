package androidx.media3.exoplayer.upstream;

import com.google.protobuf.RuntimeVersion;
import java.io.IOException;

public final class Loader$UnexpectedLoaderException extends IOException {
    public Loader$UnexpectedLoaderException(Throwable th2) {
        String str;
        StringBuilder sb2 = new StringBuilder("Unexpected ");
        sb2.append(th2.getClass().getSimpleName());
        if (th2.getMessage() != null) {
            str = ": " + th2.getMessage();
        } else {
            str = RuntimeVersion.SUFFIX;
        }
        sb2.append(str);
        super(sb2.toString(), th2);
    }
}
