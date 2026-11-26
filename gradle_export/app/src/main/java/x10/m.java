package x10;

import com.google.android.gms.internal.measurement.x5;
import java.util.Collection;

public final class m {
    public final f20.i a;
    public final Collection b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public m(f20.i iVar, Collection collection, int i) {
        this(iVar, collection, iVar.a == f20.h.C, (i & 8) == 0, (i & 16) == 0);
    }

    public m(f20.i iVar, Collection qualifierApplicabilityTypes, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.m.e(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.a = iVar;
        this.b = qualifierApplicabilityTypes;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.m.a(this.a, mVar.a) && kotlin.jvm.internal.m.a(this.b, mVar.b) && this.c == mVar.c && this.d == mVar.d && this.e == mVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + w.c.e(w.c.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.a);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.b);
        sb.append(", definitelyNotNull=");
        sb.append(this.c);
        sb.append(", preferQualifierOverBound=");
        sb.append(this.d);
        sb.append(", preferQualifierOverSupertype=");
        return x5.o(sb, this.e, ')');
    }
}
