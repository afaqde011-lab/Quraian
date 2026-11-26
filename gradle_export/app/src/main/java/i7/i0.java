package i7;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.common.h2;
import androidx.media3.common.j2;
import androidx.media3.common.k2;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.protobuf.RuntimeVersion;
import fh.d2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public final class i0 implements Handler.Callback, s7.x, d1, y7.t {
    public static final long G0 = e7.i0.W(NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS);
    public final j1[] A;
    public ExoPlaybackException A0;
    public final a[] B;
    public long B0;
    public final boolean[] C;
    public m C0;
    public final c3.b D;
    public long D0;
    public final v7.u E;
    public boolean E0;
    public final k0 F;
    public float F0;
    public final w7.d G;
    public final e7.d0 H;
    public final oe.o I;
    public final Looper J;
    public final j2 K;
    public final h2 L;
    public final long M;
    public final boolean N;
    public final h O;
    public final ArrayList P;
    public final e7.b0 Q;
    public final q R;
    public final q0 S;
    public final b1 T;
    public final e U;
    public final long V;
    public final j7.j W;
    public final j7.f X;
    public final e7.d0 Y;
    public final boolean Z;

    public final c7.f f7346a0;

    public l1 f7347b0;

    public k1 f7348c0;

    public boolean f7349d0;

    public boolean f7350e0;

    public h0 f7351f0;

    public int f7352g0;

    public c1 f7353h0;

    public ba.s f7354i0;

    public boolean f7355j0;

    public boolean f7356k0;

    public boolean f7357l0;

    public boolean f7358m0;

    public long f7359n0;

    public boolean f7360o0;

    public int f7361p0;

    public boolean f7362q0;

    public boolean f7363r0;

    public boolean f7364s0;

    public boolean f7365t0;

    public int f7366u0;

    public h0 f7367v0;

    public long f7368w0;

    public long f7369x0;

    public int f7370y0;

    public boolean f7371z0;

    public i0(Context context, a[] aVarArr, a[] aVarArr2, c3.b bVar, v7.u uVar, k0 k0Var, w7.d dVar, int i10, boolean z10, j7.f fVar, l1 l1Var, e eVar, long j9, boolean z11, Looper looper, e7.b0 b0Var, q qVar, j7.j jVar, final y7.t tVar) {
        Looper looper2;
        m mVar = m.f7420a;
        this.D0 = -9223372036854775807L;
        this.R = qVar;
        this.D = bVar;
        this.E = uVar;
        this.F = k0Var;
        this.G = dVar;
        this.f7361p0 = i10;
        this.f7362q0 = z10;
        this.f7347b0 = l1Var;
        this.U = eVar;
        this.V = j9;
        this.f7356k0 = z11;
        this.Q = b0Var;
        this.W = jVar;
        this.C0 = mVar;
        this.X = fVar;
        this.F0 = 1.0f;
        this.f7348c0 = k1.f7386b;
        this.B0 = -9223372036854775807L;
        this.f7359n0 = -9223372036854775807L;
        g gVar = (g) k0Var;
        this.M = gVar.f7317n;
        this.N = gVar.f7318o;
        k2 k2Var = k2.EMPTY;
        c1 c1VarK = c1.k(uVar);
        this.f7353h0 = c1VarK;
        this.f7354i0 = new ba.s(c1VarK);
        this.B = new a[aVarArr.length];
        this.C = new boolean[aVarArr.length];
        v7.p pVar = (v7.p) bVar;
        pVar.getClass();
        this.A = new j1[aVarArr.length];
        boolean z12 = false;
        boolean z13 = false;
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            a aVar = aVarArr[i11];
            aVar.E = i11;
            aVar.F = jVar;
            aVar.G = b0Var;
            a[] aVarArr3 = this.B;
            aVar.getClass();
            aVarArr3[i11] = aVar;
            a aVar2 = this.B[i11];
            synchronized (aVar2.A) {
                aVar2.R = pVar;
            }
            a aVar3 = aVarArr2[i11];
            if (aVar3 != null) {
                aVar3.E = i11;
                aVar3.F = jVar;
                aVar3.G = b0Var;
                z13 = true;
            }
            j1[] j1VarArr = this.A;
            a aVar4 = aVarArr[i11];
            j1 j1Var = new j1();
            j1Var.f7384e = aVar4;
            j1Var.f7382c = i11;
            j1Var.f7385f = aVar3;
            j1Var.f7383d = 0;
            j1Var.f7380a = false;
            j1Var.f7381b = false;
            j1VarArr[i11] = j1Var;
        }
        this.Z = z13;
        this.O = new h(this, b0Var);
        this.P = new ArrayList();
        this.K = new j2();
        this.L = new h2();
        ta.c0.A(((i0) bVar.f2624a) == null);
        bVar.f2624a = this;
        bVar.f2625b = dVar;
        this.f7371z0 = true;
        e7.d0 d0VarA = b0Var.a(looper, null);
        this.Y = d0VarA;
        this.S = new q0(fVar, d0VarA, new ab.r(this, 27));
        this.T = new b1(this, fVar, d0VarA, jVar);
        oe.o oVar = new oe.o();
        this.I = oVar;
        synchronized (oVar.B) {
            try {
                if (((Looper) oVar.C) == null) {
                    if (oVar.A == 0 && ((HandlerThread) oVar.D) == null) {
                        z12 = true;
                    }
                    ta.c0.A(z12);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    oVar.D = handlerThread;
                    handlerThread.start();
                    oVar.C = ((HandlerThread) oVar.D).getLooper();
                }
                oVar.A++;
                looper2 = (Looper) oVar.C;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.J = looper2;
        e7.d0 d0VarA2 = b0Var.a(looper2, this);
        this.H = d0VarA2;
        this.f7346a0 = new c7.f(context, looper2, this);
        d0VarA2.b(35, new y7.t() {
            @Override
            public final void b(long j10, long j11, androidx.media3.common.t tVar2, MediaFormat mediaFormat) {
                i0 i0Var = this.A;
                i0Var.getClass();
                tVar.b(j10, j11, tVar2, mediaFormat);
                i0Var.b(j10, j11, tVar2, mediaFormat);
            }
        }).b();
    }

    public static boolean A(o0 o0Var) {
        if (o0Var != null) {
            try {
                ?? r4 = o0Var.f7424a;
                if (o0Var.f7428e) {
                    for (s7.a1 a1Var : o0Var.f7426c) {
                        if (a1Var != null) {
                            a1Var.a();
                        }
                    }
                } else {
                    r4.j();
                }
                if ((!o0Var.f7428e ? 0L : r4.g()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static void S(k2 k2Var, f0 f0Var, j2 j2Var, h2 h2Var) {
        int i10 = k2Var.getWindow(k2Var.getPeriodByUid(f0Var.D, h2Var).f1233c, j2Var).f1295o;
        Object obj = k2Var.getPeriod(i10, h2Var, true).f1232b;
        long j9 = h2Var.f1234d;
        long j10 = j9 != -9223372036854775807L ? j9 - 1 : Long.MAX_VALUE;
        f0Var.B = i10;
        f0Var.C = j10;
        f0Var.D = obj;
    }

    public static boolean T(f0 f0Var, k2 k2Var, k2 k2Var2, int i10, boolean z10, j2 j2Var, h2 h2Var) {
        Object obj = f0Var.D;
        f1 f1Var = f0Var.A;
        if (obj == null) {
            long j9 = f1Var.f7301h;
            Pair pairV = V(k2Var, new h0(f1Var.f7296c, f1Var.f7300g, j9 == Long.MIN_VALUE ? -9223372036854775807L : e7.i0.H(j9)), false, i10, z10, j2Var, h2Var);
            if (pairV == null) {
                return false;
            }
            int indexOfPeriod = k2Var.getIndexOfPeriod(pairV.first);
            long jLongValue = ((Long) pairV.second).longValue();
            Object obj2 = pairV.first;
            f0Var.B = indexOfPeriod;
            f0Var.C = jLongValue;
            f0Var.D = obj2;
            if (f1Var.f7301h == Long.MIN_VALUE) {
                S(k2Var, f0Var, j2Var, h2Var);
                return true;
            }
        } else {
            int indexOfPeriod2 = k2Var.getIndexOfPeriod(obj);
            if (indexOfPeriod2 == -1) {
                return false;
            }
            if (f1Var.f7301h == Long.MIN_VALUE) {
                S(k2Var, f0Var, j2Var, h2Var);
                return true;
            }
            f0Var.B = indexOfPeriod2;
            k2Var2.getPeriodByUid(f0Var.D, h2Var);
            if (h2Var.f1236f && k2Var2.getWindow(h2Var.f1233c, j2Var).f1294n == k2Var2.getIndexOfPeriod(f0Var.D)) {
                Pair<Object, Long> periodPositionUs = k2Var.getPeriodPositionUs(j2Var, h2Var, k2Var.getPeriodByUid(f0Var.D, h2Var).f1233c, f0Var.C + h2Var.f1235e);
                int indexOfPeriod3 = k2Var.getIndexOfPeriod(periodPositionUs.first);
                long jLongValue2 = ((Long) periodPositionUs.second).longValue();
                Object obj3 = periodPositionUs.first;
                f0Var.B = indexOfPeriod3;
                f0Var.C = jLongValue2;
                f0Var.D = obj3;
            }
        }
        return true;
    }

    public static Pair V(k2 k2Var, h0 h0Var, boolean z10, int i10, boolean z11, j2 j2Var, h2 h2Var) {
        int iW;
        k2 k2Var2 = h0Var.f7330a;
        if (k2Var.isEmpty()) {
            return null;
        }
        k2 k2Var3 = k2Var2.isEmpty() ? k2Var : k2Var2;
        try {
            Pair<Object, Long> periodPositionUs = k2Var3.getPeriodPositionUs(j2Var, h2Var, h0Var.f7331b, h0Var.f7332c);
            if (k2Var.equals(k2Var3)) {
                return periodPositionUs;
            }
            if (k2Var.getIndexOfPeriod(periodPositionUs.first) != -1) {
                return (k2Var3.getPeriodByUid(periodPositionUs.first, h2Var).f1236f && k2Var3.getWindow(h2Var.f1233c, j2Var).f1294n == k2Var3.getIndexOfPeriod(periodPositionUs.first)) ? k2Var.getPeriodPositionUs(j2Var, h2Var, k2Var.getPeriodByUid(periodPositionUs.first, h2Var).f1233c, h0Var.f7332c) : periodPositionUs;
            }
            if (!z10 || (iW = W(j2Var, h2Var, i10, z11, periodPositionUs.first, k2Var3, k2Var)) == -1) {
                return null;
            }
            return k2Var.getPeriodPositionUs(j2Var, h2Var, iW, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int W(j2 j2Var, h2 h2Var, int i10, boolean z10, Object obj, k2 k2Var, k2 k2Var2) {
        h2 h2Var2;
        Object obj2 = k2Var.getWindow(k2Var.getPeriodByUid(obj, h2Var).f1233c, j2Var).f1283a;
        int i11 = 0;
        for (int i12 = 0; i12 < k2Var2.getWindowCount(); i12++) {
            if (k2Var2.getWindow(i12, j2Var).f1283a.equals(obj2)) {
                return i12;
            }
        }
        int indexOfPeriod = k2Var.getIndexOfPeriod(obj);
        int periodCount = k2Var.getPeriodCount();
        int nextPeriodIndex = indexOfPeriod;
        int indexOfPeriod2 = -1;
        while (i11 < periodCount && indexOfPeriod2 == -1) {
            j2 j2Var2 = j2Var;
            h2Var2 = h2Var;
            int i13 = i10;
            boolean z11 = z10;
            k2 k2Var3 = k2Var;
            nextPeriodIndex = k2Var3.getNextPeriodIndex(nextPeriodIndex, h2Var2, j2Var2, i13, z11);
            if (nextPeriodIndex == -1) {
                if (indexOfPeriod2 == -1) {
                    return -1;
                }
                return k2Var2.getPeriod(indexOfPeriod2, h2Var2).f1233c;
            }
            indexOfPeriod2 = k2Var2.getIndexOfPeriod(k2Var3.getUidOfPeriod(nextPeriodIndex));
            i11++;
            k2Var = k2Var3;
            h2Var = h2Var2;
            j2Var = j2Var2;
            i10 = i13;
            z10 = z11;
        }
        h2Var2 = h2Var;
        if (indexOfPeriod2 == -1) {
            return -1;
        }
        return k2Var2.getPeriod(indexOfPeriod2, h2Var2).f1233c;
    }

    public static void h(f1 f1Var) {
        boolean z10;
        synchronized (f1Var) {
            z10 = f1Var.f7304k;
        }
        if (z10) {
            return;
        }
        try {
            f1Var.f7294a.e(f1Var.f7297d, f1Var.f7298e);
        } finally {
            f1Var.a(true);
        }
    }

    public final void A0(s7.a0 a0Var, v7.u uVar) {
        boolean z10;
        o0 o0Var = this.S.l;
        o0Var.getClass();
        q(o0Var.d());
        if (v0(this.f7353h0.f7247a, o0Var.f7430g.f7438a)) {
            long j9 = this.U.f7281h;
        }
        k2 k2Var = this.f7353h0.f7247a;
        float f3 = this.O.getPlaybackParameters().f1688a;
        boolean z11 = this.f7353h0.l;
        v7.r[] rVarArr = uVar.f15530c;
        g gVar = (g) this.F;
        gVar.getClass();
        fh.w0 w0Var = gVar.f7319p;
        j7.j jVar = this.W;
        Integer num = (Integer) w0Var.get(jVar.f8249a);
        int iIntValue = (num == null || num.intValue() == -1) ? gVar.l : num.intValue();
        f fVar = (f) gVar.f7320q.get(jVar);
        fVar.getClass();
        if (iIntValue == -1) {
            androidx.media3.common.l0 l0Var = k2Var.getWindow(k2Var.getPeriodByUid(a0Var.f13644a, gVar.f7307b).f1233c, gVar.f7306a).f1285c.f1414b;
            if (l0Var == null) {
                z10 = false;
            } else {
                String scheme = l0Var.f1328a.getScheme();
                if (TextUtils.isEmpty(scheme) || g.f7305s.contains(scheme)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            int length = rVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = 13107200;
                if (i10 < length) {
                    v7.r rVar = rVarArr[i10];
                    if (rVar != null) {
                        switch (rVar.d().f1340c) {
                            case -2:
                                i12 = 0;
                                i11 += i12;
                                break;
                            case -1:
                            case 1:
                                i11 += i12;
                                break;
                            case 0:
                                i12 = 144310272;
                                i11 += i12;
                                break;
                            case 2:
                                i12 = z10 ? 19660800 : 131072000;
                                i11 += i12;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i12 = 131072;
                                i11 += i12;
                                break;
                            case 4:
                                i12 = 26214400;
                                i11 += i12;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i10++;
                } else {
                    iIntValue = e7.i0.h(i11, 13107200, 210239488);
                }
            }
        }
        fVar.f7292c = iIntValue;
        gVar.c();
    }

    public final boolean B(int i10, s7.a0 a0Var) {
        q0 q0Var = this.S;
        o0 o0Var = q0Var.f7458k;
        if (o0Var != null && o0Var.f7430g.f7438a.equals(a0Var)) {
            j1 j1Var = this.A[i10];
            o0 o0Var2 = q0Var.f7458k;
            int i11 = j1Var.f7383d;
            boolean z10 = (i11 == 2 || i11 == 4) && j1Var.d(o0Var2) == ((a) j1Var.f7384e);
            boolean z11 = j1Var.f7383d == 3 && j1Var.d(o0Var2) == ((a) j1Var.f7385f);
            if (z10 || z11) {
                return true;
            }
        }
        return false;
    }

    public final void B0(int i10, int i11, List list) throws Throwable {
        this.f7354i0.f(1);
        b1 b1Var = this.T;
        b1Var.getClass();
        ArrayList arrayList = (ArrayList) b1Var.f7225c;
        ta.c0.s(i10 >= 0 && i10 <= i11 && i11 <= arrayList.size());
        ta.c0.s(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((a1) arrayList.get(i12)).f7216a.s((androidx.media3.common.q0) list.get(i12 - i10));
        }
        w(b1Var.c(), false);
    }

    public final boolean C() {
        o0 o0Var = this.S.f7456i;
        long j9 = o0Var.f7430g.f7442e;
        if (o0Var.f7428e) {
            return j9 == -9223372036854775807L || this.f7353h0.f7263s < j9 || !u0();
        }
        return false;
    }

    public final void C0(int i10, int i11, int i12, boolean z10) {
        boolean z11 = z10 && i10 != -1;
        if (i10 == -1) {
            i12 = 2;
        } else if (i12 == 2) {
            i12 = 1;
        }
        boolean z12 = this.f7349d0;
        if (i10 == 0) {
            i11 = 1;
        } else if (i11 == 1) {
            i11 = z12 ? 4 : 0;
        }
        c1 c1Var = this.f7353h0;
        if (c1Var.l == z11 && c1Var.f7258n == i11 && c1Var.m == i12) {
            return;
        }
        this.f7353h0 = c1Var.e(i12, i11, z11);
        F0(false, false);
        q0 q0Var = this.S;
        for (o0 o0Var = q0Var.f7456i; o0Var != null; o0Var = o0Var.m) {
            for (v7.r rVar : o0Var.f7436o.f15530c) {
                if (rVar != null) {
                    rVar.g(z11);
                }
            }
        }
        if (!u0()) {
            y0();
            D0();
            c1 c1Var2 = this.f7353h0;
            if (c1Var2.f7260p) {
                this.f7353h0 = c1Var2.i(false);
            }
            q0Var.n(this.f7368w0);
            return;
        }
        int i13 = this.f7353h0.f7251e;
        e7.d0 d0Var = this.H;
        if (i13 != 3) {
            if (i13 == 2) {
                d0Var.f(2);
            }
        } else {
            h hVar = this.O;
            hVar.F = true;
            hVar.A.d();
            w0();
            d0Var.f(2);
        }
    }

    public final void D() {
        boolean zB;
        if (A(this.S.l)) {
            o0 o0Var = this.S.l;
            long jQ = q(!o0Var.f7428e ? 0L : o0Var.f7424a.g());
            o0 o0Var2 = this.S.f7456i;
            long j9 = v0(this.f7353h0.f7247a, o0Var.f7430g.f7438a) ? this.U.f7281h : -9223372036854775807L;
            j7.j jVar = this.W;
            k2 k2Var = this.f7353h0.f7247a;
            s7.a0 a0Var = o0Var.f7430g.f7438a;
            float f3 = this.O.getPlaybackParameters().f1688a;
            boolean z10 = this.f7353h0.l;
            j0 j0Var = new j0(jVar, k2Var, a0Var, jQ, f3, this.f7358m0, j9);
            zB = ((g) this.F).b(j0Var);
            o0 o0Var3 = this.S.f7456i;
            if (!zB && o0Var3.f7428e && jQ < 500000 && (this.M > 0 || this.N)) {
                o0Var3.f7424a.o(false, this.f7353h0.f7263s);
                zB = ((g) this.F).b(j0Var);
            }
        } else {
            zB = false;
        }
        this.f7360o0 = zB;
        if (zB) {
            o0 o0Var4 = this.S.l;
            o0Var4.getClass();
            l0 l0Var = new l0();
            l0Var.f7412a = this.f7368w0 - o0Var4.f7437p;
            float f10 = this.O.getPlaybackParameters().f1688a;
            ta.c0.s(f10 > 0.0f || f10 == -3.4028235E38f);
            l0Var.f7413b = f10;
            long j10 = this.f7359n0;
            ta.c0.s(j10 >= 0 || j10 == -9223372036854775807L);
            l0Var.f7414c = j10;
            m0 m0Var = new m0(l0Var);
            ta.c0.A(o0Var4.m == null);
            o0Var4.f7424a.e(m0Var);
        }
        z0();
    }

    public final void D0() {
        long j9;
        boolean z10;
        androidx.media3.common.z0 playbackParameters;
        long j10;
        float f3;
        o0 o0Var = this.S.f7456i;
        if (o0Var == null) {
            return;
        }
        long j11 = -9223372036854775807L;
        long jP = o0Var.f7428e ? o0Var.f7424a.p() : -9223372036854775807L;
        if (jP != -9223372036854775807L) {
            if (!o0Var.g()) {
                this.S.o(o0Var);
                v(false);
                D();
            }
            R(true, jP);
            if (jP != this.f7353h0.f7263s) {
                c1 c1Var = this.f7353h0;
                this.f7353h0 = z(c1Var.f7248b, jP, c1Var.f7249c, jP, true, 5);
            }
            j9 = -9223372036854775807L;
        } else {
            h hVar = this.O;
            boolean z11 = o0Var != this.S.f7457j;
            m1 m1Var = hVar.A;
            a aVar = hVar.C;
            if (aVar == null || aVar.k() || ((z11 && hVar.C.H != 2) || (!hVar.C.m() && (z11 || hVar.C.j())))) {
                hVar.E = true;
                if (hVar.F) {
                    m1Var.d();
                }
            } else {
                n0 n0Var = hVar.D;
                n0Var.getClass();
                long jA = n0Var.a();
                if (!hVar.E) {
                    m1Var.c(jA);
                    playbackParameters = n0Var.getPlaybackParameters();
                    if (!playbackParameters.equals((androidx.media3.common.z0) m1Var.E)) {
                        m1Var.setPlaybackParameters(playbackParameters);
                        hVar.B.H.b(16, playbackParameters).b();
                    }
                } else if (jA >= m1Var.a()) {
                    hVar.E = false;
                    if (hVar.F) {
                        m1Var.d();
                    }
                    m1Var.c(jA);
                    playbackParameters = n0Var.getPlaybackParameters();
                    if (!playbackParameters.equals((androidx.media3.common.z0) m1Var.E)) {
                        m1Var.setPlaybackParameters(playbackParameters);
                        hVar.B.H.b(16, playbackParameters).b();
                    }
                } else if (m1Var.C) {
                    m1Var.c(m1Var.a());
                    m1Var.C = false;
                }
            }
            long jA2 = hVar.a();
            this.f7368w0 = jA2;
            long j12 = jA2 - o0Var.f7437p;
            long j13 = this.f7353h0.f7263s;
            ArrayList arrayList = this.P;
            if (arrayList.isEmpty() || this.f7353h0.f7248b.b()) {
                j9 = -9223372036854775807L;
            } else {
                if (this.f7371z0) {
                    j13--;
                    this.f7371z0 = false;
                }
                c1 c1Var2 = this.f7353h0;
                int indexOfPeriod = c1Var2.f7247a.getIndexOfPeriod(c1Var2.f7248b.f13644a);
                int iMin = Math.min(this.f7370y0, arrayList.size());
                f0 f0Var = iMin > 0 ? (f0) arrayList.get(iMin - 1) : null;
                while (f0Var != null) {
                    int i10 = f0Var.B;
                    if (i10 <= indexOfPeriod && (i10 != indexOfPeriod || f0Var.C <= j13)) {
                        break;
                    }
                    int i11 = iMin - 1;
                    f0Var = i11 > 0 ? (f0) arrayList.get(iMin - 2) : null;
                    iMin = i11;
                }
                f0 f0Var2 = iMin < arrayList.size() ? (f0) arrayList.get(iMin) : null;
                while (true) {
                    if (f0Var2 != null && f0Var2.D != null) {
                        int i12 = f0Var2.B;
                        if (i12 < indexOfPeriod) {
                            j9 = j11;
                        } else if (i12 == indexOfPeriod) {
                            j9 = j11;
                            if (f0Var2.C > j13) {
                                break;
                            }
                        }
                        iMin++;
                        f0Var2 = iMin < arrayList.size() ? (f0) arrayList.get(iMin) : null;
                        j11 = j9;
                    }
                    j9 = j11;
                    break;
                }
                while (f0Var2 != null) {
                    f1 f1Var = f0Var2.A;
                    if (f0Var2.D == null || f0Var2.B != indexOfPeriod) {
                        break;
                    }
                    long j14 = f0Var2.C;
                    if (j14 <= j13 || j14 > j12) {
                        break;
                    }
                    try {
                        c0(f1Var);
                        if (f1Var.f7302i) {
                            arrayList.remove(iMin);
                        } else {
                            synchronized (f1Var) {
                                z10 = f1Var.f7304k;
                            }
                            if (z10) {
                                arrayList.remove(iMin);
                            } else {
                                iMin++;
                            }
                        }
                        f0Var2 = iMin < arrayList.size() ? (f0) arrayList.get(iMin) : null;
                    } catch (Throwable th2) {
                        if (f1Var.f7302i) {
                            arrayList.remove(iMin);
                        } else {
                            synchronized (f1Var) {
                                if (f1Var.f7304k) {
                                    arrayList.remove(iMin);
                                }
                            }
                        }
                        throw th2;
                    }
                }
                this.f7370y0 = iMin;
            }
            if (this.O.b()) {
                boolean z12 = !this.f7354i0.f2412d;
                c1 c1Var3 = this.f7353h0;
                this.f7353h0 = z(c1Var3.f7248b, j12, c1Var3.f7249c, j12, z12, 6);
            } else {
                c1 c1Var4 = this.f7353h0;
                c1Var4.f7263s = j12;
                c1Var4.f7264t = SystemClock.elapsedRealtime();
            }
        }
        this.f7353h0.f7261q = this.S.l.d();
        c1 c1Var5 = this.f7353h0;
        c1Var5.f7262r = q(c1Var5.f7261q);
        c1 c1Var6 = this.f7353h0;
        if (c1Var6.l && c1Var6.f7251e == 3 && v0(c1Var6.f7247a, c1Var6.f7248b)) {
            c1 c1Var7 = this.f7353h0;
            float f10 = 1.0f;
            if (c1Var7.f7259o.f1688a == 1.0f) {
                e eVar = this.U;
                long jN = n(c1Var7.f7247a, c1Var7.f7248b.f13644a, c1Var7.f7263s);
                long j15 = this.f7353h0.f7262r;
                if (eVar.f7276c != j9) {
                    long j16 = jN - j15;
                    long j17 = eVar.m;
                    if (j17 == j9) {
                        eVar.m = j16;
                        eVar.f7285n = 0L;
                    } else {
                        long jMax = Math.max(j16, (long) ((j16 * 9.999871E-4f) + (j17 * 0.999f)));
                        eVar.m = jMax;
                        eVar.f7285n = (long) ((9.999871E-4f * Math.abs(j16 - jMax)) + (eVar.f7285n * 0.999f));
                    }
                    if (eVar.l != j9) {
                        j10 = 1000;
                        if (SystemClock.elapsedRealtime() - eVar.l < 1000) {
                            f10 = eVar.f7284k;
                        }
                    } else {
                        j10 = 1000;
                    }
                    eVar.l = SystemClock.elapsedRealtime();
                    long j18 = (eVar.f7285n * 3) + eVar.m;
                    if (eVar.f7281h > j18) {
                        float fH = e7.i0.H(j10);
                        f3 = 1.0E-7f;
                        long[] jArr = {j18, eVar.f7278e, eVar.f7281h - (((long) ((eVar.f7284k - 1.0f) * fH)) + ((long) ((eVar.f7282i - 1.0f) * fH)))};
                        long j19 = jArr[0];
                        for (int i13 = 1; i13 < 3; i13++) {
                            long j20 = jArr[i13];
                            if (j20 > j19) {
                                j19 = j20;
                            }
                        }
                        eVar.f7281h = j19;
                    } else {
                        f3 = 1.0E-7f;
                        long jI = e7.i0.i(jN - ((long) (Math.max(0.0f, eVar.f7284k - 1.0f) / 1.0E-7f)), eVar.f7281h, j18);
                        eVar.f7281h = jI;
                        long j21 = eVar.f7280g;
                        if (j21 != j9 && jI > j21) {
                            eVar.f7281h = j21;
                        }
                    }
                    long j22 = jN - eVar.f7281h;
                    if (Math.abs(j22) < eVar.f7274a) {
                        eVar.f7284k = 1.0f;
                    } else {
                        eVar.f7284k = e7.i0.g((f3 * j22) + 1.0f, eVar.f7283j, eVar.f7282i);
                    }
                    f10 = eVar.f7284k;
                }
                if (this.O.getPlaybackParameters().f1688a != f10) {
                    androidx.media3.common.z0 z0Var = new androidx.media3.common.z0(f10, this.f7353h0.f7259o.f1689b);
                    this.H.e(16);
                    this.O.setPlaybackParameters(z0Var);
                    y(this.f7353h0.f7259o, this.O.getPlaybackParameters().f1688a, false, false);
                }
            }
        }
    }

    public final void E() {
        q0 q0Var = this.S;
        q0Var.l();
        o0 o0Var = q0Var.m;
        if (o0Var != null) {
            ?? r4 = o0Var.f7424a;
            if ((!o0Var.f7427d || o0Var.f7428e) && !r4.isLoading()) {
                k2 k2Var = this.f7353h0.f7247a;
                if (o0Var.f7428e) {
                    r4.t();
                }
                Iterator it = ((g) this.F).f7320q.values().iterator();
                while (it.hasNext()) {
                    if (((f) it.next()).f7291b) {
                        return;
                    }
                }
                if (!o0Var.f7427d) {
                    long j9 = o0Var.f7430g.f7439b;
                    o0Var.f7427d = true;
                    r4.m(this, j9);
                    return;
                }
                l0 l0Var = new l0();
                l0Var.f7412a = this.f7368w0 - o0Var.f7437p;
                float f3 = this.O.getPlaybackParameters().f1688a;
                ta.c0.s(f3 > 0.0f || f3 == -3.4028235E38f);
                l0Var.f7413b = f3;
                long j10 = this.f7359n0;
                ta.c0.s(j10 >= 0 || j10 == -9223372036854775807L);
                l0Var.f7414c = j10;
                m0 m0Var = new m0(l0Var);
                ta.c0.A(o0Var.m == null);
                r4.e(m0Var);
            }
        }
    }

    public final void E0(k2 k2Var, s7.a0 a0Var, k2 k2Var2, s7.a0 a0Var2, long j9, boolean z10) {
        boolean zV0 = v0(k2Var, a0Var);
        Object obj = a0Var.f13644a;
        if (!zV0) {
            androidx.media3.common.z0 z0Var = a0Var.b() ? androidx.media3.common.z0.f1685d : this.f7353h0.f7259o;
            h hVar = this.O;
            if (hVar.getPlaybackParameters().equals(z0Var)) {
                return;
            }
            this.H.e(16);
            hVar.setPlaybackParameters(z0Var);
            y(this.f7353h0.f7259o, z0Var.f1688a, false, false);
            return;
        }
        h2 h2Var = this.L;
        int i10 = k2Var.getPeriodByUid(obj, h2Var).f1233c;
        j2 j2Var = this.K;
        k2Var.getWindow(i10, j2Var);
        androidx.media3.common.k0 k0Var = j2Var.f1292j;
        e eVar = this.U;
        eVar.getClass();
        eVar.f7276c = e7.i0.H(k0Var.f1308a);
        eVar.f7279f = e7.i0.H(k0Var.f1309b);
        eVar.f7280g = e7.i0.H(k0Var.f1310c);
        float f3 = k0Var.f1311d;
        if (f3 == -3.4028235E38f) {
            f3 = 0.97f;
        }
        eVar.f7283j = f3;
        float f10 = k0Var.f1312e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        eVar.f7282i = f10;
        if (f3 == 1.0f && f10 == 1.0f) {
            eVar.f7276c = -9223372036854775807L;
        }
        eVar.a();
        if (j9 != -9223372036854775807L) {
            eVar.f7277d = n(k2Var, obj, j9);
            eVar.a();
            return;
        }
        if (!Objects.equals(!k2Var2.isEmpty() ? k2Var2.getWindow(k2Var2.getPeriodByUid(a0Var2.f13644a, h2Var).f1233c, j2Var).f1283a : null, j2Var.f1283a) || z10) {
            eVar.f7277d = -9223372036854775807L;
            eVar.a();
        }
    }

    public final void F() {
        ba.s sVar = this.f7354i0;
        c1 c1Var = this.f7353h0;
        boolean z10 = sVar.f2411c | (((c1) sVar.f2414f) != c1Var);
        sVar.f2411c = z10;
        sVar.f2414f = c1Var;
        if (z10) {
            z zVar = this.R.B;
            zVar.f7485j.d(new ab.f(zVar, sVar, 19));
            this.f7354i0 = new ba.s(this.f7353h0);
        }
    }

    public final void F0(boolean z10, boolean z11) {
        long jElapsedRealtime;
        this.f7358m0 = z10;
        if (!z10 || z11) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.Q.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f7359n0 = jElapsedRealtime;
    }

    public final void G(int i10) {
        j1 j1Var = this.A[i10];
        try {
            o0 o0Var = this.S.f7456i;
            o0Var.getClass();
            a aVarD = j1Var.d(o0Var);
            aVarD.getClass();
            s7.a1 a1Var = aVarD.I;
            a1Var.getClass();
            a1Var.a();
        } catch (IOException | RuntimeException e3) {
            int i11 = ((a) j1Var.f7384e).B;
            if (i11 != 3 && i11 != 5) {
                throw e3;
            }
            v7.u uVar = this.S.f7456i.f7436o;
            e7.a.e("ExoPlayerImplInternal", "Disabling track due to error: " + androidx.media3.common.t.c(uVar.f15530c[i10].n()), e3);
            v7.u uVar2 = new v7.u((i1[]) uVar.f15529b.clone(), (v7.r[]) uVar.f15530c.clone(), uVar.f15531d, uVar.f15532e);
            uVar2.f15529b[i10] = null;
            uVar2.f15530c[i10] = null;
            j(i10);
            o0 o0Var2 = this.S.f7456i;
            o0Var2.a(uVar2, this.f7353h0.f7263s, false, new boolean[o0Var2.f7433j.length]);
        }
    }

    public final void H(int i10, boolean z10) {
        boolean[] zArr = this.C;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.Y.d(new a0(this, i10, z10));
        }
    }

    public final void I() throws Throwable {
        w(this.T.c(), true);
    }

    public final void J(e0 e0Var) throws Throwable {
        k2 k2VarC;
        this.f7354i0.f(1);
        int i10 = e0Var.f7286a;
        int i11 = e0Var.f7287b;
        int i12 = e0Var.f7288c;
        s7.d1 d1Var = e0Var.f7289d;
        b1 b1Var = this.T;
        ArrayList arrayList = (ArrayList) b1Var.f7225c;
        ta.c0.s(i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0);
        b1Var.f7233k = d1Var;
        if (i10 == i11 || i10 == i12) {
            k2VarC = b1Var.c();
        } else {
            int iMin = Math.min(i10, i12);
            int iMax = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int windowCount = ((a1) arrayList.get(iMin)).f7219d;
            e7.i0.G(arrayList, i10, i11, i12);
            while (iMin <= iMax) {
                a1 a1Var = (a1) arrayList.get(iMin);
                a1Var.f7219d = windowCount;
                windowCount += a1Var.f7216a.f13766o.f13728a.getWindowCount();
                iMin++;
            }
            k2VarC = b1Var.c();
        }
        w(k2VarC, false);
    }

    public final void K() {
        this.f7354i0.f(1);
        P(false, false, false, true);
        g gVar = (g) this.F;
        ConcurrentHashMap concurrentHashMap = gVar.f7320q;
        long id2 = Thread.currentThread().getId();
        long j9 = gVar.f7321r;
        ta.c0.z("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j9 == -1 || j9 == id2);
        gVar.f7321r = id2;
        j7.j jVar = this.W;
        f fVar = (f) concurrentHashMap.get(jVar);
        if (fVar == null) {
            f fVar2 = new f();
            fVar2.f7290a = 1;
            concurrentHashMap.put(jVar, fVar2);
        } else {
            fVar.f7290a++;
        }
        f fVar3 = (f) concurrentHashMap.get(jVar);
        fVar3.getClass();
        Integer num = (Integer) gVar.f7319p.get(jVar.f8249a);
        int iIntValue = (num == null || num.intValue() == -1) ? gVar.l : num.intValue();
        if (iIntValue == -1) {
            iIntValue = 13107200;
        }
        fVar3.f7292c = iIntValue;
        fVar3.f7291b = false;
        q0(this.f7353h0.f7247a.isEmpty() ? 4 : 2);
        c1 c1Var = this.f7353h0;
        boolean z10 = c1Var.l;
        C0(this.f7346a0.d(c1Var.f7251e, z10), c1Var.f7258n, c1Var.m, z10);
        w7.g gVar2 = (w7.g) this.G;
        gVar2.getClass();
        b1 b1Var = this.T;
        ArrayList arrayList = (ArrayList) b1Var.f7225c;
        ta.c0.A(!b1Var.f7223a);
        b1Var.l = gVar2;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            a1 a1Var = (a1) arrayList.get(i10);
            b1Var.g(a1Var);
            ((HashSet) b1Var.f7230h).add(a1Var);
        }
        b1Var.f7223a = true;
        this.H.f(2);
    }

    public final void L(e7.g gVar) {
        oe.o oVar = this.I;
        e7.d0 d0Var = this.H;
        try {
            P(true, false, true, false);
            M();
            k0 k0Var = this.F;
            j7.j jVar = this.W;
            g gVar2 = (g) k0Var;
            ConcurrentHashMap concurrentHashMap = gVar2.f7320q;
            f fVar = (f) concurrentHashMap.get(jVar);
            if (fVar != null) {
                int i10 = fVar.f7290a - 1;
                fVar.f7290a = i10;
                if (i10 == 0) {
                    concurrentHashMap.remove(jVar);
                    gVar2.c();
                }
            }
            if (gVar2.f7320q.isEmpty()) {
                gVar2.f7321r = -1L;
            }
            c7.f fVar2 = this.f7346a0;
            fVar2.f2898c = null;
            fVar2.a();
            fVar2.c(0);
            this.D.p();
            q0(1);
        } finally {
            d0Var.f5120a.removeCallbacksAndMessages(null);
            oVar.f();
            gVar.d();
        }
    }

    public final void M() {
        for (int i10 = 0; i10 < this.A.length; i10++) {
            a aVar = this.B[i10];
            synchronized (aVar.A) {
                aVar.R = null;
            }
            j1 j1Var = this.A[i10];
            a aVar2 = (a) j1Var.f7384e;
            ta.c0.A(aVar2.H == 0);
            aVar2.q();
            j1Var.f7380a = false;
            a aVar3 = (a) j1Var.f7385f;
            if (aVar3 != null) {
                ta.c0.A(aVar3.H == 0);
                aVar3.q();
                j1Var.f7381b = false;
            }
        }
    }

    public final void N(int i10, int i11, s7.d1 d1Var) throws Throwable {
        this.f7354i0.f(1);
        b1 b1Var = this.T;
        b1Var.getClass();
        ta.c0.s(i10 >= 0 && i10 <= i11 && i11 <= ((ArrayList) b1Var.f7225c).size());
        b1Var.f7233k = d1Var;
        b1Var.i(i10, i11);
        w(b1Var.c(), false);
    }

    public final void O() {
        int i10;
        int i11;
        float f3 = this.O.getPlaybackParameters().f1688a;
        q0 q0Var = this.S;
        o0 o0Var = q0Var.f7456i;
        o0 o0Var2 = q0Var.f7457j;
        v7.u uVar = null;
        o0 o0Var3 = o0Var;
        boolean z10 = true;
        while (o0Var3 != null && o0Var3.f7428e) {
            c1 c1Var = this.f7353h0;
            v7.u uVarJ = o0Var3.j(f3, c1Var.f7247a, c1Var.l);
            v7.u uVar2 = o0Var3 == this.S.f7456i ? uVarJ : uVar;
            v7.u uVar3 = o0Var3.f7436o;
            v7.r[] rVarArr = uVarJ.f15530c;
            if (uVar3 != null && uVar3.f15530c.length == rVarArr.length) {
                int i12 = 0;
                while (true) {
                    if (i12 >= rVarArr.length) {
                        if (o0Var3 == o0Var2) {
                            z10 = false;
                        }
                        o0Var3 = o0Var3.m;
                        uVar = uVar2;
                    } else if (uVarJ.a(uVar3, i12)) {
                        i12++;
                    }
                }
            }
            if (!z10) {
                i10 = 4;
                this.S.o(o0Var3);
                if (o0Var3.f7428e) {
                    long jMax = Math.max(o0Var3.f7430g.f7439b, this.f7368w0 - o0Var3.f7437p);
                    if (this.Z && f() && this.S.f7458k == o0Var3) {
                        i();
                    }
                    i11 = 4;
                    o0Var3.a(uVarJ, jMax, false, new boolean[o0Var3.f7433j.length]);
                }
                v(true);
                if (this.f7353h0.f7251e != i11) {
                    D();
                    D0();
                    this.H.f(2);
                    return;
                }
                return;
            }
            q0 q0Var2 = this.S;
            o0 o0Var4 = q0Var2.f7456i;
            boolean z11 = (q0Var2.o(o0Var4) & 1) != 0;
            boolean[] zArr = new boolean[this.A.length];
            uVar2.getClass();
            long jA = o0Var4.a(uVar2, this.f7353h0.f7263s, z11, zArr);
            c1 c1Var2 = this.f7353h0;
            boolean z12 = (c1Var2.f7251e == 4 || jA == c1Var2.f7263s) ? false : true;
            c1 c1Var3 = this.f7353h0;
            i10 = 4;
            this.f7353h0 = z(c1Var3.f7248b, jA, c1Var3.f7249c, c1Var3.f7250d, z12, 5);
            if (z12) {
                R(true, jA);
            }
            i();
            boolean[] zArr2 = new boolean[this.A.length];
            int i13 = 0;
            while (true) {
                j1[] j1VarArr = this.A;
                if (i13 >= j1VarArr.length) {
                    break;
                }
                int iC = j1VarArr[i13].c();
                zArr2[i13] = this.A[i13].g();
                j1 j1Var = this.A[i13];
                s7.a1 a1Var = o0Var4.f7426c[i13];
                h hVar = this.O;
                long j9 = this.f7368w0;
                boolean z13 = zArr[i13];
                a aVar = (a) j1Var.f7384e;
                if (j1.h(aVar)) {
                    if (a1Var != aVar.I) {
                        j1Var.a(aVar, hVar);
                    } else if (z13) {
                        aVar.z(j9, false, true);
                    }
                }
                a aVar2 = (a) j1Var.f7385f;
                if (aVar2 != null && j1.h(aVar2)) {
                    if (a1Var != aVar2.I) {
                        j1Var.a(aVar2, hVar);
                    } else if (z13) {
                        aVar2.z(j9, false, true);
                    }
                }
                if (iC - this.A[i13].c() > 0) {
                    H(i13, false);
                }
                this.f7366u0 -= iC - this.A[i13].c();
                i13++;
            }
            m(zArr2, this.f7368w0);
            o0Var4.f7431h = true;
            i11 = i10;
            v(true);
            if (this.f7353h0.f7251e != i11) {
                D();
                D0();
                this.H.f(2);
                return;
            }
            return;
        }
    }

    public final void P(boolean z10, boolean z11, boolean z12, boolean z13) {
        long j9;
        long j10;
        long j11;
        boolean z14;
        k2 h1Var;
        s7.a0 a0Var;
        c1 c1Var;
        ExoPlaybackException exoPlaybackException;
        s7.l1 l1Var;
        v7.u uVar;
        List list;
        q0 q0Var;
        int i10;
        this.H.e(2);
        this.f7350e0 = false;
        if (this.f7351f0 != null) {
            this.f7354i0.f(1);
            this.f7351f0 = null;
        }
        this.A0 = null;
        F0(false, true);
        h hVar = this.O;
        hVar.F = false;
        m1 m1Var = hVar.A;
        if (m1Var.C) {
            m1Var.c(m1Var.a());
            m1Var.C = false;
        }
        this.f7368w0 = 1000000000000L;
        for (int i11 = 0; i11 < this.A.length; i11++) {
            try {
                j(i11);
            } catch (ExoPlaybackException | RuntimeException e3) {
                e7.a.e("ExoPlayerImplInternal", "Disable failed.", e3);
            }
        }
        this.D0 = -9223372036854775807L;
        if (z10) {
            for (j1 j1Var : this.A) {
                try {
                    j1Var.k();
                } catch (RuntimeException e10) {
                    e7.a.e("ExoPlayerImplInternal", "Reset failed.", e10);
                }
            }
        }
        this.f7366u0 = 0;
        c1 c1Var2 = this.f7353h0;
        s7.a0 a0Var2 = c1Var2.f7248b;
        long j12 = c1Var2.f7263s;
        if (this.f7353h0.f7248b.b()) {
            j9 = this.f7353h0.f7249c;
        } else {
            c1 c1Var3 = this.f7353h0;
            h2 h2Var = this.L;
            s7.a0 a0Var3 = c1Var3.f7248b;
            k2 k2Var = c1Var3.f7247a;
            if (k2Var.isEmpty() || k2Var.getPeriodByUid(a0Var3.f13644a, h2Var).f1236f) {
                j9 = this.f7353h0.f7249c;
            } else {
                j9 = this.f7353h0.f7263s;
            }
        }
        if (z11) {
            this.f7367v0 = null;
            Pair pairP = p(this.f7353h0.f7247a);
            a0Var2 = (s7.a0) pairP.first;
            long jLongValue = ((Long) pairP.second).longValue();
            z14 = a0Var2.equals(this.f7353h0.f7248b) ? false : true;
            j10 = jLongValue;
            j11 = -9223372036854775807L;
        } else {
            j10 = j12;
            j11 = j9;
            z14 = false;
        }
        this.S.b();
        this.f7360o0 = false;
        k2 k2Var2 = this.f7353h0.f7247a;
        if (z12 && (k2Var2 instanceof h1)) {
            h1 h1Var2 = (h1) k2Var2;
            s7.d1 d1Var = (s7.d1) this.T.f7233k;
            k2[] k2VarArr = h1Var2.f7340g;
            k2[] k2VarArr2 = new k2[k2VarArr.length];
            for (int i12 = 0; i12 < k2VarArr.length; i12++) {
                k2VarArr2[i12] = new g1(k2VarArr[i12]);
            }
            h1Var = new h1(k2VarArr2, h1Var2.f7341h, d1Var);
            if (a0Var2.f13645b != -1) {
                h1Var.getPeriodByUid(a0Var2.f13644a, this.L);
                if (h1Var.getWindow(this.L.f1233c, this.K).a()) {
                    a0Var = new s7.a0(a0Var2.f13644a, a0Var2.f13647d);
                }
            }
            c1Var = this.f7353h0;
            int i13 = c1Var.f7251e;
            if (z13) {
                exoPlaybackException = null;
            } else {
                exoPlaybackException = c1Var.f7252f;
            }
            if (z14) {
                l1Var = s7.l1.f13708d;
            } else {
                l1Var = c1Var.f7254h;
            }
            s7.l1 l1Var2 = l1Var;
            if (z14) {
                uVar = this.E;
            } else {
                uVar = c1Var.f7255i;
            }
            v7.u uVar2 = uVar;
            if (z14) {
                fh.r0 r0Var = fh.t0.B;
                list = d2.E;
            } else {
                list = c1Var.f7256j;
            }
            this.f7353h0 = new c1(h1Var, a0Var, j11, j10, i13, exoPlaybackException, false, l1Var2, uVar2, list, a0Var, c1Var.l, c1Var.m, c1Var.f7258n, c1Var.f7259o, j10, 0L, j10, 0L, false);
            if (z12) {
                q0Var = this.S;
                if (!q0Var.f7462q.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (i10 = 0; i10 < q0Var.f7462q.size(); i10++) {
                        ((o0) q0Var.f7462q.get(i10)).i();
                    }
                    q0Var.f7462q = arrayList;
                    q0Var.m = null;
                    q0Var.l();
                }
                b1 b1Var = this.T;
                HashMap map = (HashMap) b1Var.f7228f;
                for (z0 z0Var : map.values()) {
                    try {
                        z0Var.f7512a.o(z0Var.f7513b);
                    } catch (RuntimeException e11) {
                        e7.a.e("MediaSourceList", "Failed to release child source.", e11);
                    }
                    s7.a aVar = z0Var.f7512a;
                    y0 y0Var = z0Var.f7514c;
                    aVar.r(y0Var);
                    z0Var.f7512a.q(y0Var);
                }
                map.clear();
                ((HashSet) b1Var.f7230h).clear();
                b1Var.f7223a = false;
            }
        }
        h1Var = k2Var2;
        a0Var = a0Var2;
        c1Var = this.f7353h0;
        int i14 = c1Var.f7251e;
        if (z13) {
            exoPlaybackException = null;
        } else {
            exoPlaybackException = c1Var.f7252f;
        }
        if (z14) {
            l1Var = s7.l1.f13708d;
        } else {
            l1Var = c1Var.f7254h;
        }
        s7.l1 l1Var3 = l1Var;
        if (z14) {
            uVar = this.E;
        } else {
            uVar = c1Var.f7255i;
        }
        v7.u uVar3 = uVar;
        if (z14) {
            fh.r0 r0Var2 = fh.t0.B;
            list = d2.E;
        } else {
            list = c1Var.f7256j;
        }
        this.f7353h0 = new c1(h1Var, a0Var, j11, j10, i14, exoPlaybackException, false, l1Var3, uVar3, list, a0Var, c1Var.l, c1Var.m, c1Var.f7258n, c1Var.f7259o, j10, 0L, j10, 0L, false);
        if (z12) {
            q0Var = this.S;
            if (!q0Var.f7462q.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                while (i10 < q0Var.f7462q.size()) {
                    ((o0) q0Var.f7462q.get(i10)).i();
                }
                q0Var.f7462q = arrayList2;
                q0Var.m = null;
                q0Var.l();
            }
            b1 b1Var2 = this.T;
            HashMap map2 = (HashMap) b1Var2.f7228f;
            while (r4.hasNext()) {
                z0Var.f7512a.o(z0Var.f7513b);
                s7.a aVar2 = z0Var.f7512a;
                y0 y0Var2 = z0Var.f7514c;
                aVar2.r(y0Var2);
                z0Var.f7512a.q(y0Var2);
            }
            map2.clear();
            ((HashSet) b1Var2.f7230h).clear();
            b1Var2.f7223a = false;
        }
    }

    public final void Q() {
        o0 o0Var = this.S.f7456i;
        this.f7357l0 = o0Var != null && o0Var.f7430g.f7446i && this.f7356k0;
    }

    public final void R(boolean z10, long j9) {
        o0 o0Var = this.S.f7456i;
        long j10 = j9 + (o0Var == null ? 1000000000000L : o0Var.f7437p);
        this.f7368w0 = j10;
        this.O.A.c(j10);
        for (j1 j1Var : this.A) {
            long j11 = this.f7368w0;
            a aVarD = j1Var.d(o0Var);
            if (aVarD != null) {
                aVarD.z(j11, false, z10);
            }
        }
        for (o0 o0Var2 = r0.f7456i; o0Var2 != null; o0Var2 = o0Var2.m) {
            for (v7.r rVar : o0Var2.f7436o.f15530c) {
                if (rVar != null) {
                    rVar.s();
                }
            }
        }
    }

    public final void U(k2 k2Var, k2 k2Var2) {
        if (k2Var.isEmpty() && k2Var2.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.P;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            k2 k2Var3 = k2Var;
            k2 k2Var4 = k2Var2;
            if (!T((f0) arrayList.get(size), k2Var3, k2Var4, this.f7361p0, this.f7362q0, this.K, this.L)) {
                ((f0) arrayList.get(size)).A.a(false);
                arrayList.remove(size);
            }
            size--;
            k2Var = k2Var3;
            k2Var2 = k2Var4;
        }
        Collections.sort(arrayList);
    }

    public final void X(long j9) {
        boolean z10 = this.f7349d0;
        long jMin = 1000;
        long j10 = G0;
        if (z10) {
            this.f7348c0.getClass();
            jMin = this.f7353h0.f7251e != 3 ? j10 : 1000L;
            for (j1 j1Var : this.A) {
                long j11 = this.f7368w0;
                long j12 = this.f7369x0;
                a aVar = (a) j1Var.f7385f;
                a aVar2 = (a) j1Var.f7384e;
                long jG = j1.h(aVar2) ? aVar2.g(j11, j12) : Long.MAX_VALUE;
                if (aVar != null && aVar.H != 0) {
                    jG = Math.min(jG, aVar.g(j11, j12));
                }
                jMin = Math.min(jMin, e7.i0.W(jG));
            }
            if (this.f7353h0.m()) {
                o0 o0Var = this.S.f7456i;
                o0 o0Var2 = o0Var != null ? o0Var.m : null;
                if (o0Var2 != null) {
                    if ((e7.i0.H(jMin) * this.f7353h0.f7259o.f1688a) + this.f7368w0 >= o0Var2.e()) {
                        jMin = Math.min(jMin, j10);
                    }
                }
            }
        } else if (this.f7353h0.f7251e != 3 || u0()) {
            jMin = j10;
        }
        this.H.f5120a.sendEmptyMessageAtTime(2, j9 + jMin);
    }

    public final void Y(boolean z10) {
        s7.a0 a0Var = this.S.f7456i.f7430g.f7438a;
        long jA0 = a0(a0Var, this.f7353h0.f7263s, true, false);
        if (jA0 != this.f7353h0.f7263s) {
            c1 c1Var = this.f7353h0;
            this.f7353h0 = z(a0Var, jA0, c1Var.f7249c, c1Var.f7250d, z10, 5);
        }
    }

    public final void Z(h0 h0Var) throws Throwable {
        long jLongValue;
        s7.a0 a0VarQ;
        long j9;
        long j10;
        boolean z10;
        long j11;
        long j12;
        long jC;
        c1 c1Var;
        int i10;
        long j13;
        s7.a0 a0Var;
        int i11;
        long j14;
        boolean z11;
        i0 i0Var = this;
        if (i0Var.f7350e0) {
            if (i0Var.f7351f0 != null) {
                i0Var.f7352g0++;
                i0Var.f7354i0.f(1);
            }
            i0Var.f7351f0 = h0Var;
            return;
        }
        i0Var.f7354i0.f(1);
        Pair pairV = V(i0Var.f7353h0.f7247a, h0Var, true, i0Var.f7361p0, i0Var.f7362q0, i0Var.K, i0Var.L);
        if (pairV == null) {
            Pair pairP = i0Var.p(i0Var.f7353h0.f7247a);
            a0VarQ = (s7.a0) pairP.first;
            jLongValue = ((Long) pairP.second).longValue();
            z10 = !i0Var.f7353h0.f7247a.isEmpty();
            j9 = -9223372036854775807L;
            j10 = 0;
            j11 = -9223372036854775807L;
        } else {
            Object obj = pairV.first;
            jLongValue = ((Long) pairV.second).longValue();
            long jMax = h0Var.f7332c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
            a0VarQ = i0Var.S.q(i0Var.f7353h0.f7247a, obj, jLongValue);
            if (a0VarQ.b()) {
                i0Var.f7353h0.f7247a.getPeriodByUid(a0VarQ.f13644a, i0Var.L);
                jLongValue = i0Var.L.f(a0VarQ.f13645b) == a0VarQ.f13646c ? i0Var.L.f1237g.f1135b : 0L;
                androidx.media3.common.a aVarA = i0Var.L.f1237g.a(a0VarQ.f13645b);
                j10 = 0;
                j9 = -9223372036854775807L;
                jMax = Math.max(jMax, aVarA.f1050a + aVarA.f1059j);
            } else {
                j9 = -9223372036854775807L;
                j10 = 0;
                if (h0Var.f7332c != -9223372036854775807L) {
                    z10 = false;
                }
                j11 = jMax;
            }
            z10 = true;
            j11 = jMax;
        }
        try {
            if (!i0Var.f7353h0.f7247a.isEmpty()) {
                if (pairV == null) {
                    if (i0Var.f7353h0.f7251e != 1) {
                        i0Var.q0(4);
                    }
                    i0Var.P(false, true, false, true);
                } else {
                    if (a0VarQ.equals(i0Var.f7353h0.f7248b)) {
                        try {
                            o0 o0Var = i0Var.S.f7456i;
                            if (o0Var == null || !o0Var.f7428e || jLongValue == j10) {
                                jC = jLongValue;
                            } else {
                                ?? r4 = o0Var.f7424a;
                                long j15 = i0Var.K.m;
                                if (i0Var.f7349d0 && j15 != j9) {
                                    i0Var.f7348c0.getClass();
                                }
                                jC = r4.c(jLongValue, i0Var.f7347b0);
                            }
                            if (e7.i0.W(jC) == e7.i0.W(i0Var.f7353h0.f7263s) && ((i10 = (c1Var = i0Var.f7353h0).f7251e) == 2 || i10 == 3)) {
                                j13 = c1Var.f7263s;
                                z10 = z10;
                                a0Var = a0VarQ;
                                i11 = 2;
                                j14 = j13;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            a0VarQ = a0VarQ;
                            j12 = jLongValue;
                            i0Var.f7353h0 = i0Var.z(a0VarQ, j12, j11, j12, z10, 2);
                            throw th;
                        }
                    } else {
                        jC = jLongValue;
                    }
                    try {
                        if (!i0Var.f7349d0) {
                            z11 = true;
                            break;
                        }
                        try {
                            j1[] j1VarArr = i0Var.A;
                            int length = j1VarArr.length;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= length) {
                                    z11 = true;
                                    break;
                                }
                                j1 j1Var = j1VarArr[i12];
                                if (j1Var.g() && ((a) j1Var.f7384e).B == 2) {
                                    z11 = true;
                                    i0Var.f7350e0 = true;
                                    break;
                                }
                                i12++;
                                i0Var.f7353h0 = i0Var.z(a0VarQ, j12, j11, j12, z10, 2);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            j12 = jLongValue;
                            j11 = j11;
                        }
                        boolean z12 = i0Var.f7353h0.f7251e == 4 ? z11 : false;
                        q0 q0Var = i0Var.S;
                        long jA0 = i0Var.a0(a0VarQ, jC, q0Var.f7456i != q0Var.f7457j ? z11 : false, z12);
                        z10 |= jLongValue != jA0 ? z11 : false;
                        try {
                            c1 c1Var2 = i0Var.f7353h0;
                            s7.a0 a0Var2 = a0VarQ;
                            try {
                                k2 k2Var = c1Var2.f7247a;
                                long j16 = j11;
                                try {
                                    i0Var.E0(k2Var, a0Var2, k2Var, c1Var2.f7248b, j16, true);
                                    a0Var = a0Var2;
                                    j11 = j16;
                                    j13 = jA0;
                                    i11 = 2;
                                    j14 = j13;
                                    i0Var = this;
                                } catch (Throwable th4) {
                                    th = th4;
                                    a0VarQ = a0Var2;
                                    j11 = j16;
                                    j12 = jA0;
                                    i0Var.f7353h0 = i0Var.z(a0VarQ, j12, j11, j12, z10, 2);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                a0VarQ = a0Var2;
                                j11 = j11;
                                j12 = jA0;
                                i0Var.f7353h0 = i0Var.z(a0VarQ, j12, j11, j12, z10, 2);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        j11 = j11;
                        j12 = jLongValue;
                    }
                }
                i0Var.f7353h0 = i0Var.z(a0Var, j13, j11, j14, z10, i11);
            }
            i0Var.f7367v0 = h0Var;
            z10 = z10;
            a0Var = a0VarQ;
            j13 = jLongValue;
            i11 = 2;
            j14 = j13;
            i0Var = this;
            i0Var.f7353h0 = i0Var.z(a0Var, j13, j11, j14, z10, i11);
        } catch (Throwable th8) {
            th = th8;
        }
    }

    @Override
    public final void a(s7.y yVar) {
        this.H.b(8, yVar).b();
    }

    public final long a0(s7.a0 a0Var, long j9, boolean z10, boolean z11) {
        q0 q0Var;
        y0();
        boolean z12 = true;
        F0(false, true);
        if (z11 || this.f7353h0.f7251e == 3) {
            q0(2);
        }
        o0 o0Var = this.S.f7456i;
        o0 o0Var2 = o0Var;
        while (o0Var2 != null && !a0Var.equals(o0Var2.f7430g.f7438a)) {
            o0Var2 = o0Var2.m;
        }
        if (z10 || o0Var != o0Var2 || (o0Var2 != null && o0Var2.f7437p + j9 < 0)) {
            for (int i10 = 0; i10 < this.A.length; i10++) {
                j(i10);
            }
            this.D0 = -9223372036854775807L;
            if (o0Var2 != null) {
                while (true) {
                    q0Var = this.S;
                    if (q0Var.f7456i == o0Var2) {
                        break;
                    }
                    q0Var.a();
                }
                q0Var.o(o0Var2);
                o0Var2.f7437p = 1000000000000L;
                m(new boolean[this.A.length], this.S.f7457j.e());
                o0Var2.f7431h = true;
            }
        }
        i();
        if (o0Var2 != null) {
            this.S.o(o0Var2);
            if (!o0Var2.f7428e) {
                o0Var2.f7430g = o0Var2.f7430g.b(j9);
            } else if (o0Var2.f7429f) {
                if (this.f7349d0) {
                    this.f7348c0.getClass();
                    if (this.f7353h0.f7247a.isEmpty() || !o0Var2.f7430g.f7438a.equals(this.f7353h0.f7248b)) {
                        j9 = o0Var2.f7424a.k(j9);
                        o0Var2.f7424a.o(this.N, j9 - this.M);
                    } else {
                        long j10 = o0Var2.f7437p + j9;
                        boolean z13 = true;
                        for (j1 j1Var : this.A) {
                            if (j1Var.g()) {
                                a aVarD = j1Var.d(o0Var2);
                                z13 &= aVarD != null && aVarD.D(j10);
                            }
                        }
                        if (z13) {
                            ?? r10 = o0Var2.f7424a;
                            long j11 = this.f7353h0.f7263s;
                            l1 l1Var = l1.f7416d;
                            if (r10.c(j11, l1Var) == o0Var2.f7424a.c(j9, l1Var)) {
                                z12 = false;
                            } else {
                                j9 = o0Var2.f7424a.k(j9);
                                o0Var2.f7424a.o(this.N, j9 - this.M);
                            }
                        } else {
                            j9 = o0Var2.f7424a.k(j9);
                            o0Var2.f7424a.o(this.N, j9 - this.M);
                        }
                    }
                } else {
                    j9 = o0Var2.f7424a.k(j9);
                    o0Var2.f7424a.o(this.N, j9 - this.M);
                }
            }
            R(z12, j9);
            D();
        } else {
            this.S.b();
            R(true, j9);
        }
        v(false);
        this.H.f(2);
        return j9;
    }

    @Override
    public final void b(long j9, long j10, androidx.media3.common.t tVar, MediaFormat mediaFormat) {
        if (this.f7350e0) {
            e7.d0 d0Var = this.H;
            d0Var.getClass();
            e7.c0 c0VarC = e7.d0.c();
            c0VarC.f5118a = d0Var.f5120a.obtainMessage(37);
            c0VarC.b();
        }
    }

    public final void b0(f1 f1Var) {
        if (f1Var.f7301h == -9223372036854775807L) {
            c0(f1Var);
            return;
        }
        boolean zIsEmpty = this.f7353h0.f7247a.isEmpty();
        ArrayList arrayList = this.P;
        if (zIsEmpty) {
            arrayList.add(new f0(f1Var));
            return;
        }
        f0 f0Var = new f0(f1Var);
        k2 k2Var = this.f7353h0.f7247a;
        if (!T(f0Var, k2Var, k2Var, this.f7361p0, this.f7362q0, this.K, this.L)) {
            f1Var.a(false);
        } else {
            arrayList.add(f0Var);
            Collections.sort(arrayList);
        }
    }

    public final void c(d0 d0Var, int i10) throws Throwable {
        this.f7354i0.f(1);
        b1 b1Var = this.T;
        if (i10 == -1) {
            i10 = ((ArrayList) b1Var.f7225c).size();
        }
        w(b1Var.a(i10, d0Var.f7270a, d0Var.f7271b), false);
    }

    public final void c0(f1 f1Var) {
        Looper looper = f1Var.f7299f;
        Looper looper2 = this.J;
        e7.d0 d0Var = this.H;
        if (looper != looper2) {
            d0Var.b(15, f1Var).b();
            return;
        }
        h(f1Var);
        int i10 = this.f7353h0.f7251e;
        if (i10 == 3 || i10 == 2) {
            d0Var.f(2);
        }
    }

    @Override
    public final void d(s7.c1 c1Var) {
        this.H.b(9, (s7.y) c1Var).b();
    }

    public final void d0(f1 f1Var) {
        Looper looper = f1Var.f7299f;
        if (looper.getThread().isAlive()) {
            this.Q.a(looper, null).d(new androidx.lifecycle.i0(this, f1Var));
        } else {
            e7.a.m("TAG", "Trying to send message on a dead thread.");
            f1Var.a(false);
        }
    }

    public final void e() {
        for (j1 j1Var : this.A) {
            k1 k1Var = this.f7349d0 ? this.f7348c0 : null;
            ((a) j1Var.f7384e).e(18, k1Var);
            a aVar = (a) j1Var.f7385f;
            if (aVar != null) {
                aVar.e(18, k1Var);
            }
        }
    }

    public final void e0(androidx.media3.common.d dVar, boolean z10) {
        int i10;
        v7.p pVar = (v7.p) this.D;
        if (!pVar.f15518i.equals(dVar)) {
            pVar.f15518i = dVar;
            pVar.w();
        }
        if (!z10) {
            dVar = null;
        }
        c7.f fVar = this.f7346a0;
        if (!Objects.equals(fVar.f2899d, dVar)) {
            fVar.f2899d = dVar;
            if (dVar != null) {
                int i11 = dVar.f1150c;
                i10 = 3;
                switch (i11) {
                    case 0:
                        e7.a.m("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                        i10 = 1;
                        break;
                    case 1:
                    case 14:
                        i10 = 1;
                        break;
                    case 2:
                    case 4:
                        i10 = 2;
                        break;
                    case 3:
                        i10 = 0;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                        break;
                    case 11:
                        if (dVar.f1148a == 1) {
                            i10 = 2;
                        }
                        break;
                    case 15:
                    default:
                        a1.b.y("Unidentified audio usage: ", i11, "AudioFocusManager");
                        i10 = 0;
                        break;
                    case 16:
                        i10 = 4;
                        break;
                }
            } else {
                i10 = 0;
            }
            fVar.f2901f = i10;
            ta.c0.r("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i10 == 1 || i10 == 0);
        }
        c1 c1Var = this.f7353h0;
        boolean z11 = c1Var.l;
        C0(fVar.d(c1Var.f7251e, z11), c1Var.f7258n, c1Var.m, z11);
    }

    public final boolean f() {
        if (!this.Z) {
            return false;
        }
        for (j1 j1Var : this.A) {
            if (j1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void f0(boolean z10, e7.g gVar) {
        if (this.f7363r0 != z10) {
            this.f7363r0 = z10;
            if (!z10) {
                for (j1 j1Var : this.A) {
                    j1Var.k();
                }
            }
        }
        if (gVar != null) {
            gVar.d();
        }
    }

    public final void g() {
        O();
        Y(true);
    }

    public final void g0(d0 d0Var) throws Throwable {
        this.f7354i0.f(1);
        int i10 = d0Var.f7272c;
        s7.d1 d1Var = d0Var.f7271b;
        ArrayList arrayList = d0Var.f7270a;
        if (i10 != -1) {
            this.f7367v0 = new h0(new h1(arrayList, d1Var), d0Var.f7272c, d0Var.f7273d);
        }
        b1 b1Var = this.T;
        ArrayList arrayList2 = (ArrayList) b1Var.f7225c;
        b1Var.i(0, arrayList2.size());
        w(b1Var.a(arrayList2.size(), arrayList, d1Var), false);
    }

    public final void h0(boolean z10) {
        this.f7356k0 = z10;
        Q();
        if (this.f7357l0) {
            q0 q0Var = this.S;
            if (q0Var.f7457j != q0Var.f7456i) {
                Y(true);
                v(false);
            }
        }
    }

    @Override
    public final boolean handleMessage(Message message) throws Throwable {
        int i10;
        o0 o0Var;
        s7.a0 a0Var;
        o0 o0Var2;
        int i11;
        int i12 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z10 = message.arg1 != 0;
                    int i13 = message.arg2;
                    this.f7354i0.f(1);
                    C0(this.f7346a0.d(this.f7353h0.f7251e, z10), i13 >> 4, i13 & 15, z10);
                    break;
                case 2:
                    k();
                    break;
                case 3:
                    Z((h0) message.obj);
                    break;
                case 4:
                    i0((androidx.media3.common.z0) message.obj);
                    break;
                case 5:
                    n0((l1) message.obj);
                    break;
                case 6:
                    x0(false, true);
                    break;
                case 7:
                    L((e7.g) message.obj);
                    return true;
                case 8:
                    x((s7.y) message.obj);
                    break;
                case 9:
                    t((s7.y) message.obj);
                    break;
                case 10:
                    O();
                    break;
                case 11:
                    k0(message.arg1);
                    break;
                case 12:
                    o0(message.arg1 != 0);
                    break;
                case 13:
                    f0(message.arg1 != 0, (e7.g) message.obj);
                    break;
                case 14:
                    b0((f1) message.obj);
                    break;
                case 15:
                    d0((f1) message.obj);
                    break;
                case 16:
                    androidx.media3.common.z0 z0Var = (androidx.media3.common.z0) message.obj;
                    y(z0Var, z0Var.f1688a, true, false);
                    break;
                case 17:
                    g0((d0) message.obj);
                    break;
                case TYPE_SINT64_VALUE:
                    c((d0) message.obj, message.arg1);
                    break;
                case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                    J((e0) message.obj);
                    break;
                case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                    N(message.arg1, message.arg2, (s7.d1) message.obj);
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                    p0((s7.d1) message.obj);
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                    I();
                    break;
                case 23:
                    h0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    g();
                    break;
                case RuntimeVersion.MINOR:
                    O();
                    Y(true);
                    break;
                case 27:
                    B0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    j0((m) message.obj);
                    break;
                case 29:
                    K();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    s0(pair.first, (e7.g) pair.second);
                    break;
                case 31:
                    e0((androidx.media3.common.d) message.obj, message.arg1 != 0);
                    break;
                case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                    t0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    r(message.arg1);
                    break;
                case 34:
                    s();
                    break;
                case 35:
                    r0((y7.t) message.obj);
                    break;
                case 36:
                    l0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.f7350e0 = false;
                    h0 h0Var = this.f7351f0;
                    if (h0Var != null) {
                        Z(h0Var);
                        this.f7351f0 = null;
                    }
                    break;
                case 38:
                    m0((k1) message.obj);
                    break;
            }
        } catch (ParserException e3) {
            boolean z11 = e3.A;
            int i14 = e3.B;
            if (i14 == 1) {
                i11 = z11 ? 3001 : 3003;
            } else {
                if (i14 == 4) {
                    i11 = z11 ? 3002 : 3004;
                }
                u(i12, e3);
            }
            i12 = i11;
            u(i12, e3);
        } catch (DataSourceException e10) {
            u(e10.A, e10);
        } catch (ExoPlaybackException e11) {
            e = e11;
            int i15 = e.J;
            q0 q0Var = this.S;
            if (i15 == 1 && (o0Var2 = q0Var.f7457j) != null && e.O == null) {
                e = e.b(o0Var2.f7430g.f7438a);
            }
            int i16 = e.J;
            e7.d0 d0Var = this.H;
            if (i16 == 1 && (a0Var = e.O) != null && B(e.L, a0Var)) {
                this.E0 = true;
                i();
                o0 o0VarH = q0Var.h();
                o0 o0Var3 = q0Var.f7456i;
                if (o0Var3 != o0VarH) {
                    while (o0Var3 != null) {
                        o0 o0Var4 = o0Var3.m;
                        if (o0Var4 == o0VarH) {
                            break;
                        }
                        o0Var3 = o0Var4;
                    }
                }
                q0Var.o(o0Var3);
                if (this.f7353h0.f7251e != 4) {
                    D();
                    d0Var.f(2);
                }
            } else {
                ExoPlaybackException exoPlaybackException = this.A0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.A0;
                }
                if (e.J == 1 && q0Var.f7456i != q0Var.f7457j) {
                    while (true) {
                        o0Var = q0Var.f7456i;
                        if (o0Var == q0Var.f7457j) {
                            break;
                        }
                        q0Var.a();
                    }
                    ta.c0.v(o0Var);
                    F();
                    p0 p0Var = o0Var.f7430g;
                    s7.a0 a0Var2 = p0Var.f7438a;
                    long j9 = p0Var.f7439b;
                    this.f7353h0 = z(a0Var2, j9, p0Var.f7440c, j9, true, 0);
                }
                if (e.P && (this.A0 == null || (i10 = e.A) == 5004 || i10 == 5003)) {
                    e7.a.n("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.A0 == null) {
                        this.A0 = e;
                    }
                    e7.c0 c0VarB = d0Var.b(25, e);
                    Handler handler = d0Var.f5120a;
                    Message message2 = c0VarB.f5118a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    c0VarB.a();
                } else {
                    e7.a.e("ExoPlayerImplInternal", "Playback error", e);
                    x0(true, false);
                    this.f7353h0 = this.f7353h0.f(e);
                }
            }
        } catch (DrmSession$DrmSessionException e12) {
            u(e12.A, e12);
        } catch (BehindLiveWindowException e13) {
            u(1002, e13);
        } catch (IOException e14) {
            u(CastStatusCodes.AUTHENTICATION_FAILED, e14);
        } catch (RuntimeException e15) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, ((e15 instanceof IllegalStateException) || (e15 instanceof IllegalArgumentException)) ? 1004 : 1000, e15);
            e7.a.e("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
            x0(true, false);
            this.f7353h0 = this.f7353h0.f(exoPlaybackException2);
        }
        F();
        return true;
    }

    public final void i() {
        a aVar;
        if (this.Z && f()) {
            for (j1 j1Var : this.A) {
                int iC = j1Var.c();
                if (j1Var.f()) {
                    int i10 = j1Var.f7383d;
                    boolean z10 = i10 == 4 || i10 == 2;
                    int i11 = i10 != 4 ? 0 : 1;
                    if (z10) {
                        aVar = (a) j1Var.f7384e;
                    } else {
                        aVar = (a) j1Var.f7385f;
                        aVar.getClass();
                    }
                    j1Var.a(aVar, this.O);
                    j1Var.i(z10);
                    j1Var.f7383d = i11;
                }
                this.f7366u0 -= iC - j1Var.c();
            }
            this.D0 = -9223372036854775807L;
        }
    }

    public final void i0(androidx.media3.common.z0 z0Var) {
        this.H.e(16);
        h hVar = this.O;
        hVar.setPlaybackParameters(z0Var);
        androidx.media3.common.z0 playbackParameters = hVar.getPlaybackParameters();
        y(playbackParameters, playbackParameters.f1688a, true, true);
    }

    public final void j(int i10) {
        j1[] j1VarArr = this.A;
        int iC = j1VarArr[i10].c();
        j1 j1Var = j1VarArr[i10];
        a aVar = (a) j1Var.f7384e;
        h hVar = this.O;
        j1Var.a(aVar, hVar);
        a aVar2 = (a) j1Var.f7385f;
        if (aVar2 != null) {
            boolean z10 = (aVar2.H == 0 || j1Var.f7383d == 3) ? false : true;
            j1Var.a(aVar2, hVar);
            j1Var.i(false);
            if (z10) {
                a aVar3 = (a) j1Var.f7384e;
                aVar2.getClass();
                aVar2.e(17, aVar3);
            }
        }
        j1Var.f7383d = 0;
        H(i10, false);
        this.f7366u0 -= iC;
    }

    public final void j0(m mVar) {
        this.C0 = mVar;
        k2 k2Var = this.f7353h0.f7247a;
        q0 q0Var = this.S;
        q0Var.getClass();
        mVar.getClass();
        if (q0Var.f7462q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < q0Var.f7462q.size(); i10++) {
            ((o0) q0Var.f7462q.get(i10)).i();
        }
        q0Var.f7462q = arrayList;
        q0Var.m = null;
        q0Var.l();
    }

    public final void k() {
        int i10;
        long j9;
        int i11;
        int i12;
        int i13;
        boolean z10;
        o0 o0Var;
        e eVar;
        long j10;
        long j11;
        int i14;
        boolean z11;
        int i15;
        boolean zC;
        boolean z12;
        boolean z13;
        c1 c1Var;
        int i16;
        int i17;
        j1[] j1VarArr;
        c1 c1Var2;
        boolean z14;
        o0 o0Var2;
        int i18;
        o0 o0Var3;
        o0 o0Var4;
        boolean z15;
        boolean z16;
        v7.u uVar;
        o0 o0Var5;
        o0 o0Var6;
        o0 o0Var7;
        v7.u uVar2;
        int i19;
        int length;
        int i20;
        a aVar;
        boolean zB;
        a aVar2;
        int i21;
        int i22;
        o0 o0Var8;
        o0 o0Var9;
        boolean z17;
        v7.u uVar3;
        int i23;
        int i24;
        this.Q.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.H.e(2);
        long j12 = -9223372036854775807L;
        if (this.f7353h0.f7247a.isEmpty() || !this.T.f7223a) {
            i10 = 1;
            jUptimeMillis = jUptimeMillis;
            j9 = -9223372036854775807L;
            i11 = 4;
        } else {
            this.S.n(this.f7368w0);
            q0 q0Var = this.S;
            o0 o0Var10 = q0Var.l;
            if (o0Var10 == null || (!o0Var10.f7430g.f7447j && o0Var10.g() && q0Var.l.f7430g.f7442e != -9223372036854775807L && q0Var.f7459n < 100)) {
                q0 q0Var2 = this.S;
                long j13 = this.f7368w0;
                c1 c1Var3 = this.f7353h0;
                o0 o0Var11 = q0Var2.l;
                p0 p0VarE = o0Var11 == null ? q0Var2.e(c1Var3.f7247a, c1Var3.f7248b, c1Var3.f7249c, c1Var3.f7263s) : q0Var2.d(c1Var3.f7247a, o0Var11, j13);
                if (p0VarE != null) {
                    q0 q0Var3 = this.S;
                    o0 o0Var12 = q0Var3.l;
                    long j14 = o0Var12 == null ? 1000000000000L : (o0Var12.f7437p + o0Var12.f7430g.f7442e) - p0VarE.f7439b;
                    int i25 = 0;
                    while (true) {
                        if (i25 >= q0Var3.f7462q.size()) {
                            o0Var2 = null;
                            break;
                        }
                        p0 p0Var = ((o0) q0Var3.f7462q.get(i25)).f7430g;
                        long j15 = p0Var.f7442e;
                        long j16 = p0VarE.f7442e;
                        if ((j15 == -9223372036854775807L || j15 == j16) && p0Var.f7439b == p0VarE.f7439b && p0Var.f7438a.equals(p0VarE.f7438a)) {
                            o0Var2 = (o0) q0Var3.f7462q.remove(i25);
                            break;
                        }
                        i25++;
                    }
                    if (o0Var2 == null) {
                        i0 i0Var = (i0) q0Var3.f7452e.B;
                        a[] aVarArr = i0Var.B;
                        c3.b bVar = i0Var.D;
                        k0 k0Var = i0Var.F;
                        j7.j jVar = i0Var.W;
                        g gVar = (g) k0Var;
                        gVar.getClass();
                        a1.i iVar = new a1.i(gVar, jVar);
                        b1 b1Var = i0Var.T;
                        v7.u uVar4 = i0Var.E;
                        i0Var.C0.getClass();
                        o0Var2 = new o0(aVarArr, j14, bVar, iVar, b1Var, p0VarE, uVar4);
                    } else {
                        o0Var2.f7430g = p0VarE;
                        o0Var2.f7437p = j14;
                    }
                    o0 o0Var13 = q0Var3.l;
                    if (o0Var13 == null) {
                        q0Var3.f7456i = o0Var2;
                        q0Var3.f7457j = o0Var2;
                        q0Var3.f7458k = o0Var2;
                    } else if (o0Var2 != o0Var13.m) {
                        o0Var13.b();
                        o0Var13.m = o0Var2;
                        o0Var13.c();
                    }
                    q0Var3.f7460o = null;
                    q0Var3.l = o0Var2;
                    q0Var3.f7459n++;
                    q0Var3.m();
                    if (!o0Var2.f7427d) {
                        long j17 = p0VarE.f7439b;
                        o0Var2.f7427d = true;
                        o0Var2.f7424a.m(this, j17);
                    } else if (o0Var2.f7428e) {
                        this.H.b(8, o0Var2.f7424a).b();
                    }
                    if (this.S.f7456i == o0Var2) {
                        R(true, p0VarE.f7439b);
                    }
                    v(false);
                }
            } else {
                jUptimeMillis = jUptimeMillis;
            }
            if (this.f7360o0) {
                this.f7360o0 = A(this.S.l);
                z0();
            } else {
                D();
            }
            q0 q0Var4 = this.S;
            if (!this.f7357l0 && this.Z && !this.E0 && !f() && (o0Var8 = q0Var4.f7458k) != null && o0Var8 == q0Var4.f7457j && (o0Var9 = o0Var8.m) != null && (z17 = o0Var9.f7428e)) {
                ta.c0.A(z17);
                if (((long) ((o0Var9.e() - this.f7368w0) / this.O.getPlaybackParameters().f1688a)) <= 10000000) {
                    o0 o0Var14 = q0Var4.f7458k;
                    o0Var14.getClass();
                    q0Var4.f7458k = o0Var14.m;
                    q0Var4.m();
                    q0Var4.f7458k.getClass();
                    j1[] j1VarArr2 = this.A;
                    o0 o0Var15 = q0Var4.f7458k;
                    if (o0Var15 != null) {
                        v7.u uVar5 = o0Var15.f7436o;
                        int i26 = 0;
                        while (i26 < j1VarArr2.length) {
                            if (uVar5.b(i26)) {
                                j1 j1Var = j1VarArr2[i26];
                                if (((a) j1Var.f7385f) == null || j1Var.f()) {
                                    uVar3 = uVar5;
                                    i23 = i26;
                                } else {
                                    j1 j1Var2 = j1VarArr2[i26];
                                    ta.c0.A(!j1Var2.f());
                                    if (j1.h((a) j1Var2.f7384e)) {
                                        i24 = 3;
                                    } else {
                                        a aVar3 = (a) j1Var2.f7385f;
                                        i24 = (aVar3 == null || aVar3.H == 0) ? 2 : 4;
                                    }
                                    j1Var2.f7383d = i24;
                                    v7.u uVar6 = uVar5;
                                    i23 = i26;
                                    uVar3 = uVar6;
                                    l(o0Var15, i23, false, o0Var15.e());
                                }
                            } else {
                                uVar3 = uVar5;
                                i23 = i26;
                            }
                            i26 = i23 + 1;
                            uVar5 = uVar3;
                        }
                        if (f()) {
                            this.D0 = o0Var15.f7424a.p();
                            if (!o0Var15.g()) {
                                q0Var4.o(o0Var15);
                                v(false);
                                D();
                            }
                        }
                    }
                }
            }
            boolean z18 = this.Z;
            j1[] j1VarArr3 = this.A;
            q0 q0Var5 = this.S;
            o0 o0Var16 = q0Var5.f7457j;
            if (o0Var16 == null) {
                j9 = j12;
                i18 = 3;
            } else if (o0Var16.m == null || this.f7357l0) {
                j9 = -9223372036854775807L;
                i18 = 3;
                if (o0Var16.f7430g.f7447j || this.f7357l0) {
                    for (j1 j1Var3 : j1VarArr3) {
                        if (j1Var3.d(o0Var16) != null) {
                            a aVarD = j1Var3.d(o0Var16);
                            aVarD.getClass();
                            if (aVarD.j()) {
                                long j18 = o0Var16.f7430g.f7442e;
                                long j19 = (j18 == -9223372036854775807L || j18 == Long.MIN_VALUE) ? -9223372036854775807L : j18 + o0Var16.f7437p;
                                a aVarD2 = j1Var3.d(o0Var16);
                                aVarD2.getClass();
                                j1.l(aVarD2, j19);
                            }
                        }
                    }
                }
            } else {
                if (o0Var16.f7428e) {
                    int i27 = 0;
                    while (true) {
                        if (i27 >= j1VarArr3.length) {
                            if (!f() || q0Var5.f7458k != q0Var5.f7457j) {
                                o0 o0Var17 = o0Var16.m;
                                if (!o0Var17.f7428e && this.f7368w0 < o0Var17.e()) {
                                    break;
                                }
                                o0 o0Var18 = o0Var16.m;
                                boolean z19 = o0Var18.f7428e;
                                if (!z19) {
                                    uVar = o0Var16.f7436o;
                                    o0Var5 = q0Var5.f7458k;
                                    o0Var6 = q0Var5.f7457j;
                                    if (o0Var5 == o0Var6) {
                                        o0Var6.getClass();
                                        q0Var5.f7458k = o0Var6.m;
                                    }
                                    o0 o0Var19 = q0Var5.f7457j;
                                    o0Var19.getClass();
                                    q0Var5.f7457j = o0Var19.m;
                                    q0Var5.m();
                                    o0Var7 = q0Var5.f7457j;
                                    o0Var7.getClass();
                                    uVar2 = o0Var7.f7436o;
                                    k2 k2Var = this.f7353h0.f7247a;
                                    E0(k2Var, o0Var7.f7430g.f7438a, k2Var, o0Var16.f7430g.f7438a, -9223372036854775807L, false);
                                    i19 = -2;
                                    if (o0Var7.f7428e) {
                                        length = j1VarArr3.length;
                                        i20 = 0;
                                        while (i20 < length) {
                                            j1 j1Var4 = j1VarArr3[i20];
                                            long jE = o0Var7.e();
                                            aVar = (a) j1Var4.f7384e;
                                            int i28 = j1Var4.f7382c;
                                            zB = uVar.b(i28);
                                            boolean zB2 = uVar2.b(i28);
                                            aVar2 = (a) j1Var4.f7385f;
                                            long j20 = j12;
                                            if (aVar2 != null) {
                                            }
                                            aVar2 = aVar;
                                            if (!zB) {
                                            }
                                            i20++;
                                            j12 = j20;
                                            i19 = -2;
                                        }
                                        break;
                                        break;
                                    }
                                    length = j1VarArr3.length;
                                    i20 = 0;
                                    while (i20 < length) {
                                        j1 j1Var5 = j1VarArr3[i20];
                                        long jE2 = o0Var7.e();
                                        aVar = (a) j1Var5.f7384e;
                                        int i29 = j1Var5.f7382c;
                                        zB = uVar.b(i29);
                                        boolean zB3 = uVar2.b(i29);
                                        aVar2 = (a) j1Var5.f7385f;
                                        long j21 = j12;
                                        if (aVar2 != null) {
                                        }
                                        aVar2 = aVar;
                                        if (!zB) {
                                        }
                                        i20++;
                                        j12 = j21;
                                        i19 = -2;
                                    }
                                    break;
                                    break;
                                }
                                ta.c0.A(z19);
                                if (((long) ((o0Var18.e() - this.f7368w0) / this.O.getPlaybackParameters().f1688a)) > 10000000) {
                                    break;
                                }
                                uVar = o0Var16.f7436o;
                                o0Var5 = q0Var5.f7458k;
                                o0Var6 = q0Var5.f7457j;
                                if (o0Var5 == o0Var6) {
                                    o0Var6.getClass();
                                    q0Var5.f7458k = o0Var6.m;
                                }
                                o0 o0Var110 = q0Var5.f7457j;
                                o0Var110.getClass();
                                q0Var5.f7457j = o0Var110.m;
                                q0Var5.m();
                                o0Var7 = q0Var5.f7457j;
                                o0Var7.getClass();
                                uVar2 = o0Var7.f7436o;
                                k2 k2Var2 = this.f7353h0.f7247a;
                                E0(k2Var2, o0Var7.f7430g.f7438a, k2Var2, o0Var16.f7430g.f7438a, -9223372036854775807L, false);
                                i19 = -2;
                                if (o0Var7.f7428e && ((z18 && this.D0 != -9223372036854775807L) || o0Var7.f7424a.p() != -9223372036854775807L)) {
                                    this.D0 = -9223372036854775807L;
                                    boolean z20 = z18 && !this.E0;
                                    if (z20) {
                                        for (int i30 = 0; i30 < j1VarArr3.length; i30++) {
                                            boolean zB4 = uVar2.b(i30);
                                            v7.r[] rVarArr = uVar2.f15530c;
                                            if (zB4 && ((a) j1VarArr3[i30].f7384e).B != -2 && !androidx.media3.common.x0.a(rVarArr[i30].n().f1594n, rVarArr[i30].n().f1593k) && !j1VarArr3[i30].f()) {
                                                z20 = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (!z20) {
                                        long jE3 = o0Var7.e();
                                        int length2 = j1VarArr3.length;
                                        int i31 = 0;
                                        while (i31 < length2) {
                                            j1 j1Var6 = j1VarArr3[i31];
                                            a aVar4 = (a) j1Var6.f7385f;
                                            a aVar5 = (a) j1Var6.f7384e;
                                            if (j1.h(aVar5) && (i22 = j1Var6.f7383d) != 4 && i22 != 2) {
                                                j1.l(aVar5, jE3);
                                            }
                                            if (aVar4 != null) {
                                                if ((aVar4.H != 0) && j1Var6.f7383d != 3) {
                                                    j1.l(aVar4, jE3);
                                                }
                                            }
                                            i31++;
                                            o0Var7 = o0Var7;
                                        }
                                        o0 o0Var20 = o0Var7;
                                        if (!o0Var20.g()) {
                                            q0Var5.o(o0Var20);
                                            v(false);
                                            D();
                                            break;
                                        }
                                        break;
                                    }
                                    length = j1VarArr3.length;
                                    i20 = 0;
                                    while (i20 < length) {
                                        j1 j1Var7 = j1VarArr3[i20];
                                        long jE4 = o0Var7.e();
                                        aVar = (a) j1Var7.f7384e;
                                        int i210 = j1Var7.f7382c;
                                        zB = uVar.b(i210);
                                        boolean zB5 = uVar2.b(i210);
                                        aVar2 = (a) j1Var7.f7385f;
                                        long j22 = j12;
                                        if (aVar2 != null) {
                                        }
                                        aVar2 = aVar;
                                        if (!zB) {
                                        }
                                        i20++;
                                        j12 = j22;
                                        i19 = -2;
                                    }
                                    break;
                                    break;
                                }
                                length = j1VarArr3.length;
                                i20 = 0;
                                while (i20 < length) {
                                    j1 j1Var8 = j1VarArr3[i20];
                                    long jE5 = o0Var7.e();
                                    aVar = (a) j1Var8.f7384e;
                                    int i211 = j1Var8.f7382c;
                                    zB = uVar.b(i211);
                                    boolean zB6 = uVar2.b(i211);
                                    aVar2 = (a) j1Var8.f7385f;
                                    long j23 = j12;
                                    if (aVar2 != null || (i21 = j1Var8.f7383d) == 3 || (i21 == 0 && j1.h(aVar))) {
                                        aVar2 = aVar;
                                    }
                                    if (!zB && !aVar2.N) {
                                        boolean z21 = aVar.B == i19;
                                        i1 i1Var = uVar.f15529b[i211];
                                        i1 i1Var2 = uVar2.f15529b[i211];
                                        if (!zB6 || !Objects.equals(i1Var2, i1Var) || z21 || j1Var8.f()) {
                                            j1.l(aVar2, jE5);
                                        }
                                    }
                                    i20++;
                                    j12 = j23;
                                    i19 = -2;
                                }
                                break;
                            }
                            break;
                        }
                        j1 j1Var9 = j1VarArr3[i27];
                        if (!j1Var9.e(o0Var16, (a) j1Var9.f7384e) || !j1Var9.e(o0Var16, (a) j1Var9.f7385f)) {
                            break;
                        } else {
                            i27++;
                        }
                    }
                }
                j9 = j12;
                i18 = 3;
            }
            q0 q0Var6 = this.S;
            o0 o0Var21 = q0Var6.f7457j;
            if (o0Var21 != null && q0Var6.f7456i != o0Var21 && !o0Var21.f7431h) {
                j1[] j1VarArr4 = this.A;
                v7.u uVar7 = o0Var21.f7436o;
                boolean z22 = true;
                for (int i32 = 0; i32 < j1VarArr4.length; i32++) {
                    int iC = j1VarArr4[i32].c();
                    j1 j1Var10 = j1VarArr4[i32];
                    h hVar = this.O;
                    int iJ = j1Var10.j((a) j1Var10.f7384e, o0Var21, uVar7, hVar);
                    int iJ2 = j1Var10.j((a) j1Var10.f7385f, o0Var21, uVar7, hVar);
                    if (iJ == 1) {
                        iJ = iJ2;
                    }
                    if ((iJ & 2) != 0 && (z16 = this.f7365t0) && z16) {
                        this.f7365t0 = false;
                        if (this.f7353h0.f7260p) {
                            this.H.f(2);
                        }
                    }
                    this.f7366u0 -= iC - j1VarArr4[i32].c();
                    z22 &= (iJ & 1) != 0;
                }
                if (z22) {
                    for (int i33 = 0; i33 < j1VarArr4.length; i33++) {
                        if (uVar7.b(i33)) {
                            if (!(j1VarArr4[i33].d(o0Var21) != null)) {
                                l(o0Var21, i33, false, o0Var21.e());
                            }
                        }
                    }
                }
                if (z22) {
                    q0Var6.f7457j.f7431h = true;
                }
            }
            j1[] j1VarArr5 = this.A;
            q0 q0Var7 = this.S;
            boolean z23 = false;
            while (u0() && !this.f7357l0 && (o0Var3 = q0Var7.f7456i) != null && (o0Var4 = o0Var3.m) != null && this.f7368w0 >= o0Var4.e() && o0Var4.f7431h) {
                if (z23) {
                    F();
                }
                this.E0 = false;
                o0 o0VarA = q0Var7.a();
                o0VarA.getClass();
                if (this.f7353h0.f7248b.f13644a.equals(o0VarA.f7430g.f7438a.f13644a)) {
                    s7.a0 a0Var = this.f7353h0.f7248b;
                    if (a0Var.f13645b == -1) {
                        s7.a0 a0Var2 = o0VarA.f7430g.f7438a;
                        if (a0Var2.f13645b != -1 || a0Var.f13648e == a0Var2.f13648e) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                    } else {
                        z15 = false;
                    }
                } else {
                    z15 = false;
                }
                p0 p0Var2 = o0VarA.f7430g;
                s7.a0 a0Var3 = p0Var2.f7438a;
                long j24 = p0Var2.f7439b;
                this.f7353h0 = z(a0Var3, j24, p0Var2.f7440c, j24, !z15, 0);
                Q();
                D0();
                if (f() && o0VarA == q0Var7.f7458k) {
                    for (j1 j1Var11 : j1VarArr5) {
                        int i34 = j1Var11.f7383d;
                        if (i34 == i18 || i34 == 4) {
                            boolean z24 = i34 == 4;
                            a aVar6 = (a) j1Var11.f7384e;
                            a aVar7 = (a) j1Var11.f7385f;
                            if (z24) {
                                aVar7.getClass();
                                aVar7.e(17, aVar6);
                            } else {
                                aVar7.getClass();
                                aVar6.e(17, aVar7);
                            }
                            j1Var11.f7383d = j1Var11.f7383d == 4 ? 0 : 1;
                        } else if (i34 == 2) {
                            j1Var11.f7383d = 0;
                        }
                    }
                }
                if (this.f7353h0.f7251e == i18) {
                    w0();
                }
                v7.u uVar8 = q0Var7.f7456i.f7436o;
                for (int i35 = 0; i35 < j1VarArr5.length; i35++) {
                    if (uVar8.b(i35)) {
                        j1 j1Var12 = j1VarArr5[i35];
                        a aVar8 = (a) j1Var12.f7385f;
                        a aVar9 = (a) j1Var12.f7384e;
                        if (j1.h(aVar9)) {
                            aVar9.f();
                        } else if (aVar8 != null) {
                            if (aVar8.H != 0) {
                                aVar8.f();
                            }
                        }
                    }
                }
                z23 = true;
            }
            i10 = 1;
            i11 = 4;
            this.C0.getClass();
        }
        int i36 = this.f7353h0.f7251e;
        if (i36 == i10 || i36 == i11) {
            return;
        }
        o0 o0Var22 = this.S.f7456i;
        if (o0Var22 == null) {
            X(jUptimeMillis);
            return;
        }
        long j25 = jUptimeMillis;
        Trace.beginSection("doSomeWork");
        D0();
        if (o0Var22.f7428e) {
            this.Q.getClass();
            this.f7369x0 = e7.i0.H(SystemClock.elapsedRealtime());
            o0Var22.f7424a.o(this.N, this.f7353h0.f7263s - this.M);
            i12 = i10;
            i13 = i12;
            int i37 = 0;
            while (true) {
                j1[] j1VarArr6 = this.A;
                if (i37 >= j1VarArr6.length) {
                    break;
                }
                j1 j1Var13 = j1VarArr6[i37];
                if (j1Var13.c() == 0) {
                    H(i37, false);
                } else {
                    long j26 = this.f7368w0;
                    long j27 = this.f7369x0;
                    a aVar10 = (a) j1Var13.f7385f;
                    a aVar11 = (a) j1Var13.f7384e;
                    if (j1.h(aVar11)) {
                        aVar11.x(j26, j27);
                    }
                    if (aVar10 != null) {
                        if (aVar10.H != 0) {
                            aVar10.x(j26, j27);
                        }
                    }
                    if (i13 != 0) {
                        a aVar12 = (a) j1Var13.f7385f;
                        a aVar13 = (a) j1Var13.f7384e;
                        boolean zK = j1.h(aVar13) ? aVar13.k() : true;
                        if (aVar12 != null) {
                            if (aVar12.H != 0) {
                                zK &= aVar12.k();
                            }
                        }
                        if (zK) {
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                    } else {
                        i13 = 0;
                    }
                    a aVarD3 = j1Var13.d(o0Var22);
                    boolean z25 = aVarD3 == null || aVarD3.j() || aVarD3.m() || aVarD3.k();
                    H(i37, z25);
                    i12 = (i12 == 0 || !z25) ? 0 : 1;
                    if (!z25) {
                        G(i37);
                    }
                }
                i37++;
            }
        } else {
            o0Var22.f7424a.j();
            i12 = 1;
            i13 = 1;
        }
        long j28 = o0Var22.f7430g.f7442e;
        boolean z26 = i13 != 0 && o0Var22.f7428e && (j28 == j9 || j28 <= this.f7353h0.f7263s);
        if (z26 && this.f7357l0) {
            this.f7357l0 = false;
            int i38 = this.f7353h0.f7258n;
            this.f7354i0.f(0);
            C0(this.f7346a0.d(this.f7353h0.f7251e, false), i38, 5, false);
        }
        if (!z26 || !o0Var22.f7430g.f7447j) {
            c1 c1Var4 = this.f7353h0;
            if (c1Var4.f7251e == 2) {
                q0 q0Var8 = this.S;
                if (this.f7366u0 == 0) {
                    zC = C();
                } else if (i12 != 0) {
                    if (c1Var4.f7253g) {
                        o0 o0Var23 = q0Var8.f7456i;
                        long j29 = v0(c1Var4.f7247a, o0Var23.f7430g.f7438a) ? this.U.f7281h : j9;
                        o0 o0Var24 = q0Var8.l;
                        boolean z27 = o0Var24.g() && o0Var24.f7430g.f7447j;
                        boolean z28 = o0Var24.f7430g.f7438a.b() && !o0Var24.f7428e;
                        if (!z27 && !z28) {
                            long jQ = q(o0Var24.d());
                            k0 k0Var2 = this.F;
                            j7.j jVar2 = this.W;
                            k2 k2Var3 = this.f7353h0.f7247a;
                            s7.a0 a0Var4 = o0Var23.f7430g.f7438a;
                            float f3 = this.O.getPlaybackParameters().f1688a;
                            boolean z29 = this.f7353h0.l;
                            boolean z30 = this.f7358m0;
                            g gVar2 = (g) k0Var2;
                            gVar2.getClass();
                            androidx.media3.common.l0 l0Var = k2Var3.getWindow(k2Var3.getPeriodByUid(a0Var4.f13644a, gVar2.f7307b).f1233c, gVar2.f7306a).f1285c.f1414b;
                            if (l0Var == null) {
                                z11 = false;
                            } else {
                                String scheme = l0Var.f1328a.getScheme();
                                if (TextUtils.isEmpty(scheme) || g.f7305s.contains(scheme)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            }
                            long jX = e7.i0.x(f3, jQ);
                            long jMin = z30 ? z11 ? gVar2.f7316k : gVar2.f7315j : z11 ? gVar2.f7314i : gVar2.f7313h;
                            if (j29 != j9) {
                                jMin = Math.min(j29 / 2, jMin);
                            }
                            if (jMin > 0 && jX < jMin) {
                                if (!(z11 ? gVar2.m : false)) {
                                    f fVar = (f) gVar2.f7320q.get(jVar2);
                                    fVar.getClass();
                                    synchronized (fVar) {
                                        i15 = fVar.f7293d;
                                    }
                                    int i39 = i15 * gVar2.f7308c.f15848b;
                                    f fVar2 = (f) gVar2.f7320q.get(jVar2);
                                    fVar2.getClass();
                                    if (i39 >= fVar2.f7292c) {
                                    }
                                }
                                zC = false;
                            }
                        }
                    }
                    zC = true;
                } else {
                    zC = false;
                }
                if (zC) {
                    q0(3);
                    this.A0 = null;
                    if (u0()) {
                        F0(false, false);
                        h hVar2 = this.O;
                        z10 = true;
                        hVar2.F = true;
                        hVar2.A.d();
                        w0();
                    }
                } else {
                    z10 = true;
                    if (this.f7353h0.f7251e == 3 && (this.f7366u0 != 0 ? i12 == 0 : !C())) {
                        F0(u0(), false);
                        q0(2);
                        if (this.f7358m0) {
                            for (o0Var = this.S.f7456i; o0Var != null; o0Var = o0Var.m) {
                                for (v7.r rVar : o0Var.f7436o.f15530c) {
                                    if (rVar != null) {
                                        rVar.t();
                                    }
                                }
                            }
                            eVar = this.U;
                            j10 = eVar.f7281h;
                            if (j10 != j9) {
                                long j30 = j10 + eVar.f7275b;
                                eVar.f7281h = j30;
                                j11 = eVar.f7280g;
                                if (j11 != j9 && j30 > j11) {
                                    eVar.f7281h = j11;
                                }
                                eVar.l = j9;
                            }
                        }
                        y0();
                    }
                }
            } else {
                z10 = true;
                if (this.f7353h0.f7251e == 3) {
                    F0(u0(), false);
                    q0(2);
                    if (this.f7358m0) {
                        while (o0Var != null) {
                            while (i14 < r7) {
                                if (rVar != null) {
                                    rVar.t();
                                }
                            }
                        }
                        eVar = this.U;
                        j10 = eVar.f7281h;
                        if (j10 != j9) {
                            long j31 = j10 + eVar.f7275b;
                            eVar.f7281h = j31;
                            j11 = eVar.f7280g;
                            if (j11 != j9) {
                                eVar.f7281h = j11;
                            }
                            eVar.l = j9;
                        }
                    }
                    y0();
                }
            }
            if (this.f7353h0.f7251e == 2) {
                i17 = 0;
                while (true) {
                    j1VarArr = this.A;
                    if (i17 < j1VarArr.length) {
                        break;
                    }
                    if (j1VarArr[i17].d(o0Var22) != null) {
                        z14 = z10;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        G(i17);
                    }
                    i17++;
                }
                c1Var2 = this.f7353h0;
                if (c1Var2.f7253g && c1Var2.f7262r < 500000 && A(this.S.l) && u0()) {
                    z12 = z10;
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
            if (!z12) {
                this.B0 = -9223372036854775807L;
            } else if (this.B0 == -9223372036854775807L) {
                this.Q.getClass();
                this.B0 = SystemClock.elapsedRealtime();
            } else {
                this.Q.getClass();
                if (SystemClock.elapsedRealtime() - this.B0 >= 4000) {
                    throw new StuckPlayerException(0, 4000);
                }
            }
            if (u0() || this.f7353h0.f7251e != 3) {
                z13 = false;
            } else {
                z13 = z10;
            }
            if (this.f7365t0 || !this.f7364s0 || !z13) {
                z10 = false;
            }
            c1Var = this.f7353h0;
            if (c1Var.f7260p != z10) {
                this.f7353h0 = c1Var.i(z10);
            }
            this.f7364s0 = false;
            if (!z10 && (i16 = this.f7353h0.f7251e) != 4 && (z13 || i16 == 2 || (i16 == 3 && this.f7366u0 != 0))) {
                X(j25);
            }
            Trace.endSection();
        }
        q0(i11);
        y0();
        z10 = true;
        if (this.f7353h0.f7251e == 2) {
            i17 = 0;
            while (true) {
                j1VarArr = this.A;
                if (i17 < j1VarArr.length) {
                    break;
                    break;
                }
                if (j1VarArr[i17].d(o0Var22) != null) {
                    z14 = z10;
                } else {
                    z14 = false;
                }
                if (z14) {
                    G(i17);
                }
                i17++;
            }
            c1Var2 = this.f7353h0;
            if (c1Var2.f7253g) {
                z12 = false;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        if (!z12) {
            this.B0 = -9223372036854775807L;
        } else if (this.B0 == -9223372036854775807L) {
            this.Q.getClass();
            this.B0 = SystemClock.elapsedRealtime();
        } else {
            this.Q.getClass();
            if (SystemClock.elapsedRealtime() - this.B0 >= 4000) {
                throw new StuckPlayerException(0, 4000);
            }
        }
        if (u0()) {
            z13 = false;
        } else {
            z13 = false;
        }
        if (this.f7365t0) {
            z10 = false;
        } else {
            z10 = false;
        }
        c1Var = this.f7353h0;
        if (c1Var.f7260p != z10) {
            this.f7353h0 = c1Var.i(z10);
        }
        this.f7364s0 = false;
        if (!z10) {
            X(j25);
        }
        Trace.endSection();
    }

    public final void k0(int i10) {
        this.f7361p0 = i10;
        k2 k2Var = this.f7353h0.f7247a;
        q0 q0Var = this.S;
        q0Var.f7454g = i10;
        int iS = q0Var.s(k2Var);
        if ((iS & 1) != 0) {
            Y(true);
        } else if ((iS & 2) != 0) {
            i();
        }
        v(false);
    }

    public final void l(o0 o0Var, int i10, boolean z10, long j9) {
        j1 j1Var = this.A[i10];
        boolean zG = j1Var.g();
        a aVar = (a) j1Var.f7384e;
        if (zG) {
            return;
        }
        boolean z11 = o0Var == this.S.f7456i;
        v7.u uVar = o0Var.f7436o;
        i1 i1Var = uVar.f15529b[i10];
        v7.r rVar = uVar.f15530c[i10];
        boolean z12 = u0() && this.f7353h0.f7251e == 3;
        boolean z13 = !z10 && z12;
        this.f7366u0++;
        s7.a1 a1Var = o0Var.f7426c[i10];
        long j10 = o0Var.f7437p;
        s7.a0 a0Var = o0Var.f7430g.f7438a;
        a aVar2 = (a) j1Var.f7385f;
        int length = rVar != null ? rVar.length() : 0;
        androidx.media3.common.t[] tVarArr = new androidx.media3.common.t[length];
        for (int i11 = 0; i11 < length; i11++) {
            rVar.getClass();
            tVarArr[i11] = rVar.h(i11);
        }
        int i12 = j1Var.f7383d;
        h hVar = this.O;
        if (i12 == 0 || i12 == 2 || i12 == 4) {
            j1Var.f7380a = true;
            ta.c0.A(aVar.H == 0);
            aVar.D = i1Var;
            aVar.Q = a0Var;
            aVar.H = 1;
            aVar.o(z13, z11);
            aVar.y(tVarArr, a1Var, j9, j10, a0Var);
            aVar.z(j9, z13, true);
            hVar.c(aVar);
        } else {
            j1Var.f7381b = true;
            aVar2.getClass();
            ta.c0.A(aVar2.H == 0);
            aVar2.D = i1Var;
            aVar2.Q = a0Var;
            aVar2.H = 1;
            aVar2.o(z13, z11);
            aVar2.y(tVarArr, a1Var, j9, j10, a0Var);
            aVar2.z(j9, z13, true);
            hVar.c(aVar2);
        }
        c0 c0Var = new c0(this);
        a aVarD = j1Var.d(o0Var);
        aVarD.getClass();
        aVarD.e(11, c0Var);
        if (z12 && z11) {
            j1Var.m();
        }
    }

    public final void l0(boolean z10) throws Throwable {
        if (!z10) {
            h0 h0Var = this.f7351f0;
            e7.d0 d0Var = this.H;
            if (h0Var != null && this.f7350e0 && !d0Var.f5120a.hasMessages(37)) {
                this.f7352g0++;
            }
            int i10 = this.f7352g0;
            if (i10 > 0) {
                this.Y.d(new androidx.lifecycle.i0(this, i10));
            }
            this.f7352g0 = 0;
            this.f7350e0 = false;
            d0Var.e(37);
            h0 h0Var2 = this.f7351f0;
            if (h0Var2 != null) {
                Z(h0Var2);
                this.f7351f0 = null;
                this.f7350e0 = false;
            }
        }
        this.f7349d0 = z10;
        e();
    }

    public final void m(boolean[] zArr, long j9) {
        j1[] j1VarArr;
        i0 i0Var;
        long j10;
        o0 o0Var = this.S.f7457j;
        v7.u uVar = o0Var.f7436o;
        int i10 = 0;
        while (true) {
            j1VarArr = this.A;
            if (i10 >= j1VarArr.length) {
                break;
            }
            if (!uVar.b(i10)) {
                j1VarArr[i10].k();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < j1VarArr.length) {
            if (uVar.b(i11) && j1VarArr[i11].d(o0Var) == null) {
                i0Var = this;
                j10 = j9;
                i0Var.l(o0Var, i11, zArr[i11], j10);
            } else {
                i0Var = this;
                j10 = j9;
            }
            i11++;
            this = i0Var;
            j9 = j10;
        }
    }

    public final void m0(k1 k1Var) {
        this.f7348c0 = k1Var;
        e();
    }

    public final long n(k2 k2Var, Object obj, long j9) {
        h2 h2Var = this.L;
        int i10 = k2Var.getPeriodByUid(obj, h2Var).f1233c;
        j2 j2Var = this.K;
        k2Var.getWindow(i10, j2Var);
        if (j2Var.f1288f != -9223372036854775807L && j2Var.a() && j2Var.f1291i) {
            return e7.i0.H(e7.i0.v(j2Var.f1289g) - j2Var.f1288f) - (j9 + h2Var.f1235e);
        }
        return -9223372036854775807L;
    }

    public final void n0(l1 l1Var) {
        this.f7347b0 = l1Var;
    }

    public final long o(o0 o0Var) {
        if (o0Var == null) {
            return 0L;
        }
        long jMax = o0Var.f7437p;
        if (!o0Var.f7428e) {
            return jMax;
        }
        int i10 = 0;
        while (true) {
            j1[] j1VarArr = this.A;
            if (i10 >= j1VarArr.length) {
                return jMax;
            }
            if (j1VarArr[i10].d(o0Var) != null) {
                a aVarD = j1VarArr[i10].d(o0Var);
                Objects.requireNonNull(aVarD);
                long j9 = aVarD.M;
                if (j9 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(j9, jMax);
            }
            i10++;
        }
    }

    public final void o0(boolean z10) {
        this.f7362q0 = z10;
        k2 k2Var = this.f7353h0.f7247a;
        q0 q0Var = this.S;
        q0Var.f7455h = z10;
        int iS = q0Var.s(k2Var);
        if ((iS & 1) != 0) {
            Y(true);
        } else if ((iS & 2) != 0) {
            i();
        }
        v(false);
    }

    public final Pair p(k2 k2Var) {
        if (k2Var.isEmpty()) {
            return Pair.create(c1.f7246u, 0L);
        }
        Pair<Object, Long> periodPositionUs = k2Var.getPeriodPositionUs(this.K, this.L, k2Var.getFirstWindowIndex(this.f7362q0), -9223372036854775807L);
        s7.a0 a0VarQ = this.S.q(k2Var, periodPositionUs.first, 0L);
        long jLongValue = ((Long) periodPositionUs.second).longValue();
        if (a0VarQ.b()) {
            Object obj = a0VarQ.f13644a;
            h2 h2Var = this.L;
            k2Var.getPeriodByUid(obj, h2Var);
            jLongValue = a0VarQ.f13646c == h2Var.f(a0VarQ.f13645b) ? h2Var.f1237g.f1135b : 0L;
        }
        return Pair.create(a0VarQ, Long.valueOf(jLongValue));
    }

    public final void p0(s7.d1 d1Var) throws Throwable {
        this.f7354i0.f(1);
        b1 b1Var = this.T;
        int size = ((ArrayList) b1Var.f7225c).size();
        if (d1Var.f13658b.length != size) {
            d1Var = new s7.d1(new Random(d1Var.f13657a.nextLong())).a(0, size);
        }
        b1Var.f7233k = d1Var;
        w(b1Var.c(), false);
    }

    public final long q(long j9) {
        o0 o0Var = this.S.l;
        if (o0Var == null) {
            return 0L;
        }
        return Math.max(0L, j9 - (this.f7368w0 - o0Var.f7437p));
    }

    public final void q0(int i10) {
        c1 c1Var = this.f7353h0;
        if (c1Var.f7251e != i10) {
            if (i10 != 2) {
                this.B0 = -9223372036854775807L;
            }
            if (i10 != 3 && c1Var.f7260p) {
                this.f7353h0 = c1Var.i(false);
            }
            this.f7353h0 = this.f7353h0.h(i10);
        }
    }

    public final void r(int i10) {
        c1 c1Var = this.f7353h0;
        C0(i10, c1Var.f7258n, c1Var.m, c1Var.l);
    }

    public final void r0(y7.t tVar) {
        for (j1 j1Var : this.A) {
            a aVar = (a) j1Var.f7384e;
            int i10 = aVar.B;
            if (i10 == 2 || i10 == 4) {
                aVar.e(7, tVar);
                a aVar2 = (a) j1Var.f7385f;
                if (aVar2 != null) {
                    aVar2.e(7, tVar);
                }
            }
        }
    }

    public final void s() {
        t0(this.F0);
    }

    public final void s0(Object obj, e7.g gVar) {
        for (j1 j1Var : this.A) {
            a aVar = (a) j1Var.f7384e;
            if (aVar.B == 2) {
                int i10 = j1Var.f7383d;
                if (i10 == 4 || i10 == 1) {
                    a aVar2 = (a) j1Var.f7385f;
                    aVar2.getClass();
                    aVar2.e(1, obj);
                } else {
                    aVar.e(1, obj);
                }
            }
        }
        int i11 = this.f7353h0.f7251e;
        if (i11 == 3 || i11 == 2) {
            this.H.f(2);
        }
        if (gVar != null) {
            gVar.d();
        }
    }

    public final void t(s7.y yVar) {
        q0 q0Var = this.S;
        o0 o0Var = q0Var.l;
        if (o0Var != null && o0Var.f7424a == yVar) {
            q0Var.n(this.f7368w0);
            D();
            return;
        }
        o0 o0Var2 = q0Var.m;
        if (o0Var2 == null || o0Var2.f7424a != yVar) {
            return;
        }
        E();
    }

    public final void t0(float f3) {
        this.F0 = f3;
        float f10 = f3 * this.f7346a0.f2902g;
        for (j1 j1Var : this.A) {
            a aVar = (a) j1Var.f7384e;
            if (aVar.B == 1) {
                aVar.e(2, Float.valueOf(f10));
                a aVar2 = (a) j1Var.f7385f;
                if (aVar2 != null) {
                    aVar2.e(2, Float.valueOf(f10));
                }
            }
        }
    }

    public final void u(int i10, IOException iOException) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, i10, iOException);
        o0 o0Var = this.S.f7456i;
        if (o0Var != null) {
            exoPlaybackException = exoPlaybackException.b(o0Var.f7430g.f7438a);
        }
        e7.a.e("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        x0(false, false);
        this.f7353h0 = this.f7353h0.f(exoPlaybackException);
    }

    public final boolean u0() {
        c1 c1Var = this.f7353h0;
        return c1Var.l && c1Var.f7258n == 0;
    }

    public final void v(boolean z10) {
        o0 o0Var = this.S.l;
        s7.a0 a0Var = o0Var == null ? this.f7353h0.f7248b : o0Var.f7430g.f7438a;
        boolean zEquals = this.f7353h0.f7257k.equals(a0Var);
        if (!zEquals) {
            this.f7353h0 = this.f7353h0.c(a0Var);
        }
        c1 c1Var = this.f7353h0;
        c1Var.f7261q = o0Var == null ? c1Var.f7263s : o0Var.d();
        c1 c1Var2 = this.f7353h0;
        c1Var2.f7262r = q(c1Var2.f7261q);
        if ((!zEquals || z10) && o0Var != null && o0Var.f7428e) {
            A0(o0Var.f7430g.f7438a, o0Var.f7436o);
        }
    }

    public final boolean v0(k2 k2Var, s7.a0 a0Var) {
        if (a0Var.b() || k2Var.isEmpty()) {
            return false;
        }
        int i10 = k2Var.getPeriodByUid(a0Var.f13644a, this.L).f1233c;
        j2 j2Var = this.K;
        k2Var.getWindow(i10, j2Var);
        return j2Var.a() && j2Var.f1291i && j2Var.f1288f != -9223372036854775807L;
    }

    public final void w(k2 k2Var, boolean z10) throws Throwable {
        long j9;
        ?? r23;
        s7.a0 a0Var;
        int i10;
        long j10;
        k2 k2Var2;
        j2 j2Var;
        int firstWindowIndex;
        ?? I;
        ?? r7;
        boolean z11;
        boolean z12;
        boolean z13;
        int firstWindowIndex2;
        boolean z14;
        ?? r4;
        ?? r10;
        ?? r26;
        boolean z15;
        ?? r27;
        androidx.media3.common.a aVarA;
        long j11;
        s7.a0 a0Var2;
        long j12;
        int i11;
        int i12;
        long j13;
        long jMin;
        ?? r35;
        long j14;
        ?? r33;
        g0 g0Var;
        ?? r11;
        ?? r12;
        int i13;
        boolean z16;
        ?? LongValue;
        boolean z17;
        boolean z18;
        boolean z19;
        ?? r13;
        ?? r14;
        s7.a0 a0Var3;
        ?? r16;
        ?? r15;
        ?? r22;
        ?? r24;
        long j15;
        s7.a0 a0Var4;
        Object obj;
        ?? r17;
        long j16;
        ?? r18;
        boolean z20;
        char c10;
        ?? r25;
        ?? r19;
        ?? r28;
        ?? r29;
        ?? r110;
        ?? r111;
        ?? r20;
        k2 k2Var3;
        o0 o0Var;
        ?? r210;
        boolean z21;
        ?? r112;
        h0 h0Var;
        long j17;
        s7.a0 a0Var5;
        Object obj2;
        boolean z22;
        long j18;
        ?? r113;
        ?? r211;
        ?? r114;
        c1 c1Var = this.f7353h0;
        h0 h0Var2 = this.f7367v0;
        ?? r21 = this.S;
        int i14 = this.f7361p0;
        boolean z23 = this.f7362q0;
        j2 j2Var2 = this.K;
        h2 h2Var = this.L;
        if (k2Var.isEmpty()) {
            r25 = -9223372036854775807;
            k2Var2 = k2Var;
            g0Var = new g0(c1.f7246u, 0L, -9223372036854775807L, false, true, false);
            j9 = -9223372036854775807L;
        } else {
            s7.a0 a0Var6 = c1Var.f7248b;
            j9 = -9223372036854775807L;
            Object obj3 = a0Var6.f13644a;
            k2 k2Var4 = c1Var.f7247a;
            boolean z24 = k2Var4.isEmpty() || k2Var4.getPeriodByUid(a0Var6.f13644a, h2Var).f1236f;
            r23 = (c1Var.f7248b.b() || z24) ? c1Var.f7249c : c1Var.f7263s;
            if (h0Var2 != null) {
                a0Var = a0Var6;
                i10 = -1;
                j10 = 1;
                k2Var2 = k2Var;
                Pair pairV = V(k2Var2, h0Var2, true, i14, z23, j2Var2, h2Var);
                if (pairV == null) {
                    firstWindowIndex = k2Var2.getFirstWindowIndex(z23);
                    r13 = r23;
                    z19 = true;
                    z17 = false;
                    z18 = false;
                } else {
                    if (h0Var2.f7332c == -9223372036854775807L) {
                        firstWindowIndex = k2Var2.getPeriodByUid(pairV.first, h2Var).f1233c;
                        LongValue = r23;
                        z16 = false;
                    } else {
                        obj3 = pairV.first;
                        firstWindowIndex = -1;
                        z16 = true;
                        LongValue = ((Long) pairV.second).longValue();
                    }
                    z17 = c1Var.f7251e == 4;
                    z18 = z16;
                    z19 = false;
                    r13 = LongValue;
                }
                z12 = z19;
                z11 = z17;
                z13 = z18;
                ?? r40 = r13;
                j2Var = j2Var2;
                r7 = r40;
            } else {
                a0Var = a0Var6;
                i10 = -1;
                j10 = 1;
                k2Var2 = k2Var;
                if (c1Var.f7247a.isEmpty()) {
                    firstWindowIndex = k2Var2.getFirstWindowIndex(z23);
                    j2Var = j2Var2;
                } else if (k2Var2.getIndexOfPeriod(obj3) == -1) {
                    int iW = W(j2Var2, h2Var, i14, z23, obj3, c1Var.f7247a, k2Var2);
                    j2Var = j2Var2;
                    k2Var2 = k2Var2;
                    h2Var = h2Var;
                    if (iW == -1) {
                        firstWindowIndex2 = k2Var2.getFirstWindowIndex(z23);
                        z14 = true;
                    } else {
                        firstWindowIndex2 = iW;
                        z14 = false;
                    }
                    z12 = z14;
                    obj3 = obj3;
                    firstWindowIndex = firstWindowIndex2;
                    z11 = false;
                    z13 = false;
                    r7 = r23;
                } else {
                    j2Var = j2Var2;
                    if (r23 == -9223372036854775807L) {
                        int i15 = k2Var2.getPeriodByUid(obj3, h2Var).f1233c;
                        obj3 = obj3;
                        firstWindowIndex = i15;
                    } else if (z24) {
                        c1Var.f7247a.getPeriodByUid(a0Var.f13644a, h2Var);
                        if (c1Var.f7247a.getWindow(h2Var.f1233c, j2Var).f1294n == c1Var.f7247a.getIndexOfPeriod(a0Var.f13644a)) {
                            Pair<Object, Long> periodPositionUs = k2Var2.getPeriodPositionUs(j2Var, h2Var, k2Var2.getPeriodByUid(obj3, h2Var).f1233c, r23 + h2Var.f1235e);
                            obj3 = periodPositionUs.first;
                            I = ((Long) periodPositionUs.second).longValue();
                        } else if (k2Var2.getPeriodByUid(obj3, h2Var).f1234d != -9223372036854775807L) {
                            obj3 = obj3;
                            I = e7.i0.i(r23, 0L, h2Var.f1234d - 1);
                        } else {
                            obj3 = obj3;
                            I = r23;
                        }
                        r7 = I;
                        firstWindowIndex = -1;
                        z11 = false;
                        z12 = false;
                        z13 = true;
                    } else {
                        obj3 = obj3;
                        firstWindowIndex = -1;
                    }
                }
                z11 = false;
                z12 = false;
                z13 = false;
                r7 = r23;
            }
            if (firstWindowIndex != i10) {
                Pair<Object, Long> periodPositionUs2 = k2Var2.getPeriodPositionUs(j2Var, h2Var, firstWindowIndex, -9223372036854775807L);
                obj3 = periodPositionUs2.first;
                long jLongValue = ((Long) periodPositionUs2.second).longValue();
                r4 = -9223372036854775807;
                r10 = jLongValue;
            } else {
                r4 = r7;
                r10 = r7;
            }
            s7.a0 a0VarQ = r21.q(k2Var2, obj3, r10);
            int i16 = a0VarQ.f13648e;
            boolean z25 = i16 == i10 || ((i13 = a0Var.f13648e) != i10 && i16 >= i13);
            boolean zEquals = a0Var.f13644a.equals(obj3);
            boolean z26 = zEquals && !a0Var.b() && !a0VarQ.b() && z25;
            h2 periodByUid = k2Var2.getPeriodByUid(obj3, h2Var);
            if (z24 || r23 != r4) {
                r26 = r4;
            } else {
                Object obj4 = a0Var.f13644a;
                int i17 = a0Var.f13646c;
                ?? r212 = r4;
                int i18 = a0Var.f13645b;
                r26 = r212;
                if (obj4.equals(a0VarQ.f13644a)) {
                    if (a0Var.b() && periodByUid.h(i18)) {
                        r26 = r212;
                        if (periodByUid.e(i18, i17) != 4) {
                            r26 = r212;
                            if (periodByUid.e(i18, i17) != 2) {
                                z15 = true;
                                r27 = r212;
                            }
                        }
                    } else {
                        r26 = r212;
                        if (a0VarQ.b()) {
                            r26 = r212;
                            if (periodByUid.h(a0VarQ.f13645b)) {
                                z15 = true;
                                r27 = r212;
                            }
                        }
                    }
                }
                if (z26 || z15) {
                    a0VarQ = a0Var;
                }
                r12 = r10;
                if (a0VarQ.b()) {
                    if (zEquals) {
                        r12 = r10;
                        if (a0Var.b()) {
                            aVarA = k2Var2.getPeriodByUid(obj3, h2Var).f1237g.a(a0Var.f13645b);
                            j11 = aVarA.f1059j;
                            a0Var2 = a0VarQ;
                            j12 = c1Var.f7249c;
                            if (j12 != -9223372036854775807L) {
                                j14 = aVarA.f1050a;
                                if (j14 != Long.MIN_VALUE) {
                                    r11 = r10;
                                    if (j14 + j11 <= j12) {
                                        i11 = aVarA.f1051b;
                                        i12 = a0Var.f13646c;
                                        r11 = r10;
                                        if (i11 > i12) {
                                            r11 = r10;
                                            if (aVarA.f1055f[i12] == 2) {
                                                j13 = k2Var2.getPeriodByUid(obj3, h2Var).f1234d;
                                                if (j13 != -9223372036854775807L) {
                                                    jMin = Math.min(j13 - j10, r10 + j11);
                                                } else {
                                                    jMin = r10 + j11;
                                                }
                                                long j19 = jMin;
                                                r35 = j19;
                                                r33 = j19;
                                            }
                                        }
                                    }
                                } else {
                                    i11 = aVarA.f1051b;
                                    i12 = a0Var.f13646c;
                                    r11 = r10;
                                    if (i11 > i12) {
                                        r11 = r10;
                                        if (aVarA.f1055f[i12] == 2) {
                                            j13 = k2Var2.getPeriodByUid(obj3, h2Var).f1234d;
                                            if (j13 != -9223372036854775807L) {
                                                jMin = Math.min(j13 - j10, r10 + j11);
                                            } else {
                                                jMin = r10 + j11;
                                            }
                                            long j110 = jMin;
                                            r35 = j110;
                                            r33 = j110;
                                        }
                                    }
                                }
                            } else {
                                i11 = aVarA.f1051b;
                                i12 = a0Var.f13646c;
                                r11 = r10;
                                if (i11 > i12) {
                                    r11 = r10;
                                    if (aVarA.f1055f[i12] == 2) {
                                        j13 = k2Var2.getPeriodByUid(obj3, h2Var).f1234d;
                                        if (j13 != -9223372036854775807L) {
                                            jMin = Math.min(j13 - j10, r10 + j11);
                                        } else {
                                            jMin = r10 + j11;
                                        }
                                        long j111 = jMin;
                                        r35 = j111;
                                        r33 = j111;
                                    }
                                }
                            }
                        }
                        r33 = r11;
                        r35 = r27;
                    }
                    g0Var = new g0(a0Var2, r33, r35, z11, z12, z13);
                } else if (a0VarQ.equals(a0Var)) {
                    r12 = c1Var.f7263s;
                } else {
                    k2Var2.getPeriodByUid(a0VarQ.f13644a, h2Var);
                    if (a0VarQ.f13646c == h2Var.f(a0VarQ.f13645b)) {
                        r12 = h2Var.f1237g.f1135b;
                    } else {
                        r12 = 0;
                    }
                }
                a0Var2 = a0VarQ;
                r11 = r12;
                r33 = r11;
                r35 = r27;
                g0Var = new g0(a0Var2, r33, r35, z11, z12, z13);
            }
            z15 = false;
            r27 = r26;
            if (z26) {
                a0VarQ = a0Var;
            } else {
                a0VarQ = a0Var;
            }
            r12 = r10;
            if (a0VarQ.b()) {
                if (zEquals) {
                    r12 = r10;
                    if (a0Var.b()) {
                        aVarA = k2Var2.getPeriodByUid(obj3, h2Var).f1237g.a(a0Var.f13645b);
                        j11 = aVarA.f1059j;
                        a0Var2 = a0VarQ;
                        j12 = c1Var.f7249c;
                        if (j12 != -9223372036854775807L) {
                            j14 = aVarA.f1050a;
                            if (j14 != Long.MIN_VALUE) {
                                r11 = r10;
                                if (j14 + j11 <= j12) {
                                    i11 = aVarA.f1051b;
                                    i12 = a0Var.f13646c;
                                    r11 = r10;
                                    if (i11 > i12) {
                                        r11 = r10;
                                        if (aVarA.f1055f[i12] == 2) {
                                            j13 = k2Var2.getPeriodByUid(obj3, h2Var).f1234d;
                                            if (j13 != -9223372036854775807L) {
                                                jMin = Math.min(j13 - j10, r10 + j11);
                                            } else {
                                                jMin = r10 + j11;
                                            }
                                            long j112 = jMin;
                                            r35 = j112;
                                            r33 = j112;
                                        }
                                    }
                                }
                            } else {
                                i11 = aVarA.f1051b;
                                i12 = a0Var.f13646c;
                                r11 = r10;
                                if (i11 > i12) {
                                    r11 = r10;
                                    if (aVarA.f1055f[i12] == 2) {
                                        j13 = k2Var2.getPeriodByUid(obj3, h2Var).f1234d;
                                        if (j13 != -9223372036854775807L) {
                                            jMin = Math.min(j13 - j10, r10 + j11);
                                        } else {
                                            jMin = r10 + j11;
                                        }
                                        long j113 = jMin;
                                        r35 = j113;
                                        r33 = j113;
                                    }
                                }
                            }
                        } else {
                            i11 = aVarA.f1051b;
                            i12 = a0Var.f13646c;
                            r11 = r10;
                            if (i11 > i12) {
                                r11 = r10;
                                if (aVarA.f1055f[i12] == 2) {
                                    j13 = k2Var2.getPeriodByUid(obj3, h2Var).f1234d;
                                    if (j13 != -9223372036854775807L) {
                                        jMin = Math.min(j13 - j10, r10 + j11);
                                    } else {
                                        jMin = r10 + j11;
                                    }
                                    long j114 = jMin;
                                    r35 = j114;
                                    r33 = j114;
                                }
                            }
                        }
                    }
                    r33 = r11;
                    r35 = r27;
                }
                g0Var = new g0(a0Var2, r33, r35, z11, z12, z13);
            } else if (a0VarQ.equals(a0Var)) {
                r12 = c1Var.f7263s;
            } else {
                k2Var2.getPeriodByUid(a0VarQ.f13644a, h2Var);
                if (a0VarQ.f13646c == h2Var.f(a0VarQ.f13645b)) {
                    r12 = h2Var.f1237g.f1135b;
                } else {
                    r12 = 0;
                }
            }
            a0Var2 = a0VarQ;
            r11 = r12;
            r33 = r11;
            r35 = r27;
            g0Var = new g0(a0Var2, r33, r35, z11, z12, z13);
        }
        s7.a0 a0Var7 = g0Var.f7322a;
        ?? r115 = g0Var.f7324c;
        boolean z27 = g0Var.f7325d;
        long jA0 = g0Var.f7323b;
        boolean z28 = (this.f7353h0.f7248b.equals(a0Var7) && jA0 == this.f7353h0.f7263s) ? false : true;
        try {
            if (g0Var.f7326e) {
                try {
                    z20 = true;
                    if (this.f7353h0.f7251e != 1) {
                        c10 = 4;
                        try {
                            q0(4);
                        } catch (Throwable th2) {
                            th = th2;
                            r14 = k2Var2;
                            a0Var3 = a0Var7;
                            r22 = z20;
                            r24 = c10;
                            r16 = r115;
                            r15 = 0;
                        }
                    } else {
                        c10 = 4;
                    }
                    P(false, false, false, true);
                } catch (Throwable th3) {
                    th = th3;
                    z20 = true;
                    c10 = 4;
                    r14 = k2Var2;
                    a0Var3 = a0Var7;
                    r22 = z20;
                    r24 = c10;
                    r16 = r115;
                    r15 = 0;
                }
            } else {
                z20 = true;
                c10 = 4;
            }
            j1[] j1VarArr = this.A;
            int length = j1VarArr.length;
            ?? r30 = 0;
            while (r30 < length) {
                try {
                    j1 j1Var = j1VarArr[r30];
                    a aVar = (a) j1Var.f7384e;
                    if (!Objects.equals(aVar.P, k2Var2)) {
                        aVar.P = k2Var2;
                        aVar.v();
                    }
                    a aVar2 = (a) j1Var.f7385f;
                    if (aVar2 != null && !Objects.equals(aVar2.P, k2Var2)) {
                        aVar2.P = k2Var2;
                        aVar2.v();
                    }
                    r30++;
                } catch (Throwable th4) {
                    th = th4;
                    r14 = k2Var2;
                    a0Var3 = a0Var7;
                    r24 = c10;
                    r16 = r115;
                    r15 = 0;
                    r22 = 1;
                }
            }
            try {
                if (z28) {
                    r30 = k2Var2;
                    r23 = c10;
                    r19 = r115;
                    h0Var = null;
                    h0Var = null;
                    r111 = 0;
                    r115 = 0;
                    z21 = true;
                    z21 = true;
                    r29 = 1;
                    r25 = 1;
                    r114 = r19;
                    r211 = r23;
                    if (r30.isEmpty()) {
                        a0Var3 = a0Var7;
                        r112 = r114;
                        r210 = r211;
                    } else {
                        for (o0 o0Var2 = this.S.f7456i; o0Var2 != null; o0Var2 = o0Var2.m) {
                            if (o0Var2.f7430g.f7438a.equals(a0Var7)) {
                                o0Var2.f7430g = this.S.i(r30, o0Var2.f7430g);
                                o0Var2.k();
                            }
                        }
                        try {
                            q0 q0Var = this.S;
                            a0Var3 = a0Var7;
                            try {
                                jA0 = a0(a0Var3, jA0, q0Var.f7456i != q0Var.f7457j, z27);
                                r112 = r19;
                                r210 = r23;
                            } catch (Throwable th5) {
                                th = th5;
                                jA0 = jA0;
                                r20 = r30;
                                r110 = r19;
                                r28 = r23;
                                r14 = r20;
                                r15 = r111;
                                r16 = r110;
                                r22 = r29;
                                r24 = r28;
                                c1 c1Var2 = this.f7353h0;
                                k2 k2Var5 = c1Var2.f7247a;
                                s7.a0 a0Var8 = c1Var2.f7248b;
                                if (g0Var.f7327f) {
                                    j15 = jA0;
                                } else {
                                    j15 = j9;
                                }
                                a0Var4 = a0Var3;
                                E0(r14, a0Var4, k2Var5, a0Var8, j15, false);
                                if (z28) {
                                    c1 c1Var3 = this.f7353h0;
                                    obj = c1Var3.f7248b.f13644a;
                                    k2 k2Var6 = c1Var3.f7247a;
                                    if (z28) {
                                        r17 = 0;
                                    } else {
                                        r17 = 0;
                                    }
                                    if (r17 != 0) {
                                        j16 = jA0;
                                    } else {
                                        j16 = this.f7353h0.f7250d;
                                    }
                                    if (r14.getIndexOfPeriod(obj) == -1) {
                                        r18 = r24;
                                    } else {
                                        r18 = 3;
                                    }
                                    this.f7353h0 = z(a0Var4, jA0, r16, j16, r17, r18);
                                } else {
                                    c1 c1Var4 = this.f7353h0;
                                    obj = c1Var4.f7248b.f13644a;
                                    k2 k2Var7 = c1Var4.f7247a;
                                    if (z28) {
                                        r17 = 0;
                                    } else {
                                        r17 = 0;
                                    }
                                    if (r17 != 0) {
                                        j16 = jA0;
                                    } else {
                                        j16 = this.f7353h0.f7250d;
                                    }
                                    if (r14.getIndexOfPeriod(obj) == -1) {
                                        r18 = r24;
                                    } else {
                                        r18 = 3;
                                    }
                                    this.f7353h0 = z(a0Var4, jA0, r16, j16, r17, r18);
                                }
                                Q();
                                U(r14, this.f7353h0.f7247a);
                                this.f7353h0 = this.f7353h0.j(r14);
                                if (!r14.isEmpty()) {
                                    this.f7367v0 = r15;
                                }
                                v(false);
                                this.H.f(2);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            a0Var3 = a0Var7;
                            r20 = r30;
                            r111 = r115;
                            r110 = r19;
                            r29 = r25;
                            r28 = r23;
                            r14 = r20;
                            r15 = r111;
                            r16 = r110;
                            r22 = r29;
                            r24 = r28;
                            c1 c1Var5 = this.f7353h0;
                            k2 k2Var8 = c1Var5.f7247a;
                            s7.a0 a0Var9 = c1Var5.f7248b;
                            if (g0Var.f7327f) {
                                j15 = jA0;
                            } else {
                                j15 = j9;
                            }
                            a0Var4 = a0Var3;
                            E0(r14, a0Var4, k2Var8, a0Var9, j15, false);
                            if (z28) {
                                c1 c1Var6 = this.f7353h0;
                                obj = c1Var6.f7248b.f13644a;
                                k2 k2Var9 = c1Var6.f7247a;
                                if (z28) {
                                    r17 = 0;
                                } else {
                                    r17 = 0;
                                }
                                if (r17 != 0) {
                                    j16 = jA0;
                                } else {
                                    j16 = this.f7353h0.f7250d;
                                }
                                if (r14.getIndexOfPeriod(obj) == -1) {
                                    r18 = r24;
                                } else {
                                    r18 = 3;
                                }
                                this.f7353h0 = z(a0Var4, jA0, r16, j16, r17, r18);
                            } else {
                                c1 c1Var7 = this.f7353h0;
                                obj = c1Var7.f7248b.f13644a;
                                k2 k2Var10 = c1Var7.f7247a;
                                if (z28) {
                                    r17 = 0;
                                } else {
                                    r17 = 0;
                                }
                                if (r17 != 0) {
                                    j16 = jA0;
                                } else {
                                    j16 = this.f7353h0.f7250d;
                                }
                                if (r14.getIndexOfPeriod(obj) == -1) {
                                    r18 = r24;
                                } else {
                                    r18 = 3;
                                }
                                this.f7353h0 = z(a0Var4, jA0, r16, j16, r17, r18);
                            }
                            Q();
                            U(r14, this.f7353h0.f7247a);
                            this.f7353h0 = this.f7353h0.j(r14);
                            if (!r14.isEmpty()) {
                                this.f7367v0 = r15;
                            }
                            v(false);
                            this.H.f(2);
                            throw th;
                        }
                    }
                    c1 c1Var8 = this.f7353h0;
                    k2 k2Var11 = c1Var8.f7247a;
                    s7.a0 a0Var10 = c1Var8.f7248b;
                    if (g0Var.f7327f) {
                        j17 = jA0;
                    } else {
                        j17 = j9;
                    }
                    a0Var5 = a0Var3;
                    E0(k2Var, a0Var5, k2Var11, a0Var10, j17, false);
                    if (z28) {
                        c1 c1Var9 = this.f7353h0;
                        obj2 = c1Var9.f7248b.f13644a;
                        k2 k2Var12 = c1Var9.f7247a;
                        if (z28) {
                            z22 = false;
                        } else {
                            z22 = false;
                        }
                        if (z22) {
                            j18 = jA0;
                        } else {
                            j18 = this.f7353h0.f7250d;
                        }
                        if (k2Var.getIndexOfPeriod(obj2) == -1) {
                            r113 = r210;
                        } else {
                            r113 = 3;
                        }
                        this.f7353h0 = z(a0Var5, jA0, r112, j18, z22, r113);
                    } else {
                        c1 c1Var10 = this.f7353h0;
                        obj2 = c1Var10.f7248b.f13644a;
                        k2 k2Var13 = c1Var10.f7247a;
                        if (z28) {
                            z22 = false;
                        } else {
                            z22 = false;
                        }
                        if (z22) {
                            j18 = jA0;
                        } else {
                            j18 = this.f7353h0.f7250d;
                        }
                        if (k2Var.getIndexOfPeriod(obj2) == -1) {
                            r113 = r210;
                        } else {
                            r113 = 3;
                        }
                        this.f7353h0 = z(a0Var5, jA0, r112, j18, z22, r113);
                    }
                    Q();
                    U(k2Var, this.f7353h0.f7247a);
                    this.f7353h0 = this.f7353h0.j(k2Var);
                    if (!k2Var.isEmpty()) {
                        this.f7367v0 = h0Var;
                    }
                    v(false);
                    this.H.f(2);
                    return;
                }
                try {
                    o0 o0Var3 = this.S.f7457j;
                    try {
                        char c11 = c10;
                        try {
                            r23 = c11;
                            r19 = r115;
                            r115 = 0;
                            h0Var = null;
                            h0Var = null;
                            h0Var = null;
                            r25 = 1;
                            z21 = true;
                            z21 = true;
                            z21 = true;
                            try {
                                int iT = this.S.t(k2Var, this.f7368w0, o0Var3 == null ? 0L : o(o0Var3), (!f() || (o0Var = this.S.f7458k) == null) ? 0L : o(o0Var));
                                if ((iT & 1) != 0) {
                                    Y(false);
                                    r114 = r19;
                                    r211 = r23;
                                } else {
                                    r114 = r19;
                                    r211 = r23;
                                    if ((iT & 2) != 0) {
                                        i();
                                        r114 = r19;
                                        r211 = r23;
                                    }
                                }
                                a0Var3 = a0Var7;
                                r112 = r114;
                                r210 = r211;
                                c1 c1Var11 = this.f7353h0;
                                k2 k2Var14 = c1Var11.f7247a;
                                s7.a0 a0Var11 = c1Var11.f7248b;
                                if (g0Var.f7327f) {
                                    j17 = jA0;
                                } else {
                                    j17 = j9;
                                }
                                a0Var5 = a0Var3;
                                E0(k2Var, a0Var5, k2Var14, a0Var11, j17, false);
                                if (z28 || r112 != this.f7353h0.f7249c) {
                                    c1 c1Var12 = this.f7353h0;
                                    obj2 = c1Var12.f7248b.f13644a;
                                    k2 k2Var15 = c1Var12.f7247a;
                                    if (z28 || !z10 || k2Var15.isEmpty() || k2Var15.getPeriodByUid(obj2, this.L).f1236f) {
                                        z22 = false;
                                    } else {
                                        z22 = z21;
                                    }
                                    if (z22) {
                                        j18 = jA0;
                                    } else {
                                        j18 = this.f7353h0.f7250d;
                                    }
                                    if (k2Var.getIndexOfPeriod(obj2) == -1) {
                                        r113 = r210;
                                    } else {
                                        r113 = 3;
                                    }
                                    this.f7353h0 = z(a0Var5, jA0, r112, j18, z22, r113);
                                }
                                Q();
                                U(k2Var, this.f7353h0.f7247a);
                                this.f7353h0 = this.f7353h0.j(k2Var);
                                if (!k2Var.isEmpty()) {
                                    this.f7367v0 = h0Var;
                                }
                                v(false);
                                this.H.f(2);
                                return;
                            } catch (Throwable th7) {
                                th = th7;
                                r30 = k2Var;
                                a0Var3 = a0Var7;
                                r20 = r30;
                                r111 = r115;
                                r110 = r19;
                                r29 = r25;
                                r28 = r23;
                                r14 = r20;
                                r15 = r111;
                                r16 = r110;
                                r22 = r29;
                                r24 = r28;
                                c1 c1Var13 = this.f7353h0;
                                k2 k2Var16 = c1Var13.f7247a;
                                s7.a0 a0Var12 = c1Var13.f7248b;
                                if (g0Var.f7327f) {
                                    j15 = jA0;
                                } else {
                                    j15 = j9;
                                }
                                a0Var4 = a0Var3;
                                E0(r14, a0Var4, k2Var16, a0Var12, j15, false);
                                if (z28) {
                                    c1 c1Var14 = this.f7353h0;
                                    obj = c1Var14.f7248b.f13644a;
                                    k2 k2Var17 = c1Var14.f7247a;
                                    if (z28) {
                                        r17 = 0;
                                    } else {
                                        r17 = 0;
                                    }
                                    if (r17 != 0) {
                                        j16 = jA0;
                                    } else {
                                        j16 = this.f7353h0.f7250d;
                                    }
                                    if (r14.getIndexOfPeriod(obj) == -1) {
                                        r18 = r24;
                                    } else {
                                        r18 = 3;
                                    }
                                    this.f7353h0 = z(a0Var4, jA0, r16, j16, r17, r18);
                                } else {
                                    c1 c1Var15 = this.f7353h0;
                                    obj = c1Var15.f7248b.f13644a;
                                    k2 k2Var18 = c1Var15.f7247a;
                                    if (z28) {
                                        r17 = 0;
                                    } else {
                                        r17 = 0;
                                    }
                                    if (r17 != 0) {
                                        j16 = jA0;
                                    } else {
                                        j16 = this.f7353h0.f7250d;
                                    }
                                    if (r14.getIndexOfPeriod(obj) == -1) {
                                        r18 = r24;
                                    } else {
                                        r18 = 3;
                                    }
                                    this.f7353h0 = z(a0Var4, jA0, r16, j16, r17, r18);
                                }
                                Q();
                                U(r14, this.f7353h0.f7247a);
                                this.f7353h0 = this.f7353h0.j(r14);
                                if (!r14.isEmpty()) {
                                    this.f7367v0 = r15;
                                }
                                v(false);
                                this.H.f(2);
                                throw th;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            r30 = k2Var;
                            r23 = c11;
                            r19 = r115;
                            r115 = 0;
                            r25 = 1;
                            a0Var3 = a0Var7;
                            r20 = r30;
                            r111 = r115;
                            r110 = r19;
                            r29 = r25;
                            r28 = r23;
                            r14 = r20;
                            r15 = r111;
                            r16 = r110;
                            r22 = r29;
                            r24 = r28;
                            c1 c1Var16 = this.f7353h0;
                            k2 k2Var19 = c1Var16.f7247a;
                            s7.a0 a0Var13 = c1Var16.f7248b;
                            if (g0Var.f7327f) {
                                j15 = jA0;
                            } else {
                                j15 = j9;
                            }
                            a0Var4 = a0Var3;
                            E0(r14, a0Var4, k2Var19, a0Var13, j15, false);
                            if (z28) {
                                c1 c1Var17 = this.f7353h0;
                                obj = c1Var17.f7248b.f13644a;
                                k2 k2Var110 = c1Var17.f7247a;
                                if (z28) {
                                    r17 = 0;
                                } else {
                                    r17 = 0;
                                }
                                if (r17 != 0) {
                                    j16 = jA0;
                                } else {
                                    j16 = this.f7353h0.f7250d;
                                }
                                if (r14.getIndexOfPeriod(obj) == -1) {
                                    r18 = r24;
                                } else {
                                    r18 = 3;
                                }
                                this.f7353h0 = z(a0Var4, jA0, r16, j16, r17, r18);
                            } else {
                                c1 c1Var18 = this.f7353h0;
                                obj = c1Var18.f7248b.f13644a;
                                k2 k2Var111 = c1Var18.f7247a;
                                if (z28) {
                                    r17 = 0;
                                } else {
                                    r17 = 0;
                                }
                                if (r17 != 0) {
                                    j16 = jA0;
                                } else {
                                    j16 = this.f7353h0.f7250d;
                                }
                                if (r14.getIndexOfPeriod(obj) == -1) {
                                    r18 = r24;
                                } else {
                                    r18 = 3;
                                }
                                this.f7353h0 = z(a0Var4, jA0, r16, j16, r17, r18);
                            }
                            Q();
                            U(r14, this.f7353h0.f7247a);
                            this.f7353h0 = this.f7353h0.j(r14);
                            if (!r14.isEmpty()) {
                                this.f7367v0 = r15;
                            }
                            v(false);
                            this.H.f(2);
                            throw th;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        k2Var3 = k2Var;
                        r23 = c10;
                        r30 = k2Var3;
                        r19 = r115;
                        r115 = 0;
                        r25 = 1;
                        a0Var3 = a0Var7;
                        r20 = r30;
                        r111 = r115;
                        r110 = r19;
                        r29 = r25;
                        r28 = r23;
                        r14 = r20;
                        r15 = r111;
                        r16 = r110;
                        r22 = r29;
                        r24 = r28;
                        c1 c1Var19 = this.f7353h0;
                        k2 k2Var112 = c1Var19.f7247a;
                        s7.a0 a0Var14 = c1Var19.f7248b;
                        if (g0Var.f7327f) {
                            j15 = jA0;
                        } else {
                            j15 = j9;
                        }
                        a0Var4 = a0Var3;
                        E0(r14, a0Var4, k2Var112, a0Var14, j15, false);
                        if (z28) {
                            c1 c1Var110 = this.f7353h0;
                            obj = c1Var110.f7248b.f13644a;
                            k2 k2Var113 = c1Var110.f7247a;
                            if (z28) {
                                r17 = 0;
                            } else {
                                r17 = 0;
                            }
                            if (r17 != 0) {
                                j16 = jA0;
                            } else {
                                j16 = this.f7353h0.f7250d;
                            }
                            if (r14.getIndexOfPeriod(obj) == -1) {
                                r18 = r24;
                            } else {
                                r18 = 3;
                            }
                            this.f7353h0 = z(a0Var4, jA0, r16, j16, r17, r18);
                        } else {
                            c1 c1Var111 = this.f7353h0;
                            obj = c1Var111.f7248b.f13644a;
                            k2 k2Var114 = c1Var111.f7247a;
                            if (z28) {
                                r17 = 0;
                            } else {
                                r17 = 0;
                            }
                            if (r17 != 0) {
                                j16 = jA0;
                            } else {
                                j16 = this.f7353h0.f7250d;
                            }
                            if (r14.getIndexOfPeriod(obj) == -1) {
                                r18 = r24;
                            } else {
                                r18 = 3;
                            }
                            this.f7353h0 = z(a0Var4, jA0, r16, j16, r17, r18);
                        }
                        Q();
                        U(r14, this.f7353h0.f7247a);
                        this.f7353h0 = this.f7353h0.j(r14);
                        if (!r14.isEmpty()) {
                            this.f7367v0 = r15;
                        }
                        v(false);
                        this.H.f(2);
                        throw th;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    k2Var3 = k2Var2;
                }
            } catch (Throwable th11) {
                th = th11;
            }
        } catch (Throwable th12) {
            th = th12;
            r14 = k2Var2;
            a0Var3 = a0Var7;
            r16 = r115;
            r15 = 0;
            r22 = 1;
            r24 = 4;
        }
        c1 c1Var112 = this.f7353h0;
        k2 k2Var115 = c1Var112.f7247a;
        s7.a0 a0Var15 = c1Var112.f7248b;
        if (g0Var.f7327f) {
            j15 = jA0;
        } else {
            j15 = j9;
        }
        a0Var4 = a0Var3;
        E0(r14, a0Var4, k2Var115, a0Var15, j15, false);
        if (z28 || r16 != this.f7353h0.f7249c) {
            c1 c1Var113 = this.f7353h0;
            obj = c1Var113.f7248b.f13644a;
            k2 k2Var116 = c1Var113.f7247a;
            if (z28 || !z10 || k2Var116.isEmpty() || k2Var116.getPeriodByUid(obj, this.L).f1236f) {
                r17 = 0;
            } else {
                r17 = r22;
            }
            if (r17 != 0) {
                j16 = jA0;
            } else {
                j16 = this.f7353h0.f7250d;
            }
            if (r14.getIndexOfPeriod(obj) == -1) {
                r18 = r24;
            } else {
                r18 = 3;
            }
            this.f7353h0 = z(a0Var4, jA0, r16, j16, r17, r18);
        }
        Q();
        U(r14, this.f7353h0.f7247a);
        this.f7353h0 = this.f7353h0.j(r14);
        if (!r14.isEmpty()) {
            this.f7367v0 = r15;
        }
        v(false);
        this.H.f(2);
        throw th;
    }

    public final void w0() {
        o0 o0Var = this.S.f7456i;
        if (o0Var == null) {
            return;
        }
        v7.u uVar = o0Var.f7436o;
        int i10 = 0;
        while (true) {
            j1[] j1VarArr = this.A;
            if (i10 >= j1VarArr.length) {
                return;
            }
            if (uVar.b(i10)) {
                j1VarArr[i10].m();
            }
            i10++;
        }
    }

    public final void x(s7.y yVar) {
        o0 o0Var;
        i0 i0Var;
        q0 q0Var = this.S;
        o0 o0Var2 = q0Var.l;
        h hVar = this.O;
        if (o0Var2 != null && o0Var2.f7424a == yVar) {
            o0Var2.getClass();
            if (!o0Var2.f7428e) {
                float f3 = hVar.getPlaybackParameters().f1688a;
                c1 c1Var = this.f7353h0;
                o0Var2.f(f3, c1Var.f7247a, c1Var.l);
            }
            A0(o0Var2.f7430g.f7438a, o0Var2.f7436o);
            if (o0Var2 == q0Var.f7456i) {
                R(true, o0Var2.f7430g.f7439b);
                m(new boolean[this.A.length], q0Var.f7457j.e());
                o0Var2.f7431h = true;
                c1 c1Var2 = this.f7353h0;
                s7.a0 a0Var = c1Var2.f7248b;
                long j9 = o0Var2.f7430g.f7439b;
                i0Var = this;
                i0Var.f7353h0 = z(a0Var, j9, c1Var2.f7249c, j9, false, 5);
            } else {
                i0Var = this;
            }
            i0Var.D();
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= q0Var.f7462q.size()) {
                o0Var = null;
                break;
            }
            o0Var = (o0) q0Var.f7462q.get(i10);
            if (o0Var.f7424a == yVar) {
                break;
            } else {
                i10++;
            }
        }
        if (o0Var != null) {
            ta.c0.A(!o0Var.f7428e);
            float f10 = hVar.getPlaybackParameters().f1688a;
            c1 c1Var3 = this.f7353h0;
            o0Var.f(f10, c1Var3.f7247a, c1Var3.l);
            o0 o0Var3 = q0Var.m;
            if (o0Var3 == null || o0Var3.f7424a != yVar) {
                return;
            }
            E();
        }
    }

    public final void x0(boolean z10, boolean z11) {
        P(z10 || !this.f7363r0, false, true, false);
        this.f7354i0.f(z11 ? 1 : 0);
        g gVar = (g) this.F;
        ConcurrentHashMap concurrentHashMap = gVar.f7320q;
        j7.j jVar = this.W;
        f fVar = (f) concurrentHashMap.get(jVar);
        if (fVar != null) {
            int i10 = fVar.f7290a - 1;
            fVar.f7290a = i10;
            if (i10 == 0) {
                concurrentHashMap.remove(jVar);
                gVar.c();
            }
        }
        this.f7346a0.d(1, this.f7353h0.l);
        q0(1);
    }

    public final void y(androidx.media3.common.z0 z0Var, float f3, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.f7354i0.f(1);
            }
            this.f7353h0 = this.f7353h0.g(z0Var);
        }
        float f10 = z0Var.f1688a;
        o0 o0Var = this.S.f7456i;
        while (true) {
            i10 = 0;
            if (o0Var == null) {
                break;
            }
            v7.r[] rVarArr = o0Var.f7436o.f15530c;
            int length = rVarArr.length;
            while (i10 < length) {
                v7.r rVar = rVarArr[i10];
                if (rVar != null) {
                    rVar.q(f10);
                }
                i10++;
            }
            o0Var = o0Var.m;
        }
        j1[] j1VarArr = this.A;
        int length2 = j1VarArr.length;
        while (i10 < length2) {
            j1 j1Var = j1VarArr[i10];
            float f11 = z0Var.f1688a;
            ((a) j1Var.f7384e).A(f3, f11);
            a aVar = (a) j1Var.f7385f;
            if (aVar != null) {
                aVar.A(f3, f11);
            }
            i10++;
        }
    }

    public final void y0() {
        h hVar = this.O;
        hVar.F = false;
        m1 m1Var = hVar.A;
        if (m1Var.C) {
            m1Var.c(m1Var.a());
            m1Var.C = false;
        }
        for (j1 j1Var : this.A) {
            a aVar = (a) j1Var.f7385f;
            a aVar2 = (a) j1Var.f7384e;
            if (j1.h(aVar2)) {
                j1.b(aVar2);
            }
            if (aVar != null && aVar.H != 0) {
                j1.b(aVar);
            }
        }
    }

    public final c1 z(s7.a0 a0Var, long j9, long j10, long j11, boolean z10, int i10) {
        d2 d2VarG;
        boolean z11;
        this.f7371z0 = (!this.f7371z0 && j9 == this.f7353h0.f7263s && a0Var.equals(this.f7353h0.f7248b)) ? false : true;
        Q();
        c1 c1Var = this.f7353h0;
        s7.l1 l1Var = c1Var.f7254h;
        v7.u uVar = c1Var.f7255i;
        List list = c1Var.f7256j;
        if (this.T.f7223a) {
            o0 o0Var = this.S.f7456i;
            l1Var = o0Var == null ? s7.l1.f13708d : o0Var.f7435n;
            uVar = o0Var == null ? this.E : o0Var.f7436o;
            v7.r[] rVarArr = uVar.f15530c;
            fh.q0 q0Var = new fh.q0(4);
            boolean z12 = false;
            for (v7.r rVar : rVarArr) {
                if (rVar != null) {
                    androidx.media3.common.v0 v0Var = rVar.h(0).l;
                    if (v0Var == null) {
                        q0Var.c(new androidx.media3.common.v0(new androidx.media3.common.u0[0]));
                    } else {
                        q0Var.c(v0Var);
                        z12 = true;
                    }
                }
            }
            if (z12) {
                d2VarG = q0Var.g();
            } else {
                fh.r0 r0Var = fh.t0.B;
                d2VarG = d2.E;
            }
            list = d2VarG;
            if (o0Var != null) {
                p0 p0Var = o0Var.f7430g;
                if (p0Var.f7440c != j10) {
                    o0Var.f7430g = p0Var.a(j10);
                }
            }
            j1[] j1VarArr = this.A;
            q0 q0Var2 = this.S;
            o0 o0Var2 = q0Var2.f7456i;
            if (o0Var2 == q0Var2.f7457j && o0Var2 != null) {
                v7.u uVar2 = o0Var2.f7436o;
                int i11 = 0;
                boolean z13 = false;
                while (true) {
                    if (i11 >= j1VarArr.length) {
                        z11 = true;
                        break;
                    }
                    if (uVar2.b(i11)) {
                        if (((a) j1VarArr[i11].f7384e).B != 1) {
                            z11 = false;
                            break;
                        }
                        if (uVar2.f15529b[i11].f7373a != 0) {
                            z13 = true;
                        }
                    }
                    i11++;
                }
                boolean z14 = z13 && z11;
                if (z14 != this.f7365t0) {
                    this.f7365t0 = z14;
                    if (!z14 && this.f7353h0.f7260p) {
                        this.H.f(2);
                    }
                }
            }
        } else if (!a0Var.equals(c1Var.f7248b)) {
            l1Var = s7.l1.f13708d;
            uVar = this.E;
            list = d2.E;
        }
        v7.u uVar3 = uVar;
        List list2 = list;
        s7.l1 l1Var2 = l1Var;
        if (z10) {
            ba.s sVar = this.f7354i0;
            if (!sVar.f2412d || sVar.f2413e == 5) {
                sVar.f2411c = true;
                sVar.f2412d = true;
                sVar.f2413e = i10;
            } else {
                ta.c0.s(i10 == 5);
            }
        }
        c1 c1Var2 = this.f7353h0;
        return c1Var2.d(a0Var, j9, j10, j11, q(c1Var2.f7261q), l1Var2, uVar3, list2);
    }

    public final void z0() {
        o0 o0Var = this.S.l;
        boolean z10 = this.f7360o0 || (o0Var != null && o0Var.f7424a.isLoading());
        c1 c1Var = this.f7353h0;
        if (z10 != c1Var.f7253g) {
            this.f7353h0 = c1Var.b(z10);
        }
    }
}
