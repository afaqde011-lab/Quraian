package pl;

import b2.r;
import com.google.android.gms.internal.measurement.z3;
import i2.b0;
import i2.t0;
import l1.g0;
import l1.m1;
import l1.r1;
import z2.d0;
import z2.w0;

public final class j {
    public final float a;
    public final float b;
    public final u00.o c;

    public j(float f, float f2, u00.o onRegionPositioned) {
        kotlin.jvm.internal.m.e(onRegionPositioned, "onRegionPositioned");
        this.a = f;
        this.b = f2;
        this.c = onRegionPositioned;
    }

    public final void a(r rVar, t0 t0Var, v1.c cVar, l1.j jVar, int i, int i2) {
        r rVar2;
        int i3;
        t0 t0Var2;
        boolean z;
        r rVar3;
        t0 t0Var3;
        r1 r1VarT;
        r rVarC;
        t0 t0Var4;
        Object objN;
        Object obj;
        int iIntValue;
        boolean zA;
        int i4;
        boolean z2;
        boolean zH;
        Object objN2;
        b3.g gVar;
        boolean z3;
        Object objN3;
        int i5;
        int i6;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1556054808);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = (g0Var.g(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                t0Var2 = t0Var;
                i3 |= g0Var.g(t0Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (g0Var.i(cVar)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i3 |= i6;
            }
            if ((i & 3072) == 0) {
                if (g0Var.g(this)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i3 & 1, z)) {
                rVarC = b2.o.A;
                if (i7 != 0) {
                    rVar2 = rVarC;
                }
                if (i8 != 0) {
                    t0Var4 = null;
                } else {
                    t0Var4 = t0Var2;
                }
                objN = g0Var.N();
                obj = l1.i.a;
                if (objN == obj) {
                    int i9 = z3.c;
                    z3.c = i9 + 1;
                    objN = Integer.valueOf(i9);
                    g0Var.n0(objN);
                }
                iIntValue = ((Number) objN).intValue();
                zA = kotlin.jvm.internal.m.a(t0Var4, p0.f.a);
                i4 = i3 & 7168;
                if (i4 == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zH = z2 | g0Var.h(zA);
                objN2 = g0Var.N();
                if (zH || objN2 == obj) {
                    objN2 = new i(this, iIntValue, zA);
                    g0Var.n0(objN2);
                }
                r rVarN = d0.n(rVar2, (u00.k) objN2);
                b2.i iVar = b2.b.A;
                w0 w0VarD = h0.o.d(iVar, false);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                r rVarC2 = b2.a.c(rVarN, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                b3.f fVar = b3.h.f;
                l1.q.I(w0VarD, g0Var, fVar);
                b3.f fVar2 = b3.h.e;
                l1.q.I(m1VarM, g0Var, fVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                b3.f fVar3 = b3.h.g;
                l1.q.I(numValueOf, g0Var, fVar3);
                b3.e eVar = b3.h.h;
                l1.q.E(g0Var, eVar);
                r rVar4 = rVar2;
                b3.f fVar4 = b3.h.d;
                l1.q.I(rVarC2, g0Var, fVar4);
                if (i4 == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objN3 = g0Var.N();
                if (z3 || objN3 == obj) {
                    objN3 = new h00.a(this, 29);
                    g0Var.n0(objN3);
                }
                r rVarP = b0.p(rVarC, (u00.k) objN3);
                if (t0Var4 != null) {
                    rVarC = f2.h.c(rVarC, t0Var4);
                }
                r rVarV = rVarP.V(rVarC);
                w0 w0VarD2 = h0.o.d(iVar, false);
                t0 t0Var5 = t0Var4;
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                r rVarC3 = b2.a.c(rVarV, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD2, g0Var, fVar);
                l1.q.I(m1VarM2, g0Var, fVar2);
                a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
                l1.q.I(rVarC3, g0Var, fVar4);
                cVar.invoke(g0Var, Integer.valueOf((i3 >> 6) & 14));
                g0Var.r(true);
                g0Var.r(true);
                t0Var3 = t0Var5;
                rVar3 = rVar4;
            } else {
                g0Var.V();
                rVar3 = rVar2;
                t0Var3 = t0Var2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new b6.p(this, rVar3, t0Var3, cVar, i, i2, 3);
            }
        }
        i3 |= 48;
        t0Var2 = t0Var;
        if ((i & 384) == 0) {
            if (g0Var.i(cVar)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i & 3072) == 0) {
            if (g0Var.g(this)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (g0Var.S(i3 & 1, z)) {
            rVarC = b2.o.A;
            if (i7 != 0) {
                rVar2 = rVarC;
            }
            if (i8 != 0) {
                t0Var4 = null;
            } else {
                t0Var4 = t0Var2;
            }
            objN = g0Var.N();
            obj = l1.i.a;
            if (objN == obj) {
                int i11 = z3.c;
                z3.c = i11 + 1;
                objN = Integer.valueOf(i11);
                g0Var.n0(objN);
            }
            iIntValue = ((Number) objN).intValue();
            zA = kotlin.jvm.internal.m.a(t0Var4, p0.f.a);
            i4 = i3 & 7168;
            if (i4 == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            zH = z2 | g0Var.h(zA);
            objN2 = g0Var.N();
            if (zH) {
                objN2 = new i(this, iIntValue, zA);
                g0Var.n0(objN2);
            } else {
                objN2 = new i(this, iIntValue, zA);
                g0Var.n0(objN2);
            }
            r rVarN2 = d0.n(rVar2, (u00.k) objN2);
            b2.i iVar2 = b2.b.A;
            w0 w0VarD3 = h0.o.d(iVar2, false);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            r rVarC4 = b2.a.c(rVarN2, g0Var);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar5 = b3.h.f;
            l1.q.I(w0VarD3, g0Var, fVar5);
            b3.f fVar6 = b3.h.e;
            l1.q.I(m1VarM3, g0Var, fVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            b3.f fVar7 = b3.h.g;
            l1.q.I(numValueOf2, g0Var, fVar7);
            b3.e eVar2 = b3.h.h;
            l1.q.E(g0Var, eVar2);
            r rVar5 = rVar2;
            b3.f fVar8 = b3.h.d;
            l1.q.I(rVarC4, g0Var, fVar8);
            if (i4 == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            objN3 = g0Var.N();
            if (z3) {
                objN3 = new h00.a(this, 29);
                g0Var.n0(objN3);
            } else {
                objN3 = new h00.a(this, 29);
                g0Var.n0(objN3);
            }
            r rVarP2 = b0.p(rVarC, (u00.k) objN3);
            if (t0Var4 != null) {
                rVarC = f2.h.c(rVarC, t0Var4);
            }
            r rVarV2 = rVarP2.V(rVarC);
            w0 w0VarD4 = h0.o.d(iVar2, false);
            t0 t0Var6 = t0Var4;
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            r rVarC5 = b2.a.c(rVarV2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD4, g0Var, fVar5);
            l1.q.I(m1VarM4, g0Var, fVar6);
            a1.b.v(iHashCode4, g0Var, fVar7, g0Var, eVar2);
            l1.q.I(rVarC5, g0Var, fVar8);
            cVar.invoke(g0Var, Integer.valueOf((i3 >> 6) & 14));
            g0Var.r(true);
            g0Var.r(true);
            t0Var3 = t0Var6;
            rVar3 = rVar5;
        } else {
            g0Var.V();
            rVar3 = rVar2;
            t0Var3 = t0Var2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b6.p(this, rVar3, t0Var3, cVar, i, i2, 3);
        }
    }
}
