package s7;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.Objects;

public final class z0 implements a8.l0 {
    public androidx.media3.common.t A;
    public androidx.media3.common.t B;
    public boolean D;
    public long E;

    public final x0 f13797a;

    public final n7.l f13800d;

    public final n7.h f13801e;

    public s0 f13802f;

    public androidx.media3.common.t f13803g;

    public n7.e f13804h;

    public int f13810p;

    public int f13811q;

    public int f13812r;

    public int f13813s;

    public boolean f13817w;

    public boolean f13820z;

    public final com.google.crypto.tink.shaded.protobuf.d f13798b = new com.google.crypto.tink.shaded.protobuf.d();

    public int f13805i = 1000;

    public long[] f13806j = new long[1000];

    public long[] f13807k = new long[1000];

    public long[] f13808n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];

    public a8.k0[] f13809o = new a8.k0[1000];

    public final c50.h f13799c = new c50.h(new oj.l(7));

    public long f13814t = Long.MIN_VALUE;

    public long f13815u = Long.MIN_VALUE;

    public long f13816v = Long.MIN_VALUE;

    public boolean f13819y = true;

    public boolean f13818x = true;
    public boolean C = true;

    public z0(a1.i iVar, n7.l lVar, n7.h hVar) {
        this.f13800d = lVar;
        this.f13801e = hVar;
        this.f13797a = new x0(iVar);
    }

    @Override
    public final int b(androidx.media3.common.j jVar, int i10, boolean z10) throws EOFException {
        x0 x0Var = this.f13797a;
        int iB = x0Var.b(i10);
        w0 w0Var = x0Var.f13793f;
        w7.a aVar = (w7.a) w0Var.C;
        int i11 = jVar.read(aVar.f15842a, ((int) (x0Var.f13794g - w0Var.A)) + aVar.f15843b, iB);
        if (i11 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j9 = x0Var.f13794g + ((long) i11);
        x0Var.f13794g = j9;
        w0 w0Var2 = x0Var.f13793f;
        if (j9 == w0Var2.B) {
            x0Var.f13793f = (w0) w0Var2.D;
        }
        return i11;
    }

    @Override
    public final void d(long j9, int i10, int i11, int i12, a8.k0 k0Var) {
        androidx.media3.common.t tVar;
        n7.l lVar;
        n7.k kVarC;
        c50.h hVar;
        int i13;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z10;
        boolean z11;
        if (this.f13820z) {
            androidx.media3.common.t tVar2 = this.A;
            tVar2.getClass();
            f(tVar2);
        }
        int i14 = i10 & 1;
        boolean z12 = i14 != 0;
        if (this.f13818x) {
            if (!z12) {
                return;
            } else {
                this.f13818x = false;
            }
        }
        long j10 = j9 + this.E;
        if (this.C) {
            if (j10 < this.f13814t) {
                return;
            }
            if (i14 == 0) {
                if (!this.D) {
                    e7.a.m("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.D = true;
                }
                i10 |= 1;
            }
        }
        long j11 = (this.f13797a.f13794g - ((long) i11)) - ((long) i12);
        synchronized (this) {
            try {
                int i15 = this.f13810p;
                if (i15 > 0) {
                    int iQ = q(i15 - 1);
                    ta.c0.s(this.f13807k[iQ] + ((long) this.l[iQ]) <= j11);
                }
                this.f13817w = (536870912 & i10) != 0;
                this.f13816v = Math.max(this.f13816v, j10);
                int iQ2 = q(this.f13810p);
                this.f13808n[iQ2] = j10;
                this.f13807k[iQ2] = j11;
                this.l[iQ2] = i11;
                this.m[iQ2] = i10;
                this.f13809o[iQ2] = k0Var;
                this.f13806j[iQ2] = 0;
                if (((SparseArray) this.f13799c.C).size() == 0) {
                    tVar = this.B;
                    tVar.getClass();
                    lVar = this.f13800d;
                    if (lVar != null) {
                        kVarC = lVar.c(this.f13801e, tVar);
                    } else {
                        kVarC = n7.k.f11171p;
                    }
                    hVar = this.f13799c;
                    i13 = this.f13811q + this.f13810p;
                    y0 y0Var = new y0(tVar, kVarC);
                    sparseArray = (SparseArray) hVar.C;
                    if (hVar.B == -1) {
                        if (sparseArray.size() == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        ta.c0.A(z11);
                        hVar.B = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i13 >= iKeyAt) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ta.c0.s(z10);
                        if (iKeyAt == i13) {
                            ((oj.l) hVar.D).accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i13, y0Var);
                } else {
                    SparseArray sparseArray2 = (SparseArray) this.f13799c.C;
                    if (!((y0) sparseArray2.valueAt(sparseArray2.size() - 1)).f13795a.equals(this.B)) {
                        tVar = this.B;
                        tVar.getClass();
                        lVar = this.f13800d;
                        if (lVar != null) {
                            kVarC = lVar.c(this.f13801e, tVar);
                        } else {
                            kVarC = n7.k.f11171p;
                        }
                        hVar = this.f13799c;
                        i13 = this.f13811q + this.f13810p;
                        y0 y0Var2 = new y0(tVar, kVarC);
                        sparseArray = (SparseArray) hVar.C;
                        if (hVar.B == -1) {
                            if (sparseArray.size() == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            ta.c0.A(z11);
                            hVar.B = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i13 >= iKeyAt) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ta.c0.s(z10);
                            if (iKeyAt == i13) {
                                ((oj.l) hVar.D).accept(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i13, y0Var2);
                    }
                }
                int i16 = this.f13810p + 1;
                this.f13810p = i16;
                int i17 = this.f13805i;
                if (i16 == i17) {
                    int i18 = i17 + 1000;
                    long[] jArr = new long[i18];
                    long[] jArr2 = new long[i18];
                    long[] jArr3 = new long[i18];
                    int[] iArr = new int[i18];
                    int[] iArr2 = new int[i18];
                    a8.k0[] k0VarArr = new a8.k0[i18];
                    int i19 = this.f13812r;
                    int i20 = i17 - i19;
                    System.arraycopy(this.f13807k, i19, jArr2, 0, i20);
                    System.arraycopy(this.f13808n, this.f13812r, jArr3, 0, i20);
                    System.arraycopy(this.m, this.f13812r, iArr, 0, i20);
                    System.arraycopy(this.l, this.f13812r, iArr2, 0, i20);
                    System.arraycopy(this.f13809o, this.f13812r, k0VarArr, 0, i20);
                    System.arraycopy(this.f13806j, this.f13812r, jArr, 0, i20);
                    int i21 = this.f13812r;
                    System.arraycopy(this.f13807k, 0, jArr2, i20, i21);
                    System.arraycopy(this.f13808n, 0, jArr3, i20, i21);
                    System.arraycopy(this.m, 0, iArr, i20, i21);
                    System.arraycopy(this.l, 0, iArr2, i20, i21);
                    System.arraycopy(this.f13809o, 0, k0VarArr, i20, i21);
                    System.arraycopy(this.f13806j, 0, jArr, i20, i21);
                    this.f13807k = jArr2;
                    this.f13808n = jArr3;
                    this.m = iArr;
                    this.l = iArr2;
                    this.f13809o = k0VarArr;
                    this.f13806j = jArr;
                    this.f13812r = 0;
                    this.f13805i = i18;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void e(e7.u uVar, int i10, int i11) {
        while (true) {
            x0 x0Var = this.f13797a;
            if (i10 <= 0) {
                x0Var.getClass();
                return;
            }
            int iB = x0Var.b(i10);
            w0 w0Var = x0Var.f13793f;
            w7.a aVar = (w7.a) w0Var.C;
            uVar.k(((int) (x0Var.f13794g - w0Var.A)) + aVar.f15843b, iB, aVar.f15842a);
            i10 -= iB;
            long j9 = x0Var.f13794g + ((long) iB);
            x0Var.f13794g = j9;
            w0 w0Var2 = x0Var.f13793f;
            if (j9 == w0Var2.B) {
                x0Var.f13793f = (w0) w0Var2.D;
            }
        }
    }

    @Override
    public final void f(androidx.media3.common.t tVar) {
        androidx.media3.common.t tVar2;
        if (this.E == 0 || tVar.f1599s == Long.MAX_VALUE) {
            tVar2 = tVar;
        } else {
            androidx.media3.common.s sVarA = tVar.a();
            sVarA.f1506r = tVar.f1599s + this.E;
            tVar2 = new androidx.media3.common.t(sVarA);
        }
        boolean z10 = false;
        this.f13820z = false;
        this.A = tVar;
        synchronized (this) {
            try {
                this.f13819y = false;
                if (!Objects.equals(tVar2, this.B)) {
                    if (((SparseArray) this.f13799c.C).size() == 0) {
                        this.B = tVar2;
                    } else {
                        SparseArray sparseArray = (SparseArray) this.f13799c.C;
                        if (((y0) sparseArray.valueAt(sparseArray.size() - 1)).f13795a.equals(tVar2)) {
                            SparseArray sparseArray2 = (SparseArray) this.f13799c.C;
                            this.B = ((y0) sparseArray2.valueAt(sparseArray2.size() - 1)).f13795a;
                        } else {
                            this.B = tVar2;
                        }
                    }
                    boolean z11 = this.C;
                    androidx.media3.common.t tVar3 = this.B;
                    this.C = z11 & androidx.media3.common.x0.a(tVar3.f1594n, tVar3.f1593k);
                    this.D = false;
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        s0 s0Var = this.f13802f;
        if (s0Var == null || !z10) {
            return;
        }
        s0Var.R.post(s0Var.P);
    }

    public final long h(int i10) {
        this.f13815u = Math.max(this.f13815u, o(i10));
        this.f13810p -= i10;
        int i11 = this.f13811q + i10;
        this.f13811q = i11;
        int i12 = this.f13812r + i10;
        this.f13812r = i12;
        int i13 = this.f13805i;
        if (i12 >= i13) {
            this.f13812r = i12 - i13;
        }
        int i14 = this.f13813s - i10;
        this.f13813s = i14;
        int i15 = 0;
        if (i14 < 0) {
            this.f13813s = 0;
        }
        c50.h hVar = this.f13799c;
        SparseArray sparseArray = (SparseArray) hVar.C;
        while (i15 < sparseArray.size() - 1) {
            int i16 = i15 + 1;
            if (i11 < sparseArray.keyAt(i16)) {
                break;
            }
            ((oj.l) hVar.D).accept(sparseArray.valueAt(i15));
            sparseArray.removeAt(i15);
            int i17 = hVar.B;
            if (i17 > 0) {
                hVar.B = i17 - 1;
            }
            i15 = i16;
        }
        if (this.f13810p != 0) {
            return this.f13807k[this.f13812r];
        }
        int i18 = this.f13812r;
        if (i18 == 0) {
            i18 = this.f13805i;
        }
        int i19 = i18 - 1;
        return this.f13807k[i19] + ((long) this.l[i19]);
    }

    public final void i(long j9, boolean z10, boolean z11) throws Throwable {
        Throwable th2;
        x0 x0Var = this.f13797a;
        synchronized (this) {
            try {
                try {
                    int i10 = this.f13810p;
                    long jH = -1;
                    if (i10 != 0) {
                        long[] jArr = this.f13808n;
                        int i11 = this.f13812r;
                        if (j9 >= jArr[i11]) {
                            if (z11) {
                                try {
                                    int i12 = this.f13813s;
                                    if (i12 != i10) {
                                        i10 = i12 + 1;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            int iM = m(i11, j9, i10, z10);
                            if (iM != -1) {
                                jH = h(iM);
                            }
                        }
                    }
                    x0Var.a(jH);
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        }
    }

    public final void j() {
        long jH;
        x0 x0Var = this.f13797a;
        synchronized (this) {
            int i10 = this.f13810p;
            jH = i10 == 0 ? -1L : h(i10);
        }
        x0Var.a(jH);
    }

    public final void k(long j9) {
        if (this.f13810p == 0) {
            return;
        }
        ta.c0.s(j9 > n());
        int i10 = this.f13810p;
        int iQ = q(i10 - 1);
        while (i10 > this.f13813s && this.f13808n[iQ] >= j9) {
            i10--;
            iQ--;
            if (iQ == -1) {
                iQ = this.f13805i - 1;
            }
        }
        l(this.f13811q + i10);
    }

    public final void l(int i10) {
        long j9;
        x0 x0Var = this.f13797a;
        int i11 = this.f13811q;
        int i12 = this.f13810p;
        int i13 = (i11 + i12) - i10;
        boolean z10 = false;
        ta.c0.s(i13 >= 0 && i13 <= i12 - this.f13813s);
        int i14 = this.f13810p - i13;
        this.f13810p = i14;
        this.f13816v = Math.max(this.f13815u, o(i14));
        if (i13 == 0 && this.f13817w) {
            z10 = true;
        }
        this.f13817w = z10;
        c50.h hVar = this.f13799c;
        SparseArray sparseArray = (SparseArray) hVar.C;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((oj.l) hVar.D).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        hVar.B = sparseArray.size() > 0 ? Math.min(hVar.B, sparseArray.size() - 1) : -1;
        int i15 = this.f13810p;
        if (i15 != 0) {
            int iQ = q(i15 - 1);
            j9 = this.f13807k[iQ] + ((long) this.l[iQ]);
        } else {
            j9 = 0;
        }
        int i16 = x0Var.f13789b;
        ta.c0.s(j9 <= x0Var.f13794g);
        x0Var.f13794g = j9;
        if (j9 != 0) {
            w0 w0Var = x0Var.f13791d;
            if (j9 != w0Var.A) {
                while (x0Var.f13794g > w0Var.B) {
                    w0Var = (w0) w0Var.D;
                }
                w0 w0Var2 = (w0) w0Var.D;
                w0Var2.getClass();
                if (((w7.a) w0Var2.C) != null) {
                    a1.i iVar = x0Var.f13788a;
                    synchronized (iVar) {
                        ((i7.g) iVar.D).f7308c.b(w0Var2);
                        w0 w0Var3 = w0Var2;
                        while (w0Var3 != null) {
                            w7.a aVar = (w7.a) w0Var3.C;
                            aVar.getClass();
                            iVar.u(aVar);
                            w0Var3 = (w0) w0Var3.D;
                            if (w0Var3 == null || ((w7.a) w0Var3.C) == null) {
                                w0Var3 = null;
                            }
                        }
                    }
                    w0Var2.C = null;
                    w0Var2.D = null;
                }
                w0 w0Var4 = new w0(w0Var.B, i16);
                w0Var.D = w0Var4;
                if (x0Var.f13794g == w0Var.B) {
                    w0Var = w0Var4;
                }
                x0Var.f13793f = w0Var;
                if (x0Var.f13792e == w0Var2) {
                    x0Var.f13792e = w0Var4;
                    return;
                }
                return;
            }
        }
        w0 w0Var5 = x0Var.f13791d;
        if (((w7.a) w0Var5.C) != null) {
            a1.i iVar2 = x0Var.f13788a;
            synchronized (iVar2) {
                ((i7.g) iVar2.D).f7308c.b(w0Var5);
                w0 w0Var6 = w0Var5;
                while (w0Var6 != null) {
                    w7.a aVar2 = (w7.a) w0Var6.C;
                    aVar2.getClass();
                    iVar2.u(aVar2);
                    w0Var6 = (w0) w0Var6.D;
                    if (w0Var6 == null || ((w7.a) w0Var6.C) == null) {
                        w0Var6 = null;
                    }
                }
            }
            w0Var5.C = null;
            w0Var5.D = null;
        }
        w0 w0Var7 = new w0(x0Var.f13794g, i16);
        x0Var.f13791d = w0Var7;
        x0Var.f13792e = w0Var7;
        x0Var.f13793f = w0Var7;
    }

    public final int m(int i10, long j9, int i11, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j10 = this.f13808n[i10];
            if (j10 > j9) {
                break;
            }
            if (!z10 || (this.m[i10] & 1) != 0) {
                if (j10 == j9) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f13805i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final synchronized long n() {
        return Math.max(this.f13815u, o(this.f13813s));
    }

    public final long o(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iQ = q(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f13808n[iQ]);
            if ((this.m[iQ] & 1) != 0) {
                return jMax;
            }
            iQ--;
            if (iQ == -1) {
                iQ = this.f13805i - 1;
            }
        }
        return jMax;
    }

    public final int p() {
        return this.f13811q + this.f13813s;
    }

    public final int q(int i10) {
        int i11 = this.f13812r + i10;
        int i12 = this.f13805i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized int r(boolean z10, long j9) {
        try {
            try {
                int iQ = q(this.f13813s);
                int i10 = this.f13813s;
                int i11 = this.f13810p;
                if (!(i10 != i11) || j9 < this.f13808n[iQ]) {
                    return 0;
                }
                if (j9 > this.f13816v && z10) {
                    return i11 - i10;
                }
                int iM = m(iQ, j9, i11 - i10, true);
                if (iM == -1) {
                    return 0;
                }
                return iM;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized boolean s(boolean z10) {
        androidx.media3.common.t tVar;
        boolean z11 = false;
        if (this.f13813s != this.f13810p) {
            if (((y0) this.f13799c.j(p())).f13795a != this.f13803g) {
                return true;
            }
            return t(q(this.f13813s));
        }
        if (z10 || this.f13817w || ((tVar = this.B) != null && tVar != this.f13803g)) {
            z11 = true;
        }
        return z11;
    }

    public final boolean t(int i10) {
        n7.e eVar = this.f13804h;
        if (eVar == null || eVar.getState() == 4) {
            return true;
        }
        return (this.m[i10] & 1073741824) == 0 && this.f13804h.d();
    }

    public final void u(androidx.media3.common.t tVar, h7.b bVar) {
        androidx.media3.common.t tVar2;
        androidx.media3.common.t tVar3 = this.f13803g;
        boolean z10 = tVar3 == null;
        androidx.media3.common.o oVar = tVar3 == null ? null : tVar3.f1598r;
        this.f13803g = tVar;
        androidx.media3.common.o oVar2 = tVar.f1598r;
        n7.l lVar = this.f13800d;
        if (lVar != null) {
            int iD = lVar.d(tVar);
            androidx.media3.common.s sVarA = tVar.a();
            sVarA.N = iD;
            tVar2 = new androidx.media3.common.t(sVarA);
        } else {
            tVar2 = tVar;
        }
        bVar.B = tVar2;
        bVar.A = this.f13804h;
        if (lVar == null) {
            return;
        }
        if (z10 || !Objects.equals(oVar, oVar2)) {
            n7.e eVar = this.f13804h;
            n7.h hVar = this.f13801e;
            n7.e eVarA = lVar.a(hVar, tVar);
            this.f13804h = eVarA;
            bVar.A = eVarA;
            if (eVar != null) {
                eVar.c(hVar);
            }
        }
    }

    public final int v(h7.b bVar, h7.e eVar, int i10, boolean z10) {
        int i11;
        boolean z11 = (i10 & 2) != 0;
        com.google.crypto.tink.shaded.protobuf.d dVar = this.f13798b;
        synchronized (this) {
            try {
                eVar.F = false;
                i11 = -3;
                if (this.f13813s != this.f13810p) {
                    androidx.media3.common.t tVar = ((y0) this.f13799c.j(p())).f13795a;
                    if (z11 || tVar != this.f13803g) {
                        u(tVar, bVar);
                        i11 = -5;
                    } else {
                        int iQ = q(this.f13813s);
                        if (t(iQ)) {
                            eVar.B = this.m[iQ];
                            if (this.f13813s == this.f13810p - 1 && (z10 || this.f13817w)) {
                                eVar.a(536870912);
                            }
                            eVar.G = this.f13808n[iQ];
                            dVar.f4252a = this.l[iQ];
                            dVar.f4253b = this.f13807k[iQ];
                            dVar.f4254c = this.f13809o[iQ];
                            i11 = -4;
                        } else {
                            eVar.F = true;
                        }
                    }
                } else if (z10 || this.f13817w) {
                    eVar.B = 4;
                    eVar.G = Long.MIN_VALUE;
                    i11 = -4;
                } else {
                    androidx.media3.common.t tVar2 = this.B;
                    if (tVar2 != null && (z11 || tVar2 != this.f13803g)) {
                        u(tVar2, bVar);
                        i11 = -5;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 == -4 && !eVar.c(4)) {
            boolean z12 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z12) {
                    x0 x0Var = this.f13797a;
                    x0.e(x0Var.f13792e, eVar, this.f13798b, x0Var.f13790c);
                } else {
                    x0 x0Var2 = this.f13797a;
                    x0Var2.f13792e = x0.e(x0Var2.f13792e, eVar, this.f13798b, x0Var2.f13790c);
                }
            }
            if (!z12) {
                this.f13813s++;
            }
        }
        return i11;
    }

    public final void w(boolean z10) {
        x0 x0Var = this.f13797a;
        w0 w0Var = x0Var.f13791d;
        if (((w7.a) w0Var.C) != null) {
            a1.i iVar = x0Var.f13788a;
            synchronized (iVar) {
                ((i7.g) iVar.D).f7308c.b(w0Var);
                w0 w0Var2 = w0Var;
                while (w0Var2 != null) {
                    w7.a aVar = (w7.a) w0Var2.C;
                    aVar.getClass();
                    iVar.u(aVar);
                    w0Var2 = (w0) w0Var2.D;
                    if (w0Var2 == null || ((w7.a) w0Var2.C) == null) {
                        w0Var2 = null;
                    }
                }
            }
            w0Var.C = null;
            w0Var.D = null;
        }
        w0 w0Var3 = x0Var.f13791d;
        int i10 = x0Var.f13789b;
        ta.c0.A(((w7.a) w0Var3.C) == null);
        w0Var3.A = 0L;
        w0Var3.B = i10;
        w0 w0Var4 = x0Var.f13791d;
        x0Var.f13792e = w0Var4;
        x0Var.f13793f = w0Var4;
        x0Var.f13794g = 0L;
        a1.i iVar2 = x0Var.f13788a;
        synchronized (iVar2) {
            ((i7.g) iVar2.D).f7308c.d();
        }
        this.f13810p = 0;
        this.f13811q = 0;
        this.f13812r = 0;
        this.f13813s = 0;
        this.f13818x = true;
        this.f13814t = Long.MIN_VALUE;
        this.f13815u = Long.MIN_VALUE;
        this.f13816v = Long.MIN_VALUE;
        this.f13817w = false;
        c50.h hVar = this.f13799c;
        SparseArray sparseArray = (SparseArray) hVar.C;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((oj.l) hVar.D).accept(sparseArray.valueAt(i11));
        }
        hVar.B = -1;
        sparseArray.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f13819y = true;
            this.C = true;
        }
    }

    public final synchronized boolean x(int i10) {
        synchronized (this) {
            this.f13813s = 0;
            x0 x0Var = this.f13797a;
            x0Var.f13792e = x0Var.f13791d;
        }
        int i11 = this.f13811q;
        if (i10 >= i11 && i10 <= this.f13810p + i11) {
            this.f13814t = Long.MIN_VALUE;
            this.f13813s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean y(boolean r12, long r13) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: s7.z0.y(boolean, long):boolean");
    }

    public final synchronized void z(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f13813s + i10 <= this.f13810p) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            z10 = false;
        }
        ta.c0.s(z10);
        this.f13813s += i10;
    }
}
