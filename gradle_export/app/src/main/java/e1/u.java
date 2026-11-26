package e1;

import com.google.android.gms.internal.measurement.x5;

public final class u {

    public final t f5004a;

    public final t f5005b;

    public final boolean f5006c;

    public u(t tVar, t tVar2, boolean z10) {
        this.f5004a = tVar;
        this.f5005b = tVar2;
        this.f5006c = z10;
    }

    public static u a(u uVar, t tVar, t tVar2, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            tVar = uVar.f5004a;
        }
        if ((i10 & 2) != 0) {
            tVar2 = uVar.f5005b;
        }
        uVar.getClass();
        return new u(tVar, tVar2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.m.a(this.f5004a, uVar.f5004a) && kotlin.jvm.internal.m.a(this.f5005b, uVar.f5005b) && this.f5006c == uVar.f5006c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5006c) + ((this.f5005b.hashCode() + (this.f5004a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Selection(start=");
        sb2.append(this.f5004a);
        sb2.append(", end=");
        sb2.append(this.f5005b);
        sb2.append(", handlesCrossed=");
        return x5.o(sb2, this.f5006c, ')');
    }
}
