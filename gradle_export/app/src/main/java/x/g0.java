package x;

public final class g0 {

    public final m1.e f16278a = new m1.e(0, new e0[16]);

    public final l1.i1 f16279b = l1.q.z(Boolean.FALSE);

    public long f16280c = Long.MIN_VALUE;

    public final l1.i1 f16281d = l1.q.z(Boolean.TRUE);

    public final void a(l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-318043801);
        int i11 = (g0Var.i(this) ? 4 : 2) | i10;
        if (g0Var.S(i11 & 1, (i11 & 3) != 2)) {
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (objN == cVar) {
                objN = l1.q.z(null);
                g0Var.n0(objN);
            }
            l1.z0 z0Var = (l1.z0) objN;
            if (((Boolean) this.f16281d.getValue()).booleanValue() || ((Boolean) this.f16279b.getValue()).booleanValue()) {
                g0Var.c0(-144841960);
                boolean zI = g0Var.i(this);
                Object objN2 = g0Var.N();
                if (zI || objN2 == cVar) {
                    objN2 = new l6.v(z0Var, this, null);
                    g0Var.n0(objN2);
                }
                l1.q.i(this, g0Var, (u00.n) objN2);
                g0Var.r(false);
            } else {
                g0Var.c0(-143455237);
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new m3.a(this, i10, 22);
        }
    }
}
