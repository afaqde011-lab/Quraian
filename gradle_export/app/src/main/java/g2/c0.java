package g2;

import b3.n0;

public final class c0 extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final a0 B;
    public final a0 C;
    public final int D;
    public final n0 E;
    public final Object F;

    public c0(a0 a0Var, a0 a0Var2, Object obj, int i10, n0 n0Var, int i11) {
        super(1);
        this.A = i11;
        this.B = a0Var;
        this.C = a0Var2;
        this.F = obj;
        this.D = i10;
        this.E = n0Var;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                z2.j jVar = (z2.j) obj;
                a0 a0Var = this.C;
                if (this.B != ((n) ((c3.z) b3.m.z(a0Var)).getFocusOwner()).g()) {
                    return Boolean.TRUE;
                }
                boolean zB = d.B(a0Var, (a0) this.F, this.D, this.E);
                Boolean boolValueOf = Boolean.valueOf(zB);
                if (zB || !jVar.a()) {
                    return boolValueOf;
                }
                return null;
            default:
                z2.j jVar2 = (z2.j) obj;
                a0 a0Var2 = this.C;
                if (this.B != ((n) ((c3.z) b3.m.z(a0Var2)).getFocusOwner()).g()) {
                    return Boolean.TRUE;
                }
                boolean zA = d.A(this.D, this.E, a0Var2, (h2.c) this.F);
                Boolean boolValueOf2 = Boolean.valueOf(zA);
                if (zA || !jVar2.a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
