package q7;

import a10.h0;
import androidx.media3.common.t;
import o8.i;
import q8.c;

public final class a {

    public static final a f12773a = new a();

    public final h0 a(t tVar) {
        String str = tVar.f1594n;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new k8.b(0);
                case "application/x-icy":
                    return new n8.a();
                case "application/id3":
                    return new i(null);
                case "application/x-emsg":
                    return new k8.b(1);
                case "application/x-scte35":
                    return new c();
            }
        }
        throw new IllegalArgumentException(a1.b.o("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(t tVar) {
        String str = tVar.f1594n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
