package d6;

import com.google.android.gms.internal.measurement.x5;
import kotlin.NoWhenBranchMatchedException;

public final class a2 implements u00.n {
    public final int A = 0;
    public final u00.n B;
    public final long C;
    public final f2 D;

    public a2(f2 f2Var, long j9, u00.n nVar, int i10) {
        this.D = f2Var;
        this.C = j9;
        this.B = nVar;
    }

    public a2(u00.n nVar, long j9, f2 f2Var) {
        this.B = nVar;
        this.C = j9;
        this.D = f2Var;
    }

    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        l1.g0 g0Var;
        Object objN;
        u00.a aVar;
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                w.a(l1.q.K(1), this.C, this.D, (l1.j) obj, this.B);
                return g00.b0.a;
            default:
                l1.j jVar = (l1.j) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    l1.g0 g0Var2 = (l1.g0) jVar;
                    if (g0Var2.C()) {
                        g0Var2.V();
                    } else {
                        g0Var = (l1.g0) jVar;
                        objN = g0Var.N();
                        if (objN == l1.i.f9868a) {
                            objN = b2.A;
                            g0Var.n0(objN);
                        }
                        aVar = (u00.a) ((a10.g) objN);
                        g0Var.d0(-683746039);
                        g0Var.d0(-548224868);
                        if (g0Var.f9842a instanceof b6.b) {
                            l1.q.w();
                            throw null;
                        }
                        g0Var.a0();
                        if (g0Var.S) {
                            g0Var.l(aVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(new y3.h(this.C), jVar, new cp.a(16));
                        l1.q.I(this.D, jVar, new cp.a(17));
                        this.B.invoke(jVar, 0);
                        x5.z(g0Var, true, false, false);
                    }
                } else {
                    g0Var = (l1.g0) jVar;
                    objN = g0Var.N();
                    if (objN == l1.i.f9868a) {
                        objN = b2.A;
                        g0Var.n0(objN);
                    }
                    aVar = (u00.a) ((a10.g) objN);
                    g0Var.d0(-683746039);
                    g0Var.d0(-548224868);
                    if (g0Var.f9842a instanceof b6.b) {
                        l1.q.w();
                        throw null;
                    }
                    g0Var.a0();
                    if (g0Var.S) {
                        g0Var.l(aVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(new y3.h(this.C), jVar, new cp.a(16));
                    l1.q.I(this.D, jVar, new cp.a(17));
                    this.B.invoke(jVar, 0);
                    x5.z(g0Var, true, false, false);
                }
                return g00.b0.a;
        }
    }
}
