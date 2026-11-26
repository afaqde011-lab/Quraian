package androidx.media3.common;

import java.util.Objects;

public final class b {

    public static final String f1091d;

    public static final String f1092e;

    public static final String f1093f;

    public final long f1094a;

    public final long f1095b;

    public final String f1096c;

    static {
        String str = e7.i0.f5136a;
        f1091d = Integer.toString(0, 36);
        f1092e = Integer.toString(1, 36);
        f1093f = Integer.toString(2, 36);
    }

    public b(long j9, long j10, String str) {
        ta.c0.s((j9 == -9223372036854775807L && j10 == -9223372036854775807L && str == null) ? false : true);
        this.f1094a = j9 == -9223372036854775807L ? 0L : j9;
        this.f1095b = j10;
        this.f1096c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f1094a == bVar.f1094a && this.f1095b == bVar.f1095b && Objects.equals(this.f1096c, bVar.f1096c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f1094a), Long.valueOf(this.f1095b), this.f1096c);
    }
}
