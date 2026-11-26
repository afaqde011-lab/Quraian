package f20;

import com.google.android.gms.internal.measurement.x5;

public final class i {
    public final h a;
    public final boolean b;

    public i(h hVar) {
        this.a = hVar;
        this.b = false;
    }

    public i(h hVar, boolean z) {
        this.a = hVar;
        this.b = z;
    }

    public static i a(i iVar, h qualifier, boolean z, int i) {
        if ((i & 1) != 0) {
            qualifier = iVar.a;
        }
        if ((i & 2) != 0) {
            z = iVar.b;
        }
        iVar.getClass();
        kotlin.jvm.internal.m.e(qualifier, "qualifier");
        return new i(qualifier, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && this.b == iVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb.append(this.a);
        sb.append(", isForWarningOnly=");
        return x5.o(sb, this.b, ')');
    }
}
