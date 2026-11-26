package l7;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.common.j0;
import androidx.media3.common.k0;
import androidx.media3.common.l0;
import androidx.media3.common.q0;
import androidx.media3.common.r0;
import androidx.media3.common.t;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.android.gms.internal.measurement.z3;
import e7.i0;
import g7.r;
import g7.s;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import s7.a0;
import s7.y;
import ta.c0;
import tf.w;

public final class i extends s7.a {
    public w7.l A;
    public s B;
    public IOException C;
    public Handler D;
    public Uri E;
    public final Uri F;
    public m7.c G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public int L;
    public long M;
    public int N;
    public q0 O;
    public k0 P;

    public final boolean f10070h;

    public final g7.e f10071i;

    public final c50.h f10072j;

    public final rc.d f10073k;
    public final n7.l l;
    public final w m;

    public final oj.q f10074n;

    public final long f10075o;

    public final long f10076p;

    public final c50.h f10077q;

    public final w7.n f10078r;

    public final d f10079s;

    public final Object f10080t;

    public final SparseArray f10081u;

    public final c f10082v;

    public final c f10083w;

    public final f f10084x;

    public final w7.m f10085y;

    public g7.f f10086z;

    static {
        r0.a("media3.exoplayer.dash");
    }

    public i(q0 q0Var, g7.e eVar, w7.n nVar, c50.h hVar, rc.d dVar, n7.l lVar, w wVar, long j9, long j10) {
        this.O = q0Var;
        this.P = q0Var.f1415c;
        l0 l0Var = q0Var.f1414b;
        l0Var.getClass();
        Uri uri = l0Var.f1328a;
        this.E = uri;
        this.F = uri;
        this.G = null;
        this.f10071i = eVar;
        this.f10078r = nVar;
        this.f10072j = hVar;
        this.l = lVar;
        this.m = wVar;
        this.f10075o = j9;
        this.f10076p = j10;
        this.f10073k = dVar;
        this.f10074n = new oj.q(25);
        this.f10070h = false;
        this.f10077q = new c50.h((CopyOnWriteArrayList) this.f13639c.D, 0, (a0) null);
        this.f10080t = new Object();
        this.f10081u = new SparseArray();
        this.f10084x = new f(this);
        this.M = -9223372036854775807L;
        this.K = -9223372036854775807L;
        this.f10079s = new d(this);
        this.f10085y = new f(this);
        final int i10 = 0;
        this.f10082v = new Runnable(this) {
            public final i B;

            {
                this.B = this;
            }

            @Override
            public final void run() {
                int i11 = i10;
                i iVar = this.B;
                switch (i11) {
                    case 0:
                        iVar.z();
                        break;
                    default:
                        iVar.getClass();
                        try {
                            iVar.x(false);
                        } catch (Exception e3) {
                            iVar.C = new IOException(e3);
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f10083w = new Runnable(this) {
            public final i B;

            {
                this.B = this;
            }

            @Override
            public final void run() {
                int i12 = i11;
                i iVar = this.B;
                switch (i12) {
                    case 0:
                        iVar.z();
                        break;
                    default:
                        iVar.getClass();
                        try {
                            iVar.x(false);
                        } catch (Exception e3) {
                            iVar.C = new IOException(e3);
                        }
                        break;
                }
            }
        };
    }

    public static boolean t(m7.h hVar) {
        List list = hVar.f10608c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((m7.a) list.get(i10)).f10571b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean a(q0 q0Var) {
        l0 l0Var = h().f1414b;
        l0Var.getClass();
        l0 l0Var2 = q0Var.f1414b;
        return l0Var2 != null && l0Var2.f1328a.equals(l0Var.f1328a) && l0Var2.f1332e.equals(l0Var.f1332e) && Objects.equals(l0Var2.f1330c, l0Var.f1330c);
    }

    @Override
    public final y b(a0 a0Var, a1.i iVar, long j9) {
        int iIntValue = ((Integer) a0Var.f13644a).intValue() - this.N;
        c50.h hVar = new c50.h((CopyOnWriteArrayList) this.f13639c.D, 0, a0Var);
        n7.h hVar2 = new n7.h(this.f13640d.f11170c, 0, a0Var);
        int i10 = this.N + iIntValue;
        m7.c cVar = this.G;
        s sVar = this.B;
        long j10 = this.K;
        j7.j jVar = this.f13643g;
        jVar.getClass();
        b bVar = new b(i10, cVar, this.f10074n, iIntValue, this.f10072j, sVar, this.l, hVar2, this.m, hVar, j10, this.f10085y, iVar, this.f10073k, this.f10084x, jVar);
        this.f10081u.put(i10, bVar);
        return bVar;
    }

    @Override
    public final synchronized q0 h() {
        return this.O;
    }

    @Override
    public final void j() {
        this.f10085y.a();
    }

    @Override
    public final void l(s sVar) {
        this.B = sVar;
        Looper looperMyLooper = Looper.myLooper();
        j7.j jVar = this.f13643g;
        jVar.getClass();
        n7.l lVar = this.l;
        lVar.b(looperMyLooper, jVar);
        lVar.prepare();
        if (this.f10070h) {
            x(false);
            return;
        }
        this.f10086z = this.f10071i.t();
        this.A = new w7.l("DashMediaSource");
        this.D = i0.l(null);
        z();
    }

    @Override
    public final void n(y yVar) {
        b bVar = (b) yVar;
        q qVar = bVar.M;
        qVar.I = true;
        qVar.D.removeCallbacksAndMessages(null);
        for (t7.h hVar : bVar.R) {
            hVar.B(bVar);
        }
        bVar.Q = null;
        this.f10081u.remove(bVar.A);
    }

    @Override
    public final void p() {
        this.H = false;
        this.f10086z = null;
        w7.l lVar = this.A;
        if (lVar != null) {
            lVar.c(null);
            this.A = null;
        }
        k0 k0Var = h().f1415c;
        synchronized (this) {
            this.P = k0Var;
        }
        this.I = 0L;
        this.J = 0L;
        this.E = this.F;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.K = -9223372036854775807L;
        this.L = 0;
        this.M = -9223372036854775807L;
        this.f10081u.clear();
        oj.q qVar = this.f10074n;
        ((HashMap) qVar.B).clear();
        ((HashMap) qVar.C).clear();
        ((HashMap) qVar.D).clear();
        this.l.release();
    }

    @Override
    public final synchronized void s(q0 q0Var) {
        this.O = q0Var;
        this.P = q0Var.f1415c;
    }

    public final void u() {
        boolean z10;
        w7.l lVar = this.A;
        d dVar = new d(this);
        synchronized (x7.b.f16473b) {
            z10 = x7.b.f16474c;
        }
        if (z10) {
            dVar.a();
            return;
        }
        if (lVar == null) {
            lVar = new w7.l("SntpClient");
        }
        lVar.d(new w(19), new h(dVar, 1), 1);
    }

    public final void v(w7.o oVar, long j9) {
        long j10 = oVar.A;
        g7.j jVar = oVar.B;
        r rVar = oVar.D;
        s7.r rVar2 = new s7.r(jVar, rVar.C, rVar.D, j9, rVar.B);
        this.m.getClass();
        this.f10077q.s(rVar2, oVar.C, -1, (t) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void w(IOException iOException) {
        e7.a.e("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.K = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        x(true);
    }

    public final void x(boolean z10) {
        m7.h hVar;
        long j9;
        long j10;
        boolean z11;
        long jMax;
        boolean z12;
        long j11;
        long j12;
        long j13;
        k0 k0Var;
        m7.c cVar;
        long j14;
        List list;
        long jH;
        long jC;
        long jH2;
        long jH3;
        long jH4;
        int i10;
        List list2;
        int i11;
        j jVarB;
        long jK;
        long jMin;
        k0 k0Var2;
        long j15;
        float f3;
        k0 k0Var3;
        long jH5;
        long jMin2;
        SparseArray sparseArray;
        int i12;
        boolean z13;
        SparseArray sparseArray2;
        t7.h[] hVarArr;
        c cVar2 = this.f10083w;
        long j16 = this.f10076p;
        SparseArray sparseArray3 = this.f10081u;
        boolean z14 = false;
        int i13 = 0;
        while (i13 < sparseArray3.size()) {
            int iKeyAt = sparseArray3.keyAt(i13);
            if (iKeyAt >= this.N) {
                b bVar = (b) sparseArray3.valueAt(i13);
                m7.c cVar3 = this.G;
                int i14 = iKeyAt - this.N;
                bVar.U = cVar3;
                bVar.V = i14;
                q qVar = bVar.M;
                qVar.H = z14;
                qVar.F = cVar3;
                Iterator it = qVar.E.entrySet().iterator();
                while (it.hasNext()) {
                    int i15 = i13;
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < qVar.F.f10587h) {
                        it.remove();
                    }
                    i13 = i15;
                }
                i12 = i13;
                t7.h[] hVarArr2 = bVar.R;
                if (hVarArr2 != null) {
                    int length = hVarArr2.length;
                    int i16 = 0;
                    while (i16 < length) {
                        m mVar = hVarArr2[i16].E;
                        k[] kVarArr = mVar.f10102i;
                        try {
                            mVar.f10104k = cVar3;
                            mVar.l = i14;
                            long jC2 = cVar3.c(i14);
                            try {
                                ArrayList arrayListA = mVar.a();
                                sparseArray2 = sparseArray3;
                                hVarArr = hVarArr2;
                                int i17 = 0;
                                while (i17 < kVarArr.length) {
                                    try {
                                        k[] kVarArr2 = kVarArr;
                                        kVarArr2[i17] = kVarArr2[i17].a(jC2, (m7.m) arrayListA.get(mVar.f10103j.j(i17)));
                                        i17++;
                                        kVarArr = kVarArr2;
                                    } catch (BehindLiveWindowException e3) {
                                        e = e3;
                                        mVar.m = e;
                                    }
                                }
                            } catch (BehindLiveWindowException e10) {
                                e = e10;
                                sparseArray2 = sparseArray3;
                                hVarArr = hVarArr2;
                            }
                        } catch (BehindLiveWindowException e11) {
                            e = e11;
                            sparseArray2 = sparseArray3;
                            hVarArr = hVarArr2;
                        }
                        i16++;
                        sparseArray3 = sparseArray2;
                        hVarArr2 = hVarArr;
                    }
                    sparseArray = sparseArray3;
                    z13 = true;
                    bVar.Q.d(bVar);
                } else {
                    sparseArray = sparseArray3;
                    z13 = true;
                }
                bVar.W = cVar3.a(i14).f10609d;
                for (n nVar : bVar.S) {
                    for (m7.g gVar : bVar.W) {
                        if (gVar.a().equals(nVar.E.a())) {
                            nVar.c(gVar, (cVar3.f10583d && i14 == cVar3.m.size() + (-1)) ? z13 : false);
                            break;
                        }
                    }
                }
            } else {
                sparseArray = sparseArray3;
                i12 = i13;
            }
            i13 = i12 + 1;
            sparseArray3 = sparseArray;
            z14 = false;
        }
        int i18 = 1;
        m7.h hVarA = this.G.a(0);
        int size = this.G.m.size() - 1;
        m7.h hVarA2 = this.G.a(size);
        long jC3 = this.G.c(size);
        long jH6 = i0.H(i0.v(this.K));
        long jC4 = this.G.c(0);
        long j17 = hVarA.f10607b;
        List list3 = hVarA.f10608c;
        long jH7 = i0.H(j17);
        boolean zT = t(hVarA);
        int i19 = 0;
        while (true) {
            hVar = hVarA;
            if (i19 >= list3.size()) {
                j9 = 0;
                break;
            }
            m7.a aVar = (m7.a) list3.get(i19);
            j9 = 0;
            List list4 = aVar.f10572c;
            int i20 = aVar.f10571b;
            boolean z15 = (i20 == i18 || i20 == 2) ? false : true;
            if ((!zT || !z15) && !list4.isEmpty()) {
                j jVarB2 = ((m7.m) list4.get(0)).b();
                if (jVarB2 == null || jVarB2.B(jC4, jH6) == 0) {
                    jH7 = jH7;
                    break;
                }
                jH7 = Math.max(jH7, jVarB2.c(jVarB2.h(jC4, jH6)) + jH7);
            }
            i19++;
            i18 = 1;
            hVarA = hVar;
        }
        long j18 = hVarA2.f10607b;
        List list5 = hVarA2.f10608c;
        long jH8 = i0.H(j18);
        boolean zT2 = t(hVarA2);
        long jMin3 = Long.MAX_VALUE;
        int i21 = 0;
        while (true) {
            if (i21 >= list5.size()) {
                j10 = jMin3;
                break;
            }
            m7.a aVar2 = (m7.a) list5.get(i21);
            long j19 = jH8;
            List list6 = aVar2.f10572c;
            int i22 = aVar2.f10571b;
            boolean z16 = (i22 == 1 || i22 == 2) ? false : true;
            if ((!zT2 || !z16) && !list6.isEmpty()) {
                j jVarB3 = ((m7.m) list6.get(0)).b();
                if (jVarB3 == null) {
                    j10 = j19 + jC3;
                    break;
                }
                long jB = jVarB3.B(jC3, jH6);
                if (jB == j9) {
                    j10 = j19;
                    break;
                } else {
                    long jH9 = (jVarB3.h(jC3, jH6) + jB) - 1;
                    jMin3 = Math.min(jMin3, jVarB3.e(jH9, jC3) + jVarB3.c(jH9) + j19);
                }
            }
            i21++;
            jH8 = j19;
            jH7 = jH7;
        }
        if (!this.G.f10583d) {
            z11 = false;
            break;
        }
        int i23 = 0;
        while (true) {
            if (i23 >= list5.size()) {
                z11 = true;
                break;
            }
            j jVarB4 = ((m7.m) ((m7.a) list5.get(i23)).f10572c.get(0)).b();
            if (jVarB4 == null || jVarB4.v()) {
                z11 = false;
                break;
            }
            i23++;
        }
        if (z11) {
            long j20 = this.G.f10585f;
            if (j20 != -9223372036854775807L) {
                jMax = Math.max(jH7, j10 - i0.H(j20));
            } else {
                jMax = jH7;
            }
        } else {
            jMax = jH7;
        }
        long j21 = j10 - jMax;
        m7.c cVar4 = this.G;
        if (cVar4.f10583d) {
            c0.A(cVar4.f10580a != -9223372036854775807L);
            long jH10 = (jH6 - i0.H(this.G.f10580a)) - jMax;
            k0 k0Var4 = h().f1415c;
            long jW = i0.W(jH10);
            j11 = -9223372036854775807L;
            long j22 = k0Var4.f1310c;
            if (j22 != -9223372036854775807L) {
                jMin = Math.min(jW, j22);
            } else {
                j0 j0Var = this.G.f10589j;
                if (j0Var != null) {
                    long j23 = j0Var.f1270c;
                    if (j23 != -9223372036854775807L) {
                        jMin = Math.min(jW, j23);
                    } else {
                        jMin = jW;
                    }
                } else {
                    jMin = jW;
                }
            }
            long jW2 = i0.W(jH10 - j21);
            if (jW2 < j9 && jMin > j9) {
                jW2 = j9;
            }
            boolean z17 = z11;
            long j24 = this.G.f10582c;
            if (j24 != -9223372036854775807L) {
                jW2 = Math.min(jW2 + j24, jW);
            }
            long jI = jW2;
            long j25 = k0Var4.f1309b;
            if (j25 != -9223372036854775807L) {
                jI = i0.i(j25, jI, jW);
            } else {
                j0 j0Var2 = this.G.f10589j;
                if (j0Var2 != null) {
                    long j26 = j0Var2.f1269b;
                    if (j26 != -9223372036854775807L) {
                        jI = i0.i(j26, jI, jW);
                    }
                }
            }
            long j27 = jI;
            long j28 = j27 > jMin ? j27 : jMin;
            synchronized (this) {
                k0Var2 = this.P;
            }
            long jI2 = k0Var2.f1308a;
            if (jI2 == -9223372036854775807L) {
                m7.c cVar5 = this.G;
                j0 j0Var3 = cVar5.f10589j;
                if (j0Var3 != null) {
                    long j29 = j0Var3.f1268a;
                    if (j29 != -9223372036854775807L) {
                        jI2 = j29;
                    } else {
                        jI2 = cVar5.f10586g;
                        if (jI2 == -9223372036854775807L) {
                            jI2 = this.f10075o;
                        }
                    }
                } else {
                    jI2 = cVar5.f10586g;
                    if (jI2 == -9223372036854775807L) {
                        jI2 = this.f10075o;
                    }
                }
            }
            if (jI2 < j27) {
                jI2 = j27;
            }
            if (jI2 > j28) {
                jI2 = i0.i(i0.W(jH10 - Math.min(j16, j21 / 2)), j27, j28);
            }
            long j30 = j28;
            float f10 = k0Var4.f1311d;
            if (f10 == -3.4028235E38f) {
                j0 j0Var4 = this.G.f10589j;
                f10 = j0Var4 != null ? j0Var4.f1271d : -3.4028235E38f;
            }
            float f11 = k0Var4.f1312e;
            if (f11 == -3.4028235E38f) {
                j0 j0Var5 = this.G.f10589j;
                f11 = j0Var5 != null ? j0Var5.f1272e : -3.4028235E38f;
            }
            if (f10 == -3.4028235E38f && f11 == -3.4028235E38f) {
                j0 j0Var6 = this.G.f10589j;
                j15 = jH10;
                z12 = z17;
                if (j0Var6 == null || j0Var6.f1268a == -9223372036854775807L) {
                    f10 = 1.0f;
                    f3 = 1.0f;
                }
                j0 j0Var7 = new j0();
                j0Var7.f1268a = jI2;
                j0Var7.f1269b = j27;
                j0Var7.f1270c = j30;
                j0Var7.f1271d = f10;
                j0Var7.f1272e = f3;
                k0Var3 = new k0(j0Var7);
                synchronized (this) {
                    this.P = k0Var3;
                }
                long jW3 = i0.W(jMax) + this.G.f10580a;
                synchronized (this) {
                    k0 k0Var5 = this.P;
                }
                jH5 = j15 - i0.H(k0Var5.f1308a);
                jMin2 = Math.min(j16, j21 / 2);
                if (jH5 < jMin2) {
                    j13 = jMin2;
                } else {
                    j13 = jH5;
                }
                j12 = jW3;
            } else {
                j15 = jH10;
                z12 = z17;
            }
            f3 = f11;
            j0 j0Var8 = new j0();
            j0Var8.f1268a = jI2;
            j0Var8.f1269b = j27;
            j0Var8.f1270c = j30;
            j0Var8.f1271d = f10;
            j0Var8.f1272e = f3;
            k0Var3 = new k0(j0Var8);
            synchronized (this) {
                this.P = k0Var3;
                long jW4 = i0.W(jMax) + this.G.f10580a;
                synchronized (this) {
                    k0 k0Var6 = this.P;
                    jH5 = j15 - i0.H(k0Var6.f1308a);
                    jMin2 = Math.min(j16, j21 / 2);
                    if (jH5 < jMin2) {
                        j13 = jMin2;
                    } else {
                        j13 = jH5;
                    }
                    j12 = jW4;
                }
            }
            m(new e(j, j12, j, i, jH, j21, j13, cVar, q0VarH, k0Var));
            if (this.f10070h) {
            }
            this.D.removeCallbacks(cVar2);
            if (z12) {
                Handler handler = this.D;
                m7.c cVar6 = this.G;
                long jV = i0.v(this.K);
                int size2 = cVar6.m.size() - 1;
                m7.h hVarA3 = cVar6.a(size2);
                long j31 = hVarA3.f10607b;
                list = hVarA3.f10608c;
                jH = i0.H(j31);
                jC = cVar6.c(size2);
                jH2 = i0.H(jV);
                jH3 = i0.H(cVar6.f10580a);
                jH4 = i0.H(cVar6.f10584e);
                if (jH4 != j11 || jH4 >= 5000000) {
                    jH4 = 5000000;
                }
                i10 = 0;
                while (i10 < list.size()) {
                    list2 = ((m7.a) list.get(i10)).f10572c;
                    if (list2.isEmpty()) {
                        i11 = i10;
                    } else {
                        i11 = i10;
                        jVarB = ((m7.m) list2.get(0)).b();
                        if (jVarB != null) {
                            jK = (jVarB.k(jC, jH2) + (jH3 + jH)) - jH2;
                            if (jK > j9 && (jK < jH4 - 100000 || (jK > jH4 && jK < jH4 + 100000))) {
                                jH4 = jK;
                            }
                        }
                    }
                    i10 = i11 + 1;
                }
                handler.postDelayed(cVar2, z3.w(jH4, 1000L, RoundingMode.CEILING));
            }
            if (this.H) {
                z();
                return;
            }
            if (z10) {
                cVar = this.G;
                if (cVar.f10583d) {
                    j14 = cVar.f10584e;
                    if (j14 != j11) {
                        if (j14 == j9) {
                            j14 = 5000;
                        }
                        this.D.postDelayed(this.f10082v, Math.max(j9, (this.I + j14) - SystemClock.elapsedRealtime()));
                    }
                }
            }
        }
        z12 = z11;
        j11 = -9223372036854775807L;
        j12 = -9223372036854775807L;
        j13 = j9;
        long jH11 = jMax - i0.H(hVar.f10607b);
        m7.c cVar7 = this.G;
        long j32 = cVar7.f10580a;
        long j33 = this.K;
        int i24 = this.N;
        q0 q0VarH = h();
        if (this.G.f10583d) {
            synchronized (this) {
                k0Var = this.P;
            }
        } else {
            k0Var = null;
        }
        m(new e(j32, j12, j33, i24, jH11, j21, j13, cVar7, q0VarH, k0Var));
        if (this.f10070h) {
            this.D.removeCallbacks(cVar2);
            if (z12) {
                Handler handler2 = this.D;
                m7.c cVar8 = this.G;
                long jV2 = i0.v(this.K);
                int size3 = cVar8.m.size() - 1;
                m7.h hVarA4 = cVar8.a(size3);
                long j34 = hVarA4.f10607b;
                list = hVarA4.f10608c;
                jH = i0.H(j34);
                jC = cVar8.c(size3);
                jH2 = i0.H(jV2);
                jH3 = i0.H(cVar8.f10580a);
                jH4 = i0.H(cVar8.f10584e);
                if (jH4 != j11) {
                    jH4 = 5000000;
                } else {
                    jH4 = 5000000;
                }
                i10 = 0;
                while (i10 < list.size()) {
                    list2 = ((m7.a) list.get(i10)).f10572c;
                    if (list2.isEmpty()) {
                        i11 = i10;
                    } else {
                        i11 = i10;
                        jVarB = ((m7.m) list2.get(0)).b();
                        if (jVarB != null) {
                            jK = (jVarB.k(jC, jH2) + (jH3 + jH)) - jH2;
                            if (jK > j9) {
                                jH4 = jK;
                            }
                        }
                    }
                    i10 = i11 + 1;
                }
                handler2.postDelayed(cVar2, z3.w(jH4, 1000L, RoundingMode.CEILING));
            }
            if (this.H) {
                z();
                return;
            }
            if (z10) {
                cVar = this.G;
                if (cVar.f10583d) {
                    j14 = cVar.f10584e;
                    if (j14 != j11) {
                        if (j14 == j9) {
                            j14 = 5000;
                        }
                        this.D.postDelayed(this.f10082v, Math.max(j9, (this.I + j14) - SystemClock.elapsedRealtime()));
                    }
                }
            }
        }
    }

    public final void y(gd.d dVar, w7.n nVar) {
        g7.f fVar = this.f10086z;
        Uri uri = Uri.parse(dVar.f6315c);
        Map map = Collections.EMPTY_MAP;
        c0.w(uri, "The uri must be set.");
        this.A.d(new w7.o(fVar, new g7.j(uri, 1, null, map, 0L, -1L, null, 1), 5, nVar), new h(this, 0), 1);
    }

    public final void z() {
        Uri uri;
        this.D.removeCallbacks(this.f10082v);
        w7.l lVar = this.A;
        if (lVar.f15878c != null) {
            return;
        }
        if (lVar.b()) {
            this.H = true;
            return;
        }
        synchronized (this.f10080t) {
            uri = this.E;
        }
        this.H = false;
        Map map = Collections.EMPTY_MAP;
        c0.w(uri, "The uri must be set.");
        w7.o oVar = new w7.o(this.f10086z, new g7.j(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f10078r);
        d dVar = this.f10079s;
        this.m.getClass();
        this.A.d(oVar, dVar, 3);
    }
}
