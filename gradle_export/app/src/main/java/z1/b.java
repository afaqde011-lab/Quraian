package z1;

import java.util.ArrayList;
import java.util.HashMap;
import l1.n1;
import u.j0;
import u.r0;
import z.y0;

public class b extends f {

    public static final int[] f17001n = new int[0];

    public final u00.k f17002e;

    public final u00.k f17003f;

    public int f17004g;

    public j0 f17005h;

    public ArrayList f17006i;

    public j f17007j;

    public int[] f17008k;
    public int l;
    public boolean m;

    public b(long j9, j jVar, u00.k kVar, u00.k kVar2) {
        super(j9, jVar);
        this.f17002e = kVar;
        this.f17003f = kVar2;
        this.f17007j = j.E;
        this.f17008k = f17001n;
        this.l = 1;
    }

    public final void A(long j9) {
        synchronized (l.f17038c) {
            this.f17007j = this.f17007j.i(j9);
        }
    }

    public void B(j0 j0Var) {
        this.f17005h = j0Var;
    }

    public b C(u00.k kVar, u00.k kVar2) {
        long j9;
        c cVar;
        if (this.f17021c) {
            n1.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.f17022d < 0) {
            n1.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = l.f17038c;
        synchronized (obj) {
            long j10 = l.f17040e;
            j9 = 1;
            l.f17040e = j10 + j9;
            l.f17039d = l.f17039d.i(j10);
            j jVarD = d();
            r(jVarD.i(j10));
            cVar = new c(j10, l.d(jVarD, g() + j9, j10), l.k(true, kVar, e()), l.l(kVar2, i()), this);
        }
        if (this.m || this.f17021c) {
            return cVar;
        }
        long jG = g();
        synchronized (obj) {
            long j11 = l.f17040e;
            l.f17040e = j11 + j9;
            s(j11);
            l.f17039d = l.f17039d.i(g());
        }
        r(l.d(d(), jG + j9, g()));
        return cVar;
    }

    @Override
    public final void b() {
        l.f17039d = l.f17039d.c(g()).a(this.f17007j);
    }

    @Override
    public void c() {
        if (this.f17021c) {
            return;
        }
        this.f17021c = true;
        synchronized (l.f17038c) {
            o();
        }
        l();
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public int h() {
        return this.f17004g;
    }

    @Override
    public u00.k i() {
        return this.f17003f;
    }

    @Override
    public void k() {
        this.l++;
    }

    @Override
    public void l() {
        if (this.l <= 0) {
            n1.a("no pending nested snapshots");
        }
        int i10 = this.l - 1;
        this.l = i10;
        if (i10 != 0 || this.m) {
            return;
        }
        j0 j0VarX = x();
        if (j0VarX != null) {
            if (this.m) {
                n1.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = j0VarX.f14865b;
            long[] jArr = j0VarX.f14864a;
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
                                for (b0 b0VarA = ((z) objArr[(i11 << 3) + i13]).a(); b0VarA != null; b0VarA = b0VarA.f17010b) {
                                    long j10 = b0VarA.f17009a;
                                    if (j10 == jG || h00.q.F0(this.f17007j, Long.valueOf(j10))) {
                                        y0 y0Var = l.f17036a;
                                        b0VarA.f17009a = 0L;
                                    }
                                }
                            }
                            j9 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        } else if (i11 != length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override
    public void m() {
        if (this.m || this.f17021c) {
            return;
        }
        v();
    }

    @Override
    public void n(z zVar) {
        j0 j0VarX = x();
        if (j0VarX == null) {
            j0 j0Var = r0.f14890a;
            j0VarX = new j0();
            B(j0VarX);
        }
        j0VarX.a(zVar);
    }

    @Override
    public final void p() {
        int length = this.f17008k.length;
        for (int i10 = 0; i10 < length; i10++) {
            l.u(this.f17008k[i10]);
        }
        o();
    }

    @Override
    public void t(int i10) {
        this.f17004g = i10;
    }

    @Override
    public f u(u00.k kVar) {
        long j9;
        d dVar;
        if (this.f17021c) {
            n1.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.f17022d < 0) {
            n1.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = l.f17038c;
        synchronized (obj) {
            long j10 = l.f17040e;
            j9 = 1;
            l.f17040e = j10 + j9;
            l.f17039d = l.f17039d.i(j10);
            dVar = new d(j10, l.d(d(), jG + j9, j10), l.k(true, kVar, e()), this);
        }
        if (this.m || this.f17021c) {
            return dVar;
        }
        long jG2 = g();
        synchronized (obj) {
            long j11 = l.f17040e;
            l.f17040e = j11 + j9;
            s(j11);
            l.f17039d = l.f17039d.i(g());
        }
        r(l.d(d(), jG2 + j9, g()));
        return dVar;
    }

    public final void v() {
        long j9;
        A(g());
        if (this.m || this.f17021c) {
            return;
        }
        long jG = g();
        synchronized (l.f17038c) {
            long j10 = l.f17040e;
            j9 = 1;
            l.f17040e = j10 + j9;
            s(j10);
            l.f17039d = l.f17039d.i(g());
        }
        r(l.d(d(), jG + j9, g()));
    }

    public q w() {
        HashMap mapB;
        ?? r4;
        j0 j0Var;
        long j9;
        long j10;
        j0 j0VarX = x();
        if (j0VarX != null) {
            long j11 = l.f17045j.f17020b;
            mapB = l.b(j11, this, l.f17039d.c(j11));
        } else {
            mapB = null;
        }
        h00.x xVar = h00.x.A;
        synchronized (l.f17038c) {
            try {
                l.c(this);
                if (j0VarX == null || j0VarX.f14867d == 0) {
                    b();
                    a aVar = l.f17045j;
                    j0 j0Var2 = aVar.f17005h;
                    l.v(aVar, l.f17036a);
                    if (j0Var2 == null || !j0Var2.h()) {
                        r4 = xVar;
                        j0Var = null;
                    } else {
                        r4 = l.f17043h;
                        j0Var = j0Var2;
                    }
                } else {
                    a aVar2 = l.f17045j;
                    q qVarZ = z(l.f17040e, j0VarX, mapB, l.f17039d.c(aVar2.f17020b));
                    if (!qVarZ.equals(h.f17035d)) {
                        return qVarZ;
                    }
                    b();
                    j0Var = aVar2.f17005h;
                    l.v(aVar2, l.f17036a);
                    B(null);
                    aVar2.f17005h = null;
                    r4 = l.f17043h;
                }
                this.m = true;
                if (j0Var != null) {
                    m1.h hVar = new m1.h(j0Var);
                    if (!j0Var.g()) {
                        int size = r4.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ((u00.n) r4.get(i10)).invoke(hVar, this);
                        }
                    }
                }
                if (j0VarX != null && j0VarX.h()) {
                    m1.h hVar2 = new m1.h(j0VarX);
                    int size2 = r4.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((u00.n) r4.get(i11)).invoke(hVar2, this);
                    }
                }
                synchronized (l.f17038c) {
                    try {
                        p();
                        l.f();
                        if (j0Var != null) {
                            Object[] objArr = j0Var.f14865b;
                            long[] jArr = j0Var.f14864a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i12 = 0;
                                j9 = 128;
                                while (true) {
                                    long j12 = jArr[i12];
                                    j10 = 255;
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j12 & 255) < 128) {
                                                l.q((z) objArr[(i12 << 3) + i14]);
                                            }
                                            j12 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                        if (i12 != length) {
                                            break;
                                        }
                                        i12++;
                                    }
                                }
                            } else {
                                j9 = 128;
                                j10 = 255;
                            }
                        } else {
                            j9 = 128;
                            j10 = 255;
                        }
                        if (j0VarX != null) {
                            Object[] objArr2 = j0VarX.f14865b;
                            long[] jArr2 = j0VarX.f14864a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j13 = jArr2[i15];
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i15 != length2) {
                                            break;
                                            break;
                                        }
                                        i15++;
                                    } else {
                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                        for (int i17 = 0; i17 < i16; i17++) {
                                            if ((j13 & j10) < j9) {
                                                l.q((z) objArr2[(i15 << 3) + i17]);
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i16 != 8) {
                                            break;
                                        }
                                        if (i15 != length2) {
                                            break;
                                        }
                                        i15++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.f17006i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i18 = 0; i18 < size3; i18++) {
                                l.q((z) arrayList.get(i18));
                            }
                        }
                        this.f17006i = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return h.f17035d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public j0 x() {
        return this.f17005h;
    }

    @Override
    public u00.k e() {
        return this.f17002e;
    }

    public final q z(long j9, j0 j0Var, HashMap map, j jVar) {
        ArrayList arrayList;
        ArrayList arrayListY0;
        ArrayList arrayList2;
        int size;
        int i10;
        ArrayList arrayList3;
        int size2;
        int i11;
        z zVar;
        b0 b0Var;
        j jVar2;
        Object[] objArr;
        long[] jArr;
        j jVar3;
        Object[] objArr2;
        long[] jArr2;
        int i12;
        long j10;
        ArrayList arrayList4;
        b0 b0VarC;
        j jVarH = d().i(g()).h(this.f17007j);
        Object[] objArr3 = j0Var.f14865b;
        long[] jArr3 = j0Var.f14864a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i13 = 0;
            arrayList2 = null;
            arrayListY0 = null;
            while (true) {
                long j11 = jArr3[i13];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j11 & 255) < 128) {
                            objArr2 = objArr3;
                            z zVar2 = (z) objArr3[(i13 << 3) + i15];
                            jArr2 = jArr3;
                            b0 b0VarA = zVar2.a();
                            i12 = i15;
                            ArrayList arrayList5 = arrayList2;
                            b0 b0VarS = l.s(b0VarA, j9, jVar);
                            if (b0VarS == null) {
                                jVar3 = jVarH;
                                arrayList4 = arrayListY0;
                                j10 = j11;
                            } else {
                                arrayList4 = arrayListY0;
                                j10 = j11;
                                b0 b0VarS2 = l.s(b0VarA, g(), jVarH);
                                if (b0VarS2 == null) {
                                    jVar3 = jVarH;
                                } else {
                                    jVar3 = jVarH;
                                    if (b0VarS2.f17009a != 1 && !b0VarS.equals(b0VarS2)) {
                                        b0 b0VarS3 = l.s(b0VarA, g(), d());
                                        if (b0VarS3 == null) {
                                            l.r();
                                            throw null;
                                        }
                                        if (map == null || (b0VarC = (b0) map.get(b0VarS)) == null) {
                                            b0VarC = zVar2.c(b0VarS2, b0VarS, b0VarS3);
                                        }
                                        if (b0VarC == null) {
                                            return new g(this);
                                        }
                                        if (!b0VarC.equals(b0VarS3)) {
                                            if (b0VarC.equals(b0VarS)) {
                                                ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList6.add(new g00.k(zVar2, b0VarS.c(g())));
                                                arrayListY0 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayListY0.add(zVar2);
                                                arrayList2 = arrayList6;
                                            } else {
                                                arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList2.add(!b0VarC.equals(b0VarS2) ? new g00.k(zVar2, b0VarC) : new g00.k(zVar2, b0VarS2.c(g())));
                                            }
                                        }
                                        arrayListY0 = arrayList4;
                                    }
                                }
                            }
                            arrayList2 = arrayList5;
                            arrayListY0 = arrayList4;
                        } else {
                            jVar3 = jVarH;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i12 = i15;
                            j10 = j11;
                        }
                        j11 = j10 >> 8;
                        i15 = i12 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        jVarH = jVar3;
                    }
                    jVar2 = jVarH;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i14 != 8) {
                        break;
                    }
                } else {
                    jVar2 = jVarH;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i13 != length) {
                    i13++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    jVarH = jVar2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i11 = 0; i11 < size2; i11++) {
                    g00.k kVar = (g00.k) arrayList2.get(i11);
                    zVar = (z) kVar.A;
                    b0Var = (b0) kVar.B;
                    b0Var.f17009a = j9;
                    synchronized (l.f17038c) {
                        b0Var.f17010b = zVar.a();
                        zVar.e(b0Var);
                    }
                }
            }
            if (arrayListY0 != null) {
                size = arrayListY0.size();
                for (i10 = 0; i10 < size; i10++) {
                    j0Var.l((z) arrayListY0.get(i10));
                }
                arrayList3 = this.f17006i;
                if (arrayList3 != null) {
                    arrayListY0 = h00.q.Y0(arrayListY0, arrayList3);
                }
                this.f17006i = arrayListY0;
            }
            return h.f17035d;
        }
        arrayList = null;
        arrayListY0 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i11 < size2) {
                g00.k kVar2 = (g00.k) arrayList2.get(i11);
                zVar = (z) kVar2.A;
                b0Var = (b0) kVar2.B;
                b0Var.f17009a = j9;
                synchronized (l.f17038c) {
                    b0Var.f17010b = zVar.a();
                    zVar.e(b0Var);
                }
            }
        }
        if (arrayListY0 != null) {
            size = arrayListY0.size();
            while (i10 < size) {
                j0Var.l((z) arrayListY0.get(i10));
            }
            arrayList3 = this.f17006i;
            if (arrayList3 != null) {
                arrayListY0 = h00.q.Y0(arrayListY0, arrayList3);
            }
            this.f17006i = arrayListY0;
        }
        return h.f17035d;
    }
}
