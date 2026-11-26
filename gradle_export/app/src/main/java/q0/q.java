package q0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.Spanned;
import android.util.Log;
import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c3.g3;
import c3.t2;
import c3.u2;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import d0.o2;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.NoWhenBranchMatchedException;
import l1.q2;

public abstract class q {

    public static final pp.d f12676a = new pp.d(3);

    public static final o10.b f12677b = new o10.b(new z(1), 10);

    public static final z f12678c = new z(2);

    public static final v2.a f12679d = new v2.a(1022);

    public static final int f12680e = 9;

    public static final int f12681f = 10;

    public static final int f12682g = 12;

    public static final boolean A(KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }

    public static final void B(j1 j1Var, r3.w wVar, r3.p pVar) {
        z1.f fVarF = z1.q.f();
        u00.k kVarE = fVarF != null ? fVarF.e() : null;
        z1.f fVarK = z1.q.k(fVarF);
        try {
            e2 e2VarD = j1Var.d();
            if (e2VarD == null) {
                return;
            }
            r3.b0 b0Var = j1Var.f12642e;
            if (b0Var == null) {
                return;
            }
            z2.a0 a0VarC = j1Var.c();
            if (a0VarC == null) {
                return;
            }
            C(wVar, j1Var.f12638a, e2VarD.f12608a, a0VarC, b0Var, j1Var.b(), pVar);
        } finally {
            z1.q.n(fVarF, fVarK, kVarE);
        }
    }

    public static void C(r3.w wVar, q1 q1Var, m3.n0 n0Var, z2.a0 a0Var, r3.b0 b0Var, boolean z10, r3.p pVar) {
        h2.c cVarB;
        if (z10) {
            int iZ = pVar.z(m3.q0.f(wVar.f13100b));
            String str = u1.f12702a;
            if (iZ < n0Var.f10496a.f10483a.B.length()) {
                cVarB = n0Var.b(iZ);
            } else {
                cVarB = iZ != 0 ? n0Var.b(iZ - 1) : new h2.c(0.0f, 0.0f, 1.0f, (int) (u1.a(q1Var.f12684b, q1Var.f12689g, q1Var.f12690h, u1.f12702a, 1) & 4294967295L));
            }
            float f3 = cVarB.f6547b;
            float f10 = cVarB.f6546a;
            long jD0 = a0Var.d0((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
            h2.c cVarG = bi.b.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jD0 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jD0 >> 32)))) << 32), (((long) Float.floatToRawIntBits(cVarB.f6548c - f10)) << 32) | (((long) Float.floatToRawIntBits(cVarB.f6549d - f3)) & 4294967295L));
            if (kotlin.jvm.internal.m.a((r3.b0) b0Var.f13047a.f13103b.get(), b0Var)) {
                b0Var.f13048b.h(cVarG);
            }
        }
    }

    public static final void D(r3.x xVar, j1 j1Var, r3.w wVar, r3.j jVar, r3.p pVar) {
        q3.e0 e0Var = j1Var.f12641d;
        r0 r0Var = j1Var.f12657v;
        r0 r0Var2 = j1Var.f12658w;
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        t1 t1Var = new t1(e0Var, r0Var, zVar, 0);
        r3.r rVar = xVar.f13102a;
        rVar.e(wVar, jVar, t1Var, r0Var2);
        r3.b0 b0Var = new r3.b0(xVar, rVar);
        xVar.f13103b.set(b0Var);
        zVar.A = b0Var;
        j1Var.f12642e = b0Var;
        B(j1Var, wVar, pVar);
    }

    public static final b2.r E(b2.r rVar, m3.h hVar, m3.r0 r0Var, u00.k kVar, int i10, boolean z10, int i11, int i12, q3.h hVar2, List list, u00.k kVar2, u00.k kVar3) {
        return rVar.V(b2.o.A).V(new d1.f(hVar, r0Var, hVar2, kVar, i10, z10, i11, i12, list, kVar2, kVar3));
    }

    public static final void F(int i10, int i11) {
        if (!(i10 > 0 && i11 > 0)) {
            g0.a.a("both minLines " + i10 + " and maxLines " + i11 + " must be greater than zero");
        }
        if (i10 <= i11) {
            return;
        }
        g0.a.a("minLines " + i10 + " must be less than or equal to maxLines " + i11);
    }

    public static final void a(final z0.g gVar, final b2.r rVar, final m3.r0 r0Var, final i1 i1Var, final qp.b bVar, final f0.i iVar, final i2.v0 v0Var, final z0.c cVar, final int i10, final char c10, l1.j jVar, final int i11) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-817513499);
        boolean z10 = true;
        int i12 = i11 | (g0Var.g(gVar) ? 4 : 2) | (g0Var.g(rVar) ? 32 : 16) | (g0Var.h(true) ? 256 : 128) | (g0Var.g(null) ? 16384 : 8192) | (g0Var.g(r0Var) ? 131072 : Cast.MAX_MESSAGE_LENGTH) | (g0Var.g(i1Var) ? 1048576 : 524288) | (g0Var.g(bVar) ? 8388608 : 4194304) | (g0Var.i(null) ? 67108864 : 33554432) | (g0Var.g(iVar) ? 536870912 : 268435456);
        int i13 = (g0Var.g(v0Var) ? 4 : 2) | (g0Var.g(cVar) ? 32 : 16) | (g0Var.e(i10) ? 256 : 128) | (g0Var.c(c10) ? 2048 : 1024);
        if ((306782355 & i12) == 306782354 && (i13 & 1171) == 1170) {
            z10 = false;
        }
        if (g0Var.S(i12 & 1, z10)) {
            b(gVar, rVar, r0Var, i1Var, bVar, iVar, v0Var, cVar, i10, c10, z.n.l(g0Var), g0Var, (i12 & 1879048192) | (i12 & 14) | 3072 | (i12 & 112) | (i12 & 896) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12), i13 & 8190);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n(rVar, r0Var, i1Var, bVar, iVar, v0Var, cVar, i10, c10, i11) {
                public final b2.r B;
                public final m3.r0 C;
                public final i1 D;
                public final qp.b E;
                public final f0.i F;
                public final i2.v0 G;
                public final z0.c H;
                public final int I;
                public final char J;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(1);
                    q.a(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void b(final z0.g gVar, final b2.r rVar, final m3.r0 r0Var, final i1 i1Var, final qp.b bVar, final f0.i iVar, final i2.v0 v0Var, final z0.c cVar, final int i10, final char c10, final z.p1 p1Var, l1.j jVar, final int i11, final int i12) {
        int i13;
        int i14;
        char c11;
        z.p1 p1Var2;
        l1.g0 g0Var;
        boolean zBooleanValue;
        k00.c cVar2;
        k00.c iVar2;
        boolean z10;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(1568790509);
        if ((i11 & 6) == 0) {
            i13 = (g0Var2.g(gVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= g0Var2.g(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= g0Var2.h(true) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i11 & 3072) == 0) {
            i13 |= g0Var2.h(false) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= g0Var2.g(null) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= g0Var2.g(r0Var) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= g0Var2.g(i1Var) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= g0Var2.g(bVar) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= g0Var2.i(null) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= g0Var2.g(iVar) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (g0Var2.g(v0Var) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= (i12 & 64) == 0 ? g0Var2.g(cVar) : g0Var2.i(cVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= g0Var2.e(i10) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i12 & 3072) == 0) {
            c11 = c10;
            i14 |= g0Var2.c(c11) ? 2048 : 1024;
        } else {
            c11 = c10;
        }
        if ((i12 & 24576) == 0) {
            p1Var2 = p1Var;
            i14 |= g0Var2.g(p1Var2) ? 16384 : 8192;
        } else {
            p1Var2 = p1Var;
        }
        int i15 = i14;
        int i16 = i13;
        if (g0Var2.S(i16 & 1, ((i16 & 306783379) == 306783378 && (i15 & 9363) == 9362) ? false : true)) {
            g0Var2.X();
            if ((i11 & 1) != 0 && !g0Var2.A()) {
                g0Var2.V();
            }
            g0Var2.s();
            l1.z0 z0VarG = l1.q.G(Character.valueOf(c11), g0Var2);
            Object objN = g0Var2.N();
            l1.c cVar3 = l1.i.f9868a;
            if (objN == cVar3) {
                objN = new n1(z0VarG);
                g0Var2.n0(objN);
            }
            final n1 n1Var = (n1) objN;
            boolean zI = g0Var2.i(n1Var);
            Object objN2 = g0Var2.N();
            if (zI || objN2 == cVar3) {
                objN2 = new l(n1Var, null, 0);
                g0Var2.n0(objN2);
            }
            l1.q.i(n1Var, g0Var2, (u00.n) objN2);
            if (i10 == 1) {
                g0Var2.c0(74207180);
                Context context = (Context) g0Var2.k(c3.o0.f2722b);
                boolean zG = g0Var2.g(context);
                pp.d dVar = f12676a;
                boolean zG2 = zG | g0Var2.g(dVar);
                Object objN3 = g0Var2.N();
                if (zG2 || objN3 == cVar3) {
                    objN3 = (o) dVar.invoke(context);
                    g0Var2.n0(objN3);
                }
                o oVar = (o) objN3;
                boolean zG3 = g0Var2.g(oVar);
                Object objN4 = g0Var2.N();
                if (zG3 || objN4 == cVar3) {
                    oVar.getClass();
                    try {
                        z10 = Settings.System.getInt(oVar.f12671a, "show_password") > 0;
                    } catch (Exception e3) {
                        Log.w("BasicSecureTextField", "Failed to fetch show password setting, using value: true", e3);
                    }
                    objN4 = l1.q.z(Boolean.valueOf(z10));
                    g0Var2.n0(objN4);
                }
                l1.z0 z0Var = (l1.z0) objN4;
                boolean zG4 = g0Var2.g(oVar);
                Object objN5 = g0Var2.N();
                if (zG4 || objN5 == cVar3) {
                    objN5 = new p(oVar, z0Var, Handler.createAsync(Looper.getMainLooper()));
                    g0Var2.n0(objN5);
                }
                p pVar = (p) objN5;
                boolean zI2 = g0Var2.i(oVar) | g0Var2.i(pVar);
                Object objN6 = g0Var2.N();
                if (zI2 || objN6 == cVar3) {
                    objN6 = new mu.q(oVar, pVar, 3);
                    g0Var2.n0(objN6);
                }
                l1.q.c(oVar, pVar, (u00.k) objN6, g0Var2);
                zBooleanValue = ((Boolean) z0Var.getValue()).booleanValue();
                g0Var2.r(false);
            } else {
                g0Var2.c0(-1994543479);
                g0Var2.r(false);
                zBooleanValue = false;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            boolean zH = g0Var2.h(zBooleanValue) | g0Var2.i(n1Var);
            Object objN7 = g0Var2.N();
            if (zH || objN7 == cVar3) {
                cVar2 = null;
                objN7 = new ab.o(zBooleanValue, n1Var, cVar2, 7);
                g0Var2.n0(objN7);
            } else {
                cVar2 = null;
            }
            l1.q.i(boolValueOf, g0Var2, (u00.n) objN7);
            boolean z11 = (((i15 & 896) ^ 384) > 256 && g0Var2.e(i10)) || (i15 & 384) == 256;
            Object objN8 = g0Var2.N();
            if (z11 || objN8 == cVar3) {
                if (i10 == 1) {
                    iVar2 = n1Var.f12668c;
                } else {
                    iVar2 = i10 == 2 ? new i(z0VarG, 0) : cVar2;
                }
                g0Var2.n0(iVar2);
                objN8 = iVar2;
            }
            final a1.r rVar2 = (a1.r) objN8;
            Object objN9 = g0Var2.N();
            if (objN9 == cVar3) {
                objN9 = new pp.d(2);
                g0Var2.n0(objN9);
            }
            b2.r rVarC = j3.q.c(rVar, false, (u00.k) objN9);
            Object objN10 = g0Var2.N();
            if (objN10 == cVar3) {
                objN10 = m.A;
                g0Var2.n0(objN10);
            }
            final b2.r rVarV = t2.d.e(rVarC, (u00.k) objN10).V(zBooleanValue ? n1Var.f12669d : b2.o.A);
            final boolean z12 = zBooleanValue;
            g0Var = g0Var2;
            final z.p1 p1Var3 = p1Var2;
            k(v1.d.d(135148049, new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    l1.j jVar2 = (l1.j) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    l1.g0 g0Var3 = (l1.g0) jVar2;
                    if (g0Var3.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                        c0.c(gVar, rVarV, true, z12 ? n1Var.f12667b : null, r0Var, i1Var, bVar, z0.e.B, iVar, v0Var, rVar2, cVar, p1Var3, true, jVar2, 100663296, 1572864, 8192);
                    } else {
                        g0Var3.V();
                    }
                    return g00.b0.a;
                }
            }, g0Var), g0Var, 6);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(i11 | 1);
                    int iK2 = l1.q.K(i12);
                    q.b(gVar, rVar, r0Var, i1Var, bVar, iVar, v0Var, cVar, i10, c10, p1Var, (l1.j) obj, iK, iK2);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void c(final m3.h hVar, final b2.r rVar, final m3.r0 r0Var, final u00.k kVar, final int i10, final boolean z10, final int i11, final int i12, final Map map, l1.j jVar, final int i13, final int i14) {
        int i15;
        b2.r rVar2;
        u00.k kVar2;
        int i16;
        int i17;
        boolean z11;
        List list;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1343466571);
        if ((i13 & 6) == 0) {
            i15 = (g0Var.g(hVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            rVar2 = rVar;
            i15 |= g0Var.g(rVar2) ? 32 : 16;
        } else {
            rVar2 = rVar;
        }
        if ((i13 & 384) == 0) {
            i15 |= g0Var.g(r0Var) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i13 & 3072) == 0) {
            kVar2 = kVar;
            i15 |= g0Var.i(kVar2) ? 2048 : 1024;
        } else {
            kVar2 = kVar;
        }
        if ((i13 & 24576) == 0) {
            i15 |= g0Var.e(i10) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i15 |= g0Var.h(z10) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if ((1572864 & i13) == 0) {
            i15 |= g0Var.e(i11) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i15 |= g0Var.e(i12) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i15 |= g0Var.i(map) ? 67108864 : 33554432;
        }
        int i18 = i15 | 805306368;
        if ((i14 & 6) == 0) {
            i16 = i14 | ((i14 & 8) == 0 ? g0Var.g(null) : g0Var.i(null) ? 4 : 2);
        } else {
            i16 = i14;
        }
        boolean z12 = false;
        if (g0Var.S(i18 & 1, ((i18 & 306783379) == 306783378 && (i16 & 3) == 2) ? false : true)) {
            F(i12, i11);
            if (g0Var.k(e1.i0.f4969a) != null) {
                throw new ClassCastException();
            }
            g0Var.c0(1588759409);
            g0Var.r(false);
            g00.k kVar3 = e.f12583a;
            int length = hVar.B.length();
            List list2 = hVar.A;
            if (list2 == null) {
                i17 = i18;
                z11 = z12;
                break;
            }
            int size = list2.size();
            int i19 = 0;
            while (true) {
                if (i19 >= size) {
                    i17 = i18;
                    z11 = z12;
                    break;
                }
                m3.f fVar = (m3.f) list2.get(i19);
                i17 = i18;
                if (fVar.f10423a instanceof m3.k0) {
                    list = list2;
                    if ("androidx.compose.foundation.text.inlineContent".equals(fVar.f10426d)) {
                        int i20 = fVar.f10424b;
                        int i21 = fVar.f10425c;
                        z12 = false;
                        if (m3.i.b(0, length, i20, i21)) {
                            z11 = true;
                            break;
                        }
                    }
                    i19++;
                    i18 = i17;
                    list2 = list;
                } else {
                    list = list2;
                }
                z12 = false;
                i19++;
                i18 = i17;
                list2 = list;
            }
            boolean zR = f50.k.r(hVar);
            q3.h hVar2 = (q3.h) g0Var.k(c3.o1.f2737k);
            if (z11 || zR) {
                g0Var.c0(1590022070);
                boolean z13 = (i17 & 14) != 4 ? z12 : true;
                Object objN = g0Var.N();
                l1.c cVar = l1.i.f9868a;
                if (z13 || objN == cVar) {
                    objN = l1.q.z(hVar);
                    g0Var.n0(objN);
                }
                l1.z0 z0Var = (l1.z0) objN;
                m3.h hVar3 = (m3.h) z0Var.getValue();
                boolean zG = g0Var.g(z0Var);
                Object objN2 = g0Var.N();
                if (zG || objN2 == cVar) {
                    objN2 = new o2(z0Var, 20);
                    g0Var.n0(objN2);
                }
                int i22 = i17 << 6;
                l(rVar, hVar3, kVar, z11, map, r0Var, i10, z10, i11, i12, hVar2, (u00.k) objN2, g0Var, ((i17 >> 3) & 910) | ((i17 >> 12) & 57344) | ((i17 << 9) & 458752) | (3670016 & i22) | (29360128 & i22) | (234881024 & i22) | (i22 & 1879048192), ((i17 >> 21) & 896) | (57344 & (i16 << 12)));
                g0Var.r(z12);
            } else {
                g0Var.c0(1589006262);
                j0.a(hVar, r0Var, hVar2, null, g0Var);
                b2.r rVarE = E(rVar2, hVar, r0Var, kVar2, i10, z10, i11, i12, hVar2, null, null, null);
                d dVar = d.f12580c;
                int iHashCode = Long.hashCode(g0Var.T);
                b2.r rVarC = b2.a.c(rVarE, g0Var);
                l1.m1 m1VarM = g0Var.m();
                b3.i.f2042c.getClass();
                b3.g gVar = b3.h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(dVar, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM, g0Var, b3.h.f2038e);
                l1.q.E(g0Var, b3.h.f2041h);
                l1.q.I(rVarC, g0Var, b3.h.f2037d);
                l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
                g0Var.r(true);
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q.c(hVar, rVar, r0Var, kVar, i10, z10, i11, i12, map, (l1.j) obj, l1.q.K(i13 | 1), l1.q.K(i14));
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void d(final String str, final b2.r rVar, final m3.r0 r0Var, u00.k kVar, int i10, boolean z10, final int i11, int i12, l1.j jVar, final int i13, final int i14) {
        int i15;
        final u00.k kVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean zI;
        int i26;
        boolean z11;
        final int i27;
        final int i28;
        final boolean z12;
        l1.r1 r1VarT;
        u00.k kVar3;
        int i29;
        boolean z13;
        q3.h hVar;
        Executor executor;
        int i30;
        boolean z14;
        int i31;
        boolean z15;
        u00.k kVar4;
        b2.r rVarV;
        b3.g gVar;
        int i32;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1040751001);
        if ((i13 & 6) == 0) {
            i15 = (g0Var.g(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= g0Var.g(rVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= g0Var.g(r0Var) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        int i33 = i14 & 8;
        if (i33 == 0) {
            if ((i13 & 3072) == 0) {
                kVar2 = kVar;
                i15 |= g0Var.i(kVar2) ? 2048 : 1024;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    i17 = i10;
                    if (g0Var.e(i17)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i15 |= i18;
                }
                i19 = i14 & 32;
                if (i19 != 0) {
                    if ((196608 & i13) == 0) {
                        if (g0Var.h(z10)) {
                            i20 = 131072;
                        } else {
                            i20 = Cast.MAX_MESSAGE_LENGTH;
                        }
                        i15 |= i20;
                    }
                    if ((1572864 & i13) == 0) {
                        if (g0Var.e(i11)) {
                            i32 = 1048576;
                        } else {
                            i32 = 524288;
                        }
                        i15 |= i32;
                    }
                    i21 = i14 & Cast.MAX_NAMESPACE_LENGTH;
                    if (i21 != 0) {
                        if ((12582912 & i13) == 0) {
                            i22 = i12;
                            if (g0Var.e(i22)) {
                                i23 = 8388608;
                            } else {
                                i23 = 4194304;
                            }
                            i15 |= i23;
                        }
                        i24 = i15 | 100663296;
                        i25 = i15;
                        if ((i14 & 512) != 0) {
                            i24 = i25 | 905969664;
                        } else if ((i13 & 805306368) == 0) {
                            if ((i13 & 1073741824) == 0) {
                                zI = g0Var.g(null);
                            } else {
                                zI = g0Var.i(null);
                            }
                            if (zI) {
                                i26 = 536870912;
                            } else {
                                i26 = 268435456;
                            }
                            i24 |= i26;
                        }
                        if ((i24 & 306783379) != 306783378) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (g0Var.S(i24 & 1, z11)) {
                            if (i33 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar2;
                            }
                            if (i16 != 0) {
                                i29 = 1;
                            } else {
                                i29 = i17;
                            }
                            if (i19 != 0) {
                                z13 = true;
                            } else {
                                z13 = z10;
                            }
                            if (i21 != 0) {
                                i22 = 1;
                            }
                            F(i22, i11);
                            if (g0Var.k(e1.i0.f4969a) == null) {
                                throw new ClassCastException();
                            }
                            g0Var.c0(356914239);
                            g0Var.r(false);
                            hVar = (q3.h) g0Var.k(c3.o1.f2737k);
                            executor = (Executor) g0Var.k(j0.f12636a);
                            if (executor == null && j0.b(str.length())) {
                                g0Var.c0(1254298614);
                                try {
                                    executor.execute(new com.revenuecat.purchases.d(r0Var, (y3.m) g0Var.k(c3.o1.f2738n), str, (y3.c) g0Var.k(c3.o1.f2734h), hVar, 7));
                                } catch (RejectedExecutionException unused) {
                                }
                                g0Var.r(false);
                            } else {
                                g0Var.c0(1255914055);
                                g0Var.r(false);
                            }
                            if (kVar3 == null) {
                                g0Var.c0(357875859);
                                g0Var.r(false);
                                i30 = i22;
                                z14 = z13;
                                i31 = i29;
                                rVarV = rVar.V(new d1.j(str, r0Var, hVar, i31, z14, i11, i30));
                                z15 = true;
                                kVar4 = kVar3;
                            } else {
                                i30 = i22;
                                z14 = z13;
                                i31 = i29;
                                g0Var.c0(357232113);
                                z15 = true;
                                kVar4 = kVar3;
                                b2.r rVarE = E(rVar, new m3.h(str), r0Var, kVar4, i31, z14, i11, i30, (q3.h) g0Var.k(c3.o1.f2737k), null, null, null);
                                g0Var.r(false);
                                rVarV = rVarE;
                            }
                            d dVar = d.f12580c;
                            int iHashCode = Long.hashCode(g0Var.T);
                            b2.r rVarC = b2.a.c(rVarV, g0Var);
                            l1.m1 m1VarM = g0Var.m();
                            b3.i.f2042c.getClass();
                            gVar = b3.h.f2035b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(dVar, g0Var, b3.h.f2039f);
                            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
                            l1.q.E(g0Var, b3.h.f2041h);
                            l1.q.I(rVarC, g0Var, b3.h.f2037d);
                            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
                            g0Var.r(z15);
                            z12 = z14;
                            i28 = i30;
                            i27 = i31;
                            kVar2 = kVar4;
                        } else {
                            g0Var.V();
                            i27 = i17;
                            i28 = i22;
                            z12 = z10;
                        }
                        r1VarT = g0Var.t();
                        if (r1VarT != null) {
                            r1VarT.f9921d = new u00.n() {
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    q.d(str, rVar, r0Var, kVar2, i27, z12, i11, i28, (l1.j) obj, l1.q.K(i13 | 1), i14);
                                    return g00.b0.a;
                                }
                            };
                        }
                    }
                    i15 |= 12582912;
                    i22 = i12;
                    i24 = i15 | 100663296;
                    i25 = i15;
                    if ((i14 & 512) != 0) {
                        i24 = i25 | 905969664;
                    } else if ((i13 & 805306368) == 0) {
                        if ((i13 & 1073741824) == 0) {
                            zI = g0Var.g(null);
                        } else {
                            zI = g0Var.i(null);
                        }
                        if (zI) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                        i24 |= i26;
                    }
                    if ((i24 & 306783379) != 306783378) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (g0Var.S(i24 & 1, z11)) {
                        if (i33 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i16 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i17;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i21 != 0) {
                            i22 = 1;
                        }
                        F(i22, i11);
                        if (g0Var.k(e1.i0.f4969a) == null) {
                            throw new ClassCastException();
                        }
                        g0Var.c0(356914239);
                        g0Var.r(false);
                        hVar = (q3.h) g0Var.k(c3.o1.f2737k);
                        executor = (Executor) g0Var.k(j0.f12636a);
                        if (executor == null) {
                            g0Var.c0(1255914055);
                            g0Var.r(false);
                        } else {
                            g0Var.c0(1255914055);
                            g0Var.r(false);
                        }
                        if (kVar3 == null) {
                            g0Var.c0(357875859);
                            g0Var.r(false);
                            i30 = i22;
                            z14 = z13;
                            i31 = i29;
                            rVarV = rVar.V(new d1.j(str, r0Var, hVar, i31, z14, i11, i30));
                            z15 = true;
                            kVar4 = kVar3;
                        } else {
                            i30 = i22;
                            z14 = z13;
                            i31 = i29;
                            g0Var.c0(357232113);
                            z15 = true;
                            kVar4 = kVar3;
                            b2.r rVarE2 = E(rVar, new m3.h(str), r0Var, kVar4, i31, z14, i11, i30, (q3.h) g0Var.k(c3.o1.f2737k), null, null, null);
                            g0Var.r(false);
                            rVarV = rVarE2;
                        }
                        d dVar2 = d.f12580c;
                        int iHashCode2 = Long.hashCode(g0Var.T);
                        b2.r rVarC2 = b2.a.c(rVarV, g0Var);
                        l1.m1 m1VarM2 = g0Var.m();
                        b3.i.f2042c.getClass();
                        gVar = b3.h.f2035b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(dVar2, g0Var, b3.h.f2039f);
                        l1.q.I(m1VarM2, g0Var, b3.h.f2038e);
                        l1.q.E(g0Var, b3.h.f2041h);
                        l1.q.I(rVarC2, g0Var, b3.h.f2037d);
                        l1.q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.f2040g);
                        g0Var.r(z15);
                        z12 = z14;
                        i28 = i30;
                        i27 = i31;
                        kVar2 = kVar4;
                    } else {
                        g0Var.V();
                        i27 = i17;
                        i28 = i22;
                        z12 = z10;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new u00.n() {
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                q.d(str, rVar, r0Var, kVar2, i27, z12, i11, i28, (l1.j) obj, l1.q.K(i13 | 1), i14);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i15 |= 196608;
                if ((1572864 & i13) == 0) {
                    if (g0Var.e(i11)) {
                        i32 = 1048576;
                    } else {
                        i32 = 524288;
                    }
                    i15 |= i32;
                }
                i21 = i14 & Cast.MAX_NAMESPACE_LENGTH;
                if (i21 != 0) {
                    if ((12582912 & i13) == 0) {
                        i22 = i12;
                        if (g0Var.e(i22)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i15 |= i23;
                    }
                    i24 = i15 | 100663296;
                    i25 = i15;
                    if ((i14 & 512) != 0) {
                        i24 = i25 | 905969664;
                    } else if ((i13 & 805306368) == 0) {
                        if ((i13 & 1073741824) == 0) {
                            zI = g0Var.g(null);
                        } else {
                            zI = g0Var.i(null);
                        }
                        if (zI) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                        i24 |= i26;
                    }
                    if ((i24 & 306783379) != 306783378) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (g0Var.S(i24 & 1, z11)) {
                        if (i33 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i16 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i17;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i21 != 0) {
                            i22 = 1;
                        }
                        F(i22, i11);
                        if (g0Var.k(e1.i0.f4969a) == null) {
                            throw new ClassCastException();
                        }
                        g0Var.c0(356914239);
                        g0Var.r(false);
                        hVar = (q3.h) g0Var.k(c3.o1.f2737k);
                        executor = (Executor) g0Var.k(j0.f12636a);
                        if (executor == null) {
                            g0Var.c0(1255914055);
                            g0Var.r(false);
                        } else {
                            g0Var.c0(1255914055);
                            g0Var.r(false);
                        }
                        if (kVar3 == null) {
                            g0Var.c0(357875859);
                            g0Var.r(false);
                            i30 = i22;
                            z14 = z13;
                            i31 = i29;
                            rVarV = rVar.V(new d1.j(str, r0Var, hVar, i31, z14, i11, i30));
                            z15 = true;
                            kVar4 = kVar3;
                        } else {
                            i30 = i22;
                            z14 = z13;
                            i31 = i29;
                            g0Var.c0(357232113);
                            z15 = true;
                            kVar4 = kVar3;
                            b2.r rVarE3 = E(rVar, new m3.h(str), r0Var, kVar4, i31, z14, i11, i30, (q3.h) g0Var.k(c3.o1.f2737k), null, null, null);
                            g0Var.r(false);
                            rVarV = rVarE3;
                        }
                        d dVar3 = d.f12580c;
                        int iHashCode3 = Long.hashCode(g0Var.T);
                        b2.r rVarC3 = b2.a.c(rVarV, g0Var);
                        l1.m1 m1VarM3 = g0Var.m();
                        b3.i.f2042c.getClass();
                        gVar = b3.h.f2035b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(dVar3, g0Var, b3.h.f2039f);
                        l1.q.I(m1VarM3, g0Var, b3.h.f2038e);
                        l1.q.E(g0Var, b3.h.f2041h);
                        l1.q.I(rVarC3, g0Var, b3.h.f2037d);
                        l1.q.I(Integer.valueOf(iHashCode3), g0Var, b3.h.f2040g);
                        g0Var.r(z15);
                        z12 = z14;
                        i28 = i30;
                        i27 = i31;
                        kVar2 = kVar4;
                    } else {
                        g0Var.V();
                        i27 = i17;
                        i28 = i22;
                        z12 = z10;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new u00.n() {
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                q.d(str, rVar, r0Var, kVar2, i27, z12, i11, i28, (l1.j) obj, l1.q.K(i13 | 1), i14);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i15 |= 12582912;
                i22 = i12;
                i24 = i15 | 100663296;
                i25 = i15;
                if ((i14 & 512) != 0) {
                    i24 = i25 | 905969664;
                } else if ((i13 & 805306368) == 0) {
                    if ((i13 & 1073741824) == 0) {
                        zI = g0Var.g(null);
                    } else {
                        zI = g0Var.i(null);
                    }
                    if (zI) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i24 |= i26;
                }
                if ((i24 & 306783379) != 306783378) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (g0Var.S(i24 & 1, z11)) {
                    if (i33 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i16 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i17;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i21 != 0) {
                        i22 = 1;
                    }
                    F(i22, i11);
                    if (g0Var.k(e1.i0.f4969a) == null) {
                        throw new ClassCastException();
                    }
                    g0Var.c0(356914239);
                    g0Var.r(false);
                    hVar = (q3.h) g0Var.k(c3.o1.f2737k);
                    executor = (Executor) g0Var.k(j0.f12636a);
                    if (executor == null) {
                        g0Var.c0(1255914055);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(1255914055);
                        g0Var.r(false);
                    }
                    if (kVar3 == null) {
                        g0Var.c0(357875859);
                        g0Var.r(false);
                        i30 = i22;
                        z14 = z13;
                        i31 = i29;
                        rVarV = rVar.V(new d1.j(str, r0Var, hVar, i31, z14, i11, i30));
                        z15 = true;
                        kVar4 = kVar3;
                    } else {
                        i30 = i22;
                        z14 = z13;
                        i31 = i29;
                        g0Var.c0(357232113);
                        z15 = true;
                        kVar4 = kVar3;
                        b2.r rVarE4 = E(rVar, new m3.h(str), r0Var, kVar4, i31, z14, i11, i30, (q3.h) g0Var.k(c3.o1.f2737k), null, null, null);
                        g0Var.r(false);
                        rVarV = rVarE4;
                    }
                    d dVar4 = d.f12580c;
                    int iHashCode4 = Long.hashCode(g0Var.T);
                    b2.r rVarC4 = b2.a.c(rVarV, g0Var);
                    l1.m1 m1VarM4 = g0Var.m();
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(dVar4, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM4, g0Var, b3.h.f2038e);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC4, g0Var, b3.h.f2037d);
                    l1.q.I(Integer.valueOf(iHashCode4), g0Var, b3.h.f2040g);
                    g0Var.r(z15);
                    z12 = z14;
                    i28 = i30;
                    i27 = i31;
                    kVar2 = kVar4;
                } else {
                    g0Var.V();
                    i27 = i17;
                    i28 = i22;
                    z12 = z10;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new u00.n() {
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            q.d(str, rVar, r0Var, kVar2, i27, z12, i11, i28, (l1.j) obj, l1.q.K(i13 | 1), i14);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i15 |= 24576;
            i17 = i10;
            i19 = i14 & 32;
            if (i19 != 0) {
                if ((196608 & i13) == 0) {
                    if (g0Var.h(z10)) {
                        i20 = 131072;
                    } else {
                        i20 = Cast.MAX_MESSAGE_LENGTH;
                    }
                    i15 |= i20;
                }
                if ((1572864 & i13) == 0) {
                    if (g0Var.e(i11)) {
                        i32 = 1048576;
                    } else {
                        i32 = 524288;
                    }
                    i15 |= i32;
                }
                i21 = i14 & Cast.MAX_NAMESPACE_LENGTH;
                if (i21 != 0) {
                    if ((12582912 & i13) == 0) {
                        i22 = i12;
                        if (g0Var.e(i22)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i15 |= i23;
                    }
                    i24 = i15 | 100663296;
                    i25 = i15;
                    if ((i14 & 512) != 0) {
                        i24 = i25 | 905969664;
                    } else if ((i13 & 805306368) == 0) {
                        if ((i13 & 1073741824) == 0) {
                            zI = g0Var.g(null);
                        } else {
                            zI = g0Var.i(null);
                        }
                        if (zI) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                        i24 |= i26;
                    }
                    if ((i24 & 306783379) != 306783378) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (g0Var.S(i24 & 1, z11)) {
                        if (i33 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i16 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i17;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i21 != 0) {
                            i22 = 1;
                        }
                        F(i22, i11);
                        if (g0Var.k(e1.i0.f4969a) == null) {
                            throw new ClassCastException();
                        }
                        g0Var.c0(356914239);
                        g0Var.r(false);
                        hVar = (q3.h) g0Var.k(c3.o1.f2737k);
                        executor = (Executor) g0Var.k(j0.f12636a);
                        if (executor == null) {
                            g0Var.c0(1255914055);
                            g0Var.r(false);
                        } else {
                            g0Var.c0(1255914055);
                            g0Var.r(false);
                        }
                        if (kVar3 == null) {
                            g0Var.c0(357875859);
                            g0Var.r(false);
                            i30 = i22;
                            z14 = z13;
                            i31 = i29;
                            rVarV = rVar.V(new d1.j(str, r0Var, hVar, i31, z14, i11, i30));
                            z15 = true;
                            kVar4 = kVar3;
                        } else {
                            i30 = i22;
                            z14 = z13;
                            i31 = i29;
                            g0Var.c0(357232113);
                            z15 = true;
                            kVar4 = kVar3;
                            b2.r rVarE5 = E(rVar, new m3.h(str), r0Var, kVar4, i31, z14, i11, i30, (q3.h) g0Var.k(c3.o1.f2737k), null, null, null);
                            g0Var.r(false);
                            rVarV = rVarE5;
                        }
                        d dVar5 = d.f12580c;
                        int iHashCode5 = Long.hashCode(g0Var.T);
                        b2.r rVarC5 = b2.a.c(rVarV, g0Var);
                        l1.m1 m1VarM5 = g0Var.m();
                        b3.i.f2042c.getClass();
                        gVar = b3.h.f2035b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(dVar5, g0Var, b3.h.f2039f);
                        l1.q.I(m1VarM5, g0Var, b3.h.f2038e);
                        l1.q.E(g0Var, b3.h.f2041h);
                        l1.q.I(rVarC5, g0Var, b3.h.f2037d);
                        l1.q.I(Integer.valueOf(iHashCode5), g0Var, b3.h.f2040g);
                        g0Var.r(z15);
                        z12 = z14;
                        i28 = i30;
                        i27 = i31;
                        kVar2 = kVar4;
                    } else {
                        g0Var.V();
                        i27 = i17;
                        i28 = i22;
                        z12 = z10;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new u00.n() {
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                q.d(str, rVar, r0Var, kVar2, i27, z12, i11, i28, (l1.j) obj, l1.q.K(i13 | 1), i14);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i15 |= 12582912;
                i22 = i12;
                i24 = i15 | 100663296;
                i25 = i15;
                if ((i14 & 512) != 0) {
                    i24 = i25 | 905969664;
                } else if ((i13 & 805306368) == 0) {
                    if ((i13 & 1073741824) == 0) {
                        zI = g0Var.g(null);
                    } else {
                        zI = g0Var.i(null);
                    }
                    if (zI) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i24 |= i26;
                }
                if ((i24 & 306783379) != 306783378) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (g0Var.S(i24 & 1, z11)) {
                    if (i33 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i16 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i17;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i21 != 0) {
                        i22 = 1;
                    }
                    F(i22, i11);
                    if (g0Var.k(e1.i0.f4969a) == null) {
                        throw new ClassCastException();
                    }
                    g0Var.c0(356914239);
                    g0Var.r(false);
                    hVar = (q3.h) g0Var.k(c3.o1.f2737k);
                    executor = (Executor) g0Var.k(j0.f12636a);
                    if (executor == null) {
                        g0Var.c0(1255914055);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(1255914055);
                        g0Var.r(false);
                    }
                    if (kVar3 == null) {
                        g0Var.c0(357875859);
                        g0Var.r(false);
                        i30 = i22;
                        z14 = z13;
                        i31 = i29;
                        rVarV = rVar.V(new d1.j(str, r0Var, hVar, i31, z14, i11, i30));
                        z15 = true;
                        kVar4 = kVar3;
                    } else {
                        i30 = i22;
                        z14 = z13;
                        i31 = i29;
                        g0Var.c0(357232113);
                        z15 = true;
                        kVar4 = kVar3;
                        b2.r rVarE6 = E(rVar, new m3.h(str), r0Var, kVar4, i31, z14, i11, i30, (q3.h) g0Var.k(c3.o1.f2737k), null, null, null);
                        g0Var.r(false);
                        rVarV = rVarE6;
                    }
                    d dVar6 = d.f12580c;
                    int iHashCode6 = Long.hashCode(g0Var.T);
                    b2.r rVarC6 = b2.a.c(rVarV, g0Var);
                    l1.m1 m1VarM6 = g0Var.m();
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(dVar6, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM6, g0Var, b3.h.f2038e);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC6, g0Var, b3.h.f2037d);
                    l1.q.I(Integer.valueOf(iHashCode6), g0Var, b3.h.f2040g);
                    g0Var.r(z15);
                    z12 = z14;
                    i28 = i30;
                    i27 = i31;
                    kVar2 = kVar4;
                } else {
                    g0Var.V();
                    i27 = i17;
                    i28 = i22;
                    z12 = z10;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new u00.n() {
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            q.d(str, rVar, r0Var, kVar2, i27, z12, i11, i28, (l1.j) obj, l1.q.K(i13 | 1), i14);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i15 |= 196608;
            if ((1572864 & i13) == 0) {
                if (g0Var.e(i11)) {
                    i32 = 1048576;
                } else {
                    i32 = 524288;
                }
                i15 |= i32;
            }
            i21 = i14 & Cast.MAX_NAMESPACE_LENGTH;
            if (i21 != 0) {
                if ((12582912 & i13) == 0) {
                    i22 = i12;
                    if (g0Var.e(i22)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i15 |= i23;
                }
                i24 = i15 | 100663296;
                i25 = i15;
                if ((i14 & 512) != 0) {
                    i24 = i25 | 905969664;
                } else if ((i13 & 805306368) == 0) {
                    if ((i13 & 1073741824) == 0) {
                        zI = g0Var.g(null);
                    } else {
                        zI = g0Var.i(null);
                    }
                    if (zI) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i24 |= i26;
                }
                if ((i24 & 306783379) != 306783378) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (g0Var.S(i24 & 1, z11)) {
                    if (i33 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i16 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i17;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i21 != 0) {
                        i22 = 1;
                    }
                    F(i22, i11);
                    if (g0Var.k(e1.i0.f4969a) == null) {
                        throw new ClassCastException();
                    }
                    g0Var.c0(356914239);
                    g0Var.r(false);
                    hVar = (q3.h) g0Var.k(c3.o1.f2737k);
                    executor = (Executor) g0Var.k(j0.f12636a);
                    if (executor == null) {
                        g0Var.c0(1255914055);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(1255914055);
                        g0Var.r(false);
                    }
                    if (kVar3 == null) {
                        g0Var.c0(357875859);
                        g0Var.r(false);
                        i30 = i22;
                        z14 = z13;
                        i31 = i29;
                        rVarV = rVar.V(new d1.j(str, r0Var, hVar, i31, z14, i11, i30));
                        z15 = true;
                        kVar4 = kVar3;
                    } else {
                        i30 = i22;
                        z14 = z13;
                        i31 = i29;
                        g0Var.c0(357232113);
                        z15 = true;
                        kVar4 = kVar3;
                        b2.r rVarE7 = E(rVar, new m3.h(str), r0Var, kVar4, i31, z14, i11, i30, (q3.h) g0Var.k(c3.o1.f2737k), null, null, null);
                        g0Var.r(false);
                        rVarV = rVarE7;
                    }
                    d dVar7 = d.f12580c;
                    int iHashCode7 = Long.hashCode(g0Var.T);
                    b2.r rVarC7 = b2.a.c(rVarV, g0Var);
                    l1.m1 m1VarM7 = g0Var.m();
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(dVar7, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM7, g0Var, b3.h.f2038e);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC7, g0Var, b3.h.f2037d);
                    l1.q.I(Integer.valueOf(iHashCode7), g0Var, b3.h.f2040g);
                    g0Var.r(z15);
                    z12 = z14;
                    i28 = i30;
                    i27 = i31;
                    kVar2 = kVar4;
                } else {
                    g0Var.V();
                    i27 = i17;
                    i28 = i22;
                    z12 = z10;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new u00.n() {
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            q.d(str, rVar, r0Var, kVar2, i27, z12, i11, i28, (l1.j) obj, l1.q.K(i13 | 1), i14);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i15 |= 12582912;
            i22 = i12;
            i24 = i15 | 100663296;
            i25 = i15;
            if ((i14 & 512) != 0) {
                i24 = i25 | 905969664;
            } else if ((i13 & 805306368) == 0) {
                if ((i13 & 1073741824) == 0) {
                    zI = g0Var.g(null);
                } else {
                    zI = g0Var.i(null);
                }
                if (zI) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i24 |= i26;
            }
            if ((i24 & 306783379) != 306783378) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (g0Var.S(i24 & 1, z11)) {
                if (i33 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar2;
                }
                if (i16 != 0) {
                    i29 = 1;
                } else {
                    i29 = i17;
                }
                if (i19 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i21 != 0) {
                    i22 = 1;
                }
                F(i22, i11);
                if (g0Var.k(e1.i0.f4969a) == null) {
                    throw new ClassCastException();
                }
                g0Var.c0(356914239);
                g0Var.r(false);
                hVar = (q3.h) g0Var.k(c3.o1.f2737k);
                executor = (Executor) g0Var.k(j0.f12636a);
                if (executor == null) {
                    g0Var.c0(1255914055);
                    g0Var.r(false);
                } else {
                    g0Var.c0(1255914055);
                    g0Var.r(false);
                }
                if (kVar3 == null) {
                    g0Var.c0(357875859);
                    g0Var.r(false);
                    i30 = i22;
                    z14 = z13;
                    i31 = i29;
                    rVarV = rVar.V(new d1.j(str, r0Var, hVar, i31, z14, i11, i30));
                    z15 = true;
                    kVar4 = kVar3;
                } else {
                    i30 = i22;
                    z14 = z13;
                    i31 = i29;
                    g0Var.c0(357232113);
                    z15 = true;
                    kVar4 = kVar3;
                    b2.r rVarE8 = E(rVar, new m3.h(str), r0Var, kVar4, i31, z14, i11, i30, (q3.h) g0Var.k(c3.o1.f2737k), null, null, null);
                    g0Var.r(false);
                    rVarV = rVarE8;
                }
                d dVar8 = d.f12580c;
                int iHashCode8 = Long.hashCode(g0Var.T);
                b2.r rVarC8 = b2.a.c(rVarV, g0Var);
                l1.m1 m1VarM8 = g0Var.m();
                b3.i.f2042c.getClass();
                gVar = b3.h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(dVar8, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM8, g0Var, b3.h.f2038e);
                l1.q.E(g0Var, b3.h.f2041h);
                l1.q.I(rVarC8, g0Var, b3.h.f2037d);
                l1.q.I(Integer.valueOf(iHashCode8), g0Var, b3.h.f2040g);
                g0Var.r(z15);
                z12 = z14;
                i28 = i30;
                i27 = i31;
                kVar2 = kVar4;
            } else {
                g0Var.V();
                i27 = i17;
                i28 = i22;
                z12 = z10;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new u00.n() {
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        q.d(str, rVar, r0Var, kVar2, i27, z12, i11, i28, (l1.j) obj, l1.q.K(i13 | 1), i14);
                        return g00.b0.a;
                    }
                };
            }
        }
        i15 |= 3072;
        kVar2 = kVar;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                i17 = i10;
                if (g0Var.e(i17)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i15 |= i18;
            }
            i19 = i14 & 32;
            if (i19 != 0) {
                if ((196608 & i13) == 0) {
                    if (g0Var.h(z10)) {
                        i20 = 131072;
                    } else {
                        i20 = Cast.MAX_MESSAGE_LENGTH;
                    }
                    i15 |= i20;
                }
                if ((1572864 & i13) == 0) {
                    if (g0Var.e(i11)) {
                        i32 = 1048576;
                    } else {
                        i32 = 524288;
                    }
                    i15 |= i32;
                }
                i21 = i14 & Cast.MAX_NAMESPACE_LENGTH;
                if (i21 != 0) {
                    if ((12582912 & i13) == 0) {
                        i22 = i12;
                        if (g0Var.e(i22)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i15 |= i23;
                    }
                    i24 = i15 | 100663296;
                    i25 = i15;
                    if ((i14 & 512) != 0) {
                        i24 = i25 | 905969664;
                    } else if ((i13 & 805306368) == 0) {
                        if ((i13 & 1073741824) == 0) {
                            zI = g0Var.g(null);
                        } else {
                            zI = g0Var.i(null);
                        }
                        if (zI) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                        i24 |= i26;
                    }
                    if ((i24 & 306783379) != 306783378) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (g0Var.S(i24 & 1, z11)) {
                        if (i33 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar2;
                        }
                        if (i16 != 0) {
                            i29 = 1;
                        } else {
                            i29 = i17;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        if (i21 != 0) {
                            i22 = 1;
                        }
                        F(i22, i11);
                        if (g0Var.k(e1.i0.f4969a) == null) {
                            throw new ClassCastException();
                        }
                        g0Var.c0(356914239);
                        g0Var.r(false);
                        hVar = (q3.h) g0Var.k(c3.o1.f2737k);
                        executor = (Executor) g0Var.k(j0.f12636a);
                        if (executor == null) {
                            g0Var.c0(1255914055);
                            g0Var.r(false);
                        } else {
                            g0Var.c0(1255914055);
                            g0Var.r(false);
                        }
                        if (kVar3 == null) {
                            g0Var.c0(357875859);
                            g0Var.r(false);
                            i30 = i22;
                            z14 = z13;
                            i31 = i29;
                            rVarV = rVar.V(new d1.j(str, r0Var, hVar, i31, z14, i11, i30));
                            z15 = true;
                            kVar4 = kVar3;
                        } else {
                            i30 = i22;
                            z14 = z13;
                            i31 = i29;
                            g0Var.c0(357232113);
                            z15 = true;
                            kVar4 = kVar3;
                            b2.r rVarE9 = E(rVar, new m3.h(str), r0Var, kVar4, i31, z14, i11, i30, (q3.h) g0Var.k(c3.o1.f2737k), null, null, null);
                            g0Var.r(false);
                            rVarV = rVarE9;
                        }
                        d dVar9 = d.f12580c;
                        int iHashCode9 = Long.hashCode(g0Var.T);
                        b2.r rVarC9 = b2.a.c(rVarV, g0Var);
                        l1.m1 m1VarM9 = g0Var.m();
                        b3.i.f2042c.getClass();
                        gVar = b3.h.f2035b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(dVar9, g0Var, b3.h.f2039f);
                        l1.q.I(m1VarM9, g0Var, b3.h.f2038e);
                        l1.q.E(g0Var, b3.h.f2041h);
                        l1.q.I(rVarC9, g0Var, b3.h.f2037d);
                        l1.q.I(Integer.valueOf(iHashCode9), g0Var, b3.h.f2040g);
                        g0Var.r(z15);
                        z12 = z14;
                        i28 = i30;
                        i27 = i31;
                        kVar2 = kVar4;
                    } else {
                        g0Var.V();
                        i27 = i17;
                        i28 = i22;
                        z12 = z10;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new u00.n() {
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                q.d(str, rVar, r0Var, kVar2, i27, z12, i11, i28, (l1.j) obj, l1.q.K(i13 | 1), i14);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i15 |= 12582912;
                i22 = i12;
                i24 = i15 | 100663296;
                i25 = i15;
                if ((i14 & 512) != 0) {
                    i24 = i25 | 905969664;
                } else if ((i13 & 805306368) == 0) {
                    if ((i13 & 1073741824) == 0) {
                        zI = g0Var.g(null);
                    } else {
                        zI = g0Var.i(null);
                    }
                    if (zI) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i24 |= i26;
                }
                if ((i24 & 306783379) != 306783378) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (g0Var.S(i24 & 1, z11)) {
                    if (i33 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i16 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i17;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i21 != 0) {
                        i22 = 1;
                    }
                    F(i22, i11);
                    if (g0Var.k(e1.i0.f4969a) == null) {
                        throw new ClassCastException();
                    }
                    g0Var.c0(356914239);
                    g0Var.r(false);
                    hVar = (q3.h) g0Var.k(c3.o1.f2737k);
                    executor = (Executor) g0Var.k(j0.f12636a);
                    if (executor == null) {
                        g0Var.c0(1255914055);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(1255914055);
                        g0Var.r(false);
                    }
                    if (kVar3 == null) {
                        g0Var.c0(357875859);
                        g0Var.r(false);
                        i30 = i22;
                        z14 = z13;
                        i31 = i29;
                        rVarV = rVar.V(new d1.j(str, r0Var, hVar, i31, z14, i11, i30));
                        z15 = true;
                        kVar4 = kVar3;
                    } else {
                        i30 = i22;
                        z14 = z13;
                        i31 = i29;
                        g0Var.c0(357232113);
                        z15 = true;
                        kVar4 = kVar3;
                        b2.r rVarE10 = E(rVar, new m3.h(str), r0Var, kVar4, i31, z14, i11, i30, (q3.h) g0Var.k(c3.o1.f2737k), null, null, null);
                        g0Var.r(false);
                        rVarV = rVarE10;
                    }
                    d dVar10 = d.f12580c;
                    int iHashCode10 = Long.hashCode(g0Var.T);
                    b2.r rVarC10 = b2.a.c(rVarV, g0Var);
                    l1.m1 m1VarM10 = g0Var.m();
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(dVar10, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM10, g0Var, b3.h.f2038e);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC10, g0Var, b3.h.f2037d);
                    l1.q.I(Integer.valueOf(iHashCode10), g0Var, b3.h.f2040g);
                    g0Var.r(z15);
                    z12 = z14;
                    i28 = i30;
                    i27 = i31;
                    kVar2 = kVar4;
                } else {
                    g0Var.V();
                    i27 = i17;
                    i28 = i22;
                    z12 = z10;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new u00.n() {
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            q.d(str, rVar, r0Var, kVar2, i27, z12, i11, i28, (l1.j) obj, l1.q.K(i13 | 1), i14);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i15 |= 196608;
            if ((1572864 & i13) == 0) {
                if (g0Var.e(i11)) {
                    i32 = 1048576;
                } else {
                    i32 = 524288;
                }
                i15 |= i32;
            }
            i21 = i14 & Cast.MAX_NAMESPACE_LENGTH;
            if (i21 != 0) {
                if ((12582912 & i13) == 0) {
                    i22 = i12;
                    if (g0Var.e(i22)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i15 |= i23;
                }
                i24 = i15 | 100663296;
                i25 = i15;
                if ((i14 & 512) != 0) {
                    i24 = i25 | 905969664;
                } else if ((i13 & 805306368) == 0) {
                    if ((i13 & 1073741824) == 0) {
                        zI = g0Var.g(null);
                    } else {
                        zI = g0Var.i(null);
                    }
                    if (zI) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i24 |= i26;
                }
                if ((i24 & 306783379) != 306783378) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (g0Var.S(i24 & 1, z11)) {
                    if (i33 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i16 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i17;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i21 != 0) {
                        i22 = 1;
                    }
                    F(i22, i11);
                    if (g0Var.k(e1.i0.f4969a) == null) {
                        throw new ClassCastException();
                    }
                    g0Var.c0(356914239);
                    g0Var.r(false);
                    hVar = (q3.h) g0Var.k(c3.o1.f2737k);
                    executor = (Executor) g0Var.k(j0.f12636a);
                    if (executor == null) {
                        g0Var.c0(1255914055);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(1255914055);
                        g0Var.r(false);
                    }
                    if (kVar3 == null) {
                        g0Var.c0(357875859);
                        g0Var.r(false);
                        i30 = i22;
                        z14 = z13;
                        i31 = i29;
                        rVarV = rVar.V(new d1.j(str, r0Var, hVar, i31, z14, i11, i30));
                        z15 = true;
                        kVar4 = kVar3;
                    } else {
                        i30 = i22;
                        z14 = z13;
                        i31 = i29;
                        g0Var.c0(357232113);
                        z15 = true;
                        kVar4 = kVar3;
                        b2.r rVarE11 = E(rVar, new m3.h(str), r0Var, kVar4, i31, z14, i11, i30, (q3.h) g0Var.k(c3.o1.f2737k), null, null, null);
                        g0Var.r(false);
                        rVarV = rVarE11;
                    }
                    d dVar11 = d.f12580c;
                    int iHashCode11 = Long.hashCode(g0Var.T);
                    b2.r rVarC11 = b2.a.c(rVarV, g0Var);
                    l1.m1 m1VarM11 = g0Var.m();
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(dVar11, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM11, g0Var, b3.h.f2038e);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC11, g0Var, b3.h.f2037d);
                    l1.q.I(Integer.valueOf(iHashCode11), g0Var, b3.h.f2040g);
                    g0Var.r(z15);
                    z12 = z14;
                    i28 = i30;
                    i27 = i31;
                    kVar2 = kVar4;
                } else {
                    g0Var.V();
                    i27 = i17;
                    i28 = i22;
                    z12 = z10;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new u00.n() {
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            q.d(str, rVar, r0Var, kVar2, i27, z12, i11, i28, (l1.j) obj, l1.q.K(i13 | 1), i14);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i15 |= 12582912;
            i22 = i12;
            i24 = i15 | 100663296;
            i25 = i15;
            if ((i14 & 512) != 0) {
                i24 = i25 | 905969664;
            } else if ((i13 & 805306368) == 0) {
                if ((i13 & 1073741824) == 0) {
                    zI = g0Var.g(null);
                } else {
                    zI = g0Var.i(null);
                }
                if (zI) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i24 |= i26;
            }
            if ((i24 & 306783379) != 306783378) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (g0Var.S(i24 & 1, z11)) {
                if (i33 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar2;
                }
                if (i16 != 0) {
                    i29 = 1;
                } else {
                    i29 = i17;
                }
                if (i19 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i21 != 0) {
                    i22 = 1;
                }
                F(i22, i11);
                if (g0Var.k(e1.i0.f4969a) == null) {
                    throw new ClassCastException();
                }
                g0Var.c0(356914239);
                g0Var.r(false);
                hVar = (q3.h) g0Var.k(c3.o1.f2737k);
                executor = (Executor) g0Var.k(j0.f12636a);
                if (executor == null) {
                    g0Var.c0(1255914055);
                    g0Var.r(false);
                } else {
                    g0Var.c0(1255914055);
                    g0Var.r(false);
                }
                if (kVar3 == null) {
                    g0Var.c0(357875859);
                    g0Var.r(false);
                    i30 = i22;
                    z14 = z13;
                    i31 = i29;
                    rVarV = rVar.V(new d1.j(str, r0Var, hVar, i31, z14, i11, i30));
                    z15 = true;
                    kVar4 = kVar3;
                } else {
                    i30 = i22;
                    z14 = z13;
                    i31 = i29;
                    g0Var.c0(357232113);
                    z15 = true;
                    kVar4 = kVar3;
                    b2.r rVarE12 = E(rVar, new m3.h(str), r0Var, kVar4, i31, z14, i11, i30, (q3.h) g0Var.k(c3.o1.f2737k), null, null, null);
                    g0Var.r(false);
                    rVarV = rVarE12;
                }
                d dVar12 = d.f12580c;
                int iHashCode12 = Long.hashCode(g0Var.T);
                b2.r rVarC12 = b2.a.c(rVarV, g0Var);
                l1.m1 m1VarM12 = g0Var.m();
                b3.i.f2042c.getClass();
                gVar = b3.h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(dVar12, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM12, g0Var, b3.h.f2038e);
                l1.q.E(g0Var, b3.h.f2041h);
                l1.q.I(rVarC12, g0Var, b3.h.f2037d);
                l1.q.I(Integer.valueOf(iHashCode12), g0Var, b3.h.f2040g);
                g0Var.r(z15);
                z12 = z14;
                i28 = i30;
                i27 = i31;
                kVar2 = kVar4;
            } else {
                g0Var.V();
                i27 = i17;
                i28 = i22;
                z12 = z10;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new u00.n() {
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        q.d(str, rVar, r0Var, kVar2, i27, z12, i11, i28, (l1.j) obj, l1.q.K(i13 | 1), i14);
                        return g00.b0.a;
                    }
                };
            }
        }
        i15 |= 24576;
        i17 = i10;
        i19 = i14 & 32;
        if (i19 != 0) {
            if ((196608 & i13) == 0) {
                if (g0Var.h(z10)) {
                    i20 = 131072;
                } else {
                    i20 = Cast.MAX_MESSAGE_LENGTH;
                }
                i15 |= i20;
            }
            if ((1572864 & i13) == 0) {
                if (g0Var.e(i11)) {
                    i32 = 1048576;
                } else {
                    i32 = 524288;
                }
                i15 |= i32;
            }
            i21 = i14 & Cast.MAX_NAMESPACE_LENGTH;
            if (i21 != 0) {
                if ((12582912 & i13) == 0) {
                    i22 = i12;
                    if (g0Var.e(i22)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i15 |= i23;
                }
                i24 = i15 | 100663296;
                i25 = i15;
                if ((i14 & 512) != 0) {
                    i24 = i25 | 905969664;
                } else if ((i13 & 805306368) == 0) {
                    if ((i13 & 1073741824) == 0) {
                        zI = g0Var.g(null);
                    } else {
                        zI = g0Var.i(null);
                    }
                    if (zI) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i24 |= i26;
                }
                if ((i24 & 306783379) != 306783378) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (g0Var.S(i24 & 1, z11)) {
                    if (i33 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar2;
                    }
                    if (i16 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i17;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    } else {
                        z13 = z10;
                    }
                    if (i21 != 0) {
                        i22 = 1;
                    }
                    F(i22, i11);
                    if (g0Var.k(e1.i0.f4969a) == null) {
                        throw new ClassCastException();
                    }
                    g0Var.c0(356914239);
                    g0Var.r(false);
                    hVar = (q3.h) g0Var.k(c3.o1.f2737k);
                    executor = (Executor) g0Var.k(j0.f12636a);
                    if (executor == null) {
                        g0Var.c0(1255914055);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(1255914055);
                        g0Var.r(false);
                    }
                    if (kVar3 == null) {
                        g0Var.c0(357875859);
                        g0Var.r(false);
                        i30 = i22;
                        z14 = z13;
                        i31 = i29;
                        rVarV = rVar.V(new d1.j(str, r0Var, hVar, i31, z14, i11, i30));
                        z15 = true;
                        kVar4 = kVar3;
                    } else {
                        i30 = i22;
                        z14 = z13;
                        i31 = i29;
                        g0Var.c0(357232113);
                        z15 = true;
                        kVar4 = kVar3;
                        b2.r rVarE13 = E(rVar, new m3.h(str), r0Var, kVar4, i31, z14, i11, i30, (q3.h) g0Var.k(c3.o1.f2737k), null, null, null);
                        g0Var.r(false);
                        rVarV = rVarE13;
                    }
                    d dVar13 = d.f12580c;
                    int iHashCode13 = Long.hashCode(g0Var.T);
                    b2.r rVarC13 = b2.a.c(rVarV, g0Var);
                    l1.m1 m1VarM13 = g0Var.m();
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(dVar13, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM13, g0Var, b3.h.f2038e);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC13, g0Var, b3.h.f2037d);
                    l1.q.I(Integer.valueOf(iHashCode13), g0Var, b3.h.f2040g);
                    g0Var.r(z15);
                    z12 = z14;
                    i28 = i30;
                    i27 = i31;
                    kVar2 = kVar4;
                } else {
                    g0Var.V();
                    i27 = i17;
                    i28 = i22;
                    z12 = z10;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new u00.n() {
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            q.d(str, rVar, r0Var, kVar2, i27, z12, i11, i28, (l1.j) obj, l1.q.K(i13 | 1), i14);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i15 |= 12582912;
            i22 = i12;
            i24 = i15 | 100663296;
            i25 = i15;
            if ((i14 & 512) != 0) {
                i24 = i25 | 905969664;
            } else if ((i13 & 805306368) == 0) {
                if ((i13 & 1073741824) == 0) {
                    zI = g0Var.g(null);
                } else {
                    zI = g0Var.i(null);
                }
                if (zI) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i24 |= i26;
            }
            if ((i24 & 306783379) != 306783378) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (g0Var.S(i24 & 1, z11)) {
                if (i33 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar2;
                }
                if (i16 != 0) {
                    i29 = 1;
                } else {
                    i29 = i17;
                }
                if (i19 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i21 != 0) {
                    i22 = 1;
                }
                F(i22, i11);
                if (g0Var.k(e1.i0.f4969a) == null) {
                    throw new ClassCastException();
                }
                g0Var.c0(356914239);
                g0Var.r(false);
                hVar = (q3.h) g0Var.k(c3.o1.f2737k);
                executor = (Executor) g0Var.k(j0.f12636a);
                if (executor == null) {
                    g0Var.c0(1255914055);
                    g0Var.r(false);
                } else {
                    g0Var.c0(1255914055);
                    g0Var.r(false);
                }
                if (kVar3 == null) {
                    g0Var.c0(357875859);
                    g0Var.r(false);
                    i30 = i22;
                    z14 = z13;
                    i31 = i29;
                    rVarV = rVar.V(new d1.j(str, r0Var, hVar, i31, z14, i11, i30));
                    z15 = true;
                    kVar4 = kVar3;
                } else {
                    i30 = i22;
                    z14 = z13;
                    i31 = i29;
                    g0Var.c0(357232113);
                    z15 = true;
                    kVar4 = kVar3;
                    b2.r rVarE14 = E(rVar, new m3.h(str), r0Var, kVar4, i31, z14, i11, i30, (q3.h) g0Var.k(c3.o1.f2737k), null, null, null);
                    g0Var.r(false);
                    rVarV = rVarE14;
                }
                d dVar14 = d.f12580c;
                int iHashCode14 = Long.hashCode(g0Var.T);
                b2.r rVarC14 = b2.a.c(rVarV, g0Var);
                l1.m1 m1VarM14 = g0Var.m();
                b3.i.f2042c.getClass();
                gVar = b3.h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(dVar14, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM14, g0Var, b3.h.f2038e);
                l1.q.E(g0Var, b3.h.f2041h);
                l1.q.I(rVarC14, g0Var, b3.h.f2037d);
                l1.q.I(Integer.valueOf(iHashCode14), g0Var, b3.h.f2040g);
                g0Var.r(z15);
                z12 = z14;
                i28 = i30;
                i27 = i31;
                kVar2 = kVar4;
            } else {
                g0Var.V();
                i27 = i17;
                i28 = i22;
                z12 = z10;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new u00.n() {
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        q.d(str, rVar, r0Var, kVar2, i27, z12, i11, i28, (l1.j) obj, l1.q.K(i13 | 1), i14);
                        return g00.b0.a;
                    }
                };
            }
        }
        i15 |= 196608;
        if ((1572864 & i13) == 0) {
            if (g0Var.e(i11)) {
                i32 = 1048576;
            } else {
                i32 = 524288;
            }
            i15 |= i32;
        }
        i21 = i14 & Cast.MAX_NAMESPACE_LENGTH;
        if (i21 != 0) {
            if ((12582912 & i13) == 0) {
                i22 = i12;
                if (g0Var.e(i22)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i15 |= i23;
            }
            i24 = i15 | 100663296;
            i25 = i15;
            if ((i14 & 512) != 0) {
                i24 = i25 | 905969664;
            } else if ((i13 & 805306368) == 0) {
                if ((i13 & 1073741824) == 0) {
                    zI = g0Var.g(null);
                } else {
                    zI = g0Var.i(null);
                }
                if (zI) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i24 |= i26;
            }
            if ((i24 & 306783379) != 306783378) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (g0Var.S(i24 & 1, z11)) {
                if (i33 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar2;
                }
                if (i16 != 0) {
                    i29 = 1;
                } else {
                    i29 = i17;
                }
                if (i19 != 0) {
                    z13 = true;
                } else {
                    z13 = z10;
                }
                if (i21 != 0) {
                    i22 = 1;
                }
                F(i22, i11);
                if (g0Var.k(e1.i0.f4969a) == null) {
                    throw new ClassCastException();
                }
                g0Var.c0(356914239);
                g0Var.r(false);
                hVar = (q3.h) g0Var.k(c3.o1.f2737k);
                executor = (Executor) g0Var.k(j0.f12636a);
                if (executor == null) {
                    g0Var.c0(1255914055);
                    g0Var.r(false);
                } else {
                    g0Var.c0(1255914055);
                    g0Var.r(false);
                }
                if (kVar3 == null) {
                    g0Var.c0(357875859);
                    g0Var.r(false);
                    i30 = i22;
                    z14 = z13;
                    i31 = i29;
                    rVarV = rVar.V(new d1.j(str, r0Var, hVar, i31, z14, i11, i30));
                    z15 = true;
                    kVar4 = kVar3;
                } else {
                    i30 = i22;
                    z14 = z13;
                    i31 = i29;
                    g0Var.c0(357232113);
                    z15 = true;
                    kVar4 = kVar3;
                    b2.r rVarE15 = E(rVar, new m3.h(str), r0Var, kVar4, i31, z14, i11, i30, (q3.h) g0Var.k(c3.o1.f2737k), null, null, null);
                    g0Var.r(false);
                    rVarV = rVarE15;
                }
                d dVar15 = d.f12580c;
                int iHashCode15 = Long.hashCode(g0Var.T);
                b2.r rVarC15 = b2.a.c(rVarV, g0Var);
                l1.m1 m1VarM15 = g0Var.m();
                b3.i.f2042c.getClass();
                gVar = b3.h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(dVar15, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM15, g0Var, b3.h.f2038e);
                l1.q.E(g0Var, b3.h.f2041h);
                l1.q.I(rVarC15, g0Var, b3.h.f2037d);
                l1.q.I(Integer.valueOf(iHashCode15), g0Var, b3.h.f2040g);
                g0Var.r(z15);
                z12 = z14;
                i28 = i30;
                i27 = i31;
                kVar2 = kVar4;
            } else {
                g0Var.V();
                i27 = i17;
                i28 = i22;
                z12 = z10;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new u00.n() {
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        q.d(str, rVar, r0Var, kVar2, i27, z12, i11, i28, (l1.j) obj, l1.q.K(i13 | 1), i14);
                        return g00.b0.a;
                    }
                };
            }
        }
        i15 |= 12582912;
        i22 = i12;
        i24 = i15 | 100663296;
        i25 = i15;
        if ((i14 & 512) != 0) {
            i24 = i25 | 905969664;
        } else if ((i13 & 805306368) == 0) {
            if ((i13 & 1073741824) == 0) {
                zI = g0Var.g(null);
            } else {
                zI = g0Var.i(null);
            }
            if (zI) {
                i26 = 536870912;
            } else {
                i26 = 268435456;
            }
            i24 |= i26;
        }
        if ((i24 & 306783379) != 306783378) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (g0Var.S(i24 & 1, z11)) {
            if (i33 != 0) {
                kVar3 = null;
            } else {
                kVar3 = kVar2;
            }
            if (i16 != 0) {
                i29 = 1;
            } else {
                i29 = i17;
            }
            if (i19 != 0) {
                z13 = true;
            } else {
                z13 = z10;
            }
            if (i21 != 0) {
                i22 = 1;
            }
            F(i22, i11);
            if (g0Var.k(e1.i0.f4969a) == null) {
                throw new ClassCastException();
            }
            g0Var.c0(356914239);
            g0Var.r(false);
            hVar = (q3.h) g0Var.k(c3.o1.f2737k);
            executor = (Executor) g0Var.k(j0.f12636a);
            if (executor == null) {
                g0Var.c0(1255914055);
                g0Var.r(false);
            } else {
                g0Var.c0(1255914055);
                g0Var.r(false);
            }
            if (kVar3 == null) {
                g0Var.c0(357875859);
                g0Var.r(false);
                i30 = i22;
                z14 = z13;
                i31 = i29;
                rVarV = rVar.V(new d1.j(str, r0Var, hVar, i31, z14, i11, i30));
                z15 = true;
                kVar4 = kVar3;
            } else {
                i30 = i22;
                z14 = z13;
                i31 = i29;
                g0Var.c0(357232113);
                z15 = true;
                kVar4 = kVar3;
                b2.r rVarE16 = E(rVar, new m3.h(str), r0Var, kVar4, i31, z14, i11, i30, (q3.h) g0Var.k(c3.o1.f2737k), null, null, null);
                g0Var.r(false);
                rVarV = rVarE16;
            }
            d dVar16 = d.f12580c;
            int iHashCode16 = Long.hashCode(g0Var.T);
            b2.r rVarC16 = b2.a.c(rVarV, g0Var);
            l1.m1 m1VarM16 = g0Var.m();
            b3.i.f2042c.getClass();
            gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(dVar16, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM16, g0Var, b3.h.f2038e);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC16, g0Var, b3.h.f2037d);
            l1.q.I(Integer.valueOf(iHashCode16), g0Var, b3.h.f2040g);
            g0Var.r(z15);
            z12 = z14;
            i28 = i30;
            i27 = i31;
            kVar2 = kVar4;
        } else {
            g0Var.V();
            i27 = i17;
            i28 = i22;
            z12 = z10;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q.d(str, rVar, r0Var, kVar2, i27, z12, i11, i28, (l1.j) obj, l1.q.K(i13 | 1), i14);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void e(b1.e0 e0Var, boolean z10, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        b2.r rVarC;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1442752422);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.i(e0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.h(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.i(cVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            g0Var.c0(-1299459355);
            if (z10) {
                g0Var.c0(-1299415211);
                boolean zI = g0Var.i(e0Var);
                Object objN = g0Var.N();
                if (zI || objN == l1.i.f9868a) {
                    objN = new a1.i2(e0Var, null, 3);
                    g0Var.n0(objN);
                }
                rVarC = w0.h.c((u00.n) objN);
                g0Var.r(false);
            } else {
                g0Var.c0(-1298836224);
                g0Var.r(false);
                rVarC = b2.o.A;
            }
            v0.g.b(rVarC, cVar, g0Var, (i11 >> 3) & 112);
            g0Var.r(false);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new k0(e0Var, z10, cVar, i10, 0);
        }
    }

    public static final void f(e1.v0 v0Var, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        b2.r rVarD;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1533506138);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.i(v0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(cVar) ? 32 : 16;
        }
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            g0Var.c0(-885604480);
            if (v0Var.k()) {
                k00.c cVar2 = null;
                int i12 = 0;
                rVarD = w0.h.d(w0.h.c(new e1.p0(v0Var, cVar2, 0)), v0Var.f5037y, new a1.q1(v0Var, cVar2, 1), new e1.q0(v0Var, cVar2, i12), new e1.o0(v0Var, i12));
            } else {
                rVarD = b2.o.A;
            }
            v0.g.b(rVarD, cVar, g0Var, i11 & 112);
            g0Var.r(false);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new l0(v0Var, cVar, i10, 0);
        }
    }

    public static final void g(b1.e0 e0Var, boolean z10, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-579239002);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.i(e0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.h(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.i(cVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            e(e0Var, z10, cVar, g0Var, i11 & 1022);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new k0(e0Var, z10, cVar, i10, 1);
        }
    }

    public static final void h(e1.v0 v0Var, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(2080741862);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.i(v0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(cVar) ? 32 : 16;
        }
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            f(v0Var, cVar, g0Var, i11 & 126);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new l0(v0Var, cVar, i10, 1);
        }
    }

    public static final void i(final r3.w wVar, final u00.k kVar, final b2.r rVar, final m3.r0 r0Var, final r3.e0 e0Var, final u00.k kVar2, final f0.i iVar, final i2.q qVar, final boolean z10, final int i10, final int i11, final r3.j jVar, final h1 h1Var, final boolean z11, final v1.c cVar, l1.j jVar2, final int i12, final int i13) {
        int i14;
        int i15;
        l1.g0 g0Var;
        Object j1Var;
        boolean z12;
        m3.r0 r0Var2;
        m3.h hVar;
        y3.c cVar2;
        q3.h hVar2;
        y3.c cVar3;
        r3.p pVar;
        g2.l lVar;
        boolean z13;
        boolean z14;
        long j9;
        r3.w wVarB;
        r3.w wVar2;
        Object objN;
        l1.g0 g0Var2;
        final i2 i2Var;
        long jCurrentTimeMillis;
        long j10;
        Object objN2;
        final a40.z zVar;
        Object objN3;
        final n0.c cVar4;
        Object objN4;
        final e1.v0 v0Var;
        final r3.p pVar2;
        int i16;
        boolean z15;
        boolean z16;
        boolean z17;
        int i17;
        boolean zI;
        Object obj;
        l1.g0 g0Var3;
        final j1 j1Var2;
        final r3.j jVar3;
        r3.p pVar3;
        boolean z18;
        r3.x xVar;
        a40.z zVar2;
        r3.w wVar3;
        b2.o oVar;
        l1.z0 z0VarG;
        j1 j1Var3;
        boolean z19;
        boolean z20;
        Object fVar;
        a40.z zVar3;
        b2.o oVar2;
        final j1 j1Var4;
        l1.z0 z0Var;
        r3.x xVar2;
        b2.r rVarB;
        b1.o oVar3;
        r3.p pVar4;
        boolean z21;
        boolean z22;
        boolean zI2;
        Object objN5;
        final r3.p pVar5;
        r3.x xVar3;
        final j1 j1Var5;
        boolean z23;
        b2.r rVarA;
        boolean zI3;
        Object objN6;
        boolean z24;
        boolean z25;
        Object objN7;
        r3.j jVar4;
        final boolean z26;
        int i18;
        boolean z27;
        boolean zH;
        Object objN8;
        Object v0Var2;
        long j11;
        boolean zI4;
        Object objN9;
        int i19;
        final boolean z28;
        b2.r rVarA2;
        Long l;
        l1.g0 g0Var4 = (l1.g0) jVar2;
        g0Var4.e0(31062401);
        if ((i12 & 6) == 0) {
            i14 = i12 | (g0Var4.g(wVar) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= g0Var4.i(kVar) ? 32 : 16;
        }
        int i20 = i12 & 384;
        int i21 = Cast.MAX_NAMESPACE_LENGTH;
        if (i20 == 0) {
            i14 |= g0Var4.g(rVar) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= g0Var4.g(r0Var) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= g0Var4.g(e0Var) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i14 |= g0Var4.i(kVar2) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i14 |= g0Var4.g(iVar) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i14 |= g0Var4.g(qVar) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i14 |= g0Var4.h(z10) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i14 |= g0Var4.e(i10) ? 536870912 : 268435456;
        }
        if ((i13 & 6) == 0) {
            i15 = i13 | (g0Var4.e(i11) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= g0Var4.g(jVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if (g0Var4.g(h1Var)) {
                i21 = 256;
            }
            i15 |= i21;
        }
        if ((i13 & 3072) == 0) {
            i15 |= g0Var4.h(z11) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= g0Var4.h(false) ? 16384 : 8192;
        }
        if ((i13 & 196608) == 0) {
            i15 |= g0Var4.i(cVar) ? 131072 : 65536;
        }
        int i22 = i15 | 1572864;
        if (g0Var4.S(i14 & 1, ((i14 & 306783379) == 306783378 && (599187 & i22) == 599186) ? false : true)) {
            g0Var4.X();
            if ((i12 & 1) != 0 && !g0Var4.A()) {
                g0Var4.V();
            }
            g0Var4.s();
            Object objN10 = g0Var4.N();
            l1.c cVar5 = l1.i.f9868a;
            if (objN10 == cVar5) {
                objN10 = new g2.t();
                g0Var4.n0(objN10);
            }
            g2.t tVar = (g2.t) objN10;
            Object objN11 = g0Var4.N();
            if (objN11 == cVar5) {
                a1.z0 z0Var2 = a1.a1.f4a;
                objN11 = new a1.h();
                g0Var4.n0(objN11);
            }
            a1.h hVar3 = (a1.h) objN11;
            Object objN12 = g0Var4.N();
            if (objN12 == cVar5) {
                objN12 = new r3.x(hVar3);
                g0Var4.n0(objN12);
            }
            final r3.x xVar4 = (r3.x) objN12;
            y3.c cVar6 = (y3.c) g0Var4.k(c3.o1.f2734h);
            q3.h hVar4 = (q3.h) g0Var4.k(c3.o1.f2737k);
            long j12 = ((e1.a1) g0Var4.k(e1.b1.f4956a)).f4955b;
            g2.l lVar2 = (g2.l) g0Var4.k(c3.o1.f2735i);
            final g3 g3Var = (g3) g0Var4.k(c3.o1.f2745u);
            t2 t2Var = (t2) g0Var4.k(c3.o1.f2741q);
            d0.q1 q1Var = (i10 == 1 && !z10 && jVar.f13073a) ? d0.q1.B : d0.q1.A;
            g0Var4.c0(-213744626);
            Object[] objArr = {q1Var};
            s10.w0 w0Var = b2.f12568g;
            boolean zE = g0Var4.e(q1Var.ordinal());
            Object objN13 = g0Var4.N();
            int i23 = 28;
            if (zE || objN13 == cVar5) {
                objN13 = new g1.l0(q1Var, i23);
                g0Var4.n0(objN13);
            }
            b2 b2Var = (b2) y1.k.f(objArr, w0Var, (u00.a) objN13, g0Var4, 0);
            g0Var4.r(false);
            if (((d0.q1) b2Var.f12574f.getValue()) != q1Var) {
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(q1Var == d0.q1.A ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
            }
            int i24 = i14 & 14;
            boolean z29 = ((i14 & 57344) == 16384) | (i24 == 4);
            Object objN14 = g0Var4.N();
            if (z29 || objN14 == cVar5) {
                r3.c0 c0VarA = j2.a(e0Var, wVar.f13099a);
                r3.p pVar6 = c0VarA.f13066b;
                m3.q0 q0Var = wVar.f13101c;
                if (q0Var != null) {
                    long j13 = q0Var.f10520a;
                    int i25 = m3.q0.f10519c;
                    int iZ = pVar6.z((int) (j13 >> 32));
                    int iZ2 = pVar6.z((int) (j13 & 4294967295L));
                    int iMin = Math.min(iZ, iZ2);
                    int iMax = Math.max(iZ, iZ2);
                    m3.e eVar = new m3.e(c0VarA.f13065a);
                    eVar.C.add(new m3.d(new m3.i0(0L, 0L, (q3.u) null, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, x3.l.f16418c, (i2.s0) null, 61439), iMin, iMax, 8));
                    objN14 = new r3.c0(eVar.f(), pVar6);
                } else {
                    objN14 = c0VarA;
                }
                g0Var4.n0(objN14);
            } else {
                tVar = tVar;
                b2Var = b2Var;
                j12 = j12;
            }
            r3.c0 c0Var = (r3.c0) objN14;
            m3.h hVar5 = c0Var.f13065a;
            r3.p pVar7 = c0Var.f13066b;
            l1.r1 r1VarZ = g0Var4.z();
            if (r1VarZ == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            r1VarZ.f();
            boolean zG = g0Var4.g(t2Var);
            Object objN15 = g0Var4.N();
            if (zG || objN15 == cVar5) {
                z12 = z10;
                r0Var2 = r0Var;
                hVar = hVar5;
                cVar2 = cVar6;
                hVar2 = hVar4;
                j1Var = new j1(new q1(hVar5, r0Var2, z12, cVar6, hVar4, 0), r1VarZ, t2Var);
                g0Var4.n0(j1Var);
            } else {
                z12 = z10;
                j1Var = objN15;
                cVar2 = cVar6;
                hVar2 = hVar4;
                r0Var2 = r0Var;
                hVar = hVar5;
            }
            j1 j1Var6 = (j1) j1Var;
            m3.h hVar6 = wVar.f13099a;
            long j14 = wVar.f13100b;
            j1Var6.f12656u = kVar;
            j1Var6.f12661z = j12;
            f1 f1Var = j1Var6.f12653r;
            f1Var.f12612b = h1Var;
            f1Var.f12613c = lVar2;
            j1Var6.f12647j = hVar6;
            q1 q1Var2 = j1Var6.f12638a;
            if (kotlin.jvm.internal.m.a(q1Var2.f12683a, hVar) && kotlin.jvm.internal.m.a(q1Var2.f12684b, r0Var2) && q1Var2.f12687e == z12 && q1Var2.f12688f == 1 && q1Var2.f12685c == Integer.MAX_VALUE && q1Var2.f12686d == 1 && kotlin.jvm.internal.m.a(q1Var2.f12689g, cVar2) && kotlin.jvm.internal.m.a(q1Var2.f12691i, h00.x.A) && q1Var2.f12690h == hVar2) {
                cVar3 = cVar2;
            } else {
                cVar3 = cVar2;
                q1Var2 = new q1(hVar, r0Var2, z12, cVar3, hVar2, 0);
            }
            if (j1Var6.f12638a != q1Var2) {
                j1Var6.f12651p = true;
            }
            j1Var6.f12638a = q1Var2;
            q3.e0 e0Var2 = j1Var6.f12641d;
            r3.b0 b0Var = j1Var6.f12642e;
            e0Var2.getClass();
            m3.q0 q0Var2 = wVar.f13101c;
            boolean zA = kotlin.jvm.internal.m.a(q0Var2, ((com.google.android.material.datepicker.n) e0Var2.C).c());
            String str = ((r3.w) e0Var2.B).f13099a.B;
            m3.h hVar7 = wVar.f13099a;
            if (kotlin.jvm.internal.m.a(str, hVar7.B)) {
                pVar = pVar7;
                lVar = lVar2;
                if (m3.q0.c(((r3.w) e0Var2.B).f13100b, j14)) {
                    z13 = false;
                } else {
                    ((com.google.android.material.datepicker.n) e0Var2.C).g(m3.q0.g(j14), m3.q0.f(j14));
                    z13 = false;
                    z14 = true;
                }
                if (q0Var2 == null) {
                    com.google.android.material.datepicker.n nVar = (com.google.android.material.datepicker.n) e0Var2.C;
                    nVar.D = -1;
                    nVar.E = -1;
                } else {
                    j9 = q0Var2.f10520a;
                    if (!m3.q0.d(j9)) {
                        ((com.google.android.material.datepicker.n) e0Var2.C).f(m3.q0.g(j9), m3.q0.f(j9));
                    }
                }
                if (z13 && (z14 || zA)) {
                    wVarB = wVar;
                } else {
                    com.google.android.material.datepicker.n nVar2 = (com.google.android.material.datepicker.n) e0Var2.C;
                    nVar2.D = -1;
                    nVar2.E = -1;
                    wVarB = r3.w.b(wVar, null, 0L, 3);
                }
                wVar2 = (r3.w) e0Var2.B;
                e0Var2.B = wVarB;
                if (b0Var != null) {
                    b0Var.a(wVar2, wVarB);
                }
                objN = g0Var4.N();
                if (objN == cVar5) {
                    objN = new i2();
                    g0Var2 = g0Var4;
                    g0Var2.n0(objN);
                } else {
                    g0Var2 = g0Var4;
                }
                i2Var = (i2) objN;
                jCurrentTimeMillis = System.currentTimeMillis();
                if (i2Var.f12635e) {
                    j10 = jCurrentTimeMillis;
                } else {
                    l = i2Var.f12634d;
                    j10 = jCurrentTimeMillis;
                    if (j10 > (l != null ? l.longValue() : 0L) + ((long) 5000)) {
                    }
                    objN2 = g0Var2.N();
                    if (objN2 == cVar5) {
                        objN2 = l1.q.o(g0Var2);
                        g0Var2.n0(objN2);
                    }
                    zVar = (a40.z) objN2;
                    objN3 = g0Var2.N();
                    if (objN3 == cVar5) {
                        objN3 = new n0.c();
                        g0Var2.n0(objN3);
                    }
                    cVar4 = (n0.c) objN3;
                    objN4 = g0Var2.N();
                    if (objN4 == cVar5) {
                        objN4 = new e1.v0(i2Var);
                        g0Var2.n0(objN4);
                    }
                    v0Var = (e1.v0) objN4;
                    pVar2 = pVar;
                    v0Var.f5016b = pVar2;
                    v0Var.f5020f = e0Var;
                    v0Var.f5017c = j1Var6.f12657v;
                    v0Var.f5018d = j1Var6;
                    v0Var.f5019e.setValue(wVar);
                    v0Var.f5035w = new m3.q0(j14);
                    v0Var.f5022h = (c3.g1) g0Var2.k(c3.o1.f2732f);
                    v0Var.f5023i = zVar;
                    v0Var.f5025k = (q2.a) g0Var2.k(c3.o1.l);
                    g2.t tVar2 = tVar;
                    v0Var.l = tVar2;
                    final boolean z30 = true;
                    v0Var.m.setValue(true);
                    v0Var.f5026n.setValue(Boolean.valueOf(z11));
                    g0Var2.c0(1966756105);
                    e1.s sVar = e1.s.A;
                    v0Var.f5024j = e1.r.b(r0Var2.f10522a.f10467k, g0Var2);
                    g0Var2.r(false);
                    j1Var6.b();
                    boolean zI5 = g0Var2.i(j1Var6);
                    i16 = i22 & 7168;
                    if (i16 == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z31 = z15 | zI5;
                    if ((i22 & 57344) == 16384) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean zI6 = z31 | z16 | g0Var2.i(xVar4);
                    if (i24 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i17 = (i22 & 112) ^ 48;
                    zI = zI6 | z17 | ((i17 <= 32 && g0Var2.g(jVar)) || (i22 & 48) == 32) | g0Var2.i(pVar2) | g0Var2.i(zVar) | g0Var2.i(cVar4) | g0Var2.i(v0Var);
                    Object objN16 = g0Var2.N();
                    if (!zI || objN16 == cVar5) {
                        g0Var3 = g0Var2;
                        j1Var2 = j1Var6;
                        jVar3 = jVar;
                        obj = new u00.k() {
                            public final Object invoke(Object obj2) {
                                e2 e2VarD;
                                j1 j1Var7 = j1Var2;
                                g2.y yVar = (g2.y) ((g2.x) obj2);
                                if (j1Var7.b() != yVar.a()) {
                                    j1Var7.f12643f.setValue(Boolean.valueOf(yVar.a()));
                                    boolean zB = j1Var7.b();
                                    r3.w wVar4 = wVar;
                                    r3.p pVar8 = pVar2;
                                    if (zB && z11) {
                                        q.D(xVar4, j1Var7, wVar4, jVar3, pVar8);
                                    } else {
                                        q.s(j1Var7);
                                    }
                                    if (yVar.a() && (e2VarD = j1Var7.d()) != null) {
                                        a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new a1.f(cVar4, wVar4, j1Var7, e2VarD, pVar8, null, 12), 3);
                                    }
                                    if (!yVar.a()) {
                                        v0Var.g(null);
                                    }
                                }
                                return g00.b0.a;
                            }
                        };
                        pVar3 = pVar2;
                        z18 = z11;
                        xVar = xVar4;
                        zVar2 = zVar;
                        wVar3 = wVar;
                        g0Var3.n0(obj);
                    } else {
                        wVar3 = wVar;
                        zVar2 = zVar;
                        pVar3 = pVar2;
                        g0Var3 = g0Var2;
                        xVar = xVar4;
                        obj = objN16;
                        j1Var2 = j1Var6;
                        jVar3 = jVar;
                        z18 = z11;
                    }
                    oVar = b2.o.A;
                    b2.r rVarI = z.n.i(g2.d.s(g2.d.j(oVar, tVar2), (u00.k) obj), z18, iVar);
                    z0VarG = l1.q.G(Boolean.valueOf(z18), g0Var3);
                    boolean zG2 = g0Var3.g(z0VarG) | g0Var3.i(j1Var2) | g0Var3.i(xVar) | g0Var3.i(v0Var);
                    if (i17 > 32 || !g0Var3.g(jVar3)) {
                        j1Var3 = j1Var2;
                        if ((i22 & 48) != 32) {
                            z19 = false;
                        }
                        z20 = zG2 | z19;
                        Object objN17 = g0Var3.N();
                        if (!z20 || objN17 == cVar5) {
                            a40.z zVar4 = zVar2;
                            r3.x xVar5 = xVar;
                            zVar3 = zVar4;
                            oVar2 = oVar;
                            j1Var4 = j1Var3;
                            fVar = new a1.f(j1Var4, z0VarG, xVar5, v0Var, jVar3, null, 11);
                            z0Var = z0VarG;
                            xVar2 = xVar5;
                            g0Var3.n0(fVar);
                        } else {
                            fVar = objN17;
                            zVar3 = zVar2;
                            z0Var = z0VarG;
                            j1Var4 = j1Var3;
                            xVar2 = xVar;
                            oVar2 = oVar;
                        }
                        l1.q.i(g00.b0.a, g0Var3, (u00.n) fVar);
                        rVarB = v2.f0.b(oVar2, 8675309, new a1.g2(new r0(j1Var4, 4), 1));
                        pVar4 = pVar3;
                        oVar3 = new b1.o(j1Var4, tVar2, z18, v0Var, pVar4);
                        if (z11) {
                            rVarB = b2.a.a(rVarB, new c0.f(oVar3, iVar, 18));
                        }
                        b2.r rVarV = rVarB.V(new v2.e0(v0Var.A, v0Var.f5038z, null, new a1.g2(v0Var, 4), 4));
                        v2.p.f15394a.getClass();
                        b2.r rVarG = v2.r.g(rVarV, v2.r.f15396b);
                        final b2.r rVarE = f2.h.e(oVar2, new b1.l(j1Var4, wVar3, pVar4, 28));
                        boolean zI7 = g0Var3.i(j1Var4);
                        if (i16 == 2048) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        boolean zG3 = zI7 | z21 | g0Var3.g(g3Var) | g0Var3.i(v0Var);
                        if (i24 == 4) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        zI2 = zG3 | z22 | g0Var3.i(pVar4);
                        objN5 = g0Var3.N();
                        if (!zI2 || objN5 == cVar5) {
                            pVar5 = pVar4;
                            final r3.w wVar4 = wVar3;
                            u00.k kVar3 = new u00.k() {
                                public final Object invoke(Object obj2) {
                                    r3.b0 b0Var2;
                                    z2.a0 a0Var;
                                    z2.a0 a0Var2;
                                    j1 j1Var7 = j1Var4;
                                    l1.i1 i1Var = j1Var7.f12650o;
                                    z2.a0 a0Var3 = (z2.a0) obj2;
                                    j1Var7.f12645h = a0Var3;
                                    e2 e2VarD = j1Var7.d();
                                    if (e2VarD != null) {
                                        e2VarD.f12609b = a0Var3;
                                    }
                                    if (z11) {
                                        z0 z0VarA = j1Var7.a();
                                        z0 z0Var3 = z0.B;
                                        e1.v0 v0Var3 = v0Var;
                                        r3.w wVar5 = wVar4;
                                        if (z0VarA == z0Var3) {
                                            if (((Boolean) j1Var7.l.getValue()).booleanValue() && ((c3.f2) g3Var).b()) {
                                                v0Var3.r();
                                            } else {
                                                v0Var3.o();
                                            }
                                            j1Var7.m.setValue(Boolean.valueOf(b5.z(v0Var3, true)));
                                            j1Var7.f12649n.setValue(Boolean.valueOf(b5.z(v0Var3, false)));
                                            i1Var.setValue(Boolean.valueOf(m3.q0.d(wVar5.f13100b)));
                                        } else if (j1Var7.a() == z0.C) {
                                            i1Var.setValue(Boolean.valueOf(b5.z(v0Var3, true)));
                                        }
                                        r3.p pVar8 = pVar5;
                                        q.B(j1Var7, wVar5, pVar8);
                                        e2 e2VarD2 = j1Var7.d();
                                        if (e2VarD2 != null && (b0Var2 = j1Var7.f12642e) != null && j1Var7.b() && (a0Var = e2VarD2.f12609b) != null && a0Var.A() && (a0Var2 = e2VarD2.f12610c) != null) {
                                            m3.n0 n0Var = e2VarD2.f12608a;
                                            a20.d dVar = new a20.d(a0Var, 26);
                                            h2.c cVarY = y3.Y(a0Var);
                                            h2.c cVarF = a0Var.F(a0Var2, false);
                                            if (kotlin.jvm.internal.m.a((r3.b0) b0Var2.f13047a.f13103b.get(), b0Var2)) {
                                                b0Var2.f13048b.g(wVar5, pVar8, n0Var, dVar, cVarY, cVarF);
                                            }
                                        }
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var3.n0(kVar3);
                            objN5 = kVar3;
                        } else {
                            pVar5 = pVar4;
                        }
                        final b2.r rVarN = z2.d0.n(oVar2, (u00.k) objN5);
                        j1 j1Var7 = j1Var4;
                        xVar3 = xVar2;
                        a1.t tVar3 = new a1.t(c0Var, wVar, j1Var7, z11, e0Var instanceof r3.q, pVar5, v0Var, jVar, tVar2);
                        j1Var5 = j1Var7;
                        if (!z11 && ((c3.f2) g3Var).b() && m3.q0.d(((m3.q0) j1Var5.A.getValue()).f10520a) && m3.q0.d(((m3.q0) j1Var5.B.getValue()).f10520a)) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        if (z23) {
                            bz.o oVar4 = new bz.o(qVar, j1Var5, wVar, pVar5, 11);
                            j1Var5 = j1Var5;
                            rVarA = b2.a.a(oVar2, oVar4);
                        } else {
                            rVarA = oVar2;
                        }
                        zI3 = g0Var3.i(v0Var);
                        objN6 = g0Var3.N();
                        if (zI3 || objN6 == cVar5) {
                            objN6 = new e1.o0(v0Var, 1);
                            g0Var3.n0(objN6);
                        }
                        l1.q.e(v0Var, (u00.k) objN6, g0Var3);
                        boolean zI8 = g0Var3.i(j1Var5) | g0Var3.i(xVar3);
                        if (i24 == 4) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = zI8 | z24 | ((i17 <= 32 && g0Var3.g(jVar)) || (i22 & 48) == 32);
                        objN7 = g0Var3.N();
                        if (!z25 || objN7 == cVar5) {
                            az.k kVar4 = new az.k(j1Var5, xVar3, wVar, jVar, 12);
                            jVar4 = jVar;
                            g0Var3.n0(kVar4);
                            objN7 = kVar4;
                        } else {
                            jVar4 = jVar;
                        }
                        l1.q.e(jVar4, (u00.k) objN7, g0Var3);
                        final r0 r0Var3 = j1Var5.f12657v;
                        if (i10 == 1) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        final int i26 = jVar4.f13077e;
                        b2.r rVarA3 = b2.a.a(oVar2, new u00.o() {
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                ((Integer) obj4).getClass();
                                l1.g0 g0Var5 = (l1.g0) ((l1.j) obj3);
                                g0Var5.c0(851809892);
                                Object objN18 = g0Var5.N();
                                l1.c cVar7 = l1.i.f9868a;
                                if (objN18 == cVar7) {
                                    objN18 = new e1.z0();
                                    g0Var5.n0(objN18);
                                }
                                e1.z0 z0Var3 = (e1.z0) objN18;
                                Object objN19 = g0Var5.N();
                                if (objN19 == cVar7) {
                                    objN19 = new x0();
                                    g0Var5.n0(objN19);
                                }
                                v1 v1Var = new v1(j1Var5, v0Var, wVar, z30, z26, z0Var3, pVar5, i2Var, (x0) objN19, r0Var3, i26);
                                boolean zI9 = g0Var5.i(v1Var);
                                Object objN20 = g0Var5.N();
                                if (zI9 || objN20 == cVar7) {
                                    gz.e1 e1Var = new gz.e1(1, v1Var, v1.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 16);
                                    g0Var5.n0(e1Var);
                                    objN20 = e1Var;
                                }
                                b2.r rVarD = t2.d.d(b2.o.A, (a10.g) objN20);
                                g0Var5.r(false);
                                return rVarD;
                            }
                        });
                        i18 = jVar4.f13076d;
                        if (i18 == 7 && i18 != 8) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        boolean zBooleanValue = ((Boolean) z0Var.getValue()).booleanValue();
                        zH = g0Var3.h(z27) | g0Var3.i(hVar3);
                        objN8 = g0Var3.N();
                        if (zH || objN8 == cVar5) {
                            objN8 = new ea.d(z27, hVar3, 2);
                            g0Var3.n0(objN8);
                        }
                        b2.r rVarA4 = y0.b.a(oVar2, zBooleanValue, z27, (u00.a) objN8);
                        v0Var2 = (i2.q) g0Var3.k(g.f12614a);
                        j11 = ((i2.t) g0Var3.k(g.f12615b)).f7169a;
                        final r3.p pVar8 = pVar5;
                        if (!i2.t.c(j11, i2.b0.c(1308617531))) {
                            v0Var2 = new i2.v0(j11);
                        }
                        zI4 = g0Var3.i(j1Var5) | g0Var3.g(v0Var2);
                        objN9 = g0Var3.N();
                        i19 = 5;
                        if (zI4 || objN9 == cVar5) {
                            objN9 = new mu.q(j1Var5, v0Var2, 5);
                            g0Var3.n0(objN9);
                        }
                        b2.r rVarE2 = t2.d.e(a1.x0.A(rVar.V(f2.h.g(oVar2, (u00.k) objN9)), hVar3, j1Var5, v0Var).V(rVarA4).V(rVarI), new w0(lVar, j1Var5));
                        int i27 = 0;
                        final b2 b2Var2 = b2Var;
                        b2.r rVarA5 = w0.h.a(z2.d0.n(t2.d.e(rVarE2, new w0(j1Var5, v0Var, i27)).V(rVarA3).V(new b2.l(new cz.m(3, b2Var2, iVar, z11))).V(rVarG).V(tVar3), new r0(j1Var5, i27)), new al.i(v0Var, zVar3, 9));
                        if (!z11 && j1Var5.b() && ((Boolean) j1Var5.f12652q.getValue()).booleanValue() && r3.b()) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        if (z28) {
                            j3.z zVar5 = z.a1.f16893a;
                            rVarA2 = b2.a.a(oVar2, new a1.w(v0Var, i19));
                        } else {
                            rVarA2 = oVar2;
                        }
                        final b2.r rVar2 = rVarA2;
                        final y3.c cVar7 = cVar3;
                        final b2.r rVar3 = rVarA;
                        final j1 j1Var8 = j1Var5;
                        g0Var = g0Var3;
                        j(rVarA5, v0Var, v1.d.d(-814563849, new u00.n() {
                            public final Object invoke(Object obj2, Object obj3) {
                                l1.j jVar5 = (l1.j) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                l1.g0 g0Var5 = (l1.g0) jVar5;
                                if (g0Var5.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    final j1 j1Var9 = j1Var8;
                                    final m3.r0 r0Var4 = r0Var;
                                    final int i28 = i11;
                                    final int i29 = i10;
                                    final b2 b2Var3 = b2Var2;
                                    final r3.w wVar5 = wVar;
                                    final r3.e0 e0Var3 = e0Var;
                                    final b2.r rVar4 = rVar3;
                                    final b2.r rVar5 = rVarE;
                                    final b2.r rVar6 = rVarN;
                                    final b2.r rVar7 = rVar2;
                                    final n0.c cVar8 = cVar4;
                                    final e1.v0 v0Var3 = v0Var;
                                    final boolean z32 = z28;
                                    final u00.k kVar5 = kVar2;
                                    final r3.p pVar9 = pVar8;
                                    final y3.c cVar9 = cVar7;
                                    cVar.invoke(v1.d.d(-44346382, new u00.n() {
                                        public final Object invoke(Object obj4, Object obj5) throws NoWhenBranchMatchedException {
                                            b2.r k2Var;
                                            l1.j jVar6 = (l1.j) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            l1.g0 g0Var6 = (l1.g0) jVar6;
                                            if (g0Var6.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                j1 j1Var10 = j1Var9;
                                                b2.r rVarG2 = h0.z1.g(b2.o.A, ((y3.f) j1Var10.f12644g.getValue()).A, 0.0f, 2);
                                                int i30 = i28;
                                                int i31 = i29;
                                                q.F(i30, i31);
                                                m3.r0 r0Var5 = r0Var4;
                                                if (i30 != 1 || i31 != Integer.MAX_VALUE) {
                                                    rVarG2 = rVarG2.V(new a1(r0Var5, i30, i31));
                                                }
                                                boolean zI9 = g0Var6.i(j1Var10);
                                                Object objN18 = g0Var6.N();
                                                if (zI9 || objN18 == l1.i.f9868a) {
                                                    objN18 = new g1.l0(j1Var10, 29);
                                                    g0Var6.n0(objN18);
                                                }
                                                u00.a aVar = (u00.a) objN18;
                                                b2 b2Var4 = b2Var3;
                                                d0.q1 q1Var3 = (d0.q1) b2Var4.f12574f.getValue();
                                                r3.w wVar6 = wVar5;
                                                long j15 = wVar6.f13100b;
                                                int i32 = m3.q0.f10519c;
                                                int iG = (int) (j15 >> 32);
                                                long j16 = b2Var4.f12573e;
                                                if (iG == ((int) (j16 >> 32)) && (iG = (int) (j15 & 4294967295L)) == ((int) (j16 & 4294967295L))) {
                                                    iG = m3.q0.g(j15);
                                                }
                                                b2Var4.f12573e = wVar6.f13100b;
                                                r3.c0 c0VarA2 = j2.a(e0Var3, wVar6.f13099a);
                                                int iOrdinal = q1Var3.ordinal();
                                                if (iOrdinal == 0) {
                                                    k2Var = new k2(b2Var4, iG, c0VarA2, aVar);
                                                } else {
                                                    if (iOrdinal != 1) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    k2Var = new d1(b2Var4, iG, c0VarA2, aVar);
                                                }
                                                z3.m(n0.d.a(f2.h.d(rVarG2).V(k2Var).V(rVar4).V(rVar5).V(new c2(r0Var5)).V(rVar6).V(rVar7), cVar8), v1.d.d(1412697320, new eu.m(v0Var3, j1Var10, z32, kVar5, wVar6, pVar9, cVar9, i31), jVar6), jVar6, 48);
                                            } else {
                                                g0Var6.V();
                                            }
                                            return g00.b0.a;
                                        }
                                    }, jVar5), jVar5, 6);
                                } else {
                                    g0Var5.V();
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 384);
                    } else {
                        j1Var3 = j1Var2;
                    }
                    z19 = true;
                    z20 = zG2 | z19;
                    Object objN18 = g0Var3.N();
                    if (z20) {
                        a40.z zVar6 = zVar2;
                        r3.x xVar6 = xVar;
                        zVar3 = zVar6;
                        oVar2 = oVar;
                        j1Var4 = j1Var3;
                        fVar = new a1.f(j1Var4, z0VarG, xVar6, v0Var, jVar3, null, 11);
                        z0Var = z0VarG;
                        xVar2 = xVar6;
                        g0Var3.n0(fVar);
                    } else {
                        a40.z zVar7 = zVar2;
                        r3.x xVar7 = xVar;
                        zVar3 = zVar7;
                        oVar2 = oVar;
                        j1Var4 = j1Var3;
                        fVar = new a1.f(j1Var4, z0VarG, xVar7, v0Var, jVar3, null, 11);
                        z0Var = z0VarG;
                        xVar2 = xVar7;
                        g0Var3.n0(fVar);
                    }
                    l1.q.i(g00.b0.a, g0Var3, (u00.n) fVar);
                    rVarB = v2.f0.b(oVar2, 8675309, new a1.g2(new r0(j1Var4, 4), 1));
                    pVar4 = pVar3;
                    oVar3 = new b1.o(j1Var4, tVar2, z18, v0Var, pVar4);
                    if (z11) {
                        rVarB = b2.a.a(rVarB, new c0.f(oVar3, iVar, 18));
                    }
                    b2.r rVarV2 = rVarB.V(new v2.e0(v0Var.A, v0Var.f5038z, null, new a1.g2(v0Var, 4), 4));
                    v2.p.f15394a.getClass();
                    b2.r rVarG2 = v2.r.g(rVarV2, v2.r.f15396b);
                    final b2.r rVarE3 = f2.h.e(oVar2, new b1.l(j1Var4, wVar3, pVar4, 28));
                    boolean zI9 = g0Var3.i(j1Var4);
                    if (i16 == 2048) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    boolean zG4 = zI9 | z21 | g0Var3.g(g3Var) | g0Var3.i(v0Var);
                    if (i24 == 4) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    zI2 = zG4 | z22 | g0Var3.i(pVar4);
                    objN5 = g0Var3.N();
                    if (zI2) {
                        pVar5 = pVar4;
                        final r3.w wVar5 = wVar3;
                        u00.k kVar5 = new u00.k() {
                            public final Object invoke(Object obj2) {
                                r3.b0 b0Var2;
                                z2.a0 a0Var;
                                z2.a0 a0Var2;
                                j1 j1Var9 = j1Var4;
                                l1.i1 i1Var = j1Var9.f12650o;
                                z2.a0 a0Var3 = (z2.a0) obj2;
                                j1Var9.f12645h = a0Var3;
                                e2 e2VarD = j1Var9.d();
                                if (e2VarD != null) {
                                    e2VarD.f12609b = a0Var3;
                                }
                                if (z11) {
                                    z0 z0VarA = j1Var9.a();
                                    z0 z0Var3 = z0.B;
                                    e1.v0 v0Var3 = v0Var;
                                    r3.w wVar6 = wVar5;
                                    if (z0VarA == z0Var3) {
                                        if (((Boolean) j1Var9.l.getValue()).booleanValue() && ((c3.f2) g3Var).b()) {
                                            v0Var3.r();
                                        } else {
                                            v0Var3.o();
                                        }
                                        j1Var9.m.setValue(Boolean.valueOf(b5.z(v0Var3, true)));
                                        j1Var9.f12649n.setValue(Boolean.valueOf(b5.z(v0Var3, false)));
                                        i1Var.setValue(Boolean.valueOf(m3.q0.d(wVar6.f13100b)));
                                    } else if (j1Var9.a() == z0.C) {
                                        i1Var.setValue(Boolean.valueOf(b5.z(v0Var3, true)));
                                    }
                                    r3.p pVar9 = pVar5;
                                    q.B(j1Var9, wVar6, pVar9);
                                    e2 e2VarD2 = j1Var9.d();
                                    if (e2VarD2 != null && (b0Var2 = j1Var9.f12642e) != null && j1Var9.b() && (a0Var = e2VarD2.f12609b) != null && a0Var.A() && (a0Var2 = e2VarD2.f12610c) != null) {
                                        m3.n0 n0Var = e2VarD2.f12608a;
                                        a20.d dVar = new a20.d(a0Var, 26);
                                        h2.c cVarY = y3.Y(a0Var);
                                        h2.c cVarF = a0Var.F(a0Var2, false);
                                        if (kotlin.jvm.internal.m.a((r3.b0) b0Var2.f13047a.f13103b.get(), b0Var2)) {
                                            b0Var2.f13048b.g(wVar6, pVar9, n0Var, dVar, cVarY, cVarF);
                                        }
                                    }
                                }
                                return g00.b0.a;
                            }
                        };
                        g0Var3.n0(kVar5);
                        objN5 = kVar5;
                    } else {
                        pVar5 = pVar4;
                        final r3.w wVar6 = wVar3;
                        u00.k kVar6 = new u00.k() {
                            public final Object invoke(Object obj2) {
                                r3.b0 b0Var2;
                                z2.a0 a0Var;
                                z2.a0 a0Var2;
                                j1 j1Var9 = j1Var4;
                                l1.i1 i1Var = j1Var9.f12650o;
                                z2.a0 a0Var3 = (z2.a0) obj2;
                                j1Var9.f12645h = a0Var3;
                                e2 e2VarD = j1Var9.d();
                                if (e2VarD != null) {
                                    e2VarD.f12609b = a0Var3;
                                }
                                if (z11) {
                                    z0 z0VarA = j1Var9.a();
                                    z0 z0Var3 = z0.B;
                                    e1.v0 v0Var3 = v0Var;
                                    r3.w wVar7 = wVar6;
                                    if (z0VarA == z0Var3) {
                                        if (((Boolean) j1Var9.l.getValue()).booleanValue() && ((c3.f2) g3Var).b()) {
                                            v0Var3.r();
                                        } else {
                                            v0Var3.o();
                                        }
                                        j1Var9.m.setValue(Boolean.valueOf(b5.z(v0Var3, true)));
                                        j1Var9.f12649n.setValue(Boolean.valueOf(b5.z(v0Var3, false)));
                                        i1Var.setValue(Boolean.valueOf(m3.q0.d(wVar7.f13100b)));
                                    } else if (j1Var9.a() == z0.C) {
                                        i1Var.setValue(Boolean.valueOf(b5.z(v0Var3, true)));
                                    }
                                    r3.p pVar9 = pVar5;
                                    q.B(j1Var9, wVar7, pVar9);
                                    e2 e2VarD2 = j1Var9.d();
                                    if (e2VarD2 != null && (b0Var2 = j1Var9.f12642e) != null && j1Var9.b() && (a0Var = e2VarD2.f12609b) != null && a0Var.A() && (a0Var2 = e2VarD2.f12610c) != null) {
                                        m3.n0 n0Var = e2VarD2.f12608a;
                                        a20.d dVar = new a20.d(a0Var, 26);
                                        h2.c cVarY = y3.Y(a0Var);
                                        h2.c cVarF = a0Var.F(a0Var2, false);
                                        if (kotlin.jvm.internal.m.a((r3.b0) b0Var2.f13047a.f13103b.get(), b0Var2)) {
                                            b0Var2.f13048b.g(wVar7, pVar9, n0Var, dVar, cVarY, cVarF);
                                        }
                                    }
                                }
                                return g00.b0.a;
                            }
                        };
                        g0Var3.n0(kVar6);
                        objN5 = kVar6;
                    }
                    final b2.r rVarN2 = z2.d0.n(oVar2, (u00.k) objN5);
                    j1 j1Var9 = j1Var4;
                    xVar3 = xVar2;
                    a1.t tVar4 = new a1.t(c0Var, wVar, j1Var9, z11, e0Var instanceof r3.q, pVar5, v0Var, jVar, tVar2);
                    j1Var5 = j1Var9;
                    if (!z11) {
                        z23 = false;
                    } else {
                        z23 = false;
                    }
                    if (z23) {
                        bz.o oVar5 = new bz.o(qVar, j1Var5, wVar, pVar5, 11);
                        j1Var5 = j1Var5;
                        rVarA = b2.a.a(oVar2, oVar5);
                    } else {
                        rVarA = oVar2;
                    }
                    zI3 = g0Var3.i(v0Var);
                    objN6 = g0Var3.N();
                    if (zI3) {
                        objN6 = new e1.o0(v0Var, 1);
                        g0Var3.n0(objN6);
                    } else {
                        objN6 = new e1.o0(v0Var, 1);
                        g0Var3.n0(objN6);
                    }
                    l1.q.e(v0Var, (u00.k) objN6, g0Var3);
                    boolean zI10 = g0Var3.i(j1Var5) | g0Var3.i(xVar3);
                    if (i24 == 4) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zI10 | z24 | ((i17 <= 32 && g0Var3.g(jVar)) || (i22 & 48) == 32);
                    objN7 = g0Var3.N();
                    if (z25) {
                        az.k kVar7 = new az.k(j1Var5, xVar3, wVar, jVar, 12);
                        jVar4 = jVar;
                        g0Var3.n0(kVar7);
                        objN7 = kVar7;
                    } else {
                        az.k kVar8 = new az.k(j1Var5, xVar3, wVar, jVar, 12);
                        jVar4 = jVar;
                        g0Var3.n0(kVar8);
                        objN7 = kVar8;
                    }
                    l1.q.e(jVar4, (u00.k) objN7, g0Var3);
                    final u00.k r0Var4 = j1Var5.f12657v;
                    if (i10 == 1) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    final int i28 = jVar4.f13077e;
                    b2.r rVarA6 = b2.a.a(oVar2, new u00.o() {
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            l1.g0 g0Var5 = (l1.g0) ((l1.j) obj3);
                            g0Var5.c0(851809892);
                            Object objN19 = g0Var5.N();
                            l1.c cVar8 = l1.i.f9868a;
                            if (objN19 == cVar8) {
                                objN19 = new e1.z0();
                                g0Var5.n0(objN19);
                            }
                            e1.z0 z0Var3 = (e1.z0) objN19;
                            Object objN110 = g0Var5.N();
                            if (objN110 == cVar8) {
                                objN110 = new x0();
                                g0Var5.n0(objN110);
                            }
                            v1 v1Var = new v1(j1Var5, v0Var, wVar, z30, z26, z0Var3, pVar5, i2Var, (x0) objN110, r0Var4, i28);
                            boolean zI11 = g0Var5.i(v1Var);
                            Object objN20 = g0Var5.N();
                            if (zI11 || objN20 == cVar8) {
                                gz.e1 e1Var = new gz.e1(1, v1Var, v1.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 16);
                                g0Var5.n0(e1Var);
                                objN20 = e1Var;
                            }
                            b2.r rVarD = t2.d.d(b2.o.A, (a10.g) objN20);
                            g0Var5.r(false);
                            return rVarD;
                        }
                    });
                    i18 = jVar4.f13076d;
                    if (i18 == 7) {
                        z27 = false;
                    } else {
                        z27 = true;
                    }
                    boolean zBooleanValue2 = ((Boolean) z0Var.getValue()).booleanValue();
                    zH = g0Var3.h(z27) | g0Var3.i(hVar3);
                    objN8 = g0Var3.N();
                    if (zH) {
                        objN8 = new ea.d(z27, hVar3, 2);
                        g0Var3.n0(objN8);
                    } else {
                        objN8 = new ea.d(z27, hVar3, 2);
                        g0Var3.n0(objN8);
                    }
                    b2.r rVarA7 = y0.b.a(oVar2, zBooleanValue2, z27, (u00.a) objN8);
                    v0Var2 = (i2.q) g0Var3.k(g.f12614a);
                    j11 = ((i2.t) g0Var3.k(g.f12615b)).f7169a;
                    final r3.p pVar9 = pVar5;
                    if (!i2.t.c(j11, i2.b0.c(1308617531))) {
                        v0Var2 = new i2.v0(j11);
                    }
                    zI4 = g0Var3.i(j1Var5) | g0Var3.g(v0Var2);
                    objN9 = g0Var3.N();
                    i19 = 5;
                    if (zI4) {
                        objN9 = new mu.q(j1Var5, v0Var2, 5);
                        g0Var3.n0(objN9);
                    } else {
                        objN9 = new mu.q(j1Var5, v0Var2, 5);
                        g0Var3.n0(objN9);
                    }
                    b2.r rVarE4 = t2.d.e(a1.x0.A(rVar.V(f2.h.g(oVar2, (u00.k) objN9)), hVar3, j1Var5, v0Var).V(rVarA7).V(rVarI), new w0(lVar, j1Var5));
                    int i29 = 0;
                    final b2 b2Var3 = b2Var;
                    b2.r rVarA8 = w0.h.a(z2.d0.n(t2.d.e(rVarE4, new w0(j1Var5, v0Var, i29)).V(rVarA6).V(new b2.l(new cz.m(3, b2Var3, iVar, z11))).V(rVarG2).V(tVar4), new r0(j1Var5, i29)), new al.i(v0Var, zVar3, 9));
                    if (!z11) {
                        z28 = false;
                    } else {
                        z28 = false;
                    }
                    if (z28) {
                        j3.z zVar8 = z.a1.f16893a;
                        rVarA2 = b2.a.a(oVar2, new a1.w(v0Var, i19));
                    } else {
                        rVarA2 = oVar2;
                    }
                    final b2.r rVar4 = rVarA2;
                    final y3.c cVar8 = cVar3;
                    final b2.r rVar5 = rVarA;
                    final j1 j1Var10 = j1Var5;
                    g0Var = g0Var3;
                    j(rVarA8, v0Var, v1.d.d(-814563849, new u00.n() {
                        public final Object invoke(Object obj2, Object obj3) {
                            l1.j jVar5 = (l1.j) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            l1.g0 g0Var5 = (l1.g0) jVar5;
                            if (g0Var5.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final j1 j1Var11 = j1Var10;
                                final m3.r0 r0Var5 = r0Var;
                                final int i210 = i11;
                                final int i211 = i10;
                                final b2 b2Var4 = b2Var3;
                                final r3.w wVar7 = wVar;
                                final r3.e0 e0Var3 = e0Var;
                                final b2.r rVar6 = rVar5;
                                final b2.r rVar7 = rVarE3;
                                final b2.r rVar8 = rVarN2;
                                final b2.r rVar9 = rVar4;
                                final n0.c cVar9 = cVar4;
                                final e1.v0 v0Var3 = v0Var;
                                final boolean z32 = z28;
                                final u00.k kVar9 = kVar2;
                                final r3.p pVar10 = pVar9;
                                final y3.c cVar10 = cVar8;
                                cVar.invoke(v1.d.d(-44346382, new u00.n() {
                                    public final Object invoke(Object obj4, Object obj5) throws NoWhenBranchMatchedException {
                                        b2.r k2Var;
                                        l1.j jVar6 = (l1.j) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        l1.g0 g0Var6 = (l1.g0) jVar6;
                                        if (g0Var6.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            j1 j1Var12 = j1Var11;
                                            b2.r rVarG3 = h0.z1.g(b2.o.A, ((y3.f) j1Var12.f12644g.getValue()).A, 0.0f, 2);
                                            int i30 = i210;
                                            int i31 = i211;
                                            q.F(i30, i31);
                                            m3.r0 r0Var6 = r0Var5;
                                            if (i30 != 1 || i31 != Integer.MAX_VALUE) {
                                                rVarG3 = rVarG3.V(new a1(r0Var6, i30, i31));
                                            }
                                            boolean zI11 = g0Var6.i(j1Var12);
                                            Object objN19 = g0Var6.N();
                                            if (zI11 || objN19 == l1.i.f9868a) {
                                                objN19 = new g1.l0(j1Var12, 29);
                                                g0Var6.n0(objN19);
                                            }
                                            u00.a aVar = (u00.a) objN19;
                                            b2 b2Var5 = b2Var4;
                                            d0.q1 q1Var3 = (d0.q1) b2Var5.f12574f.getValue();
                                            r3.w wVar8 = wVar7;
                                            long j15 = wVar8.f13100b;
                                            int i32 = m3.q0.f10519c;
                                            int iG = (int) (j15 >> 32);
                                            long j16 = b2Var5.f12573e;
                                            if (iG == ((int) (j16 >> 32)) && (iG = (int) (j15 & 4294967295L)) == ((int) (j16 & 4294967295L))) {
                                                iG = m3.q0.g(j15);
                                            }
                                            b2Var5.f12573e = wVar8.f13100b;
                                            r3.c0 c0VarA2 = j2.a(e0Var3, wVar8.f13099a);
                                            int iOrdinal = q1Var3.ordinal();
                                            if (iOrdinal == 0) {
                                                k2Var = new k2(b2Var5, iG, c0VarA2, aVar);
                                            } else {
                                                if (iOrdinal != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                k2Var = new d1(b2Var5, iG, c0VarA2, aVar);
                                            }
                                            z3.m(n0.d.a(f2.h.d(rVarG3).V(k2Var).V(rVar6).V(rVar7).V(new c2(r0Var6)).V(rVar8).V(rVar9), cVar9), v1.d.d(1412697320, new eu.m(v0Var3, j1Var12, z32, kVar9, wVar8, pVar10, cVar10, i31), jVar6), jVar6, 48);
                                        } else {
                                            g0Var6.V();
                                        }
                                        return g00.b0.a;
                                    }
                                }, jVar5), jVar5, 6);
                            } else {
                                g0Var5.V();
                            }
                            return g00.b0.a;
                        }
                    }, g0Var), g0Var, 384);
                }
                i2Var.f12634d = Long.valueOf(j10);
                i2Var.a(wVar);
                objN2 = g0Var2.N();
                if (objN2 == cVar5) {
                    objN2 = l1.q.o(g0Var2);
                    g0Var2.n0(objN2);
                }
                zVar = (a40.z) objN2;
                objN3 = g0Var2.N();
                if (objN3 == cVar5) {
                    objN3 = new n0.c();
                    g0Var2.n0(objN3);
                }
                cVar4 = (n0.c) objN3;
                objN4 = g0Var2.N();
                if (objN4 == cVar5) {
                    objN4 = new e1.v0(i2Var);
                    g0Var2.n0(objN4);
                }
                v0Var = (e1.v0) objN4;
                pVar2 = pVar;
                v0Var.f5016b = pVar2;
                v0Var.f5020f = e0Var;
                v0Var.f5017c = j1Var6.f12657v;
                v0Var.f5018d = j1Var6;
                v0Var.f5019e.setValue(wVar);
                v0Var.f5035w = new m3.q0(j14);
                v0Var.f5022h = (c3.g1) g0Var2.k(c3.o1.f2732f);
                v0Var.f5023i = zVar;
                v0Var.f5025k = (q2.a) g0Var2.k(c3.o1.l);
                g2.t tVar5 = tVar;
                v0Var.l = tVar5;
                final boolean z32 = true;
                v0Var.m.setValue(true);
                v0Var.f5026n.setValue(Boolean.valueOf(z11));
                g0Var2.c0(1966756105);
                e1.s sVar2 = e1.s.A;
                v0Var.f5024j = e1.r.b(r0Var2.f10522a.f10467k, g0Var2);
                g0Var2.r(false);
                j1Var6.b();
                boolean zI11 = g0Var2.i(j1Var6);
                i16 = i22 & 7168;
                if (i16 == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z33 = z15 | zI11;
                if ((i22 & 57344) == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean zI12 = z33 | z16 | g0Var2.i(xVar4);
                if (i24 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i17 = (i22 & 112) ^ 48;
                zI = zI12 | z17 | ((i17 <= 32 && g0Var2.g(jVar)) || (i22 & 48) == 32) | g0Var2.i(pVar2) | g0Var2.i(zVar) | g0Var2.i(cVar4) | g0Var2.i(v0Var);
                Object objN19 = g0Var2.N();
                if (zI) {
                    g0Var3 = g0Var2;
                    j1Var2 = j1Var6;
                    jVar3 = jVar;
                    obj = new u00.k() {
                        public final Object invoke(Object obj2) {
                            e2 e2VarD;
                            j1 j1Var11 = j1Var2;
                            g2.y yVar = (g2.y) ((g2.x) obj2);
                            if (j1Var11.b() != yVar.a()) {
                                j1Var11.f12643f.setValue(Boolean.valueOf(yVar.a()));
                                boolean zB = j1Var11.b();
                                r3.w wVar7 = wVar;
                                r3.p pVar10 = pVar2;
                                if (zB && z11) {
                                    q.D(xVar4, j1Var11, wVar7, jVar3, pVar10);
                                } else {
                                    q.s(j1Var11);
                                }
                                if (yVar.a() && (e2VarD = j1Var11.d()) != null) {
                                    a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new a1.f(cVar4, wVar7, j1Var11, e2VarD, pVar10, null, 12), 3);
                                }
                                if (!yVar.a()) {
                                    v0Var.g(null);
                                }
                            }
                            return g00.b0.a;
                        }
                    };
                    pVar3 = pVar2;
                    z18 = z11;
                    xVar = xVar4;
                    zVar2 = zVar;
                    wVar3 = wVar;
                    g0Var3.n0(obj);
                } else {
                    g0Var3 = g0Var2;
                    j1Var2 = j1Var6;
                    jVar3 = jVar;
                    obj = new u00.k() {
                        public final Object invoke(Object obj2) {
                            e2 e2VarD;
                            j1 j1Var11 = j1Var2;
                            g2.y yVar = (g2.y) ((g2.x) obj2);
                            if (j1Var11.b() != yVar.a()) {
                                j1Var11.f12643f.setValue(Boolean.valueOf(yVar.a()));
                                boolean zB = j1Var11.b();
                                r3.w wVar7 = wVar;
                                r3.p pVar10 = pVar2;
                                if (zB && z11) {
                                    q.D(xVar4, j1Var11, wVar7, jVar3, pVar10);
                                } else {
                                    q.s(j1Var11);
                                }
                                if (yVar.a() && (e2VarD = j1Var11.d()) != null) {
                                    a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new a1.f(cVar4, wVar7, j1Var11, e2VarD, pVar10, null, 12), 3);
                                }
                                if (!yVar.a()) {
                                    v0Var.g(null);
                                }
                            }
                            return g00.b0.a;
                        }
                    };
                    pVar3 = pVar2;
                    z18 = z11;
                    xVar = xVar4;
                    zVar2 = zVar;
                    wVar3 = wVar;
                    g0Var3.n0(obj);
                }
                oVar = b2.o.A;
                b2.r rVarI2 = z.n.i(g2.d.s(g2.d.j(oVar, tVar5), (u00.k) obj), z18, iVar);
                z0VarG = l1.q.G(Boolean.valueOf(z18), g0Var3);
                boolean zG5 = g0Var3.g(z0VarG) | g0Var3.i(j1Var2) | g0Var3.i(xVar) | g0Var3.i(v0Var);
                if (i17 > 32) {
                    j1Var3 = j1Var2;
                    if ((i22 & 48) != 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                } else {
                    j1Var3 = j1Var2;
                    if ((i22 & 48) != 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                }
                z20 = zG5 | z19;
                Object objN110 = g0Var3.N();
                if (z20) {
                    a40.z zVar9 = zVar2;
                    r3.x xVar8 = xVar;
                    zVar3 = zVar9;
                    oVar2 = oVar;
                    j1Var4 = j1Var3;
                    fVar = new a1.f(j1Var4, z0VarG, xVar8, v0Var, jVar3, null, 11);
                    z0Var = z0VarG;
                    xVar2 = xVar8;
                    g0Var3.n0(fVar);
                } else {
                    a40.z zVar10 = zVar2;
                    r3.x xVar9 = xVar;
                    zVar3 = zVar10;
                    oVar2 = oVar;
                    j1Var4 = j1Var3;
                    fVar = new a1.f(j1Var4, z0VarG, xVar9, v0Var, jVar3, null, 11);
                    z0Var = z0VarG;
                    xVar2 = xVar9;
                    g0Var3.n0(fVar);
                }
                l1.q.i(g00.b0.a, g0Var3, (u00.n) fVar);
                rVarB = v2.f0.b(oVar2, 8675309, new a1.g2(new r0(j1Var4, 4), 1));
                pVar4 = pVar3;
                oVar3 = new b1.o(j1Var4, tVar5, z18, v0Var, pVar4);
                if (z11) {
                    rVarB = b2.a.a(rVarB, new c0.f(oVar3, iVar, 18));
                }
                b2.r rVarV3 = rVarB.V(new v2.e0(v0Var.A, v0Var.f5038z, null, new a1.g2(v0Var, 4), 4));
                v2.p.f15394a.getClass();
                b2.r rVarG3 = v2.r.g(rVarV3, v2.r.f15396b);
                final b2.r rVarE5 = f2.h.e(oVar2, new b1.l(j1Var4, wVar3, pVar4, 28));
                boolean zI13 = g0Var3.i(j1Var4);
                if (i16 == 2048) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                boolean zG6 = zI13 | z21 | g0Var3.g(g3Var) | g0Var3.i(v0Var);
                if (i24 == 4) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                zI2 = zG6 | z22 | g0Var3.i(pVar4);
                objN5 = g0Var3.N();
                if (zI2) {
                    pVar5 = pVar4;
                    final r3.w wVar7 = wVar3;
                    u00.k kVar9 = new u00.k() {
                        public final Object invoke(Object obj2) {
                            r3.b0 b0Var2;
                            z2.a0 a0Var;
                            z2.a0 a0Var2;
                            j1 j1Var11 = j1Var4;
                            l1.i1 i1Var = j1Var11.f12650o;
                            z2.a0 a0Var3 = (z2.a0) obj2;
                            j1Var11.f12645h = a0Var3;
                            e2 e2VarD = j1Var11.d();
                            if (e2VarD != null) {
                                e2VarD.f12609b = a0Var3;
                            }
                            if (z11) {
                                z0 z0VarA = j1Var11.a();
                                z0 z0Var3 = z0.B;
                                e1.v0 v0Var3 = v0Var;
                                r3.w wVar8 = wVar7;
                                if (z0VarA == z0Var3) {
                                    if (((Boolean) j1Var11.l.getValue()).booleanValue() && ((c3.f2) g3Var).b()) {
                                        v0Var3.r();
                                    } else {
                                        v0Var3.o();
                                    }
                                    j1Var11.m.setValue(Boolean.valueOf(b5.z(v0Var3, true)));
                                    j1Var11.f12649n.setValue(Boolean.valueOf(b5.z(v0Var3, false)));
                                    i1Var.setValue(Boolean.valueOf(m3.q0.d(wVar8.f13100b)));
                                } else if (j1Var11.a() == z0.C) {
                                    i1Var.setValue(Boolean.valueOf(b5.z(v0Var3, true)));
                                }
                                r3.p pVar10 = pVar5;
                                q.B(j1Var11, wVar8, pVar10);
                                e2 e2VarD2 = j1Var11.d();
                                if (e2VarD2 != null && (b0Var2 = j1Var11.f12642e) != null && j1Var11.b() && (a0Var = e2VarD2.f12609b) != null && a0Var.A() && (a0Var2 = e2VarD2.f12610c) != null) {
                                    m3.n0 n0Var = e2VarD2.f12608a;
                                    a20.d dVar = new a20.d(a0Var, 26);
                                    h2.c cVarY = y3.Y(a0Var);
                                    h2.c cVarF = a0Var.F(a0Var2, false);
                                    if (kotlin.jvm.internal.m.a((r3.b0) b0Var2.f13047a.f13103b.get(), b0Var2)) {
                                        b0Var2.f13048b.g(wVar8, pVar10, n0Var, dVar, cVarY, cVarF);
                                    }
                                }
                            }
                            return g00.b0.a;
                        }
                    };
                    g0Var3.n0(kVar9);
                    objN5 = kVar9;
                } else {
                    pVar5 = pVar4;
                    final r3.w wVar8 = wVar3;
                    u00.k kVar10 = new u00.k() {
                        public final Object invoke(Object obj2) {
                            r3.b0 b0Var2;
                            z2.a0 a0Var;
                            z2.a0 a0Var2;
                            j1 j1Var11 = j1Var4;
                            l1.i1 i1Var = j1Var11.f12650o;
                            z2.a0 a0Var3 = (z2.a0) obj2;
                            j1Var11.f12645h = a0Var3;
                            e2 e2VarD = j1Var11.d();
                            if (e2VarD != null) {
                                e2VarD.f12609b = a0Var3;
                            }
                            if (z11) {
                                z0 z0VarA = j1Var11.a();
                                z0 z0Var3 = z0.B;
                                e1.v0 v0Var3 = v0Var;
                                r3.w wVar9 = wVar8;
                                if (z0VarA == z0Var3) {
                                    if (((Boolean) j1Var11.l.getValue()).booleanValue() && ((c3.f2) g3Var).b()) {
                                        v0Var3.r();
                                    } else {
                                        v0Var3.o();
                                    }
                                    j1Var11.m.setValue(Boolean.valueOf(b5.z(v0Var3, true)));
                                    j1Var11.f12649n.setValue(Boolean.valueOf(b5.z(v0Var3, false)));
                                    i1Var.setValue(Boolean.valueOf(m3.q0.d(wVar9.f13100b)));
                                } else if (j1Var11.a() == z0.C) {
                                    i1Var.setValue(Boolean.valueOf(b5.z(v0Var3, true)));
                                }
                                r3.p pVar10 = pVar5;
                                q.B(j1Var11, wVar9, pVar10);
                                e2 e2VarD2 = j1Var11.d();
                                if (e2VarD2 != null && (b0Var2 = j1Var11.f12642e) != null && j1Var11.b() && (a0Var = e2VarD2.f12609b) != null && a0Var.A() && (a0Var2 = e2VarD2.f12610c) != null) {
                                    m3.n0 n0Var = e2VarD2.f12608a;
                                    a20.d dVar = new a20.d(a0Var, 26);
                                    h2.c cVarY = y3.Y(a0Var);
                                    h2.c cVarF = a0Var.F(a0Var2, false);
                                    if (kotlin.jvm.internal.m.a((r3.b0) b0Var2.f13047a.f13103b.get(), b0Var2)) {
                                        b0Var2.f13048b.g(wVar9, pVar10, n0Var, dVar, cVarY, cVarF);
                                    }
                                }
                            }
                            return g00.b0.a;
                        }
                    };
                    g0Var3.n0(kVar10);
                    objN5 = kVar10;
                }
                final b2.r rVarN3 = z2.d0.n(oVar2, (u00.k) objN5);
                j1 j1Var11 = j1Var4;
                xVar3 = xVar2;
                a1.t tVar6 = new a1.t(c0Var, wVar, j1Var11, z11, e0Var instanceof r3.q, pVar5, v0Var, jVar, tVar5);
                j1Var5 = j1Var11;
                if (!z11) {
                    z23 = false;
                } else {
                    z23 = false;
                }
                if (z23) {
                    bz.o oVar6 = new bz.o(qVar, j1Var5, wVar, pVar5, 11);
                    j1Var5 = j1Var5;
                    rVarA = b2.a.a(oVar2, oVar6);
                } else {
                    rVarA = oVar2;
                }
                zI3 = g0Var3.i(v0Var);
                objN6 = g0Var3.N();
                if (zI3) {
                    objN6 = new e1.o0(v0Var, 1);
                    g0Var3.n0(objN6);
                } else {
                    objN6 = new e1.o0(v0Var, 1);
                    g0Var3.n0(objN6);
                }
                l1.q.e(v0Var, (u00.k) objN6, g0Var3);
                boolean zI14 = g0Var3.i(j1Var5) | g0Var3.i(xVar3);
                if (i24 == 4) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zI14 | z24 | ((i17 <= 32 && g0Var3.g(jVar)) || (i22 & 48) == 32);
                objN7 = g0Var3.N();
                if (z25) {
                    az.k kVar11 = new az.k(j1Var5, xVar3, wVar, jVar, 12);
                    jVar4 = jVar;
                    g0Var3.n0(kVar11);
                    objN7 = kVar11;
                } else {
                    az.k kVar12 = new az.k(j1Var5, xVar3, wVar, jVar, 12);
                    jVar4 = jVar;
                    g0Var3.n0(kVar12);
                    objN7 = kVar12;
                }
                l1.q.e(jVar4, (u00.k) objN7, g0Var3);
                final u00.k r0Var5 = j1Var5.f12657v;
                if (i10 == 1) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                final int i210 = jVar4.f13077e;
                b2.r rVarA9 = b2.a.a(oVar2, new u00.o() {
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        l1.g0 g0Var5 = (l1.g0) ((l1.j) obj3);
                        g0Var5.c0(851809892);
                        Object objN111 = g0Var5.N();
                        l1.c cVar9 = l1.i.f9868a;
                        if (objN111 == cVar9) {
                            objN111 = new e1.z0();
                            g0Var5.n0(objN111);
                        }
                        e1.z0 z0Var3 = (e1.z0) objN111;
                        Object objN112 = g0Var5.N();
                        if (objN112 == cVar9) {
                            objN112 = new x0();
                            g0Var5.n0(objN112);
                        }
                        v1 v1Var = new v1(j1Var5, v0Var, wVar, z32, z26, z0Var3, pVar5, i2Var, (x0) objN112, r0Var5, i210);
                        boolean zI15 = g0Var5.i(v1Var);
                        Object objN20 = g0Var5.N();
                        if (zI15 || objN20 == cVar9) {
                            gz.e1 e1Var = new gz.e1(1, v1Var, v1.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 16);
                            g0Var5.n0(e1Var);
                            objN20 = e1Var;
                        }
                        b2.r rVarD = t2.d.d(b2.o.A, (a10.g) objN20);
                        g0Var5.r(false);
                        return rVarD;
                    }
                });
                i18 = jVar4.f13076d;
                if (i18 == 7) {
                    z27 = false;
                } else {
                    z27 = true;
                }
                boolean zBooleanValue3 = ((Boolean) z0Var.getValue()).booleanValue();
                zH = g0Var3.h(z27) | g0Var3.i(hVar3);
                objN8 = g0Var3.N();
                if (zH) {
                    objN8 = new ea.d(z27, hVar3, 2);
                    g0Var3.n0(objN8);
                } else {
                    objN8 = new ea.d(z27, hVar3, 2);
                    g0Var3.n0(objN8);
                }
                b2.r rVarA10 = y0.b.a(oVar2, zBooleanValue3, z27, (u00.a) objN8);
                v0Var2 = (i2.q) g0Var3.k(g.f12614a);
                j11 = ((i2.t) g0Var3.k(g.f12615b)).f7169a;
                final r3.p pVar10 = pVar5;
                if (!i2.t.c(j11, i2.b0.c(1308617531))) {
                    v0Var2 = new i2.v0(j11);
                }
                zI4 = g0Var3.i(j1Var5) | g0Var3.g(v0Var2);
                objN9 = g0Var3.N();
                i19 = 5;
                if (zI4) {
                    objN9 = new mu.q(j1Var5, v0Var2, 5);
                    g0Var3.n0(objN9);
                } else {
                    objN9 = new mu.q(j1Var5, v0Var2, 5);
                    g0Var3.n0(objN9);
                }
                b2.r rVarE6 = t2.d.e(a1.x0.A(rVar.V(f2.h.g(oVar2, (u00.k) objN9)), hVar3, j1Var5, v0Var).V(rVarA10).V(rVarI2), new w0(lVar, j1Var5));
                int i211 = 0;
                final b2 b2Var4 = b2Var;
                b2.r rVarA11 = w0.h.a(z2.d0.n(t2.d.e(rVarE6, new w0(j1Var5, v0Var, i211)).V(rVarA9).V(new b2.l(new cz.m(3, b2Var4, iVar, z11))).V(rVarG3).V(tVar6), new r0(j1Var5, i211)), new al.i(v0Var, zVar3, 9));
                if (!z11) {
                    z28 = false;
                } else {
                    z28 = false;
                }
                if (z28) {
                    j3.z zVar11 = z.a1.f16893a;
                    rVarA2 = b2.a.a(oVar2, new a1.w(v0Var, i19));
                } else {
                    rVarA2 = oVar2;
                }
                final b2.r rVar6 = rVarA2;
                final y3.c cVar9 = cVar3;
                final b2.r rVar7 = rVarA;
                final j1 j1Var12 = j1Var5;
                g0Var = g0Var3;
                j(rVarA11, v0Var, v1.d.d(-814563849, new u00.n() {
                    public final Object invoke(Object obj2, Object obj3) {
                        l1.j jVar5 = (l1.j) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        l1.g0 g0Var5 = (l1.g0) jVar5;
                        if (g0Var5.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final j1 j1Var13 = j1Var12;
                            final m3.r0 r0Var6 = r0Var;
                            final int i212 = i11;
                            final int i213 = i10;
                            final b2 b2Var5 = b2Var4;
                            final r3.w wVar9 = wVar;
                            final r3.e0 e0Var3 = e0Var;
                            final b2.r rVar8 = rVar7;
                            final b2.r rVar9 = rVarE5;
                            final b2.r rVar10 = rVarN3;
                            final b2.r rVar11 = rVar6;
                            final n0.c cVar10 = cVar4;
                            final e1.v0 v0Var3 = v0Var;
                            final boolean z34 = z28;
                            final u00.k kVar13 = kVar2;
                            final r3.p pVar11 = pVar10;
                            final y3.c cVar11 = cVar9;
                            cVar.invoke(v1.d.d(-44346382, new u00.n() {
                                public final Object invoke(Object obj4, Object obj5) throws NoWhenBranchMatchedException {
                                    b2.r k2Var;
                                    l1.j jVar6 = (l1.j) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    l1.g0 g0Var6 = (l1.g0) jVar6;
                                    if (g0Var6.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        j1 j1Var14 = j1Var13;
                                        b2.r rVarG4 = h0.z1.g(b2.o.A, ((y3.f) j1Var14.f12644g.getValue()).A, 0.0f, 2);
                                        int i30 = i212;
                                        int i31 = i213;
                                        q.F(i30, i31);
                                        m3.r0 r0Var7 = r0Var6;
                                        if (i30 != 1 || i31 != Integer.MAX_VALUE) {
                                            rVarG4 = rVarG4.V(new a1(r0Var7, i30, i31));
                                        }
                                        boolean zI15 = g0Var6.i(j1Var14);
                                        Object objN111 = g0Var6.N();
                                        if (zI15 || objN111 == l1.i.f9868a) {
                                            objN111 = new g1.l0(j1Var14, 29);
                                            g0Var6.n0(objN111);
                                        }
                                        u00.a aVar = (u00.a) objN111;
                                        b2 b2Var6 = b2Var5;
                                        d0.q1 q1Var3 = (d0.q1) b2Var6.f12574f.getValue();
                                        r3.w wVar10 = wVar9;
                                        long j15 = wVar10.f13100b;
                                        int i32 = m3.q0.f10519c;
                                        int iG = (int) (j15 >> 32);
                                        long j16 = b2Var6.f12573e;
                                        if (iG == ((int) (j16 >> 32)) && (iG = (int) (j15 & 4294967295L)) == ((int) (j16 & 4294967295L))) {
                                            iG = m3.q0.g(j15);
                                        }
                                        b2Var6.f12573e = wVar10.f13100b;
                                        r3.c0 c0VarA2 = j2.a(e0Var3, wVar10.f13099a);
                                        int iOrdinal = q1Var3.ordinal();
                                        if (iOrdinal == 0) {
                                            k2Var = new k2(b2Var6, iG, c0VarA2, aVar);
                                        } else {
                                            if (iOrdinal != 1) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            k2Var = new d1(b2Var6, iG, c0VarA2, aVar);
                                        }
                                        z3.m(n0.d.a(f2.h.d(rVarG4).V(k2Var).V(rVar8).V(rVar9).V(new c2(r0Var7)).V(rVar10).V(rVar11), cVar10), v1.d.d(1412697320, new eu.m(v0Var3, j1Var14, z34, kVar13, wVar10, pVar11, cVar11, i31), jVar6), jVar6, 48);
                                    } else {
                                        g0Var6.V();
                                    }
                                    return g00.b0.a;
                                }
                            }, jVar5), jVar5, 6);
                        } else {
                            g0Var5.V();
                        }
                        return g00.b0.a;
                    }
                }, g0Var), g0Var, 384);
            } else {
                e0Var2.C = new com.google.android.material.datepicker.n(hVar7, j14);
                pVar = pVar7;
                lVar = lVar2;
                z13 = true;
            }
            z14 = false;
            if (q0Var2 == null) {
                com.google.android.material.datepicker.n nVar3 = (com.google.android.material.datepicker.n) e0Var2.C;
                nVar3.D = -1;
                nVar3.E = -1;
            } else {
                j9 = q0Var2.f10520a;
                if (!m3.q0.d(j9)) {
                    ((com.google.android.material.datepicker.n) e0Var2.C).f(m3.q0.g(j9), m3.q0.f(j9));
                }
            }
            if (z13) {
                com.google.android.material.datepicker.n nVar4 = (com.google.android.material.datepicker.n) e0Var2.C;
                nVar4.D = -1;
                nVar4.E = -1;
                wVarB = r3.w.b(wVar, null, 0L, 3);
            } else {
                com.google.android.material.datepicker.n nVar5 = (com.google.android.material.datepicker.n) e0Var2.C;
                nVar5.D = -1;
                nVar5.E = -1;
                wVarB = r3.w.b(wVar, null, 0L, 3);
            }
            wVar2 = (r3.w) e0Var2.B;
            e0Var2.B = wVarB;
            if (b0Var != null) {
                b0Var.a(wVar2, wVarB);
            }
            objN = g0Var4.N();
            if (objN == cVar5) {
                objN = new i2();
                g0Var2 = g0Var4;
                g0Var2.n0(objN);
            } else {
                g0Var2 = g0Var4;
            }
            i2Var = (i2) objN;
            jCurrentTimeMillis = System.currentTimeMillis();
            if (i2Var.f12635e) {
                l = i2Var.f12634d;
                j10 = jCurrentTimeMillis;
                if (j10 > (l != null ? l.longValue() : 0L) + ((long) 5000)) {
                }
                objN2 = g0Var2.N();
                if (objN2 == cVar5) {
                    objN2 = l1.q.o(g0Var2);
                    g0Var2.n0(objN2);
                }
                zVar = (a40.z) objN2;
                objN3 = g0Var2.N();
                if (objN3 == cVar5) {
                    objN3 = new n0.c();
                    g0Var2.n0(objN3);
                }
                cVar4 = (n0.c) objN3;
                objN4 = g0Var2.N();
                if (objN4 == cVar5) {
                    objN4 = new e1.v0(i2Var);
                    g0Var2.n0(objN4);
                }
                v0Var = (e1.v0) objN4;
                pVar2 = pVar;
                v0Var.f5016b = pVar2;
                v0Var.f5020f = e0Var;
                v0Var.f5017c = j1Var6.f12657v;
                v0Var.f5018d = j1Var6;
                v0Var.f5019e.setValue(wVar);
                v0Var.f5035w = new m3.q0(j14);
                v0Var.f5022h = (c3.g1) g0Var2.k(c3.o1.f2732f);
                v0Var.f5023i = zVar;
                v0Var.f5025k = (q2.a) g0Var2.k(c3.o1.l);
                g2.t tVar7 = tVar;
                v0Var.l = tVar7;
                final boolean z34 = true;
                v0Var.m.setValue(true);
                v0Var.f5026n.setValue(Boolean.valueOf(z11));
                g0Var2.c0(1966756105);
                e1.s sVar3 = e1.s.A;
                v0Var.f5024j = e1.r.b(r0Var2.f10522a.f10467k, g0Var2);
                g0Var2.r(false);
                j1Var6.b();
                boolean zI15 = g0Var2.i(j1Var6);
                i16 = i22 & 7168;
                if (i16 == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z35 = z15 | zI15;
                if ((i22 & 57344) == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean zI16 = z35 | z16 | g0Var2.i(xVar4);
                if (i24 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i17 = (i22 & 112) ^ 48;
                zI = zI16 | z17 | ((i17 <= 32 && g0Var2.g(jVar)) || (i22 & 48) == 32) | g0Var2.i(pVar2) | g0Var2.i(zVar) | g0Var2.i(cVar4) | g0Var2.i(v0Var);
                Object objN111 = g0Var2.N();
                if (zI) {
                    g0Var3 = g0Var2;
                    j1Var2 = j1Var6;
                    jVar3 = jVar;
                    obj = new u00.k() {
                        public final Object invoke(Object obj2) {
                            e2 e2VarD;
                            j1 j1Var13 = j1Var2;
                            g2.y yVar = (g2.y) ((g2.x) obj2);
                            if (j1Var13.b() != yVar.a()) {
                                j1Var13.f12643f.setValue(Boolean.valueOf(yVar.a()));
                                boolean zB = j1Var13.b();
                                r3.w wVar9 = wVar;
                                r3.p pVar11 = pVar2;
                                if (zB && z11) {
                                    q.D(xVar4, j1Var13, wVar9, jVar3, pVar11);
                                } else {
                                    q.s(j1Var13);
                                }
                                if (yVar.a() && (e2VarD = j1Var13.d()) != null) {
                                    a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new a1.f(cVar4, wVar9, j1Var13, e2VarD, pVar11, null, 12), 3);
                                }
                                if (!yVar.a()) {
                                    v0Var.g(null);
                                }
                            }
                            return g00.b0.a;
                        }
                    };
                    pVar3 = pVar2;
                    z18 = z11;
                    xVar = xVar4;
                    zVar2 = zVar;
                    wVar3 = wVar;
                    g0Var3.n0(obj);
                } else {
                    g0Var3 = g0Var2;
                    j1Var2 = j1Var6;
                    jVar3 = jVar;
                    obj = new u00.k() {
                        public final Object invoke(Object obj2) {
                            e2 e2VarD;
                            j1 j1Var13 = j1Var2;
                            g2.y yVar = (g2.y) ((g2.x) obj2);
                            if (j1Var13.b() != yVar.a()) {
                                j1Var13.f12643f.setValue(Boolean.valueOf(yVar.a()));
                                boolean zB = j1Var13.b();
                                r3.w wVar9 = wVar;
                                r3.p pVar11 = pVar2;
                                if (zB && z11) {
                                    q.D(xVar4, j1Var13, wVar9, jVar3, pVar11);
                                } else {
                                    q.s(j1Var13);
                                }
                                if (yVar.a() && (e2VarD = j1Var13.d()) != null) {
                                    a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new a1.f(cVar4, wVar9, j1Var13, e2VarD, pVar11, null, 12), 3);
                                }
                                if (!yVar.a()) {
                                    v0Var.g(null);
                                }
                            }
                            return g00.b0.a;
                        }
                    };
                    pVar3 = pVar2;
                    z18 = z11;
                    xVar = xVar4;
                    zVar2 = zVar;
                    wVar3 = wVar;
                    g0Var3.n0(obj);
                }
                oVar = b2.o.A;
                b2.r rVarI3 = z.n.i(g2.d.s(g2.d.j(oVar, tVar7), (u00.k) obj), z18, iVar);
                z0VarG = l1.q.G(Boolean.valueOf(z18), g0Var3);
                boolean zG7 = g0Var3.g(z0VarG) | g0Var3.i(j1Var2) | g0Var3.i(xVar) | g0Var3.i(v0Var);
                if (i17 > 32) {
                    j1Var3 = j1Var2;
                    if ((i22 & 48) != 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                } else {
                    j1Var3 = j1Var2;
                    if ((i22 & 48) != 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                }
                z20 = zG7 | z19;
                Object objN112 = g0Var3.N();
                if (z20) {
                    a40.z zVar12 = zVar2;
                    r3.x xVar10 = xVar;
                    zVar3 = zVar12;
                    oVar2 = oVar;
                    j1Var4 = j1Var3;
                    fVar = new a1.f(j1Var4, z0VarG, xVar10, v0Var, jVar3, null, 11);
                    z0Var = z0VarG;
                    xVar2 = xVar10;
                    g0Var3.n0(fVar);
                } else {
                    a40.z zVar13 = zVar2;
                    r3.x xVar11 = xVar;
                    zVar3 = zVar13;
                    oVar2 = oVar;
                    j1Var4 = j1Var3;
                    fVar = new a1.f(j1Var4, z0VarG, xVar11, v0Var, jVar3, null, 11);
                    z0Var = z0VarG;
                    xVar2 = xVar11;
                    g0Var3.n0(fVar);
                }
                l1.q.i(g00.b0.a, g0Var3, (u00.n) fVar);
                rVarB = v2.f0.b(oVar2, 8675309, new a1.g2(new r0(j1Var4, 4), 1));
                pVar4 = pVar3;
                oVar3 = new b1.o(j1Var4, tVar7, z18, v0Var, pVar4);
                if (z11) {
                    rVarB = b2.a.a(rVarB, new c0.f(oVar3, iVar, 18));
                }
                b2.r rVarV4 = rVarB.V(new v2.e0(v0Var.A, v0Var.f5038z, null, new a1.g2(v0Var, 4), 4));
                v2.p.f15394a.getClass();
                b2.r rVarG4 = v2.r.g(rVarV4, v2.r.f15396b);
                final b2.r rVarE7 = f2.h.e(oVar2, new b1.l(j1Var4, wVar3, pVar4, 28));
                boolean zI17 = g0Var3.i(j1Var4);
                if (i16 == 2048) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                boolean zG8 = zI17 | z21 | g0Var3.g(g3Var) | g0Var3.i(v0Var);
                if (i24 == 4) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                zI2 = zG8 | z22 | g0Var3.i(pVar4);
                objN5 = g0Var3.N();
                if (zI2) {
                    pVar5 = pVar4;
                    final r3.w wVar9 = wVar3;
                    u00.k kVar13 = new u00.k() {
                        public final Object invoke(Object obj2) {
                            r3.b0 b0Var2;
                            z2.a0 a0Var;
                            z2.a0 a0Var2;
                            j1 j1Var13 = j1Var4;
                            l1.i1 i1Var = j1Var13.f12650o;
                            z2.a0 a0Var3 = (z2.a0) obj2;
                            j1Var13.f12645h = a0Var3;
                            e2 e2VarD = j1Var13.d();
                            if (e2VarD != null) {
                                e2VarD.f12609b = a0Var3;
                            }
                            if (z11) {
                                z0 z0VarA = j1Var13.a();
                                z0 z0Var3 = z0.B;
                                e1.v0 v0Var3 = v0Var;
                                r3.w wVar10 = wVar9;
                                if (z0VarA == z0Var3) {
                                    if (((Boolean) j1Var13.l.getValue()).booleanValue() && ((c3.f2) g3Var).b()) {
                                        v0Var3.r();
                                    } else {
                                        v0Var3.o();
                                    }
                                    j1Var13.m.setValue(Boolean.valueOf(b5.z(v0Var3, true)));
                                    j1Var13.f12649n.setValue(Boolean.valueOf(b5.z(v0Var3, false)));
                                    i1Var.setValue(Boolean.valueOf(m3.q0.d(wVar10.f13100b)));
                                } else if (j1Var13.a() == z0.C) {
                                    i1Var.setValue(Boolean.valueOf(b5.z(v0Var3, true)));
                                }
                                r3.p pVar11 = pVar5;
                                q.B(j1Var13, wVar10, pVar11);
                                e2 e2VarD2 = j1Var13.d();
                                if (e2VarD2 != null && (b0Var2 = j1Var13.f12642e) != null && j1Var13.b() && (a0Var = e2VarD2.f12609b) != null && a0Var.A() && (a0Var2 = e2VarD2.f12610c) != null) {
                                    m3.n0 n0Var = e2VarD2.f12608a;
                                    a20.d dVar = new a20.d(a0Var, 26);
                                    h2.c cVarY = y3.Y(a0Var);
                                    h2.c cVarF = a0Var.F(a0Var2, false);
                                    if (kotlin.jvm.internal.m.a((r3.b0) b0Var2.f13047a.f13103b.get(), b0Var2)) {
                                        b0Var2.f13048b.g(wVar10, pVar11, n0Var, dVar, cVarY, cVarF);
                                    }
                                }
                            }
                            return g00.b0.a;
                        }
                    };
                    g0Var3.n0(kVar13);
                    objN5 = kVar13;
                } else {
                    pVar5 = pVar4;
                    final r3.w wVar10 = wVar3;
                    u00.k kVar14 = new u00.k() {
                        public final Object invoke(Object obj2) {
                            r3.b0 b0Var2;
                            z2.a0 a0Var;
                            z2.a0 a0Var2;
                            j1 j1Var13 = j1Var4;
                            l1.i1 i1Var = j1Var13.f12650o;
                            z2.a0 a0Var3 = (z2.a0) obj2;
                            j1Var13.f12645h = a0Var3;
                            e2 e2VarD = j1Var13.d();
                            if (e2VarD != null) {
                                e2VarD.f12609b = a0Var3;
                            }
                            if (z11) {
                                z0 z0VarA = j1Var13.a();
                                z0 z0Var3 = z0.B;
                                e1.v0 v0Var3 = v0Var;
                                r3.w wVar11 = wVar10;
                                if (z0VarA == z0Var3) {
                                    if (((Boolean) j1Var13.l.getValue()).booleanValue() && ((c3.f2) g3Var).b()) {
                                        v0Var3.r();
                                    } else {
                                        v0Var3.o();
                                    }
                                    j1Var13.m.setValue(Boolean.valueOf(b5.z(v0Var3, true)));
                                    j1Var13.f12649n.setValue(Boolean.valueOf(b5.z(v0Var3, false)));
                                    i1Var.setValue(Boolean.valueOf(m3.q0.d(wVar11.f13100b)));
                                } else if (j1Var13.a() == z0.C) {
                                    i1Var.setValue(Boolean.valueOf(b5.z(v0Var3, true)));
                                }
                                r3.p pVar11 = pVar5;
                                q.B(j1Var13, wVar11, pVar11);
                                e2 e2VarD2 = j1Var13.d();
                                if (e2VarD2 != null && (b0Var2 = j1Var13.f12642e) != null && j1Var13.b() && (a0Var = e2VarD2.f12609b) != null && a0Var.A() && (a0Var2 = e2VarD2.f12610c) != null) {
                                    m3.n0 n0Var = e2VarD2.f12608a;
                                    a20.d dVar = new a20.d(a0Var, 26);
                                    h2.c cVarY = y3.Y(a0Var);
                                    h2.c cVarF = a0Var.F(a0Var2, false);
                                    if (kotlin.jvm.internal.m.a((r3.b0) b0Var2.f13047a.f13103b.get(), b0Var2)) {
                                        b0Var2.f13048b.g(wVar11, pVar11, n0Var, dVar, cVarY, cVarF);
                                    }
                                }
                            }
                            return g00.b0.a;
                        }
                    };
                    g0Var3.n0(kVar14);
                    objN5 = kVar14;
                }
                final b2.r rVarN4 = z2.d0.n(oVar2, (u00.k) objN5);
                j1 j1Var13 = j1Var4;
                xVar3 = xVar2;
                a1.t tVar8 = new a1.t(c0Var, wVar, j1Var13, z11, e0Var instanceof r3.q, pVar5, v0Var, jVar, tVar7);
                j1Var5 = j1Var13;
                if (!z11) {
                    z23 = false;
                } else {
                    z23 = false;
                }
                if (z23) {
                    bz.o oVar7 = new bz.o(qVar, j1Var5, wVar, pVar5, 11);
                    j1Var5 = j1Var5;
                    rVarA = b2.a.a(oVar2, oVar7);
                } else {
                    rVarA = oVar2;
                }
                zI3 = g0Var3.i(v0Var);
                objN6 = g0Var3.N();
                if (zI3) {
                    objN6 = new e1.o0(v0Var, 1);
                    g0Var3.n0(objN6);
                } else {
                    objN6 = new e1.o0(v0Var, 1);
                    g0Var3.n0(objN6);
                }
                l1.q.e(v0Var, (u00.k) objN6, g0Var3);
                boolean zI18 = g0Var3.i(j1Var5) | g0Var3.i(xVar3);
                if (i24 == 4) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zI18 | z24 | ((i17 <= 32 && g0Var3.g(jVar)) || (i22 & 48) == 32);
                objN7 = g0Var3.N();
                if (z25) {
                    az.k kVar15 = new az.k(j1Var5, xVar3, wVar, jVar, 12);
                    jVar4 = jVar;
                    g0Var3.n0(kVar15);
                    objN7 = kVar15;
                } else {
                    az.k kVar16 = new az.k(j1Var5, xVar3, wVar, jVar, 12);
                    jVar4 = jVar;
                    g0Var3.n0(kVar16);
                    objN7 = kVar16;
                }
                l1.q.e(jVar4, (u00.k) objN7, g0Var3);
                final u00.k r0Var6 = j1Var5.f12657v;
                if (i10 == 1) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                final int i212 = jVar4.f13077e;
                b2.r rVarA12 = b2.a.a(oVar2, new u00.o() {
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        l1.g0 g0Var5 = (l1.g0) ((l1.j) obj3);
                        g0Var5.c0(851809892);
                        Object objN113 = g0Var5.N();
                        l1.c cVar10 = l1.i.f9868a;
                        if (objN113 == cVar10) {
                            objN113 = new e1.z0();
                            g0Var5.n0(objN113);
                        }
                        e1.z0 z0Var3 = (e1.z0) objN113;
                        Object objN114 = g0Var5.N();
                        if (objN114 == cVar10) {
                            objN114 = new x0();
                            g0Var5.n0(objN114);
                        }
                        v1 v1Var = new v1(j1Var5, v0Var, wVar, z34, z26, z0Var3, pVar5, i2Var, (x0) objN114, r0Var6, i212);
                        boolean zI19 = g0Var5.i(v1Var);
                        Object objN20 = g0Var5.N();
                        if (zI19 || objN20 == cVar10) {
                            gz.e1 e1Var = new gz.e1(1, v1Var, v1.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 16);
                            g0Var5.n0(e1Var);
                            objN20 = e1Var;
                        }
                        b2.r rVarD = t2.d.d(b2.o.A, (a10.g) objN20);
                        g0Var5.r(false);
                        return rVarD;
                    }
                });
                i18 = jVar4.f13076d;
                if (i18 == 7) {
                    z27 = false;
                } else {
                    z27 = true;
                }
                boolean zBooleanValue4 = ((Boolean) z0Var.getValue()).booleanValue();
                zH = g0Var3.h(z27) | g0Var3.i(hVar3);
                objN8 = g0Var3.N();
                if (zH) {
                    objN8 = new ea.d(z27, hVar3, 2);
                    g0Var3.n0(objN8);
                } else {
                    objN8 = new ea.d(z27, hVar3, 2);
                    g0Var3.n0(objN8);
                }
                b2.r rVarA13 = y0.b.a(oVar2, zBooleanValue4, z27, (u00.a) objN8);
                v0Var2 = (i2.q) g0Var3.k(g.f12614a);
                j11 = ((i2.t) g0Var3.k(g.f12615b)).f7169a;
                final r3.p pVar11 = pVar5;
                if (!i2.t.c(j11, i2.b0.c(1308617531))) {
                    v0Var2 = new i2.v0(j11);
                }
                zI4 = g0Var3.i(j1Var5) | g0Var3.g(v0Var2);
                objN9 = g0Var3.N();
                i19 = 5;
                if (zI4) {
                    objN9 = new mu.q(j1Var5, v0Var2, 5);
                    g0Var3.n0(objN9);
                } else {
                    objN9 = new mu.q(j1Var5, v0Var2, 5);
                    g0Var3.n0(objN9);
                }
                b2.r rVarE8 = t2.d.e(a1.x0.A(rVar.V(f2.h.g(oVar2, (u00.k) objN9)), hVar3, j1Var5, v0Var).V(rVarA13).V(rVarI3), new w0(lVar, j1Var5));
                int i213 = 0;
                final b2 b2Var5 = b2Var;
                b2.r rVarA14 = w0.h.a(z2.d0.n(t2.d.e(rVarE8, new w0(j1Var5, v0Var, i213)).V(rVarA12).V(new b2.l(new cz.m(3, b2Var5, iVar, z11))).V(rVarG4).V(tVar8), new r0(j1Var5, i213)), new al.i(v0Var, zVar3, 9));
                if (!z11) {
                    z28 = false;
                } else {
                    z28 = false;
                }
                if (z28) {
                    j3.z zVar14 = z.a1.f16893a;
                    rVarA2 = b2.a.a(oVar2, new a1.w(v0Var, i19));
                } else {
                    rVarA2 = oVar2;
                }
                final b2.r rVar8 = rVarA2;
                final y3.c cVar10 = cVar3;
                final b2.r rVar9 = rVarA;
                final j1 j1Var14 = j1Var5;
                g0Var = g0Var3;
                j(rVarA14, v0Var, v1.d.d(-814563849, new u00.n() {
                    public final Object invoke(Object obj2, Object obj3) {
                        l1.j jVar5 = (l1.j) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        l1.g0 g0Var5 = (l1.g0) jVar5;
                        if (g0Var5.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final j1 j1Var15 = j1Var14;
                            final m3.r0 r0Var7 = r0Var;
                            final int i214 = i11;
                            final int i215 = i10;
                            final b2 b2Var6 = b2Var5;
                            final r3.w wVar11 = wVar;
                            final r3.e0 e0Var3 = e0Var;
                            final b2.r rVar10 = rVar9;
                            final b2.r rVar11 = rVarE7;
                            final b2.r rVar12 = rVarN4;
                            final b2.r rVar13 = rVar8;
                            final n0.c cVar11 = cVar4;
                            final e1.v0 v0Var3 = v0Var;
                            final boolean z36 = z28;
                            final u00.k kVar17 = kVar2;
                            final r3.p pVar12 = pVar11;
                            final y3.c cVar12 = cVar10;
                            cVar.invoke(v1.d.d(-44346382, new u00.n() {
                                public final Object invoke(Object obj4, Object obj5) throws NoWhenBranchMatchedException {
                                    b2.r k2Var;
                                    l1.j jVar6 = (l1.j) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    l1.g0 g0Var6 = (l1.g0) jVar6;
                                    if (g0Var6.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        j1 j1Var16 = j1Var15;
                                        b2.r rVarG5 = h0.z1.g(b2.o.A, ((y3.f) j1Var16.f12644g.getValue()).A, 0.0f, 2);
                                        int i30 = i214;
                                        int i31 = i215;
                                        q.F(i30, i31);
                                        m3.r0 r0Var8 = r0Var7;
                                        if (i30 != 1 || i31 != Integer.MAX_VALUE) {
                                            rVarG5 = rVarG5.V(new a1(r0Var8, i30, i31));
                                        }
                                        boolean zI19 = g0Var6.i(j1Var16);
                                        Object objN113 = g0Var6.N();
                                        if (zI19 || objN113 == l1.i.f9868a) {
                                            objN113 = new g1.l0(j1Var16, 29);
                                            g0Var6.n0(objN113);
                                        }
                                        u00.a aVar = (u00.a) objN113;
                                        b2 b2Var7 = b2Var6;
                                        d0.q1 q1Var3 = (d0.q1) b2Var7.f12574f.getValue();
                                        r3.w wVar12 = wVar11;
                                        long j15 = wVar12.f13100b;
                                        int i32 = m3.q0.f10519c;
                                        int iG = (int) (j15 >> 32);
                                        long j16 = b2Var7.f12573e;
                                        if (iG == ((int) (j16 >> 32)) && (iG = (int) (j15 & 4294967295L)) == ((int) (j16 & 4294967295L))) {
                                            iG = m3.q0.g(j15);
                                        }
                                        b2Var7.f12573e = wVar12.f13100b;
                                        r3.c0 c0VarA2 = j2.a(e0Var3, wVar12.f13099a);
                                        int iOrdinal = q1Var3.ordinal();
                                        if (iOrdinal == 0) {
                                            k2Var = new k2(b2Var7, iG, c0VarA2, aVar);
                                        } else {
                                            if (iOrdinal != 1) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            k2Var = new d1(b2Var7, iG, c0VarA2, aVar);
                                        }
                                        z3.m(n0.d.a(f2.h.d(rVarG5).V(k2Var).V(rVar10).V(rVar11).V(new c2(r0Var8)).V(rVar12).V(rVar13), cVar11), v1.d.d(1412697320, new eu.m(v0Var3, j1Var16, z36, kVar17, wVar12, pVar12, cVar12, i31), jVar6), jVar6, 48);
                                    } else {
                                        g0Var6.V();
                                    }
                                    return g00.b0.a;
                                }
                            }, jVar5), jVar5, 6);
                        } else {
                            g0Var5.V();
                        }
                        return g00.b0.a;
                    }
                }, g0Var), g0Var, 384);
            } else {
                j10 = jCurrentTimeMillis;
            }
            i2Var.f12634d = Long.valueOf(j10);
            i2Var.a(wVar);
            objN2 = g0Var2.N();
            if (objN2 == cVar5) {
                objN2 = l1.q.o(g0Var2);
                g0Var2.n0(objN2);
            }
            zVar = (a40.z) objN2;
            objN3 = g0Var2.N();
            if (objN3 == cVar5) {
                objN3 = new n0.c();
                g0Var2.n0(objN3);
            }
            cVar4 = (n0.c) objN3;
            objN4 = g0Var2.N();
            if (objN4 == cVar5) {
                objN4 = new e1.v0(i2Var);
                g0Var2.n0(objN4);
            }
            v0Var = (e1.v0) objN4;
            pVar2 = pVar;
            v0Var.f5016b = pVar2;
            v0Var.f5020f = e0Var;
            v0Var.f5017c = j1Var6.f12657v;
            v0Var.f5018d = j1Var6;
            v0Var.f5019e.setValue(wVar);
            v0Var.f5035w = new m3.q0(j14);
            v0Var.f5022h = (c3.g1) g0Var2.k(c3.o1.f2732f);
            v0Var.f5023i = zVar;
            v0Var.f5025k = (q2.a) g0Var2.k(c3.o1.l);
            g2.t tVar9 = tVar;
            v0Var.l = tVar9;
            final boolean z36 = true;
            v0Var.m.setValue(true);
            v0Var.f5026n.setValue(Boolean.valueOf(z11));
            g0Var2.c0(1966756105);
            e1.s sVar4 = e1.s.A;
            v0Var.f5024j = e1.r.b(r0Var2.f10522a.f10467k, g0Var2);
            g0Var2.r(false);
            j1Var6.b();
            boolean zI19 = g0Var2.i(j1Var6);
            i16 = i22 & 7168;
            if (i16 == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z37 = z15 | zI19;
            if ((i22 & 57344) == 16384) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean zI110 = z37 | z16 | g0Var2.i(xVar4);
            if (i24 == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            i17 = (i22 & 112) ^ 48;
            zI = zI110 | z17 | ((i17 <= 32 && g0Var2.g(jVar)) || (i22 & 48) == 32) | g0Var2.i(pVar2) | g0Var2.i(zVar) | g0Var2.i(cVar4) | g0Var2.i(v0Var);
            Object objN113 = g0Var2.N();
            if (zI) {
                g0Var3 = g0Var2;
                j1Var2 = j1Var6;
                jVar3 = jVar;
                obj = new u00.k() {
                    public final Object invoke(Object obj2) {
                        e2 e2VarD;
                        j1 j1Var15 = j1Var2;
                        g2.y yVar = (g2.y) ((g2.x) obj2);
                        if (j1Var15.b() != yVar.a()) {
                            j1Var15.f12643f.setValue(Boolean.valueOf(yVar.a()));
                            boolean zB = j1Var15.b();
                            r3.w wVar11 = wVar;
                            r3.p pVar12 = pVar2;
                            if (zB && z11) {
                                q.D(xVar4, j1Var15, wVar11, jVar3, pVar12);
                            } else {
                                q.s(j1Var15);
                            }
                            if (yVar.a() && (e2VarD = j1Var15.d()) != null) {
                                a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new a1.f(cVar4, wVar11, j1Var15, e2VarD, pVar12, null, 12), 3);
                            }
                            if (!yVar.a()) {
                                v0Var.g(null);
                            }
                        }
                        return g00.b0.a;
                    }
                };
                pVar3 = pVar2;
                z18 = z11;
                xVar = xVar4;
                zVar2 = zVar;
                wVar3 = wVar;
                g0Var3.n0(obj);
            } else {
                g0Var3 = g0Var2;
                j1Var2 = j1Var6;
                jVar3 = jVar;
                obj = new u00.k() {
                    public final Object invoke(Object obj2) {
                        e2 e2VarD;
                        j1 j1Var15 = j1Var2;
                        g2.y yVar = (g2.y) ((g2.x) obj2);
                        if (j1Var15.b() != yVar.a()) {
                            j1Var15.f12643f.setValue(Boolean.valueOf(yVar.a()));
                            boolean zB = j1Var15.b();
                            r3.w wVar11 = wVar;
                            r3.p pVar12 = pVar2;
                            if (zB && z11) {
                                q.D(xVar4, j1Var15, wVar11, jVar3, pVar12);
                            } else {
                                q.s(j1Var15);
                            }
                            if (yVar.a() && (e2VarD = j1Var15.d()) != null) {
                                a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new a1.f(cVar4, wVar11, j1Var15, e2VarD, pVar12, null, 12), 3);
                            }
                            if (!yVar.a()) {
                                v0Var.g(null);
                            }
                        }
                        return g00.b0.a;
                    }
                };
                pVar3 = pVar2;
                z18 = z11;
                xVar = xVar4;
                zVar2 = zVar;
                wVar3 = wVar;
                g0Var3.n0(obj);
            }
            oVar = b2.o.A;
            b2.r rVarI4 = z.n.i(g2.d.s(g2.d.j(oVar, tVar9), (u00.k) obj), z18, iVar);
            z0VarG = l1.q.G(Boolean.valueOf(z18), g0Var3);
            boolean zG9 = g0Var3.g(z0VarG) | g0Var3.i(j1Var2) | g0Var3.i(xVar) | g0Var3.i(v0Var);
            if (i17 > 32) {
                j1Var3 = j1Var2;
                if ((i22 & 48) != 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
            } else {
                j1Var3 = j1Var2;
                if ((i22 & 48) != 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
            }
            z20 = zG9 | z19;
            Object objN114 = g0Var3.N();
            if (z20) {
                a40.z zVar15 = zVar2;
                r3.x xVar12 = xVar;
                zVar3 = zVar15;
                oVar2 = oVar;
                j1Var4 = j1Var3;
                fVar = new a1.f(j1Var4, z0VarG, xVar12, v0Var, jVar3, null, 11);
                z0Var = z0VarG;
                xVar2 = xVar12;
                g0Var3.n0(fVar);
            } else {
                a40.z zVar16 = zVar2;
                r3.x xVar13 = xVar;
                zVar3 = zVar16;
                oVar2 = oVar;
                j1Var4 = j1Var3;
                fVar = new a1.f(j1Var4, z0VarG, xVar13, v0Var, jVar3, null, 11);
                z0Var = z0VarG;
                xVar2 = xVar13;
                g0Var3.n0(fVar);
            }
            l1.q.i(g00.b0.a, g0Var3, (u00.n) fVar);
            rVarB = v2.f0.b(oVar2, 8675309, new a1.g2(new r0(j1Var4, 4), 1));
            pVar4 = pVar3;
            oVar3 = new b1.o(j1Var4, tVar9, z18, v0Var, pVar4);
            if (z11) {
                rVarB = b2.a.a(rVarB, new c0.f(oVar3, iVar, 18));
            }
            b2.r rVarV5 = rVarB.V(new v2.e0(v0Var.A, v0Var.f5038z, null, new a1.g2(v0Var, 4), 4));
            v2.p.f15394a.getClass();
            b2.r rVarG5 = v2.r.g(rVarV5, v2.r.f15396b);
            final b2.r rVarE9 = f2.h.e(oVar2, new b1.l(j1Var4, wVar3, pVar4, 28));
            boolean zI111 = g0Var3.i(j1Var4);
            if (i16 == 2048) {
                z21 = true;
            } else {
                z21 = false;
            }
            boolean zG10 = zI111 | z21 | g0Var3.g(g3Var) | g0Var3.i(v0Var);
            if (i24 == 4) {
                z22 = true;
            } else {
                z22 = false;
            }
            zI2 = zG10 | z22 | g0Var3.i(pVar4);
            objN5 = g0Var3.N();
            if (zI2) {
                pVar5 = pVar4;
                final r3.w wVar11 = wVar3;
                u00.k kVar17 = new u00.k() {
                    public final Object invoke(Object obj2) {
                        r3.b0 b0Var2;
                        z2.a0 a0Var;
                        z2.a0 a0Var2;
                        j1 j1Var15 = j1Var4;
                        l1.i1 i1Var = j1Var15.f12650o;
                        z2.a0 a0Var3 = (z2.a0) obj2;
                        j1Var15.f12645h = a0Var3;
                        e2 e2VarD = j1Var15.d();
                        if (e2VarD != null) {
                            e2VarD.f12609b = a0Var3;
                        }
                        if (z11) {
                            z0 z0VarA = j1Var15.a();
                            z0 z0Var3 = z0.B;
                            e1.v0 v0Var3 = v0Var;
                            r3.w wVar12 = wVar11;
                            if (z0VarA == z0Var3) {
                                if (((Boolean) j1Var15.l.getValue()).booleanValue() && ((c3.f2) g3Var).b()) {
                                    v0Var3.r();
                                } else {
                                    v0Var3.o();
                                }
                                j1Var15.m.setValue(Boolean.valueOf(b5.z(v0Var3, true)));
                                j1Var15.f12649n.setValue(Boolean.valueOf(b5.z(v0Var3, false)));
                                i1Var.setValue(Boolean.valueOf(m3.q0.d(wVar12.f13100b)));
                            } else if (j1Var15.a() == z0.C) {
                                i1Var.setValue(Boolean.valueOf(b5.z(v0Var3, true)));
                            }
                            r3.p pVar12 = pVar5;
                            q.B(j1Var15, wVar12, pVar12);
                            e2 e2VarD2 = j1Var15.d();
                            if (e2VarD2 != null && (b0Var2 = j1Var15.f12642e) != null && j1Var15.b() && (a0Var = e2VarD2.f12609b) != null && a0Var.A() && (a0Var2 = e2VarD2.f12610c) != null) {
                                m3.n0 n0Var = e2VarD2.f12608a;
                                a20.d dVar = new a20.d(a0Var, 26);
                                h2.c cVarY = y3.Y(a0Var);
                                h2.c cVarF = a0Var.F(a0Var2, false);
                                if (kotlin.jvm.internal.m.a((r3.b0) b0Var2.f13047a.f13103b.get(), b0Var2)) {
                                    b0Var2.f13048b.g(wVar12, pVar12, n0Var, dVar, cVarY, cVarF);
                                }
                            }
                        }
                        return g00.b0.a;
                    }
                };
                g0Var3.n0(kVar17);
                objN5 = kVar17;
            } else {
                pVar5 = pVar4;
                final r3.w wVar12 = wVar3;
                u00.k kVar18 = new u00.k() {
                    public final Object invoke(Object obj2) {
                        r3.b0 b0Var2;
                        z2.a0 a0Var;
                        z2.a0 a0Var2;
                        j1 j1Var15 = j1Var4;
                        l1.i1 i1Var = j1Var15.f12650o;
                        z2.a0 a0Var3 = (z2.a0) obj2;
                        j1Var15.f12645h = a0Var3;
                        e2 e2VarD = j1Var15.d();
                        if (e2VarD != null) {
                            e2VarD.f12609b = a0Var3;
                        }
                        if (z11) {
                            z0 z0VarA = j1Var15.a();
                            z0 z0Var3 = z0.B;
                            e1.v0 v0Var3 = v0Var;
                            r3.w wVar13 = wVar12;
                            if (z0VarA == z0Var3) {
                                if (((Boolean) j1Var15.l.getValue()).booleanValue() && ((c3.f2) g3Var).b()) {
                                    v0Var3.r();
                                } else {
                                    v0Var3.o();
                                }
                                j1Var15.m.setValue(Boolean.valueOf(b5.z(v0Var3, true)));
                                j1Var15.f12649n.setValue(Boolean.valueOf(b5.z(v0Var3, false)));
                                i1Var.setValue(Boolean.valueOf(m3.q0.d(wVar13.f13100b)));
                            } else if (j1Var15.a() == z0.C) {
                                i1Var.setValue(Boolean.valueOf(b5.z(v0Var3, true)));
                            }
                            r3.p pVar12 = pVar5;
                            q.B(j1Var15, wVar13, pVar12);
                            e2 e2VarD2 = j1Var15.d();
                            if (e2VarD2 != null && (b0Var2 = j1Var15.f12642e) != null && j1Var15.b() && (a0Var = e2VarD2.f12609b) != null && a0Var.A() && (a0Var2 = e2VarD2.f12610c) != null) {
                                m3.n0 n0Var = e2VarD2.f12608a;
                                a20.d dVar = new a20.d(a0Var, 26);
                                h2.c cVarY = y3.Y(a0Var);
                                h2.c cVarF = a0Var.F(a0Var2, false);
                                if (kotlin.jvm.internal.m.a((r3.b0) b0Var2.f13047a.f13103b.get(), b0Var2)) {
                                    b0Var2.f13048b.g(wVar13, pVar12, n0Var, dVar, cVarY, cVarF);
                                }
                            }
                        }
                        return g00.b0.a;
                    }
                };
                g0Var3.n0(kVar18);
                objN5 = kVar18;
            }
            final b2.r rVarN5 = z2.d0.n(oVar2, (u00.k) objN5);
            j1 j1Var15 = j1Var4;
            xVar3 = xVar2;
            a1.t tVar10 = new a1.t(c0Var, wVar, j1Var15, z11, e0Var instanceof r3.q, pVar5, v0Var, jVar, tVar9);
            j1Var5 = j1Var15;
            if (!z11) {
                z23 = false;
            } else {
                z23 = false;
            }
            if (z23) {
                bz.o oVar8 = new bz.o(qVar, j1Var5, wVar, pVar5, 11);
                j1Var5 = j1Var5;
                rVarA = b2.a.a(oVar2, oVar8);
            } else {
                rVarA = oVar2;
            }
            zI3 = g0Var3.i(v0Var);
            objN6 = g0Var3.N();
            if (zI3) {
                objN6 = new e1.o0(v0Var, 1);
                g0Var3.n0(objN6);
            } else {
                objN6 = new e1.o0(v0Var, 1);
                g0Var3.n0(objN6);
            }
            l1.q.e(v0Var, (u00.k) objN6, g0Var3);
            boolean zI112 = g0Var3.i(j1Var5) | g0Var3.i(xVar3);
            if (i24 == 4) {
                z24 = true;
            } else {
                z24 = false;
            }
            z25 = zI112 | z24 | ((i17 <= 32 && g0Var3.g(jVar)) || (i22 & 48) == 32);
            objN7 = g0Var3.N();
            if (z25) {
                az.k kVar19 = new az.k(j1Var5, xVar3, wVar, jVar, 12);
                jVar4 = jVar;
                g0Var3.n0(kVar19);
                objN7 = kVar19;
            } else {
                az.k kVar110 = new az.k(j1Var5, xVar3, wVar, jVar, 12);
                jVar4 = jVar;
                g0Var3.n0(kVar110);
                objN7 = kVar110;
            }
            l1.q.e(jVar4, (u00.k) objN7, g0Var3);
            final u00.k r0Var7 = j1Var5.f12657v;
            if (i10 == 1) {
                z26 = true;
            } else {
                z26 = false;
            }
            final int i214 = jVar4.f13077e;
            b2.r rVarA15 = b2.a.a(oVar2, new u00.o() {
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    l1.g0 g0Var5 = (l1.g0) ((l1.j) obj3);
                    g0Var5.c0(851809892);
                    Object objN115 = g0Var5.N();
                    l1.c cVar11 = l1.i.f9868a;
                    if (objN115 == cVar11) {
                        objN115 = new e1.z0();
                        g0Var5.n0(objN115);
                    }
                    e1.z0 z0Var3 = (e1.z0) objN115;
                    Object objN116 = g0Var5.N();
                    if (objN116 == cVar11) {
                        objN116 = new x0();
                        g0Var5.n0(objN116);
                    }
                    v1 v1Var = new v1(j1Var5, v0Var, wVar, z36, z26, z0Var3, pVar5, i2Var, (x0) objN116, r0Var7, i214);
                    boolean zI113 = g0Var5.i(v1Var);
                    Object objN20 = g0Var5.N();
                    if (zI113 || objN20 == cVar11) {
                        gz.e1 e1Var = new gz.e1(1, v1Var, v1.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 16);
                        g0Var5.n0(e1Var);
                        objN20 = e1Var;
                    }
                    b2.r rVarD = t2.d.d(b2.o.A, (a10.g) objN20);
                    g0Var5.r(false);
                    return rVarD;
                }
            });
            i18 = jVar4.f13076d;
            if (i18 == 7) {
                z27 = false;
            } else {
                z27 = true;
            }
            boolean zBooleanValue5 = ((Boolean) z0Var.getValue()).booleanValue();
            zH = g0Var3.h(z27) | g0Var3.i(hVar3);
            objN8 = g0Var3.N();
            if (zH) {
                objN8 = new ea.d(z27, hVar3, 2);
                g0Var3.n0(objN8);
            } else {
                objN8 = new ea.d(z27, hVar3, 2);
                g0Var3.n0(objN8);
            }
            b2.r rVarA16 = y0.b.a(oVar2, zBooleanValue5, z27, (u00.a) objN8);
            v0Var2 = (i2.q) g0Var3.k(g.f12614a);
            j11 = ((i2.t) g0Var3.k(g.f12615b)).f7169a;
            final r3.p pVar12 = pVar5;
            if (!i2.t.c(j11, i2.b0.c(1308617531))) {
                v0Var2 = new i2.v0(j11);
            }
            zI4 = g0Var3.i(j1Var5) | g0Var3.g(v0Var2);
            objN9 = g0Var3.N();
            i19 = 5;
            if (zI4) {
                objN9 = new mu.q(j1Var5, v0Var2, 5);
                g0Var3.n0(objN9);
            } else {
                objN9 = new mu.q(j1Var5, v0Var2, 5);
                g0Var3.n0(objN9);
            }
            b2.r rVarE10 = t2.d.e(a1.x0.A(rVar.V(f2.h.g(oVar2, (u00.k) objN9)), hVar3, j1Var5, v0Var).V(rVarA16).V(rVarI4), new w0(lVar, j1Var5));
            int i215 = 0;
            final b2 b2Var6 = b2Var;
            b2.r rVarA17 = w0.h.a(z2.d0.n(t2.d.e(rVarE10, new w0(j1Var5, v0Var, i215)).V(rVarA15).V(new b2.l(new cz.m(3, b2Var6, iVar, z11))).V(rVarG5).V(tVar10), new r0(j1Var5, i215)), new al.i(v0Var, zVar3, 9));
            if (!z11) {
                z28 = false;
            } else {
                z28 = false;
            }
            if (z28) {
                j3.z zVar17 = z.a1.f16893a;
                rVarA2 = b2.a.a(oVar2, new a1.w(v0Var, i19));
            } else {
                rVarA2 = oVar2;
            }
            final b2.r rVar10 = rVarA2;
            final y3.c cVar11 = cVar3;
            final b2.r rVar11 = rVarA;
            final j1 j1Var16 = j1Var5;
            g0Var = g0Var3;
            j(rVarA17, v0Var, v1.d.d(-814563849, new u00.n() {
                public final Object invoke(Object obj2, Object obj3) {
                    l1.j jVar5 = (l1.j) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    l1.g0 g0Var5 = (l1.g0) jVar5;
                    if (g0Var5.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final j1 j1Var17 = j1Var16;
                        final m3.r0 r0Var8 = r0Var;
                        final int i216 = i11;
                        final int i217 = i10;
                        final b2 b2Var7 = b2Var6;
                        final r3.w wVar13 = wVar;
                        final r3.e0 e0Var3 = e0Var;
                        final b2.r rVar12 = rVar11;
                        final b2.r rVar13 = rVarE9;
                        final b2.r rVar14 = rVarN5;
                        final b2.r rVar15 = rVar10;
                        final n0.c cVar12 = cVar4;
                        final e1.v0 v0Var3 = v0Var;
                        final boolean z38 = z28;
                        final u00.k kVar111 = kVar2;
                        final r3.p pVar13 = pVar12;
                        final y3.c cVar13 = cVar11;
                        cVar.invoke(v1.d.d(-44346382, new u00.n() {
                            public final Object invoke(Object obj4, Object obj5) throws NoWhenBranchMatchedException {
                                b2.r k2Var;
                                l1.j jVar6 = (l1.j) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                l1.g0 g0Var6 = (l1.g0) jVar6;
                                if (g0Var6.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    j1 j1Var18 = j1Var17;
                                    b2.r rVarG6 = h0.z1.g(b2.o.A, ((y3.f) j1Var18.f12644g.getValue()).A, 0.0f, 2);
                                    int i30 = i216;
                                    int i31 = i217;
                                    q.F(i30, i31);
                                    m3.r0 r0Var9 = r0Var8;
                                    if (i30 != 1 || i31 != Integer.MAX_VALUE) {
                                        rVarG6 = rVarG6.V(new a1(r0Var9, i30, i31));
                                    }
                                    boolean zI113 = g0Var6.i(j1Var18);
                                    Object objN115 = g0Var6.N();
                                    if (zI113 || objN115 == l1.i.f9868a) {
                                        objN115 = new g1.l0(j1Var18, 29);
                                        g0Var6.n0(objN115);
                                    }
                                    u00.a aVar = (u00.a) objN115;
                                    b2 b2Var8 = b2Var7;
                                    d0.q1 q1Var3 = (d0.q1) b2Var8.f12574f.getValue();
                                    r3.w wVar14 = wVar13;
                                    long j15 = wVar14.f13100b;
                                    int i32 = m3.q0.f10519c;
                                    int iG = (int) (j15 >> 32);
                                    long j16 = b2Var8.f12573e;
                                    if (iG == ((int) (j16 >> 32)) && (iG = (int) (j15 & 4294967295L)) == ((int) (j16 & 4294967295L))) {
                                        iG = m3.q0.g(j15);
                                    }
                                    b2Var8.f12573e = wVar14.f13100b;
                                    r3.c0 c0VarA2 = j2.a(e0Var3, wVar14.f13099a);
                                    int iOrdinal = q1Var3.ordinal();
                                    if (iOrdinal == 0) {
                                        k2Var = new k2(b2Var8, iG, c0VarA2, aVar);
                                    } else {
                                        if (iOrdinal != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        k2Var = new d1(b2Var8, iG, c0VarA2, aVar);
                                    }
                                    z3.m(n0.d.a(f2.h.d(rVarG6).V(k2Var).V(rVar12).V(rVar13).V(new c2(r0Var9)).V(rVar14).V(rVar15), cVar12), v1.d.d(1412697320, new eu.m(v0Var3, j1Var18, z38, kVar111, wVar14, pVar13, cVar13, i31), jVar6), jVar6, 48);
                                } else {
                                    g0Var6.V();
                                }
                                return g00.b0.a;
                            }
                        }, jVar5), jVar5, 6);
                    } else {
                        g0Var5.V();
                    }
                    return g00.b0.a;
                }
            }, g0Var), g0Var, 384);
        } else {
            g0Var = g0Var4;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iK = l1.q.K(i12 | 1);
                    int iK2 = l1.q.K(i13);
                    q.i(wVar, kVar, rVar, r0Var, e0Var, kVar2, iVar, qVar, z10, i10, i11, jVar, h1Var, z11, cVar, (l1.j) obj2, iK, iK2);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void j(b2.r rVar, e1.v0 v0Var, v1.c cVar, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(2036174316);
        int i11 = (g0Var.g(rVar) ? 4 : 2) | i10 | (g0Var.i(v0Var) ? 32 : 16);
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            z2.w0 w0VarD = h0.o.d(b2.b.A, true);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVar, g0Var);
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
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            h(v0Var, cVar, g0Var, (i11 >> 3) & 126);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new b1.n(i10, 29, rVar, v0Var, cVar);
        }
    }

    public static final void k(v1.c cVar, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1141174275);
        if (g0Var.S(i10 & 1, (i10 & 3) != 2)) {
            q2 q2Var = c3.o1.f2742r;
            boolean zG = g0Var.g((u2) g0Var.k(q2Var));
            Object objN = g0Var.N();
            if (zG || objN == l1.i.f9868a) {
                objN = new n();
                g0Var.n0(objN);
            }
            l1.q.a(q2Var.a((n) objN), cVar, g0Var, 56);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new al.j(cVar, i10, 4);
        }
    }

    public static final void l(final b2.r rVar, m3.h hVar, final u00.k kVar, final boolean z10, final Map map, final m3.r0 r0Var, final int i10, final boolean z11, final int i11, final int i12, final q3.h hVar2, final u00.k kVar2, l1.j jVar, final int i13, final int i14) {
        l1.g0 g0Var;
        g2 g2Var;
        u00.a aVar;
        u00.a aVar2;
        g00.k kVar3;
        u00.k kVar4;
        u00.k kVar5;
        Object kVar6;
        boolean z12;
        boolean z13;
        Object obj;
        ArrayList arrayList;
        final m3.h hVar3 = hVar;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(-2118572703);
        int i15 = (i13 & 6) == 0 ? (g0Var2.g(rVar) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i15 |= g0Var2.g(hVar3) ? 32 : 16;
        }
        int i16 = i13 & 384;
        int i17 = Cast.MAX_NAMESPACE_LENGTH;
        if (i16 == 0) {
            i15 |= g0Var2.i(kVar) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= g0Var2.h(z10) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= g0Var2.i(map) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i15 |= g0Var2.g(r0Var) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if ((1572864 & i13) == 0) {
            i15 |= g0Var2.e(i10) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i15 |= g0Var2.h(z11) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i15 |= g0Var2.e(i11) ? 67108864 : 33554432;
        }
        if ((i13 & 805306368) == 0) {
            i15 |= g0Var2.e(i12) ? 536870912 : 268435456;
        }
        int i18 = (i14 & 6) == 0 ? i14 | (g0Var2.i(hVar2) ? 4 : 2) : i14;
        if ((i14 & 48) == 0) {
            i18 |= g0Var2.i(null) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            if (g0Var2.i(null)) {
                i17 = 256;
            }
            i18 |= i17;
        }
        if ((i14 & 3072) == 0) {
            i18 |= g0Var2.i(kVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i18 |= (32768 & i14) == 0 ? g0Var2.g(null) : g0Var2.i(null) ? 16384 : 8192;
        }
        if (g0Var2.S(i15 & 1, ((i15 & 306783379) == 306783378 && (i18 & 9363) == 9362) ? false : true)) {
            boolean zR = f50.k.r(hVar3);
            Object obj2 = l1.i.f9868a;
            if (zR) {
                g0Var2.c0(145641571);
                boolean z14 = (i15 & 112) == 32;
                Object objN = g0Var2.N();
                Object obj3 = objN;
                if (z14 || objN == obj2) {
                    Object g2Var2 = new g2(hVar3);
                    g0Var2.n0(g2Var2);
                    obj3 = g2Var2;
                }
                g0Var2.r(false);
                g2Var = (g2) obj3;
            } else {
                g0Var2.c0(145707228);
                g0Var2.r(false);
                g2Var = null;
            }
            if (f50.k.r(hVar3)) {
                g0Var2.c0(145905443);
                boolean zG = ((i15 & 112) == 32) | g0Var2.g(g2Var);
                Object objN2 = g0Var2.N();
                Object obj4 = objN2;
                if (zG || objN2 == obj2) {
                    Object cVar = new l6.c(g2Var, hVar3, 13);
                    g0Var2.n0(cVar);
                    obj4 = cVar;
                }
                aVar = (u00.a) obj4;
                g0Var2.r(false);
            } else {
                g0Var2.c0(146002721);
                boolean z15 = (i15 & 112) == 32;
                Object objN3 = g0Var2.N();
                Object obj5 = objN3;
                if (z15 || objN3 == obj2) {
                    Object l0Var = new g1.l0(hVar3, 27);
                    g0Var2.n0(l0Var);
                    obj5 = l0Var;
                }
                aVar = (u00.a) obj5;
                g0Var2.r(false);
            }
            if (z10) {
                if (map != null) {
                    g00.k kVar7 = e.f12583a;
                    if (map.isEmpty()) {
                        aVar2 = aVar;
                        kVar3 = e.f12583a;
                    } else {
                        int length = hVar3.B.length();
                        List list = hVar3.A;
                        if (list != null) {
                            arrayList = new ArrayList(list.size());
                            int size = list.size();
                            int i19 = 0;
                            while (i19 < size) {
                                List list2 = list;
                                m3.f fVar = (m3.f) list.get(i19);
                                int i20 = size;
                                Object obj6 = fVar.f10423a;
                                int i21 = i19;
                                int i22 = fVar.f10425c;
                                int i23 = fVar.f10424b;
                                u00.a aVar3 = aVar;
                                String str = fVar.f10426d;
                                if ((obj6 instanceof m3.k0) && "androidx.compose.foundation.text.inlineContent".equals(str) && m3.i.b(0, length, i23, i22)) {
                                    Object obj7 = fVar.f10423a;
                                    kotlin.jvm.internal.m.c(obj7, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                                    arrayList.add(new m3.f(i23, i22, ((m3.k0) obj7).f10476a, str));
                                }
                                i19 = i21 + 1;
                                size = i20;
                                list = list2;
                                aVar = aVar3;
                                length = length;
                            }
                            aVar2 = aVar;
                        } else {
                            aVar2 = aVar;
                            arrayList = h00.x.A;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        int size2 = arrayList.size();
                        for (int i24 = 0; i24 < size2; i24++) {
                            if (map.get(((m3.f) arrayList.get(i24)).f10423a) != null) {
                                throw new ClassCastException();
                            }
                        }
                        kVar3 = new g00.k(arrayList2, arrayList3);
                    }
                } else {
                    aVar2 = aVar;
                    kVar3 = e.f12583a;
                }
                kVar4 = null;
            } else {
                aVar2 = aVar;
                kVar4 = null;
                kVar3 = new g00.k((Object) null, (Object) null);
            }
            List list3 = (List) kVar3.A;
            List list4 = (List) kVar3.B;
            if (z10) {
                g0Var2.c0(146318828);
                Object objN4 = g0Var2.N();
                Object obj8 = objN4;
                if (objN4 == obj2) {
                    Object objZ = l1.q.z(kVar4);
                    g0Var2.n0(objZ);
                    obj8 = objZ;
                }
                kVar5 = (l1.z0) obj8;
                g0Var2.r(false);
            } else {
                g0Var2.c0(146406588);
                g0Var2.r(false);
                kVar5 = kVar4;
            }
            if (z10) {
                g0Var2.c0(146499837);
                boolean zG2 = g0Var2.g(kVar5);
                Object objN5 = g0Var2.N();
                Object obj9 = objN5;
                if (zG2 || objN5 == obj2) {
                    Object o2Var = new o2(kVar5, 21);
                    g0Var2.n0(o2Var);
                    obj9 = o2Var;
                }
                kVar4 = (u00.k) obj9;
                g0Var2.r(false);
            } else {
                g0Var2.c0(146571260);
                g0Var2.r(false);
            }
            u00.k kVar8 = kVar4;
            int i25 = (i15 >> 3) & 14;
            j0.a(hVar3, r0Var, hVar2, list3, g0Var2);
            m3.h hVar4 = (m3.h) aVar2.invoke();
            boolean zI = ((i15 & 896) == 256) | g0Var2.i(g2Var);
            Object objN6 = g0Var2.N();
            Object obj10 = objN6;
            if (zI || objN6 == obj2) {
                Object g0Var3 = new g0(g2Var, kVar, 0);
                g0Var2.n0(g0Var3);
                obj10 = g0Var3;
            }
            l1.g0 g0Var4 = g0Var2;
            u00.k kVar9 = kVar5;
            b2.r rVarE = E(rVar, hVar4, r0Var, (u00.k) obj10, i10, z11, i11, i12, hVar2, list3, kVar8, kVar2);
            if (z10) {
                g0Var4.c0(147927697);
                boolean zI2 = g0Var4.i(g2Var);
                Object objN7 = g0Var4.N();
                Object obj11 = objN7;
                if (zI2 || objN7 == obj2) {
                    Object h0Var = new h0(g2Var, 1);
                    g0Var4.n0(h0Var);
                    obj11 = h0Var;
                }
                u00.a aVar4 = (u00.a) obj11;
                boolean zG3 = g0Var4.g(kVar9);
                Object objN8 = g0Var4.N();
                Object obj12 = objN8;
                if (zG3 || objN8 == obj2) {
                    Object kVar10 = new ct.k(kVar9, 16);
                    g0Var4.n0(kVar10);
                    obj12 = kVar10;
                }
                kVar6 = new c4.k(aVar4, (u00.a) obj12, 1);
                g0Var4.r(false);
            } else {
                g0Var4.c0(147750935);
                boolean zI3 = g0Var4.i(g2Var);
                Object objN9 = g0Var4.N();
                if (zI3 || objN9 == obj2) {
                    z13 = false;
                    Object h0Var2 = new h0(g2Var, false ? 1 : 0);
                    g0Var4.n0(h0Var2);
                    obj = h0Var2;
                } else {
                    z13 = false;
                    obj = objN9;
                }
                kVar6 = new l1((u00.a) obj);
                g0Var4.r(z13);
            }
            int iHashCode = Long.hashCode(g0Var4.T);
            l1.m1 m1VarM = g0Var4.m();
            b2.r rVarC = b2.a.c(rVarE, g0Var4);
            b3.i.f2042c.getClass();
            u00.a aVar5 = b3.h.f2035b;
            g0Var4.g0();
            if (g0Var4.S) {
                g0Var4.l(aVar5);
            } else {
                g0Var4.q0();
            }
            l1.q.I(kVar6, g0Var4, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var4, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var4, b3.h.f2040g);
            l1.q.E(g0Var4, b3.h.f2041h);
            l1.q.I(rVarC, g0Var4, b3.h.f2037d);
            if (g2Var == null) {
                g0Var4.c0(-433557001);
                z12 = false;
            } else {
                z12 = false;
                g0Var4.c0(-291080374);
                g2Var.a(g0Var4, 0);
            }
            g0Var4.r(z12);
            if (list4 == null) {
                g0Var4.c0(-433506223);
                g0Var4.r(z12);
                hVar3 = hVar;
            } else {
                g0Var4.c0(-433506222);
                hVar3 = hVar;
                e.a(hVar3, list4, g0Var4, i25);
                g0Var4.r(z12);
            }
            g0Var4.r(true);
            g0Var = g0Var4;
        } else {
            l1.g0 g0Var5 = g0Var2;
            g0Var5.V();
            g0Var = g0Var5;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj13, Object obj14) {
                    ((Integer) obj14).getClass();
                    int iK = l1.q.K(i13 | 1);
                    int iK2 = l1.q.K(i14);
                    q.l(rVar, hVar3, kVar, z10, map, r0Var, i10, z11, i11, i12, hVar2, kVar2, (l1.j) obj13, iK, iK2);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void m(e1.v0 v0Var, boolean z10, l1.j jVar, int i10) {
        e2 e2VarD;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(626339208);
        int i11 = (g0Var.i(v0Var) ? 4 : 2) | i10 | (g0Var.h(z10) ? 32 : 16);
        if (!g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            g0Var.V();
        } else if (z10) {
            g0Var.c0(1530097388);
            j1 j1Var = v0Var.f5018d;
            m3.n0 n0Var = null;
            if (j1Var != null && (e2VarD = j1Var.d()) != null) {
                m3.n0 n0Var2 = e2VarD.f12608a;
                j1 j1Var2 = v0Var.f5018d;
                if (!(j1Var2 != null ? j1Var2.f12651p : true)) {
                    n0Var = n0Var2;
                }
            }
            if (n0Var == null) {
                g0Var.c0(1530097387);
                g0Var.r(false);
            } else {
                g0Var.c0(1530097388);
                if (m3.q0.d(v0Var.n().f13100b)) {
                    g0Var.c0(2110860558);
                    g0Var.r(false);
                } else {
                    g0Var.c0(2109807302);
                    int iZ = v0Var.f5016b.z((int) (v0Var.n().f13100b >> 32));
                    int iZ2 = v0Var.f5016b.z((int) (v0Var.n().f13100b & 4294967295L));
                    x3.j jVarA = n0Var.a(iZ);
                    x3.j jVarA2 = n0Var.a(Math.max(iZ2 - 1, 0));
                    j1 j1Var3 = v0Var.f5018d;
                    if (j1Var3 == null || !((Boolean) j1Var3.m.getValue()).booleanValue()) {
                        g0Var.c0(2110490542);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(2110225306);
                        g4.n(true, jVarA, v0Var, g0Var, ((i11 << 6) & 896) | 6);
                        g0Var.r(false);
                    }
                    j1 j1Var4 = v0Var.f5018d;
                    if (j1Var4 == null || !((Boolean) j1Var4.f12649n.getValue()).booleanValue()) {
                        g0Var.c0(2110838734);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(2110574459);
                        g4.n(false, jVarA2, v0Var, g0Var, ((i11 << 6) & 896) | 6);
                        g0Var.r(false);
                    }
                    g0Var.r(false);
                }
                j1 j1Var5 = v0Var.f5018d;
                if (j1Var5 != null) {
                    l1.i1 i1Var = j1Var5.l;
                    if (!kotlin.jvm.internal.m.a(v0Var.f5033u.f13099a.B, v0Var.n().f13099a.B)) {
                        i1Var.setValue(Boolean.FALSE);
                    }
                    if (j1Var5.b()) {
                        if (((Boolean) i1Var.getValue()).booleanValue()) {
                            v0Var.r();
                        } else {
                            v0Var.o();
                        }
                    }
                }
                g0Var.r(false);
            }
            g0Var.r(false);
        } else {
            g0Var.c0(1989076778);
            g0Var.r(false);
            v0Var.o();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new dl.d(v0Var, z10, i10, 3);
        }
    }

    public static final void n(e1.v0 v0Var, l1.j jVar, int i10) {
        m3.h hVarM;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1436003720);
        int i11 = (g0Var.i(v0Var) ? 4 : 2) | i10;
        if (g0Var.S(i11 & 1, (i11 & 3) != 2)) {
            j1 j1Var = v0Var.f5018d;
            if (j1Var == null || !((Boolean) j1Var.f12650o.getValue()).booleanValue() || (hVarM = v0Var.m()) == null || hVarM.B.length() <= 0) {
                g0Var.c0(-2111042550);
                g0Var.r(false);
            } else {
                g0Var.c0(-2112351432);
                boolean zG = g0Var.g(v0Var);
                Object objN = g0Var.N();
                l1.c cVar = l1.i.f9868a;
                if (zG || objN == cVar) {
                    objN = new e1.r0(v0Var);
                    g0Var.n0(objN);
                }
                r1 r1Var = (r1) objN;
                y3.c cVar2 = (y3.c) g0Var.k(c3.o1.f2734h);
                r3.p pVar = v0Var.f5016b;
                long j9 = v0Var.n().f13100b;
                int i12 = m3.q0.f10519c;
                int iZ = pVar.z((int) (j9 >> 32));
                j1 j1Var2 = v0Var.f5018d;
                e2 e2VarD = j1Var2 != null ? j1Var2.d() : null;
                kotlin.jvm.internal.m.b(e2VarD);
                m3.n0 n0Var = e2VarD.f12608a;
                h2.c cVarC = n0Var.c(ab.a0.y(iZ, 0, n0Var.f10496a.f10483a.B.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((cVar2.A0(s1.f12700a) / 2) + cVarC.f6546a)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(cVarC.f6549d)));
                boolean zF = g0Var.f(jFloatToRawIntBits);
                Object objN2 = g0Var.N();
                if (zF || objN2 == cVar) {
                    objN2 = new u0(jFloatToRawIntBits);
                    g0Var.n0(objN2);
                }
                e1.n nVar = (e1.n) objN2;
                boolean zI = g0Var.i(r1Var) | g0Var.i(v0Var);
                Object objN3 = g0Var.N();
                if (zI || objN3 == cVar) {
                    objN3 = new po.j(r1Var, v0Var, 1);
                    g0Var.n0(objN3);
                }
                b2.r rVarB = v2.f0.b(b2.o.A, r1Var, (PointerInputEventHandler) objN3);
                boolean zF2 = g0Var.f(jFloatToRawIntBits);
                Object objN4 = g0Var.N();
                if (zF2 || objN4 == cVar) {
                    objN4 = new gj.h(jFloatToRawIntBits, 5);
                    g0Var.n0(objN4);
                }
                c.a(nVar, j3.q.c(rVarB, false, (u00.k) objN4), 0L, g0Var, 0, 4);
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new m3.a(v0Var, i10, 9);
        }
    }

    public static final h2.c o(z2.k1 k1Var, int i10, r3.c0 c0Var, m3.n0 n0Var, boolean z10, int i11) {
        h2.c cVarC = n0Var != null ? n0Var.c(c0Var.f13066b.z(i10)) : h2.c.f6545e;
        float f3 = cVarC.f6546a;
        int iR0 = k1Var.R0(s1.f12700a);
        return new h2.c(z10 ? (i11 - f3) - iR0 : f3, cVarC.f6547b, z10 ? i11 - f3 : iR0 + f3, cVarC.f6549d);
    }

    public static final boolean p(int i10, KeyEvent keyEvent) {
        return ((int) (t2.d.b(keyEvent) >> 32)) == i10;
    }

    public static final ArrayList q(List list, u00.a aVar) {
        bg.b bVar;
        if (!((Boolean) aVar.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            z2.v0 v0Var = (z2.v0) list.get(i11);
            Object objU = v0Var.U();
            kotlin.jvm.internal.m.c(objU, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            ak.a aVar2 = ((h2) objU).A;
            g2 g2Var = (g2) aVar2.B;
            m3.f fVar = (m3.f) aVar2.C;
            m3.n0 n0Var = (m3.n0) g2Var.f12616a.getValue();
            if (n0Var == null) {
                bVar = new bg.b(i10, i10, new h.e(22));
            } else {
                m3.f fVarC = g2.c(fVar, n0Var);
                if (fVarC == null) {
                    bVar = new bg.b(i10, i10, new h.e(23));
                } else {
                    y3.k kVarQ = k00.f.Q(n0Var.j(fVarC.f10424b, fVarC.f10425c).d());
                    bVar = new bg.b(kVarQ.d(), kVarQ.b(), new f2(kVarQ, 0));
                }
            }
            int i12 = bVar.A;
            int i13 = bVar.B;
            arrayList.add(new g00.k(v0Var.O(g4.G(i12, i12, i13, i13)), (u00.a) bVar.C));
        }
        return arrayList;
    }

    public static final int r(float f3) {
        return Math.round((float) Math.ceil(f3));
    }

    public static final void s(j1 j1Var) {
        r3.b0 b0Var = j1Var.f12642e;
        if (b0Var != null) {
            j1Var.f12657v.invoke(r3.w.b((r3.w) j1Var.f12641d.B, null, 0L, 3));
            r3.x xVar = b0Var.f13047a;
            if (xVar.f13103b.compareAndSet(b0Var, null)) {
                xVar.f13102a.d();
            }
        }
        j1Var.f12642e = null;
    }

    public static final int t(int i10, String str) {
        ?? r7;
        ?? r10;
        int spanEnd;
        v5.g gVarX = x();
        Integer num = null;
        if (gVarX != null) {
            if (!(gVarX.c() == 1)) {
                throw new IllegalStateException("Not initialized yet");
            }
            rd.a.i(str, "charSequence cannot be null");
            ?? r4 = (sd.p1) gVarX.f15467e.f9679a;
            r4.getClass();
            if (i10 < 0 || i10 >= str.length()) {
                r10 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                v5.s[] sVarArr = (v5.s[]) spanned.getSpans(i10, i10 + 1, v5.s.class);
                if (sVarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(sVarArr[0]);
                    r10 = str;
                } else {
                    ?? r11 = str;
                    spanEnd = ((v5.l) r4.C(r11, Math.max(0, i10 - 16), Math.min(str.length(), i10 + 16), Integer.MAX_VALUE, true, new v5.l(i10))).C;
                    r10 = r11;
                }
            } else {
                ?? r12 = str;
                spanEnd = ((v5.l) r4.C(r12, Math.max(0, i10 - 16), Math.min(str.length(), i10 + 16), Integer.MAX_VALUE, true, new v5.l(i10))).C;
                r10 = r12;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r7 = r10;
            if (spanEnd != -1) {
                num = numValueOf;
                r7 = r10;
            }
        } else {
            r7 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r7);
        return characterInstance.following(i10);
    }

    public static final int u(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            if (charSequence.charAt(i10) == '\n') {
                return i10;
            }
            i10++;
        }
        return charSequence.length();
    }

    public static final int v(CharSequence charSequence, int i10) {
        while (i10 > 0) {
            if (charSequence.charAt(i10 - 1) == '\n') {
                return i10;
            }
            i10--;
        }
        return 0;
    }

    public static final int w(int i10, String str) {
        v5.g gVarX = x();
        Integer num = null;
        if (gVarX != null) {
            Integer numValueOf = Integer.valueOf(gVarX.b(str, Math.max(0, i10 - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i10);
    }

    public static final v5.g x() {
        if (!v5.g.d()) {
            return null;
        }
        v5.g gVarA = v5.g.a();
        if (gVarA.c() == 1) {
            return gVarA;
        }
        return null;
    }

    public static final float y(m3.n0 n0Var, int i10) {
        if (i10 < 0) {
            return 0.0f;
        }
        m3.m0 m0Var = n0Var.f10496a;
        m3.q qVar = n0Var.f10497b;
        if (m0Var.f10483a.B.length() == 0) {
            return 0.0f;
        }
        int iMin = Math.min(qVar.d(i10), Math.min(qVar.f10511b - 1, qVar.f10515f - 1));
        if (i10 > qVar.c(iMin, false)) {
            return 0.0f;
        }
        qVar.m(iMin);
        ArrayList arrayList = qVar.f10517h;
        m3.s sVar = (m3.s) arrayList.get(m3.h0.e(iMin, arrayList));
        m3.b bVar = sVar.f10525a;
        int i11 = iMin - sVar.f10528d;
        n3.i iVar = bVar.f10416d;
        return iVar.e(i11) - iVar.g(i11);
    }

    public static final int z(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }
}
