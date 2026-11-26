package w00;

import a40.w;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import b2.o;
import b2.r;
import b3.o0;
import c3.a3;
import c3.c2;
import ca.v;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import f2.h;
import g1.o3;
import g1.z6;
import h0.i;
import h0.i2;
import h0.s;
import h0.u;
import h0.v1;
import h0.z1;
import h00.q;
import i2.b0;
import i2.g;
import i2.j;
import i2.t;
import i2.t0;
import i2.y;
import j6.e;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.r1;
import m3.r0;
import o20.z;
import oo.i0;
import p0.f;
import q0.t1;
import qd.s0;
import qk.b;
import r30.k;
import rk.d;
import sm.l;
import u30.c;
import x.b1;
import x40.p;
import z.n;
import z.y0;
import z2.w0;

public abstract class a {
    public final int a;

    public a() {
        this.a = 19;
        new ConcurrentHashMap();
    }

    public a(int i) {
        this.a = i;
    }

    public static boolean A(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static p B(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i2] = k.j1(str).toString();
        }
        int iY = v.y(0, strArr2.length - 1, 2);
        if (iY >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                m(str2);
                n(str3, str2);
                if (i == iY) {
                    break;
                }
                i += 2;
            }
        }
        return new p(strArr2);
    }

    public static int E(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    public static int F(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    public static long G(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }

    public static void H(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            b5.a.b(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    public static String I(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (A(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (A(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static final g J(List list) {
        g gVarA = j.a();
        if (!list.isEmpty()) {
            b bVarA = ((d) q.L0(list)).a();
            gVarA.f((float) bVarA.a, (float) bVarA.b);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((d) it.next()).b(gVarA);
            }
        }
        return gVarA;
    }

    public static String K(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static final double L(long j) {
        return ((j >>> 11) * ((double) 2048)) + (j & 2047);
    }

    public static final void a(u30.b reasons, c selectedReasonIds, u00.k onReasonClicked, r rVar, l1.j jVar, int i) {
        r rVar2;
        m.e(reasons, "reasons");
        m.e(selectedReasonIds, "selectedReasonIds");
        m.e(onReasonClicked, "onReasonClicked");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1418539534);
        int i2 = i | (g0Var.g(reasons) ? 4 : 2) | (g0Var.g(selectedReasonIds) ? 32 : 16) | (g0Var.i(onReasonClicked) ? 256 : 128) | 3072;
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            r rVar3 = o.A;
            r rVarF = n.f(h.c(z1.d(rVar3, 1.0f), f.a(24)), t.b(0.08f, dl.a.i), b0.b);
            h0.v vVarA = u.a(i.c, b2.b.M, g0Var, 0);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarF, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            g0Var.c0(11117768);
            Iterator<E> it = reasons.iterator();
            while (it.hasNext()) {
                ry.c cVar = (ry.c) it.next();
                String strU = z3.U(g0Var, cVar.b);
                boolean zContains = selectedReasonIds.contains(cVar.a);
                boolean zG = ((i2 & 896) == 256) | g0Var.g(cVar);
                Object objN = g0Var.N();
                if (zG || objN == l1.i.a) {
                    objN = new l6.c(onReasonClicked, cVar, 15);
                    g0Var.n0(objN);
                }
                va.a.c(0, (r) null, strU, g0Var, (u00.a) objN, zContains);
            }
            g0Var.r(false);
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new dz.k(reasons, selectedReasonIds, onReasonClicked, rVar2, i, 15);
        }
    }

    public static final void b(b6.m mVar, int i, int i2, v1.c cVar, l1.j jVar, int i3, int i4) {
        int i5;
        int i6;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-474572032);
        int i7 = (g0Var.g(mVar) ? 4 : 2) | i3;
        int i8 = i4 & 2;
        if (i8 != 0) {
            i5 = i7 | 48;
        } else {
            i5 = i7 | (g0Var.e(i) ? 32 : 16);
        }
        int i9 = i4 & 4;
        if (i9 != 0) {
            i6 = i5 | 384;
        } else {
            i6 = i5 | (g0Var.e(i2) ? 256 : 128);
        }
        if ((i6 & 1171) == 1170 && g0Var.C()) {
            g0Var.V();
        } else {
            if (i8 != 0) {
                i = 0;
            }
            if (i9 != 0) {
                i2 = 0;
            }
            g0Var.d0(1849434622);
            Object objN = g0Var.N();
            if (objN == l1.i.a) {
                objN = j6.f.A;
                g0Var.n0(objN);
            }
            g0Var.r(false);
            u00.a aVar = (u00.a) ((a10.g) objN);
            g0Var.d0(-683746039);
            g0Var.d0(-548224868);
            if (!(g0Var.a instanceof b6.b)) {
                l1.q.w();
                throw null;
            }
            g0Var.a0();
            if (g0Var.S) {
                g0Var.l(aVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(mVar, g0Var, new ir.b(23));
            l1.q.I(new j6.a(i2), g0Var, new ir.b(24));
            l1.q.I(new j6.b(i), g0Var, new ir.b(25));
            cVar.invoke(j6.g.a, g0Var, 54);
            g0Var.r(true);
            g0Var.r(false);
            g0Var.r(false);
        }
        int i11 = i;
        int i12 = i2;
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new e(mVar, i11, i12, cVar, i3, i4);
        }
    }

    public static final void c(final jk.a backdrop, final t0 shape, final r rVar, float f, long j, float f2, float f3, float f4, b2.d dVar, final v1.c cVar, l1.j jVar, final int i, final int i2) {
        int i3;
        b2.d dVar2;
        int i4;
        boolean z;
        final float f5;
        final long j2;
        final float f6;
        final float f7;
        final float f8;
        final b2.d dVar3;
        r1 r1VarT;
        final float f9;
        long jB;
        final float f11;
        final float f12;
        boolean z2;
        Object objN;
        Object obj;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objN2;
        boolean z7;
        Object objN3;
        Object objN4;
        boolean z8;
        Object objN5;
        b3.g gVar;
        int i5;
        m.e(backdrop, "backdrop");
        m.e(shape, "shape");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-957837598);
        if ((i & 6) == 0) {
            i3 = (g0Var.i(backdrop) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= g0Var.g(shape) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= g0Var.g(rVar) ? 256 : 128;
        }
        int i6 = 14380032 | i3;
        int i7 = i2 & 256;
        if (i7 == 0) {
            if ((100663296 & i) == 0) {
                dVar2 = dVar;
                i6 |= g0Var.g(dVar2) ? 67108864 : 33554432;
            }
            if ((805306368 & i) == 0) {
                if (g0Var.i(cVar)) {
                    i5 = 536870912;
                } else {
                    i5 = 268435456;
                }
                i6 |= i5;
            }
            i4 = i6;
            if ((306783379 & i4) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i4 & 1, z)) {
                f9 = 20;
                jB = t.b(0.1f, t.c);
                f11 = 12;
                f12 = 24;
                if (i7 != 0) {
                    dVar2 = b2.b.A;
                }
                if ((i4 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objN = g0Var.N();
                b2.d dVar4 = dVar2;
                obj = l1.i.a;
                if (z2 || objN == obj) {
                    objN = new l(shape, 0);
                    g0Var.n0(objN);
                }
                u00.a aVar = (u00.a) objN;
                if ((i4 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z9 = z3;
                if ((458752 & i4) == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z11 = z9 | z4;
                if ((3670016 & i4) == 1048576) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z11 | z5;
                objN2 = g0Var.N();
                if (z6 || objN2 == obj) {
                    final int i8 = 1;
                    objN2 = new u00.k() {
                        @Override
                        public final Object invoke(Object obj2) {
                            jk.f drawBackdrop = (jk.f) obj2;
                            switch (i8) {
                                case 0:
                                    kotlin.jvm.internal.m.e(drawBackdrop, "$this$drawBackdrop");
                                    float fD = h2.e.d(drawBackdrop.C);
                                    lk.a.a(drawBackdrop);
                                    ca.v.p(drawBackdrop, drawBackdrop.A * f9);
                                    y3.N(drawBackdrop, f11 * fD * 0.5f, f12 * fD, true, true);
                                    break;
                                default:
                                    kotlin.jvm.internal.m.e(drawBackdrop, "$this$drawBackdrop");
                                    lk.a.a(drawBackdrop);
                                    ca.v.p(drawBackdrop, drawBackdrop.A * f9);
                                    float f13 = drawBackdrop.A;
                                    y3.O(drawBackdrop, f11 * f13, f13 * f12, 8);
                                    break;
                            }
                            return g00.b0.a;
                        }
                    };
                    g0Var.n0(objN2);
                }
                u00.k kVar = (u00.k) objN2;
                if ((29360128 & i4) == 8388608) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objN3 = g0Var.N();
                if (z7 || objN3 == obj) {
                    objN3 = new i0(0.3f, 1);
                    g0Var.n0(objN3);
                }
                u00.a aVar2 = (u00.a) objN3;
                objN4 = g0Var.N();
                if (objN4 == obj) {
                    objN4 = new q50.b(19);
                    g0Var.n0(objN4);
                }
                u00.a aVar3 = (u00.a) objN4;
                if ((57344 & i4) == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                objN5 = g0Var.N();
                if (z8 || objN5 == obj) {
                    objN5 = new gj.h(jB, 9);
                    g0Var.n0(objN5);
                }
                dVar3 = dVar4;
                r rVarB = jk.d.b(rVar, backdrop, aVar, kVar, aVar2, aVar3, (u00.a) null, (u00.k) null, (u00.k) objN5, 3040);
                int i9 = ((i4 >> 21) & 112) | ((i4 >> 18) & 7168);
                w0 w0VarD = h0.o.d(dVar3, false);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                r rVarC = b2.a.c(rVarB, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD, g0Var, b3.h.f);
                l1.q.I(m1VarM, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC, g0Var, b3.h.d);
                cVar.invoke(s.a, g0Var, Integer.valueOf(((i9 >> 6) & 112) | 6));
                g0Var.r(true);
                f5 = f9;
                j2 = jB;
                f6 = f11;
                f7 = f12;
                f8 = 0.3f;
            } else {
                g0Var.V();
                f5 = f;
                j2 = j;
                f6 = f2;
                f7 = f3;
                f8 = f4;
                dVar3 = dVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iK = l1.q.K(i | 1);
                        w00.a.c(backdrop, shape, rVar, f5, j2, f6, f7, f8, dVar3, cVar, (l1.j) obj2, iK, i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        i6 = 115043328 | i3;
        dVar2 = dVar;
        if ((805306368 & i) == 0) {
            if (g0Var.i(cVar)) {
                i5 = 536870912;
            } else {
                i5 = 268435456;
            }
            i6 |= i5;
        }
        i4 = i6;
        if ((306783379 & i4) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (g0Var.S(i4 & 1, z)) {
            f9 = 20;
            jB = t.b(0.1f, t.c);
            f11 = 12;
            f12 = 24;
            if (i7 != 0) {
                dVar2 = b2.b.A;
            }
            if ((i4 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            objN = g0Var.N();
            b2.d dVar5 = dVar2;
            obj = l1.i.a;
            if (z2) {
                objN = new l(shape, 0);
                g0Var.n0(objN);
            } else {
                objN = new l(shape, 0);
                g0Var.n0(objN);
            }
            u00.a aVar4 = (u00.a) objN;
            if ((i4 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z12 = z3;
            if ((458752 & i4) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z13 = z12 | z4;
            if ((3670016 & i4) == 1048576) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z13 | z5;
            objN2 = g0Var.N();
            if (z6) {
                final int i11 = 1;
                objN2 = new u00.k() {
                    @Override
                    public final Object invoke(Object obj2) {
                        jk.f drawBackdrop = (jk.f) obj2;
                        switch (i11) {
                            case 0:
                                kotlin.jvm.internal.m.e(drawBackdrop, "$this$drawBackdrop");
                                float fD = h2.e.d(drawBackdrop.C);
                                lk.a.a(drawBackdrop);
                                ca.v.p(drawBackdrop, drawBackdrop.A * f9);
                                y3.N(drawBackdrop, f11 * fD * 0.5f, f12 * fD, true, true);
                                break;
                            default:
                                kotlin.jvm.internal.m.e(drawBackdrop, "$this$drawBackdrop");
                                lk.a.a(drawBackdrop);
                                ca.v.p(drawBackdrop, drawBackdrop.A * f9);
                                float f13 = drawBackdrop.A;
                                y3.O(drawBackdrop, f11 * f13, f13 * f12, 8);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN2);
            } else {
                final int i12 = 1;
                objN2 = new u00.k() {
                    @Override
                    public final Object invoke(Object obj2) {
                        jk.f drawBackdrop = (jk.f) obj2;
                        switch (i12) {
                            case 0:
                                kotlin.jvm.internal.m.e(drawBackdrop, "$this$drawBackdrop");
                                float fD = h2.e.d(drawBackdrop.C);
                                lk.a.a(drawBackdrop);
                                ca.v.p(drawBackdrop, drawBackdrop.A * f9);
                                y3.N(drawBackdrop, f11 * fD * 0.5f, f12 * fD, true, true);
                                break;
                            default:
                                kotlin.jvm.internal.m.e(drawBackdrop, "$this$drawBackdrop");
                                lk.a.a(drawBackdrop);
                                ca.v.p(drawBackdrop, drawBackdrop.A * f9);
                                float f13 = drawBackdrop.A;
                                y3.O(drawBackdrop, f11 * f13, f13 * f12, 8);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN2);
            }
            u00.k kVar2 = (u00.k) objN2;
            if ((29360128 & i4) == 8388608) {
                z7 = true;
            } else {
                z7 = false;
            }
            objN3 = g0Var.N();
            if (z7) {
                objN3 = new i0(0.3f, 1);
                g0Var.n0(objN3);
            } else {
                objN3 = new i0(0.3f, 1);
                g0Var.n0(objN3);
            }
            u00.a aVar5 = (u00.a) objN3;
            objN4 = g0Var.N();
            if (objN4 == obj) {
                objN4 = new q50.b(19);
                g0Var.n0(objN4);
            }
            u00.a aVar6 = (u00.a) objN4;
            if ((57344 & i4) == 16384) {
                z8 = true;
            } else {
                z8 = false;
            }
            objN5 = g0Var.N();
            if (z8) {
                objN5 = new gj.h(jB, 9);
                g0Var.n0(objN5);
            } else {
                objN5 = new gj.h(jB, 9);
                g0Var.n0(objN5);
            }
            dVar3 = dVar5;
            r rVarB2 = jk.d.b(rVar, backdrop, aVar4, kVar2, aVar5, aVar6, (u00.a) null, (u00.k) null, (u00.k) objN5, 3040);
            int i13 = ((i4 >> 21) & 112) | ((i4 >> 18) & 7168);
            w0 w0VarD2 = h0.o.d(dVar3, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarB2, g0Var);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD2, g0Var, b3.h.f);
            l1.q.I(m1VarM2, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC2, g0Var, b3.h.d);
            cVar.invoke(s.a, g0Var, Integer.valueOf(((i13 >> 6) & 112) | 6));
            g0Var.r(true);
            f5 = f9;
            j2 = jB;
            f6 = f11;
            f7 = f12;
            f8 = 0.3f;
        } else {
            g0Var.V();
            f5 = f;
            j2 = j;
            f6 = f2;
            f7 = f3;
            f8 = f4;
            dVar3 = dVar2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iK = l1.q.K(i | 1);
                    w00.a.c(backdrop, shape, rVar, f5, j2, f6, f7, f8, dVar3, cVar, (l1.j) obj2, iK, i2);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void d(t9.d dVar, boolean z, u00.a aVar, u00.a aVar2, l1.j jVar, int i) {
        u00.a aVar3;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1220469155);
        int i2 = i | (g0Var.g(dVar) ? 4 : 2) | (g0Var.h(z) ? 32 : 16) | 384 | (g0Var.i(aVar2) ? 2048 : 1024);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (objN == cVar) {
                objN = new a2.f(24);
                g0Var.n0(objN);
            }
            u00.a aVar4 = (u00.a) objN;
            Object objN2 = g0Var.N();
            if (objN2 == cVar) {
                objN2 = new a2.f(24);
                g0Var.n0(objN2);
            }
            u00.a aVar5 = (u00.a) objN2;
            Object objN3 = g0Var.N();
            if (objN3 == cVar) {
                objN3 = new a2.f(24);
                g0Var.n0(objN3);
            }
            int i3 = (i2 & 14) | 3504;
            int i4 = i2 << 9;
            e(dVar, false, aVar5, (u00.a) objN3, z, aVar4, aVar2, g0Var, i3 | (57344 & i4) | 196608 | (i4 & 3670016));
            aVar3 = aVar4;
        } else {
            g0Var.V();
            aVar3 = aVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c00.l((Object) dVar, z, aVar3, (Object) aVar2, i, 6);
        }
    }

    public static final void e(t9.d dVar, boolean z, u00.a aVar, u00.a aVar2, boolean z2, u00.a aVar3, u00.a aVar4, l1.j jVar, int i) {
        int i2;
        u00.a aVar5;
        r1 r1VarT;
        t9.c cVar;
        t9.d dVar2 = dVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(898330592);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(dVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 24576) == 0) {
            i2 |= g0Var.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= g0Var.i(aVar3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            aVar5 = aVar4;
            i2 |= g0Var.i(aVar5) ? 1048576 : 524288;
        } else {
            aVar5 = aVar4;
        }
        if (g0Var.S(i2 & 1, (599187 & i2) != 599186)) {
            if (((Boolean) g0Var.k(c2.a)).booleanValue()) {
                r1VarT = g0Var.t();
                if (r1VarT == null) {
                    return;
                } else {
                    cVar = new t9.c(dVar2, z, aVar, aVar2, z2, aVar3, aVar5, i, 0);
                }
            } else {
                s9.d dVarA = t9.b.a(g0Var);
                if (dVarA == null) {
                    throw new IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                }
                s9.c navigationEventDispatcher = dVarA.getNavigationEventDispatcher();
                int i3 = i2 & 14;
                boolean z3 = i3 == 4;
                Object objN = g0Var.N();
                l1.c cVar2 = l1.i.a;
                if (z3 || objN == cVar2) {
                    objN = new t9.a((s9.g) dVar2.c.getValue(), new q0.a(dVar2, 11));
                    g0Var.n0(objN);
                }
                t9.a aVar6 = (t9.a) objN;
                boolean zI = ((i2 & 3670016) == 1048576) | g0Var.i(aVar6) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | (i3 == 4);
                Object objN2 = g0Var.N();
                if (zI || objN2 == cVar2) {
                    q0.s sVar = new q0.s(aVar6, z, aVar, aVar2, z2, aVar3, aVar4, dVar2);
                    aVar6 = aVar6;
                    dVar2 = dVar2;
                    g0Var.n0(sVar);
                    objN2 = sVar;
                }
                l1.q.k((u00.a) objN2, g0Var);
                boolean zI2 = g0Var.i(aVar6) | (i3 == 4) | g0Var.i(navigationEventDispatcher);
                Object objN3 = g0Var.N();
                if (zI2 || objN3 == cVar2) {
                    objN3 = new t1(dVar2, aVar6, navigationEventDispatcher, 5);
                    g0Var.n0(objN3);
                }
                l1.q.e(dVar2, (u00.k) objN3, g0Var);
            }
            r1VarT.d = cVar;
        }
        g0Var.V();
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            cVar = new t9.c(dVar2, z, aVar, aVar2, z2, aVar3, aVar4, i, 1);
            r1VarT.d = cVar;
        }
    }

    public static final void f(u00.a onDelete, r rVar, l1.j jVar, int i) {
        m.e(onDelete, "onDelete");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-556722149);
        int i2 = (g0Var.i(onDelete) ? 4 : 2) | i | (g0Var.g(rVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            long jZ = kh.o.z(((gm.a) g0Var.k(dl.e.a)) == gm.a.B ? 17 : 15);
            r rVarC = h0.c.C(w50.c.n(n.f(h.c(z1.d(rVar, 1.0f), f.a(24)), t.b(0.08f, dl.a.i), b0.b), true, onDelete), 16);
            v1 v1VarA = h0.t1.a(i.a, b2.b.K, g0Var, 48);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC2 = b2.a.c(rVarC, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC2, g0Var, b3.h.d);
            o oVar = o.A;
            r rVarM = z1.m(oVar, 20);
            m2.b bVarR = y3.R(2131231403, g0Var, 0);
            long j = dl.a.R;
            o3.a(bVarR, (String) null, rVarM, j, g0Var, 440, 0);
            z6.b(z3.U(g0Var, 2131886427), h0.c.G(oVar, 8, 0.0f, 0.0f, 0.0f, 14), j, jZ, q3.u.B, (q3.i) null, 0L, (x3.l) null, (x3.k) null, jZ, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1572912, 0, 260008);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ev.m(onDelete, rVar, i, 1);
        }
    }

    public static final String g(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        m.d(parameterTypes, "getParameterTypes(...)");
        sb.append(h00.n.M0(parameterTypes, "", "(", ")", d10.b.V, 24));
        Class<?> returnType = method.getReturnType();
        m.d(returnType, "getReturnType(...)");
        sb.append(p10.d.b(returnType));
        return sb.toString();
    }

    public static final wk.d h(i2 insets, boolean z, b1 b1Var, l1.j jVar) {
        m.e(insets, "insets");
        p2 p2VarB = x.d.b(z ? 1.0f : 0.0f, b1Var, "windowInsetsPadding", jVar, 3072, 20);
        h0.t0 t0VarL = h0.c.l(insets, jVar);
        g0 g0Var = (g0) jVar;
        boolean zG = g0Var.g(t0VarL) | g0Var.g(p2VarB);
        Object objN = g0Var.N();
        if (zG || objN == l1.i.a) {
            objN = new wk.d(t0VarL, p2VarB);
            g0Var.n0(objN);
        }
        return (wk.d) objN;
    }

    public static final Object j(c40.t tVar, u00.a aVar, m00.c cVar) {
        c40.r rVar;
        if (cVar instanceof c40.r) {
            rVar = (c40.r) cVar;
            int i = rVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                rVar.C = i - Integer.MIN_VALUE;
            } else {
                rVar = new c40.r(cVar);
            }
        } else {
            rVar = new c40.r(cVar);
        }
        Object obj = rVar.B;
        l00.a aVar2 = l00.a.A;
        int i2 = rVar.C;
        try {
            if (i2 == 0) {
                ri.t1.O(obj);
                if (rVar.getContext().get(w.B) != tVar) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                rVar.A = aVar;
                rVar.C = 1;
                a40.k kVar = new a40.k(1, s0.j0(rVar));
                kVar.r();
                ((c40.s) tVar).k0(new a20.d(kVar, 7));
                if (kVar.q() == aVar2) {
                    return aVar2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = rVar.A;
                ri.t1.O(obj);
            }
            aVar.invoke();
            return g00.b0.a;
        } catch (Throwable th) {
            aVar.invoke();
            throw th;
        }
    }

    public static final r k(r rVar, boolean z) {
        m.e(rVar, "<this>");
        if (!z) {
            return rVar;
        }
        return rVar.V(h.g(o.A, new y0(7)));
    }

    public static final void l(View view) {
        m.e(view, "<this>");
        q30.k kVarF = ri.t1.F(new b1.v(view, (k00.c) null, 4));
        while (kVarF.hasNext()) {
            ArrayList arrayList = w((View) kVarF.next()).a;
            for (int iM = va.a.M(arrayList); -1 < iM; iM--) {
                ((a3) arrayList.get(iM)).a.e();
            }
        }
    }

    public static void m(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(y40.b.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
            }
        }
    }

    public static void n(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(y40.b.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2));
                sb.append(y40.b.p(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final l2.b o(o0 o0Var, final d00.r0 context, final long j, final float f, long j2, final long j3, l2.b bVar) {
        l2.b bVarC = bVar;
        m.e(context, "context");
        long jY = kh.n.Y(h2.e.g(f, j2));
        if (((int) (jY >> 32)) <= 0 || ((int) (4294967295L & jY)) <= 0) {
            return null;
        }
        y yVarW = b3.m.w(context.a);
        if (bVarC == null) {
            bVarC = yVarW.c();
        } else {
            if (bVarC.s) {
                bVarC = null;
            }
            if (bVarC == null) {
                bVarC = yVarW.c();
            }
        }
        o0Var.M0(jY, bVarC, new u00.k() {
            @Override
            public final Object invoke(Object obj) {
                long j4;
                long j5;
                float f2 = f;
                long j6 = j3;
                d00.r0 r0Var = context;
                k2.d record = (k2.d) obj;
                kotlin.jvm.internal.m.e(record, "$this$record");
                long j7 = j;
                if (j7 != 16) {
                    k2.d.R(record, j7, 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                }
                a1.i iVarG0 = record.G0();
                long jQ = iVarG0.q();
                iVarG0.n().i();
                try {
                    long j8 = 0;
                    ((hf.c) iVarG0.B).H(f2, f2, 0L);
                    long jE = h2.b.e(j6, r0Var.a.T);
                    long j9 = 4294967297L;
                    long j11 = -9223372034707292160L;
                    char c = ' ';
                    if (((((jE & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0 || h2.b.b(jE, 0L)) {
                        long j12 = 0;
                        for (d00.c cVar : r0Var.a.b0) {
                            z1.f fVarF = z1.q.f();
                            u00.k kVarE = fVarF != null ? fVarF.e() : null;
                            z1.f fVarK = z1.q.k(fVarF);
                            try {
                                long jB = cVar.b();
                                if ((jB & 9223372034707292159L) == 9205357640488583168L) {
                                    jB = j12;
                                }
                                z1.q.n(fVarF, fVarK, kVarE);
                                if (((((jB & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != j12 || h2.b.b(jB, j12)) {
                                    z1.f fVarF2 = z1.q.f();
                                    u00.k kVarE2 = fVarF2 != null ? fVarF2.e() : null;
                                    z1.f fVarK2 = z1.q.k(fVarF2);
                                    try {
                                        l2.b bVarA = cVar.a();
                                        if (bVarA == null) {
                                            bVarA = null;
                                        } else {
                                            if (bVarA.s) {
                                                bVarA = null;
                                            }
                                            if (bVarA != null) {
                                                long j13 = bVarA.u;
                                                if (((int) (j13 >> 32)) <= 0 || ((int) (j13 & 4294967295L)) <= 0) {
                                                    bVarA = null;
                                                }
                                            } else {
                                                bVarA = null;
                                            }
                                        }
                                        z1.q.n(fVarF2, fVarK2, kVarE2);
                                        if (bVarA != null) {
                                            rd.a.x(record, bVarA);
                                        }
                                    } catch (Throwable th) {
                                        z1.q.n(fVarF2, fVarK2, kVarE2);
                                        throw th;
                                    }
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB & 4294967295L));
                                    ((hf.c) record.G0().B).I(fIntBitsToFloat, fIntBitsToFloat2);
                                    try {
                                        z1.f fVarF3 = z1.q.f();
                                        u00.k kVarE3 = fVarF3 != null ? fVarF3.e() : null;
                                        z1.f fVarK3 = z1.q.k(fVarF3);
                                        try {
                                            l2.b bVarA2 = cVar.a();
                                            if (bVarA2 == null) {
                                                bVarA2 = null;
                                            } else {
                                                if (bVarA2.s) {
                                                    bVarA2 = null;
                                                }
                                                if (bVarA2 != null) {
                                                    long j14 = bVarA2.u;
                                                    if (((int) (j14 >> 32)) <= 0 || ((int) (j14 & 4294967295L)) <= 0) {
                                                        bVarA2 = null;
                                                    }
                                                } else {
                                                    bVarA2 = null;
                                                }
                                            }
                                            z1.q.n(fVarF3, fVarK3, kVarE3);
                                            if (bVarA2 != null) {
                                                rd.a.x(record, bVarA2);
                                            }
                                            ((hf.c) record.G0().B).I(-fIntBitsToFloat, -fIntBitsToFloat2);
                                        } catch (Throwable th2) {
                                            z1.q.n(fVarF3, fVarK3, kVarE3);
                                            throw th2;
                                        }
                                    } catch (Throwable th3) {
                                        ((hf.c) record.G0().B).I(-fIntBitsToFloat, -fIntBitsToFloat2);
                                        throw th3;
                                    }
                                }
                                j12 = 0;
                            } catch (Throwable th4) {
                                z1.q.n(fVarF, fVarK, kVarE);
                                throw th4;
                            }
                        }
                    } else {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jE >> 32));
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jE & 4294967295L));
                        ((hf.c) record.G0().B).I(fIntBitsToFloat3, fIntBitsToFloat4);
                        try {
                            for (d00.c cVar2 : r0Var.a.b0) {
                                z1.f fVarF4 = z1.q.f();
                                u00.k kVarE4 = fVarF4 != null ? fVarF4.e() : null;
                                char c2 = c;
                                z1.f fVarK4 = z1.q.k(fVarF4);
                                try {
                                    long jB2 = cVar2.b();
                                    long j15 = (jB2 & 9223372034707292159L) != 9205357640488583168L ? jB2 : j8;
                                    z1.q.n(fVarF4, fVarK4, kVarE4);
                                    if (((((j15 & 9187343241974906880L) ^ 9187343241974906880L) - j9) & j11) != j8 || h2.b.b(j15, j8)) {
                                        j4 = j11;
                                        j5 = j8;
                                        z1.f fVarF5 = z1.q.f();
                                        u00.k kVarE5 = fVarF5 != null ? fVarF5.e() : null;
                                        z1.f fVarK5 = z1.q.k(fVarF5);
                                        try {
                                            l2.b bVarA3 = cVar2.a();
                                            if (bVarA3 == null) {
                                                bVarA3 = null;
                                            } else {
                                                if (bVarA3.s) {
                                                    bVarA3 = null;
                                                }
                                                if (bVarA3 != null) {
                                                    long j16 = bVarA3.u;
                                                    if (((int) (j16 >> c2)) <= 0 || ((int) (j16 & 4294967295L)) <= 0) {
                                                        bVarA3 = null;
                                                    }
                                                } else {
                                                    bVarA3 = null;
                                                }
                                            }
                                            z1.q.n(fVarF5, fVarK5, kVarE5);
                                            if (bVarA3 != null) {
                                                rd.a.x(record, bVarA3);
                                            }
                                        } catch (Throwable th5) {
                                            z1.q.n(fVarF5, fVarK5, kVarE5);
                                            throw th5;
                                        }
                                    } else {
                                        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (j15 >> c2));
                                        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (j15 & 4294967295L));
                                        ((hf.c) record.G0().B).I(fIntBitsToFloat5, fIntBitsToFloat6);
                                        try {
                                            z1.f fVarF6 = z1.q.f();
                                            u00.k kVarE6 = fVarF6 != null ? fVarF6.e() : null;
                                            z1.f fVarK6 = z1.q.k(fVarF6);
                                            try {
                                                l2.b bVarA4 = cVar2.a();
                                                if (bVarA4 != null) {
                                                    j4 = j11;
                                                    if (bVarA4.s) {
                                                        bVarA4 = null;
                                                    }
                                                    if (bVarA4 != null) {
                                                        j5 = j8;
                                                        long j17 = bVarA4.u;
                                                        if (((int) (j17 >> c2)) <= 0 || ((int) (j17 & 4294967295L)) <= 0) {
                                                        }
                                                        z1.q.n(fVarF6, fVarK6, kVarE6);
                                                        if (bVarA4 != null) {
                                                            rd.a.x(record, bVarA4);
                                                        }
                                                        ((hf.c) record.G0().B).I(-fIntBitsToFloat5, -fIntBitsToFloat6);
                                                    }
                                                    bVarA4 = null;
                                                    z1.q.n(fVarF6, fVarK6, kVarE6);
                                                    if (bVarA4 != null) {
                                                        rd.a.x(record, bVarA4);
                                                    }
                                                    ((hf.c) record.G0().B).I(-fIntBitsToFloat5, -fIntBitsToFloat6);
                                                } else {
                                                    j4 = j11;
                                                }
                                                j5 = j8;
                                                bVarA4 = null;
                                                z1.q.n(fVarF6, fVarK6, kVarE6);
                                                if (bVarA4 != null) {
                                                    rd.a.x(record, bVarA4);
                                                }
                                                ((hf.c) record.G0().B).I(-fIntBitsToFloat5, -fIntBitsToFloat6);
                                            } catch (Throwable th6) {
                                                z1.q.n(fVarF6, fVarK6, kVarE6);
                                                throw th6;
                                            }
                                        } catch (Throwable th7) {
                                            ((hf.c) record.G0().B).I(-fIntBitsToFloat5, -fIntBitsToFloat6);
                                            throw th7;
                                        }
                                    }
                                    j8 = j5;
                                    c = c2;
                                    j9 = j9;
                                    j11 = j4;
                                } catch (Throwable th8) {
                                    z1.q.n(fVarF4, fVarK4, kVarE4);
                                    throw th8;
                                }
                            }
                            ((hf.c) record.G0().B).I(-fIntBitsToFloat3, -fIntBitsToFloat4);
                        } catch (Throwable th9) {
                            ((hf.c) record.G0().B).I(-fIntBitsToFloat3, -fIntBitsToFloat4);
                            throw th9;
                        }
                    }
                    w.c.t(iVarG0, jQ);
                    return g00.b0.a;
                } catch (Throwable th10) {
                    w.c.t(iVarG0, jQ);
                    throw th10;
                }
            }
        });
        return bVarC;
    }

    public static final void p(k2.d drawScaledContent, long j, long j2, boolean z, u00.k kVar) {
        m.e(drawScaledContent, "$this$drawScaledContent");
        float fMax = Math.max(Float.intBitsToFloat((int) (drawScaledContent.b() >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (drawScaledContent.b() & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScaledContent.b() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScaledContent.b() & 4294967295L));
        a1.i iVarG0 = drawScaledContent.G0();
        long jQ = iVarG0.q();
        iVarG0.n().i();
        try {
            hf.c cVar = (hf.c) iVarG0.B;
            if (z) {
                cVar.y(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
            }
            if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0 || h2.b.b(j, 0L)) {
                a1.i iVarG1 = drawScaledContent.G0();
                long jQ2 = iVarG1.q();
                iVarG1.n().i();
                try {
                    ((hf.c) iVarG1.B).H(fMax, fMax, 0L);
                    kVar.invoke(drawScaledContent);
                    iVarG1.n().q();
                    iVarG1.C(jQ2);
                } catch (Throwable th) {
                    iVarG1.n().q();
                    iVarG1.C(jQ2);
                    throw th;
                }
            } else {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                ((hf.c) drawScaledContent.G0().B).I(fIntBitsToFloat3, fIntBitsToFloat4);
                try {
                    a1.i iVarG2 = drawScaledContent.G0();
                    long jQ3 = iVarG2.q();
                    iVarG2.n().i();
                    try {
                        ((hf.c) iVarG2.B).H(fMax, fMax, 0L);
                        kVar.invoke(drawScaledContent);
                        iVarG2.n().q();
                        iVarG2.C(jQ3);
                        ((hf.c) drawScaledContent.G0().B).I(-fIntBitsToFloat3, -fIntBitsToFloat4);
                    } catch (Throwable th2) {
                        iVarG2.n().q();
                        iVarG2.C(jQ3);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    ((hf.c) drawScaledContent.G0().B).I(-fIntBitsToFloat3, -fIntBitsToFloat4);
                    throw th3;
                }
            }
            w.c.t(iVarG0, jQ);
        } catch (Throwable th4) {
            w.c.t(iVarG0, jQ);
            throw th4;
        }
    }

    public static final void q(k2.d drawScrim, e00.m colorEffect, d00.r0 context, long j, long j2) {
        m.e(drawScrim, "$this$drawScrim");
        m.e(colorEffect, "colorEffect");
        m.e(context, "context");
        if (colorEffect instanceof e00.k) {
            e00.k kVar = (e00.k) colorEffect;
            k2.d.R(drawScrim, kVar.a, 0L, j2, 0.0f, (k2.h) null, kVar.b, 58);
        }
    }

    public static boolean r(String str, String str2) {
        char c;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                char cCharAt2 = str2.charAt(i);
                if (cCharAt == cCharAt2 || ((c = (char) ((cCharAt | ' ') - 97)) < 26 && c == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final float s(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = n3.j.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : p3.d.a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float t(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = n3.j.a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? p3.d.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final Object u(o20.l lVar, o20.n extension) {
        m.e(lVar, "<this>");
        m.e(extension, "extension");
        if (lVar.j(extension)) {
            return lVar.i(extension);
        }
        return null;
    }

    public static final Object v(o20.l lVar, o20.n extension, int i) {
        m.e(lVar, "<this>");
        m.e(extension, "extension");
        lVar.m(extension);
        o20.i iVar = lVar.A;
        o20.m mVar = extension.d;
        iVar.getClass();
        z zVar = iVar.a;
        if (!mVar.C) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj = zVar.get(mVar);
        if (i >= (obj == null ? 0 : ((List) obj).size())) {
            return null;
        }
        lVar.m(extension);
        if (!mVar.C) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj2 = zVar.get(mVar);
        if (obj2 != null) {
            return extension.a(((List) obj2).get(i));
        }
        throw new IndexOutOfBoundsException();
    }

    public static final n5.a w(View view) {
        n5.a aVar = (n5.a) view.getTag(2131362951);
        if (aVar != null) {
            return aVar;
        }
        n5.a aVar2 = new n5.a();
        view.setTag(2131362951, aVar2);
        return aVar2;
    }

    public static final int x(ma.a connection) {
        m.e(connection, "connection");
        ma.c cVarK0 = connection.k0("SELECT changes()");
        try {
            cVarK0.d0();
            int i = (int) cVarK0.getLong(0);
            v.s(cVarK0, (Throwable) null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                v.s(cVarK0, th);
                throw th2;
            }
        }
    }

    public static oa.b y(o9.q refHolder, SQLiteDatabase sQLiteDatabase) {
        m.e(refHolder, "refHolder");
        oa.b bVar = (oa.b) refHolder.B;
        if (bVar != null && bVar.A.equals(sQLiteDatabase)) {
            return bVar;
        }
        oa.b bVar2 = new oa.b(sQLiteDatabase);
        refHolder.B = bVar2;
        return bVar2;
    }

    public static final java.lang.Object z(m00.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: w00.a.z(m00.c):java.lang.Object");
    }

    public abstract void C(Throwable th);

    public abstract void D(p10.a aVar);

    public abstract void M(ArrayList arrayList);

    public abstract void N(byte[] bArr, int i, int i2);

    public abstract String i();

    public String toString() {
        switch (this.a) {
            case 15:
                return i();
            default:
                return super.toString();
        }
    }
}
