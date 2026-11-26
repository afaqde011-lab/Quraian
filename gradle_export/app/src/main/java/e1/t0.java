package e1;

import com.google.android.gms.internal.measurement.b5;
import l1.i1;
import q0.e2;
import q0.j1;
import q0.r1;

public final class t0 implements r1 {

    public m3.q0 f5001b;

    public final v0 f5003d;

    public boolean f5000a = true;

    public du.w f5002c = v.f5009d;

    public t0(v0 v0Var) {
        this.f5003d = v0Var;
    }

    @Override
    public final void a() {
        f();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d(long j9, du.w wVar) {
        long j10;
        e2 e2VarD;
        e2 e2VarD2;
        v0 v0Var = this.f5003d;
        i1 i1Var = v0Var.f5030r;
        if (v0Var.k() && ((q0.y0) i1Var.getValue()) == null) {
            i1Var.setValue(q0.y0.C);
            v0Var.f5032t = -1;
            this.f5000a = true;
            this.f5002c = wVar;
            v0Var.o();
            j1 j1Var = v0Var.f5018d;
            if (j1Var == null || (e2VarD2 = j1Var.d()) == null || !e2VarD2.c(j9)) {
                j10 = j9;
                j1 j1Var2 = v0Var.f5018d;
                if (j1Var2 != null && (e2VarD = j1Var2.d()) != null) {
                    int iK = v0Var.f5016b.k(e2VarD.b(true, j10));
                    r3.w wVarE = v0.e(v0Var.n().f13099a, m3.h0.b(iK, iK));
                    v0Var.h(false);
                    q2.a aVar = v0Var.f5025k;
                    if (aVar != null) {
                        ((q2.c) aVar).a(0);
                    }
                    v0Var.f5017c.invoke(wVarE);
                    v0Var.f5035w = new m3.q0(wVarE.f13100b);
                }
                this.f5000a = false;
            } else {
                if (v0Var.n().f13099a.B.length() == 0) {
                    return;
                }
                v0Var.h(false);
                long jC = v0.c(v0Var, r3.w.b(v0Var.n(), null, m3.q0.f10518b, 5), j9, true, false, this.f5002c, true, new q2.b(0));
                j10 = j9;
                v0Var.f5028p = new m3.q0(jC);
                this.f5001b = new m3.q0(jC);
            }
            v0Var.q(q0.z0.A);
            v0Var.f5027o = j10;
            v0Var.f5031s.setValue(new h2.b(j10));
            v0Var.f5029q = 0L;
        }
    }

    @Override
    public final void e(long j9) {
        e2 e2VarD;
        m3.q0 q0Var;
        int iB;
        long jC;
        v0 v0Var = this.f5003d;
        if (!v0Var.k() || v0Var.n().f13099a.B.length() == 0) {
            return;
        }
        v0Var.f5029q = h2.b.f(v0Var.f5029q, j9);
        j1 j1Var = v0Var.f5018d;
        if (j1Var != null && (e2VarD = j1Var.d()) != null) {
            v0Var.f5031s.setValue(new h2.b(h2.b.f(v0Var.f5027o, v0Var.f5029q)));
            if (v0Var.f5028p == null) {
                h2.b bVarI = v0Var.i();
                kotlin.jvm.internal.m.b(bVarI);
                if (e2VarD.c(bVarI.f6544a)) {
                    q0Var = v0Var.f5028p;
                    if (q0Var != null) {
                        iB = (int) (q0Var.f10520a >> 32);
                    } else {
                        iB = e2VarD.b(false, v0Var.f5027o);
                    }
                    h2.b bVarI2 = v0Var.i();
                    kotlin.jvm.internal.m.b(bVarI2);
                    int iB2 = e2VarD.b(false, bVarI2.f6544a);
                    if (v0Var.f5028p != null && iB == iB2) {
                        return;
                    }
                    r3.w wVarN = v0Var.n();
                    h2.b bVarI3 = v0Var.i();
                    kotlin.jvm.internal.m.b(bVarI3);
                    jC = v0.c(v0Var, wVarN, bVarI3.f6544a, false, false, this.f5002c, true, new q2.b(9));
                } else {
                    int iK = v0Var.f5016b.k(e2VarD.b(true, v0Var.f5027o));
                    r3.p pVar = v0Var.f5016b;
                    h2.b bVarI4 = v0Var.i();
                    kotlin.jvm.internal.m.b(bVarI4);
                    du.w wVar = iK == pVar.k(e2VarD.b(true, bVarI4.f6544a)) ? v.f5009d : v.f5011f;
                    r3.w wVarN2 = v0Var.n();
                    h2.b bVarI5 = v0Var.i();
                    kotlin.jvm.internal.m.b(bVarI5);
                    jC = v0.c(v0Var, wVarN2, bVarI5.f6544a, false, false, wVar, true, new q2.b(9));
                }
            } else {
                q0Var = v0Var.f5028p;
                if (q0Var != null) {
                    iB = (int) (q0Var.f10520a >> 32);
                } else {
                    iB = e2VarD.b(false, v0Var.f5027o);
                }
                h2.b bVarI6 = v0Var.i();
                kotlin.jvm.internal.m.b(bVarI6);
                int iB3 = e2VarD.b(false, bVarI6.f6544a);
                if (v0Var.f5028p != null) {
                }
                r3.w wVarN3 = v0Var.n();
                h2.b bVarI7 = v0Var.i();
                kotlin.jvm.internal.m.b(bVarI7);
                jC = v0.c(v0Var, wVarN3, bVarI7.f6544a, false, false, this.f5002c, true, new q2.b(9));
            }
            this.f5001b = new m3.q0(jC);
            if (!m3.q0.b(v0Var.f5028p, jC)) {
                this.f5000a = false;
            }
        }
        v0Var.t(false);
    }

    public final void f() {
        v0 v0Var = this.f5003d;
        v0Var.f5030r.setValue(null);
        v0Var.f5031s.setValue(null);
        this.f5002c = v.f5009d;
        v0Var.t(true);
        m3.q0 q0Var = this.f5001b;
        boolean zD = m3.q0.d(q0Var != null ? q0Var.f10520a : v0Var.n().f13100b);
        v0Var.q(zD ? q0.z0.C : q0.z0.B);
        j1 j1Var = v0Var.f5018d;
        if (j1Var != null) {
            j1Var.m.setValue(Boolean.valueOf(!zD && b5.z(v0Var, true)));
        }
        j1 j1Var2 = v0Var.f5018d;
        if (j1Var2 != null) {
            j1Var2.f12649n.setValue(Boolean.valueOf(!zD && b5.z(v0Var, false)));
        }
        j1 j1Var3 = v0Var.f5018d;
        if (j1Var3 != null) {
            j1Var3.f12650o.setValue(Boolean.valueOf(zD && b5.z(v0Var, true)));
        }
        if (this.f5000a) {
            v0.b(v0Var, v0Var.f5028p);
        }
        v0Var.f5028p = null;
    }

    @Override
    public final void onCancel() {
        f();
    }
}
