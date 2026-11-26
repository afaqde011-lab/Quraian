package v0;

import a10.h0;
import android.content.Context;
import b2.r;
import c3.o0;
import c4.c0;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.y3;
import g00.b0;
import h0.o;
import h0.z1;
import l1.g0;
import l1.q;
import l1.r1;
import q0.f2;
import q0.t1;

public abstract class i {

    public static final c0 f15327a = new c0(30, true);

    public static final void a(t0.g gVar, t0.c cVar, l1.j jVar, int i10) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1904307118);
        int i11 = (g0Var.g(gVar) ? 4 : 2) | i10 | (g0Var.i(cVar) ? 32 : 16);
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            g0Var.c0(-1009482584);
            Context context = (Context) g0Var.k(o0.f2722b);
            g0Var.r(false);
            boolean zI = g0Var.i(cVar) | ((i11 & 14) == 4) | g0Var.i(context);
            Object objN = g0Var.N();
            if (zI || objN == l1.i.f9868a) {
                objN = new t1(cVar, context, gVar, 6);
                g0Var.n0(objN);
            }
            c0.i.b(null, null, (u00.k) objN, g0Var, 0, 3);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new l0.g0(gVar, cVar, i10, 27);
        }
    }

    public static final void b(final int i10, final long j9, l1.j jVar, final int i11) {
        final int i12;
        int i13;
        r1 r1VarT;
        u00.n nVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1240244237);
        if ((i11 & 6) == 0) {
            i12 = i10;
            i13 = i11 | (g0Var.e(i12) ? 4 : 2);
        } else {
            i12 = i10;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= g0Var.f(j9) ? 32 : 16;
        }
        if (g0Var.S(i13 & 1, (i13 & 19) != 18)) {
            Context context = (Context) g0Var.k(o0.f2722b);
            boolean zG = ((i13 & 14) == 4) | g0Var.g(context);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (zG || objN == cVar) {
                objN = Integer.valueOf(context.obtainStyledAttributes(new int[]{i12}).getResourceId(0, -1));
                g0Var.n0(objN);
            }
            int iIntValue = ((Number) objN).intValue();
            if (iIntValue == -1) {
                r1VarT = g0Var.t();
                if (r1VarT == null) {
                    return;
                }
                final int i14 = 1;
                nVar = new u00.n() {
                    public final Object invoke(Object obj, Object obj2) {
                        int i15 = i14;
                        l1.j jVar2 = (l1.j) obj;
                        ((Integer) obj2).getClass();
                        switch (i15) {
                            case 0:
                                i.b(i12, j9, jVar2, q.K(i11 | 1));
                                break;
                            default:
                                i.b(i12, j9, jVar2, q.K(i11 | 1));
                                break;
                        }
                        return b0.a;
                    }
                };
            } else {
                m2.b bVarR = y3.R(iIntValue, g0Var, 0);
                boolean z10 = (i13 & 112) == 32;
                Object objN2 = g0Var.N();
                if (z10 || objN2 == cVar) {
                    objN2 = j9 == 16 ? null : new i2.m(j9, 5);
                    g0Var.n0(objN2);
                }
                o.a(f2.h.h(z1.m(b2.o.A, c0.e.f2592j), bVarR, null, z2.o.f17146b, 0.0f, (i2.m) objN2, 22), g0Var, 0);
            }
            r1VarT.f9921d = nVar;
        }
        g0Var.V();
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            final int i15 = 0;
            nVar = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    int i16 = i15;
                    l1.j jVar2 = (l1.j) obj;
                    ((Integer) obj2).getClass();
                    switch (i16) {
                        case 0:
                            i.b(i10, j9, jVar2, q.K(i11 | 1));
                            break;
                        default:
                            i.b(i10, j9, jVar2, q.K(i11 | 1));
                            break;
                    }
                    return b0.a;
                }
            };
            r1VarT.f9921d = nVar;
        }
    }

    public static final void c(t0.g gVar, x0.e eVar, u00.a aVar, l1.j jVar, int i10) {
        int i11;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-2040393164);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? g0Var.g(gVar) : g0Var.i(gVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? g0Var.g(eVar) : g0Var.i(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.i(aVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        boolean z10 = false;
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            boolean z11 = (i11 & 112) == 32 || ((i11 & 64) != 0 && g0Var.g(eVar));
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (z11 || objN == cVar) {
                objN = new k(new qj.c(new l6.c(eVar, aVar, 23), 11));
                g0Var.n0(objN);
            }
            k kVar = (k) objN;
            if ((i11 & 14) == 4 || ((i11 & 8) != 0 && g0Var.i(gVar))) {
                z10 = true;
            }
            Object objN2 = g0Var.N();
            if (z10 || objN2 == cVar) {
                objN2 = new f2(gVar, 9);
                g0Var.n0(objN2);
            }
            c4.n.a(kVar, (u00.a) objN2, f15327a, v1.d.d(1315155414, new l0.g0(eVar, gVar, 26), g0Var), g0Var, 3456, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new bs.f(i10, 23, gVar, eVar, aVar);
        }
    }

    public static final void d(r rVar, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1392105195);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(cVar) ? 32 : 16;
        }
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            h0.g(rVar, x0.g.f16397a, cVar, g0Var, ((i11 << 6) & 7168) | (i11 & 14) | 432);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new kz.h(rVar, cVar, i10, 3);
        }
    }
}
