package c20;

import e30.a0;
import e30.v0;
import java.util.Set;
import kotlin.jvm.internal.m;

public final class a {
    public final v0 a;
    public final b b;
    public final boolean c;
    public final boolean d;
    public final Set e;
    public final a0 f;

    public a(v0 v0Var, b bVar, boolean z, boolean z2, Set set, a0 a0Var) {
        this.a = v0Var;
        this.b = bVar;
        this.c = z;
        this.d = z2;
        this.e = set;
        this.f = a0Var;
    }

    public a(v0 v0Var, boolean z, boolean z2, Set set, int i) {
        this(v0Var, b.A, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, null);
    }

    public static a a(a aVar, b bVar, boolean z, Set set, a0 a0Var, int i) {
        v0 howThisTypeIsUsed = aVar.a;
        if ((i & 2) != 0) {
            bVar = aVar.b;
        }
        b flexibility = bVar;
        if ((i & 4) != 0) {
            z = aVar.c;
        }
        boolean z2 = z;
        boolean z3 = aVar.d;
        if ((i & 16) != 0) {
            set = aVar.e;
        }
        Set set2 = set;
        if ((i & 32) != 0) {
            a0Var = aVar.f;
        }
        aVar.getClass();
        m.e(howThisTypeIsUsed, "howThisTypeIsUsed");
        m.e(flexibility, "flexibility");
        return new a(howThisTypeIsUsed, flexibility, z2, z3, set2, a0Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(aVar.f, this.f) && aVar.a == this.a && aVar.b == this.b && aVar.c == this.c && aVar.d == this.d;
    }

    public final int hashCode() {
        a0 a0Var = this.f;
        int iHashCode = a0Var != null ? a0Var.hashCode() : 0;
        int iHashCode2 = this.a.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.b.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i = (iHashCode3 * 31) + (this.c ? 1 : 0) + iHashCode3;
        return (i * 31) + (this.d ? 1 : 0) + i;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.a + ", flexibility=" + this.b + ", isRaw=" + this.c + ", isForAnnotationParameter=" + this.d + ", visitedTypeParameters=" + this.e + ", defaultType=" + this.f + ')';
    }
}
