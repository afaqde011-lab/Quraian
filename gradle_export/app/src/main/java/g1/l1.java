package g1;

import android.content.res.Configuration;
import com.google.android.gms.cast.Cast;
import com.google.protobuf.RuntimeVersion;
import java.util.Arrays;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

public final class l1 {

    public static final l1 f5852a = new l1();

    public static final z00.e f5853b = new z00.e(1900, 2100, 1);

    public static final float f5854c = k1.k.f8782a;

    public static h1 b(long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, l1.j jVar, int i10) throws NoWhenBranchMatchedException {
        long j23 = (i10 & 2) != 0 ? i2.t.f7167g : j10;
        long j24 = (i10 & 4) != 0 ? i2.t.f7167g : j11;
        long j25 = (i10 & 8) != 0 ? i2.t.f7167g : j12;
        long j26 = (i10 & 16) != 0 ? i2.t.f7167g : j13;
        long j27 = (i10 & 32) != 0 ? i2.t.f7167g : j14;
        long j28 = (i10 & 64) != 0 ? i2.t.f7167g : j15;
        long j29 = i2.t.f7167g;
        long j30 = j23;
        long j31 = (i10 & 256) != 0 ? j29 : j16;
        long j32 = (i10 & 512) != 0 ? j29 : j17;
        long j33 = (i10 & 2048) != 0 ? j29 : j18;
        long j34 = (i10 & 32768) != 0 ? j29 : j19;
        long j35 = (i10 & 131072) != 0 ? j29 : j20;
        long j36 = (i10 & 524288) != 0 ? j29 : j21;
        long j37 = (i10 & 1048576) != 0 ? j29 : j22;
        long j38 = j33;
        q0 q0Var = (q0) ((l1.g0) jVar).k(r0.f5948a);
        h1 h1Var = q0Var.f5908a0;
        if (h1Var == null) {
            l1.g0 g0Var = (l1.g0) jVar;
            g0Var.c0(642416503);
            long jD = r0.d(q0Var, k1.h.f8740a);
            long jD2 = r0.d(q0Var, k1.h.f8755r);
            long jD3 = r0.d(q0Var, k1.h.f8753p);
            long jD4 = r0.d(q0Var, k1.h.f8760w);
            long jD5 = r0.d(q0Var, k1.h.f8759v);
            long j39 = q0Var.f5929s;
            k1.g gVar = k1.h.E;
            long jD6 = r0.d(q0Var, gVar);
            long jB = i2.t.b(0.38f, r0.d(q0Var, gVar));
            k1.g gVar2 = k1.h.m;
            long jD7 = r0.d(q0Var, gVar2);
            k1.g gVar3 = k1.h.C;
            long jD8 = r0.d(q0Var, gVar3);
            long jB2 = i2.t.b(0.38f, r0.d(q0Var, gVar3));
            k1.g gVar4 = k1.h.B;
            long jD9 = r0.d(q0Var, gVar4);
            long jB3 = i2.t.b(0.38f, r0.d(q0Var, gVar4));
            k1.g gVar5 = k1.h.f8751n;
            long jD10 = r0.d(q0Var, gVar5);
            long jB4 = i2.t.b(0.38f, r0.d(q0Var, gVar5));
            k1.g gVar6 = k1.h.f8749j;
            long jD11 = r0.d(q0Var, gVar6);
            long jB5 = i2.t.b(0.38f, r0.d(q0Var, gVar6));
            k1.g gVar7 = k1.h.f8748i;
            long jD12 = r0.d(q0Var, gVar7);
            long jB6 = i2.t.b(0.38f, r0.d(q0Var, gVar7));
            long jD13 = r0.d(q0Var, gVar2);
            long jD14 = r0.d(q0Var, k1.h.f8750k);
            long jD15 = r0.d(q0Var, k1.h.f8758u);
            long jD16 = r0.d(q0Var, k1.h.f8757t);
            long jD17 = r0.d(q0Var, k1.j.f8780a);
            c5 c5Var = c5.f5746a;
            h1 h1Var2 = new h1(jD, jD2, jD3, jD4, jD5, j39, jD6, jB, jD7, jD8, jB2, jD9, jB3, jD10, jB4, jD11, jB5, jD12, jB6, jD13, jD14, jD16, jD15, jD17, c5.d(q0Var, jVar));
            q0Var.f5908a0 = h1Var2;
            g0Var.r(false);
            h1Var = h1Var2;
        } else {
            l1.g0 g0Var2 = (l1.g0) jVar;
            g0Var2.c0(642290457);
            g0Var2.r(false);
        }
        long j40 = j9 != 16 ? j9 : h1Var.f5814a;
        long j41 = j30 != 16 ? j30 : h1Var.f5815b;
        long j42 = j24 != 16 ? j24 : h1Var.f5816c;
        long j43 = j25 != 16 ? j25 : h1Var.f5817d;
        if (j26 == 16) {
            j26 = h1Var.f5818e;
        }
        long j44 = j26;
        if (j27 == 16) {
            j27 = h1Var.f5819f;
        }
        long j45 = j27;
        if (j28 == 16) {
            j28 = h1Var.f5820g;
        }
        long j46 = j28;
        long j47 = j29 != 16 ? j29 : h1Var.f5821h;
        long j48 = j31 != 16 ? j31 : h1Var.f5822i;
        long j49 = j32 != 16 ? j32 : h1Var.f5823j;
        long j50 = j29 != 16 ? j29 : h1Var.f5824k;
        long j51 = j38 != 16 ? j38 : h1Var.l;
        long j52 = j29 != 16 ? j29 : h1Var.m;
        long j53 = j29 != 16 ? j29 : h1Var.f5825n;
        long j54 = j29 != 16 ? j29 : h1Var.f5826o;
        long j55 = j34 != 16 ? j34 : h1Var.f5827p;
        long j56 = j29 != 16 ? j29 : h1Var.f5828q;
        long j57 = j35 != 16 ? j35 : h1Var.f5829r;
        long j58 = j29 != 16 ? j29 : h1Var.f5830s;
        long j59 = j36 != 16 ? j36 : h1Var.f5831t;
        long j60 = j37 != 16 ? j37 : h1Var.f5832u;
        long j61 = j29 != 16 ? j29 : h1Var.f5833v;
        long j62 = j29 != 16 ? j29 : h1Var.f5834w;
        if (j29 == 16) {
            j29 = h1Var.f5835x;
        }
        return new h1(j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, j58, j59, j60, j61, j62, j29, h1Var.f5836y);
    }

    public final void a(Long l, int i10, r1 r1Var, b2.r rVar, long j9, l1.j jVar, int i11) {
        l1.g0 g0Var;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(1913724796);
        int i12 = i11 | (g0Var2.g(l) ? 4 : 2) | (g0Var2.e(i10) ? 32 : 16) | (g0Var2.g(r1Var) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var2.f(j9) ? 16384 : 8192);
        if (g0Var2.S(i12 & 1, (74899 & i12) != 74898)) {
            g0Var2.X();
            if ((i11 & 1) != 0 && !g0Var2.A()) {
                g0Var2.V();
            }
            g0Var2.s();
            g0Var2.c0(2088426481);
            Locale locale = ((Configuration) g0Var2.k(c3.o0.f2721a)).getLocales().get(0);
            g0Var2.r(false);
            String strA = r1Var.a(l, locale, false);
            String strA2 = r1Var.a(l, locale, true);
            String strL = RuntimeVersion.SUFFIX;
            if (strA2 == null) {
                g0Var2.c0(380185931);
                if (i10 == 0) {
                    g0Var2.c0(843549871);
                    strA2 = h1.f.l(g0Var2, 2131886666);
                    g0Var2.r(false);
                } else if (i10 == 1) {
                    g0Var2.c0(843552842);
                    strA2 = h1.f.l(g0Var2, 2131886661);
                    g0Var2.r(false);
                } else {
                    g0Var2.c0(380407362);
                    g0Var2.r(false);
                    strA2 = RuntimeVersion.SUFFIX;
                }
                g0Var2.r(false);
            } else {
                g0Var2.c0(843542258);
                g0Var2.r(false);
            }
            if (strA == null) {
                g0Var2.c0(380507587);
                if (i10 == 0) {
                    g0Var2.c0(843560257);
                    strA = h1.f.l(g0Var2, 2131886663);
                    g0Var2.r(false);
                } else if (i10 == 1) {
                    g0Var2.c0(843562784);
                    strA = h1.f.l(g0Var2, 2131886655);
                    g0Var2.r(false);
                } else {
                    g0Var2.c0(380705954);
                    g0Var2.r(false);
                    strA = RuntimeVersion.SUFFIX;
                }
                g0Var2.r(false);
            } else {
                g0Var2.c0(843557408);
                g0Var2.r(false);
            }
            if (i10 == 0) {
                g0Var2.c0(843570444);
                strL = h1.f.l(g0Var2, 2131886664);
                g0Var2.r(false);
            } else if (i10 == 1) {
                g0Var2.c0(843573323);
                strL = h1.f.l(g0Var2, 2131886656);
                g0Var2.r(false);
            } else {
                g0Var2.c0(381043234);
                g0Var2.r(false);
            }
            String str = String.format(strL, Arrays.copyOf(new Object[]{strA2}, 1));
            boolean zG = g0Var2.g(str);
            Object objN = g0Var2.N();
            if (zG || objN == l1.i.f9868a) {
                objN = new b6.o(str, 3);
                g0Var2.n0(objN);
            }
            g0Var = g0Var2;
            z6.b(strA, j3.q.c(rVar, false, (u00.k) objN), j9, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, g0Var, (i12 >> 6) & 896, 24576, 245752);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new i1(this, l, i10, r1Var, rVar, j9, i11);
        }
    }
}
