package yu;

import kotlin.NoWhenBranchMatchedException;
import tf.x;

public final class f {
    HALF(0.5f),
    POINT_EIGHT(0.8f),
    NORMAL(1.0f),
    ONE_AND_HALF(1.5f),
    ONE_POINT_EIGHT(1.8f),
    DOUBLE(2.0f);

    public static final x B = new x(23);
    public static final n00.b D = f50.c.v(new f[]{new f(0.5f), new f(0.8f), new f(1.0f), new f(1.5f), new f(1.8f), new f(2.0f)});
    public final float A;

    static {
    }

    public f(float f) {
        super(str, i);
        this.A = f;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) C.clone();
    }

    public final String a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "0.5×";
        }
        if (iOrdinal == 1) {
            return "0.8×";
        }
        if (iOrdinal == 2) {
            return "1×";
        }
        if (iOrdinal == 3) {
            return "1.5×";
        }
        if (iOrdinal == 4) {
            return "1.8×";
        }
        if (iOrdinal == 5) {
            return "2×";
        }
        throw new NoWhenBranchMatchedException();
    }
}
