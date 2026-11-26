package androidx.media3.common;

import android.graphics.Rect;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public abstract class c2 extends f {
    private static final long POSITION_DISCONTINUITY_THRESHOLD_MS = 1000;
    private final e7.k applicationHandler;
    private final Looper applicationLooper;
    private final e7.p listeners;
    private final HashSet<kh.v> pendingOperations;
    private final h2 period;
    private boolean released;
    private b2 state;

    public c2(Looper looper) {
        this.applicationLooper = looper;
        e7.b0 b0Var = e7.b0.f5117a;
        this.applicationHandler = b0Var.a(looper, null);
        this.pendingOperations = new HashSet<>();
        this.period = new h2();
        this.listeners = new e7.p(looper, b0Var, new ab.r(this, 1));
    }

    public static t0 access$1400(q0 q0Var, s2 s2Var) {
        s0 s0Var = new s0();
        int size = s2Var.f1556a.size();
        for (int i10 = 0; i10 < size; i10++) {
            r2 r2Var = (r2) s2Var.f1556a.get(i10);
            for (int i11 = 0; i11 < r2Var.f1486a; i11++) {
                if (r2Var.f1490e[i11]) {
                    t tVar = r2Var.f1487b.f1341d[i11];
                    if (tVar.l != null) {
                        int i12 = 0;
                        while (true) {
                            u0[] u0VarArr = tVar.l.f1660a;
                            if (i12 < u0VarArr.length) {
                                u0VarArr[i12].b(s0Var);
                                i12++;
                            }
                        }
                    }
                }
            }
        }
        s0Var.b(q0Var.f1416d);
        return new t0(s0Var);
    }

    public static int access$7200(b2 b2Var) {
        int i10 = b2Var.D;
        if (i10 != -1) {
            return i10;
        }
        return 0;
    }

    public static void c(c2 c2Var, kh.v vVar) {
        c2Var.getClass();
        String str = e7.i0.f5136a;
        c2Var.pendingOperations.remove(vVar);
        if (!c2Var.pendingOperations.isEmpty() || c2Var.released) {
            return;
        }
        c2Var.s(c2Var.getState(), false, false);
    }

    public static void d(c2 c2Var, Runnable runnable) {
        if (((e7.d0) c2Var.applicationHandler).f5120a.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            ((e7.d0) c2Var.applicationHandler).d(runnable);
        }
    }

    public static ArrayList e(b2 b2Var, h2 h2Var, j2 j2Var) {
        long j9;
        k2 k2Var = b2Var.f1127z;
        if (k2Var instanceof w1) {
            return new ArrayList(((w1) k2Var).f1665a);
        }
        ArrayList arrayList = new ArrayList(k2Var.getWindowCount());
        boolean z10 = false;
        int i10 = 0;
        while (i10 < k2Var.getWindowCount()) {
            boolean z11 = true;
            boolean z12 = access$7200(b2Var) == i10 ? true : z10;
            k2Var.getWindow(i10, j2Var);
            fh.q0 q0VarM = fh.t0.m();
            int i11 = j2Var.f1294n;
            while (true) {
                j9 = -9223372036854775807L;
                if (i11 > j2Var.f1295o) {
                    break;
                }
                k2Var.getPeriod(i11, h2Var, z11);
                boolean z13 = z11;
                Object obj = h2Var.f1232b;
                obj.getClass();
                t1 t1Var = new t1();
                t1Var.f1651a = obj;
                t1Var.f1652b = 0L;
                c cVar = c.f1128f;
                t1Var.f1654d = z10;
                t1Var.f1653c = h2Var.f1237g;
                int i12 = i10;
                long j10 = h2Var.f1234d;
                ta.c0.s((j10 == -9223372036854775807L || j10 >= 0) ? z13 : false);
                t1Var.f1652b = j10;
                t1Var.f1654d = h2Var.f1236f;
                q0VarM.c(new u1(t1Var));
                i11++;
                z11 = z13;
                i10 = i12;
                z10 = false;
            }
            int i13 = i10;
            boolean z14 = z11;
            r1 r1Var = new r1(j2Var.f1283a);
            long j11 = j2Var.l;
            ta.c0.s(j11 >= 0 ? z14 : false);
            r1Var.l = j11;
            long j12 = j2Var.m;
            ta.c0.s((j12 == -9223372036854775807L || j12 >= 0) ? z14 : false);
            r1Var.m = j12;
            r1Var.f1476i = j2Var.f1289g;
            r1Var.f1478k = j2Var.f1291i;
            r1Var.f1480o = j2Var.f1293k;
            r1Var.f1477j = j2Var.f1290h;
            r1Var.f1473f = j2Var.f1292j;
            r1Var.f1472e = j2Var.f1286d;
            r1Var.f1470c = j2Var.f1285c;
            r1Var.f1471d = z12 ? b2Var.B : null;
            fh.d2 d2VarG = q0VarM.g();
            int i14 = d2VarG.D;
            int i15 = 0;
            while (i15 < i14 - 1) {
                long j13 = j9;
                ta.c0.r("Periods other than last need a duration", ((u1) d2VarG.get(i15)).f1657b != j13 ? z14 : false);
                int i16 = i15 + 1;
                for (int i17 = i16; i17 < i14; i17++) {
                    ta.c0.r("Duplicate PeriodData UIDs in period list", !((u1) d2VarG.get(i15)).f1656a.equals(((u1) d2VarG.get(i17)).f1656a));
                }
                i15 = i16;
                j9 = j13;
            }
            r1Var.f1481p = fh.t0.o(d2VarG);
            long j14 = j2Var.f1296p;
            if (j14 < 0) {
                z14 = false;
            }
            ta.c0.s(z14);
            r1Var.f1479n = j14;
            r1Var.f1474g = j2Var.f1287e;
            r1Var.f1469b = z12 ? b2Var.A : s2.f1554b;
            r1Var.f1475h = j2Var.f1288f;
            arrayList.add(new s1(r1Var));
            i10 = i13 + 1;
            z10 = false;
        }
        return arrayList;
    }

    public static b2 f(a2 a2Var, b2 b2Var, long j9, k2 k2Var, int i10, long j10, boolean z10, j2 j2Var) {
        long jW;
        boolean z11;
        int i11 = i10;
        long jL = l(j9, b2Var, j2Var);
        boolean z12 = false;
        if (k2Var.isEmpty() || (i11 != -1 && i11 < k2Var.getWindowCount())) {
            jW = j10;
        } else {
            jW = -9223372036854775807L;
            i11 = 0;
        }
        if (!k2Var.isEmpty() && jW == -9223372036854775807L) {
            jW = e7.i0.W(k2Var.getWindow(i11, j2Var).l);
        }
        k2 k2Var2 = b2Var.f1127z;
        z1 z1Var = b2Var.I;
        boolean z13 = k2Var2.isEmpty() || k2Var.isEmpty();
        if (z13) {
            z11 = false;
        } else {
            k2 k2Var3 = b2Var.f1127z;
            int i12 = b2Var.D;
            if (i12 == -1) {
                i12 = 0;
            }
            if (k2Var3.getWindow(i12, j2Var).f1283a.equals(k2Var.getWindow(i11, j2Var).f1283a)) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        if (k2Var.isEmpty()) {
            s2 s2Var = s2.f1554b;
            a2Var.f1090z = null;
            a2Var.A = k2Var;
            a2Var.B = s2Var;
            a2Var.C = null;
        } else if (k2Var instanceof w1) {
            s1 s1Var = (s1) ((w1) k2Var).f1665a.get(i11);
            s2 s2Var2 = s1Var.f1540b;
            t0 t0Var = s1Var.f1542d;
            a2Var.f1090z = null;
            a2Var.A = k2Var;
            a2Var.B = s2Var2;
            a2Var.C = t0Var;
        } else {
            if (!z13 && !z11) {
                z12 = true;
            }
            s2 s2Var3 = z12 ? b2Var.A : s2.f1554b;
            t0 t0Var2 = z12 ? b2Var.B : null;
            a2Var.f1090z = null;
            a2Var.A = k2Var;
            a2Var.B = s2Var3;
            a2Var.C = t0Var2;
        }
        if (z13 || z11 || jW < jL) {
            a2Var.E = i11;
            a2Var.a(-1, -1);
            a2Var.H = Long.valueOf(jW);
            a2Var.K = new y1(jW);
            a2Var.M = z1.f1691b;
        } else if (jW == jL) {
            a2Var.E = i11;
            if (b2Var.E == -1 || !z10) {
                a2Var.a(-1, -1);
                a2Var.M = new y1(l(z1Var.get(), b2Var, j2Var) - jL);
            } else {
                a2Var.M = new y1(b2Var.J.get() - b2Var.H.get());
            }
        } else {
            long jMax = Math.max(l(z1Var.get(), b2Var, j2Var), jW);
            long jMax2 = Math.max(0L, b2Var.K.get() - (jW - jL));
            a2Var.E = i11;
            a2Var.a(-1, -1);
            a2Var.H = Long.valueOf(jW);
            a2Var.K = new y1(jMax);
            a2Var.M = new y1(jMax2);
        }
        return new b2(a2Var);
    }

    public static int h(b2 b2Var, h2 h2Var, j2 j2Var) {
        int i10 = b2Var.D;
        if (i10 == -1) {
            i10 = 0;
        }
        int i11 = i10;
        if (b2Var.f1127z.isEmpty()) {
            return i11;
        }
        k2 k2Var = b2Var.f1127z;
        return k2Var.getIndexOfPeriod(k2Var.getPeriodPositionUs(j2Var, h2Var, i11, e7.i0.H(l(b2Var.G.get(), b2Var, j2Var))).first);
    }

    public static long i(b2 b2Var, Object obj, h2 h2Var, j2 j2Var) {
        return b2Var.E != -1 ? b2Var.H.get() : l(b2Var.G.get(), b2Var, j2Var) - e7.i0.W(b2Var.f1127z.getPeriodByUid(obj, h2Var).f1235e);
    }

    public static int j(k2 k2Var, w1 w1Var, int i10, h2 h2Var, j2 j2Var) {
        if (!k2Var.isEmpty()) {
            Object obj = k2Var.getPeriod(k2Var.getWindow(i10, j2Var).f1294n, h2Var, true).f1232b;
            obj.getClass();
            if (w1Var.getIndexOfPeriod(obj) != -1) {
                w1Var.getPeriodByUid(obj, h2Var);
                return h2Var.f1233c;
            }
        } else if (i10 < w1Var.f1665a.size()) {
            return i10;
        }
        return -1;
    }

    public static e1 k(b2 b2Var, boolean z10, j2 j2Var, h2 h2Var) {
        Object obj;
        q0 q0Var;
        Object obj2;
        long jL;
        long j9;
        int i10 = b2Var.D;
        if (i10 == -1) {
            i10 = 0;
        }
        int i11 = i10;
        z1 z1Var = b2Var.G;
        int i12 = b2Var.E;
        int iH = h(b2Var, h2Var, j2Var);
        k2 k2Var = b2Var.f1127z;
        if (k2Var.isEmpty()) {
            obj = null;
            q0Var = null;
            obj2 = null;
        } else {
            Object obj3 = k2Var.getPeriod(iH, h2Var, true).f1232b;
            obj = k2Var.getWindow(i11, j2Var).f1283a;
            q0Var = j2Var.f1285c;
            obj2 = obj3;
        }
        if (z10) {
            j9 = b2Var.N;
            jL = i12 == -1 ? j9 : l(z1Var.get(), b2Var, j2Var);
        } else {
            jL = l(z1Var.get(), b2Var, j2Var);
            j9 = i12 != -1 ? b2Var.H.get() : jL;
        }
        return new e1(obj, i11, q0Var, obj2, iH, j9, jL, b2Var.E, b2Var.F);
    }

    public static long l(long j9, b2 b2Var, j2 j2Var) {
        if (j9 != -9223372036854775807L) {
            return j9;
        }
        if (b2Var.f1127z.isEmpty()) {
            return 0L;
        }
        k2 k2Var = b2Var.f1127z;
        int i10 = b2Var.D;
        if (i10 == -1) {
            i10 = 0;
        }
        return e7.i0.W(k2Var.getWindow(i10, j2Var).l);
    }

    public static b2 m(b2 b2Var, ArrayList arrayList, h2 h2Var, j2 j2Var) {
        a2 a2VarA = b2Var.a();
        w1 w1Var = new w1(arrayList);
        k2 k2Var = b2Var.f1127z;
        long j9 = b2Var.G.get();
        int i10 = b2Var.D;
        if (i10 == -1) {
            i10 = 0;
        }
        int iJ = j(k2Var, w1Var, i10, h2Var, j2Var);
        long j10 = iJ == -1 ? -9223372036854775807L : j9;
        for (int i11 = i10 + 1; iJ == -1 && i11 < k2Var.getWindowCount(); i11++) {
            iJ = j(k2Var, w1Var, i11, h2Var, j2Var);
        }
        if (b2Var.f1107d != 1 && iJ == -1) {
            a2VarA.f1070d = 4;
            a2VarA.f1075i = false;
        }
        return f(a2VarA, b2Var, j9, w1Var, iJ, j10, true, j2Var);
    }

    public static b2 n(b2 b2Var, ArrayList arrayList, int i10, long j9, j2 j2Var) {
        a2 a2VarA = b2Var.a();
        k2 w1Var = arrayList == null ? b2Var.f1127z : new w1(arrayList);
        if (b2Var.f1107d != 1) {
            if (w1Var.isEmpty() || (i10 != -1 && i10 >= w1Var.getWindowCount())) {
                a2VarA.f1070d = 4;
                a2VarA.f1075i = false;
            } else {
                a2VarA.f1070d = 2;
            }
        }
        return f(a2VarA, b2Var, b2Var.G.get(), w1Var, i10, j9, false, j2Var);
    }

    public static e7.v o(SurfaceHolder surfaceHolder) {
        if (!surfaceHolder.getSurface().isValid()) {
            return e7.v.f5186d;
        }
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        return new e7.v(surfaceFrame.width(), surfaceFrame.height());
    }

    public static boolean p(b2 b2Var) {
        return b2Var.f1105b && b2Var.f1107d == 3 && b2Var.f1108e == 0;
    }

    @Override
    public final void addListener(d1 d1Var) {
        e7.p pVar = this.listeners;
        d1Var.getClass();
        pVar.a(d1Var);
    }

    @Override
    public final void addMediaItems(int i10, List<q0> list) {
        u();
        ta.c0.s(i10 >= 0);
        b2 b2Var = this.state;
        int windowCount = b2Var.f1127z.getWindowCount();
        if (!r(20) || list.isEmpty()) {
            return;
        }
        int iMin = Math.min(i10, windowCount);
        kh.v vVarHandleAddMediaItems = handleAddMediaItems(iMin, list);
        if (vVarHandleAddMediaItems.isDone() && this.pendingOperations.isEmpty()) {
            s(getState(), false, false);
            return;
        }
        this.pendingOperations.add(vVarHandleAddMediaItems);
        ArrayList arrayListE = e(b2Var, this.period, this.window);
        for (int i11 = 0; i11 < list.size(); i11++) {
            arrayListE.add(i11 + iMin, getPlaceholderMediaItemData(list.get(i11)));
        }
        s(getPlaceholderState(!b2Var.f1127z.isEmpty() ? m(b2Var, arrayListE, this.period, this.window) : n(b2Var, arrayListE, b2Var.D, b2Var.G.get(), this.window)), false, false);
        a1.b.w(this, vVarHandleAddMediaItems, new p1(this, vVarHandleAddMediaItems));
    }

    @Override
    public final void clearVideoSurface() {
        g(null);
    }

    @Override
    public final void clearVideoSurface(Surface surface) {
        g(surface);
    }

    @Override
    public final void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        g(surfaceHolder);
    }

    @Override
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        g(surfaceView);
    }

    @Override
    public final void clearVideoTextureView(TextureView textureView) {
        g(textureView);
    }

    @Override
    @Deprecated
    public final void decreaseDeviceVolume() {
        u();
        b2 b2Var = this.state;
        if (r(26)) {
            t(handleDecreaseDeviceVolume(1), new m1(b2Var, 0), false, false);
        }
    }

    @Override
    public final void decreaseDeviceVolume(int i10) {
        u();
        b2 b2Var = this.state;
        if (r(34)) {
            t(handleDecreaseDeviceVolume(i10), new m1(b2Var, 2), false, false);
        }
    }

    public final void g(Object obj) {
        u();
        b2 b2Var = this.state;
        if (r(27)) {
            kh.v vVarHandleClearVideoOutput = handleClearVideoOutput(obj);
            if (vVarHandleClearVideoOutput.isDone() && this.pendingOperations.isEmpty()) {
                s(getState(), false, false);
                return;
            }
            this.pendingOperations.add(vVarHandleClearVideoOutput);
            a2 a2VarA = b2Var.a();
            a2VarA.f1087w = e7.v.f5186d;
            s(getPlaceholderState(new b2(a2VarA)), false, false);
            a1.b.w(this, vVarHandleClearVideoOutput, new p1(this, vVarHandleClearVideoOutput));
        }
    }

    @Override
    public final Looper getApplicationLooper() {
        return this.applicationLooper;
    }

    @Override
    public final d getAudioAttributes() {
        u();
        return this.state.f1116o;
    }

    @Override
    public final int getAudioSessionId() {
        u();
        this.state.getClass();
        return 0;
    }

    @Override
    public final b1 getAvailableCommands() {
        u();
        return this.state.f1104a;
    }

    @Override
    public final long getBufferedPosition() {
        u();
        return isPlayingAd() ? Math.max(this.state.J.get(), this.state.H.get()) : getContentBufferedPosition();
    }

    @Override
    public final long getContentBufferedPosition() {
        u();
        b2 b2Var = this.state;
        long jL = l(b2Var.I.get(), b2Var, this.window);
        b2 b2Var2 = this.state;
        return Math.max(jL, l(b2Var2.G.get(), b2Var2, this.window));
    }

    @Override
    public final long getContentPosition() {
        u();
        b2 b2Var = this.state;
        return l(b2Var.G.get(), b2Var, this.window);
    }

    @Override
    public final int getCurrentAdGroupIndex() {
        u();
        return this.state.E;
    }

    @Override
    public final int getCurrentAdIndexInAdGroup() {
        u();
        return this.state.F;
    }

    @Override
    public final d7.c getCurrentCues() {
        u();
        return this.state.f1120s;
    }

    @Override
    public final int getCurrentMediaItemIndex() {
        u();
        int i10 = this.state.D;
        if (i10 != -1) {
            return i10;
        }
        return 0;
    }

    @Override
    public final int getCurrentPeriodIndex() {
        u();
        return h(this.state, this.period, this.window);
    }

    @Override
    public final long getCurrentPosition() {
        u();
        return isPlayingAd() ? this.state.H.get() : getContentPosition();
    }

    @Override
    public final k2 getCurrentTimeline() {
        u();
        return this.state.f1127z;
    }

    @Override
    public final s2 getCurrentTracks() {
        u();
        return this.state.A;
    }

    @Override
    public final l getDeviceInfo() {
        u();
        return this.state.f1121t;
    }

    @Override
    public final int getDeviceVolume() {
        u();
        return this.state.f1122u;
    }

    @Override
    public final long getDuration() {
        u();
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        this.state.f1127z.getPeriod(getCurrentPeriodIndex(), this.period);
        h2 h2Var = this.period;
        b2 b2Var = this.state;
        return e7.i0.W(h2Var.a(b2Var.E, b2Var.F));
    }

    @Override
    public final long getMaxSeekToPreviousPosition() {
        u();
        return this.state.l;
    }

    @Override
    public final t0 getMediaMetadata() {
        u();
        return this.state.B;
    }

    public s1 getPlaceholderMediaItemData(q0 q0Var) {
        r1 r1Var = new r1(new v1());
        r1Var.f1470c = q0Var;
        r1Var.f1478k = true;
        r1Var.f1480o = true;
        return new s1(r1Var);
    }

    public b2 getPlaceholderState(b2 b2Var) {
        return b2Var;
    }

    @Override
    public final boolean getPlayWhenReady() {
        u();
        return this.state.f1105b;
    }

    @Override
    public final z0 getPlaybackParameters() {
        u();
        return this.state.m;
    }

    @Override
    public final int getPlaybackState() {
        u();
        return this.state.f1107d;
    }

    @Override
    public final int getPlaybackSuppressionReason() {
        u();
        return this.state.f1108e;
    }

    @Override
    public final PlaybackException getPlayerError() {
        u();
        return this.state.f1109f;
    }

    @Override
    public final t0 getPlaylistMetadata() {
        u();
        return this.state.C;
    }

    @Override
    public final int getRepeatMode() {
        u();
        return this.state.f1110g;
    }

    @Override
    public final long getSeekBackIncrement() {
        u();
        return this.state.f1113j;
    }

    @Override
    public final long getSeekForwardIncrement() {
        u();
        return this.state.f1114k;
    }

    @Override
    public final boolean getShuffleModeEnabled() {
        u();
        return this.state.f1111h;
    }

    public abstract b2 getState();

    @Override
    public final e7.v getSurfaceSize() {
        u();
        return this.state.f1124w;
    }

    @Override
    public final long getTotalBufferedDuration() {
        u();
        return this.state.K.get();
    }

    @Override
    public final q2 getTrackSelectionParameters() {
        u();
        return this.state.f1115n;
    }

    @Override
    public final w2 getVideoSize() {
        u();
        return this.state.f1119r;
    }

    @Override
    public final float getVolume() {
        u();
        return this.state.f1117p;
    }

    public abstract kh.v handleAddMediaItems(int i10, List list);

    public abstract kh.v handleClearVideoOutput(Object obj);

    public abstract kh.v handleDecreaseDeviceVolume(int i10);

    public abstract kh.v handleIncreaseDeviceVolume(int i10);

    public abstract kh.v handleMoveMediaItems(int i10, int i11, int i12);

    public abstract kh.v handlePrepare();

    public abstract kh.v handleRelease();

    public abstract kh.v handleRemoveMediaItems(int i10, int i11);

    public abstract kh.v handleReplaceMediaItems(int i10, int i11, List list);

    public abstract kh.v handleSeek(int i10, long j9, int i11);

    public abstract kh.v handleSetAudioAttributes(d dVar, boolean z10);

    public abstract kh.v handleSetDeviceMuted(boolean z10, int i10);

    public abstract kh.v handleSetDeviceVolume(int i10, int i11);

    public abstract kh.v handleSetMediaItems(List list, int i10, long j9);

    public abstract kh.v handleSetPlayWhenReady(boolean z10);

    public abstract kh.v handleSetPlaybackParameters(z0 z0Var);

    public abstract kh.v handleSetPlaylistMetadata(t0 t0Var);

    public abstract kh.v handleSetRepeatMode(int i10);

    public abstract kh.v handleSetShuffleModeEnabled(boolean z10);

    public abstract kh.v handleSetTrackSelectionParameters(q2 q2Var);

    public abstract kh.v handleSetVideoOutput(Object obj);

    public abstract kh.v handleSetVolume(float f3, int i10);

    public abstract kh.v handleStop();

    @Override
    @Deprecated
    public final void increaseDeviceVolume() {
        u();
        b2 b2Var = this.state;
        if (r(26)) {
            kh.v vVarHandleIncreaseDeviceVolume = handleIncreaseDeviceVolume(1);
            if (vVarHandleIncreaseDeviceVolume.isDone() && this.pendingOperations.isEmpty()) {
                s(getState(), false, false);
                return;
            }
            this.pendingOperations.add(vVarHandleIncreaseDeviceVolume);
            a2 a2VarA = b2Var.a();
            a2VarA.b(b2Var.f1122u + 1);
            s(getPlaceholderState(new b2(a2VarA)), false, false);
            a1.b.w(this, vVarHandleIncreaseDeviceVolume, new p1(this, vVarHandleIncreaseDeviceVolume));
        }
    }

    @Override
    public final void increaseDeviceVolume(int i10) {
        u();
        b2 b2Var = this.state;
        if (r(34)) {
            kh.v vVarHandleIncreaseDeviceVolume = handleIncreaseDeviceVolume(i10);
            if (vVarHandleIncreaseDeviceVolume.isDone() && this.pendingOperations.isEmpty()) {
                s(getState(), false, false);
                return;
            }
            this.pendingOperations.add(vVarHandleIncreaseDeviceVolume);
            a2 a2VarA = b2Var.a();
            a2VarA.b(b2Var.f1122u + 1);
            s(getPlaceholderState(new b2(a2VarA)), false, false);
            a1.b.w(this, vVarHandleIncreaseDeviceVolume, new p1(this, vVarHandleIncreaseDeviceVolume));
        }
    }

    public final void invalidateState() {
        u();
        if (!this.pendingOperations.isEmpty() || this.released) {
            return;
        }
        s(getState(), false, false);
    }

    @Override
    public final boolean isDeviceMuted() {
        u();
        return this.state.f1123v;
    }

    @Override
    public final boolean isLoading() {
        u();
        return this.state.f1112i;
    }

    @Override
    public final boolean isPlayingAd() {
        u();
        return this.state.E != -1;
    }

    @Override
    public final void moveMediaItems(int i10, int i11, int i12) {
        u();
        ta.c0.s(i10 >= 0 && i11 >= i10 && i12 >= 0);
        b2 b2Var = this.state;
        int windowCount = b2Var.f1127z.getWindowCount();
        if (!r(20) || windowCount == 0 || i10 >= windowCount) {
            return;
        }
        int iMin = Math.min(i11, windowCount);
        int iMin2 = Math.min(i12, windowCount - (iMin - i10));
        if (i10 == iMin || iMin2 == i10) {
            return;
        }
        kh.v vVarHandleMoveMediaItems = handleMoveMediaItems(i10, iMin, iMin2);
        if (vVarHandleMoveMediaItems.isDone() && this.pendingOperations.isEmpty()) {
            s(getState(), false, false);
            return;
        }
        this.pendingOperations.add(vVarHandleMoveMediaItems);
        ArrayList arrayListE = e(b2Var, this.period, this.window);
        e7.i0.G(arrayListE, i10, iMin, iMin2);
        s(getPlaceholderState(m(b2Var, arrayListE, this.period, this.window)), false, false);
        a1.b.w(this, vVarHandleMoveMediaItems, new p1(this, vVarHandleMoveMediaItems));
    }

    @Override
    public final void mute() {
        u();
        b2 b2Var = this.state;
        if (r(24) && this.state.f1117p != 0.0f) {
            kh.v vVarHandleSetVolume = handleSetVolume(0.0f, 1);
            if (vVarHandleSetVolume.isDone() && this.pendingOperations.isEmpty()) {
                s(getState(), false, false);
                return;
            }
            this.pendingOperations.add(vVarHandleSetVolume);
            a2 a2VarA = b2Var.a();
            a2VarA.c(0.0f);
            s(getPlaceholderState(new b2(a2VarA)), false, false);
            a1.b.w(this, vVarHandleSetVolume, new p1(this, vVarHandleSetVolume));
        }
    }

    @Override
    public final void prepare() {
        u();
        b2 b2Var = this.state;
        if (r(2)) {
            t(handlePrepare(), new m1(b2Var, 1), false, false);
        }
    }

    public final void q(final List list, final int i10, final long j9) {
        ta.c0.s(i10 == -1 || i10 >= 0);
        final b2 b2Var = this.state;
        if (r(20) || (list.size() == 1 && r(31))) {
            t(handleSetMediaItems(list, i10, j9), new eh.x() {
                @Override
                public final Object get() {
                    ArrayList arrayList = new ArrayList();
                    int i11 = 0;
                    while (true) {
                        List list2 = list;
                        int size = list2.size();
                        c2 c2Var = this.A;
                        if (i11 >= size) {
                            return c2.n(b2Var, arrayList, i10, j9, c2Var.window);
                        }
                        arrayList.add(c2Var.getPlaceholderMediaItemData((q0) list2.get(i11)));
                        i11++;
                    }
                }
            }, false, false);
        }
    }

    public final boolean r(int i10) {
        return !this.released && this.state.f1104a.a(i10);
    }

    @Override
    public final void release() {
        u();
        b2 b2Var = this.state;
        if (r(32)) {
            kh.v vVarHandleRelease = handleRelease();
            if (vVarHandleRelease.isDone() && this.pendingOperations.isEmpty()) {
                s(getState(), false, false);
            } else {
                this.pendingOperations.add(vVarHandleRelease);
                s(getPlaceholderState(b2Var), false, false);
                a1.b.w(this, vVarHandleRelease, new p1(this, vVarHandleRelease));
            }
            this.released = true;
            this.listeners.d();
            a2 a2VarA = this.state.a();
            a2VarA.f1070d = 1;
            a2VarA.M = z1.f1691b;
            a2VarA.K = new y1(l(b2Var.G.get(), b2Var, this.window));
            a2VarA.L = b2Var.H;
            a2VarA.f1075i = false;
            this.state = new b2(a2VarA);
        }
    }

    @Override
    public final void removeListener(d1 d1Var) {
        u();
        this.listeners.e(d1Var);
    }

    @Override
    public final void removeMediaItems(int i10, int i11) {
        int iMin;
        u();
        ta.c0.s(i10 >= 0 && i11 >= i10);
        b2 b2Var = this.state;
        int windowCount = b2Var.f1127z.getWindowCount();
        if (!r(20) || windowCount == 0 || i10 >= windowCount || i10 == (iMin = Math.min(i11, windowCount))) {
            return;
        }
        kh.v vVarHandleRemoveMediaItems = handleRemoveMediaItems(i10, iMin);
        if (vVarHandleRemoveMediaItems.isDone() && this.pendingOperations.isEmpty()) {
            s(getState(), false, false);
            return;
        }
        this.pendingOperations.add(vVarHandleRemoveMediaItems);
        ArrayList arrayListE = e(b2Var, this.period, this.window);
        e7.i0.N(arrayListE, i10, iMin);
        s(getPlaceholderState(m(b2Var, arrayListE, this.period, this.window)), false, false);
        a1.b.w(this, vVarHandleRemoveMediaItems, new p1(this, vVarHandleRemoveMediaItems));
    }

    @Override
    public final void replaceMediaItems(int i10, int i11, List<q0> list) {
        u();
        ta.c0.s(i10 >= 0 && i10 <= i11);
        b2 b2Var = this.state;
        int windowCount = b2Var.f1127z.getWindowCount();
        if (!r(20) || i10 > windowCount) {
            return;
        }
        int iMin = Math.min(i11, windowCount);
        kh.v vVarHandleReplaceMediaItems = handleReplaceMediaItems(i10, iMin, list);
        if (vVarHandleReplaceMediaItems.isDone() && this.pendingOperations.isEmpty()) {
            s(getState(), false, false);
            return;
        }
        this.pendingOperations.add(vVarHandleReplaceMediaItems);
        ArrayList arrayListE = e(b2Var, this.period, this.window);
        for (int i12 = 0; i12 < list.size(); i12++) {
            arrayListE.add(i12 + iMin, getPlaceholderMediaItemData(list.get(i12)));
        }
        b2 b2VarM = !b2Var.f1127z.isEmpty() ? m(b2Var, arrayListE, this.period, this.window) : n(b2Var, arrayListE, b2Var.D, b2Var.G.get(), this.window);
        if (i10 < iMin) {
            e7.i0.N(arrayListE, i10, iMin);
            b2VarM = m(b2VarM, arrayListE, this.period, this.window);
        }
        s(getPlaceholderState(b2VarM), false, false);
        a1.b.w(this, vVarHandleReplaceMediaItems, new p1(this, vVarHandleReplaceMediaItems));
    }

    public final void s(final b2 b2Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        int i10;
        ?? r22;
        int i11;
        ?? r23;
        ?? r24;
        boolean z14;
        q0 q0Var;
        int i12;
        ?? r25;
        b2 b2Var2 = this.state;
        this.state = b2Var;
        boolean z15 = b2Var.L;
        v0 v0Var = b2Var.f1126y;
        PlaybackException playbackException = b2Var.f1109f;
        int i13 = b2Var.D;
        boolean z16 = b2Var.f1125x;
        ?? r10 = b2Var.f1127z;
        if (z15 || z16) {
            a2 a2VarA = b2Var.a();
            a2VarA.N = false;
            a2VarA.f1088x = false;
            this.state = new b2(a2VarA);
        }
        boolean z17 = b2Var2.f1105b;
        int i14 = b2Var2.F;
        int i15 = b2Var2.E;
        ?? r13 = b2Var2.f1127z;
        boolean z18 = z17 != b2Var.f1105b;
        boolean z19 = b2Var2.f1107d != b2Var.f1107d;
        j2 j2Var = this.window;
        h2 h2Var = this.period;
        if (z15) {
            i10 = b2Var.M;
            z12 = z19;
            z13 = z18;
        } else if (z10) {
            z12 = z19;
            z13 = z18;
            i10 = 1;
        } else {
            if (r13.isEmpty()) {
                z12 = z19;
                z13 = z18;
            } else {
                if (r10.isEmpty()) {
                    z12 = z19;
                    z13 = z18;
                } else {
                    Object uidOfPeriod = r13.getUidOfPeriod(h(b2Var2, h2Var, j2Var));
                    z12 = z19;
                    Object uidOfPeriod2 = r10.getUidOfPeriod(h(b2Var, h2Var, j2Var));
                    z13 = z18;
                    if (!(uidOfPeriod instanceof v1) || (uidOfPeriod2 instanceof v1)) {
                        if (uidOfPeriod2.equals(uidOfPeriod) && i15 == b2Var.E && i14 == b2Var.F) {
                            long jI = i(b2Var2, uidOfPeriod, h2Var, j2Var);
                            if (Math.abs(jI - i(b2Var, uidOfPeriod2, h2Var, j2Var)) >= POSITION_DISCONTINUITY_THRESHOLD_MS) {
                                r13.getPeriodByUid(uidOfPeriod, h2Var);
                                long jW = e7.i0.W(i15 == -1 ? h2Var.f1234d : h2Var.a(i15, i14));
                                if (jW == -9223372036854775807L || jI < jW) {
                                    i10 = 5;
                                } else {
                                    i10 = 0;
                                }
                            }
                        } else if (r10.getIndexOfPeriod(uidOfPeriod) != -1) {
                            long jI2 = i(b2Var2, uidOfPeriod, h2Var, j2Var);
                            r13.getPeriodByUid(uidOfPeriod, h2Var);
                            long jW2 = e7.i0.W(i15 == -1 ? h2Var.f1234d : h2Var.a(i15, i14));
                            if (jW2 == -9223372036854775807L || jI2 < jW2) {
                                i10 = 3;
                            } else {
                                i10 = 0;
                            }
                        }
                    }
                }
                i10 = 4;
            }
            i10 = -1;
        }
        boolean zEquals = r13.equals(r10);
        j2 j2Var2 = this.window;
        if (r10.isEmpty() && r13.isEmpty()) {
            r25 = r13;
            i11 = -1;
            r24 = r25;
        } else if (r10.isEmpty() == r13.isEmpty()) {
            int i16 = b2Var2.D;
            if (i16 == -1) {
                i16 = 0;
            }
            Object obj = r13.getWindow(i16, j2Var2).f1283a;
            Object obj2 = r10.getWindow(i13 != -1 ? i13 : 0, j2Var2).f1283a;
            if ((obj instanceof v1) && !(obj2 instanceof v1)) {
                r25 = r13;
            } else if (obj.equals(obj2)) {
                if (i10 == 0) {
                    ?? r26 = r13;
                    r22 = r26;
                    if (l(b2Var2.G.get(), b2Var2, j2Var2) > l(b2Var.G.get(), b2Var, j2Var2)) {
                        i11 = 0;
                        r24 = r26;
                    }
                } else {
                    r22 = r13;
                }
                r25 = r22;
                r25 = r22;
                r23 = r22;
                if (i10 == 1 && z11) {
                    i11 = 2;
                    r24 = r23;
                }
            } else if (i10 == 0) {
                r24 = r13;
                i11 = 1;
            } else if (i10 == 1) {
                r23 = r13;
                i11 = 2;
                r24 = r23;
            } else {
                r24 = r13;
                i11 = 3;
            }
            i11 = -1;
            r24 = r25;
        } else {
            r24 = r13;
            i11 = 3;
        }
        if (zEquals) {
            z14 = false;
        } else {
            j2 j2Var3 = this.window;
            if (r24.getWindowCount() == r10.getWindowCount()) {
                int i17 = 0;
                ?? r27 = r24;
                while (true) {
                    if (i17 >= r27.getWindowCount()) {
                        i12 = 1;
                        break;
                    }
                    ?? r11 = r27;
                    Object obj3 = r11.getWindow(i17, j2Var3).f1283a;
                    Object obj4 = r10.getWindow(i17, j2Var3).f1283a;
                    boolean z20 = (obj3 instanceof v1) && !(obj4 instanceof v1);
                    if (!obj3.equals(obj4) && !z20) {
                        i12 = 0;
                        break;
                    } else {
                        i17++;
                        r27 = r11;
                    }
                }
            } else {
                i12 = 0;
                break;
            }
            e7.p pVar = this.listeners;
            k1 k1Var = new k1(b2Var, i12, 0);
            z14 = false;
            pVar.c(0, k1Var);
        }
        int i18 = -1;
        if (i10 != -1) {
            this.listeners.c(11, new i1(i10, k(b2Var2, z14, this.window, this.period), k(b2Var, z15, this.window, this.period), 0));
            i18 = -1;
        }
        if (i11 != i18) {
            ?? r7 = i13;
            if (r10.isEmpty()) {
                q0Var = null;
            } else {
                if (i13 == i18) {
                    r7 = z14;
                }
                q0Var = r10.getWindow(r7, this.window).f1285c;
            }
            this.listeners.c(1, new j1(q0Var, i11, 0));
        }
        if (!Objects.equals(b2Var2.f1109f, playbackException)) {
            final int i19 = 13;
            this.listeners.c(10, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i20 = i19;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i20) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
            if (playbackException != null) {
                final int i20 = 14;
                this.listeners.c(10, new e7.m() {
                    @Override
                    public final void invoke(Object obj5) {
                        int i21 = i20;
                        b2 b2Var3 = b2Var;
                        d1 d1Var = (d1) obj5;
                        switch (i21) {
                            case 0:
                                d1Var.C(b2Var3.f1113j);
                                break;
                            case 1:
                                d1Var.F(b2Var3.f1114k);
                                break;
                            case 2:
                                d1Var.Q(b2Var3.l);
                                break;
                            case 3:
                                d1Var.s(b2Var3.f1116o);
                                break;
                            case 4:
                                d1Var.a(b2Var3.f1119r);
                                break;
                            case 5:
                                d1Var.M(b2Var3.f1121t);
                                break;
                            case 6:
                                d1Var.E(b2Var3.C);
                                break;
                            case 7:
                                e7.v vVar = b2Var3.f1124w;
                                d1Var.S(vVar.f5187a, vVar.f5188b);
                                break;
                            case 8:
                                d1Var.n(b2Var3.f1117p);
                                break;
                            case 9:
                                d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                                break;
                            case 10:
                                d1Var.L(b2Var3.f1120s.f4767a);
                                d1Var.t(b2Var3.f1120s);
                                break;
                            case 11:
                                d1Var.H(b2Var3.f1126y);
                                break;
                            case 12:
                                d1Var.T(b2Var3.f1104a);
                                break;
                            case 13:
                                d1Var.P(b2Var3.f1109f);
                                break;
                            case 14:
                                PlaybackException playbackException2 = b2Var3.f1109f;
                                String str = e7.i0.f5136a;
                                d1Var.R(playbackException2);
                                break;
                            case 15:
                                d1Var.G(b2Var3.f1115n);
                                break;
                            case 16:
                                d1Var.K(b2Var3.A);
                                break;
                            case 17:
                                d1Var.D(b2Var3.B);
                                break;
                            case TYPE_SINT64_VALUE:
                                d1Var.g(b2Var3.f1112i);
                                d1Var.k(b2Var3.f1112i);
                                break;
                            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                                d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                                break;
                            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                                d1Var.r(b2Var3.f1107d);
                                break;
                            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                                d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                                break;
                            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                                d1Var.f(b2Var3.f1108e);
                                break;
                            case 23:
                                d1Var.V(c2.p(b2Var3));
                                break;
                            case 24:
                                d1Var.x(b2Var3.m);
                                break;
                            case 25:
                                d1Var.e(b2Var3.f1110g);
                                break;
                            default:
                                d1Var.w(b2Var3.f1111h);
                                break;
                        }
                    }
                });
            }
        }
        if (!b2Var2.f1115n.equals(b2Var.f1115n)) {
            final int i21 = 15;
            this.listeners.c(19, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i22 = i21;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i22) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (!b2Var2.A.equals(b2Var.A)) {
            final int i22 = 16;
            this.listeners.c(2, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i23 = i22;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i23) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (!b2Var2.B.equals(b2Var.B)) {
            final int i23 = 17;
            this.listeners.c(14, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i24 = i23;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i24) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (b2Var2.f1112i != b2Var.f1112i) {
            final int i24 = 18;
            this.listeners.c(3, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i25 = i24;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i25) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (z13 || z12) {
            final int i25 = 19;
            this.listeners.c(-1, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i26 = i25;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i26) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (z12) {
            final int i26 = 20;
            this.listeners.c(4, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i27 = i26;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i27) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (z13 || b2Var2.f1106c != b2Var.f1106c) {
            final int i27 = 21;
            this.listeners.c(5, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i28 = i27;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i28) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (b2Var2.f1108e != b2Var.f1108e) {
            final int i28 = 22;
            this.listeners.c(6, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i29 = i28;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i29) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (p(b2Var2) != p(b2Var)) {
            final int i29 = 23;
            this.listeners.c(7, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i210 = i29;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i210) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (!b2Var2.m.equals(b2Var.m)) {
            final int i30 = 24;
            this.listeners.c(12, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i210 = i30;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i210) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (b2Var2.f1110g != b2Var.f1110g) {
            final int i31 = 25;
            this.listeners.c(8, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i210 = i31;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i210) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (b2Var2.f1111h != b2Var.f1111h) {
            final int i32 = 26;
            this.listeners.c(9, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i210 = i32;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i210) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (b2Var2.f1113j != b2Var.f1113j) {
            final int i33 = 0;
            this.listeners.c(16, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i210 = i33;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i210) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (b2Var2.f1114k != b2Var.f1114k) {
            final int i34 = 1;
            this.listeners.c(17, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i210 = i34;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i210) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (b2Var2.l != b2Var.l) {
            final int i35 = 2;
            this.listeners.c(18, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i210 = i35;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i210) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (!b2Var2.f1116o.equals(b2Var.f1116o)) {
            final int i36 = 3;
            this.listeners.c(20, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i210 = i36;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i210) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (!b2Var2.f1119r.equals(b2Var.f1119r)) {
            final int i37 = 4;
            this.listeners.c(25, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i210 = i37;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i210) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (!b2Var2.f1121t.equals(b2Var.f1121t)) {
            final int i38 = 5;
            this.listeners.c(29, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i210 = i38;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i210) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (!b2Var2.C.equals(b2Var.C)) {
            final int i39 = 6;
            this.listeners.c(15, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i210 = i39;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i210) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (z16) {
            this.listeners.c(26, new a8.n(7));
        }
        if (!b2Var2.f1124w.equals(b2Var.f1124w)) {
            final int i40 = 7;
            this.listeners.c(24, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i210 = i40;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i210) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (b2Var2.f1117p != b2Var.f1117p) {
            final int i41 = 8;
            this.listeners.c(22, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i210 = i41;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i210) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (b2Var2.f1122u != b2Var.f1122u || b2Var2.f1123v != b2Var.f1123v) {
            final int i42 = 9;
            this.listeners.c(30, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i210 = i42;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i210) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (!b2Var2.f1120s.equals(b2Var.f1120s)) {
            final int i43 = 10;
            this.listeners.c(27, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i210 = i43;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i210) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (!b2Var2.f1126y.equals(v0Var) && v0Var.f1661b != -9223372036854775807L) {
            final int i44 = 11;
            this.listeners.c(28, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i210 = i44;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i210) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        if (!b2Var2.f1104a.equals(b2Var.f1104a)) {
            final int i45 = 12;
            this.listeners.c(13, new e7.m() {
                @Override
                public final void invoke(Object obj5) {
                    int i210 = i45;
                    b2 b2Var3 = b2Var;
                    d1 d1Var = (d1) obj5;
                    switch (i210) {
                        case 0:
                            d1Var.C(b2Var3.f1113j);
                            break;
                        case 1:
                            d1Var.F(b2Var3.f1114k);
                            break;
                        case 2:
                            d1Var.Q(b2Var3.l);
                            break;
                        case 3:
                            d1Var.s(b2Var3.f1116o);
                            break;
                        case 4:
                            d1Var.a(b2Var3.f1119r);
                            break;
                        case 5:
                            d1Var.M(b2Var3.f1121t);
                            break;
                        case 6:
                            d1Var.E(b2Var3.C);
                            break;
                        case 7:
                            e7.v vVar = b2Var3.f1124w;
                            d1Var.S(vVar.f5187a, vVar.f5188b);
                            break;
                        case 8:
                            d1Var.n(b2Var3.f1117p);
                            break;
                        case 9:
                            d1Var.A(b2Var3.f1122u, b2Var3.f1123v);
                            break;
                        case 10:
                            d1Var.L(b2Var3.f1120s.f4767a);
                            d1Var.t(b2Var3.f1120s);
                            break;
                        case 11:
                            d1Var.H(b2Var3.f1126y);
                            break;
                        case 12:
                            d1Var.T(b2Var3.f1104a);
                            break;
                        case 13:
                            d1Var.P(b2Var3.f1109f);
                            break;
                        case 14:
                            PlaybackException playbackException2 = b2Var3.f1109f;
                            String str = e7.i0.f5136a;
                            d1Var.R(playbackException2);
                            break;
                        case 15:
                            d1Var.G(b2Var3.f1115n);
                            break;
                        case 16:
                            d1Var.K(b2Var3.A);
                            break;
                        case 17:
                            d1Var.D(b2Var3.B);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.g(b2Var3.f1112i);
                            d1Var.k(b2Var3.f1112i);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.N(b2Var3.f1107d, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.r(b2Var3.f1107d);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            d1Var.m(b2Var3.f1106c, b2Var3.f1105b);
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            d1Var.f(b2Var3.f1108e);
                            break;
                        case 23:
                            d1Var.V(c2.p(b2Var3));
                            break;
                        case 24:
                            d1Var.x(b2Var3.m);
                            break;
                        case 25:
                            d1Var.e(b2Var3.f1110g);
                            break;
                        default:
                            d1Var.w(b2Var3.f1111h);
                            break;
                    }
                }
            });
        }
        this.listeners.b();
    }

    @Override
    public final void seekTo(final int i10, final long j9, int i11, boolean z10) {
        u();
        ta.c0.s(i10 == -1 || i10 >= 0);
        final b2 b2Var = this.state;
        if (r(i11)) {
            final boolean z11 = i10 == -1 || isPlayingAd() || (!b2Var.f1127z.isEmpty() && i10 >= b2Var.f1127z.getWindowCount());
            t(handleSeek(i10, j9, i11), new eh.x() {
                @Override
                public final Object get() {
                    boolean z12 = z11;
                    b2 b2Var2 = b2Var;
                    if (z12) {
                        return b2Var2;
                    }
                    return c2.n(b2Var2, null, i10, j9, this.A.window);
                }
            }, !z11, z10);
        }
    }

    @Override
    public final void setAudioAttributes(d dVar, boolean z10) {
        u();
        b2 b2Var = this.state;
        if (r(35)) {
            kh.v vVarHandleSetAudioAttributes = handleSetAudioAttributes(dVar, z10);
            if (vVarHandleSetAudioAttributes.isDone() && this.pendingOperations.isEmpty()) {
                s(getState(), false, false);
                return;
            }
            this.pendingOperations.add(vVarHandleSetAudioAttributes);
            a2 a2VarA = b2Var.a();
            a2VarA.f1079o = dVar;
            s(getPlaceholderState(new b2(a2VarA)), false, false);
            a1.b.w(this, vVarHandleSetAudioAttributes, new p1(this, vVarHandleSetAudioAttributes));
        }
    }

    @Override
    @Deprecated
    public final void setDeviceMuted(boolean z10) {
        u();
        b2 b2Var = this.state;
        if (r(26)) {
            kh.v vVarHandleSetDeviceMuted = handleSetDeviceMuted(z10, 1);
            if (vVarHandleSetDeviceMuted.isDone() && this.pendingOperations.isEmpty()) {
                s(getState(), false, false);
                return;
            }
            this.pendingOperations.add(vVarHandleSetDeviceMuted);
            a2 a2VarA = b2Var.a();
            a2VarA.f1086v = z10;
            s(getPlaceholderState(new b2(a2VarA)), false, false);
            a1.b.w(this, vVarHandleSetDeviceMuted, new p1(this, vVarHandleSetDeviceMuted));
        }
    }

    @Override
    public final void setDeviceMuted(boolean z10, int i10) {
        u();
        b2 b2Var = this.state;
        if (r(34)) {
            kh.v vVarHandleSetDeviceMuted = handleSetDeviceMuted(z10, i10);
            if (vVarHandleSetDeviceMuted.isDone() && this.pendingOperations.isEmpty()) {
                s(getState(), false, false);
                return;
            }
            this.pendingOperations.add(vVarHandleSetDeviceMuted);
            a2 a2VarA = b2Var.a();
            a2VarA.f1086v = z10;
            s(getPlaceholderState(new b2(a2VarA)), false, false);
            a1.b.w(this, vVarHandleSetDeviceMuted, new p1(this, vVarHandleSetDeviceMuted));
        }
    }

    @Override
    @Deprecated
    public final void setDeviceVolume(int i10) {
        u();
        b2 b2Var = this.state;
        if (r(25)) {
            kh.v vVarHandleSetDeviceVolume = handleSetDeviceVolume(i10, 1);
            if (vVarHandleSetDeviceVolume.isDone() && this.pendingOperations.isEmpty()) {
                s(getState(), false, false);
                return;
            }
            this.pendingOperations.add(vVarHandleSetDeviceVolume);
            a2 a2VarA = b2Var.a();
            a2VarA.b(i10);
            s(getPlaceholderState(new b2(a2VarA)), false, false);
            a1.b.w(this, vVarHandleSetDeviceVolume, new p1(this, vVarHandleSetDeviceVolume));
        }
    }

    @Override
    public final void setDeviceVolume(int i10, int i11) {
        u();
        b2 b2Var = this.state;
        if (r(33)) {
            kh.v vVarHandleSetDeviceVolume = handleSetDeviceVolume(i10, i11);
            if (vVarHandleSetDeviceVolume.isDone() && this.pendingOperations.isEmpty()) {
                s(getState(), false, false);
                return;
            }
            this.pendingOperations.add(vVarHandleSetDeviceVolume);
            a2 a2VarA = b2Var.a();
            a2VarA.b(i10);
            s(getPlaceholderState(new b2(a2VarA)), false, false);
            a1.b.w(this, vVarHandleSetDeviceVolume, new p1(this, vVarHandleSetDeviceVolume));
        }
    }

    @Override
    public final void setMediaItems(List<q0> list, int i10, long j9) {
        u();
        if (i10 == -1) {
            b2 b2Var = this.state;
            int i11 = b2Var.D;
            long j10 = b2Var.G.get();
            i10 = i11;
            j9 = j10;
        }
        q(list, i10, j9);
    }

    @Override
    public final void setMediaItems(List<q0> list, boolean z10) {
        u();
        q(list, z10 ? -1 : this.state.D, z10 ? -9223372036854775807L : this.state.G.get());
    }

    @Override
    public final void setPlayWhenReady(boolean z10) {
        u();
        b2 b2Var = this.state;
        if (r(1)) {
            kh.v vVarHandleSetPlayWhenReady = handleSetPlayWhenReady(z10);
            if (vVarHandleSetPlayWhenReady.isDone() && this.pendingOperations.isEmpty()) {
                s(getState(), false, false);
                return;
            }
            this.pendingOperations.add(vVarHandleSetPlayWhenReady);
            a2 a2VarA = b2Var.a();
            a2VarA.f1068b = z10;
            a2VarA.f1069c = 1;
            s(getPlaceholderState(new b2(a2VarA)), false, false);
            a1.b.w(this, vVarHandleSetPlayWhenReady, new p1(this, vVarHandleSetPlayWhenReady));
        }
    }

    @Override
    public final void setPlaybackParameters(z0 z0Var) {
        u();
        b2 b2Var = this.state;
        if (r(13)) {
            kh.v vVarHandleSetPlaybackParameters = handleSetPlaybackParameters(z0Var);
            if (vVarHandleSetPlaybackParameters.isDone() && this.pendingOperations.isEmpty()) {
                s(getState(), false, false);
                return;
            }
            this.pendingOperations.add(vVarHandleSetPlaybackParameters);
            a2 a2VarA = b2Var.a();
            a2VarA.m = z0Var;
            s(getPlaceholderState(new b2(a2VarA)), false, false);
            a1.b.w(this, vVarHandleSetPlaybackParameters, new p1(this, vVarHandleSetPlaybackParameters));
        }
    }

    @Override
    public final void setPlaylistMetadata(t0 t0Var) {
        u();
        b2 b2Var = this.state;
        if (r(19)) {
            kh.v vVarHandleSetPlaylistMetadata = handleSetPlaylistMetadata(t0Var);
            if (vVarHandleSetPlaylistMetadata.isDone() && this.pendingOperations.isEmpty()) {
                s(getState(), false, false);
                return;
            }
            this.pendingOperations.add(vVarHandleSetPlaylistMetadata);
            a2 a2VarA = b2Var.a();
            a2VarA.D = t0Var;
            s(getPlaceholderState(new b2(a2VarA)), false, false);
            a1.b.w(this, vVarHandleSetPlaylistMetadata, new p1(this, vVarHandleSetPlaylistMetadata));
        }
    }

    @Override
    public final void setRepeatMode(int i10) {
        u();
        b2 b2Var = this.state;
        if (r(15)) {
            kh.v vVarHandleSetRepeatMode = handleSetRepeatMode(i10);
            if (vVarHandleSetRepeatMode.isDone() && this.pendingOperations.isEmpty()) {
                s(getState(), false, false);
                return;
            }
            this.pendingOperations.add(vVarHandleSetRepeatMode);
            a2 a2VarA = b2Var.a();
            a2VarA.f1073g = i10;
            s(getPlaceholderState(new b2(a2VarA)), false, false);
            a1.b.w(this, vVarHandleSetRepeatMode, new p1(this, vVarHandleSetRepeatMode));
        }
    }

    @Override
    public final void setShuffleModeEnabled(boolean z10) {
        u();
        b2 b2Var = this.state;
        if (r(14)) {
            kh.v vVarHandleSetShuffleModeEnabled = handleSetShuffleModeEnabled(z10);
            if (vVarHandleSetShuffleModeEnabled.isDone() && this.pendingOperations.isEmpty()) {
                s(getState(), false, false);
                return;
            }
            this.pendingOperations.add(vVarHandleSetShuffleModeEnabled);
            a2 a2VarA = b2Var.a();
            a2VarA.f1074h = z10;
            s(getPlaceholderState(new b2(a2VarA)), false, false);
            a1.b.w(this, vVarHandleSetShuffleModeEnabled, new p1(this, vVarHandleSetShuffleModeEnabled));
        }
    }

    @Override
    public final void setTrackSelectionParameters(q2 q2Var) {
        u();
        b2 b2Var = this.state;
        if (r(29)) {
            kh.v vVarHandleSetTrackSelectionParameters = handleSetTrackSelectionParameters(q2Var);
            if (vVarHandleSetTrackSelectionParameters.isDone() && this.pendingOperations.isEmpty()) {
                s(getState(), false, false);
                return;
            }
            this.pendingOperations.add(vVarHandleSetTrackSelectionParameters);
            a2 a2VarA = b2Var.a();
            a2VarA.f1078n = q2Var;
            s(getPlaceholderState(new b2(a2VarA)), false, false);
            a1.b.w(this, vVarHandleSetTrackSelectionParameters, new p1(this, vVarHandleSetTrackSelectionParameters));
        }
    }

    @Override
    public final void setVideoSurface(Surface surface) {
        u();
        b2 b2Var = this.state;
        if (r(27)) {
            if (surface == null) {
                clearVideoSurface();
                return;
            }
            kh.v vVarHandleSetVideoOutput = handleSetVideoOutput(surface);
            if (vVarHandleSetVideoOutput.isDone() && this.pendingOperations.isEmpty()) {
                s(getState(), false, false);
                return;
            }
            this.pendingOperations.add(vVarHandleSetVideoOutput);
            a2 a2VarA = b2Var.a();
            a2VarA.f1087w = e7.v.f5185c;
            s(getPlaceholderState(new b2(a2VarA)), false, false);
            a1.b.w(this, vVarHandleSetVideoOutput, new p1(this, vVarHandleSetVideoOutput));
        }
    }

    @Override
    public final void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        u();
        b2 b2Var = this.state;
        if (r(27)) {
            if (surfaceHolder == null) {
                clearVideoSurface();
                return;
            }
            kh.v vVarHandleSetVideoOutput = handleSetVideoOutput(surfaceHolder);
            if (vVarHandleSetVideoOutput.isDone() && this.pendingOperations.isEmpty()) {
                s(getState(), false, false);
                return;
            }
            this.pendingOperations.add(vVarHandleSetVideoOutput);
            a2 a2VarA = b2Var.a();
            a2VarA.f1087w = o(surfaceHolder);
            s(getPlaceholderState(new b2(a2VarA)), false, false);
            a1.b.w(this, vVarHandleSetVideoOutput, new p1(this, vVarHandleSetVideoOutput));
        }
    }

    @Override
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        u();
        b2 b2Var = this.state;
        if (r(27)) {
            if (surfaceView == null) {
                clearVideoSurface();
            } else {
                t(handleSetVideoOutput(surfaceView), new o1(b2Var, surfaceView), false, false);
            }
        }
    }

    @Override
    public final void setVideoTextureView(TextureView textureView) {
        u();
        b2 b2Var = this.state;
        if (r(27)) {
            if (textureView == null) {
                clearVideoSurface();
                return;
            }
            e7.v vVar = textureView.isAvailable() ? new e7.v(textureView.getWidth(), textureView.getHeight()) : e7.v.f5186d;
            kh.v vVarHandleSetVideoOutput = handleSetVideoOutput(textureView);
            if (vVarHandleSetVideoOutput.isDone() && this.pendingOperations.isEmpty()) {
                s(getState(), false, false);
                return;
            }
            this.pendingOperations.add(vVarHandleSetVideoOutput);
            a2 a2VarA = b2Var.a();
            a2VarA.f1087w = vVar;
            s(getPlaceholderState(new b2(a2VarA)), false, false);
            a1.b.w(this, vVarHandleSetVideoOutput, new p1(this, vVarHandleSetVideoOutput));
        }
    }

    @Override
    public final void setVolume(float f3) {
        u();
        b2 b2Var = this.state;
        if (r(24)) {
            kh.v vVarHandleSetVolume = handleSetVolume(f3, 0);
            if (vVarHandleSetVolume.isDone() && this.pendingOperations.isEmpty()) {
                s(getState(), false, false);
                return;
            }
            this.pendingOperations.add(vVarHandleSetVolume);
            a2 a2VarA = b2Var.a();
            a2VarA.c(f3);
            s(getPlaceholderState(new b2(a2VarA)), false, false);
            a1.b.w(this, vVarHandleSetVolume, new p1(this, vVarHandleSetVolume));
        }
    }

    @Override
    public final void stop() {
        u();
        b2 b2Var = this.state;
        if (r(3)) {
            t(handleStop(), new o1(this, b2Var), false, false);
        }
    }

    public final void t(kh.v vVar, eh.x xVar, boolean z10, boolean z11) {
        if (vVar.isDone() && this.pendingOperations.isEmpty()) {
            s(getState(), z10, z11);
            return;
        }
        this.pendingOperations.add(vVar);
        s(getPlaceholderState((b2) xVar.get()), z10, z11);
        a1.b.w(this, vVar, new p1(this, vVar));
    }

    public final void u() {
        verifyApplicationThread();
        if (this.state == null) {
            this.state = getState();
        }
    }

    @Override
    public final void unmute() {
        u();
        b2 b2Var = this.state;
        if (r(24) && this.state.f1117p == 0.0f) {
            kh.v vVarHandleSetVolume = handleSetVolume(b2Var.f1118q, 2);
            if (vVarHandleSetVolume.isDone() && this.pendingOperations.isEmpty()) {
                s(getState(), false, false);
                return;
            }
            this.pendingOperations.add(vVarHandleSetVolume);
            a2 a2VarA = b2Var.a();
            a2VarA.c(b2Var.f1118q);
            s(getPlaceholderState(new b2(a2VarA)), false, false);
            a1.b.w(this, vVarHandleSetVolume, new p1(this, vVarHandleSetVolume));
        }
    }

    public final void verifyApplicationThread() {
        if (Thread.currentThread() == this.applicationLooper.getThread()) {
            return;
        }
        String name = Thread.currentThread().getName();
        String name2 = this.applicationLooper.getThread().getName();
        String str = e7.i0.f5136a;
        Locale locale = Locale.US;
        throw new IllegalStateException(a1.b.q("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\n"));
    }
}
