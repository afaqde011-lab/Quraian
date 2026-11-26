package z1;

import java.util.HashMap;
import sd.p1;
import u.j0;
import z.y0;

public abstract class l {

    public static final y0 f17036a = new y0(5);

    public static final p1 f17037b = new p1(14);

    public static final Object f17038c = new Object();

    public static j f17039d;

    public static long f17040e;

    public static final oj.m f17041f;

    public static final c50.h f17042g;

    public static Object f17043h;

    public static Object f17044i;

    public static final a f17045j;

    public static final v1.a f17046k;

    static {
        j jVar = j.E;
        f17039d = jVar;
        long j9 = 1;
        f17040e = j9 + j9;
        oj.m mVar = new oj.m();
        mVar.f12097c = new long[16];
        mVar.f12098d = new int[16];
        ?? r7 = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            r7[i10] = i11;
            i10 = i11;
        }
        mVar.f12099e = r7;
        f17041f = mVar;
        c50.h hVar = new c50.h((char) 0, 25);
        hVar.C = new int[16];
        hVar.D = new v1.l[16];
        f17042g = hVar;
        h00.x xVar = h00.x.A;
        f17043h = xVar;
        f17044i = xVar;
        long j10 = f17040e;
        f17040e = j9 + j10;
        a aVar = new a(j10, jVar, null, new y0(4));
        f17039d = f17039d.i(aVar.f17020b);
        f17045j = aVar;
        f17046k = new v1.a(0);
    }

    public static final void a() {
        e(f17036a);
    }

    public static final HashMap b(long j9, b bVar, j jVar) {
        long[] jArr;
        j jVar2;
        long[] jArr2;
        int i10;
        int i11;
        b0 b0VarS;
        j0 j0VarX = bVar.x();
        if (j0VarX != null) {
            long jG = bVar.g();
            j jVarH = bVar.d().i(jG).h(bVar.f17007j);
            Object[] objArr = j0VarX.f14865b;
            long[] jArr3 = j0VarX.f14864a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i12 = 0;
                HashMap map = null;
                while (true) {
                    long j10 = jArr3[i12];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8;
                        int i14 = 8 - ((~(i12 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j10 & 255) < 128) {
                                z zVar = (z) objArr[(i12 << 3) + i15];
                                b0 b0VarA = zVar.a();
                                jArr2 = jArr3;
                                i10 = i13;
                                i11 = i15;
                                b0 b0VarS2 = s(b0VarA, j9, jVar);
                                if (b0VarS2 != null && (b0VarS = s(b0VarA, jG, jVarH)) != null && !b0VarS2.equals(b0VarS)) {
                                    b0 b0VarS3 = s(b0VarA, jG, bVar.d());
                                    if (b0VarS3 == null) {
                                        r();
                                        throw null;
                                    }
                                    b0 b0VarC = zVar.c(b0VarS, b0VarS2, b0VarS3);
                                    if (b0VarC == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(b0VarS2, b0VarC);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i10 = i13;
                                i11 = i15;
                            }
                            j10 >>= i10;
                            i15 = i11 + 1;
                            i13 = i10;
                            jArr3 = jArr2;
                            jVarH = jVarH;
                        }
                        jArr = jArr3;
                        jVar2 = jVarH;
                        if (i14 != i13) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        jVar2 = jVarH;
                    }
                    if (i12 == length) {
                        return map;
                    }
                    i12++;
                    jArr3 = jArr;
                    jVarH = jVar2;
                }
            }
        }
        return null;
    }

    public static final void c(f fVar) {
        long j9;
        if (f17039d.e(fVar.g())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Snapshot is not open: snapshotId=");
        sb2.append(fVar.g());
        sb2.append(", disposed=");
        sb2.append(fVar.f17021c);
        sb2.append(", applied=");
        b bVar = fVar instanceof b ? (b) fVar : null;
        sb2.append(bVar != null ? Boolean.valueOf(bVar.m) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (f17038c) {
            oj.m mVar = f17041f;
            j9 = mVar.f12095a > 0 ? ((long[]) mVar.f12097c)[0] : -1L;
        }
        sb2.append(j9);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final j d(j jVar, long j9, long j10) {
        while (kotlin.jvm.internal.m.g(j9, j10) < 0) {
            jVar = jVar.i(j9);
            j9 += (long) 1;
        }
        return jVar;
    }

    public static final Object e(u00.k kVar) {
        j0 j0Var;
        Object objV;
        a aVar = f17045j;
        synchronized (f17038c) {
            try {
                j0Var = aVar.f17005h;
                if (j0Var != null) {
                    f17046k.addAndGet(1);
                }
                objV = v(aVar, kVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (j0Var != null) {
            try {
                ?? r4 = f17043h;
                m1.h hVar = new m1.h(j0Var);
                int size = r4.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((u00.n) r4.get(i10)).invoke(hVar, aVar);
                }
                f17046k.addAndGet(-1);
            } catch (Throwable th3) {
                f17046k.addAndGet(-1);
                throw th3;
            }
        }
        synchronized (f17038c) {
            f();
            if (j0Var != null) {
                Object[] objArr = j0Var.f14865b;
                long[] jArr = j0Var.f14864a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j9 = jArr[i11];
                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i11 != length) {
                                break;
                                break;
                            }
                            i11++;
                        } else {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j9) < 128) {
                                    q((z) objArr[(i11 << 3) + i13]);
                                }
                                j9 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                            if (i11 != length) {
                                break;
                            }
                            i11++;
                        }
                    }
                }
            }
        }
        return objV;
    }

    public static final void f() {
        c50.h hVar = f17042g;
        int i10 = hVar.B;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            v1.l lVar = ((v1.l[]) hVar.D)[i11];
            Object obj = lVar != null ? lVar.get() : null;
            if (obj != null && p((z) obj)) {
                if (i12 != i11) {
                    ((v1.l[]) hVar.D)[i12] = lVar;
                    int[] iArr = (int[]) hVar.C;
                    iArr[i12] = iArr[i11];
                }
                i12++;
            }
            i11++;
        }
        for (int i13 = i12; i13 < i10; i13++) {
            ((v1.l[]) hVar.D)[i13] = null;
            ((int[]) hVar.C)[i13] = 0;
        }
        if (i12 != i10) {
            hVar.B = i12;
        }
    }

    public static final f g(f fVar, u00.k kVar, boolean z10) {
        boolean z11 = fVar instanceof b;
        if (z11 || fVar == null) {
            return new f0(z11 ? (b) fVar : null, kVar, null, false, z10);
        }
        return new g0(fVar, kVar, false, z10);
    }

    public static final b0 h(b0 b0Var) {
        b0 b0VarS;
        f fVarJ = j();
        b0 b0VarS2 = s(b0Var, fVarJ.g(), fVarJ.d());
        if (b0VarS2 != null) {
            return b0VarS2;
        }
        synchronized (f17038c) {
            f fVarJ2 = j();
            b0VarS = s(b0Var, fVarJ2.g(), fVarJ2.d());
        }
        if (b0VarS != null) {
            return b0VarS;
        }
        r();
        throw null;
    }

    public static final b0 i(b0 b0Var, f fVar) {
        b0 b0VarS;
        b0 b0VarS2 = s(b0Var, fVar.g(), fVar.d());
        if (b0VarS2 != null) {
            return b0VarS2;
        }
        synchronized (f17038c) {
            b0VarS = s(b0Var, fVar.g(), fVar.d());
        }
        if (b0VarS != null) {
            return b0VarS;
        }
        r();
        throw null;
    }

    public static final f j() {
        f fVar = (f) f17037b.get();
        return fVar == null ? f17045j : fVar;
    }

    public static final u00.k k(boolean z10, u00.k kVar, u00.k kVar2) {
        if (!z10) {
            kVar2 = null;
        }
        if (kVar == null || kVar2 == null || kVar == kVar2) {
            return kVar == null ? kVar2 : kVar;
        }
        return new k(kVar, kVar2, 0);
    }

    public static final u00.k l(u00.k kVar, u00.k kVar2) {
        if (kVar == null || kVar2 == null || kVar == kVar2) {
            return kVar == null ? kVar2 : kVar;
        }
        return new k(kVar, kVar2, 1);
    }

    public static final b0 m(b0 b0Var, z zVar) {
        long j9 = f17040e;
        oj.m mVar = f17041f;
        if (mVar.f12095a > 0) {
            j9 = ((long[]) mVar.f12097c)[0];
        }
        long j10 = j9 - ((long) 1);
        b0 b0Var2 = null;
        b0 b0Var3 = null;
        for (b0 b0VarA = zVar.a(); b0VarA != null; b0VarA = b0VarA.f17010b) {
            long j11 = b0VarA.f17009a;
            if (j11 != 0) {
                if (j11 != 0 && kotlin.jvm.internal.m.g(j11, j10) <= 0 && !j.E.e(j11)) {
                    if (b0Var3 != null) {
                        if (kotlin.jvm.internal.m.g(b0VarA.f17009a, b0Var3.f17009a) >= 0) {
                            b0Var2 = b0Var3;
                            break;
                        }
                        break;
                    }
                    b0Var3 = b0VarA;
                }
            }
            b0Var2 = b0VarA;
            break;
        }
        if (b0Var2 != null) {
            b0Var2.f17009a = Long.MAX_VALUE;
            return b0Var2;
        }
        b0 b0VarC = b0Var.c(Long.MAX_VALUE);
        b0VarC.f17010b = zVar.a();
        zVar.e(b0VarC);
        return b0VarC;
    }

    public static final void n(f fVar, z zVar) {
        fVar.t(fVar.h() + 1);
        u00.k kVarI = fVar.i();
        if (kVarI != null) {
            kVarI.invoke(zVar);
        }
    }

    public static final b0 o(b0 b0Var, a0 a0Var, f fVar, b0 b0Var2) {
        b0 b0VarM;
        if (fVar.f()) {
            fVar.n(a0Var);
        }
        long jG = fVar.g();
        if (b0Var2.f17009a == jG) {
            return b0Var2;
        }
        synchronized (f17038c) {
            b0VarM = m(b0Var, a0Var);
        }
        b0VarM.f17009a = jG;
        if (b0Var2.f17009a != 1) {
            fVar.n(a0Var);
        }
        return b0VarM;
    }

    public static final boolean p(z zVar) {
        b0 b0Var;
        long j9 = f17040e;
        oj.m mVar = f17041f;
        if (mVar.f12095a > 0) {
            j9 = ((long[]) mVar.f12097c)[0];
        }
        b0 b0Var2 = null;
        b0 b0VarA = null;
        int i10 = 0;
        for (b0 b0VarA2 = zVar.a(); b0VarA2 != null; b0VarA2 = b0VarA2.f17010b) {
            long j10 = b0VarA2.f17009a;
            if (j10 != 0) {
                if (kotlin.jvm.internal.m.g(j10, j9) >= 0) {
                    i10++;
                } else if (b0Var2 == null) {
                    i10++;
                    b0Var2 = b0VarA2;
                } else {
                    if (kotlin.jvm.internal.m.g(b0VarA2.f17009a, b0Var2.f17009a) < 0) {
                        b0Var = b0Var2;
                        b0Var2 = b0VarA2;
                    } else {
                        b0Var = b0VarA2;
                    }
                    if (b0VarA == null) {
                        b0VarA = zVar.a();
                        b0 b0Var3 = b0VarA;
                        while (true) {
                            if (b0VarA == null) {
                                b0VarA = b0Var3;
                                break;
                            }
                            if (kotlin.jvm.internal.m.g(b0VarA.f17009a, j9) >= 0) {
                                break;
                            }
                            if (kotlin.jvm.internal.m.g(b0Var3.f17009a, b0VarA.f17009a) < 0) {
                                b0Var3 = b0VarA;
                            }
                            b0VarA = b0VarA.f17010b;
                        }
                    }
                    b0Var2.f17009a = 0L;
                    b0Var2.a(b0VarA);
                    b0Var2 = b0Var;
                }
            }
        }
        return i10 > 1;
    }

    public static final void q(z zVar) {
        if (p(zVar)) {
            c50.h hVar = f17042g;
            int i10 = hVar.B;
            int iIdentityHashCode = System.identityHashCode(zVar);
            int i11 = -1;
            if (i10 > 0) {
                int i12 = hVar.B - 1;
                int i13 = 0;
                while (true) {
                    if (i13 > i12) {
                        i11 = -(i13 + 1);
                        break;
                    }
                    int i14 = (i13 + i12) >>> 1;
                    int i15 = ((int[]) hVar.C)[i14];
                    if (i15 < iIdentityHashCode) {
                        i13 = i14 + 1;
                    } else if (i15 > iIdentityHashCode) {
                        i12 = i14 - 1;
                    } else {
                        v1.l lVar = ((v1.l[]) hVar.D)[i14];
                        if (zVar == (lVar != null ? lVar.get() : null)) {
                            i11 = i14;
                            break;
                        }
                        int i16 = i14 - 1;
                        while (true) {
                            if (-1 >= i16 || ((int[]) hVar.C)[i16] != iIdentityHashCode) {
                                i14++;
                                int i17 = hVar.B;
                                while (true) {
                                    if (i14 >= i17) {
                                        i11 = -(hVar.B + 1);
                                        break;
                                    }
                                    if (((int[]) hVar.C)[i14] != iIdentityHashCode) {
                                        i11 = -(i14 + 1);
                                        break;
                                    }
                                    v1.l lVar2 = ((v1.l[]) hVar.D)[i14];
                                    if ((lVar2 != null ? lVar2.get() : null) == zVar) {
                                        i11 = i14;
                                        break;
                                    }
                                    i14++;
                                }
                            } else {
                                v1.l lVar3 = ((v1.l[]) hVar.D)[i16];
                                if ((lVar3 != null ? lVar3.get() : null) == zVar) {
                                    i11 = i16;
                                    break;
                                }
                                i16--;
                            }
                        }
                    }
                }
                if (i11 >= 0) {
                    return;
                }
            }
            int i18 = -(i11 + 1);
            v1.l[] lVarArr = (v1.l[]) hVar.D;
            int length = lVarArr.length;
            if (i10 == length) {
                int i19 = length * 2;
                v1.l[] lVarArr2 = new v1.l[i19];
                int[] iArr = new int[i19];
                int i20 = i18 + 1;
                System.arraycopy(lVarArr, i18, lVarArr2, i20, i10 - i18);
                System.arraycopy((v1.l[]) hVar.D, 0, lVarArr2, 0, i18);
                h00.n.p0(i20, i18, i10, (int[]) hVar.C, iArr);
                h00.n.u0(0, i18, 6, (int[]) hVar.C, iArr);
                hVar.D = lVarArr2;
                hVar.C = iArr;
            } else {
                int i21 = i18 + 1;
                System.arraycopy(lVarArr, i18, lVarArr, i21, i10 - i18);
                int[] iArr2 = (int[]) hVar.C;
                h00.n.p0(i21, i18, i10, iArr2, iArr2);
            }
            ((v1.l[]) hVar.D)[i18] = new v1.l(zVar);
            ((int[]) hVar.C)[i18] = iIdentityHashCode;
            hVar.B++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final b0 s(b0 b0Var, long j9, j jVar) {
        b0 b0Var2 = null;
        while (b0Var != null) {
            long j10 = b0Var.f17009a;
            if (j10 != 0 && kotlin.jvm.internal.m.g(j10, j9) <= 0 && !jVar.e(j10) && (b0Var2 == null || kotlin.jvm.internal.m.g(b0Var2.f17009a, b0Var.f17009a) < 0)) {
                b0Var2 = b0Var;
            }
            b0Var = b0Var.f17010b;
        }
        if (b0Var2 != null) {
            return b0Var2;
        }
        return null;
    }

    public static final b0 t(b0 b0Var, z zVar) {
        b0 b0VarS;
        f fVarJ = j();
        u00.k kVarE = fVarJ.e();
        if (kVarE != null) {
            kVarE.invoke(zVar);
        }
        b0 b0VarS2 = s(b0Var, fVarJ.g(), fVarJ.d());
        if (b0VarS2 != null) {
            return b0VarS2;
        }
        synchronized (f17038c) {
            f fVarJ2 = j();
            b0 b0VarA = zVar.a();
            kotlin.jvm.internal.m.c(b0VarA, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            b0VarS = s(b0VarA, fVarJ2.g(), fVarJ2.d());
            if (b0VarS == null) {
                r();
                throw null;
            }
        }
        return b0VarS;
    }

    public static final void u(int i10) {
        oj.m mVar = f17041f;
        int i11 = ((int[]) mVar.f12099e)[i10];
        mVar.g(i11, mVar.f12095a - 1);
        mVar.f12095a--;
        long[] jArr = (long[]) mVar.f12097c;
        long j9 = jArr[i11];
        int i12 = i11;
        while (i12 > 0) {
            int i13 = ((i12 + 1) >> 1) - 1;
            if (kotlin.jvm.internal.m.g(jArr[i13], j9) <= 0) {
                break;
            }
            mVar.g(i13, i12);
            i12 = i13;
        }
        long[] jArr2 = (long[]) mVar.f12097c;
        int i14 = mVar.f12095a >> 1;
        while (i11 < i14) {
            int i15 = (i11 + 1) << 1;
            int i16 = i15 - 1;
            if (i15 < mVar.f12095a && kotlin.jvm.internal.m.g(jArr2[i15], jArr2[i16]) < 0) {
                if (kotlin.jvm.internal.m.g(jArr2[i15], jArr2[i11]) >= 0) {
                    break;
                }
                mVar.g(i15, i11);
                i11 = i15;
            } else {
                if (kotlin.jvm.internal.m.g(jArr2[i16], jArr2[i11]) >= 0) {
                    break;
                }
                mVar.g(i16, i11);
                i11 = i16;
            }
        }
        ((int[]) mVar.f12099e)[i10] = mVar.f12096b;
        mVar.f12096b = i10;
    }

    public static final Object v(a aVar, u00.k kVar) {
        long j9 = aVar.f17020b;
        Object objInvoke = kVar.invoke(f17039d.c(j9));
        long j10 = f17040e;
        f17040e = ((long) 1) + j10;
        j jVarC = f17039d.c(j9);
        f17039d = jVarC;
        aVar.f17020b = j10;
        aVar.f17019a = jVarC;
        aVar.f17004g = 0;
        aVar.f17005h = null;
        aVar.o();
        f17039d = f17039d.i(j10);
        return objInvoke;
    }

    public static final b0 w(b0 b0Var, z zVar, f fVar) {
        b0 b0VarS;
        if (fVar.f()) {
            fVar.n(zVar);
        }
        long jG = fVar.g();
        b0 b0VarS2 = s(b0Var, jG, fVar.d());
        if (b0VarS2 == null) {
            r();
            throw null;
        }
        if (b0VarS2.f17009a == fVar.g()) {
            return b0VarS2;
        }
        synchronized (f17038c) {
            b0VarS = s(zVar.a(), jG, fVar.d());
            if (b0VarS == null) {
                r();
                throw null;
            }
            if (b0VarS.f17009a != jG) {
                b0 b0VarM = m(b0VarS, zVar);
                b0VarM.a(b0VarS);
                b0VarM.f17009a = fVar.g();
                b0VarS = b0VarM;
            }
        }
        if (b0VarS2.f17009a != 1) {
            fVar.n(zVar);
        }
        return b0VarS;
    }
}
