package p8;

import e7.i0;
import java.util.Locale;
import java.util.Objects;
import ta.c0;

public final class a {

    public final long f12446a;

    public final long f12447b;

    public final int f12448c;

    public a(int i10, long j9, long j10) {
        c0.s(j9 < j10);
        this.f12446a = j9;
        this.f12447b = j10;
        this.f12448c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f12446a == aVar.f12446a && this.f12447b == aVar.f12447b && this.f12448c == aVar.f12448c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12446a), Long.valueOf(this.f12447b), Integer.valueOf(this.f12448c));
    }

    public final String toString() {
        String str = i0.f5136a;
        Locale locale = Locale.US;
        StringBuilder sbN = w.c.n("Segment: startTimeMs=", this.f12446a, ", endTimeMs=");
        sbN.append(this.f12447b);
        sbN.append(", speedDivisor=");
        sbN.append(this.f12448c);
        return sbN.toString();
    }
}
