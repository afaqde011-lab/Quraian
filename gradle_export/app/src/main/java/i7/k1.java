package i7;

import java.util.Objects;

public final class k1 {

    public static final k1 f7386b;

    public final fh.e1 f7387a;

    static {
        gi.c cVar = new gi.c(6, false);
        cVar.B = fh.e1.m(2, 1, 5);
        f7386b = new k1(cVar);
    }

    public k1(gi.c cVar) {
        this.f7387a = (fh.e1) cVar.B;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k1) && this.f7387a.equals(((k1) obj).f7387a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f7387a, null, null, bool, bool, bool, bool, bool);
    }
}
