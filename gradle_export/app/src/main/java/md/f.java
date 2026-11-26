package md;

import com.google.android.gms.cast.MediaError;

public final class f {
    SUCCESS(new z00.e(MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN, 299, 1)),
    BAD_REQUEST(MediaError.DetailedErrorCode.MANIFEST_UNKNOWN),
    TIMEOUT(408),
    PAYLOAD_TOO_LARGE(413),
    TOO_MANY_REQUESTS(429),
    FAILED(new z00.e(MediaError.DetailedErrorCode.SEGMENT_UNKNOWN, 599, 1));

    public final z00.e A;

    static {
        f50.c.v(fVarArr);
    }

    public f(int i10) {
        this(new z00.e(i10, i10, 1));
    }

    public f(z00.e eVar) {
        super(str, i);
        this.A = eVar;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) H.clone();
    }
}
