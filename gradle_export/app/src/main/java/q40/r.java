package q40;

public final class r extends b0 {
    public final boolean A;
    public final n40.e B;
    public final String C;

    public r(Object body, boolean z, n40.e eVar) {
        kotlin.jvm.internal.m.e(body, "body");
        this.A = z;
        this.B = eVar;
        this.C = body.toString();
        if (eVar != null && !eVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override
    public final String a() {
        return this.C;
    }

    @Override
    public final boolean c() {
        return this.A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.A == rVar.A && kotlin.jvm.internal.m.a(this.C, rVar.C);
    }

    public final int hashCode() {
        return this.C.hashCode() + (Boolean.hashCode(this.A) * 31);
    }

    @Override
    public final String toString() {
        boolean z = this.A;
        String str = this.C;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        r40.w.a(str, sb);
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
