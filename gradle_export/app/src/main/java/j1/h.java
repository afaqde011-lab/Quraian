package j1;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.x5;
import g00.b0;
import g1.q0;
import g1.r0;
import gv.x0;
import h0.s;
import h0.z1;
import h00.y;
import hx.t;
import i2.t0;
import l1.g0;
import l1.m1;
import l1.q2;
import l1.r1;
import z2.d0;
import z2.l1;
import z2.v0;
import z2.w0;
import z2.y0;

public final class h {

    public static final float f7842c;

    public static final float f7843d;

    public static final h f7840a = new h();

    public static final p0.e f7841b = p0.f.f12243a;

    public static final float f7844e = k1.k.f8784c;

    static {
        float f3 = 80;
        f7842c = f3;
        f7843d = f3;
    }

    public final void a(final r rVar, final boolean z10, final b2.r rVar2, long j9, long j10, float f3, l1.j jVar, final int i10, final int i11) {
        float f10;
        int i12;
        int i13;
        boolean z11;
        final long j11;
        final long j12;
        final float f11;
        r1 r1VarT;
        int i14;
        float f12;
        long j13;
        long j14;
        int i15;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1076870256);
        int i16 = i10 | (g0Var.g(rVar) ? 4 : 2) | (g0Var.h(z10) ? 32 : 16) | (g0Var.g(rVar2) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | 9216;
        if ((i11 & 32) == 0) {
            f10 = f3;
            if (g0Var.d(f10)) {
                i12 = 131072;
            }
            i13 = i16 | i12;
            if ((i10 & 1572864) == 0) {
                if (g0Var.g(this)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i13 |= i15;
            }
            if ((599187 & i13) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (g0Var.S(i13 & 1, z11)) {
                g0Var.X();
                if ((i10 & 1) != 0 || g0Var.A()) {
                    q2 q2Var = r0.f5948a;
                    long j15 = ((q0) g0Var.k(q2Var)).G;
                    long j16 = ((q0) g0Var.k(q2Var)).f5929s;
                    i14 = i13 & (-64513);
                    if ((i11 & 32) != 0) {
                        i14 = i13 & (-523265);
                        f12 = f7843d;
                    } else {
                        f12 = f10;
                    }
                    j13 = j15;
                    j14 = j16;
                } else {
                    g0Var.V();
                    i14 = i13 & (-64513);
                    if ((i11 & 32) != 0) {
                        i14 = i13 & (-523265);
                    }
                    j13 = j9;
                    j14 = j10;
                    f12 = f10;
                }
                g0Var.s();
                b(rVar, z10, rVar2, f12, null, j13, 0.0f, v1.d.d(298232649, new g(z10, j14, rVar), g0Var), g0Var, (i14 & 14) | 12582912 | (i14 & 112) | (i14 & 896) | ((i14 >> 6) & 7168) | ((i14 << 6) & 234881024));
                f11 = f12;
                j11 = j13;
                j12 = j14;
            } else {
                g0Var.V();
                j11 = j9;
                j12 = j10;
                f11 = f10;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new u00.n() {
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        this.A.a(rVar, z10, rVar2, j11, j12, f11, (l1.j) obj, l1.q.K(i10 | 1), i11);
                        return b0.a;
                    }
                };
            }
        }
        f10 = f3;
        i12 = Cast.MAX_MESSAGE_LENGTH;
        i13 = i16 | i12;
        if ((i10 & 1572864) == 0) {
            if (g0Var.g(this)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i13 |= i15;
        }
        if ((599187 & i13) != 599186) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (g0Var.S(i13 & 1, z11)) {
            g0Var.X();
            if ((i10 & 1) != 0) {
                q2 q2Var2 = r0.f5948a;
                long j17 = ((q0) g0Var.k(q2Var2)).G;
                long j18 = ((q0) g0Var.k(q2Var2)).f5929s;
                i14 = i13 & (-64513);
                if ((i11 & 32) != 0) {
                    i14 = i13 & (-523265);
                    f12 = f7843d;
                } else {
                    f12 = f10;
                }
                j13 = j17;
                j14 = j18;
            } else {
                q2 q2Var3 = r0.f5948a;
                long j19 = ((q0) g0Var.k(q2Var3)).G;
                long j110 = ((q0) g0Var.k(q2Var3)).f5929s;
                i14 = i13 & (-64513);
                if ((i11 & 32) != 0) {
                    i14 = i13 & (-523265);
                    f12 = f7843d;
                } else {
                    f12 = f10;
                }
                j13 = j19;
                j14 = j110;
            }
            g0Var.s();
            b(rVar, z10, rVar2, f12, null, j13, 0.0f, v1.d.d(298232649, new g(z10, j14, rVar), g0Var), g0Var, (i14 & 14) | 12582912 | (i14 & 112) | (i14 & 896) | ((i14 >> 6) & 7168) | ((i14 << 6) & 234881024));
            f11 = f12;
            j11 = j13;
            j12 = j14;
        } else {
            g0Var.V();
            j11 = j9;
            j12 = j10;
            f11 = f10;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.A.a(rVar, z10, rVar2, j11, j12, f11, (l1.j) obj, l1.q.K(i10 | 1), i11);
                    return b0.a;
                }
            };
        }
    }

    public final void b(final r rVar, final boolean z10, final b2.r rVar2, final float f3, t0 t0Var, final long j9, float f10, final v1.c cVar, l1.j jVar, final int i10) {
        final r rVar3;
        int i11;
        h hVar;
        final t0 t0Var2;
        final float f11;
        int i12;
        t0 t0Var3;
        final t0 t0Var4;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1341144489);
        if ((i10 & 6) == 0) {
            rVar3 = rVar;
            i11 = (g0Var.g(rVar3) ? 4 : 2) | i10;
        } else {
            rVar3 = rVar;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.h(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.g(rVar2) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.d(f3) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= g0Var.f(j9) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if ((1572864 & i10) == 0) {
            i11 |= 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= g0Var.i(cVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            hVar = this;
            i11 |= g0Var.g(hVar) ? 67108864 : 33554432;
        } else {
            hVar = this;
        }
        if (g0Var.S(i11 & 1, (38347923 & i11) != 38347922)) {
            g0Var.X();
            if ((i10 & 1) == 0 || g0Var.A()) {
                i12 = i11 & (-3727361);
                t0Var3 = f7841b;
                f11 = f7844e;
            } else {
                g0Var.V();
                i12 = i11 & (-3727361);
                t0Var3 = t0Var;
                f11 = f10;
            }
            int i13 = i12;
            g0Var.s();
            b2.r rVarM = z1.m(rVar2, k.f7848d);
            Object objN = g0Var.N();
            l1.c cVar2 = l1.i.f9868a;
            if (objN == cVar2) {
                objN = new t(15);
                g0Var.n0(objN);
            }
            b2.r rVarG = f2.h.g(rVarM, (u00.k) objN);
            boolean zD = ((i13 & 112) == 32) | ((i13 & 14) == 4) | ((((i13 & 7168) ^ 3072) > 2048 && g0Var.d(f3)) || (i13 & 3072) == 2048) | g0Var.d(f11) | g0Var.g(t0Var3);
            Object objN2 = g0Var.N();
            if (zD || objN2 == cVar2) {
                t0Var4 = t0Var3;
                u00.o oVar = new u00.o() {
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        l1 l1VarO = ((v0) obj2).O(((y3.a) obj3).f16587a);
                        return ((y0) obj).o0(l1VarO.A, l1VarO.B, y.A, new x0(l1VarO, rVar3, z10, f3, f11, t0Var4));
                    }
                };
                g0Var.n0(oVar);
                objN2 = oVar;
            } else {
                t0Var4 = t0Var3;
            }
            b2.r rVarF = z.n.f(d0.l(rVarG, (u00.o) objN2), j9, t0Var4);
            int i14 = ((i13 >> 12) & 7168) | 48;
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarF, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            b3.f fVar = b3.h.f2040g;
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode))) {
                x5.v(iHashCode, g0Var, iHashCode, fVar);
            }
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            cVar.invoke(s.f6456a, g0Var, Integer.valueOf(((i14 >> 6) & 112) | 6));
            g0Var.r(true);
            t0Var2 = t0Var4;
        } else {
            g0Var.V();
            t0Var2 = t0Var;
            f11 = f10;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            final h hVar2 = hVar;
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.A.b(rVar, z10, rVar2, f3, t0Var2, j9, f11, cVar, (l1.j) obj, l1.q.K(i10 | 1));
                    return b0.a;
                }
            };
        }
    }
}
