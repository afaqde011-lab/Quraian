package g1;

import android.content.Context;
import android.os.Trace;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

public final class p2 implements u00.k {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;

    public p2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
        this.E = obj4;
        this.F = obj5;
        this.G = obj6;
        this.H = obj7;
        this.I = obj8;
        this.J = obj9;
    }

    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        boolean zD;
        int i10;
        z1.f g0Var;
        z1.f fVar;
        Object[] objArr;
        long[] jArr;
        char c10;
        int length;
        long j9;
        int i11;
        long j10;
        Object[] objArr2;
        int i12;
        int i13;
        Object[] objArr3;
        long[] jArr2;
        int length2;
        int i14;
        long j11;
        Object[] objArr4;
        long[] jArr3;
        int i15;
        int i16;
        boolean z10;
        l1.p pVar = null;
        int i17 = 3;
        switch (this.A) {
            case 0:
                z00.e eVar = (z00.e) this.B;
                h1.t tVar = (h1.t) this.C;
                h1.w wVar = (h1.w) this.D;
                u00.k kVar = (u00.k) this.E;
                h1.s sVar = (h1.s) this.F;
                Long l = (Long) this.G;
                r1 r1Var = (r1) this.H;
                d6 d6Var = (d6) this.I;
                h1 h1Var = (h1) this.J;
                float f3 = a3.f5709a;
                j0.h.s((j0.h) obj, ((((z00.c) eVar).B - ((z00.c) eVar).A) + 1) * 12, null, new v1.c(new q2(tVar, wVar, kVar, sVar, l, r1Var, d6Var, h1Var, 0), 72599078, true), 6);
                return g00.b0.a;
            case 1:
                l1.x1 x1Var = (l1.x1) this.B;
                u.j0 j0Var = (u.j0) this.C;
                u.j0 j0Var2 = (u.j0) this.D;
                List list = (List) this.E;
                List list2 = (List) this.F;
                u.j0 j0Var3 = (u.j0) this.G;
                List list3 = (List) this.H;
                u.j0 j0Var4 = (u.j0) this.I;
                Set set = (Set) this.J;
                long jLongValue = ((Long) obj).longValue();
                synchronized (x1Var.f9952d) {
                    zD = x1Var.D();
                }
                if (zD) {
                    Trace.beginSection("Recomposer:animation");
                    try {
                        ((ce.c) x1Var.f9950b.C).u(new gj.h(jLongValue, i17));
                        synchronized (z1.l.f17038c) {
                            u.j0 j0Var5 = z1.l.f17045j.f17005h;
                            z10 = j0Var5 != null && j0Var5.h();
                        }
                        if (z10) {
                            z1.l.a();
                        }
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                Trace.beginSection("Recomposer:recompose");
                try {
                    x1Var.O();
                    synchronized (x1Var.f9952d) {
                        try {
                            m1.e eVar2 = x1Var.f9958j;
                            Object[] objArr5 = eVar2.A;
                            int i18 = eVar2.C;
                            for (int i19 = 0; i19 < i18; i19++) {
                                list.add((l1.p) objArr5[i19]);
                            }
                            x1Var.f9958j.g();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    j0Var.b();
                    j0Var2.b();
                    while (true) {
                        if (list.isEmpty() && list2.isEmpty()) {
                            z1.f fVarJ = z1.l.j();
                            if (fVarJ instanceof z1.b) {
                                g0Var = new z1.f0((z1.b) fVarJ, null, null, true, false);
                                i10 = 0;
                            } else {
                                i10 = 0;
                                g0Var = new z1.g0(fVarJ, pVar, true, false);
                            }
                            try {
                                z1.f fVarJ2 = g0Var.j();
                                try {
                                    if (list3.isEmpty()) {
                                        if (j0Var3.h()) {
                                            j0Var4.k(j0Var3);
                                            objArr = j0Var3.f14865b;
                                            jArr = j0Var3.f14864a;
                                            c10 = 7;
                                            length = jArr.length - 2;
                                            if (length >= 0) {
                                                i11 = 0;
                                                j9 = 128;
                                                while (true) {
                                                    j10 = jArr[i11];
                                                    objArr2 = objArr;
                                                    fVar = fVarJ2;
                                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        i12 = 8 - ((~(i11 - length)) >>> 31);
                                                        for (i13 = 0; i13 < i12; i13++) {
                                                            if ((j10 & 255) < 128) {
                                                                ((l1.p) objArr2[(i11 << 3) + i13]).i();
                                                            }
                                                            j10 >>= 8;
                                                        }
                                                        if (i12 == 8) {
                                                            if (i11 != length) {
                                                                i11++;
                                                                fVarJ2 = fVar;
                                                                objArr = objArr2;
                                                            }
                                                        }
                                                    } else if (i11 != length) {
                                                        i11++;
                                                        fVarJ2 = fVar;
                                                        objArr = objArr2;
                                                    }
                                                }
                                            } else {
                                                fVar = fVarJ2;
                                                j9 = 128;
                                            }
                                            j0Var3.b();
                                        } else {
                                            fVar = fVarJ2;
                                            c10 = 7;
                                            j9 = 128;
                                        }
                                        if (j0Var4.h()) {
                                            objArr3 = j0Var4.f14865b;
                                            jArr2 = j0Var4.f14864a;
                                            length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                i14 = 0;
                                                while (true) {
                                                    j11 = jArr2[i14];
                                                    objArr4 = objArr3;
                                                    jArr3 = jArr2;
                                                    if ((((~j11) << c10) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        i15 = 8 - ((~(i14 - length2)) >>> 31);
                                                        for (i16 = 0; i16 < i15; i16++) {
                                                            if ((j11 & 255) < j9) {
                                                                ((l1.p) objArr4[(i14 << 3) + i16]).j();
                                                            }
                                                            j11 >>= 8;
                                                            break;
                                                        }
                                                        if (i15 == 8) {
                                                        }
                                                    }
                                                    if (i14 != length2) {
                                                        i14++;
                                                        objArr3 = objArr4;
                                                        jArr2 = jArr3;
                                                    }
                                                }
                                            }
                                            j0Var4.b();
                                        }
                                        z1.f.q(fVar);
                                        g0Var.c();
                                        synchronized (x1Var.f9952d) {
                                            if (x1Var.C() == null) {
                                                l1.l.a("unexpected to get continuation here");
                                                break;
                                            }
                                            z1.l.j().m();
                                            j0Var2.b();
                                            j0Var.b();
                                            x1Var.f9964r = null;
                                        }
                                    } else {
                                        x1Var.f9949a++;
                                        try {
                                            int size = list3.size();
                                            for (int i20 = i10; i20 < size; i20++) {
                                                j0Var4.a((l1.p) list3.get(i20));
                                            }
                                            int size2 = list3.size();
                                            for (int i21 = i10; i21 < size2; i21++) {
                                                ((l1.p) list3.get(i21)).g();
                                            }
                                            list3.clear();
                                            try {
                                                if (j0Var3.h()) {
                                                    try {
                                                        j0Var4.k(j0Var3);
                                                        objArr = j0Var3.f14865b;
                                                        jArr = j0Var3.f14864a;
                                                        c10 = 7;
                                                        length = jArr.length - 2;
                                                        if (length >= 0) {
                                                            i11 = 0;
                                                            j9 = 128;
                                                            while (true) {
                                                                j10 = jArr[i11];
                                                                objArr2 = objArr;
                                                                fVar = fVarJ2;
                                                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    i12 = 8 - ((~(i11 - length)) >>> 31);
                                                                    while (i13 < i12) {
                                                                        if ((j10 & 255) < 128) {
                                                                            try {
                                                                                ((l1.p) objArr2[(i11 << 3) + i13]).i();
                                                                            } catch (Throwable th4) {
                                                                                th = th4;
                                                                                try {
                                                                                    x1Var.N(th, null);
                                                                                    l1.w1.i(x1Var, list, list2, list3, j0Var3, j0Var4, j0Var, j0Var2);
                                                                                    j0Var3.b();
                                                                                    z1.f.q(fVar);
                                                                                    g0Var.c();
                                                                                    Trace.endSection();
                                                                                    return g00.b0.a;
                                                                                } catch (Throwable th5) {
                                                                                    j0Var3.b();
                                                                                    throw th5;
                                                                                }
                                                                            }
                                                                        }
                                                                        j10 >>= 8;
                                                                    }
                                                                    if (i12 == 8) {
                                                                        if (i11 != length) {
                                                                            i11++;
                                                                            fVarJ2 = fVar;
                                                                            objArr = objArr2;
                                                                        }
                                                                    }
                                                                } else if (i11 != length) {
                                                                    i11++;
                                                                    fVarJ2 = fVar;
                                                                    objArr = objArr2;
                                                                }
                                                            }
                                                        } else {
                                                            fVar = fVarJ2;
                                                            j9 = 128;
                                                        }
                                                        j0Var3.b();
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        fVar = fVarJ2;
                                                    }
                                                } else {
                                                    fVar = fVarJ2;
                                                    c10 = 7;
                                                    j9 = 128;
                                                }
                                                if (j0Var4.h()) {
                                                    try {
                                                        objArr3 = j0Var4.f14865b;
                                                        jArr2 = j0Var4.f14864a;
                                                        length2 = jArr2.length - 2;
                                                        if (length2 >= 0) {
                                                            i14 = 0;
                                                            while (true) {
                                                                j11 = jArr2[i14];
                                                                objArr4 = objArr3;
                                                                jArr3 = jArr2;
                                                                if ((((~j11) << c10) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    i15 = 8 - ((~(i14 - length2)) >>> 31);
                                                                    while (i16 < i15) {
                                                                        if ((j11 & 255) < j9) {
                                                                            ((l1.p) objArr4[(i14 << 3) + i16]).j();
                                                                        }
                                                                        j11 >>= 8;
                                                                        break;
                                                                    }
                                                                    if (i15 == 8) {
                                                                    }
                                                                }
                                                                if (i14 != length2) {
                                                                    i14++;
                                                                    objArr3 = objArr4;
                                                                    jArr2 = jArr3;
                                                                }
                                                            }
                                                        }
                                                        j0Var4.b();
                                                    } catch (Throwable th7) {
                                                        try {
                                                            x1Var.N(th7, null);
                                                            l1.w1.i(x1Var, list, list2, list3, j0Var3, j0Var4, j0Var, j0Var2);
                                                            j0Var4.b();
                                                            z1.f.q(fVar);
                                                            g0Var.c();
                                                            Trace.endSection();
                                                            return g00.b0.a;
                                                        } catch (Throwable th8) {
                                                            j0Var4.b();
                                                            throw th8;
                                                        }
                                                    }
                                                }
                                                z1.f.q(fVar);
                                                g0Var.c();
                                                synchronized (x1Var.f9952d) {
                                                    if (x1Var.C() == null) {
                                                        l1.l.a("unexpected to get continuation here");
                                                        break;
                                                    }
                                                }
                                                z1.l.j().m();
                                                j0Var2.b();
                                                j0Var.b();
                                                x1Var.f9964r = null;
                                            } catch (Throwable th9) {
                                                th = th9;
                                                z1.f.q(fVar);
                                                throw th;
                                            }
                                        } catch (Throwable th10) {
                                            try {
                                                x1Var.N(th10, pVar);
                                                l1.w1.i(x1Var, list, list2, list3, j0Var3, j0Var4, j0Var, j0Var2);
                                                list3.clear();
                                                z1.f.q(fVarJ2);
                                                g0Var.c();
                                                Trace.endSection();
                                                return g00.b0.a;
                                            } catch (Throwable th11) {
                                                list3.clear();
                                                throw th11;
                                            }
                                        }
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    fVar = fVarJ2;
                                }
                            } catch (Throwable th13) {
                                g0Var.c();
                                throw th13;
                            }
                        } else {
                            try {
                                int size3 = list.size();
                                for (int i22 = 0; i22 < size3; i22++) {
                                    l1.p pVar2 = (l1.p) list.get(i22);
                                    l1.p pVarM = x1Var.M(pVar2, j0Var);
                                    if (pVarM != null) {
                                        list3.add(pVarM);
                                    }
                                    j0Var2.a(pVar2);
                                }
                                list.clear();
                                if (j0Var.h() || x1Var.f9958j.C != 0) {
                                    synchronized (x1Var.f9952d) {
                                        try {
                                            List listH = x1Var.H();
                                            int size4 = listH.size();
                                            for (int i23 = 0; i23 < size4; i23++) {
                                                l1.p pVar3 = (l1.p) listH.get(i23);
                                                if (!j0Var2.c(pVar3) && pVar3.w(set)) {
                                                    list.add(pVar3);
                                                }
                                            }
                                            m1.e eVar3 = x1Var.f9958j;
                                            int i24 = eVar3.C;
                                            int i25 = 0;
                                            for (int i26 = 0; i26 < i24; i26++) {
                                                l1.p pVar4 = (l1.p) eVar3.A[i26];
                                                if (!j0Var2.c(pVar4) && !list.contains(pVar4)) {
                                                    list.add(pVar4);
                                                    i25++;
                                                } else if (i25 > 0) {
                                                    Object[] objArr6 = eVar3.A;
                                                    objArr6[i26 - i25] = objArr6[i26];
                                                }
                                            }
                                            int i27 = i24 - i25;
                                            Arrays.fill(eVar3.A, i27, i24, (Object) null);
                                            eVar3.C = i27;
                                        } catch (Throwable th14) {
                                            throw th14;
                                        }
                                    }
                                }
                                if (list.isEmpty()) {
                                    try {
                                        l1.w1.j(list2, x1Var);
                                        while (!list2.isEmpty()) {
                                            List listL = x1Var.L(list2, j0Var);
                                            j0Var3.getClass();
                                            Iterator it = listL.iterator();
                                            while (it.hasNext()) {
                                                j0Var3.j(it.next());
                                            }
                                            l1.w1.j(list2, x1Var);
                                        }
                                    } catch (Throwable th15) {
                                        x1Var.N(th15, null);
                                        l1.w1.i(x1Var, list, list2, list3, j0Var3, j0Var4, j0Var, j0Var2);
                                    }
                                }
                                pVar = null;
                            } catch (Throwable th16) {
                                try {
                                    x1Var.N(th16, null);
                                    l1.w1.i(x1Var, list, list2, list3, j0Var3, j0Var4, j0Var, j0Var2);
                                    list.clear();
                                } catch (Throwable th17) {
                                    list.clear();
                                    throw th17;
                                }
                            }
                        }
                        Trace.endSection();
                        return g00.b0.a;
                    }
                } catch (Throwable th18) {
                    Trace.endSection();
                    throw th18;
                }
            default:
                AuthAnalytics authAnalytics = (AuthAnalytics) this.B;
                hp.b bVar = (hp.b) this.C;
                a40.z zVar = (a40.z) this.D;
                m6 m6Var = (m6) this.E;
                Context context = (Context) this.F;
                xo.e eVar4 = (xo.e) this.G;
                rp.o oVar = (rp.o) this.H;
                ol.b bVar2 = (ol.b) this.I;
                xo.a aVar = (xo.a) this.J;
                ep.e eVar5 = (ep.e) obj;
                kotlin.jvm.internal.m.e(eVar5, "method");
                authAnalytics.authProviderSelected(eVar5);
                int iOrdinal = eVar5.ordinal();
                if (iOrdinal == 0) {
                    a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new bt.x0(m6Var, bVar, context, aVar, oVar, authAnalytics, eVar5, bVar2, (k00.c) null), 3);
                } else if (iOrdinal == 1) {
                    a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new bt.x0(m6Var, bVar, context, eVar4, oVar, authAnalytics, eVar5, bVar2, (k00.c) null), 3);
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d40.p1 p1Var = bVar.a;
                    dp.a aVar2 = dp.a.a;
                    p1Var.getClass();
                    p1Var.k((Object) null, aVar2);
                }
                return g00.b0.a;
        }
    }
}
