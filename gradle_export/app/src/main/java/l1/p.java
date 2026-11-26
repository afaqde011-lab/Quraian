package l1;

import android.os.Trace;
import com.google.android.gms.internal.measurement.y3;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

public final class p implements s1, m {
    public final n A;
    public final a30.x B;
    public final AtomicReference C = new AtomicReference(null);
    public final Object D = new Object();
    public final u.l0 E;
    public final o1.h F;
    public final u.i0 G;
    public final u.j0 H;
    public final u.j0 I;
    public final u.i0 J;
    public final p1.a K;
    public final p1.a L;
    public final u.i0 M;
    public u.i0 N;
    public boolean O;
    public d2 P;
    public k1 Q;
    public p R;
    public int S;
    public final gi.c T;
    public final v1.i U;
    public final g0 V;
    public int W;

    public p(n nVar, a30.x xVar) {
        this.A = nVar;
        this.B = xVar;
        u.j0 j0Var = new u.j0();
        u.l0 l0Var = j0Var.f14868e;
        if (l0Var == null) {
            l0Var = new u.l0(j0Var);
            j0Var.f14868e = l0Var;
        }
        u.l0 l0Var2 = l0Var;
        this.E = l0Var2;
        o1.h hVar = new o1.h();
        if (nVar.e()) {
            hVar.K = new u.w();
        }
        if (nVar.g()) {
            hVar.c();
        }
        this.F = hVar;
        this.G = va.a.n();
        this.H = new u.j0();
        this.I = new u.j0();
        this.J = va.a.n();
        p1.a aVar = new p1.a();
        this.K = aVar;
        p1.a aVar2 = new p1.a();
        this.L = aVar2;
        this.M = va.a.n();
        this.N = va.a.n();
        gi.c cVar = new gi.c(nVar, 17);
        this.T = cVar;
        this.U = new v1.i();
        g0 g0Var = new g0(xVar, nVar, o1.j.d(hVar), l0Var2, aVar, aVar2, cVar, this);
        nVar.s(g0Var);
        this.V = g0Var;
    }

    public final void A(u00.n nVar) {
        boolean zL = l();
        s();
        n nVar2 = this.A;
        if (!zL) {
            nVar2.a(this, nVar);
            return;
        }
        g0 g0Var = this.V;
        g0Var.f9865z = 0;
        g0Var.f9864y = true;
        nVar2.a(this, nVar);
        g0Var.u();
    }

    @Override
    public final m0 a(r1 r1Var, Object obj) {
        p pVar;
        int i10 = r1Var.f9919b;
        if ((i10 & 2) != 0) {
            r1Var.f9919b = i10 | 4;
        }
        o1.b bVar = r1Var.f9920c;
        if (bVar == null || !bVar.a()) {
            return m0.A;
        }
        o1.h hVar = this.F;
        hVar.getClass();
        o1.b bVar2 = r1Var.f9920c;
        if (bVar2 != null && hVar.l(y3.q(bVar2))) {
            if (r1Var.f9921d == null) {
                return m0.A;
            }
            m0 m0VarU = u(r1Var, bVar, obj);
            if (m0VarU != m0.A) {
                this.T.o();
            }
            return m0VarU;
        }
        synchronized (this.D) {
            pVar = this.R;
        }
        if (pVar != null) {
            g0 g0Var = pVar.V;
            if (g0Var.F && g0Var.i0(r1Var, obj)) {
                return m0.D;
            }
        }
        return m0.A;
    }

    @Override
    public final void b() {
        this.O = true;
        this.T.o();
    }

    @Override
    public final void c(Object obj) {
        r1 r1VarZ;
        int i10;
        boolean z10;
        g0 g0Var = this.V;
        if (g0Var.A <= 0 && (r1VarZ = g0Var.z()) != null) {
            r1VarZ.f();
            if ((r1VarZ.f9919b & 32) == 0) {
                u.c0 c0Var = r1VarZ.f9923f;
                if (c0Var == null) {
                    c0Var = new u.c0();
                    r1VarZ.f9923f = c0Var;
                }
                int i11 = r1VarZ.f9922e;
                int iC = c0Var.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i10 = -1;
                } else {
                    i10 = c0Var.f14833c[iC];
                }
                c0Var.f14832b[iC] = obj;
                c0Var.f14833c[iC] = i11;
                if (i10 == r1VarZ.f9922e) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            this.T.o();
            if (z10) {
                return;
            }
            if (obj instanceof z1.a0) {
                ((z1.a0) obj).g(1);
            }
            va.a.g(this.G, obj, r1VarZ);
            if (obj instanceof w) {
                w wVar = (w) obj;
                v vVarI = wVar.i();
                u.i0 i0Var = this.J;
                va.a.c0(i0Var, obj);
                u.c0 c0Var2 = vVarI.f9945e;
                Object[] objArr = c0Var2.f14832b;
                long[] jArr = c0Var2.f14831a;
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
                            int i13 = 8;
                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                            int i15 = 0;
                            while (i15 < i14) {
                                if ((j9 & 255) < 128) {
                                    z1.z zVar = (z1.z) objArr[(i12 << 3) + i15];
                                    if (zVar instanceof z1.a0) {
                                        ((z1.a0) zVar).g(1);
                                    }
                                    va.a.g(i0Var, zVar, obj);
                                }
                                j9 >>= i13;
                                i15++;
                                i13 = i13;
                            }
                            if (i14 != i13) {
                                break;
                            } else if (i12 != length) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                Object obj2 = vVarI.f9946f;
                u.i0 i0Var2 = r1VarZ.f9924g;
                if (i0Var2 == null) {
                    i0Var2 = new u.i0();
                    r1VarZ.f9924g = i0Var2;
                }
                i0Var2.m(wVar, obj2);
            }
        }
    }

    public final void d() {
        this.C.set(null);
        this.K.H();
        this.L.H();
        u.l0 l0Var = this.E;
        if (l0Var.A.g()) {
            return;
        }
        v1.i iVar = this.U;
        try {
            iVar.g(l0Var, this.V.B());
            iVar.b();
        } finally {
            iVar.a();
        }
    }

    @Override
    public final void dispose() {
        synchronized (this.D) {
            try {
                if (this.V.F) {
                    n1.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.W != 3) {
                    this.W = 3;
                    p1.a aVar = this.V.L;
                    if (aVar != null) {
                        h(aVar);
                    }
                    boolean z10 = this.F.B == 0;
                    if (!z10 || !this.E.A.g()) {
                        v1.i iVar = this.U;
                        try {
                            iVar.g(this.E, this.V.B());
                            if (!z10) {
                                o1.h hVar = this.F;
                                v1.i iVar2 = this.U;
                                o1.k kVarK = hVar.k();
                                try {
                                    kVarK.n(kVarK.f11507t, new a1.y1(iVar2, 25));
                                    kVarK.J();
                                    kVarK.e(true);
                                    this.B.a();
                                    this.B.o();
                                    iVar.c();
                                } catch (Throwable th2) {
                                    kVarK.e(false);
                                    throw th2;
                                }
                            }
                            iVar.b();
                            iVar.a();
                        } catch (Throwable th3) {
                            iVar.a();
                            throw th3;
                        }
                    }
                    g0 g0Var = this.V;
                    g0Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        g0Var.f9843b.x(g0Var);
                        g0Var.E.clear();
                        g0Var.f9858s.clear();
                        g0Var.f9846e.H();
                        g0Var.f9861v = null;
                        g0Var.f9842a.a();
                        Trace.endSection();
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        this.A.y(this);
    }

    public final void e(Object obj, boolean z10) {
        Object objG = this.G.g(obj);
        if (objG == null) {
            return;
        }
        boolean z11 = objG instanceof u.j0;
        u.j0 j0Var = this.H;
        u.j0 j0Var2 = this.I;
        u.i0 i0Var = this.M;
        if (!z11) {
            r1 r1Var = (r1) objG;
            if (va.a.b0(i0Var, obj, r1Var) || r1Var.c(obj) == m0.A) {
                return;
            }
            if (r1Var.f9924g == null || z10) {
                j0Var.a(r1Var);
                return;
            } else {
                j0Var2.a(r1Var);
                return;
            }
        }
        u.j0 j0Var3 = (u.j0) objG;
        Object[] objArr = j0Var3.f14865b;
        long[] jArr = j0Var3.f14864a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j9 = jArr[i10];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j9) < 128) {
                        r1 r1Var2 = (r1) objArr[(i10 << 3) + i12];
                        if (!va.a.b0(i0Var, obj, r1Var2) && r1Var2.c(obj) != m0.A) {
                            if (r1Var2.f9924g == null || z10) {
                                j0Var.a(r1Var2);
                            } else {
                                j0Var2.a(r1Var2);
                            }
                        }
                    }
                    j9 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void f(Set set, boolean z10) {
        long j9;
        long j10;
        long j11;
        char c10;
        long[] jArr;
        long[] jArr2;
        long j12;
        boolean zC;
        long[] jArr3;
        long j13;
        long[] jArr4;
        long[] jArr5;
        int i10;
        long j14;
        boolean zG;
        int i11;
        long j15;
        long[] jArr6;
        long[] jArr7;
        char c11;
        long j16;
        int i12;
        int i13;
        boolean z11 = set instanceof m1.h;
        u.i0 i0Var = this.J;
        Object obj = null;
        int i14 = 8;
        if (z11) {
            u.j0 j0Var = ((m1.h) set).A;
            Object[] objArr = j0Var.f14865b;
            long[] jArr8 = j0Var.f14864a;
            int length = jArr8.length - 2;
            if (length >= 0) {
                int i15 = 0;
                j9 = 128;
                j10 = 255;
                while (true) {
                    long j17 = jArr8[i15];
                    char c12 = 7;
                    j11 = -9187201950435737472L;
                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j17 & 255) < 128) {
                                Object obj2 = objArr[(i15 << 3) + i17];
                                c11 = c12;
                                if (obj2 instanceof r1) {
                                    ((r1) obj2).c(obj);
                                } else {
                                    e(obj2, z10);
                                    Object objG = i0Var.g(obj2);
                                    if (objG != null) {
                                        if (objG instanceof u.j0) {
                                            u.j0 j0Var2 = (u.j0) objG;
                                            Object[] objArr2 = j0Var2.f14865b;
                                            long[] jArr9 = j0Var2.f14864a;
                                            int length2 = jArr9.length - 2;
                                            if (length2 >= 0) {
                                                int i18 = i14;
                                                i12 = length;
                                                int i19 = 0;
                                                while (true) {
                                                    long j18 = jArr9[i19];
                                                    j16 = j17;
                                                    long[] jArr10 = jArr9;
                                                    if ((((~j18) << c11) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                                        int i21 = 0;
                                                        while (i21 < i20) {
                                                            if ((j18 & 255) < 128) {
                                                                e((w) objArr2[(i19 << 3) + i21], z10);
                                                            }
                                                            j18 >>= i18;
                                                            i21++;
                                                            jArr8 = jArr8;
                                                        }
                                                        jArr7 = jArr8;
                                                        if (i20 != i18) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr8;
                                                    }
                                                    if (i19 == length2) {
                                                        break;
                                                    }
                                                    i19++;
                                                    jArr9 = jArr10;
                                                    j17 = j16;
                                                    jArr8 = jArr7;
                                                    i18 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr8;
                                            j16 = j17;
                                            i12 = length;
                                            e((w) objG, z10);
                                        }
                                    }
                                    i13 = 8;
                                }
                                jArr7 = jArr8;
                                j16 = j17;
                                i12 = length;
                                i13 = 8;
                            } else {
                                jArr7 = jArr8;
                                c11 = c12;
                                j16 = j17;
                                i12 = length;
                                i13 = i14;
                            }
                            j17 = j16 >> i13;
                            i17++;
                            length = i12;
                            i14 = i13;
                            c12 = c11;
                            jArr8 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr8;
                        c10 = c12;
                        int i22 = length;
                        if (i16 != i14) {
                            break;
                        } else {
                            length = i22;
                        }
                    } else {
                        jArr6 = jArr8;
                        c10 = 7;
                    }
                    if (i15 == length) {
                        break;
                    }
                    i15++;
                    jArr8 = jArr6;
                    obj = null;
                    i14 = 8;
                }
            } else {
                j9 = 128;
                j10 = 255;
                j11 = -9187201950435737472L;
                c10 = 7;
            }
        } else {
            j9 = 128;
            j10 = 255;
            j11 = -9187201950435737472L;
            c10 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof r1) {
                    ((r1) obj3).c(null);
                } else {
                    e(obj3, z10);
                    Object objG2 = i0Var.g(obj3);
                    if (objG2 != null) {
                        if (objG2 instanceof u.j0) {
                            u.j0 j0Var3 = (u.j0) objG2;
                            Object[] objArr3 = j0Var3.f14865b;
                            long[] jArr11 = j0Var3.f14864a;
                            int length3 = jArr11.length - 2;
                            if (length3 >= 0) {
                                int i23 = 0;
                                while (true) {
                                    long j19 = jArr11[i23];
                                    if ((((~j19) << 7) & j19 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i23 != length3) {
                                            break;
                                            break;
                                        }
                                        i23++;
                                    } else {
                                        int i24 = 8 - ((~(i23 - length3)) >>> 31);
                                        for (int i25 = 0; i25 < i24; i25++) {
                                            if ((j19 & 255) < 128) {
                                                e((w) objArr3[(i23 << 3) + i25], z10);
                                            }
                                            j19 >>= 8;
                                        }
                                        if (i24 != 8) {
                                            break;
                                        } else if (i23 != length3) {
                                            break;
                                        } else {
                                            i23++;
                                        }
                                    }
                                }
                            }
                        } else {
                            e((w) objG2, z10);
                        }
                    }
                }
            }
        }
        u.i0 i0Var2 = this.G;
        u.j0 j0Var4 = this.H;
        if (z10) {
            u.j0 j0Var5 = this.I;
            if (j0Var5.h()) {
                long[] jArr12 = i0Var2.f14856a;
                int length4 = jArr12.length - 2;
                if (length4 >= 0) {
                    int i26 = 0;
                    while (true) {
                        long j20 = jArr12[i26];
                        if ((((~j20) << c10) & j20 & j11) != j11) {
                            int i27 = 8 - ((~(i26 - length4)) >>> 31);
                            int i28 = 0;
                            while (i28 < i27) {
                                if ((j20 & j10) < j9) {
                                    int i29 = (i26 << 3) + i28;
                                    Object obj4 = i0Var2.f14857b[i29];
                                    Object obj5 = i0Var2.f14858c[i29];
                                    if (obj5 instanceof u.j0) {
                                        u.j0 j0Var6 = (u.j0) obj5;
                                        Object[] objArr4 = j0Var6.f14865b;
                                        long[] jArr13 = j0Var6.f14864a;
                                        int length5 = jArr13.length - 2;
                                        if (length5 >= 0) {
                                            j14 = j20;
                                            int i30 = 0;
                                            while (true) {
                                                long j21 = jArr13[i30];
                                                jArr5 = jArr12;
                                                i10 = length4;
                                                if ((((~j21) << c10) & j21 & j11) != j11) {
                                                    int i31 = 8 - ((~(i30 - length5)) >>> 31);
                                                    for (int i32 = 0; i32 < i31; i32 = i11 + 1) {
                                                        if ((j21 & j10) < j9) {
                                                            i11 = i32;
                                                            int i33 = (i30 << 3) + i11;
                                                            j15 = j21;
                                                            r1 r1Var = (r1) objArr4[i33];
                                                            if (j0Var5.c(r1Var) || j0Var4.c(r1Var)) {
                                                                j0Var6.m(i33);
                                                            }
                                                        } else {
                                                            i11 = i32;
                                                            j15 = j21;
                                                        }
                                                        j21 = j15 >> 8;
                                                    }
                                                    if (i31 != 8) {
                                                        break;
                                                    }
                                                    if (i30 != length5) {
                                                        break;
                                                    }
                                                    i30++;
                                                    length4 = i10;
                                                    jArr12 = jArr5;
                                                } else if (i30 != length5) {
                                                    break;
                                                    break;
                                                } else {
                                                    i30++;
                                                    length4 = i10;
                                                    jArr12 = jArr5;
                                                }
                                            }
                                        } else {
                                            jArr5 = jArr12;
                                            i10 = length4;
                                            j14 = j20;
                                        }
                                        zG = j0Var6.g();
                                    } else {
                                        jArr5 = jArr12;
                                        i10 = length4;
                                        j14 = j20;
                                        kotlin.jvm.internal.m.c(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        r1 r1Var2 = (r1) obj5;
                                        zG = j0Var5.c(r1Var2) || j0Var4.c(r1Var2);
                                    }
                                    if (zG) {
                                        i0Var2.l(i29);
                                    }
                                } else {
                                    jArr5 = jArr12;
                                    i10 = length4;
                                    j14 = j20;
                                }
                                j20 = j14 >> 8;
                                i28++;
                                length4 = i10;
                                jArr12 = jArr5;
                            }
                            jArr4 = jArr12;
                            int i34 = length4;
                            if (i27 != 8) {
                                break;
                            } else {
                                length4 = i34;
                            }
                        } else {
                            jArr4 = jArr12;
                        }
                        if (i26 == length4) {
                            break;
                        }
                        i26++;
                        jArr12 = jArr4;
                    }
                }
                j0Var5.b();
                k();
                return;
            }
        }
        if (j0Var4.h()) {
            long[] jArr14 = i0Var2.f14856a;
            int length6 = jArr14.length - 2;
            if (length6 >= 0) {
                int i35 = 0;
                while (true) {
                    long j22 = jArr14[i35];
                    if ((((~j22) << c10) & j22 & j11) != j11) {
                        int i36 = 8 - ((~(i35 - length6)) >>> 31);
                        int i37 = 0;
                        while (i37 < i36) {
                            if ((j22 & j10) < j9) {
                                int i38 = (i35 << 3) + i37;
                                Object obj6 = i0Var2.f14857b[i38];
                                Object obj7 = i0Var2.f14858c[i38];
                                if (obj7 instanceof u.j0) {
                                    u.j0 j0Var7 = (u.j0) obj7;
                                    Object[] objArr5 = j0Var7.f14865b;
                                    long[] jArr15 = j0Var7.f14864a;
                                    int length7 = jArr15.length - 2;
                                    if (length7 >= 0) {
                                        j12 = j22;
                                        int i39 = 0;
                                        while (true) {
                                            long j23 = jArr15[i39];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr16 = jArr15;
                                            if ((((~j23) << c10) & j23 & j11) != j11) {
                                                int i40 = 8 - ((~(i39 - length7)) >>> 31);
                                                int i41 = 0;
                                                while (i41 < i40) {
                                                    if ((j23 & j10) < j9) {
                                                        jArr3 = jArr14;
                                                        int i42 = (i39 << 3) + i41;
                                                        j13 = j23;
                                                        if (j0Var4.c((r1) objArr6[i42])) {
                                                            j0Var7.m(i42);
                                                        }
                                                    } else {
                                                        jArr3 = jArr14;
                                                        j13 = j23;
                                                    }
                                                    i41++;
                                                    jArr14 = jArr3;
                                                    j23 = j13 >> 8;
                                                }
                                                jArr2 = jArr14;
                                                if (i40 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr14;
                                            }
                                            if (i39 == length7) {
                                                break;
                                            }
                                            i39++;
                                            objArr5 = objArr6;
                                            jArr15 = jArr16;
                                            jArr14 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr14;
                                        j12 = j22;
                                    }
                                    zC = j0Var7.g();
                                } else {
                                    jArr2 = jArr14;
                                    j12 = j22;
                                    kotlin.jvm.internal.m.c(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    zC = j0Var4.c((r1) obj7);
                                }
                                if (zC) {
                                    i0Var2.l(i38);
                                }
                            } else {
                                jArr2 = jArr14;
                                j12 = j22;
                            }
                            i37++;
                            j22 = j12 >> 8;
                            jArr14 = jArr2;
                        }
                        jArr = jArr14;
                        if (i36 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr14;
                    }
                    if (i35 == length6) {
                        break;
                    }
                    i35++;
                    jArr14 = jArr;
                }
            }
            k();
            j0Var4.b();
        }
    }

    public final void g() {
        synchronized (this.D) {
            try {
                h(this.K);
                q();
            } catch (Throwable th2) {
                try {
                    if (!this.E.A.g()) {
                        v1.i iVar = this.U;
                        try {
                            iVar.g(this.E, this.V.B());
                            iVar.b();
                        } finally {
                            iVar.a();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    d();
                    throw th3;
                }
            }
        }
    }

    public final void h(p1.a aVar) throws Throwable {
        k9.x0 x0Var;
        v1.i iVar;
        v1.i iVar2;
        long[] jArr;
        int i10;
        long[] jArr2;
        v1.i iVar3;
        long j9;
        char c10;
        long j10;
        int i11;
        boolean zG;
        long j11;
        p1.a aVar2 = this.L;
        g0 g0Var = this.V;
        a2.e eVarB = g0Var.B();
        v1.i iVar4 = this.U;
        iVar4.g(this.E, eVarB);
        try {
            if (aVar.f12244a.l0()) {
                try {
                    if (aVar2.f12244a.l0() && this.Q == null) {
                        iVar4.b();
                    }
                    return;
                } finally {
                    iVar4.a();
                }
            }
            k1 k1Var = this.Q;
            if (k1Var == null || (x0Var = k1Var.l) == null) {
                x0Var = this.B;
            }
            try {
                Trace.beginSection(x0Var.equals(k1Var != null ? k1Var.l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    k1 k1Var2 = this.Q;
                    if (k1Var2 == null || (iVar = k1Var2.f9890k) == null) {
                        iVar = iVar4;
                    }
                    o1.h hVar = this.F;
                    a2.e eVarB2 = g0Var.B();
                    o1.k kVarK = o1.j.d(hVar).k();
                    int i12 = 0;
                    try {
                        aVar.I(x0Var, kVarK, iVar, eVarB2);
                        kVarK.e(true);
                        x0Var.o();
                        Trace.endSection();
                        iVar4.c();
                        iVar4.d();
                        if (this.O) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.O = false;
                                u.i0 i0Var = this.G;
                                long[] jArr3 = i0Var.f14856a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i13 = 0;
                                    while (true) {
                                        long j12 = jArr3[i13];
                                        char c11 = 7;
                                        long j13 = -9187201950435737472L;
                                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i14 = 8;
                                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                                            int i16 = i12;
                                            while (i16 < i15) {
                                                if ((j12 & 255) < 128) {
                                                    c10 = c11;
                                                    int i17 = (i13 << 3) + i16;
                                                    j10 = j13;
                                                    Object obj = i0Var.f14857b[i17];
                                                    Object obj2 = i0Var.f14858c[i17];
                                                    if (obj2 instanceof u.j0) {
                                                        u.j0 j0Var = (u.j0) obj2;
                                                        Object[] objArr = j0Var.f14865b;
                                                        long[] jArr4 = j0Var.f14864a;
                                                        int i18 = i14;
                                                        int length2 = jArr4.length - 2;
                                                        i10 = i16;
                                                        jArr2 = jArr3;
                                                        iVar3 = iVar4;
                                                        if (length2 >= 0) {
                                                            int i19 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j14 = jArr4[i19];
                                                                    j9 = j12;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j14) << c10) & j14 & j10) == j10) {
                                                                        if (i19 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i19++;
                                                                        jArr4 = jArr5;
                                                                        j12 = j9;
                                                                        i18 = 8;
                                                                    } else {
                                                                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                                                        for (int i21 = 0; i21 < i20; i21++) {
                                                                            if ((j14 & 255) < 128) {
                                                                                j11 = j14;
                                                                                int i22 = (i19 << 3) + i21;
                                                                                if (!((r1) objArr[i22]).b()) {
                                                                                    j0Var.m(i22);
                                                                                }
                                                                            } else {
                                                                                j11 = j14;
                                                                            }
                                                                            j14 = j11 >> i18;
                                                                        }
                                                                        if (i20 != i18) {
                                                                            break;
                                                                        }
                                                                        if (i19 != length2) {
                                                                            break;
                                                                        }
                                                                        i19++;
                                                                        jArr4 = jArr5;
                                                                        j12 = j9;
                                                                        i18 = 8;
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j9 = j12;
                                                        }
                                                        zG = j0Var.g();
                                                    } else {
                                                        i10 = i16;
                                                        jArr2 = jArr3;
                                                        iVar3 = iVar4;
                                                        j9 = j12;
                                                        kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                        zG = !((r1) obj2).b();
                                                    }
                                                    if (zG) {
                                                        i0Var.l(i17);
                                                    }
                                                    i11 = 8;
                                                } else {
                                                    i10 = i16;
                                                    jArr2 = jArr3;
                                                    iVar3 = iVar4;
                                                    j9 = j12;
                                                    c10 = c11;
                                                    j10 = j13;
                                                    i11 = i14;
                                                }
                                                j12 = j9 >> i11;
                                                i16 = i10 + 1;
                                                i14 = i11;
                                                c11 = c10;
                                                j13 = j10;
                                                iVar4 = iVar3;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            iVar2 = iVar4;
                                            if (i15 != i14) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            iVar2 = iVar4;
                                        }
                                        if (i13 == length) {
                                            break;
                                        }
                                        i13++;
                                        iVar4 = iVar2;
                                        jArr3 = jArr;
                                        i12 = 0;
                                    }
                                } else {
                                    iVar2 = iVar4;
                                }
                                k();
                                Trace.endSection();
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            iVar2 = iVar4;
                        }
                        try {
                            if (aVar2.f12244a.l0() && this.Q == null) {
                                iVar2.b();
                            }
                            return;
                        } finally {
                            iVar2.a();
                        }
                    } catch (Throwable th4) {
                        try {
                            kVarK.e(false);
                            throw th4;
                        } catch (Throwable th5) {
                            th = th5;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
        }
        try {
            if (aVar2.f12244a.l0() && this.Q == null) {
                iVar4.b();
            }
            throw th;
        } finally {
            iVar4.a();
        }
    }

    public final void i() {
        synchronized (this.D) {
            try {
                p1.a aVar = this.L;
                aVar.getClass();
                if (!aVar.f12244a.l0()) {
                    h(this.L);
                }
            } catch (Throwable th2) {
                try {
                    if (!this.E.A.g()) {
                        v1.i iVar = this.U;
                        try {
                            iVar.g(this.E, this.V.B());
                            iVar.b();
                        } finally {
                            iVar.a();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    d();
                    throw th3;
                }
            }
        }
    }

    public final void j() {
        synchronized (this.D) {
            try {
                this.V.f9861v = null;
                if (!this.E.A.g()) {
                    v1.i iVar = this.U;
                    try {
                        iVar.g(this.E, this.V.B());
                        iVar.b();
                        iVar.a();
                    } catch (Throwable th2) {
                        iVar.a();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    if (!this.E.A.g()) {
                        v1.i iVar2 = this.U;
                        try {
                            iVar2.g(this.E, this.V.B());
                            iVar2.b();
                        } finally {
                            iVar2.a();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    d();
                    throw th4;
                }
            }
        }
    }

    public final void k() {
        char c10;
        long j9;
        long j10;
        long j11;
        long[] jArr;
        long[] jArr2;
        int i10;
        long j12;
        char c11;
        long j13;
        long j14;
        int i11;
        boolean zG;
        int i12;
        long j15;
        u.i0 i0Var = this.J;
        long[] jArr3 = i0Var.f14856a;
        int length = jArr3.length - 2;
        char c12 = 7;
        long j16 = -9187201950435737472L;
        int i13 = 8;
        if (length >= 0) {
            int i14 = 0;
            long j17 = 128;
            while (true) {
                long j18 = jArr3[i14];
                j10 = 255;
                if ((((~j18) << c12) & j18 & j16) != j16) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j18 & 255) < j17) {
                            c11 = c12;
                            int i17 = (i14 << 3) + i16;
                            j13 = j16;
                            Object obj = i0Var.f14857b[i17];
                            Object obj2 = i0Var.f14858c[i17];
                            boolean z10 = obj2 instanceof u.j0;
                            u.i0 i0Var2 = this.G;
                            if (z10) {
                                u.j0 j0Var = (u.j0) obj2;
                                Object[] objArr = j0Var.f14865b;
                                long[] jArr4 = j0Var.f14864a;
                                j14 = j17;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j12 = j18;
                                    int i18 = i13;
                                    int i19 = 0;
                                    while (true) {
                                        long j19 = jArr4[i19];
                                        jArr2 = jArr3;
                                        i10 = length;
                                        if ((((~j19) << c11) & j19 & j13) == j13) {
                                            if (i19 != length2) {
                                                break;
                                                break;
                                            }
                                            i19++;
                                            jArr3 = jArr2;
                                            length = i10;
                                            i18 = 8;
                                        } else {
                                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                            int i21 = 0;
                                            while (i21 < i20) {
                                                if ((j19 & 255) < j14) {
                                                    i12 = i21;
                                                    int i22 = (i19 << 3) + i12;
                                                    j15 = j19;
                                                    if (!i0Var2.c((w) objArr[i22])) {
                                                        j0Var.m(i22);
                                                    }
                                                } else {
                                                    i12 = i21;
                                                    j15 = j19;
                                                }
                                                j19 = j15 >> i18;
                                                i21 = i12 + 1;
                                            }
                                            if (i20 != i18) {
                                                break;
                                            }
                                            if (i19 != length2) {
                                                break;
                                            }
                                            i19++;
                                            jArr3 = jArr2;
                                            length = i10;
                                            i18 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i10 = length;
                                    j12 = j18;
                                }
                                zG = j0Var.g();
                            } else {
                                jArr2 = jArr3;
                                i10 = length;
                                j12 = j18;
                                j14 = j17;
                                kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                zG = !i0Var2.c((w) obj2);
                            }
                            if (zG) {
                                i0Var.l(i17);
                            }
                            i11 = 8;
                        } else {
                            jArr2 = jArr3;
                            i10 = length;
                            j12 = j18;
                            c11 = c12;
                            j13 = j16;
                            j14 = j17;
                            i11 = i13;
                        }
                        j18 = j12 >> i11;
                        i16++;
                        i13 = i11;
                        c12 = c11;
                        j16 = j13;
                        j17 = j14;
                        jArr3 = jArr2;
                        length = i10;
                    }
                    jArr = jArr3;
                    int i23 = length;
                    c10 = c12;
                    j9 = j16;
                    j11 = j17;
                    if (i15 != i13) {
                        break;
                    } else {
                        length = i23;
                    }
                } else {
                    jArr = jArr3;
                    c10 = c12;
                    j9 = j16;
                    j11 = j17;
                }
                if (i14 == length) {
                    break;
                }
                i14++;
                c12 = c10;
                j16 = j9;
                j17 = j11;
                jArr3 = jArr;
                i13 = 8;
            }
        } else {
            c10 = 7;
            j9 = -9187201950435737472L;
            j10 = 255;
            j11 = 128;
        }
        u.j0 j0Var2 = this.I;
        if (!j0Var2.h()) {
            return;
        }
        Object[] objArr2 = j0Var2.f14865b;
        long[] jArr5 = j0Var2.f14864a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i24 = 0;
        while (true) {
            long j20 = jArr5[i24];
            if ((((~j20) << c10) & j20 & j9) != j9) {
                int i25 = 8 - ((~(i24 - length3)) >>> 31);
                for (int i26 = 0; i26 < i25; i26++) {
                    if ((j20 & j10) < j11) {
                        int i27 = (i24 << 3) + i26;
                        if (!(((r1) objArr2[i27]).f9924g != null)) {
                            j0Var2.m(i27);
                        }
                    }
                    j20 >>= 8;
                }
                if (i25 != 8) {
                    return;
                }
            }
            if (i24 == length3) {
                return;
            } else {
                i24++;
            }
        }
    }

    public final boolean l() {
        boolean z10;
        synchronized (this.D) {
            z10 = true;
            if (this.W != 1) {
                z10 = false;
            }
            if (z10) {
                this.W = 0;
            }
        }
        return z10;
    }

    public final void m(u00.n nVar) {
        try {
            synchronized (this.D) {
                p();
                u.i0 i0Var = this.N;
                this.N = va.a.n();
                try {
                    g0 g0Var = this.V;
                    d2 d2Var = this.P;
                    if (!g0Var.f9846e.f12244a.l0()) {
                        l.a("Expected applyChanges() to have been called");
                    }
                    g0Var.P = d2Var;
                    try {
                        g0Var.p(i0Var, nVar);
                        g0Var.P = null;
                    } catch (Throwable th2) {
                        g0Var.P = null;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    this.N = i0Var;
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                if (!this.E.A.g()) {
                    v1.i iVar = this.U;
                    try {
                        iVar.g(this.E, this.V.B());
                        iVar.b();
                    } finally {
                        iVar.a();
                    }
                }
                throw th4;
            } catch (Throwable th5) {
                d();
                throw th5;
            }
        }
    }

    public final k1 n(boolean z10, u00.n nVar) {
        if (this.Q != null) {
            n1.b("A pausable composition is in progress");
        }
        k1 k1Var = new k1(this, this.A, this.V, this.E, nVar, z10, this.B, this.D);
        this.Q = k1Var;
        return k1Var;
    }

    public final void o() {
        synchronized (this.D) {
            try {
                if (this.Q != null) {
                    n1.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z10 = this.F.B == 0;
                if (!z10 || !this.E.A.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        v1.i iVar = this.U;
                        try {
                            iVar.g(this.E, this.V.B());
                            if (!z10) {
                                o1.h hVar = this.F;
                                v1.i iVar2 = this.U;
                                o1.k kVarK = hVar.k();
                                try {
                                    kVarK.n(kVarK.f11507t, new l0.g0(iVar2, kVarK, 3));
                                    kVarK.e(true);
                                    this.B.o();
                                    iVar.c();
                                } catch (Throwable th2) {
                                    kVarK.e(false);
                                    throw th2;
                                }
                            }
                            iVar.b();
                            iVar.a();
                            Trace.endSection();
                        } catch (Throwable th3) {
                            iVar.a();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
                this.G.a();
                this.J.a();
                this.N.a();
                this.K.H();
                this.L.H();
                g0 g0Var = this.V;
                g0Var.E.clear();
                g0Var.f9858s.clear();
                g0Var.f9846e.H();
                g0Var.f9861v = null;
                this.W = 1;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public final void p() throws KotlinNothingValueException {
        Object obj = q.f9906a;
        AtomicReference atomicReference = this.C;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                l.b("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                f((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                l.b("corrupt pendingModifications drain: " + atomicReference);
                throw new KotlinNothingValueException();
            }
            for (Set set : (Set[]) andSet) {
                f(set, true);
            }
        }
    }

    public final void q() throws KotlinNothingValueException {
        AtomicReference atomicReference = this.C;
        Object andSet = atomicReference.getAndSet(null);
        if (kotlin.jvm.internal.m.a(andSet, q.f9906a)) {
            return;
        }
        if (andSet instanceof Set) {
            f((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                f(set, false);
            }
            return;
        }
        if (andSet != null) {
            l.b("corrupt pendingModifications drain: " + atomicReference);
            throw new KotlinNothingValueException();
        }
        if (this.Q == null) {
            l.a("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    public final void r() throws KotlinNothingValueException {
        h00.z zVar = h00.z.A;
        AtomicReference atomicReference = this.C;
        Object andSet = atomicReference.getAndSet(zVar);
        if (kotlin.jvm.internal.m.a(andSet, q.f9906a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            f((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            l.b("corrupt pendingModifications drain: " + atomicReference);
            throw new KotlinNothingValueException();
        }
        for (Set set : (Set[]) andSet) {
            f(set, false);
        }
    }

    public final void s() {
        String str;
        int i10 = this.W;
        if (i10 != 0) {
            if (i10 == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i10 != 2) {
                str = i10 != 3 ? RuntimeVersion.SUFFIX : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            n1.b(str);
        }
        if (this.Q == null) {
            return;
        }
        n1.b("A pausable composition is in progress");
    }

    public final void t(ArrayList arrayList) {
        u.l0 l0Var = this.E;
        g0 g0Var = this.V;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((t0) ((g00.k) arrayList.get(i10)).A).f9932c.equals(this)) {
                l.a("Check failed");
                break;
            }
        }
        try {
            g0Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    g0Var.D(arrayList);
                    g0Var.j();
                    Trace.endSection();
                } catch (Throwable th2) {
                    g0Var.a();
                    throw th2;
                }
            } catch (Throwable th3) {
                Trace.endSection();
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                if (!l0Var.A.g()) {
                    v1.i iVar = this.U;
                    try {
                        iVar.g(l0Var, g0Var.B());
                        iVar.b();
                    } finally {
                        iVar.a();
                    }
                }
                throw th4;
            } catch (Throwable th5) {
                d();
                throw th5;
            }
        }
    }

    public final m0 u(r1 r1Var, o1.b bVar, Object obj) {
        synchronized (this.D) {
            try {
                p pVar = this.R;
                p pVar2 = null;
                if (pVar != null) {
                    o1.h hVar = this.F;
                    int i10 = this.S;
                    if (hVar.G) {
                        l.a("Writer is active");
                    }
                    if (i10 < 0 || i10 >= hVar.B) {
                        l.a("Invalid group index");
                    }
                    o1.b bVarQ = y3.q(bVar);
                    if (hVar.l(bVarQ)) {
                        int i11 = hVar.A[(i10 * 5) + 3] + i10;
                        int i12 = bVarQ.f11470a;
                        if (i10 > i12 || i12 >= i11) {
                            pVar = null;
                        }
                    } else {
                        pVar = null;
                    }
                    pVar2 = pVar;
                }
                if (pVar2 == null) {
                    g0 g0Var = this.V;
                    if (g0Var.F && g0Var.i0(r1Var, obj)) {
                        return m0.D;
                    }
                    if (obj != null && (obj instanceof w)) {
                        Object objG = this.N.g(r1Var);
                        if (objG == null) {
                            va.a.g(this.N, r1Var, obj);
                            break;
                        }
                        if (objG instanceof u.j0) {
                            u.j0 j0Var = (u.j0) objG;
                            Object[] objArr = j0Var.f14865b;
                            long[] jArr = j0Var.f14864a;
                            int length = jArr.length - 2;
                            if (length < 0) {
                                va.a.g(this.N, r1Var, obj);
                                break;
                            }
                            int i13 = 0;
                            loop0: while (true) {
                                long j9 = jArr[i13];
                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                                    for (int i15 = 0; i15 < i14; i15++) {
                                        if ((255 & j9) < 128 && objArr[(i13 << 3) + i15] == c.F) {
                                            break loop0;
                                        }
                                        j9 >>= 8;
                                    }
                                    if (i14 == 8) {
                                        if (i13 == length) {
                                            i13++;
                                        }
                                    }
                                    va.a.g(this.N, r1Var, obj);
                                    break;
                                }
                                if (i13 == length) {
                                    va.a.g(this.N, r1Var, obj);
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            if (objG != c.F) {
                                va.a.g(this.N, r1Var, obj);
                                break;
                            }
                        }
                    } else {
                        this.N.m(r1Var, c.F);
                    }
                }
                if (pVar2 != null) {
                    return pVar2.u(r1Var, bVar, obj);
                }
                this.A.n(this);
                return this.V.F ? m0.C : m0.B;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void v(Object obj) {
        Object objG = this.G.g(obj);
        if (objG == null) {
            return;
        }
        boolean z10 = objG instanceof u.j0;
        u.i0 i0Var = this.M;
        if (!z10) {
            r1 r1Var = (r1) objG;
            if (r1Var.c(obj) == m0.D) {
                va.a.g(i0Var, obj, r1Var);
                return;
            }
            return;
        }
        u.j0 j0Var = (u.j0) objG;
        Object[] objArr = j0Var.f14865b;
        long[] jArr = j0Var.f14864a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j9 = jArr[i10];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j9) < 128) {
                        r1 r1Var2 = (r1) objArr[(i10 << 3) + i12];
                        if (r1Var2.c(obj) == m0.D) {
                            va.a.g(i0Var, obj, r1Var2);
                        }
                    }
                    j9 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final boolean w(Set set) {
        boolean z10 = set instanceof m1.h;
        u.i0 i0Var = this.J;
        u.i0 i0Var2 = this.G;
        if (z10) {
            u.j0 j0Var = ((m1.h) set).A;
            Object[] objArr = j0Var.f14865b;
            long[] jArr = j0Var.f14864a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                loop0: while (true) {
                    long j9 = jArr[i10];
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j9) < 128) {
                                Object obj = objArr[(i10 << 3) + i12];
                                if (i0Var2.c(obj) || i0Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j9 >>= 8;
                        }
                        if (i11 == 8) {
                            if (i10 != length) {
                                i10++;
                            }
                        }
                    } else if (i10 != length) {
                        i10++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (i0Var2.c(obj2) || i0Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean x() {
        synchronized (this.D) {
            k1 k1Var = this.Q;
            boolean z10 = false;
            if (k1Var != null && (k1Var.f9887h.get() != l1.E || k1Var.f9888i != v1.d.b())) {
                k1Var.f9887h.compareAndSet(l1.F, l1.D);
                ((u.v) k1Var.l.B).a(9);
                return false;
            }
            p();
            try {
                u.i0 i0Var = this.N;
                this.N = va.a.n();
                try {
                    g0 g0Var = this.V;
                    d2 d2Var = this.P;
                    p1.l0 l0Var = g0Var.f9846e.f12244a;
                    if (!l0Var.l0()) {
                        l.a("Expected applyChanges() to have been called");
                    }
                    if (i0Var.f14860e > 0 || !g0Var.f9858s.isEmpty()) {
                        g0Var.P = d2Var;
                        try {
                            g0Var.p(i0Var, null);
                            g0Var.P = null;
                            z10 = !l0Var.l0();
                        } catch (Throwable th2) {
                            g0Var.P = null;
                            throw th2;
                        }
                    }
                    if (!z10) {
                        q();
                    }
                    return z10;
                } catch (Throwable th3) {
                    this.N = i0Var;
                    throw th3;
                }
            } catch (Throwable th4) {
                try {
                    if (!this.E.A.g()) {
                        v1.i iVar = this.U;
                        try {
                            iVar.g(this.E, this.V.B());
                            iVar.b();
                        } finally {
                            iVar.a();
                        }
                    }
                    throw th4;
                } catch (Throwable th5) {
                    d();
                    throw th5;
                }
            }
        }
    }

    public final void y(m1.h hVar) {
        Object obj;
        Object obj2;
        do {
            obj = this.C.get();
            if (obj == null || obj.equals(q.f9906a)) {
                obj2 = hVar;
            } else if (obj instanceof Set) {
                obj2 = new Set[]{obj, hVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.C).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = hVar;
                obj2 = objArrCopyOf;
            }
        } while (!this.C.compareAndSet(obj, obj2));
        if (obj == null) {
            synchronized (this.D) {
                q();
            }
        }
    }

    public final void z(Object obj) {
        synchronized (this.D) {
            try {
                v(obj);
                Object objG = this.J.g(obj);
                if (objG != null) {
                    if (objG instanceof u.j0) {
                        u.j0 j0Var = (u.j0) objG;
                        Object[] objArr = j0Var.f14865b;
                        long[] jArr = j0Var.f14864a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i10 = 0;
                            while (true) {
                                long j9 = jArr[i10];
                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i10 != length) {
                                        break;
                                        break;
                                    }
                                    i10++;
                                } else {
                                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        if ((255 & j9) < 128) {
                                            v((w) objArr[(i10 << 3) + i12]);
                                        }
                                        j9 >>= 8;
                                    }
                                    if (i11 != 8) {
                                        break;
                                    } else if (i10 != length) {
                                        break;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                        }
                    } else {
                        v((w) objG);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
