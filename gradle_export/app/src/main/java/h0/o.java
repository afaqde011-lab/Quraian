package h0;

public abstract class o {

    public static final u.i0 f6447a = c(true);

    public static final u.i0 f6448b = c(false);

    public static final n f6449c;

    static {
        new q(b2.b.A, false);
        f6449c = n.f6444b;
    }

    public static final void a(b2.r rVar, l1.j jVar, int i10) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-211209833);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (g0Var.S(i11 & 1, (i11 & 3) != 2)) {
            int iHashCode = Long.hashCode(g0Var.T);
            b2.r rVarC = b2.a.c(rVar, g0Var);
            l1.m1 m1VarM = g0Var.m();
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(f6449c, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new bs.h(rVar, i10, 5);
        }
    }

    public static final void b(z2.k1 k1Var, z2.l1 l1Var, z2.v0 v0Var, y3.m mVar, int i10, int i11, b2.d dVar) {
        b2.d dVar2;
        Object objU = v0Var.U();
        m mVar2 = objU instanceof m ? (m) objU : null;
        z2.k1.j(k1Var, l1Var, ((mVar2 == null || (dVar2 = mVar2.O) == null) ? dVar : dVar2).a((((long) l1Var.A) << 32) | (((long) l1Var.B) & 4294967295L), (((long) i10) << 32) | (((long) i11) & 4294967295L), mVar));
    }

    public static final u.i0 c(boolean z10) {
        u.i0 i0Var = new u.i0(9);
        b2.i iVar = b2.b.A;
        i0Var.m(iVar, new q(iVar, z10));
        b2.i iVar2 = b2.b.B;
        i0Var.m(iVar2, new q(iVar2, z10));
        b2.i iVar3 = b2.b.C;
        i0Var.m(iVar3, new q(iVar3, z10));
        b2.i iVar4 = b2.b.D;
        i0Var.m(iVar4, new q(iVar4, z10));
        b2.i iVar5 = b2.b.E;
        i0Var.m(iVar5, new q(iVar5, z10));
        b2.i iVar6 = b2.b.F;
        i0Var.m(iVar6, new q(iVar6, z10));
        b2.i iVar7 = b2.b.G;
        i0Var.m(iVar7, new q(iVar7, z10));
        b2.i iVar8 = b2.b.H;
        i0Var.m(iVar8, new q(iVar8, z10));
        b2.i iVar9 = b2.b.I;
        i0Var.m(iVar9, new q(iVar9, z10));
        return i0Var;
    }

    public static final z2.w0 d(b2.d dVar, boolean z10) {
        z2.w0 w0Var = (z2.w0) (z10 ? f6447a : f6448b).g(dVar);
        return w0Var == null ? new q(dVar, z10) : w0Var;
    }
}
