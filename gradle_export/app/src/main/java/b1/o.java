package b1;

import a1.v2;
import as.r0;
import c3.p1;
import c3.t2;
import e1.v0;
import i2.w0;
import l1.i1;
import l1.p2;
import l1.z0;
import q0.e2;
import q0.j1;
import q0.y0;
import x.m1;

public final class o implements u00.k {
    public final int A = 0;
    public final boolean B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;

    public o(e0 e0Var, kotlin.jvm.internal.y yVar, kotlin.jvm.internal.y yVar2, y0 y0Var, boolean z10) {
        this.C = yVar;
        this.E = e0Var;
        this.B = z10;
        this.F = y0Var;
        this.D = yVar2;
    }

    public o(gm.a aVar, boolean z10, u30.b bVar, String str, u00.k kVar) {
        this.C = aVar;
        this.B = z10;
        this.D = bVar;
        this.E = str;
        this.F = kVar;
    }

    public o(j1 j1Var, g2.t tVar, boolean z10, v0 v0Var, r3.p pVar) {
        this.C = j1Var;
        this.D = tVar;
        this.B = z10;
        this.E = v0Var;
        this.F = pVar;
    }

    public o(boolean z10, x.k0 k0Var, z0 z0Var, m1 m1Var, m1 m1Var2) {
        this.B = z10;
        this.C = k0Var;
        this.D = z0Var;
        this.E = m1Var;
        this.F = m1Var2;
    }

    public final Object invoke(Object obj) {
        float fFloatValue;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.C;
                e0 e0Var = (e0) this.E;
                y0 y0Var = (y0) this.F;
                kotlin.jvm.internal.y yVar2 = (kotlin.jvm.internal.y) this.D;
                long jA = e1.g0.a(e0Var.o(this.B));
                yVar.A = jA;
                e0Var.A(y0Var, jA);
                yVar2.A = 0L;
                e0Var.f1960w = -1;
                break;
            case 1:
                i1 i1Var = ((x.k0) this.C).D;
                z0 z0Var = (z0) this.D;
                p2 p2Var = (p2) this.E;
                p2 p2Var2 = (p2) this.F;
                i2.c0 c0Var = (i2.c0) obj;
                boolean z10 = this.B;
                float fFloatValue2 = 0.8f;
                float fFloatValue3 = 1.0f;
                if (z10) {
                    fFloatValue = ((Boolean) i1Var.getValue()).booleanValue() ? 1.0f : 0.8f;
                } else {
                    fFloatValue = ((Number) p2Var.getValue()).floatValue();
                }
                c0Var.I0(fFloatValue);
                if (!z10) {
                    fFloatValue2 = ((Number) p2Var.getValue()).floatValue();
                } else if (((Boolean) i1Var.getValue()).booleanValue()) {
                    fFloatValue2 = 1.0f;
                }
                c0Var.N(fFloatValue2);
                if (!z10) {
                    fFloatValue3 = ((Number) p2Var2.getValue()).floatValue();
                } else if (!((Boolean) i1Var.getValue()).booleanValue()) {
                    fFloatValue3 = 0.0f;
                }
                c0Var.s0(fFloatValue3);
                c0Var.S0(((w0) z0Var.getValue()).f7177a);
                break;
            case 2:
                gm.a aVar = (gm.a) this.C;
                h00.b bVar = (u30.b) this.D;
                String str = (String) this.E;
                u00.k kVar = (u00.k) this.F;
                k0.i iVar = (k0.i) obj;
                kotlin.jvm.internal.m.e(iVar, "$this$LazyVerticalGrid");
                if (aVar == gm.a.A) {
                    k0.i.p(iVar, null, new hx.t(8), new v1.c(new fv.a(str, 4), -1837237186, true), 5);
                }
                if (this.B) {
                    iVar.q(6, null, k0.s.A, iw.a.a);
                } else {
                    iVar.q(bVar.a(), new v2(new hx.t(9), bVar, 17), new r0(8, bVar), new v1.c(new iw.e(bVar, kVar, 0), -1117249557, true));
                }
                return g00.b0.a;
            default:
                j1 j1Var = (j1) this.C;
                g2.t tVar = (g2.t) this.D;
                v0 v0Var = (v0) this.E;
                r3.p pVar = (r3.p) this.F;
                h2.b bVar2 = (h2.b) obj;
                if (j1Var.b()) {
                    t2 t2Var = j1Var.f12640c;
                    if (t2Var != null) {
                        ((p1) t2Var).b();
                    }
                } else {
                    g2.t.a(tVar);
                }
                if (j1Var.b() && this.B) {
                    if (j1Var.a() != q0.z0.B) {
                        e2 e2VarD = j1Var.d();
                        if (e2VarD != null) {
                            long j9 = bVar2.f6544a;
                            q3.e0 e0Var2 = j1Var.f12641d;
                            q0.r0 r0Var = j1Var.f12657v;
                            int iK = pVar.k(e2VarD.b(true, j9));
                            r0Var.invoke(r3.w.b((r3.w) e0Var2.B, null, m3.h0.b(iK, iK), 5));
                            if (j1Var.f12638a.f12683a.B.length() > 0) {
                                j1Var.f12648k.setValue(q0.z0.C);
                            }
                        }
                    } else {
                        v0Var.g(bVar2);
                    }
                }
                return g00.b0.a;
        }
        return g00.b0.a;
    }
}
