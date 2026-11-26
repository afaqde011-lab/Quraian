package j7;

import android.media.metrics.LogSessionId;
import com.google.protobuf.RuntimeVersion;

public final class j {

    public static final j f8248c;

    public final String f8249a;

    public final hf.c f8250b;

    static {
        new j(RuntimeVersion.SUFFIX);
        f8248c = new j("preload");
    }

    public j(String str) {
        this.f8249a = str;
        hf.c cVar = new hf.c(6, false);
        cVar.B = LogSessionId.LOG_SESSION_ID_NONE;
        this.f8250b = cVar;
    }

    public final synchronized LogSessionId a() {
        hf.c cVar;
        cVar = this.f8250b;
        cVar.getClass();
        return (LogSessionId) cVar.B;
    }
}
