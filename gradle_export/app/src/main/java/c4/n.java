package c4;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import c3.o0;
import c3.o1;
import com.google.android.gms.cast.Cast;
import java.util.UUID;
import l1.e0;
import l1.g0;
import l1.m1;
import l1.r1;
import l1.z0;
import z2.w0;

public abstract class n {

    public static final l1.t f2838a = new l1.t(c.D);

    public static final l1.t f2839b = new l1.t(c.C);

    public static final void a(b0 b0Var, u00.a aVar, c0 c0Var, v1.c cVar, l1.j jVar, int i10, int i11) {
        int i12;
        u00.a aVar2;
        c0 c0Var2;
        int i13;
        boolean z10;
        u00.a aVar3;
        r1 r1VarT;
        u00.a aVar4;
        View view;
        y3.c cVar2;
        String str;
        y3.m mVar;
        e0 e0VarF;
        z0 z0VarG;
        Object objN;
        l1.c cVar3;
        UUID uuid;
        boolean zBooleanValue;
        Object objN2;
        String str2;
        k00.c cVar4;
        boolean z11;
        z zVar;
        int i14;
        boolean z12;
        int i15;
        boolean z13;
        boolean zG;
        Object objN3;
        boolean z14;
        boolean z15;
        boolean zG2;
        Object objN4;
        boolean z16;
        Object objN5;
        boolean zI;
        Object objN6;
        boolean zI2;
        Object objN7;
        boolean zI3;
        Object objN8;
        b3.g gVar;
        int i16;
        int i17;
        b0 b0Var2 = b0Var;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1772091631);
        if ((i10 & 6) == 0) {
            i12 = (g0Var.g(b0Var2) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 48) == 0) {
                aVar2 = aVar;
                i12 |= g0Var.i(aVar2) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                c0Var2 = c0Var;
                if (g0Var.g(c0Var2)) {
                    i17 = 256;
                } else {
                    i17 = Cast.MAX_NAMESPACE_LENGTH;
                }
                i12 |= i17;
            } else {
                c0Var2 = c0Var;
            }
            if ((i10 & 3072) == 0) {
                if (g0Var.i(cVar)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i13 = i12;
            if ((i13 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.S(i13 & 1, z10)) {
                if (i18 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                view = (View) g0Var.k(o0.f2726f);
                cVar2 = (y3.c) g0Var.k(o1.f2734h);
                str = (String) g0Var.k(f2838a);
                mVar = (y3.m) g0Var.k(o1.f2738n);
                e0VarF = l1.q.F(g0Var);
                z0VarG = l1.q.G(cVar, g0Var);
                Object[] objArr = new Object[0];
                objN = g0Var.N();
                cVar3 = l1.i.f9868a;
                if (objN == cVar3) {
                    objN = c.E;
                    g0Var.n0(objN);
                }
                uuid = (UUID) y1.k.c(objArr, (u00.a) objN, g0Var, 48);
                zBooleanValue = ((Boolean) g0Var.k(f2839b)).booleanValue();
                objN2 = g0Var.N();
                if (objN2 == cVar3) {
                    str2 = str;
                    cVar4 = null;
                    z11 = false;
                    z zVar2 = new z(aVar4, c0Var2, str2, view, cVar2, b0Var2, uuid, zBooleanValue);
                    b0Var2 = b0Var2;
                    zVar2.m(e0VarF, new v1.c(new m(zVar2, z0VarG, 1), -297523940, true));
                    g0Var.n0(zVar2);
                    objN2 = zVar2;
                } else {
                    str2 = str;
                    cVar4 = null;
                    z11 = false;
                }
                zVar = (z) objN2;
                boolean zI4 = g0Var.i(zVar);
                i14 = i13 & 112;
                if (i14 == 32) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                boolean z17 = zI4 | z12;
                i15 = i13 & 896;
                if (i15 == 256) {
                    z13 = true;
                } else {
                    z13 = z11;
                }
                zG = z17 | z13 | g0Var.g(str2) | g0Var.e(mVar.ordinal());
                objN3 = g0Var.N();
                if (zG || objN3 == cVar3) {
                    g gVar2 = new g(zVar, aVar4, c0Var, str2, mVar);
                    g0Var.n0(gVar2);
                    objN3 = gVar2;
                }
                l1.q.e(zVar, (u00.k) objN3, g0Var);
                boolean zI5 = g0Var.i(zVar);
                if (i14 == 32) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                boolean z18 = z14 | zI5;
                if (i15 == 256) {
                    z15 = true;
                } else {
                    z15 = z11;
                }
                zG2 = z18 | z15 | g0Var.g(str2) | g0Var.e(mVar.ordinal());
                objN4 = g0Var.N();
                if (zG2 || objN4 == cVar3) {
                    h hVar = new h(zVar, aVar4, c0Var, str2, mVar);
                    g0Var.n0(hVar);
                    objN4 = hVar;
                }
                l1.q.k((u00.a) objN4, g0Var);
                boolean zI6 = g0Var.i(zVar);
                if ((i13 & 14) == 4) {
                    z11 = true;
                }
                z16 = zI6 | z11;
                objN5 = g0Var.N();
                if (z16 || objN5 == cVar3) {
                    objN5 = new b2.v(zVar, b0Var2, 7);
                    g0Var.n0(objN5);
                }
                l1.q.e(b0Var2, (u00.k) objN5, g0Var);
                zI = g0Var.i(zVar);
                objN6 = g0Var.N();
                if (zI || objN6 == cVar3) {
                    objN6 = new a1.d(zVar, cVar4, 21);
                    g0Var.n0(objN6);
                }
                l1.q.i(zVar, g0Var, (u00.n) objN6);
                zI2 = g0Var.i(zVar);
                objN7 = g0Var.N();
                if (zI2 || objN7 == cVar3) {
                    objN7 = new j(zVar, 0);
                    g0Var.n0(objN7);
                }
                b2.r rVarN = z2.d0.n(b2.o.A, (u00.k) objN7);
                zI3 = g0Var.i(zVar) | g0Var.e(mVar.ordinal());
                objN8 = g0Var.N();
                if (zI3 || objN8 == cVar3) {
                    objN8 = new k(zVar, mVar, 0);
                    g0Var.n0(objN8);
                }
                w0 w0Var = (w0) objN8;
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                b2.r rVarC = b2.a.c(rVarN, g0Var);
                b3.i.f2042c.getClass();
                gVar = b3.h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0Var, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM, g0Var, b3.h.f2038e);
                l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
                l1.q.E(g0Var, b3.h.f2041h);
                l1.q.I(rVarC, g0Var, b3.h.f2037d);
                g0Var.r(true);
                aVar3 = aVar4;
            } else {
                g0Var.V();
                aVar3 = aVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new l(b0Var2, aVar3, c0Var, cVar, i10, i11);
            }
        }
        i12 |= 48;
        aVar2 = aVar;
        if ((i10 & 384) == 0) {
            c0Var2 = c0Var;
            if (g0Var.g(c0Var2)) {
                i17 = 256;
            } else {
                i17 = Cast.MAX_NAMESPACE_LENGTH;
            }
            i12 |= i17;
        } else {
            c0Var2 = c0Var;
        }
        if ((i10 & 3072) == 0) {
            if (g0Var.i(cVar)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i12 |= i16;
        }
        i13 = i12;
        if ((i13 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (g0Var.S(i13 & 1, z10)) {
            if (i18 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar2;
            }
            view = (View) g0Var.k(o0.f2726f);
            cVar2 = (y3.c) g0Var.k(o1.f2734h);
            str = (String) g0Var.k(f2838a);
            mVar = (y3.m) g0Var.k(o1.f2738n);
            e0VarF = l1.q.F(g0Var);
            z0VarG = l1.q.G(cVar, g0Var);
            Object[] objArr2 = new Object[0];
            objN = g0Var.N();
            cVar3 = l1.i.f9868a;
            if (objN == cVar3) {
                objN = c.E;
                g0Var.n0(objN);
            }
            uuid = (UUID) y1.k.c(objArr2, (u00.a) objN, g0Var, 48);
            zBooleanValue = ((Boolean) g0Var.k(f2839b)).booleanValue();
            objN2 = g0Var.N();
            if (objN2 == cVar3) {
                str2 = str;
                cVar4 = null;
                z11 = false;
                z zVar3 = new z(aVar4, c0Var2, str2, view, cVar2, b0Var2, uuid, zBooleanValue);
                b0Var2 = b0Var2;
                zVar3.m(e0VarF, new v1.c(new m(zVar3, z0VarG, 1), -297523940, true));
                g0Var.n0(zVar3);
                objN2 = zVar3;
            } else {
                str2 = str;
                cVar4 = null;
                z11 = false;
            }
            zVar = (z) objN2;
            boolean zI7 = g0Var.i(zVar);
            i14 = i13 & 112;
            if (i14 == 32) {
                z12 = true;
            } else {
                z12 = z11;
            }
            boolean z19 = zI7 | z12;
            i15 = i13 & 896;
            if (i15 == 256) {
                z13 = true;
            } else {
                z13 = z11;
            }
            zG = z19 | z13 | g0Var.g(str2) | g0Var.e(mVar.ordinal());
            objN3 = g0Var.N();
            if (zG) {
                g gVar3 = new g(zVar, aVar4, c0Var, str2, mVar);
                g0Var.n0(gVar3);
                objN3 = gVar3;
            } else {
                g gVar4 = new g(zVar, aVar4, c0Var, str2, mVar);
                g0Var.n0(gVar4);
                objN3 = gVar4;
            }
            l1.q.e(zVar, (u00.k) objN3, g0Var);
            boolean zI8 = g0Var.i(zVar);
            if (i14 == 32) {
                z14 = true;
            } else {
                z14 = z11;
            }
            boolean z110 = z14 | zI8;
            if (i15 == 256) {
                z15 = true;
            } else {
                z15 = z11;
            }
            zG2 = z110 | z15 | g0Var.g(str2) | g0Var.e(mVar.ordinal());
            objN4 = g0Var.N();
            if (zG2) {
                h hVar2 = new h(zVar, aVar4, c0Var, str2, mVar);
                g0Var.n0(hVar2);
                objN4 = hVar2;
            } else {
                h hVar3 = new h(zVar, aVar4, c0Var, str2, mVar);
                g0Var.n0(hVar3);
                objN4 = hVar3;
            }
            l1.q.k((u00.a) objN4, g0Var);
            boolean zI9 = g0Var.i(zVar);
            if ((i13 & 14) == 4) {
                z11 = true;
            }
            z16 = zI9 | z11;
            objN5 = g0Var.N();
            if (z16) {
                objN5 = new b2.v(zVar, b0Var2, 7);
                g0Var.n0(objN5);
            } else {
                objN5 = new b2.v(zVar, b0Var2, 7);
                g0Var.n0(objN5);
            }
            l1.q.e(b0Var2, (u00.k) objN5, g0Var);
            zI = g0Var.i(zVar);
            objN6 = g0Var.N();
            if (zI) {
                objN6 = new a1.d(zVar, cVar4, 21);
                g0Var.n0(objN6);
            } else {
                objN6 = new a1.d(zVar, cVar4, 21);
                g0Var.n0(objN6);
            }
            l1.q.i(zVar, g0Var, (u00.n) objN6);
            zI2 = g0Var.i(zVar);
            objN7 = g0Var.N();
            if (zI2) {
                objN7 = new j(zVar, 0);
                g0Var.n0(objN7);
            } else {
                objN7 = new j(zVar, 0);
                g0Var.n0(objN7);
            }
            b2.r rVarN2 = z2.d0.n(b2.o.A, (u00.k) objN7);
            zI3 = g0Var.i(zVar) | g0Var.e(mVar.ordinal());
            objN8 = g0Var.N();
            if (zI3) {
                objN8 = new k(zVar, mVar, 0);
                g0Var.n0(objN8);
            } else {
                objN8 = new k(zVar, mVar, 0);
                g0Var.n0(objN8);
            }
            w0 w0Var2 = (w0) objN8;
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarN2, g0Var);
            b3.i.f2042c.getClass();
            gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0Var2, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM2, g0Var, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.f2040g);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC2, g0Var, b3.h.f2037d);
            g0Var.r(true);
            aVar3 = aVar4;
        } else {
            g0Var.V();
            aVar3 = aVar2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new l(b0Var2, aVar3, c0Var, cVar, i10, i11);
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
