package g1;

import com.google.android.gms.cast.Cast;
import com.google.protobuf.RuntimeVersion;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class f1 {

    public static final h0.p1 f5786a;

    public static final float f5787b = 16;

    static {
        float f3 = 24;
        f5786a = h0.c.g(f3, 10, f3, 0.0f, 8);
    }

    public static final void a(final Long l, final u00.k kVar, final h1.t tVar, final z00.e eVar, final r1 r1Var, final d6 d6Var, final h1 h1Var, final g2.t tVar2, l1.j jVar, final int i10) {
        boolean z10;
        Object a0Var;
        h1.a0 a0Var2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-432341251);
        int i11 = i10 | (g0Var.g(l) ? 4 : 2) | (g0Var.i(kVar) ? 32 : 16) | (g0Var.i(tVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var.i(eVar) ? 2048 : 1024) | (g0Var.g(r1Var) ? 16384 : 8192) | (g0Var.g(d6Var) ? 131072 : Cast.MAX_MESSAGE_LENGTH) | (g0Var.g(h1Var) ? 1048576 : 524288) | (g0Var.g(tVar2) ? 8388608 : 4194304);
        if (g0Var.S(i11 & 1, (4793491 & i11) != 4793490)) {
            boolean zG = g0Var.g(tVar.f6528a);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (zG || objN == cVar) {
                Locale locale = tVar.f6528a;
                String localizedDateTimePattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale);
                Pattern patternCompile = Pattern.compile("[^dMy/\\-.]");
                kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
                kotlin.jvm.internal.m.e(localizedDateTimePattern, "input");
                String strReplaceAll = patternCompile.matcher(localizedDateTimePattern).replaceAll(RuntimeVersion.SUFFIX);
                kotlin.jvm.internal.m.d(strReplaceAll, "replaceAll(...)");
                Pattern patternCompile2 = Pattern.compile("d{1,2}");
                kotlin.jvm.internal.m.d(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("dd");
                kotlin.jvm.internal.m.d(strReplaceAll2, "replaceAll(...)");
                Pattern patternCompile3 = Pattern.compile("M{1,2}");
                kotlin.jvm.internal.m.d(patternCompile3, "compile(...)");
                String strReplaceAll3 = patternCompile3.matcher(strReplaceAll2).replaceAll("MM");
                kotlin.jvm.internal.m.d(strReplaceAll3, "replaceAll(...)");
                Pattern patternCompile4 = Pattern.compile("y{1,4}");
                kotlin.jvm.internal.m.d(patternCompile4, "compile(...)");
                String strReplaceAll4 = patternCompile4.matcher(strReplaceAll3).replaceAll("yyyy");
                kotlin.jvm.internal.m.d(strReplaceAll4, "replaceAll(...)");
                String strS0 = r30.k.S0(r30.r.v0(strReplaceAll4, "My", "M/y"), ".");
                Pattern patternCompile5 = Pattern.compile("[/\\-.]");
                kotlin.jvm.internal.m.d(patternCompile5, "compile(...)");
                Matcher matcher = patternCompile5.matcher(strS0);
                kotlin.jvm.internal.m.d(matcher, "matcher(...)");
                z10 = false;
                r30.h hVar = !matcher.find(0) ? null : new r30.h(matcher, strS0);
                kotlin.jvm.internal.m.b(hVar);
                r30.f fVarC = hVar.c.c(0);
                kotlin.jvm.internal.m.b(fVarC);
                a0Var = new h1.a0(strS0, fVarC.a.charAt(0));
                g0Var.n0(a0Var);
            } else {
                a0Var = objN;
                z10 = false;
            }
            h1.a0 a0Var3 = (h1.a0) a0Var;
            String strL = h1.f.l(g0Var, 2131886657);
            String strL2 = h1.f.l(g0Var, 2131886659);
            String strL3 = h1.f.l(g0Var, 2131886658);
            boolean zG2 = g0Var.g(a0Var3);
            if ((57344 & i11) == 16384) {
                z10 = true;
            }
            boolean z11 = zG2 | z10;
            Object objN2 = g0Var.N();
            if (z11 || objN2 == cVar) {
                a0Var2 = a0Var3;
                g1 g1Var = new g1(eVar, d6Var, a0Var2, r1Var, strL, strL2, strL3);
                g0Var.n0(g1Var);
                objN2 = g1Var;
            } else {
                a0Var2 = a0Var3;
            }
            g1 g1Var2 = (g1) objN2;
            String upperCase = a0Var2.f6488a.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
            String strL4 = h1.f.l(g0Var, 2131886660);
            b2.r rVarB = h0.c.B(h0.z1.d(b2.o.A, 1.0f), f5786a);
            g1Var2.getClass();
            int i12 = i11 << 3;
            b(rVarB, l, kVar, tVar, v1.d.d(-752164549, new w(strL4, upperCase, 1), g0Var), v1.d.d(-1179434278, new d1(upperCase, 0), g0Var), g1Var2, a0Var2, tVar.f6528a, h1Var, tVar2, g0Var, (i12 & 112) | 1794054 | (i12 & 896) | (i12 & 7168), (i11 >> 18) & 126);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n(l, kVar, tVar, eVar, r1Var, d6Var, h1Var, tVar2, i10) {
                public final Long A;
                public final u00.k B;
                public final h1.t C;
                public final z00.e D;
                public final r1 E;
                public final d6 F;
                public final h1 G;
                public final g2.t H;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(1);
                    f1.a(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void b(final b2.r rVar, Long l, final u00.k kVar, final h1.t tVar, final v1.c cVar, final v1.c cVar2, final g1 g1Var, final h1.a0 a0Var, final Locale locale, final h1 h1Var, final g2.t tVar2, l1.j jVar, final int i10, final int i11) {
        int i12;
        int i13;
        l1.g0 g0Var;
        l1.z0 z0Var;
        Object b1Var;
        boolean z10;
        h1.a0 a0Var2;
        l1.z0 z0Var2;
        final Long l10 = l;
        h1.t tVar3 = tVar;
        Locale locale2 = locale;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(1456309913);
        if ((i10 & 6) == 0) {
            i12 = (g0Var2.g(rVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= g0Var2.g(l10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= g0Var2.i(kVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i12 |= g0Var2.i(tVar3) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= g0Var2.i(cVar) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= g0Var2.i(cVar2) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= g0Var2.e(0) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= g0Var2.g(g1Var) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= g0Var2.g(a0Var) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= g0Var2.i(locale2) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (g0Var2.g(h1Var) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= g0Var2.g(tVar2) ? 32 : 16;
        }
        int i14 = i13;
        if (g0Var2.S(i12 & 1, ((i12 & 306783379) == 306783378 && (i14 & 19) == 18) ? false : true)) {
            Object[] objArr = new Object[0];
            Object objN = g0Var2.N();
            l1.c cVar3 = l1.i.f9868a;
            if (objN == cVar3) {
                objN = new e00.g(15);
                g0Var2.n0(objN);
            }
            l1.z0 z0VarE = y1.k.e(objArr, (u00.a) objN, g0Var2, 384);
            Object[] objArr2 = {(r3.w) z0VarE.getValue()};
            int i15 = i12 & 29360128;
            int i16 = i12 & 234881024;
            boolean zG = g0Var2.g(z0VarE) | (i15 == 8388608) | g0Var2.i(tVar3) | (i16 == 67108864) | g0Var2.i(locale2);
            int i17 = i12 & 3670016;
            boolean z11 = zG | (i17 == 1048576);
            Object objN2 = g0Var2.N();
            if (z11 || objN2 == cVar3) {
                objN2 = new a1(g1Var, tVar3, a0Var, locale2, z0VarE);
                tVar3 = tVar3;
                z0Var = z0VarE;
                g0Var2.n0(objN2);
            } else {
                z0Var = z0VarE;
            }
            l1.z0 z0Var3 = (l1.z0) y1.k.c(objArr2, (u00.a) objN2, g0Var2, 0);
            boolean zL0 = r30.k.L0((CharSequence) z0Var3.getValue());
            float f3 = f5787b;
            if (!zL0) {
                h0.p1 p1VarB = v6.b();
                f3 -= p1VarB.f6453d + p1VarB.f6451b;
            }
            float f10 = f3;
            r3.w wVar = (r3.w) z0Var.getValue();
            boolean zG2 = ((i12 & 896) == 256) | (i16 == 67108864) | g0Var2.g(z0Var) | g0Var2.g(z0Var3) | g0Var2.i(tVar3) | g0Var2.i(locale2) | (i15 == 8388608) | (i17 == 1048576);
            Object objN3 = g0Var2.N();
            if (zG2 || objN3 == cVar3) {
                l1.z0 z0Var4 = z0Var;
                z10 = false;
                h1.t tVar4 = tVar3;
                b1Var = new b1(a0Var, z0Var3, kVar, tVar4, locale2, g1Var, z0Var4);
                a0Var2 = a0Var;
                tVar3 = tVar4;
                locale2 = locale2;
                z0Var2 = z0Var3;
                z0Var = z0Var4;
                g0Var2.n0(b1Var);
            } else {
                z0Var2 = z0Var3;
                b1Var = objN3;
                z10 = false;
                a0Var2 = a0Var;
            }
            u00.k kVar2 = (u00.k) b1Var;
            boolean z12 = z10;
            b2.r rVarG = h0.c.G(rVar, 0.0f, 0.0f, 0.0f, f10, 7);
            boolean zG3 = g0Var2.g(z0Var2);
            Object objN4 = g0Var2.N();
            if (zG3 || objN4 == cVar3) {
                objN4 = new d0.o2(z0Var2, 3);
                g0Var2.n0(objN4);
            }
            b2.r rVarC = j3.q.c(rVarG, z12, (u00.k) objN4);
            b2.r rVarJ = b2.o.A;
            if (tVar2 != null) {
                rVarJ = g2.d.j(rVarJ, tVar2);
            }
            int i18 = i12;
            n5.b(wVar, kVar2, rVarC.V(rVarJ), false, null, cVar, cVar2, v1.d.d(-357881838, new e1(z0Var2, 0), g0Var2), !r30.k.L0((CharSequence) z0Var2.getValue()), new c3(a0Var2), new q0.i1(z12 ? 1 : 0, 3, 7, 113), null, true, 0, 0, null, h1Var.f5836y, g0Var2, (i18 << 6) & 33030144);
            g0Var = g0Var2;
            ?? r15 = (i14 & 112) == 32 ? 1 : z12 ? 1 : 0;
            Object objN5 = g0Var.N();
            if (r15 != 0 || objN5 == cVar3) {
                objN5 = new a1.a0(tVar2, (k00.c) null, 20);
                g0Var.n0(objN5);
            }
            l1.q.i(g00.b0.a, g0Var, (u00.n) objN5);
            ?? r4 = ((((g0Var.i(tVar3) ? 1 : 0) | ((i18 & 112) == 32 ? 1 : z12 ? 1 : 0)) | (i16 == 67108864 ? 1 : z12 ? 1 : 0)) == true ? 1 : 0) | (g0Var.i(locale2) ? 1 : 0) | (g0Var.g(z0Var) ? 1 : 0);
            Object objN6 = g0Var.N();
            if (r4 != 0 || objN6 == cVar3) {
                dq.i iVar = new dq.i(l, tVar3, a0Var, locale2, z0Var, (k00.c) null);
                l10 = l;
                g0Var.n0(iVar);
                objN6 = iVar;
            } else {
                l10 = l;
            }
            l1.q.i(l10, g0Var, (u00.n) objN6);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(i10 | 1);
                    int iK2 = l1.q.K(i11);
                    f1.b(rVar, l10, kVar, tVar, cVar, cVar2, g1Var, a0Var, locale, h1Var, tVar2, (l1.j) obj, iK, iK2);
                    return g00.b0.a;
                }
            };
        }
    }
}
