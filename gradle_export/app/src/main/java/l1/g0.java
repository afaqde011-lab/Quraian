package l1;

import android.os.Trace;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.internal.measurement.y3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class g0 implements j {
    public int A;
    public int B;
    public boolean C;
    public final f0 D;
    public final ArrayList E;
    public boolean F;
    public o1.g G;
    public o1.h H;
    public o1.k I;
    public boolean J;
    public m1 K;
    public p1.a L;
    public final p1.b M;
    public o1.b N;
    public p1.c O;
    public d2 P;
    public final a2.e Q;
    public final k00.i R;
    public boolean S;
    public long T;
    public h0 U;

    public final a30.x f9842a;

    public final n f9843b;

    public final o1.h f9844c;

    public final u.l0 f9845d;

    public final p1.a f9846e;

    public final p1.a f9847f;

    public final gi.c f9848g;

    public final p f9849h;

    public i0 f9851j;

    public int f9852k;
    public int l;
    public int m;

    public int[] f9854o;

    public u.u f9855p;

    public boolean f9856q;

    public boolean f9857r;

    public u.w f9861v;

    public boolean f9862w;

    public boolean f9864y;

    public final ArrayList f9850i = new ArrayList();

    public final a1.c1 f9853n = new a1.c1(2, false);

    public final ArrayList f9858s = new ArrayList();

    public final a1.c1 f9859t = new a1.c1(2, false);

    public m1 f9860u = v1.h.D;

    public final a1.c1 f9863x = new a1.c1(2, false);

    public int f9865z = -1;

    public g0(a30.x xVar, n nVar, o1.h hVar, u.l0 l0Var, p1.a aVar, p1.a aVar2, gi.c cVar, p pVar) {
        this.f9842a = xVar;
        this.f9843b = nVar;
        this.f9844c = hVar;
        this.f9845d = l0Var;
        this.f9846e = aVar;
        this.f9847f = aVar2;
        this.f9848g = cVar;
        this.f9849h = pVar;
        this.C = nVar.g() || nVar.e();
        this.D = new f0(this, 0);
        this.E = new ArrayList();
        o1.g gVarI = hVar.i();
        gVarI.c();
        this.G = gVarI;
        o1.h hVar2 = new o1.h();
        if (nVar.g()) {
            hVar2.c();
        }
        if (nVar.e()) {
            hVar2.K = new u.w();
        }
        this.H = hVar2;
        o1.k kVarK = hVar2.k();
        kVarK.e(true);
        this.I = kVarK;
        this.M = new p1.b(this, aVar);
        o1.g gVarI2 = this.H.i();
        try {
            o1.b bVarA = gVarI2.a(0);
            gVarI2.c();
            this.N = bVarA;
            this.O = new p1.c();
            this.Q = new a2.e(this);
            k00.i iVarK = nVar.k();
            k00.j jVarB = B();
            this.R = iVarK.plus(jVarB == null ? k00.j.A : jVarB);
        } catch (Throwable th2) {
            gVarI2.c();
            throw th2;
        }
    }

    public static final t0 P(int i10, g0 g0Var) {
        ArrayList arrayList;
        int i11 = g0Var.G.i(i10);
        o1.g gVar = g0Var.G;
        Object objP = gVar.p(gVar.f11479b, i10);
        if (i11 != 126665345 || !(objP instanceof r0)) {
            return null;
        }
        if (g0Var.G.d(i10)) {
            ArrayList arrayList2 = new ArrayList();
            Q(g0Var, arrayList2, i10);
            if (arrayList2.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = arrayList2;
            }
        } else {
            arrayList = null;
        }
        o1.g gVar2 = g0Var.G;
        Object objP2 = gVar2.p(gVar2.f11479b, i10);
        kotlin.jvm.internal.m.c(objP2, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        r0 r0Var = (r0) objP2;
        Object objH = g0Var.G.h(i10, 0);
        o1.b bVarA = g0Var.G.a(i10);
        int i12 = g0Var.G.f11479b[(i10 * 5) + 3] + i10;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = g0Var.f9858s;
        int iS = q.s(i10, arrayList4);
        if (iS < 0) {
            iS = -(iS + 1);
        }
        while (iS < arrayList4.size()) {
            l0 l0Var = (l0) arrayList4.get(iS);
            if (l0Var.f9897b >= i12) {
                break;
            }
            arrayList3.add(new g00.k(l0Var.f9896a, l0Var.f9898c));
            iS++;
        }
        return new t0(r0Var, objH, g0Var.f9849h, g0Var.f9844c, bVarA, arrayList3, g0Var.n(i10), arrayList);
    }

    public static final void Q(g0 g0Var, ArrayList arrayList, int i10) {
        int i11 = g0Var.G.f11479b[(i10 * 5) + 3] + i10;
        int i12 = i10 + 1;
        while (i12 < i11) {
            if (g0Var.G.j(i12)) {
                t0 t0VarP = P(i12, g0Var);
                if (t0VarP != null) {
                    arrayList.add(t0VarP);
                }
            } else if (g0Var.G.d(i12)) {
                Q(g0Var, arrayList, i12);
            }
            i12 += g0Var.G.f11479b[(i12 * 5) + 3];
        }
    }

    public static final int R(g0 g0Var, int i10, int i11, boolean z10, int i12) {
        int i13;
        long[] jArr;
        Object[] objArr;
        int i14;
        int i15;
        o1.g gVar = g0Var.G;
        n nVar = g0Var.f9843b;
        p1.b bVar = g0Var.M;
        boolean zJ = gVar.j(i11);
        int[] iArr = gVar.f11479b;
        int i16 = 0;
        if (zJ) {
            int i17 = gVar.i(i11);
            Object objP = gVar.p(iArr, i11);
            if (i17 == 126665345 && (objP instanceof r0)) {
                t0 t0VarP = P(i11, g0Var);
                if (t0VarP != null) {
                    nVar.c(t0VarP);
                    bVar.e();
                    p pVar = g0Var.f9849h;
                    n nVar2 = g0Var.f9843b;
                    p1.l0 l0Var = bVar.f12247b.f12244a;
                    l0Var.m0(p1.w.f12297d);
                    kh.n.b0(l0Var, pVar, nVar2, t0VarP);
                }
                if (!z10 || i11 == i10) {
                    return gVar.o(i11);
                }
                bVar.c();
                bVar.b();
                g0 g0Var2 = bVar.f12246a;
                int iO = g0Var2.G.l(i11) ? 1 : g0Var2.G.o(i11);
                if (iO > 0) {
                    bVar.f(i12, iO);
                }
                return 0;
            }
            if (i17 == 206 && kotlin.jvm.internal.m.a(objP, l.f9895e)) {
                Object objH = gVar.h(i11, 0);
                z1 z1Var = objH instanceof z1 ? (z1) objH : null;
                y1 y1VarA = z1Var != null ? z1Var.a() : null;
                d0 d0Var = y1VarA instanceof d0 ? (d0) y1VarA : null;
                if (d0Var != null) {
                    u.j0 j0Var = d0Var.A.f9836e;
                    Object[] objArr2 = j0Var.f14865b;
                    long[] jArr2 = j0Var.f14864a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i18 = 0;
                        while (true) {
                            long j9 = jArr2[i18];
                            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i19 = 8;
                                int i20 = 8 - ((~(i18 - length)) >>> 31);
                                int i21 = i16;
                                while (i21 < i20) {
                                    if ((255 & j9) < 128) {
                                        g0 g0Var3 = (g0) objArr2[(i18 << 3) + i21];
                                        p1.b bVar2 = g0Var3.M;
                                        p pVar2 = g0Var3.f9849h;
                                        o1.h hVar = g0Var3.f9844c;
                                        if (hVar.B <= 0 || (hVar.A[1] & 67108864) == 0) {
                                            i15 = 0;
                                        } else {
                                            synchronized (pVar2.D) {
                                                pVar2.r();
                                                u.i0 i0Var = pVar2.N;
                                                pVar2.N = va.a.n();
                                                try {
                                                    pVar2.V.j0(i0Var);
                                                } catch (Throwable th2) {
                                                    pVar2.N = i0Var;
                                                    throw th2;
                                                }
                                            }
                                            p1.a aVar = new p1.a();
                                            g0Var3.L = aVar;
                                            o1.g gVarI = hVar.i();
                                            try {
                                                g0Var3.G = gVarI;
                                                p1.a aVar2 = bVar2.f12247b;
                                                try {
                                                    bVar2.f12247b = aVar;
                                                    g0Var3.O(0);
                                                    bVar2.b();
                                                    if (bVar2.f12248c) {
                                                        bVar2.f12247b.f12244a.m0(p1.d0.f12262d);
                                                        if (bVar2.f12248c) {
                                                            i15 = 0;
                                                            bVar2.d(false);
                                                            bVar2.d(false);
                                                            bVar2.f12247b.f12244a.m0(p1.m.f12283d);
                                                            bVar2.f12248c = false;
                                                        } else {
                                                            i15 = 0;
                                                        }
                                                    } else {
                                                        i15 = 0;
                                                    }
                                                    bVar2.f12247b = aVar2;
                                                    gVarI.c();
                                                } catch (Throwable th3) {
                                                    bVar2.f12247b = aVar2;
                                                    throw th3;
                                                }
                                            } catch (Throwable th4) {
                                                gVarI.c();
                                                throw th4;
                                            }
                                        }
                                        nVar.u(pVar2);
                                    } else {
                                        jArr2 = jArr2;
                                        objArr2 = objArr2;
                                        i15 = i16;
                                    }
                                    j9 >>= i19;
                                    i21++;
                                    jArr2 = jArr2;
                                    i16 = i15;
                                    objArr2 = objArr2;
                                    i19 = i19;
                                }
                                jArr = jArr2;
                                objArr = objArr2;
                                int i22 = i19;
                                i14 = i16;
                                if (i20 != i22) {
                                    break;
                                }
                            } else {
                                jArr = jArr2;
                                objArr = objArr2;
                                i14 = i16;
                            }
                            if (i18 == length) {
                                break;
                            }
                            i18++;
                            jArr2 = jArr;
                            i16 = i14;
                            objArr2 = objArr;
                        }
                    }
                }
                return gVar.o(i11);
            }
            i13 = 1;
            if (!gVar.l(i11)) {
                return gVar.o(i11);
            }
        } else {
            i13 = 1;
            if (gVar.d(i11)) {
                int i23 = iArr[(i11 * 5) + 3] + i11;
                int iR = 0;
                for (int i24 = i11 + 1; i24 < i23; i24 += iArr[(i24 * 5) + 3]) {
                    boolean zL = gVar.l(i24);
                    if (zL) {
                        bVar.c();
                        Object objN = gVar.n(i24);
                        bVar.c();
                        bVar.f12253h.add(objN);
                    }
                    iR += R(g0Var, i10, i24, zL || z10, zL ? 0 : i12 + iR);
                    if (zL) {
                        bVar.c();
                        bVar.a();
                    }
                }
                if (!gVar.l(i11)) {
                    return iR;
                }
            } else if (!gVar.l(i11)) {
                return gVar.o(i11);
            }
        }
        return i13;
    }

    public final boolean A() {
        if (!C() || this.f9862w) {
            return true;
        }
        r1 r1VarZ = z();
        return (r1VarZ == null || (r1VarZ.f9919b & 4) == 0) ? false : true;
    }

    public final a2.e B() {
        if (this.f9843b.l()) {
            return this.Q;
        }
        return null;
    }

    public final boolean C() {
        r1 r1VarZ;
        return (this.S || this.f9864y || this.f9862w || (r1VarZ = z()) == null || (r1VarZ.f9919b & 8) != 0) ? false : true;
    }

    public final void D(ArrayList arrayList) {
        s0 s0Var;
        n nVar;
        o1.b bVar;
        o1.b bVarQ;
        ArrayList arrayList2;
        o1.g gVarI;
        o1.g gVarI2;
        o1.g gVar;
        o1.g gVar2;
        int[] iArr;
        u.w wVar;
        int[] iArr2;
        u.w wVar2;
        p1.a aVar;
        p1.a aVar2;
        boolean z10;
        boolean z11;
        p1.a aVar3;
        o1.h hVar;
        ?? r4;
        o1.g gVar3;
        g0 g0Var = this;
        o1.h hVar2 = g0Var.f9844c;
        n nVar2 = g0Var.f9843b;
        p1.a aVar4 = g0Var.f9847f;
        p1.b bVar2 = g0Var.M;
        p1.a aVar5 = bVar2.f12247b;
        try {
            bVar2.f12247b = aVar4;
            aVar4.f12244a.m0(p1.b0.f12257d);
            int size = arrayList.size();
            int i10 = 0;
            g0 g0Var2 = g0Var;
            while (i10 < size) {
                g00.k kVar = (g00.k) arrayList.get(i10);
                t0 t0Var = (t0) kVar.A;
                t0 t0Var2 = (t0) kVar.B;
                o1.b bVarQ2 = y3.q(t0Var.f9934e);
                o1.h hVarD = o1.j.d(t0Var.f9933d);
                int iA = hVarD.a(bVarQ2);
                v1.e eVar = new v1.e();
                bVar2.b();
                p1.l0 l0Var = bVar2.f12247b.f12244a;
                l0Var.m0(p1.j.f12273d);
                kh.n.a0(l0Var, 0, eVar, 1, bVarQ2);
                if (t0Var2 == null) {
                    if (hVarD.equals(g0Var2.H)) {
                        if (!g0Var2.I.f11510w) {
                            l.a("Check failed");
                        }
                        g0Var2.x();
                    }
                    o1.g gVarI3 = hVarD.i();
                    try {
                        gVarI3.r(iA);
                        bVar2.f12251f = iA;
                        p1.a aVar6 = new p1.a();
                        ct.m mVar = new ct.m(g0Var2, aVar6, gVarI3, t0Var, 7);
                        gVar3 = gVarI3;
                        try {
                            g0 g0Var3 = this;
                            g0Var3.I(null, null, null, h00.x.A, mVar);
                            p1.a aVar7 = bVar2.f12247b;
                            aVar7.getClass();
                            if (!aVar6.f12244a.l0()) {
                                p1.l0 l0Var2 = aVar7.f12244a;
                                l0Var2.m0(p1.f.f12265d);
                                kh.n.a0(l0Var2, 0, aVar6, 1, eVar);
                            }
                            gVar3.c();
                            nVar = nVar2;
                            size = size;
                            r4 = g0Var3;
                        } catch (Throwable th2) {
                            th = th2;
                            gVar3.c();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        gVar3 = gVarI3;
                    }
                } else {
                    s0 s0VarP = nVar2.p(t0Var2);
                    o1.h hVarD2 = (s0VarP == null || (hVar = s0VarP.f9927a) == null) ? null : o1.j.d(hVar);
                    o1.h hVarD3 = hVarD2 == null ? o1.j.d(t0Var2.f9933d) : hVarD2;
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (hVarD2 != null) {
                                                                    s0Var = s0VarP;
                                                                    if (hVarD2.G) {
                                                                        l.a("use active SlotWriter to create an anchor location instead");
                                                                    }
                                                                    if (hVarD2.B <= 0) {
                                                                        n1.a("Parameter index is out of range");
                                                                    }
                                                                    ArrayList arrayList3 = hVarD2.I;
                                                                    nVar = nVar2;
                                                                    int iE = o1.j.e(arrayList3, 0, hVarD2.B);
                                                                    if (iE < 0) {
                                                                        bVar = new o1.b(0);
                                                                        arrayList3.add(-(iE + 1), bVar);
                                                                    } else {
                                                                        bVar = (o1.b) arrayList3.get(iE);
                                                                    }
                                                                    if (bVar != null) {
                                                                    }
                                                                    bVarQ = y3.q(bVar);
                                                                    arrayList2 = new ArrayList();
                                                                    gVarI = hVarD3.i();
                                                                    q.n(gVarI, arrayList2, hVarD3.a(bVarQ));
                                                                    gVarI.c();
                                                                    if (arrayList2.isEmpty()) {
                                                                        bVarQ = bVarQ;
                                                                    } else {
                                                                        aVar3 = bVar2.f12247b;
                                                                        aVar3.getClass();
                                                                        if (!arrayList2.isEmpty()) {
                                                                            p1.l0 l0Var3 = aVar3.f12244a;
                                                                            l0Var3.m0(p1.g.f12267d);
                                                                            kh.n.a0(l0Var3, 1, arrayList2, 0, eVar);
                                                                        }
                                                                        if (hVarD.equals(hVar2)) {
                                                                            int iA2 = hVar2.a(bVarQ2);
                                                                            g0Var2.k0(iA2, g0Var2.p0(iA2) + arrayList2.size());
                                                                        }
                                                                    }
                                                                    p1.l0 l0Var4 = bVar2.f12247b.f12244a;
                                                                    l0Var4.m0(p1.h.f12269d);
                                                                    int i11 = l0Var4.f12282f - l0Var4.f12277a[l0Var4.f12278b - 1].c;
                                                                    Object[] objArr = l0Var4.f12281e;
                                                                    objArr[i11] = s0Var;
                                                                    objArr[i11 + 1] = nVar;
                                                                    objArr[i11 + 3] = t0Var;
                                                                    objArr[i11 + 2] = t0Var2;
                                                                    gVarI2 = hVarD3.i();
                                                                    gVar2 = g0Var2.G;
                                                                    iArr = g0Var2.f9854o;
                                                                    wVar = g0Var2.f9861v;
                                                                    g0Var2.f9854o = null;
                                                                    g0Var2.f9861v = null;
                                                                    g0Var2.G = gVarI2;
                                                                    int iA3 = hVarD3.a(y3.q(bVarQ));
                                                                    gVarI2.r(iA3);
                                                                    bVar2.f12251f = iA3;
                                                                    aVar = new p1.a();
                                                                    aVar2 = bVar2.f12247b;
                                                                    bVar2.f12247b = aVar;
                                                                    z10 = bVar2.f12250e;
                                                                    iArr2 = iArr;
                                                                    bVar2.f12250e = false;
                                                                    p pVar = t0Var2.f9932c;
                                                                    p pVar2 = t0Var.f9932c;
                                                                    Integer numValueOf = Integer.valueOf(gVarI2.f11484g);
                                                                    iArr2 = iArr2;
                                                                    z11 = z10;
                                                                    gVar = gVarI2;
                                                                    wVar2 = wVar;
                                                                    aVar2 = aVar2;
                                                                    g0Var2.I(pVar, pVar2, numValueOf, t0Var2.f9935f, new a1.o1(g0Var2, t0Var, 26));
                                                                    bVar2.f12250e = z11;
                                                                    bVar2.f12247b = aVar2;
                                                                    aVar2.getClass();
                                                                    if (!aVar.f12244a.l0()) {
                                                                        p1.l0 l0Var5 = aVar2.f12244a;
                                                                        l0Var5.m0(p1.f.f12265d);
                                                                        kh.n.a0(l0Var5, 0, aVar, 1, eVar);
                                                                    }
                                                                    g0Var2.G = gVar2;
                                                                    g0Var2.f9854o = iArr2;
                                                                    g0Var2.f9861v = wVar2;
                                                                    gVar.c();
                                                                    r4 = g0Var2;
                                                                } else {
                                                                    s0Var = s0VarP;
                                                                    nVar = nVar2;
                                                                    size = size;
                                                                }
                                                                g0Var2.G = gVar2;
                                                                g0Var2.f9854o = iArr2;
                                                                g0Var2.f9861v = wVar2;
                                                                gVar.c();
                                                                r4 = g0Var2;
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                gVar.c();
                                                                throw th;
                                                            }
                                                            bVar2.f12247b = aVar2;
                                                            aVar2.getClass();
                                                            if (!aVar.f12244a.l0()) {
                                                                p1.l0 l0Var6 = aVar2.f12244a;
                                                                l0Var6.m0(p1.f.f12265d);
                                                                kh.n.a0(l0Var6, 0, aVar, 1, eVar);
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            g0Var2.G = gVar2;
                                                            g0Var2.f9854o = iArr2;
                                                            g0Var2.f9861v = wVar2;
                                                            throw th;
                                                        }
                                                        bVar2.f12250e = z11;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        bVar2.f12247b = aVar2;
                                                        throw th;
                                                    }
                                                    g0Var2.I(pVar, pVar2, numValueOf, t0Var2.f9935f, new a1.o1(g0Var2, t0Var, 26));
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    bVar2.f12250e = z11;
                                                    throw th;
                                                }
                                                iArr2 = iArr2;
                                                z11 = z10;
                                                gVar = gVarI2;
                                                wVar2 = wVar;
                                                aVar2 = aVar2;
                                            } catch (Throwable th8) {
                                                th = th8;
                                                z11 = z10;
                                                gVar = gVarI2;
                                                wVar2 = wVar;
                                                bVar2.f12250e = z11;
                                                throw th;
                                            }
                                            p pVar3 = t0Var.f9932c;
                                            Integer numValueOf2 = Integer.valueOf(gVarI2.f11484g);
                                        } catch (Throwable th9) {
                                            th = th9;
                                            z11 = z10;
                                        }
                                        bVar2.f12250e = false;
                                        p pVar4 = t0Var2.f9932c;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        aVar2 = aVar2;
                                        z11 = z10;
                                        iArr2 = iArr2;
                                        gVar = gVarI2;
                                        wVar2 = wVar;
                                    }
                                    bVar2.f12247b = aVar;
                                    z10 = bVar2.f12250e;
                                    iArr2 = iArr;
                                } catch (Throwable th11) {
                                    th = th11;
                                    iArr2 = iArr;
                                    aVar2 = aVar2;
                                    gVar = gVarI2;
                                    wVar2 = wVar;
                                }
                                g0Var2.G = gVarI2;
                                int iA4 = hVarD3.a(y3.q(bVarQ));
                                gVarI2.r(iA4);
                                bVar2.f12251f = iA4;
                                aVar = new p1.a();
                                aVar2 = bVar2.f12247b;
                            } catch (Throwable th12) {
                                th = th12;
                                iArr2 = iArr;
                                gVar = gVarI2;
                                wVar2 = wVar;
                            }
                            gVar2 = g0Var2.G;
                            iArr = g0Var2.f9854o;
                            wVar = g0Var2.f9861v;
                            g0Var2.f9854o = null;
                            g0Var2.f9861v = null;
                        } catch (Throwable th13) {
                            th = th13;
                            gVar = gVarI2;
                        }
                        q.n(gVarI, arrayList2, hVarD3.a(bVarQ));
                        gVarI.c();
                        if (arrayList2.isEmpty()) {
                            aVar3 = bVar2.f12247b;
                            aVar3.getClass();
                            if (!arrayList2.isEmpty()) {
                                p1.l0 l0Var7 = aVar3.f12244a;
                                l0Var7.m0(p1.g.f12267d);
                                kh.n.a0(l0Var7, 1, arrayList2, 0, eVar);
                            }
                            if (hVarD.equals(hVar2)) {
                                int iA5 = hVar2.a(bVarQ2);
                                g0Var2.k0(iA5, g0Var2.p0(iA5) + arrayList2.size());
                            }
                        } else {
                            bVarQ = bVarQ;
                        }
                        p1.l0 l0Var8 = bVar2.f12247b.f12244a;
                        l0Var8.m0(p1.h.f12269d);
                        int i12 = l0Var8.f12282f - l0Var8.f12277a[l0Var8.f12278b - 1].c;
                        Object[] objArr2 = l0Var8.f12281e;
                        objArr2[i12] = s0Var;
                        objArr2[i12 + 1] = nVar;
                        objArr2[i12 + 3] = t0Var;
                        objArr2[i12 + 2] = t0Var2;
                        gVarI2 = hVarD3.i();
                    } catch (Throwable th14) {
                        gVarI.c();
                        throw th14;
                    }
                    bVar = t0Var2.f9934e;
                    bVarQ = y3.q(bVar);
                    arrayList2 = new ArrayList();
                    gVarI = hVarD3.i();
                }
                bVar2.f12247b.f12244a.m0(p1.d0.f12262d);
                i10++;
                hVar2 = hVar2;
                nVar2 = nVar;
                size = size;
                g0Var2 = r4;
            }
            bVar2.b();
            bVar2.f12247b.f12244a.m0(p1.n.f12284d);
            bVar2.f12251f = 0;
            bVar2.f12247b = aVar5;
        } catch (Throwable th15) {
            bVar2.f12247b = aVar5;
            throw th15;
        }
    }

    public final void E(r0 r0Var, m1 m1Var, Object obj, boolean z10) {
        Z(126665345, r0Var);
        F();
        o0(obj);
        long j9 = this.T;
        try {
            this.T = 126665345;
            if (this.S) {
                o1.k.z(this.I);
            }
            boolean z11 = (this.S || kotlin.jvm.internal.m.a(this.G.f(), m1Var)) ? false : true;
            if (z11) {
                L(m1Var);
            }
            W(l.f9893c, MediaError.DetailedErrorCode.MEDIAKEYS_UNSUPPORTED, 0, m1Var);
            this.K = null;
            if (!this.S || z10) {
                boolean z12 = this.f9862w;
                this.f9862w = z11;
                v1.d.c(this, new v1.c(new a1.y1(r0Var, obj), -59194059, true));
                this.f9862w = z12;
            } else {
                this.J = true;
                o1.k kVar = this.I;
                this.f9843b.m(new t0(r0Var, obj, this.f9849h, this.H, kVar.b(kVar.G(kVar.f11491b, kVar.f11509v)), h00.x.A, m(), null));
            }
            r(false);
            this.K = null;
            this.T = j9;
            r(false);
        } catch (Throwable th2) {
            try {
                ab.a0.H0(th2, new c0(1, this));
                throw th2;
            } catch (Throwable th3) {
                r(false);
                this.K = null;
                this.T = j9;
                r(false);
                throw th3;
            }
        }
    }

    public final Object F() {
        boolean z10 = this.S;
        c cVar = i.f9868a;
        if (!z10) {
            Object objM = this.G.m();
            if (!this.f9864y || (objM instanceof c2)) {
                return objM;
            }
        } else if (this.f9857r) {
            l.a("A call to createNode(), emitNode() or useNode() expected");
            return cVar;
        }
        return cVar;
    }

    public final List G() {
        n nVar = this.f9843b;
        m mVarI = nVar.i();
        p pVar = mVarI instanceof p ? (p) mVarI : null;
        if (pVar != null) {
            o1.h hVar = pVar.F;
            o1.g gVarI = o1.j.d(hVar).i();
            try {
                Integer numX = a10.h0.x(gVarI, nVar, 0, gVarI.f11480c);
                gVarI.c();
                if (numX != null) {
                    o1.g gVarI2 = o1.j.d(hVar).i();
                    try {
                        return h00.q.Y0(pVar.V.G(), a10.h0.V(gVarI2, numX.intValue(), 0));
                    } finally {
                        gVarI2.c();
                    }
                }
            } catch (Throwable th2) {
                gVarI.c();
                throw th2;
            }
        }
        return h00.x.A;
    }

    public final int H(int i10) {
        int iQ = this.G.q(i10) + 1;
        int i11 = 0;
        while (iQ < i10) {
            if (!this.G.k(iQ)) {
                i11++;
            }
            iQ += this.G.f11479b[(iQ * 5) + 3];
        }
        return i11;
    }

    public final Object I(p pVar, p pVar2, Integer num, List list, u00.a aVar) {
        Object objInvoke;
        boolean z10 = this.F;
        int i10 = this.f9852k;
        try {
            this.F = true;
            this.f9852k = 0;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                g00.k kVar = (g00.k) list.get(i11);
                r1 r1Var = (r1) kVar.A;
                Object obj = kVar.B;
                if (obj != null) {
                    i0(r1Var, obj);
                } else {
                    i0(r1Var, null);
                }
            }
            if (pVar == null) {
                objInvoke = aVar.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (pVar2 == null || pVar2.equals(pVar) || iIntValue < 0) {
                    objInvoke = aVar.invoke();
                } else {
                    pVar.R = pVar2;
                    pVar.S = iIntValue;
                    try {
                        objInvoke = aVar.invoke();
                        pVar.R = null;
                        pVar.S = 0;
                    } catch (Throwable th2) {
                        pVar.R = null;
                        pVar.S = 0;
                        throw th2;
                    }
                }
                if (objInvoke == null) {
                    objInvoke = aVar.invoke();
                }
            }
            this.F = z10;
            this.f9852k = i10;
            return objInvoke;
        } catch (Throwable th3) {
            this.F = z10;
            this.f9852k = i10;
            throw th3;
        }
    }

    public final void J() {
        throw new UnsupportedOperationException("Method not decompiled: l1.g0.J():void");
    }

    public final void K() {
        O(this.G.f11484g);
        p1.b bVar = this.M;
        bVar.d(false);
        bVar.e();
        bVar.f12247b.f12244a.m0(p1.z.f12300d);
        int i10 = bVar.f12251f;
        o1.g gVar = bVar.f12246a.G;
        bVar.f12251f = gVar.f11479b[(gVar.f11484g * 5) + 3] + i10;
    }

    public final void L(m1 m1Var) {
        u.w wVar = this.f9861v;
        if (wVar == null) {
            wVar = new u.w();
            this.f9861v = wVar;
        }
        wVar.i(this.G.f11484g, m1Var);
    }

    public final void M(int i10, int i11, int i12) {
        o1.g gVar = this.G;
        if (i10 == i11) {
            i12 = i10;
        } else if (i10 != i12 && i11 != i12) {
            if (gVar.q(i10) == i11) {
                i12 = i11;
            } else if (gVar.q(i11) == i10) {
                i12 = i10;
            } else if (gVar.q(i10) == gVar.q(i11)) {
                i12 = gVar.q(i10);
            } else {
                int iQ = i10;
                int i13 = 0;
                while (iQ > 0 && iQ != i12) {
                    iQ = gVar.q(iQ);
                    i13++;
                }
                int iQ2 = i11;
                int i14 = 0;
                while (iQ2 > 0 && iQ2 != i12) {
                    iQ2 = gVar.q(iQ2);
                    i14++;
                }
                int i15 = i13 - i14;
                int iQ3 = i10;
                for (int i16 = 0; i16 < i15; i16++) {
                    iQ3 = gVar.q(iQ3);
                }
                int i17 = i14 - i13;
                int iQ4 = i11;
                for (int i18 = 0; i18 < i17; i18++) {
                    iQ4 = gVar.q(iQ4);
                }
                i12 = iQ3;
                for (int iQ5 = iQ4; i12 != iQ5; iQ5 = gVar.q(iQ5)) {
                    i12 = gVar.q(i12);
                }
            }
        }
        while (i10 > 0 && i10 != i12) {
            if (gVar.l(i10)) {
                this.M.a();
            }
            i10 = gVar.q(i10);
        }
        q(i11, i12);
    }

    public final Object N() {
        boolean z10 = this.S;
        c cVar = i.f9868a;
        if (!z10) {
            Object objM = this.G.m();
            if (!this.f9864y || (objM instanceof c2)) {
                return objM instanceof z1 ? ((z1) objM).a() : objM;
            }
        } else if (this.f9857r) {
            l.a("A call to createNode(), emitNode() or useNode() expected");
            return cVar;
        }
        return cVar;
    }

    public final void O(int i10) {
        boolean zL = this.G.l(i10);
        p1.b bVar = this.M;
        if (zL) {
            bVar.c();
            Object objN = this.G.n(i10);
            bVar.c();
            bVar.f12253h.add(objN);
        }
        R(this, i10, i10, zL, 0);
        bVar.c();
        if (zL) {
            bVar.a();
        }
    }

    public final boolean S(int i10, boolean z10) {
        r1 r1VarZ;
        if ((i10 & 1) == 0 && (this.S || this.f9864y)) {
            d2 d2Var = this.P;
            if (d2Var == null || (r1VarZ = z()) == null || !d2Var.c() || (r1VarZ.f9919b & 512) != 0) {
                return true;
            }
            r1VarZ.f();
            boolean z11 = this.f9864y;
            int i11 = r1VarZ.f9919b;
            r1VarZ.f9919b = (z11 ? i11 | Cast.MAX_NAMESPACE_LENGTH : i11 & (-129)) | 256;
            p1.l0 l0Var = this.M.f12247b.f12244a;
            l0Var.m0(p1.y.f12299d);
            kh.n.Z(l0Var, 0, r1VarZ);
            this.f9843b.t(r1VarZ);
            return false;
        }
        if (!z10 && C()) {
            return false;
        }
        return true;
    }

    public final void T() {
        int i10;
        long jRotateLeft;
        long jRotateLeft2;
        if (this.f9858s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        o1.g gVar = this.G;
        int iG = gVar.g();
        int[] iArr = gVar.f11479b;
        int i11 = gVar.f11484g;
        Object objP = i11 < gVar.f11485h ? gVar.p(iArr, i11) : null;
        Object objF = gVar.f();
        int i12 = this.m;
        c cVar = i.f9868a;
        if (objP == null) {
            if (objF == null || iG != 207 || objF.equals(cVar)) {
                jRotateLeft2 = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) iG), 3) ^ ((long) i12);
            } else {
                this.T = Long.rotateLeft(((long) objF.hashCode()) ^ Long.rotateLeft(this.T, 3), 3) ^ ((long) i12);
            }
            b0(null, (iArr[(gVar.f11484g * 5) + 1] & 1073741824) != 0);
            J();
            gVar.e();
            if (objP != null) {
                if (objP instanceof Enum) {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) objP.hashCode()), 3);
                }
            }
            if (objF == null && iG == 207 && !objF.equals(cVar)) {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i12), 3) ^ ((long) objF.hashCode()), 3);
                return;
            } else {
                this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i12), 3), 3);
            }
        }
        if (objP instanceof Enum) {
            jRotateLeft = Long.rotateLeft(((long) ((Enum) objP).ordinal()) ^ Long.rotateLeft(this.T, 3), 3);
            i10 = 0;
        } else {
            i10 = 0;
            jRotateLeft = Long.rotateLeft(((long) objP.hashCode()) ^ Long.rotateLeft(this.T, 3), 3);
        }
        jRotateLeft2 = jRotateLeft ^ ((long) i10);
        this.T = jRotateLeft2;
        b0(null, (iArr[(gVar.f11484g * 5) + 1] & 1073741824) != 0);
        J();
        gVar.e();
        if (objP != null) {
            if (objF == null) {
            }
            this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i12), 3), 3);
        } else if (objP instanceof Enum) {
            this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) ((Enum) objP).ordinal()), 3);
        } else {
            this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) objP.hashCode()), 3);
        }
    }

    public final void U() {
        o1.g gVar = this.G;
        int i10 = gVar.f11486i;
        this.l = i10 >= 0 ? gVar.f11479b[(i10 * 5) + 1] & 67108863 : 0;
        gVar.t();
    }

    public final void V() {
        if (this.l != 0) {
            l.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        r1 r1VarZ = z();
        if (r1VarZ != null) {
            int i10 = r1VarZ.f9919b;
            if ((i10 & Cast.MAX_NAMESPACE_LENGTH) == 0) {
                r1VarZ.f9919b = i10 | 16;
            }
        }
        if (this.f9858s.isEmpty()) {
            U();
        } else {
            J();
        }
    }

    public final void W(Object obj, int i10, int i11, Object obj2) {
        long jRotateLeft;
        long j9;
        boolean z10;
        boolean z11;
        boolean z12;
        i0 i0Var;
        i0 i0Var2;
        ArrayList arrayList;
        u.w wVar;
        int i12;
        Object objValueOf;
        u.i0 i0Var3;
        Object objG;
        u.d0 d0Var;
        o1.k kVar;
        int i13;
        Object obj3;
        int i14;
        int i15;
        Object[] objArr;
        Object[] objArr2;
        int i16;
        int i17;
        o1.g gVar;
        int[] iArr;
        ArrayList arrayList2;
        int i18;
        int i19;
        int i20;
        o1.g gVar2;
        int i21;
        Object objP;
        o1.k kVar2;
        int i22;
        i0 i0Var4;
        Object obj4 = obj;
        if (this.f9857r) {
            l.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i23 = this.m;
        Object obj5 = i.f9868a;
        if (obj4 == null) {
            if (obj2 == null || i10 != 207 || obj2.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i10), 3);
                j9 = i23;
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i23);
            }
            if (obj4 == null) {
                this.m++;
            }
            if (i11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.S) {
                this.G.f11488k++;
                kVar2 = this.I;
                i22 = kVar2.f11507t;
                if (z10) {
                    kVar2.S(i10, obj5, obj5, true);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    kVar2.S(i10, obj4, obj2, false);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    kVar2.S(i10, obj4, obj5, false);
                }
                i0Var4 = this.f9851j;
                if (i0Var4 != null) {
                    int i24 = (-2) - i22;
                    o1.e eVar = new o1.e(-1, i10, i24, -1);
                    i0Var4.f9873e.i(i24, new n1.a(-1, this.f9852k - i0Var4.f9870b, 0));
                    i0Var4.f9872d.add(eVar);
                }
                w(z10, null);
                return;
            }
            if (i11 != 1 && this.f9864y) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f9851j == null) {
                int iG = this.G.g();
                if (!z11 && iG == i10) {
                    gVar2 = this.G;
                    i21 = gVar2.f11484g;
                    if (i21 < gVar2.f11485h) {
                        objP = gVar2.p(gVar2.f11479b, i21);
                    } else {
                        objP = null;
                    }
                    if (kotlin.jvm.internal.m.a(obj4, objP)) {
                        b0(obj2, z10);
                        z12 = z11;
                    }
                }
                gVar = this.G;
                iArr = gVar.f11479b;
                arrayList2 = new ArrayList();
                if (gVar.f11488k <= 0) {
                    i18 = gVar.f11484g;
                    while (i18 < gVar.f11485h) {
                        int i25 = i18 * 5;
                        int i26 = iArr[i25];
                        Object objP2 = gVar.p(iArr, i18);
                        i19 = iArr[i25 + 1];
                        if ((i19 & 1073741824) != 0) {
                            i20 = 1;
                        } else {
                            i20 = i19 & 67108863;
                        }
                        arrayList2.add(new o1.e(objP2, i26, i18, i20));
                        i18 += iArr[i25 + 3];
                        z11 = z11;
                    }
                }
                z12 = z11;
                this.f9851j = new i0(this.f9852k, arrayList2);
            } else {
                z12 = z11;
            }
            i0Var = this.f9851j;
            if (i0Var != null) {
                arrayList = i0Var.f9872d;
                wVar = i0Var.f9873e;
                i12 = i0Var.f9870b;
                if (obj4 != null) {
                    objValueOf = new n0(Integer.valueOf(i10), obj4);
                } else {
                    objValueOf = Integer.valueOf(i10);
                }
                i0Var3 = ((m1.a) i0Var.f9874f.getValue()).f10412a;
                objG = i0Var3.g(objValueOf);
                if (objG == null) {
                    objG = null;
                } else if (objG instanceof u.d0) {
                    d0Var = (u.d0) objG;
                    Object objK = d0Var.k(0);
                    if (d0Var.h()) {
                        i0Var3.k(objValueOf);
                    }
                    if (d0Var.f14838b == 1) {
                        i0Var3.m(objValueOf, d0Var.e());
                    }
                    objG = objK;
                } else {
                    i0Var3.k(objValueOf);
                }
                o1.e eVar2 = (o1.e) objG;
                if (!z12 || eVar2 == null) {
                    this.G.f11488k++;
                    this.S = true;
                    this.K = null;
                    if (this.I.f11510w) {
                        o1.k kVarK = this.H.k();
                        this.I = kVarK;
                        kVarK.O();
                        this.J = false;
                        this.K = null;
                    }
                    this.I.d();
                    kVar = this.I;
                    int i27 = kVar.f11507t;
                    if (z10) {
                        kVar.S(i10, obj5, obj5, true);
                        i13 = 0;
                    } else if (obj2 != null) {
                        if (obj != null) {
                            obj5 = obj;
                        }
                        i13 = 0;
                        kVar.S(i10, obj5, obj2, false);
                    } else {
                        i13 = 0;
                        if (obj == null) {
                            obj3 = obj5;
                        } else {
                            obj3 = obj;
                        }
                        kVar.S(i10, obj3, obj5, false);
                    }
                    this.N = this.I.b(i27);
                    int i28 = (-2) - i27;
                    o1.e eVar3 = new o1.e(-1, i10, i28, -1);
                    wVar.i(i28, new n1.a(-1, this.f9852k - i12, i13));
                    arrayList.add(eVar3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z10) {
                        i14 = i13;
                    } else {
                        i14 = this.f9852k;
                    }
                    i0Var2 = new i0(i14, arrayList3);
                } else {
                    int i29 = eVar2.f11474c;
                    arrayList.add(eVar2);
                    n1.a aVar = (n1.a) wVar.b(i29);
                    this.f9852k = (aVar != null ? aVar.f10999b : -1) + i12;
                    n1.a aVar2 = (n1.a) wVar.b(i29);
                    int i30 = aVar2 != null ? aVar2.f10998a : -1;
                    int i31 = i0Var.f9871c;
                    int i32 = i30 - i31;
                    int i33 = 8;
                    if (i30 <= i31) {
                        i15 = i32;
                        if (i31 > i30) {
                            Object[] objArr3 = wVar.f14873c;
                            long[] jArr = wVar.f14871a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i34 = 0;
                                while (true) {
                                    long j10 = jArr[i34];
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i35 = 8 - ((~(i34 - length)) >>> 31);
                                        int i36 = 0;
                                        while (i36 < i35) {
                                            if ((j10 & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                n1.a aVar3 = (n1.a) objArr3[(i34 << 3) + i36];
                                                int i37 = aVar3.f10998a;
                                                if (i37 == i30) {
                                                    aVar3.f10998a = i31;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i30 + 1 <= i37 && i37 < i31) {
                                                        aVar3.f10998a = i37 - 1;
                                                    }
                                                }
                                            }
                                            j10 >>= 8;
                                            i36++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i35 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i34 == length) {
                                        break;
                                    }
                                    i34++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = wVar.f14873c;
                        long[] jArr2 = wVar.f14871a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i38 = 0;
                            while (true) {
                                long j11 = jArr2[i38];
                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i39 = 8 - ((~(i38 - length2)) >>> 31);
                                    int i40 = 0;
                                    while (i40 < i39) {
                                        if ((j11 & 255) < 128) {
                                            i17 = i33;
                                            n1.a aVar4 = (n1.a) objArr4[(i38 << 3) + i40];
                                            i16 = i32;
                                            int i41 = aVar4.f10998a;
                                            if (i41 == i30) {
                                                aVar4.f10998a = i31;
                                            } else if (i31 <= i41 && i41 < i30) {
                                                aVar4.f10998a = i41 + 1;
                                            }
                                        } else {
                                            i16 = i32;
                                            i17 = i33;
                                        }
                                        j11 >>= i17;
                                        i40++;
                                        i32 = i16;
                                        i33 = i17;
                                    }
                                    i15 = i32;
                                    if (i39 != i33) {
                                        break;
                                    }
                                } else {
                                    i15 = i32;
                                }
                                if (i38 == length2) {
                                    break;
                                }
                                i38++;
                                i32 = i15;
                                i33 = 8;
                            }
                        } else {
                            i15 = i32;
                        }
                    }
                    p1.b bVar = this.M;
                    bVar.f12251f = (i29 - bVar.f12246a.G.f11484g) + bVar.f12251f;
                    this.G.r(i29);
                    if (i15 > 0) {
                        bVar.d(false);
                        bVar.e();
                        p1.l0 l0Var = bVar.f12247b.f12244a;
                        l0Var.m0(p1.u.f12295d);
                        l0Var.f12279c[l0Var.f12280d - l0Var.f12277a[l0Var.f12278b - 1].b] = i15;
                    }
                    b0(obj2, z10);
                    i0Var2 = null;
                }
            } else {
                i0Var2 = null;
            }
            w(z10, i0Var2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj4.hashCode())), 3);
        j9 = 0;
        this.T = jRotateLeft ^ j9;
        if (obj4 == null) {
            this.m++;
        }
        if (i11 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.S) {
            this.G.f11488k++;
            kVar2 = this.I;
            i22 = kVar2.f11507t;
            if (z10) {
                kVar2.S(i10, obj5, obj5, true);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                kVar2.S(i10, obj4, obj2, false);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                kVar2.S(i10, obj4, obj5, false);
            }
            i0Var4 = this.f9851j;
            if (i0Var4 != null) {
                int i210 = (-2) - i22;
                o1.e eVar4 = new o1.e(-1, i10, i210, -1);
                i0Var4.f9873e.i(i210, new n1.a(-1, this.f9852k - i0Var4.f9870b, 0));
                i0Var4.f9872d.add(eVar4);
            }
            w(z10, null);
            return;
        }
        if (i11 != 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f9851j == null) {
            int iG2 = this.G.g();
            if (!z11) {
                gVar2 = this.G;
                i21 = gVar2.f11484g;
                if (i21 < gVar2.f11485h) {
                    objP = gVar2.p(gVar2.f11479b, i21);
                } else {
                    objP = null;
                }
                if (kotlin.jvm.internal.m.a(obj4, objP)) {
                    b0(obj2, z10);
                    z12 = z11;
                }
            }
            gVar = this.G;
            iArr = gVar.f11479b;
            arrayList2 = new ArrayList();
            if (gVar.f11488k <= 0) {
                i18 = gVar.f11484g;
                while (i18 < gVar.f11485h) {
                    int i211 = i18 * 5;
                    int i212 = iArr[i211];
                    Object objP3 = gVar.p(iArr, i18);
                    i19 = iArr[i211 + 1];
                    if ((i19 & 1073741824) != 0) {
                        i20 = 1;
                    } else {
                        i20 = i19 & 67108863;
                    }
                    arrayList2.add(new o1.e(objP3, i212, i18, i20));
                    i18 += iArr[i211 + 3];
                    z11 = z11;
                }
            }
            z12 = z11;
            this.f9851j = new i0(this.f9852k, arrayList2);
        } else {
            z12 = z11;
        }
        i0Var = this.f9851j;
        if (i0Var != null) {
            arrayList = i0Var.f9872d;
            wVar = i0Var.f9873e;
            i12 = i0Var.f9870b;
            if (obj4 != null) {
                objValueOf = new n0(Integer.valueOf(i10), obj4);
            } else {
                objValueOf = Integer.valueOf(i10);
            }
            i0Var3 = ((m1.a) i0Var.f9874f.getValue()).f10412a;
            objG = i0Var3.g(objValueOf);
            if (objG == null) {
                objG = null;
            } else if (objG instanceof u.d0) {
                d0Var = (u.d0) objG;
                Object objK2 = d0Var.k(0);
                if (d0Var.h()) {
                    i0Var3.k(objValueOf);
                }
                if (d0Var.f14838b == 1) {
                    i0Var3.m(objValueOf, d0Var.e());
                }
                objG = objK2;
            } else {
                i0Var3.k(objValueOf);
            }
            o1.e eVar5 = (o1.e) objG;
            if (z12) {
            }
            this.G.f11488k++;
            this.S = true;
            this.K = null;
            if (this.I.f11510w) {
                o1.k kVarK2 = this.H.k();
                this.I = kVarK2;
                kVarK2.O();
                this.J = false;
                this.K = null;
            }
            this.I.d();
            kVar = this.I;
            int i213 = kVar.f11507t;
            if (z10) {
                kVar.S(i10, obj5, obj5, true);
                i13 = 0;
            } else if (obj2 != null) {
                if (obj != null) {
                    obj5 = obj;
                }
                i13 = 0;
                kVar.S(i10, obj5, obj2, false);
            } else {
                i13 = 0;
                if (obj == null) {
                    obj3 = obj5;
                } else {
                    obj3 = obj;
                }
                kVar.S(i10, obj3, obj5, false);
            }
            this.N = this.I.b(i213);
            int i214 = (-2) - i213;
            o1.e eVar6 = new o1.e(-1, i10, i214, -1);
            wVar.i(i214, new n1.a(-1, this.f9852k - i12, i13));
            arrayList.add(eVar6);
            ArrayList arrayList4 = new ArrayList();
            if (z10) {
                i14 = i13;
            } else {
                i14 = this.f9852k;
            }
            i0Var2 = new i0(i14, arrayList4);
        } else {
            i0Var2 = null;
        }
        w(z10, i0Var2);
    }

    public final void X() {
        W(null, -127, 0, null);
    }

    public final void Y(int i10, c1 c1Var) {
        W(c1Var, i10, 0, null);
    }

    public final void Z(int i10, Object obj) {
        W(obj, i10, 0, null);
    }

    public final void a() {
        j();
        this.f9850i.clear();
        this.f9853n.f28b = 0;
        this.f9859t.f28b = 0;
        this.f9863x.f28b = 0;
        this.f9861v = null;
        p1.c cVar = this.O;
        cVar.f12259b.j0();
        cVar.f12258a.j0();
        this.T = 0;
        this.A = 0;
        this.f9857r = false;
        this.S = false;
        this.f9864y = false;
        this.F = false;
        this.f9865z = -1;
        o1.g gVar = this.G;
        if (!gVar.f11483f) {
            gVar.c();
        }
        if (this.I.f11510w) {
            return;
        }
        x();
    }

    public final void a0() {
        W(null, 125, 1, null);
        this.f9857r = true;
    }

    public final void b(Object obj, u00.n nVar) {
        if (this.S) {
            p1.l0 l0Var = this.O.f12258a;
            l0Var.m0(p1.h0.f12270d);
            kh.n.Z(l0Var, 0, obj);
            kotlin.jvm.internal.m.c(nVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            kotlin.jvm.internal.d0.d(2, nVar);
            kh.n.Z(l0Var, 1, nVar);
            return;
        }
        p1.b bVar = this.M;
        bVar.b();
        p1.l0 l0Var2 = bVar.f12247b.f12244a;
        l0Var2.m0(p1.h0.f12270d);
        kotlin.jvm.internal.m.c(nVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        kotlin.jvm.internal.d0.d(2, nVar);
        kh.n.a0(l0Var2, 0, obj, 1, nVar);
    }

    public final void b0(Object obj, boolean z10) {
        if (z10) {
            o1.g gVar = this.G;
            if (gVar.f11488k <= 0) {
                if ((gVar.f11479b[(gVar.f11484g * 5) + 1] & 1073741824) == 0) {
                    n1.a("Expected a node group");
                }
                gVar.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            p1.b bVar = this.M;
            bVar.getClass();
            bVar.d(false);
            p1.l0 l0Var = bVar.f12247b.f12244a;
            l0Var.m0(p1.g0.f12268d);
            kh.n.Z(l0Var, 0, obj);
        }
        this.G.u();
    }

    public final boolean c(char c10) {
        Object objF = F();
        if ((objF instanceof Character) && c10 == ((Character) objF).charValue()) {
            return false;
        }
        o0(Character.valueOf(c10));
        return true;
    }

    public final void c0(int i10) {
        int i11;
        int i12;
        if (this.f9851j != null) {
            W(null, i10, 0, null);
            return;
        }
        if (this.f9857r) {
            l.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i10), 3) ^ ((long) this.m);
        this.m++;
        o1.g gVar = this.G;
        boolean z10 = this.S;
        c cVar = i.f9868a;
        if (z10) {
            gVar.f11488k++;
            this.I.S(i10, cVar, cVar, false);
            w(false, null);
            return;
        }
        if (gVar.g() == i10 && ((i12 = gVar.f11484g) >= gVar.f11485h || (gVar.f11479b[(i12 * 5) + 1] & 536870912) == 0)) {
            gVar.u();
            w(false, null);
            return;
        }
        if (gVar.f11488k <= 0 && (i11 = gVar.f11484g) != gVar.f11485h) {
            int i13 = this.f9852k;
            K();
            this.M.f(i13, gVar.s());
            q.l(i11, gVar.f11484g, this.f9858s);
        }
        gVar.f11488k++;
        this.S = true;
        this.K = null;
        if (this.I.f11510w) {
            o1.k kVarK = this.H.k();
            this.I = kVarK;
            kVarK.O();
            this.J = false;
            this.K = null;
        }
        o1.k kVar = this.I;
        kVar.d();
        int i14 = kVar.f11507t;
        kVar.S(i10, cVar, cVar, false);
        this.N = kVar.b(i14);
        w(false, null);
    }

    public final boolean d(float f3) {
        Object objF = F();
        if ((objF instanceof Float) && f3 == ((Number) objF).floatValue()) {
            return false;
        }
        o0(Float.valueOf(f3));
        return true;
    }

    public final void d0(int i10) {
        W(null, i10, 0, null);
    }

    public final boolean e(int i10) {
        Object objF = F();
        if ((objF instanceof Integer) && i10 == ((Number) objF).intValue()) {
            return false;
        }
        o0(Integer.valueOf(i10));
        return true;
    }

    public final j e0(int i10) {
        r1 r1Var;
        boolean z10;
        c0(i10);
        boolean z11 = this.S;
        gi.c cVar = this.f9848g;
        ArrayList arrayList = this.E;
        p pVar = this.f9849h;
        if (z11) {
            r1 r1Var2 = new r1(pVar);
            arrayList.add(r1Var2);
            o0(r1Var2);
            r1Var2.f9922e = this.B;
            r1Var2.f9919b &= -17;
            cVar.o();
            return this;
        }
        int i11 = this.G.f11486i;
        ArrayList arrayList2 = this.f9858s;
        int iS = q.s(i11, arrayList2);
        l0 l0Var = iS >= 0 ? (l0) arrayList2.remove(iS) : null;
        Object objM = this.G.m();
        if (kotlin.jvm.internal.m.a(objM, i.f9868a)) {
            r1Var = new r1(pVar);
            o0(r1Var);
        } else {
            kotlin.jvm.internal.m.c(objM, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            r1Var = (r1) objM;
        }
        if (l0Var == null) {
            int i12 = r1Var.f9919b;
            boolean z12 = (i12 & 64) != 0;
            if (z12) {
                r1Var.f9919b = i12 & (-65);
            }
            if (z12) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        int i13 = r1Var.f9919b;
        r1Var.f9919b = z10 ? i13 | 8 : i13 & (-9);
        arrayList.add(r1Var);
        r1Var.f9922e = this.B;
        r1Var.f9919b &= -17;
        cVar.o();
        int i14 = r1Var.f9919b;
        if ((i14 & 256) != 0) {
            r1Var.f9919b = (i14 & (-257)) | 512;
            p1.l0 l0Var2 = this.M.f12247b.f12244a;
            l0Var2.m0(p1.e0.f12264d);
            kh.n.Z(l0Var2, 0, r1Var);
            if (!this.f9864y) {
                int i15 = r1Var.f9919b;
                if ((i15 & Cast.MAX_NAMESPACE_LENGTH) != 0) {
                    this.f9864y = true;
                    this.f9865z = this.G.f11486i;
                    r1Var.f9919b = i15 | 1024;
                }
            }
        }
        return this;
    }

    public final boolean f(long j9) {
        Object objF = F();
        if ((objF instanceof Long) && j9 == ((Number) objF).longValue()) {
            return false;
        }
        o0(Long.valueOf(j9));
        return true;
    }

    public final void f0(Object obj) {
        if (!this.S && this.G.g() == 207 && !kotlin.jvm.internal.m.a(this.G.f(), obj) && this.f9865z < 0) {
            this.f9865z = this.G.f11484g;
            this.f9864y = true;
        }
        W(null, 207, 0, obj);
    }

    public final boolean g(Object obj) {
        if (kotlin.jvm.internal.m.a(F(), obj)) {
            return false;
        }
        o0(obj);
        return true;
    }

    public final void g0() {
        W(null, 125, 2, null);
        this.f9857r = true;
    }

    public final boolean h(boolean z10) {
        Object objF = F();
        if ((objF instanceof Boolean) && z10 == ((Boolean) objF).booleanValue()) {
            return false;
        }
        o0(Boolean.valueOf(z10));
        return true;
    }

    public final void h0() {
        this.m = 0;
        this.G = this.f9844c.i();
        W(null, 100, 0, null);
        n nVar = this.f9843b;
        nVar.w();
        m1 m1VarJ = nVar.j();
        this.f9863x.e(this.f9862w ? 1 : 0);
        this.f9862w = g(m1VarJ);
        this.K = null;
        if (!this.f9856q) {
            this.f9856q = nVar.f();
        }
        if (!this.C) {
            this.C = nVar.g();
        }
        if (this.C) {
            q2 q2Var = a2.g.f160a;
            kotlin.jvm.internal.m.c(q2Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            m1VarJ = ((v1.h) m1VarJ).k(q2Var, new r2(B()));
        }
        this.f9860u = m1VarJ;
        Set set = (Set) q.D(m1VarJ, a2.h.f161a);
        if (set != null) {
            set.add(y());
            nVar.r(set);
        }
        W(null, Long.hashCode(nVar.h()), 0, null);
    }

    public final boolean i(Object obj) {
        if (F() == obj) {
            return false;
        }
        o0(obj);
        return true;
    }

    public final boolean i0(r1 r1Var, Object obj) {
        o1.b bVar = r1Var.f9920c;
        if (bVar == null) {
            return false;
        }
        int iA = this.G.f11478a.a(y3.q(bVar));
        if (!this.F || iA < this.G.f11484g) {
            return false;
        }
        ArrayList arrayList = this.f9858s;
        int iS = q.s(iA, arrayList);
        if (iS < 0) {
            int i10 = -(iS + 1);
            if (!(obj instanceof w)) {
                obj = null;
            }
            arrayList.add(i10, new l0(r1Var, iA, obj));
            return true;
        }
        l0 l0Var = (l0) arrayList.get(iS);
        if (!(obj instanceof w)) {
            l0Var.f9898c = null;
            return true;
        }
        Object obj2 = l0Var.f9898c;
        if (obj2 == null) {
            l0Var.f9898c = obj;
            return true;
        }
        if (obj2 instanceof u.j0) {
            ((u.j0) obj2).a(obj);
            return true;
        }
        u.j0 j0Var = u.r0.f14890a;
        u.j0 j0Var2 = new u.j0(2);
        j0Var2.j(obj2);
        j0Var2.j(obj);
        l0Var.f9898c = j0Var2;
        return true;
    }

    public final void j() {
        this.f9851j = null;
        this.f9852k = 0;
        this.l = 0;
        this.T = 0L;
        this.f9857r = false;
        p1.b bVar = this.M;
        bVar.f12248c = false;
        bVar.f12249d.f28b = 0;
        bVar.f12251f = 0;
        bVar.f12250e = true;
        bVar.f12252g = 0;
        bVar.f12253h.clear();
        bVar.f12254i = -1;
        bVar.f12255j = -1;
        bVar.f12256k = -1;
        bVar.l = 0;
        this.E.clear();
        this.f9854o = null;
        this.f9855p = null;
    }

    public final void j0(u.i0 i0Var) {
        ArrayList arrayList = this.f9858s;
        for (int iM = va.a.M(arrayList); -1 < iM; iM--) {
            l0 l0Var = (l0) arrayList.get(iM);
            o1.b bVar = l0Var.f9896a.f9920c;
            o1.b bVarQ = bVar != null ? y3.q(bVar) : null;
            if (bVarQ == null || !bVarQ.a()) {
                arrayList.remove(iM);
            } else {
                int i10 = l0Var.f9897b;
                int i11 = bVarQ.f11470a;
                if (i10 != i11) {
                    l0Var.f9897b = i11;
                }
            }
        }
        Object[] objArr = i0Var.f14857b;
        Object[] objArr2 = i0Var.f14858c;
        long[] jArr = i0Var.f14856a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j9 = jArr[i12];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i12 != length) {
                        break;
                        break;
                    }
                    i12++;
                } else {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j9) < 128) {
                            int i15 = (i12 << 3) + i14;
                            Object obj = objArr[i15];
                            Object obj2 = objArr2[i15];
                            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            r1 r1Var = (r1) obj;
                            o1.b bVar2 = r1Var.f9920c;
                            if (bVar2 != null) {
                                int i16 = y3.q(bVar2).f11470a;
                                if (obj2 == c.F) {
                                    obj2 = null;
                                }
                                arrayList.add(new l0(r1Var, i16, obj2));
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    } else if (i12 != length) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        h00.u.t0(arrayList, q.f9908c);
    }

    public final Object k(p1 p1Var) {
        return q.D(m(), p1Var);
    }

    public final void k0(int i10, int i11) {
        if (p0(i10) != i11) {
            if (i10 < 0) {
                u.u uVar = this.f9855p;
                if (uVar == null) {
                    uVar = new u.u();
                    this.f9855p = uVar;
                }
                uVar.f(i10, i11);
                return;
            }
            int[] iArr = this.f9854o;
            if (iArr == null) {
                iArr = new int[this.G.f11480c];
                h00.n.A0(iArr, -1);
                this.f9854o = iArr;
            }
            iArr[i10] = i11;
        }
    }

    public final void l(u00.a aVar) {
        if (!this.f9857r) {
            l.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f9857r = false;
        if (!this.S) {
            l.a("createNode() can only be called when inserting");
        }
        a1.c1 c1Var = this.f9853n;
        int i10 = c1Var.f27a[c1Var.f28b - 1];
        o1.k kVar = this.I;
        o1.b bVarB = kVar.b(kVar.f11509v);
        this.l++;
        p1.c cVar = this.O;
        p1.l0 l0Var = cVar.f12258a;
        l0Var.m0(p1.r.f12288e);
        kh.n.Z(l0Var, 0, aVar);
        l0Var.f12279c[l0Var.f12280d - l0Var.f12277a[l0Var.f12278b - 1].b] = i10;
        kh.n.Z(l0Var, 1, bVarB);
        p1.l0 l0Var2 = cVar.f12259b;
        l0Var2.m0(p1.r.f12289f);
        l0Var2.f12279c[l0Var2.f12280d - l0Var2.f12277a[l0Var2.f12278b - 1].b] = i10;
        kh.n.Z(l0Var2, 0, bVarB);
    }

    public final void l0(int i10, int i11) {
        int iP0 = p0(i10);
        if (iP0 != i11) {
            int i12 = i11 - iP0;
            ArrayList arrayList = this.f9850i;
            int size = arrayList.size() - 1;
            while (i10 != -1) {
                int iP1 = p0(i10) + i12;
                k0(i10, iP1);
                for (int i13 = size; -1 < i13; i13--) {
                    i0 i0Var = (i0) arrayList.get(i13);
                    if (i0Var != null && i0Var.a(i10, iP1)) {
                        size = i13 - 1;
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.G.f11486i;
                } else if (this.G.l(i10)) {
                    return;
                } else {
                    i10 = this.G.q(i10);
                }
            }
        }
    }

    public final m1 m() {
        m1 m1Var = this.K;
        return m1Var != null ? m1Var : n(this.G.f11486i);
    }

    public final v1.h m0(m1 m1Var, v1.h hVar) {
        v1.g gVarBuilder = ((v1.h) m1Var).builder();
        gVarBuilder.putAll(hVar);
        v1.h hVarBuild = gVarBuilder.build();
        Y(204, l.f9894d);
        F();
        o0(hVarBuild);
        F();
        o0(hVar);
        r(false);
        return hVarBuild;
    }

    public final m1 n(int i10) {
        m1 m1Var;
        boolean z10 = this.S;
        c1 c1Var = l.f9893c;
        if (z10 && this.J) {
            int iG = this.I.f11509v;
            while (iG > 0) {
                if (this.I.s(iG) == 202 && kotlin.jvm.internal.m.a(this.I.t(iG), c1Var)) {
                    Object objQ = this.I.q(iG);
                    kotlin.jvm.internal.m.c(objQ, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    m1 m1Var2 = (m1) objQ;
                    this.K = m1Var2;
                    return m1Var2;
                }
                o1.k kVar = this.I;
                iG = kVar.G(kVar.f11491b, iG);
            }
        }
        if (this.G.f11480c > 0) {
            while (i10 > 0) {
                if (this.G.i(i10) == 202) {
                    o1.g gVar = this.G;
                    if (kotlin.jvm.internal.m.a(gVar.p(gVar.f11479b, i10), c1Var)) {
                        u.w wVar = this.f9861v;
                        if (wVar == null || (m1Var = (m1) wVar.b(i10)) == null) {
                            o1.g gVar2 = this.G;
                            Object objB = gVar2.b(gVar2.f11479b, i10);
                            kotlin.jvm.internal.m.c(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                            m1Var = (m1) objB;
                        }
                        this.K = m1Var;
                        return m1Var;
                    }
                }
                i10 = this.G.q(i10);
            }
        }
        m1 m1Var3 = this.f9860u;
        this.K = m1Var3;
        return m1Var3;
    }

    public final void n0(Object obj) {
        if (obj instanceof y1) {
            j0 j0Var = new j0((y1) obj, this.m - 1);
            if (this.S) {
                p1.l0 l0Var = this.M.f12247b.f12244a;
                l0Var.m0(p1.x.f12298d);
                kh.n.Z(l0Var, 0, j0Var);
            }
            this.f9845d.add(obj);
            obj = j0Var;
        }
        o0(obj);
    }

    public final a2.a o() {
        ArrayList arrayList;
        if (!this.f9843b.l()) {
            return null;
        }
        i00.b bVarS = va.a.s();
        o1.k kVar = this.I;
        bVarS.addAll(a10.h0.l(kVar, (Integer) null, kVar.f11507t, (Integer) null));
        o1.g gVar = this.G;
        boolean z10 = gVar.f11483f;
        int[] iArr = gVar.f11479b;
        if (z10 || gVar.f11480c == 0) {
            arrayList = h00.x.A;
        } else {
            a2.m mVar = new a2.m(gVar, 0);
            int iQ = gVar.f11486i;
            Object objValueOf = Integer.valueOf(gVar.l - o1.j.b(iArr, iQ));
            while (iQ >= 0) {
                mVar.g(gVar.i(iQ), gVar.k(iQ) ? gVar.p(iArr, iQ) : i.f9868a, gVar.f11478a.m(iQ), objValueOf);
                objValueOf = gVar.a(iQ);
                iQ = gVar.q(iQ);
            }
            arrayList = mVar.A;
        }
        bVarS.addAll(arrayList);
        bVarS.addAll(G());
        return new a2.a(va.a.k(bVarS), this.C);
    }

    public final void o0(Object obj) {
        if (this.S) {
            this.I.U(obj);
            return;
        }
        o1.g gVar = this.G;
        boolean z10 = gVar.f11489n;
        p1.b bVar = this.M;
        if (!z10) {
            o1.b bVarA = gVar.a(gVar.f11486i);
            p1.l0 l0Var = bVar.f12247b.f12244a;
            l0Var.m0(p1.e.f12263d);
            kh.n.a0(l0Var, 0, bVarA, 1, obj);
            return;
        }
        int iB = (gVar.l - o1.j.b(gVar.f11479b, gVar.f11486i)) - 1;
        if (bVar.f12246a.G.f11486i - bVar.f12251f >= 0) {
            bVar.d(true);
            p1.l0 l0Var2 = bVar.f12247b.f12244a;
            l0Var2.m0(p1.r.f12291h);
            kh.n.Z(l0Var2, 0, obj);
            l0Var2.f12279c[l0Var2.f12280d - l0Var2.f12277a[l0Var2.f12278b - 1].b] = iB;
            return;
        }
        o1.g gVar2 = this.G;
        o1.b bVarA2 = gVar2.a(gVar2.f11486i);
        p1.l0 l0Var3 = bVar.f12247b.f12244a;
        l0Var3.m0(p1.r.f12290g);
        kh.n.a0(l0Var3, 0, obj, 1, bVarA2);
        l0Var3.f12279c[l0Var3.f12280d - l0Var3.f12277a[l0Var3.f12278b - 1].b] = iB;
    }

    public final void p(u.i0 i0Var, u00.n nVar) {
        ArrayList arrayList = this.f9858s;
        if (this.F) {
            l.a("Reentrant composition is not supported");
        }
        this.f9848g.o();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(z1.l.j().g());
            this.f9861v = null;
            j0(i0Var);
            this.f9852k = 0;
            this.F = true;
            try {
                h0();
                Object objF = F();
                if (objF != nVar && nVar != null) {
                    o0(nVar);
                }
                f0 f0Var = this.D;
                m1.e eVarP = q.p();
                try {
                    eVarP.b(f0Var);
                    c1 c1Var = l.f9891a;
                    if (nVar != null) {
                        Y(MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN, c1Var);
                        v1.d.c(this, nVar);
                        r(false);
                    } else if (!this.f9862w || objF == null || objF.equals(i.f9868a)) {
                        T();
                    } else {
                        Y(MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN, c1Var);
                        kotlin.jvm.internal.d0.d(2, objF);
                        v1.d.c(this, (u00.n) objF);
                        r(false);
                    }
                    eVarP.k(eVarP.C - 1);
                    v();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.f11510w) {
                        l.a("Check failed");
                    }
                    x();
                    Trace.endSection();
                } catch (Throwable th2) {
                    eVarP.k(eVarP.C - 1);
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    ab.a0.H0(th3, new c0(0, this));
                    throw th3;
                } catch (Throwable th4) {
                    this.F = false;
                    arrayList.clear();
                    a();
                    if (!this.I.f11510w) {
                        l.a("Check failed");
                    }
                    x();
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
    }

    public final int p0(int i10) {
        int i11;
        if (i10 >= 0) {
            int[] iArr = this.f9854o;
            return (iArr == null || (i11 = iArr[i10]) < 0) ? this.G.o(i10) : i11;
        }
        u.u uVar = this.f9855p;
        if (uVar == null || uVar.c(i10) < 0) {
            return 0;
        }
        int iC = uVar.c(i10);
        if (iC >= 0) {
            return uVar.f14899c[iC];
        }
        v.a.e("Cannot find value for key " + i10);
        throw null;
    }

    public final void q(int i10, int i11) {
        if (i10 <= 0 || i10 == i11) {
            return;
        }
        q(this.G.q(i10), i11);
        if (this.G.l(i10)) {
            Object objN = this.G.n(i10);
            p1.b bVar = this.M;
            bVar.c();
            bVar.f12253h.add(objN);
        }
    }

    public final void q0() {
        if (!this.f9857r) {
            l.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f9857r = false;
        if (this.S) {
            l.a("useNode() called while inserting");
        }
        o1.g gVar = this.G;
        Object objN = gVar.n(gVar.f11486i);
        p1.b bVar = this.M;
        bVar.c();
        bVar.f12253h.add(objN);
        if (this.f9864y && (objN instanceof f)) {
            bVar.b();
            bVar.f12247b.f12244a.m0(p1.j0.f12274d);
        }
    }

    public final void r(boolean z10) {
        long jRotateRight;
        a1.c1 c1Var;
        int i10;
        ArrayList arrayList;
        int i11;
        ?? r7;
        int i12;
        a1.c1 c1Var2;
        int i13;
        u.j0 j0Var;
        int i14;
        int i15;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i16;
        int i17;
        Object[] objArr;
        long[] jArr;
        int i18;
        Object[] objArr2;
        long[] jArr2;
        int i19;
        Object[] objArr3;
        long[] jArr3;
        int i20;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        a1.c1 c1Var3 = this.f9853n;
        int i21 = c1Var3.f27a[c1Var3.f28b - 2] - 1;
        boolean z11 = this.S;
        c cVar = i.f9868a;
        if (z11) {
            o1.k kVar = this.I;
            int i22 = kVar.f11509v;
            int iS = kVar.s(i22);
            Object objT = this.I.t(i22);
            Object objQ = this.I.q(i22);
            if (objT != null) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) (objT instanceof Enum ? ((Enum) objT).ordinal() : objT.hashCode()));
            } else if (objQ == null || iS != 207 || objQ.equals(cVar)) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) i21), 3) ^ ((long) iS);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i21), 3) ^ ((long) objQ.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight2, 3);
        } else {
            o1.g gVar = this.G;
            int i23 = gVar.f11486i;
            int i24 = gVar.i(i23);
            o1.g gVar2 = this.G;
            Object objP = gVar2.p(gVar2.f11479b, i23);
            o1.g gVar3 = this.G;
            Object objB = gVar3.b(gVar3.f11479b, i23);
            if (objP != null) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) 0), 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode()));
            } else if (objB == null || i24 != 207 || objB.equals(cVar)) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) i21), 3) ^ ((long) i24);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i21), 3) ^ ((long) objB.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight, 3);
        }
        int i25 = this.l;
        i0 i0Var = this.f9851j;
        ArrayList arrayList4 = this.f9858s;
        p1.b bVar = this.M;
        if (i0Var != null) {
            u.w wVar = i0Var.f9873e;
            int i26 = i0Var.f9870b;
            ArrayList arrayList5 = i0Var.f9869a;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = i0Var.f9872d;
                HashSet hashSet2 = new HashSet(arrayList6.size());
                int size = arrayList6.size();
                for (int i27 = 0; i27 < size; i27++) {
                    hashSet2.add(arrayList6.get(i27));
                }
                i11 = -1;
                u.j0 j0Var2 = u.r0.f14890a;
                u.j0 j0Var3 = new u.j0();
                int size2 = arrayList6.size();
                int size3 = arrayList5.size();
                i10 = 1;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                while (i28 < size3) {
                    o1.e eVar = (o1.e) arrayList5.get(i28);
                    if (hashSet2.contains(eVar)) {
                        c1Var2 = c1Var3;
                        i13 = i28;
                        if (!j0Var3.c(eVar)) {
                            int i31 = i29;
                            if (i31 < size2) {
                                o1.e eVar2 = (o1.e) arrayList6.get(i31);
                                if (eVar2 != eVar) {
                                    n1.a aVar = (n1.a) wVar.b(eVar2.f11474c);
                                    int i32 = aVar != null ? aVar.f10999b : -1;
                                    j0Var3.a(eVar2);
                                    i16 = i30;
                                    if (i32 != i16) {
                                        n1.a aVar2 = (n1.a) wVar.b(eVar2.f11474c);
                                        int i33 = aVar2 != null ? aVar2.f11000c : eVar2.f11475d;
                                        j0Var = j0Var3;
                                        int i34 = i32 + i26;
                                        i14 = size2;
                                        int i35 = i16 + i26;
                                        if (i33 > 0) {
                                            i15 = i26;
                                            int i36 = bVar.l;
                                            if (i36 > 0) {
                                                arrayList2 = arrayList5;
                                                if (bVar.f12255j == i34 - i36 && bVar.f12256k == i35 - i36) {
                                                    bVar.l = i36 + i33;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            bVar.c();
                                            bVar.f12255j = i34;
                                            bVar.f12256k = i35;
                                            bVar.l = i33;
                                        } else {
                                            i15 = i26;
                                            arrayList2 = arrayList5;
                                            bVar.getClass();
                                        }
                                        if (i32 <= i16) {
                                            int i37 = i33;
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList6;
                                            hashSet = hashSet2;
                                            if (i16 > i32) {
                                                Object[] objArr5 = wVar.f14873c;
                                                long[] jArr5 = wVar.f14871a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i38 = 0;
                                                    while (true) {
                                                        long j9 = jArr5[i38];
                                                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i39 = 8 - ((~(i38 - length)) >>> 31);
                                                            int i40 = 0;
                                                            while (i40 < i39) {
                                                                if ((j9 & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    n1.a aVar3 = (n1.a) objArr5[(i38 << 3) + i40];
                                                                    jArr2 = jArr5;
                                                                    int i41 = aVar3.f10999b;
                                                                    i19 = i32;
                                                                    if (i32 <= i41 && i41 < i19 + i37) {
                                                                        aVar3.f10999b = (i41 - i19) + i16;
                                                                    } else if (i19 + 1 <= i41 && i41 < i16) {
                                                                        aVar3.f10999b = i41 - i37;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i19 = i32;
                                                                }
                                                                j9 >>= 8;
                                                                i40++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i32 = i19;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i18 = i32;
                                                            if (i39 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i18 = i32;
                                                        }
                                                        if (i38 == length) {
                                                            break;
                                                        }
                                                        i38++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i32 = i18;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = wVar.f14873c;
                                            long[] jArr6 = wVar.f14871a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList6;
                                                hashSet = hashSet2;
                                                int i42 = 0;
                                                while (true) {
                                                    long j10 = jArr6[i42];
                                                    int i43 = i33;
                                                    arrayList4 = arrayList4;
                                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i44 = 8 - ((~(i42 - length2)) >>> 31);
                                                        int i45 = 0;
                                                        while (i45 < i44) {
                                                            if ((j10 & 255) < 128) {
                                                                i20 = i45;
                                                                n1.a aVar4 = (n1.a) objArr6[(i42 << 3) + i45];
                                                                objArr4 = objArr6;
                                                                int i46 = aVar4.f10999b;
                                                                jArr4 = jArr6;
                                                                if (i32 <= i46 && i46 < i32 + i43) {
                                                                    aVar4.f10999b = (i46 - i32) + i16;
                                                                } else if (i16 <= i46 && i46 < i32) {
                                                                    aVar4.f10999b = i46 + i43;
                                                                }
                                                            } else {
                                                                i20 = i45;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j10 >>= 8;
                                                            i45 = i20 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i44 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i42 == length2) {
                                                        break;
                                                    }
                                                    i42++;
                                                    arrayList4 = arrayList4;
                                                    i33 = i43;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i17 = i13;
                                    } else {
                                        j0Var = j0Var3;
                                        i14 = size2;
                                        i15 = i26;
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i17 = i13;
                                } else {
                                    arrayList4 = arrayList4;
                                    j0Var = j0Var3;
                                    i14 = size2;
                                    i15 = i26;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i16 = i30;
                                    i17 = i13 + 1;
                                }
                                i29 = i31 + 1;
                                n1.a aVar5 = (n1.a) wVar.b(eVar2.f11474c);
                                int i47 = i16 + (aVar5 != null ? aVar5.f11000c : eVar2.f11475d);
                                i28 = i17;
                                i0Var = i0Var;
                                j0Var3 = j0Var;
                                size2 = i14;
                                i26 = i15;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList4;
                                i30 = i47;
                                c1Var3 = c1Var2;
                            } else {
                                i29 = i31;
                                c1Var3 = c1Var2;
                                i28 = i13;
                            }
                        }
                    } else {
                        c1Var2 = c1Var3;
                        n1.a aVar6 = (n1.a) wVar.b(eVar.f11474c);
                        int i48 = aVar6 != null ? aVar6.f10999b : -1;
                        int i49 = eVar.f11474c;
                        i13 = i28;
                        bVar.f(i48 + i26, eVar.f11475d);
                        i0Var.a(i49, 0);
                        bVar.f12251f = (i49 - bVar.f12246a.G.f11484g) + bVar.f12251f;
                        this.G.r(i49);
                        K();
                        this.G.s();
                        q.l(i49, this.G.f11479b[(i49 * 5) + 3] + i49, arrayList4);
                    }
                    i28 = i13 + 1;
                    c1Var3 = c1Var2;
                }
                c1Var = c1Var3;
                arrayList = arrayList4;
                bVar.c();
                if (arrayList5.size() > 0) {
                    o1.g gVar4 = this.G;
                    bVar.f12251f = (gVar4.f11485h - bVar.f12246a.G.f11484g) + bVar.f12251f;
                    gVar4.t();
                }
            } else {
                c1Var = c1Var3;
                i10 = 1;
                arrayList = arrayList4;
                i11 = -1;
            }
        } else {
            c1Var = c1Var3;
            i10 = 1;
            arrayList = arrayList4;
            i11 = -1;
        }
        boolean z12 = this.S;
        if (!z12) {
            o1.g gVar5 = this.G;
            int i50 = gVar5.m - gVar5.l;
            if (i50 > 0) {
                if (i50 > 0) {
                    bVar.d(false);
                    bVar.e();
                    p1.l0 l0Var = bVar.f12247b.f12244a;
                    l0Var.m0(p1.f0.f12266d);
                    l0Var.f12279c[l0Var.f12280d - l0Var.f12277a[l0Var.f12278b - 1].b] = i50;
                } else {
                    bVar.getClass();
                }
            }
        }
        int i51 = this.f9852k;
        while (true) {
            o1.g gVar6 = this.G;
            if (gVar6.f11488k > 0 || (i12 = gVar6.f11484g) == gVar6.f11485h) {
                break;
            }
            K();
            bVar.f(i51, this.G.s());
            q.l(i12, this.G.f11484g, arrayList);
        }
        if (z12) {
            if (z10) {
                p1.c cVar2 = this.O;
                p1.l0 l0Var2 = cVar2.f12259b;
                if (l0Var2.f12278b == 0) {
                    l.a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                p1.l0 l0Var3 = cVar2.f12258a;
                k20.d[] dVarArr = l0Var2.f12277a;
                int i52 = l0Var2.f12278b - 1;
                l0Var2.f12278b = i52;
                k20.d dVar = dVarArr[i52];
                dVarArr[i52] = null;
                l0Var3.m0(dVar);
                Object[] objArr7 = l0Var2.f12281e;
                Object[] objArr8 = l0Var3.f12281e;
                int i53 = l0Var3.f12282f;
                int i54 = dVar.c;
                int i55 = l0Var2.f12282f;
                int i56 = i55 - i54;
                System.arraycopy(objArr7, i56, objArr8, i53 - i54, i55 - i56);
                Object[] objArr9 = l0Var2.f12281e;
                int i57 = l0Var2.f12282f;
                Arrays.fill(objArr9, i57 - i54, i57, (Object) null);
                int[] iArr = l0Var2.f12279c;
                int[] iArr2 = l0Var3.f12279c;
                int i58 = l0Var3.f12280d;
                int i59 = dVar.b;
                int i60 = l0Var2.f12280d;
                h00.n.p0(i58 - i59, i60 - i59, i60, iArr, iArr2);
                l0Var2.f12282f -= i54;
                l0Var2.f12280d -= i59;
                i25 = i10;
            }
            o1.g gVar7 = this.G;
            if (gVar7.f11488k <= 0) {
                n1.a("Unbalanced begin/end empty");
            }
            gVar7.f11488k--;
            o1.k kVar2 = this.I;
            int i61 = kVar2.f11509v;
            kVar2.j();
            if (this.G.f11488k <= 0) {
                int i62 = (-2) - i61;
                this.I.k();
                this.I.e(i10);
                o1.b bVar2 = this.N;
                if (this.O.f12258a.l0()) {
                    o1.h hVar = this.H;
                    bVar.b();
                    r7 = 0;
                    bVar.d(false);
                    bVar.e();
                    bVar.c();
                    p1.l0 l0Var4 = bVar.f12247b.f12244a;
                    l0Var4.m0(p1.s.f12293d);
                    kh.n.a0(l0Var4, 0, bVar2, 1, hVar);
                } else {
                    o1.h hVar2 = this.H;
                    p1.c cVar3 = this.O;
                    bVar.b();
                    bVar.d(false);
                    bVar.e();
                    bVar.c();
                    p1.l0 l0Var5 = bVar.f12247b.f12244a;
                    l0Var5.m0(p1.t.f12294d);
                    kh.n.b0(l0Var5, bVar2, hVar2, cVar3);
                    this.O = new p1.c();
                    r7 = 0;
                }
                this.S = r7;
                if (this.f9844c.B != 0) {
                    k0(i62, r7);
                    l0(i62, i25);
                }
            }
        } else {
            if (z10) {
                bVar.a();
            }
            int i63 = bVar.f12246a.G.f11486i;
            a1.c1 c1Var4 = bVar.f12249d;
            int i64 = i11;
            if (c1Var4.c(i64) > i63) {
                l.a("Missed recording an endGroup");
            }
            if (c1Var4.c(i64) == i63) {
                bVar.d(false);
                c1Var4.d();
                bVar.f12247b.f12244a.m0(p1.m.f12283d);
            }
            int i65 = this.G.f11486i;
            if (i25 != p0(i65)) {
                l0(i65, i25);
            }
            if (z10) {
                i25 = 1;
            }
            this.G.e();
            bVar.c();
        }
        i0 i0Var2 = (i0) q.A(this.f9850i);
        if (i0Var2 != null && !z12) {
            i0Var2.f9871c++;
        }
        this.f9851j = i0Var2;
        this.f9852k = c1Var.d() + i25;
        this.m = c1Var.d();
        this.l = c1Var.d() + i25;
    }

    public final void s() {
        r(false);
        r1 r1VarZ = z();
        if (r1VarZ != null) {
            int i10 = r1VarZ.f9919b;
            if ((i10 & 1) != 0) {
                r1VarZ.f9919b = i10 | 2;
            }
        }
    }

    public final r1 t() {
        r1 r1Var;
        o1.b bVarA;
        a1.q0 q0Var;
        ArrayList arrayList = this.E;
        r1 r1Var2 = q.x(arrayList) ? (r1) arrayList.remove(arrayList.size() - 1) : null;
        if (r1Var2 != null) {
            r1Var2.f9919b &= -9;
            this.f9848g.o();
            int i10 = this.B;
            u.c0 c0Var = r1Var2.f9923f;
            if (c0Var == null || (r1Var2.f9919b & 16) != 0) {
                q0Var = null;
                break;
            }
            Object[] objArr = c0Var.f14832b;
            int[] iArr = c0Var.f14833c;
            long[] jArr = c0Var.f14831a;
            int length = jArr.length - 2;
            if (length < 0) {
                q0Var = null;
                break;
            }
            int i11 = 0;
            loop0: while (true) {
                long j9 = jArr[i11];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((j9 & 255) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj = objArr[i14];
                            if (iArr[i14] != i10) {
                                q0Var = new a1.q0(r1Var2, i10, c0Var, 4);
                                break loop0;
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i12 == 8) {
                        if (i11 == length) {
                            i11++;
                        }
                    }
                    q0Var = null;
                    break;
                }
                if (i11 == length) {
                    q0Var = null;
                    break;
                }
                i11++;
            }
            p1.b bVar = this.M;
            if (q0Var != null) {
                p1.l0 l0Var = bVar.f12247b.f12244a;
                l0Var.m0(p1.l.f12276d);
                kh.n.a0(l0Var, 0, q0Var, 1, this.f9849h);
            }
            int i15 = r1Var2.f9919b;
            if ((i15 & 512) != 0) {
                r1Var2.f9919b = i15 & (-513);
                p1.l0 l0Var2 = bVar.f12247b.f12244a;
                l0Var2.m0(p1.o.f12285d);
                kh.n.Z(l0Var2, 0, r1Var2);
                int i16 = r1Var2.f9919b;
                r1Var2.f9919b = i16 & (-129);
                if ((i16 & 1024) != 0) {
                    r1Var2.f9919b = i16 & (-1153);
                    if (this.f9865z == this.G.f11486i) {
                        this.f9864y = false;
                        this.f9865z = -1;
                    }
                }
            }
        }
        if (r1Var2 != null) {
            int i17 = r1Var2.f9919b;
            if ((i17 & 16) == 0 && ((i17 & 1) != 0 || this.f9856q)) {
                if (r1Var2.f9920c == null) {
                    if (this.S) {
                        o1.k kVar = this.I;
                        bVarA = kVar.b(kVar.f11509v);
                    } else {
                        o1.g gVar = this.G;
                        bVarA = gVar.a(gVar.f11486i);
                    }
                    r1Var2.f9920c = bVarA;
                }
                r1Var2.f9919b &= -5;
                r1Var = r1Var2;
            } else {
                r1Var = null;
            }
        } else {
            r1Var = null;
        }
        r(false);
        return r1Var;
    }

    public final void u() {
        if (this.F || this.f9865z != 0) {
            n1.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f9865z = -1;
        this.f9864y = false;
    }

    public final void v() {
        r(false);
        this.f9843b.d();
        r(false);
        p1.b bVar = this.M;
        if (bVar.f12248c) {
            bVar.d(false);
            bVar.d(false);
            bVar.f12247b.f12244a.m0(p1.m.f12283d);
            bVar.f12248c = false;
        }
        bVar.b();
        if (bVar.f12249d.f28b != 0) {
            l.a("Missed recording an endGroup()");
        }
        if (!this.f9850i.isEmpty()) {
            l.a("Start/end imbalance");
        }
        j();
        this.G.c();
        this.f9862w = this.f9863x.d() != 0;
    }

    public final void w(boolean z10, i0 i0Var) {
        this.f9850i.add(this.f9851j);
        this.f9851j = i0Var;
        int i10 = this.l;
        a1.c1 c1Var = this.f9853n;
        c1Var.e(i10);
        c1Var.e(this.m);
        c1Var.e(this.f9852k);
        if (z10) {
            this.f9852k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void x() {
        o1.h hVar = new o1.h();
        if (this.C) {
            hVar.c();
        }
        if (this.f9843b.e()) {
            hVar.K = new u.w();
        }
        this.H = hVar;
        o1.k kVarK = hVar.k();
        kVarK.e(true);
        this.I = kVarK;
    }

    public final a2.d y() {
        h0 h0Var = this.U;
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0Var2 = new h0(this.f9849h);
        this.U = h0Var2;
        return h0Var2;
    }

    public final r1 z() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (q.x(arrayList)) {
            return (r1) g4.c.d(1, arrayList);
        }
        return null;
    }
}
