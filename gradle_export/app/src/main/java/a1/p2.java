package a1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La1/p2;", "Lb3/e1;", "La1/r2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p2 extends b3.e1 {
    public final s2 B;
    public final w2 C;
    public final m3.r0 D;
    public final boolean E;
    public final q0.i1 F;

    public p2(s2 s2Var, w2 w2Var, m3.r0 r0Var, boolean z10, q0.i1 i1Var) {
        this.B = s2Var;
        this.C = w2Var;
        this.D = r0Var;
        this.E = z10;
        this.F = i1Var;
    }

    @Override
    public final b2.q d() {
        return new r2(this.B, this.C, this.D, this.E, this.F);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return this.E == p2Var.E && kotlin.jvm.internal.m.a(this.B, p2Var.B) && kotlin.jvm.internal.m.a(this.C, p2Var.C) && kotlin.jvm.internal.m.a(this.D, p2Var.D) && this.F.equals(p2Var.F);
    }

    @Override
    public final void h(c3.d2 d2Var) {
    }

    public final int hashCode() {
        return this.F.hashCode() + b.g(this.D, (this.C.hashCode() + ((this.B.hashCode() + (Boolean.hashCode(this.E) * 31)) * 31)) * 31, 961);
    }

    @Override
    public final void i(b2.q qVar) {
        r2 r2Var = (r2) qVar;
        s2 s2Var = r2Var.Q;
        s2 s2Var2 = this.B;
        r2Var.Q = s2Var2;
        s2Var2.getClass();
        boolean z10 = this.E;
        r2Var.R = z10;
        boolean z11 = !z10;
        o2 o2Var = s2Var2.f116a;
        o2Var.getClass();
        o2Var.A.setValue(new n2(this.C, this.D, z10, z11, this.F.f12627c == 4));
        if (kotlin.jvm.internal.m.a(s2Var, s2Var2)) {
            return;
        }
        n0.e eVar = r2Var.S;
        n0.c cVar = s2Var2.f122g;
        n0.c cVar2 = eVar.O;
        if (cVar2 != null) {
            cVar2.f10997a.j(eVar);
        }
        if (cVar != null) {
            cVar.f10997a.b(eVar);
        }
        eVar.O = cVar;
    }
}
