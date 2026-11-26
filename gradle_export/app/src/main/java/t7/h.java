package t7;

import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.common.q;
import androidx.media3.common.t;
import androidx.media3.common.x0;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import e7.i0;
import fh.t0;
import i7.m0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import l7.m;
import l7.p;
import q3.e0;
import s7.a0;
import s7.a1;
import s7.c1;
import s7.z0;
import ta.c0;
import tf.w;
import v7.r;

public final class h implements a1, c1, w7.h, w7.k {
    public final int A;
    public final int[] B;
    public final t[] C;
    public final boolean[] D;
    public final m E;
    public final l7.b F;
    public final c50.h G;
    public final w H;
    public final w7.l I;
    public final q J;
    public final ArrayList K;
    public final List L;
    public final z0 M;
    public final z0[] N;
    public final e0 O;
    public e P;
    public t Q;
    public g R;
    public long S;
    public long T;
    public int U;
    public a V;
    public boolean W;
    public boolean X;
    public boolean Y;

    public h(int i10, int[] iArr, t[] tVarArr, m mVar, l7.b bVar, a1.i iVar, long j9, n7.l lVar, n7.h hVar, w wVar, c50.h hVar2, boolean z10, x7.a aVar) {
        this.A = i10;
        this.B = iArr;
        this.C = tVarArr;
        this.E = mVar;
        this.F = bVar;
        this.G = hVar2;
        this.H = wVar;
        this.W = z10;
        this.I = aVar != null ? new w7.l(aVar) : new w7.l("ChunkSampleStream");
        this.J = new q(12);
        ArrayList arrayList = new ArrayList();
        this.K = arrayList;
        this.L = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.N = new z0[length];
        this.D = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        z0[] z0VarArr = new z0[i11];
        lVar.getClass();
        z0 z0Var = new z0(iVar, lVar, hVar);
        this.M = z0Var;
        int i12 = 0;
        iArr2[0] = i10;
        z0VarArr[0] = z0Var;
        while (i12 < length) {
            z0 z0Var2 = new z0(iVar, null, null);
            this.N[i12] = z0Var2;
            int i13 = i12 + 1;
            z0VarArr[i13] = z0Var2;
            iArr2[i13] = this.B[i12];
            i12 = i13;
        }
        this.O = new e0(iArr2, z0VarArr, 8);
        this.S = j9;
        this.T = j9;
    }

    public final int A(int i10, int i11) {
        ArrayList arrayList;
        do {
            i11++;
            arrayList = this.K;
            if (i11 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i11)).a(0) <= i10);
        return i11 - 1;
    }

    public final void B(l7.b bVar) {
        this.R = bVar;
        z0 z0Var = this.M;
        z0Var.j();
        n7.e eVar = z0Var.f13804h;
        if (eVar != null) {
            eVar.c(z0Var.f13801e);
            z0Var.f13804h = null;
            z0Var.f13803g = null;
        }
        for (z0 z0Var2 : this.N) {
            z0Var2.j();
            n7.e eVar2 = z0Var2.f13804h;
            if (eVar2 != null) {
                eVar2.c(z0Var2.f13801e);
                z0Var2.f13804h = null;
                z0Var2.f13803g = null;
            }
        }
        this.I.c(this);
    }

    @Override
    public final void a() throws IOException {
        w7.l lVar = this.I;
        lVar.a();
        z0 z0Var = this.M;
        n7.e eVar = z0Var.f13804h;
        if (eVar != null && eVar.getState() == 1) {
            DrmSession$DrmSessionException drmSession$DrmSessionExceptionF = z0Var.f13804h.f();
            drmSession$DrmSessionExceptionF.getClass();
            throw drmSession$DrmSessionExceptionF;
        }
        if (lVar.b()) {
            return;
        }
        m mVar = this.E;
        BehindLiveWindowException behindLiveWindowException = mVar.m;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        mVar.f10094a.a();
    }

    @Override
    public final boolean b() {
        return !y() && this.M.s(this.Y);
    }

    @Override
    public final void d() {
        z0 z0Var = this.M;
        z0Var.w(true);
        n7.e eVar = z0Var.f13804h;
        if (eVar != null) {
            eVar.c(z0Var.f13801e);
            z0Var.f13804h = null;
            z0Var.f13803g = null;
        }
        for (z0 z0Var2 : this.N) {
            z0Var2.w(true);
            n7.e eVar2 = z0Var2.f13804h;
            if (eVar2 != null) {
                eVar2.c(z0Var2.f13801e);
                z0Var2.f13804h = null;
                z0Var2.f13803g = null;
            }
        }
        for (l7.k kVar : this.E.f10102i) {
            d dVar = (d) kVar.f10090d;
            if (dVar != null) {
                dVar.A.release();
            }
        }
        g gVar = this.R;
        if (gVar != null) {
            l7.b bVar = (l7.b) gVar;
            synchronized (bVar) {
                p pVar = (p) bVar.N.remove(this);
                if (pVar != null) {
                    z0 z0Var3 = pVar.f10108a;
                    z0Var3.w(true);
                    n7.e eVar3 = z0Var3.f13804h;
                    if (eVar3 != null) {
                        eVar3.c(z0Var3.f13801e);
                        z0Var3.f13804h = null;
                        z0Var3.f13803g = null;
                    }
                }
            }
        }
    }

    @Override
    public final boolean e(m0 m0Var) {
        long j9;
        List list;
        q qVar;
        long j10;
        boolean z10;
        long j11;
        boolean z11;
        List list2;
        a aVar;
        long j12;
        long jMax;
        w7.l lVar;
        long j13;
        q qVar2;
        boolean z12;
        long j14;
        long jI;
        int i10;
        Object iVar;
        long jI2;
        boolean z13;
        boolean z14;
        e eVar;
        boolean z15;
        e0 e0Var;
        a aVar2;
        z0[] z0VarArr;
        int[] iArr;
        int i11;
        long j15;
        long j16;
        int i12;
        if (!this.Y) {
            w7.l lVar2 = this.I;
            if (!lVar2.b()) {
                if (lVar2.f15878c != null) {
                    return false;
                }
                boolean zY = y();
                if (zY) {
                    list = Collections.EMPTY_LIST;
                    j9 = this.S;
                } else {
                    j9 = w().H;
                    list = this.L;
                }
                List list3 = list;
                m mVar = this.E;
                l7.k[] kVarArr = mVar.f10102i;
                BehindLiveWindowException behindLiveWindowException = mVar.m;
                q qVar3 = this.J;
                if (behindLiveWindowException == null) {
                    qVar = qVar3;
                    long j17 = m0Var.f7421a;
                    j10 = -9223372036854775807L;
                    long j18 = j9 - j17;
                    z10 = zY;
                    long jH = i0.H(mVar.f10104k.a(mVar.l).f10607b) + i0.H(mVar.f10104k.f10580a) + j9;
                    p pVar = mVar.f10101h;
                    if (pVar != null) {
                        l7.q qVar4 = pVar.f10112e;
                        m7.c cVar = qVar4.F;
                        l7.f fVar = qVar4.B;
                        if (!cVar.f10583d) {
                            j11 = j17;
                            z13 = false;
                        } else if (qVar4.H) {
                            j11 = j17;
                            z13 = true;
                        } else {
                            j11 = j17;
                            Map.Entry entryCeilingEntry = qVar4.E.ceilingEntry(Long.valueOf(cVar.f10587h));
                            if (entryCeilingEntry == null || ((Long) entryCeilingEntry.getValue()).longValue() >= jH) {
                                z13 = false;
                            } else {
                                long jLongValue = ((Long) entryCeilingEntry.getKey()).longValue();
                                l7.i iVar2 = fVar.f10069a;
                                long j19 = iVar2.M;
                                if (j19 == -9223372036854775807L || j19 < jLongValue) {
                                    iVar2.M = jLongValue;
                                }
                                z13 = true;
                            }
                            if (z13 && qVar4.G) {
                                qVar4.H = true;
                                qVar4.G = false;
                                l7.i iVar3 = fVar.f10069a;
                                iVar3.D.removeCallbacks(iVar3.f10083w);
                                iVar3.z();
                            }
                        }
                        if (z13) {
                        }
                        z14 = qVar2.B;
                        eVar = (e) qVar2.C;
                        qVar2.C = null;
                        qVar2.B = false;
                        if (z14) {
                            this.S = j13;
                            this.Y = true;
                            return true;
                        }
                        if (eVar == null) {
                            return false;
                        }
                        this.P = eVar;
                        z15 = eVar instanceof a;
                        e0Var = this.O;
                        if (z15) {
                            aVar2 = (a) eVar;
                            if (z10) {
                                j15 = aVar2.G;
                                j16 = this.S;
                                if (j15 < j16) {
                                    this.M.f13814t = j16;
                                    for (z0 z0Var : this.N) {
                                        z0Var.f13814t = this.S;
                                    }
                                    if (this.W) {
                                        t tVar = aVar2.D;
                                        this.X = !x0.a(tVar.f1594n, tVar.f1593k);
                                    }
                                }
                                this.W = false;
                                this.S = -9223372036854775807L;
                            }
                            aVar2.M = e0Var;
                            z0VarArr = (z0[]) e0Var.C;
                            iArr = new int[z0VarArr.length];
                            for (i11 = 0; i11 < z0VarArr.length; i11++) {
                                z0 z0Var2 = z0VarArr[i11];
                                iArr[i11] = z0Var2.f13811q + z0Var2.f13810p;
                            }
                            aVar2.N = iArr;
                            this.K.add(aVar2);
                        } else if (eVar instanceof j) {
                            ((j) eVar).K = e0Var;
                        }
                        lVar.d(eVar, this, this.H.n(eVar.C));
                        return true;
                    }
                    j11 = j17;
                    long jH2 = i0.H(i0.v(mVar.f10099f));
                    m7.c cVar2 = mVar.f10104k;
                    long j20 = cVar2.f10580a;
                    long jH3 = j20 == -9223372036854775807L ? -9223372036854775807L : jH2 - i0.H(j20 + cVar2.a(mVar.l).f10607b);
                    if (list3.isEmpty()) {
                        list2 = list3;
                        z11 = true;
                        aVar = null;
                    } else {
                        z11 = true;
                        int size = list3.size() - 1;
                        list2 = list3;
                        aVar = (a) list2.get(size);
                    }
                    int length = mVar.f10103j.length();
                    k[] kVarArr2 = new k[length];
                    int i13 = 0;
                    while (i13 < length) {
                        l7.k kVar = kVarArr[i13];
                        long j21 = jH3;
                        l7.j jVar = (l7.j) kVar.f10093g;
                        int i14 = length;
                        long j22 = kVar.f10089c;
                        long j23 = kVar.f10088b;
                        rc.d dVar = k.f14371r;
                        if (jVar == null) {
                            kVarArr2[i13] = dVar;
                        } else {
                            jVar.getClass();
                            long jH4 = jVar.h(j23, jH2) + j22;
                            long jB = kVar.b(jH2);
                            if (aVar != null) {
                                jI2 = aVar.b();
                            } else {
                                l7.j jVar2 = (l7.j) kVar.f10093g;
                                jVar2.getClass();
                                jI2 = i0.i(jVar2.o(j9, j23) + j22, jH4, jB);
                            }
                            long j24 = jI2;
                            if (j24 < jH4) {
                                kVarArr2[i13] = dVar;
                            } else {
                                kVarArr2[i13] = new l7.l(mVar.b(i13), j24, jB);
                            }
                        }
                        i13++;
                        length = i14;
                        jH3 = j21;
                    }
                    long j25 = jH3;
                    if (!mVar.f10104k.f10583d || kVarArr[0].c() == 0) {
                        j12 = 0;
                        jMax = -9223372036854775807L;
                    } else {
                        long jD = kVarArr[0].d(kVarArr[0].b(jH2));
                        m7.c cVar3 = mVar.f10104k;
                        long j26 = cVar3.f10580a;
                        long jMin = Math.min(j26 == -9223372036854775807L ? -9223372036854775807L : jH2 - i0.H(j26 + cVar3.a(mVar.l).f10607b), jD) - j11;
                        j12 = 0;
                        jMax = Math.max(0L, jMin);
                    }
                    lVar = lVar2;
                    long j27 = j12;
                    long j28 = j11;
                    j13 = -9223372036854775807L;
                    qVar2 = qVar;
                    mVar.f10103j.c(j28, j18, jMax, list2, kVarArr2);
                    int iE = mVar.f10103j.e();
                    SystemClock.elapsedRealtime();
                    l7.k kVarB = mVar.b(iE);
                    long j29 = kVarB.f10088b;
                    long j30 = kVarB.f10089c;
                    l7.j jVar3 = (l7.j) kVarB.f10093g;
                    m7.b bVar = (m7.b) kVarB.f10092f;
                    d dVar2 = (d) kVarB.f10090d;
                    m7.m mVar2 = (m7.m) kVarB.f10091e;
                    if (dVar2 != null) {
                        m7.j jVar4 = dVar2.J == null ? mVar2.G : null;
                        m7.j jVarD = jVar3 == null ? mVar2.d() : null;
                        if (jVar4 != null || jVarD != null) {
                            g7.f fVar2 = mVar.f10098e;
                            t tVarN = mVar.f10103j.n();
                            int iO = mVar.f10103j.o();
                            Object objR = mVar.f10103j.r();
                            if (jVar4 != null) {
                                m7.j jVarA = jVar4.a(jVarD, bVar.f10576a);
                                if (jVarA != null) {
                                    jVar4 = jVarA;
                                }
                            } else {
                                jVarD.getClass();
                                jVar4 = jVarD;
                            }
                            qVar2.C = new j(fVar2, ze.d.i(mVar2, bVar.f10576a, jVar4, 0), tVarN, iO, objR, (d) kVarB.f10090d);
                        }
                        z14 = qVar2.B;
                        eVar = (e) qVar2.C;
                        qVar2.C = null;
                        qVar2.B = false;
                        if (z14) {
                            this.S = j13;
                            this.Y = true;
                            return true;
                        }
                        if (eVar == null) {
                            return false;
                        }
                        this.P = eVar;
                        z15 = eVar instanceof a;
                        e0Var = this.O;
                        if (z15) {
                            aVar2 = (a) eVar;
                            if (z10) {
                                j15 = aVar2.G;
                                j16 = this.S;
                                if (j15 < j16) {
                                    this.M.f13814t = j16;
                                    while (i12 < r5) {
                                        z0Var.f13814t = this.S;
                                    }
                                    if (this.W) {
                                        t tVar2 = aVar2.D;
                                        this.X = !x0.a(tVar2.f1594n, tVar2.f1593k);
                                    }
                                }
                                this.W = false;
                                this.S = -9223372036854775807L;
                            }
                            aVar2.M = e0Var;
                            z0VarArr = (z0[]) e0Var.C;
                            iArr = new int[z0VarArr.length];
                            while (i11 < z0VarArr.length) {
                                z0 z0Var3 = z0VarArr[i11];
                                iArr[i11] = z0Var3.f13811q + z0Var3.f13810p;
                            }
                            aVar2.N = iArr;
                            this.K.add(aVar2);
                        } else if (eVar instanceof j) {
                            ((j) eVar).K = e0Var;
                        }
                        lVar.d(eVar, this, this.H.n(eVar.C));
                        return true;
                    }
                    list2 = list2;
                    m7.c cVar4 = mVar.f10104k;
                    boolean z16 = (cVar4.f10583d && mVar.l == cVar4.m.size() + (-1)) ? z11 : false;
                    boolean z17 = (z16 && j29 == -9223372036854775807L) ? false : z11;
                    if (kVarB.c() == j27) {
                        qVar2.B = z17;
                    } else {
                        jVar3.getClass();
                        boolean z18 = z17;
                        long jH5 = jVar3.h(j29, jH2) + j30;
                        long jB2 = kVarB.b(jH2);
                        if (z16) {
                            long jD2 = kVarB.d(jB2);
                            z12 = z18 & ((jD2 - kVarB.e(jB2)) + jD2 >= j29 ? z11 : false);
                        } else {
                            z12 = z18;
                        }
                        if (aVar != null) {
                            jI = aVar.b();
                            j14 = jB2;
                        } else {
                            jVar3.getClass();
                            j14 = jB2;
                            jI = i0.i(jVar3.o(j9, j29) + j30, jH5, j14);
                        }
                        long j31 = jI;
                        if (j31 < jH5) {
                            mVar.m = new BehindLiveWindowException();
                        } else if (j31 <= j14) {
                            long j32 = j9;
                            if (mVar.f10105n && j31 >= j14) {
                                qVar2.B = z12;
                            } else if (!z12 || kVarB.e(j31) < j29) {
                                int iMin = (int) Math.min(mVar.f10100g, (j14 - j31) + 1);
                                int i15 = (j29 > (-9223372036854775807L) ? 1 : (j29 == (-9223372036854775807L) ? 0 : -1));
                                if (i15 != 0) {
                                    while (iMin > 1 && kVarB.e((((long) iMin) + j31) - 1) >= j29) {
                                        iMin--;
                                    }
                                }
                                long j33 = list2.isEmpty() ? j32 : -9223372036854775807L;
                                g7.f fVar3 = mVar.f10098e;
                                int i16 = mVar.f10097d;
                                t tVarN2 = mVar.f10103j.n();
                                int iO2 = mVar.f10103j.o();
                                Object objR2 = mVar.f10103j.r();
                                long jE = kVarB.e(j31);
                                jVar3.getClass();
                                m7.j jVarL = jVar3.l(j31 - j30);
                                if (dVar2 == null) {
                                    iVar = new l(fVar3, ze.d.i(mVar2, bVar.f10576a, jVarL, kVarB.f(j31, j25) ? 0 : 8), tVarN2, iO2, objR2, jE, kVarB.d(j31), j31, i16, tVarN2);
                                } else {
                                    int i17 = 1;
                                    int i18 = 1;
                                    while (true) {
                                        if (i17 >= iMin) {
                                            i10 = i15;
                                            break;
                                        }
                                        int i19 = iMin;
                                        i10 = i15;
                                        jVar3.getClass();
                                        m7.j jVarA2 = jVarL.a(jVar3.l((j31 + ((long) i17)) - j30), bVar.f10576a);
                                        if (jVarA2 == null) {
                                            break;
                                        }
                                        i18++;
                                        i17++;
                                        i15 = i10;
                                        jVarL = jVarA2;
                                        iMin = i19;
                                    }
                                    long j34 = (j31 + ((long) i18)) - 1;
                                    long jD3 = kVarB.d(j34);
                                    long j35 = (i10 == 0 || j29 > jD3) ? -9223372036854775807L : j29;
                                    g7.j jVarI = ze.d.i(mVar2, bVar.f10576a, jVarL, kVarB.f(j34, j25) ? 0 : 8);
                                    long j36 = -mVar2.C;
                                    if (x0.k(tVarN2.f1594n)) {
                                        j36 += jE;
                                    }
                                    iVar = new i(fVar3, jVarI, tVarN2, iO2, objR2, jE, jD3, j33, j35, j31, i18, j36, (d) kVarB.f10090d);
                                }
                                qVar2.C = iVar;
                            } else {
                                qVar2.B = z11;
                            }
                        } else {
                            qVar2.B = z12;
                        }
                    }
                    z14 = qVar2.B;
                    eVar = (e) qVar2.C;
                    qVar2.C = null;
                    qVar2.B = false;
                    if (z14) {
                        this.S = j13;
                        this.Y = true;
                        return true;
                    }
                    if (eVar == null) {
                        return false;
                    }
                    this.P = eVar;
                    z15 = eVar instanceof a;
                    e0Var = this.O;
                    if (z15) {
                        aVar2 = (a) eVar;
                        if (z10) {
                            j15 = aVar2.G;
                            j16 = this.S;
                            if (j15 < j16) {
                                this.M.f13814t = j16;
                                while (i12 < r5) {
                                    z0Var.f13814t = this.S;
                                }
                                if (this.W) {
                                    t tVar3 = aVar2.D;
                                    this.X = !x0.a(tVar3.f1594n, tVar3.f1593k);
                                }
                            }
                            this.W = false;
                            this.S = -9223372036854775807L;
                        }
                        aVar2.M = e0Var;
                        z0VarArr = (z0[]) e0Var.C;
                        iArr = new int[z0VarArr.length];
                        while (i11 < z0VarArr.length) {
                            z0 z0Var4 = z0VarArr[i11];
                            iArr[i11] = z0Var4.f13811q + z0Var4.f13810p;
                        }
                        aVar2.N = iArr;
                        this.K.add(aVar2);
                    } else if (eVar instanceof j) {
                        ((j) eVar).K = e0Var;
                    }
                    lVar.d(eVar, this, this.H.n(eVar.C));
                    return true;
                }
                z10 = zY;
                qVar = qVar3;
                j10 = -9223372036854775807L;
                lVar = lVar2;
                qVar2 = qVar;
                j13 = j10;
                z14 = qVar2.B;
                eVar = (e) qVar2.C;
                qVar2.C = null;
                qVar2.B = false;
                if (z14) {
                    this.S = j13;
                    this.Y = true;
                    return true;
                }
                if (eVar == null) {
                    return false;
                }
                this.P = eVar;
                z15 = eVar instanceof a;
                e0Var = this.O;
                if (z15) {
                    aVar2 = (a) eVar;
                    if (z10) {
                        j15 = aVar2.G;
                        j16 = this.S;
                        if (j15 < j16) {
                            this.M.f13814t = j16;
                            while (i12 < r5) {
                                z0Var.f13814t = this.S;
                            }
                            if (this.W) {
                                t tVar4 = aVar2.D;
                                this.X = !x0.a(tVar4.f1594n, tVar4.f1593k);
                            }
                        }
                        this.W = false;
                        this.S = -9223372036854775807L;
                    }
                    aVar2.M = e0Var;
                    z0VarArr = (z0[]) e0Var.C;
                    iArr = new int[z0VarArr.length];
                    while (i11 < z0VarArr.length) {
                        z0 z0Var5 = z0VarArr[i11];
                        iArr[i11] = z0Var5.f13811q + z0Var5.f13810p;
                    }
                    aVar2.N = iArr;
                    this.K.add(aVar2);
                } else if (eVar instanceof j) {
                    ((j) eVar).K = e0Var;
                }
                lVar.d(eVar, this, this.H.n(eVar.C));
                return true;
            }
        }
        return false;
    }

    @Override
    public final i9.d f(w7.j jVar, long j9, long j10, IOException iOException, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        m7.b bVarT;
        r rVar;
        t0 t0Var;
        long jElapsedRealtime;
        ArrayList arrayList;
        int length;
        int i11;
        int i12;
        HashSet hashSet;
        int i13;
        int size;
        HashSet hashSet2;
        ArrayList arrayListU;
        int i14;
        int size2;
        int i15;
        i9.d dVar;
        int i16;
        long jMax;
        boolean zP;
        int i17;
        i9.d dVar2;
        boolean z14;
        int i18;
        boolean z15;
        long jMin;
        boolean z16;
        e eVar = (e) jVar;
        g7.r rVar2 = eVar.I;
        long j11 = eVar.G;
        t tVar = eVar.D;
        long j12 = rVar2.B;
        boolean z17 = eVar instanceof a;
        ArrayList arrayList2 = this.K;
        int size3 = arrayList2.size() - 1;
        if (j12 != 0 && z17 && x(size3)) {
            z10 = false;
            z11 = false;
        } else {
            z10 = true;
            z11 = false;
        }
        g7.j jVar2 = eVar.B;
        g7.r rVar3 = eVar.I;
        s7.r rVar4 = new s7.r(jVar2, rVar3.C, rVar3.D, j9, j12);
        String str = i0.f5136a;
        m mVar = this.E;
        l7.k[] kVarArr = mVar.f10102i;
        oj.q qVar = mVar.f10095b;
        w wVar = this.H;
        if (z10) {
            p pVar = mVar.f10101h;
            if (pVar != null) {
                z12 = z17;
                long j13 = pVar.f10111d;
                boolean z18 = j13 != -9223372036854775807L && j13 < j11;
                l7.q qVar2 = pVar.f10112e;
                if (qVar2.F.f10583d) {
                    if (!qVar2.H) {
                        if (z18) {
                            if (qVar2.G) {
                                qVar2.H = true;
                                qVar2.G = false;
                                l7.i iVar = qVar2.B.f10069a;
                                iVar.D.removeCallbacks(iVar.f10083w);
                                iVar.z();
                            }
                        }
                    }
                    z13 = z12;
                    arrayList = arrayList2;
                    z10 = z10;
                    zP = true;
                }
                if (!zP) {
                    dVar2 = null;
                } else if (z10) {
                    if (z13) {
                        if (q(size3) == eVar) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        c0.A(z16);
                        if (arrayList.isEmpty()) {
                            this.S = this.T;
                        }
                    }
                    dVar2 = w7.l.f15874d;
                } else {
                    e7.a.m("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                    dVar2 = null;
                }
                if (dVar2 == null) {
                    wVar.getClass();
                    if (!(iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader$UnexpectedLoaderException)) {
                        jMin = -9223372036854775807L;
                        break;
                    }
                    int i19 = DataSourceException.B;
                    Throwable cause = iOException;
                    while (true) {
                        if (cause == null) {
                            jMin = Math.min((i10 - 1) * 1000, 5000);
                            break;
                        }
                        if ((cause instanceof DataSourceException) && ((DataSourceException) cause).A == 2008) {
                            jMin = -9223372036854775807L;
                            break;
                        }
                        cause = cause.getCause();
                    }
                    if (jMin != -9223372036854775807L) {
                        z14 = false;
                        dVar2 = new i9.d(0, jMin, false);
                    } else {
                        z14 = false;
                        dVar2 = w7.l.f15875e;
                    }
                } else {
                    z14 = false;
                }
                i18 = dVar2.f7552a;
                if (i18 != 0 || i18 == 1) {
                    z14 = true;
                }
                i9.d dVar3 = dVar2;
                z15 = z14;
                this.G.u(rVar4, eVar.C, this.A, eVar.D, eVar.E, eVar.F, eVar.G, eVar.H, iOException, !z14);
                if (!z15) {
                    this.P = null;
                    wVar.getClass();
                    this.F.d(this);
                }
                return dVar3;
            }
            z12 = z17;
            if (!mVar.f10104k.f10583d && z12 && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).D == 404) {
                l7.k kVar = kVarArr[mVar.f10103j.b(tVar)];
                long jC = kVar.c();
                if (jC == -1 || jC == 0) {
                    z13 = z12;
                } else {
                    l7.j jVar3 = (l7.j) kVar.f10093g;
                    jVar3.getClass();
                    z13 = z12;
                    if (((a) eVar).b() > ((jVar3.x() + kVar.f10089c) + jC) - 1) {
                        mVar.f10105n = true;
                    }
                }
                l7.k kVar2 = kVarArr[mVar.f10103j.b(tVar)];
                m7.m mVar2 = (m7.m) kVar2.f10091e;
                m7.b bVar = (m7.b) kVar2.f10092f;
                bVarT = qVar.T(mVar2.B);
                if (bVarT != null) {
                }
                rVar = mVar.f10103j;
                t0Var = ((m7.m) kVar2.f10091e).B;
                jElapsedRealtime = SystemClock.elapsedRealtime();
                arrayList = arrayList2;
                length = rVar.length();
                i12 = 0;
                for (i11 = 0; i11 < length; i11++) {
                    if (rVar.a(i11, jElapsedRealtime)) {
                        i12++;
                    }
                }
                hashSet = new HashSet();
                for (i13 = 0; i13 < t0Var.size(); i13++) {
                    hashSet.add(Integer.valueOf(((m7.b) t0Var.get(i13)).f10578c));
                }
                size = hashSet.size();
                hashSet2 = new HashSet();
                arrayListU = qVar.u(t0Var);
                for (i14 = 0; i14 < arrayListU.size(); i14++) {
                    hashSet2.add(Integer.valueOf(((m7.b) arrayListU.get(i14)).f10578c));
                }
                size2 = size - hashSet2.size();
                i15 = length - i12;
                if (i15 > 1) {
                }
                wVar.getClass();
                if (iOException instanceof HttpDataSource$InvalidResponseCodeException) {
                    dVar = null;
                } else if (size - size2 > 1) {
                    dVar = new i9.d(1, 300000L);
                    i15 = i15;
                } else if (i15 > 1) {
                    dVar = new i9.d(2, 60000L);
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    long j14 = dVar.f7553b;
                    i16 = dVar.f7552a;
                    if (i16 == 1) {
                    }
                    zP = false;
                } else {
                    zP = false;
                }
                if (!zP) {
                    dVar2 = null;
                } else if (z10) {
                    if (z13) {
                        if (q(size3) == eVar) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        c0.A(z16);
                        if (arrayList.isEmpty()) {
                            this.S = this.T;
                        }
                    }
                    dVar2 = w7.l.f15874d;
                } else {
                    e7.a.m("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                    dVar2 = null;
                }
                if (dVar2 == null) {
                    wVar.getClass();
                    if (!(iOException instanceof ParserException)) {
                        jMin = -9223372036854775807L;
                        break;
                    }
                    jMin = -9223372036854775807L;
                    break;
                    if (jMin != -9223372036854775807L) {
                        z14 = false;
                        dVar2 = new i9.d(0, jMin, false);
                    } else {
                        z14 = false;
                        dVar2 = w7.l.f15875e;
                    }
                } else {
                    z14 = false;
                }
                i18 = dVar2.f7552a;
                if (i18 != 0) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                i9.d dVar4 = dVar2;
                z15 = z14;
                this.G.u(rVar4, eVar.C, this.A, eVar.D, eVar.E, eVar.F, eVar.G, eVar.H, iOException, !z14);
                if (!z15) {
                    this.P = null;
                    wVar.getClass();
                    this.F.d(this);
                }
                return dVar4;
            }
            z13 = z12;
            l7.k kVar3 = kVarArr[mVar.f10103j.b(tVar)];
            m7.m mVar3 = (m7.m) kVar3.f10091e;
            m7.b bVar2 = (m7.b) kVar3.f10092f;
            bVarT = qVar.T(mVar3.B);
            if (bVarT != null || bVar2.equals(bVarT)) {
                rVar = mVar.f10103j;
                t0Var = ((m7.m) kVar3.f10091e).B;
                jElapsedRealtime = SystemClock.elapsedRealtime();
                arrayList = arrayList2;
                length = rVar.length();
                i12 = 0;
                while (i11 < length) {
                    if (rVar.a(i11, jElapsedRealtime)) {
                        i12++;
                    }
                }
                hashSet = new HashSet();
                while (i13 < t0Var.size()) {
                    hashSet.add(Integer.valueOf(((m7.b) t0Var.get(i13)).f10578c));
                }
                size = hashSet.size();
                hashSet2 = new HashSet();
                arrayListU = qVar.u(t0Var);
                while (i14 < arrayListU.size()) {
                    hashSet2.add(Integer.valueOf(((m7.b) arrayListU.get(i14)).f10578c));
                }
                size2 = size - hashSet2.size();
                i15 = length - i12;
                if (i15 > 1 || size - size2 > 1) {
                    wVar.getClass();
                    if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) || !((i17 = ((HttpDataSource$InvalidResponseCodeException) iOException).D) == 403 || i17 == 404 || i17 == 410 || i17 == 416 || i17 == 500 || i17 == 503)) {
                        dVar = null;
                    } else if (size - size2 > 1) {
                        dVar = new i9.d(1, 300000L);
                        i15 = i15;
                    } else if (i15 > 1) {
                        dVar = new i9.d(2, 60000L);
                    } else {
                        dVar = null;
                    }
                    if (dVar != null) {
                        long j15 = dVar.f7553b;
                        i16 = dVar.f7552a;
                        if (i16 == 1 ? i15 > 1 : size - size2 > 1) {
                            if (i16 == 2) {
                                r rVar5 = mVar.f10103j;
                                zP = rVar5.p(rVar5.b(tVar), j15);
                            } else if (i16 == 1) {
                                long jElapsedRealtime2 = SystemClock.elapsedRealtime() + j15;
                                String str2 = bVar2.f10577b;
                                HashMap map = (HashMap) qVar.B;
                                if (map.containsKey(str2)) {
                                    Long l = (Long) map.get(str2);
                                    String str3 = i0.f5136a;
                                    jMax = Math.max(jElapsedRealtime2, l.longValue());
                                } else {
                                    jMax = jElapsedRealtime2;
                                }
                                map.put(str2, Long.valueOf(jMax));
                                int i20 = bVar2.f10578c;
                                if (i20 != Integer.MIN_VALUE) {
                                    Integer numValueOf = Integer.valueOf(i20);
                                    HashMap map2 = (HashMap) qVar.C;
                                    if (map2.containsKey(numValueOf)) {
                                        Long l10 = (Long) map2.get(numValueOf);
                                        String str4 = i0.f5136a;
                                        jElapsedRealtime2 = Math.max(jElapsedRealtime2, l10.longValue());
                                    }
                                    map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                }
                            }
                        }
                    }
                    if (!zP) {
                        dVar2 = null;
                    } else if (z10) {
                        if (z13) {
                            if (q(size3) == eVar) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            c0.A(z16);
                            if (arrayList.isEmpty()) {
                                this.S = this.T;
                            }
                        }
                        dVar2 = w7.l.f15874d;
                    } else {
                        e7.a.m("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                        dVar2 = null;
                    }
                    if (dVar2 == null) {
                        wVar.getClass();
                        if (!(iOException instanceof ParserException)) {
                            jMin = -9223372036854775807L;
                            break;
                        }
                        jMin = -9223372036854775807L;
                        break;
                        if (jMin != -9223372036854775807L) {
                            z14 = false;
                            dVar2 = new i9.d(0, jMin, false);
                        } else {
                            z14 = false;
                            dVar2 = w7.l.f15875e;
                        }
                    } else {
                        z14 = false;
                    }
                    i18 = dVar2.f7552a;
                    if (i18 != 0) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    i9.d dVar5 = dVar2;
                    z15 = z14;
                    this.G.u(rVar4, eVar.C, this.A, eVar.D, eVar.E, eVar.F, eVar.G, eVar.H, iOException, !z14);
                    if (!z15) {
                        this.P = null;
                        wVar.getClass();
                        this.F.d(this);
                    }
                    return dVar5;
                }
                zP = false;
                if (!zP) {
                    dVar2 = null;
                } else if (z10) {
                    if (z13) {
                        if (q(size3) == eVar) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        c0.A(z16);
                        if (arrayList.isEmpty()) {
                            this.S = this.T;
                        }
                    }
                    dVar2 = w7.l.f15874d;
                } else {
                    e7.a.m("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                    dVar2 = null;
                }
                if (dVar2 == null) {
                    wVar.getClass();
                    if (!(iOException instanceof ParserException)) {
                        jMin = -9223372036854775807L;
                        break;
                    }
                    jMin = -9223372036854775807L;
                    break;
                    if (jMin != -9223372036854775807L) {
                        z14 = false;
                        dVar2 = new i9.d(0, jMin, false);
                    } else {
                        z14 = false;
                        dVar2 = w7.l.f15875e;
                    }
                } else {
                    z14 = false;
                }
                i18 = dVar2.f7552a;
                if (i18 != 0) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                i9.d dVar6 = dVar2;
                z15 = z14;
                this.G.u(rVar4, eVar.C, this.A, eVar.D, eVar.E, eVar.F, eVar.G, eVar.H, iOException, !z14);
                if (!z15) {
                    this.P = null;
                    wVar.getClass();
                    this.F.d(this);
                }
                return dVar6;
            }
            zP = true;
            if (!zP) {
                dVar2 = null;
            } else if (z10) {
                if (z13) {
                    if (q(size3) == eVar) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    c0.A(z16);
                    if (arrayList.isEmpty()) {
                        this.S = this.T;
                    }
                }
                dVar2 = w7.l.f15874d;
            } else {
                e7.a.m("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                dVar2 = null;
            }
            if (dVar2 == null) {
                wVar.getClass();
                if (!(iOException instanceof ParserException)) {
                    jMin = -9223372036854775807L;
                    break;
                }
                jMin = -9223372036854775807L;
                break;
                if (jMin != -9223372036854775807L) {
                    z14 = false;
                    dVar2 = new i9.d(0, jMin, false);
                } else {
                    z14 = false;
                    dVar2 = w7.l.f15875e;
                }
            } else {
                z14 = false;
            }
            i18 = dVar2.f7552a;
            if (i18 != 0) {
                z14 = true;
            } else {
                z14 = true;
            }
            i9.d dVar7 = dVar2;
            z15 = z14;
            this.G.u(rVar4, eVar.C, this.A, eVar.D, eVar.E, eVar.F, eVar.G, eVar.H, iOException, !z14);
            if (!z15) {
                this.P = null;
                wVar.getClass();
                this.F.d(this);
            }
            return dVar7;
            arrayList = arrayList2;
            z10 = z10;
            zP = true;
            if (!zP) {
                dVar2 = null;
            } else if (z10) {
                if (z13) {
                    if (q(size3) == eVar) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    c0.A(z16);
                    if (arrayList.isEmpty()) {
                        this.S = this.T;
                    }
                }
                dVar2 = w7.l.f15874d;
            } else {
                e7.a.m("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                dVar2 = null;
            }
            if (dVar2 == null) {
                wVar.getClass();
                if (!(iOException instanceof ParserException)) {
                    jMin = -9223372036854775807L;
                    break;
                }
                jMin = -9223372036854775807L;
                break;
                if (jMin != -9223372036854775807L) {
                    z14 = false;
                    dVar2 = new i9.d(0, jMin, false);
                } else {
                    z14 = false;
                    dVar2 = w7.l.f15875e;
                }
            } else {
                z14 = false;
            }
            i18 = dVar2.f7552a;
            if (i18 != 0) {
                z14 = true;
            } else {
                z14 = true;
            }
            i9.d dVar8 = dVar2;
            z15 = z14;
            this.G.u(rVar4, eVar.C, this.A, eVar.D, eVar.E, eVar.F, eVar.G, eVar.H, iOException, !z14);
            if (!z15) {
                this.P = null;
                wVar.getClass();
                this.F.d(this);
            }
            return dVar8;
        }
        z13 = z17;
        arrayList = arrayList2;
        z10 = z10;
        zP = false;
        if (!zP) {
            dVar2 = null;
        } else if (z10) {
            if (z13) {
                if (q(size3) == eVar) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                c0.A(z16);
                if (arrayList.isEmpty()) {
                    this.S = this.T;
                }
            }
            dVar2 = w7.l.f15874d;
        } else {
            e7.a.m("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            dVar2 = null;
        }
        if (dVar2 == null) {
            wVar.getClass();
            if (!(iOException instanceof ParserException)) {
                jMin = -9223372036854775807L;
                break;
            }
            jMin = -9223372036854775807L;
            break;
            if (jMin != -9223372036854775807L) {
                z14 = false;
                dVar2 = new i9.d(0, jMin, false);
            } else {
                z14 = false;
                dVar2 = w7.l.f15875e;
            }
        } else {
            z14 = false;
        }
        i18 = dVar2.f7552a;
        if (i18 != 0) {
            z14 = true;
        } else {
            z14 = true;
        }
        i9.d dVar9 = dVar2;
        z15 = z14;
        this.G.u(rVar4, eVar.C, this.A, eVar.D, eVar.E, eVar.F, eVar.G, eVar.H, iOException, !z14);
        if (!z15) {
            this.P = null;
            wVar.getClass();
            this.F.d(this);
        }
        return dVar9;
    }

    @Override
    public final long g() {
        if (y()) {
            return this.S;
        }
        if (this.Y) {
            return Long.MIN_VALUE;
        }
        return w().H;
    }

    @Override
    public final void h(w7.j jVar, long j9, long j10, int i10) {
        s7.r rVar;
        e eVar = (e) jVar;
        if (i10 == 0) {
            long j11 = eVar.A;
            rVar = new s7.r(eVar.B, j9);
        } else {
            long j12 = eVar.A;
            g7.j jVar2 = eVar.B;
            g7.r rVar2 = eVar.I;
            rVar = new s7.r(jVar2, rVar2.C, rVar2.D, j9, rVar2.B);
        }
        this.G.w(rVar, eVar.C, this.A, eVar.D, eVar.E, eVar.F, eVar.G, eVar.H, i10);
    }

    @Override
    public final boolean isLoading() {
        return this.I.b();
    }

    @Override
    public final int l(long j9) {
        if (y()) {
            return 0;
        }
        boolean z10 = this.Y;
        z0 z0Var = this.M;
        int iR = z0Var.r(z10, j9);
        a aVar = this.V;
        if (aVar != null) {
            iR = Math.min(iR, aVar.a(0) - z0Var.p());
        }
        z0Var.z(iR);
        z();
        return iR;
    }

    @Override
    public final int n(h7.b bVar, h7.e eVar, int i10) {
        if (y()) {
            return -3;
        }
        a aVar = this.V;
        z0 z0Var = this.M;
        if (aVar != null && aVar.a(0) <= z0Var.p()) {
            return -3;
        }
        z();
        return z0Var.v(bVar, eVar, i10, this.Y);
    }

    public final a q(int i10) {
        ArrayList arrayList = this.K;
        a aVar = (a) arrayList.get(i10);
        i0.N(arrayList, i10, arrayList.size());
        this.U = Math.max(this.U, arrayList.size());
        int i11 = 0;
        this.M.l(aVar.a(0));
        while (true) {
            z0[] z0VarArr = this.N;
            if (i11 >= z0VarArr.length) {
                return aVar;
            }
            z0 z0Var = z0VarArr[i11];
            i11++;
            z0Var.l(aVar.a(i11));
        }
    }

    @Override
    public final void r(w7.j jVar, long j9, long j10, boolean z10) {
        e eVar = (e) jVar;
        this.P = null;
        this.V = null;
        long j11 = eVar.A;
        g7.j jVar2 = eVar.B;
        g7.r rVar = eVar.I;
        s7.r rVar2 = new s7.r(jVar2, rVar.C, rVar.D, j9, rVar.B);
        this.H.getClass();
        this.G.s(rVar2, eVar.C, this.A, eVar.D, eVar.E, eVar.F, eVar.G, eVar.H);
        if (z10) {
            return;
        }
        if (y()) {
            this.M.w(false);
            for (z0 z0Var : this.N) {
                z0Var.w(false);
            }
        } else if (eVar instanceof a) {
            ArrayList arrayList = this.K;
            q(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.S = this.T;
            }
        }
        this.F.d(this);
    }

    @Override
    public final long t() {
        long j9;
        ArrayList arrayList = this.K;
        if (this.Y) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.S;
        }
        long jMax = this.T;
        a aVarW = w();
        if (!aVarW.c()) {
            aVarW = arrayList.size() > 1 ? (a) g4.c.d(2, arrayList) : null;
        }
        if (aVarW != null) {
            jMax = Math.max(jMax, aVarW.H);
        }
        z0 z0Var = this.M;
        synchronized (z0Var) {
            j9 = z0Var.f13816v;
        }
        return Math.max(jMax, j9);
    }

    @Override
    public final void u(w7.j jVar, long j9, long j10) {
        e eVar = (e) jVar;
        this.P = null;
        m mVar = this.E;
        l7.k[] kVarArr = mVar.f10102i;
        if (eVar instanceof j) {
            int iB = mVar.f10103j.b(((j) eVar).D);
            l7.k kVar = kVarArr[iB];
            if (((l7.j) kVar.f10093g) == null) {
                d dVar = (d) kVar.f10090d;
                dVar.getClass();
                a8.k kVarA = dVar.a();
                if (kVarA != null) {
                    m7.m mVar2 = (m7.m) kVar.f10091e;
                    kVarArr[iB] = new l7.k(kVar.f10088b, mVar2, (m7.b) kVar.f10092f, (d) kVar.f10090d, kVar.f10089c, new a8.i0(kVarA, mVar2.C, 7));
                }
            }
        }
        p pVar = mVar.f10101h;
        if (pVar != null) {
            long j11 = pVar.f10111d;
            if (j11 == -9223372036854775807L || eVar.H > j11) {
                pVar.f10111d = eVar.H;
            }
            pVar.f10112e.G = true;
        }
        long j12 = eVar.A;
        g7.j jVar2 = eVar.B;
        g7.r rVar = eVar.I;
        s7.r rVar2 = new s7.r(jVar2, rVar.C, rVar.D, j9, rVar.B);
        this.H.getClass();
        this.G.t(rVar2, eVar.C, this.A, eVar.D, eVar.E, eVar.F, eVar.G, eVar.H);
        this.F.d(this);
    }

    @Override
    public final void v(long j9) {
        w7.l lVar = this.I;
        if (lVar.f15878c == null && !y()) {
            boolean zB = lVar.b();
            List list = this.L;
            m mVar = this.E;
            ArrayList arrayList = this.K;
            if (zB) {
                e eVar = this.P;
                eVar.getClass();
                boolean z10 = eVar instanceof a;
                if (z10 && x(arrayList.size() - 1)) {
                    return;
                }
                if (mVar.m != null ? false : mVar.f10103j.f(j9, eVar, list)) {
                    w7.i iVar = lVar.f15877b;
                    iVar.getClass();
                    iVar.a(false);
                    if (z10) {
                        this.V = (a) eVar;
                        return;
                    }
                    return;
                }
                return;
            }
            int size = (mVar.m != null || mVar.f10103j.length() < 2) ? list.size() : mVar.f10103j.k(j9, list);
            if (size < arrayList.size()) {
                c0.A(!lVar.b());
                int size2 = arrayList.size();
                while (true) {
                    if (size >= size2) {
                        size = -1;
                        break;
                    } else if (!x(size)) {
                        break;
                    } else {
                        size++;
                    }
                }
                if (size == -1) {
                    return;
                }
                long j10 = w().H;
                a aVarQ = q(size);
                if (arrayList.isEmpty()) {
                    this.S = this.T;
                }
                this.Y = false;
                s7.w wVar = new s7.w(1, this.A, null, 3, null, i0.W(aVarQ.G), i0.W(j10));
                c50.h hVar = this.G;
                a0 a0Var = (a0) hVar.C;
                a0Var.getClass();
                hVar.h(new ce.a(hVar, a0Var, wVar, 11));
            }
        }
    }

    public final a w() {
        return (a) g4.c.d(1, this.K);
    }

    public final boolean x(int i10) {
        int iP;
        a aVar = (a) this.K.get(i10);
        if (this.M.p() > aVar.a(0)) {
            return true;
        }
        int i11 = 0;
        do {
            z0[] z0VarArr = this.N;
            if (i11 >= z0VarArr.length) {
                return false;
            }
            iP = z0VarArr[i11].p();
            i11++;
        } while (iP <= aVar.a(i11));
        return true;
    }

    public final boolean y() {
        return this.S != -9223372036854775807L;
    }

    public final void z() {
        int iA = A(this.M.p(), this.U - 1);
        while (true) {
            int i10 = this.U;
            if (i10 > iA) {
                return;
            }
            this.U = i10 + 1;
            a aVar = (a) this.K.get(i10);
            t tVar = aVar.D;
            if (!tVar.equals(this.Q)) {
                this.G.i(this.A, tVar, aVar.E, aVar.F, aVar.G);
            }
            this.Q = tVar;
        }
    }
}
