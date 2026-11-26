package gv;

import com.google.android.gms.internal.measurement.g4;

public final class g1 implements u00.o {
    public final int A = 0;
    public final int B;
    public final int C;
    public final u00.k D;
    public final long E;
    public final kk.c F;

    public g1(int i, int i2, kk.c cVar, u00.k kVar, long j) {
        this.B = i;
        this.C = i2;
        this.F = cVar;
        this.D = kVar;
        this.E = j;
    }

    public g1(int i, int i2, u00.k kVar, long j, kk.c cVar) {
        this.B = i;
        this.C = i2;
        this.D = kVar;
        this.E = j;
        this.F = cVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w.d0 PlayerScreenAnimatedVisibility = (w.d0) obj;
        switch (this.A) {
            case 0:
                l1.g0 g0Var = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(PlayerScreenAnimatedVisibility, "$this$PlayerScreenAnimatedVisibility");
                h0.a0 a0Var = h0.z1.c;
                z2.w0 w0VarD = h0.o.d(b2.b.B, false);
                l1.g0 g0Var2 = g0Var;
                int iHashCode = Long.hashCode(g0Var2.T);
                l1.m1 m1VarM = g0Var2.m();
                b2.r rVarC = b2.a.c(a0Var, g0Var);
                b3.i.c.getClass();
                b3.g gVar = b3.h.b;
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                l1.q.I(w0VarD, g0Var, b3.h.f);
                l1.q.I(m1VarM, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC, g0Var, b3.h.d);
                b2.r rVarD = h0.z1.d(b2.o.A, 1.0f);
                b1.i iVar = h0.i.e;
                u00.k kVar = this.D;
                boolean zG = g0Var2.g(kVar);
                Object objN = g0Var2.N();
                Object obj4 = l1.i.a;
                if (zG || objN == obj4) {
                    objN = new a0(2, kVar);
                    g0Var2.n0(objN);
                }
                u00.a aVar = (u00.a) objN;
                boolean zG2 = g0Var2.g(kVar);
                Object objN2 = g0Var2.N();
                if (zG2 || objN2 == obj4) {
                    objN2 = new a0(3, kVar);
                    g0Var2.n0(objN2);
                }
                g4.h(this.B, this.C, this.F, aVar, (u00.a) objN2, this.E, rVarD, iVar, g0Var, 14155776, 0);
                g0Var2.r(true);
                break;
            default:
                l1.g0 g0Var3 = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(PlayerScreenAnimatedVisibility, "$this$AnimatedVisibility");
                b2.r rVarG = h0.c.G(b2.o.A, 0.0f, 0.0f, 8, 0.0f, 11);
                l1.g0 g0Var4 = g0Var3;
                u00.k kVar2 = this.D;
                boolean zG3 = g0Var4.g(kVar2);
                Object objN3 = g0Var4.N();
                if (zG3 || objN3 == l1.i.a) {
                    objN3 = new a0(8, kVar2);
                    g0Var4.n0(objN3);
                }
                p.a(this.B, this.C, (u00.a) objN3, this.E, this.F, rVarG, g0Var3, 196608, 0);
                break;
        }
        return g00.b0.a;
    }
}
