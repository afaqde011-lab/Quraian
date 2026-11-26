package q0;

public final class i1 {

    public static final i1 f12624g;

    public final int f12625a;

    public final Boolean f12626b;

    public final int f12627c;

    public final int f12628d;

    public final Boolean f12629e;

    public final t3.b f12630f;

    static {
        int i10 = 0;
        f12624g = new i1(i10, i10, i10, 127);
    }

    public i1(int i10, int i11, int i12, int i13) {
        this((i13 & 1) != 0 ? -1 : i10, (i13 & 2) != 0 ? null : Boolean.FALSE, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? -1 : i12, null, null);
    }

    public i1(int i10, Boolean bool, int i11, int i12, Boolean bool2, t3.b bVar) {
        this.f12625a = i10;
        this.f12626b = bool;
        this.f12627c = i11;
        this.f12628d = i12;
        this.f12629e = bool2;
        this.f12630f = bVar;
    }

    public final int a() {
        int i10 = this.f12628d;
        r3.i iVar = new r3.i(i10);
        if (i10 == -1) {
            iVar = null;
        }
        if (iVar != null) {
            return iVar.f13071a;
        }
        return 1;
    }

    public final boolean b() {
        return this.f12625a == -1 && this.f12626b == null && this.f12627c == 0 && this.f12628d == -1 && this.f12629e == null && this.f12630f == null;
    }

    public final r3.j c(boolean z10) {
        int i10 = this.f12625a;
        r3.k kVar = new r3.k(i10);
        if (i10 == -1) {
            kVar = null;
        }
        int i11 = kVar != null ? kVar.f13079a : 0;
        Boolean bool = this.f12626b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i12 = this.f12627c;
        r3.l lVar = i12 != 0 ? new r3.l(i12) : null;
        int i13 = lVar != null ? lVar.f13080a : 1;
        int iA = a();
        t3.b bVar = this.f12630f;
        if (bVar == null) {
            bVar = t3.b.C;
        }
        return new r3.j(z10, i11, zBooleanValue, i13, iA, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return this.f12625a == i1Var.f12625a && kotlin.jvm.internal.m.a(this.f12626b, i1Var.f12626b) && this.f12627c == i1Var.f12627c && this.f12628d == i1Var.f12628d && kotlin.jvm.internal.m.a(this.f12629e, i1Var.f12629e) && kotlin.jvm.internal.m.a(this.f12630f, i1Var.f12630f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f12625a) * 31;
        Boolean bool = this.f12626b;
        int iD = w.c.d(this.f12628d, w.c.d(this.f12627c, (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 961);
        Boolean bool2 = this.f12629e;
        int iHashCode2 = (iD + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        t3.b bVar = this.f12630f;
        return iHashCode2 + (bVar != null ? bVar.A.hashCode() : 0);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) r3.k.a(this.f12625a)) + ", autoCorrectEnabled=" + this.f12626b + ", keyboardType=" + ((Object) r3.l.a(this.f12627c)) + ", imeAction=" + ((Object) r3.i.a(this.f12628d)) + ", platformImeOptions=nullshowKeyboardOnFocus=" + this.f12629e + ", hintLocales=" + this.f12630f + ')';
    }
}
