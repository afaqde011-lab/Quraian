package f20;

import com.google.android.gms.internal.measurement.x5;

public final class e {
    public static final e e = new e(null, false);
    public final h a;
    public final f b;
    public final boolean c;
    public final boolean d;

    public e(h hVar, f fVar, boolean z, boolean z2) {
        this.a = hVar;
        this.b = fVar;
        this.c = z;
        this.d = z2;
    }

    public e(h hVar, boolean z) {
        this(hVar, null, z, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d;
    }

    public final int hashCode() {
        h hVar = this.a;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        f fVar = this.b;
        return Boolean.hashCode(this.d) + w.c.e((iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaTypeQualifiers(nullability=");
        sb.append(this.a);
        sb.append(", mutability=");
        sb.append(this.b);
        sb.append(", definitelyNotNull=");
        sb.append(this.c);
        sb.append(", isNullabilityQualifierForWarning=");
        return x5.o(sb, this.d, ')');
    }
}
