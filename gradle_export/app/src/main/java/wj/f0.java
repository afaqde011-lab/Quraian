package wj;

import java.util.Map;

public final class f0 {
    public static final e0 Companion = new e0();

    public static final l40.a[] f16149d = {null, null, new p40.g0(p40.b1.a, w.f16215a)};

    public final j0 f16150a;

    public final a1 f16151b;

    public final Map f16152c;

    public f0(int i10, j0 j0Var, a1 a1Var, Map map) {
        if (1 != (i10 & 1)) {
            p40.o0.g(i10, 1, d0.f16139a.getDescriptor());
            throw null;
        }
        this.f16150a = j0Var;
        if ((i10 & 2) == 0) {
            this.f16151b = null;
        } else {
            this.f16151b = a1Var;
        }
        if ((i10 & 4) == 0) {
            this.f16152c = null;
        } else {
            this.f16152c = map;
        }
    }

    public f0(j0 j0Var, a1 a1Var, Map map) {
        kotlin.jvm.internal.m.e(j0Var, "sessionDetails");
        this.f16150a = j0Var;
        this.f16151b = a1Var;
        this.f16152c = map;
    }

    public static f0 a(f0 f0Var, j0 j0Var, a1 a1Var, Map map, int i10) {
        if ((i10 & 1) != 0) {
            j0Var = f0Var.f16150a;
        }
        if ((i10 & 2) != 0) {
            a1Var = f0Var.f16151b;
        }
        if ((i10 & 4) != 0) {
            map = f0Var.f16152c;
        }
        f0Var.getClass();
        kotlin.jvm.internal.m.e(j0Var, "sessionDetails");
        return new f0(j0Var, a1Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return kotlin.jvm.internal.m.a(this.f16150a, f0Var.f16150a) && kotlin.jvm.internal.m.a(this.f16151b, f0Var.f16151b) && kotlin.jvm.internal.m.a(this.f16152c, f0Var.f16152c);
    }

    public final int hashCode() {
        int iHashCode = this.f16150a.hashCode() * 31;
        a1 a1Var = this.f16151b;
        int iHashCode2 = (iHashCode + (a1Var == null ? 0 : Long.hashCode(a1Var.f16114a))) * 31;
        Map map = this.f16152c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionData(sessionDetails=");
        sb2.append(this.f16150a);
        sb2.append(", backgroundTime=");
        sb2.append(this.f16151b);
        sb2.append(", processDataMap=");
        return w.c.m(sb2, this.f16152c, ')');
    }
}
