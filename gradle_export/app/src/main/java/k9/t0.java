package k9;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.PlaybackException;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.internal.measurement.b5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class t0 implements t {
    public Surface A;
    public SurfaceHolder B;
    public TextureView C;
    public m E;
    public MediaController F;
    public long G;
    public long H;
    public t3 I;
    public Bundle J;

    public final u f9438a;

    public final b3.g1 f9439b;

    public final d1 f9440c;

    public final Context f9441d;

    public final f4 f9442e;

    public final Bundle f9443f;

    public final m0 f9444g;

    public final s0 f9445h;

    public final e7.p f9446i;

    public final h7.b f9447j;

    public final u.f f9448k;
    public final SparseArray l;
    public final Handler m;

    public f4 f9449n;

    public q0 f9450o;

    public boolean f9451p;

    public PendingIntent f9453r;

    public fh.t0 f9454s;

    public fh.t0 f9455t;

    public fh.d2 f9456u;

    public fh.d2 f9457v;

    public androidx.media3.common.b1 f9459x;

    public androidx.media3.common.b1 f9460y;

    public androidx.media3.common.b1 f9461z;

    public t3 f9452q = t3.H;
    public e7.v D = e7.v.f5185c;

    public a4 f9458w = a4.f9211b;

    public t0(Context context, u uVar, f4 f4Var, Bundle bundle, Looper looper) {
        fh.d2 d2Var = fh.d2.E;
        this.f9454s = d2Var;
        this.f9455t = d2Var;
        this.f9456u = d2Var;
        this.f9457v = d2Var;
        androidx.media3.common.b1 b1Var = androidx.media3.common.b1.f1101b;
        this.f9459x = b1Var;
        this.f9460y = b1Var;
        this.f9461z = h(b1Var, b1Var);
        this.f9446i = new e7.p(looper, e7.b0.f5117a, new b0(this, 6));
        this.m = new Handler(looper);
        this.f9438a = uVar;
        ta.c0.w(context, "context must not be null");
        ta.c0.w(f4Var, "token must not be null");
        this.f9441d = context;
        this.f9439b = new b3.g1();
        this.f9440c = new d1(this);
        this.f9448k = new u.f(null);
        this.f9442e = f4Var;
        this.f9443f = bundle;
        this.f9444g = new IBinder.DeathRecipient() {
            @Override
            public final void binderDied() {
                u uVar2 = this.f9376a.f9438a;
                Objects.requireNonNull(uVar2);
                uVar2.b(new androidx.lifecycle.i0(uVar2, 26));
            }
        };
        this.f9445h = new s0(this);
        this.J = Bundle.EMPTY;
        this.f9450o = f4Var.f9293a.getType() != 0 ? new q0(this, bundle) : null;
        h7.b bVar = new h7.b();
        bVar.B = this;
        bVar.A = new Handler(looper, new e7.l(bVar, 2));
        this.f9447j = bVar;
        this.G = -9223372036854775807L;
        this.H = -9223372036854775807L;
        this.l = new SparseArray();
    }

    public static fh.d2 B(fh.d2 d2Var, List list, Bundle bundle, a4 a4Var, androidx.media3.common.b1 b1Var) {
        boolean z10;
        if (!list.isEmpty()) {
            return b.g(list, a4Var, b1Var);
        }
        boolean z11 = false;
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS")) {
            z10 = false;
        } else {
            if (b1Var.f1103a.a(6, 7)) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (!bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            if (!b1Var.f1103a.a(8, 9)) {
                z11 = true;
            }
        }
        return b.j(d2Var, z10, z11);
    }

    public static fh.d2 C(List list, List list2, a4 a4Var, androidx.media3.common.b1 b1Var, Bundle bundle) {
        if (list.isEmpty()) {
            list = b.k(list2, b1Var, bundle);
        }
        return b.g(list, a4Var, b1Var);
    }

    public static androidx.media3.common.b1 h(androidx.media3.common.b1 b1Var, androidx.media3.common.b1 b1Var2) {
        androidx.media3.common.b1 b1VarD = q3.d(b1Var, b1Var2);
        if (b1VarD.a(32)) {
            return b1VarD;
        }
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        qVar.e(b1VarD.f1103a);
        qVar.d(32);
        return new androidx.media3.common.b1(qVar.g());
    }

    public static androidx.media3.common.i2 i(ArrayList arrayList, ArrayList arrayList2) {
        fh.q0 q0Var = new fh.q0(4);
        q0Var.e(arrayList);
        fh.d2 d2VarG = q0Var.g();
        fh.q0 q0Var2 = new fh.q0(4);
        q0Var2.e(arrayList2);
        fh.d2 d2VarG2 = q0Var2.g();
        int size = arrayList.size();
        h1.l lVar = q3.f9407a;
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = i10;
        }
        return new androidx.media3.common.i2(d2VarG, d2VarG2, iArr);
    }

    public static int n(t3 t3Var) {
        return t3Var.f9497c.f9253a.f1183b;
    }

    public static t3 q(t3 t3Var, int i10, List list, long j9, long j10) {
        int size;
        androidx.media3.common.k2 k2Var = t3Var.f9504j;
        c4 c4Var = t3Var.f9497c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = 0;
        for (int i11 = 0; i11 < k2Var.getWindowCount(); i11++) {
            arrayList.add(k2Var.getWindow(i11, new androidx.media3.common.j2()));
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            androidx.media3.common.q0 q0Var = (androidx.media3.common.q0) list.get(i12);
            androidx.media3.common.j2 j2Var = new androidx.media3.common.j2();
            j2Var.b(0, q0Var, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, -1, -1, 0L);
            arrayList.add(i12 + i10, j2Var);
        }
        y(k2Var, arrayList, arrayList2);
        androidx.media3.common.i2 i2VarI = i(arrayList, arrayList2);
        if (t3Var.f9504j.isEmpty()) {
            size = 0;
        } else {
            int i13 = c4Var.f9253a.f1183b;
            size2 = i13 >= i10 ? list.size() + i13 : i13;
            int i14 = c4Var.f9253a.f1186e;
            size = i14 >= i10 ? list.size() + i14 : i14;
        }
        return s(t3Var, i2VarI, size2, size, j9, j10, 5);
    }

    public static t3 r(t3 t3Var, int i10, int i11, boolean z10, long j9, long j10) {
        int firstWindowIndex;
        int i12;
        int i13;
        t3 t3VarS;
        androidx.media3.common.k2 k2Var = t3Var.f9504j;
        boolean z11 = t3Var.f9503i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i14 = 0;
        for (int i15 = 0; i15 < k2Var.getWindowCount(); i15++) {
            if (i15 < i10 || i15 >= i11) {
                arrayList.add(k2Var.getWindow(i15, new androidx.media3.common.j2()));
            }
        }
        y(k2Var, arrayList, arrayList2);
        androidx.media3.common.i2 i2VarI = i(arrayList, arrayList2);
        androidx.media3.common.e1 e1Var = t3Var.f9497c.f9253a;
        int i16 = e1Var.f1183b;
        int i17 = e1Var.f1186e;
        androidx.media3.common.j2 j2Var = new androidx.media3.common.j2();
        boolean z12 = i16 >= i10 && i16 < i11;
        if (i2VarI.isEmpty()) {
            i17 = 0;
            firstWindowIndex = -1;
        } else {
            if (z12) {
                int i18 = t3Var.f9502h;
                int windowCount = k2Var.getWindowCount();
                firstWindowIndex = i16;
                while (true) {
                    if (i14 < windowCount) {
                        firstWindowIndex = k2Var.getNextWindowIndex(firstWindowIndex, i18, z11);
                        if (firstWindowIndex != -1) {
                            if (firstWindowIndex < i10 || firstWindowIndex >= i11) {
                                break;
                            }
                            i14++;
                        }
                    }
                    firstWindowIndex = -1;
                    break;
                }
                if (firstWindowIndex == -1) {
                    firstWindowIndex = i2VarI.getFirstWindowIndex(z11);
                } else if (firstWindowIndex >= i11) {
                    firstWindowIndex -= i11 - i10;
                }
                i12 = i2VarI.getWindow(firstWindowIndex, j2Var).f1294n;
            } else if (i16 >= i11) {
                firstWindowIndex = i16 - (i11 - i10);
                if (i17 != -1) {
                    for (int i19 = i10; i19 < i11; i19++) {
                        androidx.media3.common.j2 j2Var2 = new androidx.media3.common.j2();
                        k2Var.getWindow(i19, j2Var2);
                        i17 -= (j2Var2.f1295o - j2Var2.f1294n) + 1;
                    }
                }
                i12 = i17;
            } else {
                firstWindowIndex = i16;
            }
            i17 = i12;
        }
        if (z12) {
            if (firstWindowIndex == -1) {
                t3VarS = t(t3Var, i2VarI, c4.f9243k, c4.l, 4);
            } else if (z10) {
                t3VarS = s(t3Var, i2VarI, firstWindowIndex, i17, j9, j10, 4);
            } else {
                int i20 = firstWindowIndex;
                androidx.media3.common.j2 window = i2VarI.getWindow(i20, new androidx.media3.common.j2());
                long jW = e7.i0.W(window.l);
                long jW2 = e7.i0.W(window.m);
                i13 = 4;
                androidx.media3.common.e1 e1Var2 = new androidx.media3.common.e1(null, i20, window.f1285c, null, i17, jW, jW, -1, -1);
                t3VarS = t(t3Var, i2VarI, e1Var2, new c4(e1Var2, false, SystemClock.elapsedRealtime(), jW2, jW, q3.b(jW, jW2), 0L, -9223372036854775807L, jW2, jW), 4);
            }
            i13 = 4;
        } else {
            int i21 = firstWindowIndex;
            i13 = 4;
            t3VarS = s(t3Var, i2VarI, i21, i17, j9, j10, 4);
        }
        int i22 = t3VarS.A;
        return (i22 == 1 || i22 == i13 || i10 >= i11 || i11 != k2Var.getWindowCount() || i16 < i10) ? t3VarS : t3VarS.f(i13, null);
    }

    public static t3 s(t3 t3Var, androidx.media3.common.i2 i2Var, int i10, int i11, long j9, long j10, int i12) {
        androidx.media3.common.q0 q0Var = i2Var.getWindow(i10, new androidx.media3.common.j2()).f1285c;
        androidx.media3.common.e1 e1Var = t3Var.f9497c.f9253a;
        androidx.media3.common.e1 e1Var2 = new androidx.media3.common.e1(null, i10, q0Var, null, i11, j9, j10, e1Var.f1189h, e1Var.f1190i);
        c4 c4Var = t3Var.f9497c;
        return t(t3Var, i2Var, e1Var2, new c4(e1Var2, c4Var.f9254b, SystemClock.elapsedRealtime(), c4Var.f9256d, c4Var.f9257e, c4Var.f9258f, c4Var.f9259g, c4Var.f9260h, c4Var.f9261i, c4Var.f9262j), i12);
    }

    public static t3 t(t3 t3Var, androidx.media3.common.k2 k2Var, androidx.media3.common.e1 e1Var, c4 c4Var, int i10) {
        c4 c4Var2;
        androidx.media3.common.q2 q2Var;
        androidx.media3.common.s2 s2Var;
        boolean z10;
        PlaybackException playbackException = t3Var.f9495a;
        int i11 = t3Var.f9496b;
        c4 c4Var3 = t3Var.f9497c;
        androidx.media3.common.z0 z0Var = t3Var.f9501g;
        int i12 = t3Var.f9502h;
        boolean z11 = t3Var.f9503i;
        int i13 = t3Var.f9505k;
        androidx.media3.common.w2 w2Var = t3Var.l;
        androidx.media3.common.t0 t0Var = t3Var.m;
        float f3 = t3Var.f9506n;
        float f10 = t3Var.f9507o;
        int i14 = t3Var.f9508p;
        androidx.media3.common.d dVar = t3Var.f9509q;
        d7.c cVar = t3Var.f9510r;
        androidx.media3.common.l lVar = t3Var.f9511s;
        int i15 = t3Var.f9512t;
        boolean z12 = t3Var.f9513u;
        boolean z13 = t3Var.f9514v;
        int i16 = t3Var.f9515w;
        boolean z14 = t3Var.f9516x;
        boolean z15 = t3Var.f9517y;
        int i17 = t3Var.f9518z;
        int i18 = t3Var.A;
        androidx.media3.common.t0 t0Var2 = t3Var.B;
        long j9 = t3Var.C;
        long j10 = t3Var.D;
        long j11 = t3Var.E;
        androidx.media3.common.s2 s2Var2 = t3Var.F;
        androidx.media3.common.q2 q2Var2 = t3Var.G;
        androidx.media3.common.e1 e1Var2 = c4Var3.f9253a;
        if (!k2Var.isEmpty()) {
            c4Var2 = c4Var;
            q2Var = q2Var2;
            s2Var = s2Var2;
            if (c4Var2.f9253a.f1183b >= k2Var.getWindowCount()) {
                z10 = false;
            }
            ta.c0.A(z10);
            return new t3(playbackException, i11, c4Var2, e1Var2, e1Var, i10, z0Var, i12, z11, w2Var, k2Var, i13, t0Var, f3, f10, dVar, i14, cVar, lVar, i15, z12, z13, i16, i17, i18, z14, z15, t0Var2, j9, j10, j11, s2Var, q2Var);
        }
        c4Var2 = c4Var;
        q2Var = q2Var2;
        s2Var = s2Var2;
        z10 = true;
        ta.c0.A(z10);
        return new t3(playbackException, i11, c4Var2, e1Var2, e1Var, i10, z0Var, i12, z11, w2Var, k2Var, i13, t0Var, f3, f10, dVar, i14, cVar, lVar, i15, z12, z13, i16, i17, i18, z14, z15, t0Var2, j9, j10, j11, s2Var, q2Var);
    }

    public static void y(androidx.media3.common.k2 k2Var, ArrayList arrayList, ArrayList arrayList2) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            androidx.media3.common.j2 j2Var = (androidx.media3.common.j2) arrayList.get(i10);
            int i11 = j2Var.f1294n;
            int i12 = j2Var.f1295o;
            if (i11 == -1 || i12 == -1) {
                j2Var.f1294n = arrayList2.size();
                j2Var.f1295o = arrayList2.size();
                androidx.media3.common.h2 h2Var = new androidx.media3.common.h2();
                h2Var.j(null, null, i10, -9223372036854775807L, 0L, androidx.media3.common.c.f1128f, true);
                arrayList2.add(h2Var);
            } else {
                j2Var.f1294n = arrayList2.size();
                j2Var.f1295o = (i12 - i11) + arrayList2.size();
                while (i11 <= i12) {
                    androidx.media3.common.h2 h2Var2 = new androidx.media3.common.h2();
                    k2Var.getPeriod(i11, h2Var2);
                    h2Var2.f1233c = i10;
                    arrayList2.add(h2Var2);
                    i11++;
                }
            }
        }
    }

    public final void A(int i10, int i11, List list) {
        int windowCount = this.f9452q.f9504j.getWindowCount();
        if (i10 > windowCount) {
            return;
        }
        if (this.f9452q.f9504j.isEmpty()) {
            G(list, -1, -9223372036854775807L, false);
            return;
        }
        int iMin = Math.min(i11, windowCount);
        t3 t3VarR = r(q(this.f9452q, iMin, list, getCurrentPosition(), getContentPosition()), i10, iMin, true, getCurrentPosition(), getContentPosition());
        int i12 = this.f9452q.f9497c.f9253a.f1183b;
        boolean z10 = i12 >= i10 && i12 < iMin;
        J(t3VarR, 0, null, z10 ? 4 : null, z10 ? 3 : null);
    }

    public final void D(int i10, long j9) {
        int i11;
        int i12;
        t3 t3VarT;
        androidx.media3.common.k2 k2Var = this.f9452q.f9504j;
        if ((k2Var.isEmpty() || i10 < k2Var.getWindowCount()) && !isPlayingAd()) {
            t3 t3Var = this.f9452q;
            t3 t3VarF = t3Var.f(t3Var.A == 1 ? 1 : 2, t3Var.f9495a);
            i9.d dVarO = o(k2Var, i10, j9);
            if (dVarO == null) {
                long j10 = 0;
                long j11 = j9 == -9223372036854775807L ? 0L : j9;
                if (j9 != -9223372036854775807L) {
                    j10 = j9;
                }
                i11 = 1;
                i12 = 2;
                androidx.media3.common.e1 e1Var = new androidx.media3.common.e1(null, i10, null, null, i10, j11, j10, -1, -1);
                t3 t3Var2 = this.f9452q;
                androidx.media3.common.k2 k2Var2 = t3Var2.f9504j;
                boolean z10 = this.f9452q.f9497c.f9254b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                c4 c4Var = this.f9452q.f9497c;
                t3VarT = t(t3Var2, k2Var2, e1Var, new c4(e1Var, z10, jElapsedRealtime, c4Var.f9256d, j9 == -9223372036854775807L ? 0L : j9, 0, 0L, c4Var.f9260h, c4Var.f9261i, j9 == -9223372036854775807L ? 0L : j9), 1);
            } else {
                i11 = 1;
                i12 = 2;
                c4 c4Var2 = t3VarF.f9497c;
                int i13 = c4Var2.f9253a.f1186e;
                int i14 = dVarO.f7552a;
                androidx.media3.common.h2 h2Var = new androidx.media3.common.h2();
                k2Var.getPeriod(i13, h2Var);
                androidx.media3.common.h2 h2Var2 = new androidx.media3.common.h2();
                k2Var.getPeriod(i14, h2Var2);
                boolean z11 = i13 != i14;
                long j12 = dVarO.f7553b;
                long jH = e7.i0.H(getCurrentPosition()) - h2Var.f1235e;
                if (z11 || j12 != jH) {
                    ta.c0.A(c4Var2.f9253a.f1189h == -1);
                    androidx.media3.common.e1 e1Var2 = new androidx.media3.common.e1(null, h2Var.f1233c, c4Var2.f9253a.f1184c, null, i13, e7.i0.W(h2Var.f1235e + jH), e7.i0.W(h2Var.f1235e + jH), -1, -1);
                    k2Var.getPeriod(i14, h2Var2);
                    androidx.media3.common.j2 j2Var = new androidx.media3.common.j2();
                    k2Var.getWindow(h2Var2.f1233c, j2Var);
                    long jW = e7.i0.W(h2Var2.f1235e + j12);
                    androidx.media3.common.e1 e1Var3 = new androidx.media3.common.e1(null, h2Var2.f1233c, j2Var.f1285c, null, i14, jW, jW, -1, -1);
                    t3 t3VarH = t3VarF.h(e1Var2, e1Var3, 1);
                    if (z11 || j12 < jH) {
                        t3VarF = t3VarH.j(new c4(e1Var3, false, SystemClock.elapsedRealtime(), e7.i0.W(j2Var.m), jW, q3.b(jW, e7.i0.W(j2Var.m)), 0L, -9223372036854775807L, -9223372036854775807L, jW));
                    } else {
                        long jMax = Math.max(0L, e7.i0.H(t3VarH.f9497c.f9259g) - (j12 - jH));
                        long jW2 = e7.i0.W(h2Var2.f1235e + j12 + jMax);
                        t3VarF = t3VarH.j(new c4(e1Var3, false, SystemClock.elapsedRealtime(), e7.i0.W(j2Var.m), jW2, q3.b(jW2, e7.i0.W(j2Var.m)), e7.i0.W(jMax), -9223372036854775807L, -9223372036854775807L, jW2));
                    }
                }
                t3VarT = t3VarF;
            }
            c4 c4Var3 = t3VarT.f9497c;
            int i15 = (this.f9452q.f9504j.isEmpty() || c4Var3.f9253a.f1183b == this.f9452q.f9497c.f9253a.f1183b) ? 0 : i11;
            if (i15 == 0 && c4Var3.f9253a.f1187f == this.f9452q.f9497c.f9253a.f1187f) {
                return;
            }
            J(t3VarT, null, null, Integer.valueOf(i11), i15 != 0 ? Integer.valueOf(i12) : null);
        }
    }

    public final void E(long j9) {
        long currentPosition = getCurrentPosition() + j9;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        D(n(this.f9452q), Math.max(currentPosition, 0L));
    }

    public final void F(int i10, kh.v vVar) {
        vVar.a(new d.l(this, vVar, i10, 4), kh.p.A);
    }

    public final void G(List list, int i10, long j9, boolean z10) {
        int firstWindowIndex;
        boolean z11;
        long j10;
        androidx.media3.common.e1 e1Var;
        c4 c4Var;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (i11 < list.size()) {
            androidx.media3.common.q0 q0Var = (androidx.media3.common.q0) list.get(i11);
            fh.e1 e1Var2 = p.f9381a;
            androidx.media3.common.j2 j2Var = new androidx.media3.common.j2();
            int i12 = i11;
            j2Var.b(0, q0Var, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, i12, i12, 0L);
            arrayList.add(j2Var);
            androidx.media3.common.h2 h2Var = new androidx.media3.common.h2();
            h2Var.j(null, null, i12, -9223372036854775807L, 0L, androidx.media3.common.c.f1128f, true);
            arrayList2.add(h2Var);
            i11 = i12 + 1;
        }
        androidx.media3.common.i2 i2VarI = i(arrayList, arrayList2);
        fh.t0 t0Var = i2VarI.f1264a;
        if (!i2VarI.isEmpty() && i10 >= t0Var.size()) {
            throw new IllegalSeekPositionException();
        }
        if (z10) {
            firstWindowIndex = i2VarI.isEmpty() ? 0 : i2VarI.getFirstWindowIndex(this.f9452q.f9503i);
            z11 = false;
            j10 = -9223372036854775807L;
        } else if (i10 == -1) {
            androidx.media3.common.e1 e1Var3 = this.f9452q.f9497c.f9253a;
            int i13 = e1Var3.f1183b;
            long j11 = e1Var3.f1187f;
            if (i2VarI.isEmpty() || i13 < t0Var.size()) {
                z11 = false;
                j10 = j11;
                firstWindowIndex = i13;
            } else {
                firstWindowIndex = i2VarI.getFirstWindowIndex(this.f9452q.f9503i);
                j10 = -9223372036854775807L;
                z11 = true;
            }
        } else {
            firstWindowIndex = i10;
            z11 = false;
            j10 = j9;
        }
        i9.d dVarO = o(i2VarI, firstWindowIndex, j10);
        if (dVarO == null) {
            e1Var = new androidx.media3.common.e1(null, firstWindowIndex, null, null, firstWindowIndex, j10 == -9223372036854775807L ? 0L : j10, j10 == -9223372036854775807L ? 0L : j10, -1, -1);
            c4Var = new c4(e1Var, false, SystemClock.elapsedRealtime(), -9223372036854775807L, j10 == -9223372036854775807L ? 0L : j10, 0, 0L, -9223372036854775807L, -9223372036854775807L, j10 == -9223372036854775807L ? 0L : j10);
        } else {
            long j12 = dVarO.f7553b;
            e1Var = new androidx.media3.common.e1(null, firstWindowIndex, (androidx.media3.common.q0) list.get(firstWindowIndex), null, dVarO.f7552a, e7.i0.W(j12), e7.i0.W(j12), -1, -1);
            c4Var = new c4(e1Var, false, SystemClock.elapsedRealtime(), -9223372036854775807L, e7.i0.W(j12), 0, 0L, -9223372036854775807L, -9223372036854775807L, e7.i0.W(j12));
        }
        t3 t3VarT = t(this.f9452q, i2VarI, e1Var, c4Var, 4);
        int i14 = t3VarT.A;
        if (firstWindowIndex != -1 && i14 != 1) {
            i14 = (i2VarI.isEmpty() || z11) ? 4 : 2;
        }
        t3 t3VarF = t3VarT.f(i14, this.f9452q.f9495a);
        J(t3VarF, 0, null, !this.f9452q.f9504j.isEmpty() ? 4 : null, (this.f9452q.f9504j.isEmpty() && t3VarF.f9504j.isEmpty()) ? null : 3);
    }

    public final void H(boolean z10) {
        t3 t3Var = this.f9452q;
        int i10 = t3Var.f9518z;
        int i11 = i10 == 1 ? 0 : i10;
        if (t3Var.f9514v == z10 && i10 == i11) {
            return;
        }
        this.G = q3.c(t3Var, this.G, this.H, this.f9438a.f9524g);
        this.H = SystemClock.elapsedRealtime();
        J(this.f9452q.d(1, i11, z10), null, 1, null, null);
    }

    public final void I(Surface surface, int i10, int i11) {
        if (isConnected()) {
            f4 f4Var = this.f9449n;
            f4Var.getClass();
            if (f4Var.f9293a.f() >= 8) {
                l(new d0(this, surface, i10, i11, 0));
            } else {
                l(new ak.a(this, surface, 9));
            }
        }
    }

    public final void J(t3 t3Var, Integer num, Integer num2, Integer num3, Integer num4) {
        t3 t3Var2 = this.f9452q;
        this.f9452q = t3Var;
        v(t3Var2, t3Var, num, num2, num3, num4);
    }

    @Override
    public final a4 a() {
        return this.f9458w;
    }

    @Override
    public final void addListener(androidx.media3.common.d1 d1Var) {
        this.f9446i.a(d1Var);
    }

    @Override
    public final void addMediaItem(int i10, androidx.media3.common.q0 q0Var) {
        if (p(20)) {
            ta.c0.s(i10 >= 0);
            k(new n0(this, i10, q0Var, 1));
            f(i10, Collections.singletonList(q0Var));
        }
    }

    @Override
    public final void addMediaItem(androidx.media3.common.q0 q0Var) {
        if (p(20)) {
            k(new f0(this, q0Var, 1));
            f(this.f9452q.f9504j.getWindowCount(), Collections.singletonList(q0Var));
        }
    }

    @Override
    public final void addMediaItems(int i10, List list) {
        if (p(20)) {
            ta.c0.s(i10 >= 0);
            k(new androidx.media3.cast.a(this, i10, list));
            f(i10, list);
        }
    }

    @Override
    public final void addMediaItems(List list) {
        if (p(20)) {
            k(new e0(this, list, 1));
            f(this.f9452q.f9504j.getWindowCount(), list);
        }
    }

    @Override
    public final fh.t0 b() {
        return this.f9456u;
    }

    @Override
    public final kh.v c(final z3 z3Var) {
        Bundle bundle = Bundle.EMPTY;
        f4 f4Var = this.f9449n;
        f4Var.getClass();
        if (f4Var.f9293a.f() < 7) {
            final int i10 = 1;
            return m(z3Var, new p0(this, z3Var, i10) {
                public final int A;
                public final t0 B;
                public final z3 C;

                {
                    this.A = i10;
                    switch (i10) {
                    }
                    Bundle bundle2 = Bundle.EMPTY;
                    this.B = this;
                }

                @Override
                public final void b(m mVar, int i11) {
                    switch (this.A) {
                        case 0:
                            mVar.R(this.B.f9440c, i11, this.C.b(), Bundle.EMPTY, false);
                            break;
                        default:
                            Bundle bundle2 = Bundle.EMPTY;
                            mVar.r0(this.B.f9440c, i11, this.C.b());
                            break;
                    }
                }
            });
        }
        f4 f4Var2 = this.f9449n;
        f4Var2.getClass();
        if (f4Var2.f9293a.f() < 7) {
            return c(z3Var);
        }
        final int i11 = 0;
        return m(z3Var, new p0(this, z3Var, i11) {
            public final int A;
            public final t0 B;
            public final z3 C;

            {
                this.A = i11;
                switch (i11) {
                }
                Bundle bundle2 = Bundle.EMPTY;
                this.B = this;
            }

            @Override
            public final void b(m mVar, int i12) {
                switch (this.A) {
                    case 0:
                        mVar.R(this.B.f9440c, i12, this.C.b(), Bundle.EMPTY, false);
                        break;
                    default:
                        Bundle bundle2 = Bundle.EMPTY;
                        mVar.r0(this.B.f9440c, i12, this.C.b());
                        break;
                }
            }
        });
    }

    @Override
    public final void clearMediaItems() {
        if (p(20)) {
            k(new b0(this, 5));
            z(0, Integer.MAX_VALUE);
        }
    }

    @Override
    public final void clearVideoSurface() {
        if (p(27)) {
            g();
            I(null, 0, 0);
            x(0, 0);
        }
    }

    @Override
    public final void clearVideoSurface(Surface surface) {
        if (p(27) && surface != null && this.A == surface) {
            clearVideoSurface();
        }
    }

    @Override
    public final void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        if (p(27) && surfaceHolder != null && this.B == surfaceHolder) {
            clearVideoSurface();
        }
    }

    @Override
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        if (p(27)) {
            clearVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override
    public final void clearVideoTextureView(TextureView textureView) {
        if (p(27) && textureView != null && this.C == textureView) {
            clearVideoSurface();
        }
    }

    @Override
    public final void d() {
        m mVar;
        f4 f4Var = this.f9442e;
        e4 e4Var = f4Var.f9293a;
        e4 e4Var2 = f4Var.f9293a;
        int type = e4Var.getType();
        u uVar = this.f9438a;
        Context context = this.f9441d;
        Bundle bundle = this.f9443f;
        if (type == 0) {
            this.f9450o = null;
            Object objC = e4Var2.c();
            objC.getClass();
            IBinder iBinder = (IBinder) objC;
            int i10 = p3.f9382k;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof m)) {
                l lVar = new l();
                lVar.f9370e = iBinder;
                mVar = lVar;
            } else {
                mVar = (m) iInterfaceQueryLocalInterface;
            }
            int iF = this.f9439b.f();
            String packageName = context.getPackageName();
            int iMyPid = Process.myPid();
            uVar.getClass();
            try {
                mVar.q0(this.f9440c, iF, new g(packageName, iMyPid, bundle).b());
                return;
            } catch (RemoteException e3) {
                e7.a.n("MCImplBase", "Failed to call connection request.", e3);
            }
        } else {
            this.f9450o = new q0(this, bundle);
            Intent intent = new Intent("androidx.media3.session.MediaSessionService");
            intent.setClassName(e4Var2.j(), e4Var2.d());
            try {
                if (context.bindService(intent, this.f9450o, 4097)) {
                    return;
                }
                e7.a.m("MCImplBase", "bind to " + f4Var + " failed");
            } catch (SecurityException e10) {
                e7.a.n("MCImplBase", "bind to " + f4Var + " not allowed", e10);
            }
        }
        Objects.requireNonNull(uVar);
        uVar.b(new androidx.lifecycle.i0(uVar, 26));
    }

    @Override
    public final void decreaseDeviceVolume() {
        if (p(26)) {
            k(new b0(this, 17));
            t3 t3Var = this.f9452q;
            int i10 = t3Var.f9512t - 1;
            if (i10 >= t3Var.f9511s.f1319b) {
                this.f9452q = t3Var.c(i10, t3Var.f9513u);
                w wVar = new w(this, i10, 11);
                e7.p pVar = this.f9446i;
                pVar.c(30, wVar);
                pVar.b();
            }
        }
    }

    @Override
    public final void decreaseDeviceVolume(int i10) {
        if (p(34)) {
            k(new w(this, i10, 1));
            t3 t3Var = this.f9452q;
            int i11 = t3Var.f9512t - 1;
            if (i11 >= t3Var.f9511s.f1319b) {
                this.f9452q = t3Var.c(i11, t3Var.f9513u);
                w wVar = new w(this, i11, 2);
                e7.p pVar = this.f9446i;
                pVar.c(30, wVar);
                pVar.b();
            }
        }
    }

    @Override
    public final Bundle e() {
        return this.f9443f;
    }

    public final void f(int i10, List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f9452q.f9504j.isEmpty()) {
            G(list, -1, -9223372036854775807L, false);
        } else {
            J(q(this.f9452q, Math.min(i10, this.f9452q.f9504j.getWindowCount()), list, getCurrentPosition(), getContentPosition()), 0, null, null, this.f9452q.f9504j.isEmpty() ? 3 : null);
        }
    }

    public final void g() {
        TextureView textureView = this.C;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(null);
            this.C = null;
        }
        SurfaceHolder surfaceHolder = this.B;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f9445h);
            this.B = null;
        }
        if (this.A != null) {
            this.A = null;
        }
    }

    @Override
    public final androidx.media3.common.d getAudioAttributes() {
        return this.f9452q.f9509q;
    }

    @Override
    public final int getAudioSessionId() {
        return this.f9452q.f9508p;
    }

    @Override
    public final androidx.media3.common.b1 getAvailableCommands() {
        return this.f9461z;
    }

    @Override
    public final int getBufferedPercentage() {
        return this.f9452q.f9497c.f9258f;
    }

    @Override
    public final long getBufferedPosition() {
        return this.f9452q.f9497c.f9257e;
    }

    @Override
    public final long getContentBufferedPosition() {
        return this.f9452q.f9497c.f9262j;
    }

    @Override
    public final long getContentDuration() {
        return this.f9452q.f9497c.f9261i;
    }

    @Override
    public final long getContentPosition() {
        c4 c4Var = this.f9452q.f9497c;
        return !c4Var.f9254b ? getCurrentPosition() : c4Var.f9253a.f1188g;
    }

    @Override
    public final int getCurrentAdGroupIndex() {
        return this.f9452q.f9497c.f9253a.f1189h;
    }

    @Override
    public final int getCurrentAdIndexInAdGroup() {
        return this.f9452q.f9497c.f9253a.f1190i;
    }

    @Override
    public final d7.c getCurrentCues() {
        return this.f9452q.f9510r;
    }

    @Override
    public final long getCurrentLiveOffset() {
        return this.f9452q.f9497c.f9260h;
    }

    @Override
    public final int getCurrentMediaItemIndex() {
        return n(this.f9452q);
    }

    @Override
    public final int getCurrentPeriodIndex() {
        return this.f9452q.f9497c.f9253a.f1186e;
    }

    @Override
    public final long getCurrentPosition() {
        long jC = q3.c(this.f9452q, this.G, this.H, this.f9438a.f9524g);
        this.G = jC;
        return jC;
    }

    @Override
    public final androidx.media3.common.k2 getCurrentTimeline() {
        return this.f9452q.f9504j;
    }

    @Override
    public final androidx.media3.common.s2 getCurrentTracks() {
        return this.f9452q.F;
    }

    @Override
    public final androidx.media3.common.l getDeviceInfo() {
        return this.f9452q.f9511s;
    }

    @Override
    public final int getDeviceVolume() {
        return this.f9452q.f9512t;
    }

    @Override
    public final long getDuration() {
        return this.f9452q.f9497c.f9256d;
    }

    @Override
    public final long getMaxSeekToPreviousPosition() {
        return this.f9452q.E;
    }

    @Override
    public final androidx.media3.common.t0 getMediaMetadata() {
        return this.f9452q.B;
    }

    @Override
    public final int getNextMediaItemIndex() {
        if (this.f9452q.f9504j.isEmpty()) {
            return -1;
        }
        t3 t3Var = this.f9452q;
        androidx.media3.common.k2 k2Var = t3Var.f9504j;
        int iN = n(t3Var);
        t3 t3Var2 = this.f9452q;
        int i10 = t3Var2.f9502h;
        if (i10 == 1) {
            i10 = 0;
        }
        return k2Var.getNextWindowIndex(iN, i10, t3Var2.f9503i);
    }

    @Override
    public final boolean getPlayWhenReady() {
        return this.f9452q.f9514v;
    }

    @Override
    public final androidx.media3.common.z0 getPlaybackParameters() {
        return this.f9452q.f9501g;
    }

    @Override
    public final int getPlaybackState() {
        return this.f9452q.A;
    }

    @Override
    public final int getPlaybackSuppressionReason() {
        return this.f9452q.f9518z;
    }

    @Override
    public final PlaybackException getPlayerError() {
        return this.f9452q.f9495a;
    }

    @Override
    public final androidx.media3.common.t0 getPlaylistMetadata() {
        return this.f9452q.m;
    }

    @Override
    public final int getPreviousMediaItemIndex() {
        if (this.f9452q.f9504j.isEmpty()) {
            return -1;
        }
        t3 t3Var = this.f9452q;
        androidx.media3.common.k2 k2Var = t3Var.f9504j;
        int iN = n(t3Var);
        t3 t3Var2 = this.f9452q;
        int i10 = t3Var2.f9502h;
        if (i10 == 1) {
            i10 = 0;
        }
        return k2Var.getPreviousWindowIndex(iN, i10, t3Var2.f9503i);
    }

    @Override
    public final int getRepeatMode() {
        return this.f9452q.f9502h;
    }

    @Override
    public final long getSeekBackIncrement() {
        return this.f9452q.C;
    }

    @Override
    public final long getSeekForwardIncrement() {
        return this.f9452q.D;
    }

    @Override
    public final boolean getShuffleModeEnabled() {
        return this.f9452q.f9503i;
    }

    @Override
    public final e7.v getSurfaceSize() {
        return this.D;
    }

    @Override
    public final long getTotalBufferedDuration() {
        return this.f9452q.f9497c.f9259g;
    }

    @Override
    public final androidx.media3.common.q2 getTrackSelectionParameters() {
        return this.f9452q.G;
    }

    @Override
    public final androidx.media3.common.w2 getVideoSize() {
        return this.f9452q.l;
    }

    @Override
    public final float getVolume() {
        return this.f9452q.f9506n;
    }

    @Override
    public final boolean hasNextMediaItem() {
        return getNextMediaItemIndex() != -1;
    }

    @Override
    public final boolean hasPreviousMediaItem() {
        return getPreviousMediaItemIndex() != -1;
    }

    @Override
    public final void increaseDeviceVolume() {
        if (p(26)) {
            k(new b0(this, 10));
            t3 t3Var = this.f9452q;
            int i10 = t3Var.f9512t + 1;
            int i11 = t3Var.f9511s.f1320c;
            if (i11 == 0 || i10 <= i11) {
                this.f9452q = t3Var.c(i10, t3Var.f9513u);
                w wVar = new w(this, i10, 5);
                e7.p pVar = this.f9446i;
                pVar.c(30, wVar);
                pVar.b();
            }
        }
    }

    @Override
    public final void increaseDeviceVolume(int i10) {
        if (p(34)) {
            k(new w(this, i10, 6));
            t3 t3Var = this.f9452q;
            int i11 = t3Var.f9512t + 1;
            int i12 = t3Var.f9511s.f1320c;
            if (i12 == 0 || i11 <= i12) {
                this.f9452q = t3Var.c(i11, t3Var.f9513u);
                w wVar = new w(this, i11, 7);
                e7.p pVar = this.f9446i;
                pVar.c(30, wVar);
                pVar.b();
            }
        }
    }

    @Override
    public final boolean isConnected() {
        return this.E != null;
    }

    @Override
    public final boolean isDeviceMuted() {
        return this.f9452q.f9513u;
    }

    @Override
    public final boolean isLoading() {
        return this.f9452q.f9517y;
    }

    @Override
    public final boolean isPlaying() {
        return this.f9452q.f9516x;
    }

    @Override
    public final boolean isPlayingAd() {
        return this.f9452q.f9497c.f9254b;
    }

    public final kh.v j(m mVar, p0 p0Var, boolean z10) {
        if (mVar == null) {
            return b5.x(new d4(-4));
        }
        MediaController mediaController = this.F;
        if (mediaController != null) {
            mediaController.getTransportControls().sendCustomAction("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST", (Bundle) null);
        }
        d4 d4Var = new d4(1);
        b3.g1 g1Var = this.f9439b;
        y3 y3VarC = g1Var.c(d4Var);
        int i10 = y3VarC.H;
        u.f fVar = this.f9448k;
        if (z10) {
            if (fVar.isEmpty()) {
                this.I = this.f9452q;
            }
            fVar.add(Integer.valueOf(i10));
        }
        try {
            p0Var.b(mVar, i10);
            return y3VarC;
        } catch (RemoteException e3) {
            e7.a.n("MCImplBase", "Cannot connect to the service or the session is gone", e3);
            fVar.remove(Integer.valueOf(i10));
            g1Var.j(i10, new d4(-100));
            return y3VarC;
        }
    }

    public final void k(p0 p0Var) {
        h7.b bVar = this.f9447j;
        Handler handler = (Handler) bVar.A;
        if (((t0) bVar.B).E != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        j(this.E, p0Var, true);
    }

    public final void l(p0 p0Var) {
        h7.b bVar = this.f9447j;
        Handler handler = (Handler) bVar.A;
        if (((t0) bVar.B).E != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        kh.v vVarJ = j(this.E, p0Var, true);
        try {
            p.v(vVarJ);
        } catch (ExecutionException e3) {
            throw new IllegalStateException(e3);
        } catch (TimeoutException e10) {
            if (vVarJ instanceof y3) {
                int i10 = ((y3) vVarJ).H;
                this.f9448k.remove(Integer.valueOf(i10));
                this.f9439b.j(i10, new d4(-1));
            }
            e7.a.n("MCImplBase", "Synchronous command takes too long on the session side.", e10);
        }
    }

    public final kh.v m(z3 z3Var, p0 p0Var) {
        m mVar;
        int i10 = z3Var.f9578a;
        String str = z3Var.f9579b;
        ta.c0.s(i10 == 0);
        if (this.f9458w.f9213a.contains(z3Var) || b.n(str)) {
            mVar = this.E;
        } else {
            e7.a.m("MCImplBase", "Controller isn't allowed to call custom session command:".concat(str));
            mVar = null;
        }
        return j(mVar, p0Var, false);
    }

    @Override
    public final void moveMediaItem(int i10, int i11) {
        if (p(20)) {
            ta.c0.s(i10 >= 0 && i11 >= 0);
            k(new g0(this, i10, i11, 2));
            u(i10, i10 + 1, i11);
        }
    }

    @Override
    public final void moveMediaItems(final int i10, final int i11, final int i12) {
        if (p(20)) {
            ta.c0.s(i10 >= 0 && i10 <= i11 && i12 >= 0);
            k(new p0() {
                @Override
                public final void b(m mVar, int i13) {
                    mVar.N1(this.A.f9440c, i13, i10, i11, i12);
                }
            });
            u(i10, i11, i12);
        }
    }

    @Override
    public final void mute() {
        if (p(24)) {
            k(new b0(this, 14));
            t3 t3Var = this.f9452q;
            if (t3Var.f9506n != 0.0f) {
                this.f9452q = t3Var.p(0.0f);
                j7.e eVar = new j7.e(13);
                e7.p pVar = this.f9446i;
                pVar.c(22, eVar);
                pVar.b();
            }
        }
    }

    public final i9.d o(androidx.media3.common.k2 k2Var, int i10, long j9) {
        if (k2Var.isEmpty()) {
            return null;
        }
        androidx.media3.common.j2 j2Var = new androidx.media3.common.j2();
        androidx.media3.common.h2 h2Var = new androidx.media3.common.h2();
        if (i10 == -1 || i10 >= k2Var.getWindowCount()) {
            i10 = k2Var.getFirstWindowIndex(this.f9452q.f9503i);
            j9 = e7.i0.W(k2Var.getWindow(i10, j2Var).l);
        }
        long jH = e7.i0.H(j9);
        ta.c0.u(i10, k2Var.getWindowCount());
        k2Var.getWindow(i10, j2Var);
        if (jH == -9223372036854775807L) {
            jH = j2Var.l;
            if (jH == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = j2Var.f1294n;
        k2Var.getPeriod(i11, h2Var);
        while (i11 < j2Var.f1295o && h2Var.f1235e != jH) {
            int i12 = i11 + 1;
            if (k2Var.getPeriod(i12, h2Var).f1235e > jH) {
                break;
            }
            i11 = i12;
        }
        k2Var.getPeriod(i11, h2Var);
        return new i9.d(i11, jH - h2Var.f1235e, false);
    }

    public final boolean p(int i10) {
        if (this.f9461z.a(i10)) {
            return true;
        }
        a1.b.y("Controller isn't allowed to call command= ", i10, "MCImplBase");
        return false;
    }

    @Override
    public final void pause() {
        if (p(1)) {
            k(new b0(this, 9));
            H(false);
        }
    }

    @Override
    public final void play() {
        if (!p(1)) {
            e7.a.m("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        } else {
            k(new b0(this, 11));
            H(true);
        }
    }

    @Override
    public final void prepare() {
        if (p(2)) {
            k(new b0(this, 13));
            t3 t3Var = this.f9452q;
            if (t3Var.A == 1) {
                J(t3Var.f(t3Var.f9504j.isEmpty() ? 4 : 2, null), null, null, null, null);
            }
        }
    }

    @Override
    public final void release() {
        m mVar = this.E;
        if (this.f9451p) {
            return;
        }
        this.f9451p = true;
        this.f9449n = null;
        this.m.removeCallbacksAndMessages(null);
        g();
        h7.b bVar = this.f9447j;
        Handler handler = (Handler) bVar.A;
        if (handler.hasMessages(1)) {
            try {
                t0 t0Var = (t0) bVar.B;
                t0Var.E.L0(t0Var.f9440c);
            } catch (RemoteException unused) {
                e7.a.m("MCImplBase", "Error in sending flushCommandQueue");
            }
        }
        handler.removeCallbacksAndMessages(null);
        this.E = null;
        if (mVar != null) {
            int iF = this.f9439b.f();
            try {
                mVar.asBinder().unlinkToDeath(this.f9444g, 0);
                mVar.Q1(this.f9440c, iF);
            } catch (RemoteException unused2) {
            }
        }
        this.f9446i.d();
        b3.g1 g1Var = this.f9439b;
        z zVar = new z(this, 0);
        synchronized (g1Var.f2030d) {
            try {
                Handler handlerL = e7.i0.l(null);
                g1Var.f2033g = handlerL;
                g1Var.f2032f = zVar;
                if (((u.e) g1Var.f2031e).isEmpty()) {
                    g1Var.h();
                } else {
                    handlerL.postDelayed(new androidx.lifecycle.i0(g1Var, 28), NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void removeListener(androidx.media3.common.d1 d1Var) {
        this.f9446i.e(d1Var);
    }

    @Override
    public final void removeMediaItem(int i10) {
        if (p(20)) {
            ta.c0.s(i10 >= 0);
            k(new w(this, i10, 4));
            z(i10, i10 + 1);
        }
    }

    @Override
    public final void removeMediaItems(int i10, int i11) {
        if (p(20)) {
            ta.c0.s(i10 >= 0 && i11 >= i10);
            k(new g0(this, i10, i11, 0));
            z(i10, i11);
        }
    }

    @Override
    public final void replaceMediaItem(int i10, androidx.media3.common.q0 q0Var) {
        if (p(20)) {
            ta.c0.s(i10 >= 0);
            k(new n0(this, i10, q0Var, 0));
            A(i10, i10 + 1, fh.t0.s(q0Var));
        }
    }

    @Override
    public final void replaceMediaItems(int i10, int i11, List list) {
        if (p(20)) {
            ta.c0.s(i10 >= 0 && i10 <= i11);
            k(new d0(this, list, i10, i11, 1));
            A(i10, i11, list);
        }
    }

    @Override
    public final void seekBack() {
        if (p(11)) {
            k(new b0(this, 7));
            E(-this.f9452q.C);
        }
    }

    @Override
    public final void seekForward() {
        if (p(12)) {
            k(new b0(this, 2));
            E(this.f9452q.D);
        }
    }

    @Override
    public final void seekTo(int i10, long j9) {
        if (p(10)) {
            ta.c0.s(i10 >= 0);
            k(new j7.d(j9, i10, this));
            D(i10, j9);
        }
    }

    @Override
    public final void seekTo(long j9) {
        if (p(5)) {
            k(new ee.e(this, j9));
            D(n(this.f9452q), j9);
        }
    }

    @Override
    public final void seekToDefaultPosition() {
        if (p(4)) {
            k(new b0(this, 3));
            D(n(this.f9452q), -9223372036854775807L);
        }
    }

    @Override
    public final void seekToDefaultPosition(int i10) {
        if (p(10)) {
            ta.c0.s(i10 >= 0);
            k(new w(this, i10, 0));
            D(i10, -9223372036854775807L);
        }
    }

    @Override
    public final void seekToNext() {
        if (p(9)) {
            k(new b0(this, 15));
            androidx.media3.common.k2 k2Var = this.f9452q.f9504j;
            if (k2Var.isEmpty() || isPlayingAd()) {
                return;
            }
            if (hasNextMediaItem()) {
                D(getNextMediaItemIndex(), -9223372036854775807L);
                return;
            }
            androidx.media3.common.j2 window = k2Var.getWindow(n(this.f9452q), new androidx.media3.common.j2());
            if (window.f1291i && window.a()) {
                D(n(this.f9452q), -9223372036854775807L);
            }
        }
    }

    @Override
    public final void seekToNextMediaItem() {
        if (p(8)) {
            k(new b0(this, 16));
            if (getNextMediaItemIndex() != -1) {
                D(getNextMediaItemIndex(), -9223372036854775807L);
            }
        }
    }

    @Override
    public final void seekToPrevious() {
        if (p(7)) {
            k(new b0(this, 4));
            androidx.media3.common.k2 k2Var = this.f9452q.f9504j;
            if (k2Var.isEmpty() || isPlayingAd()) {
                return;
            }
            boolean zHasPreviousMediaItem = hasPreviousMediaItem();
            androidx.media3.common.j2 window = k2Var.getWindow(n(this.f9452q), new androidx.media3.common.j2());
            if (window.f1291i && window.a()) {
                if (zHasPreviousMediaItem) {
                    D(getPreviousMediaItemIndex(), -9223372036854775807L);
                }
            } else if (!zHasPreviousMediaItem || getCurrentPosition() > this.f9452q.E) {
                D(n(this.f9452q), 0L);
            } else {
                D(getPreviousMediaItemIndex(), -9223372036854775807L);
            }
        }
    }

    @Override
    public final void seekToPreviousMediaItem() {
        if (p(6)) {
            k(new b0(this, 8));
            if (getPreviousMediaItemIndex() != -1) {
                D(getPreviousMediaItemIndex(), -9223372036854775807L);
            }
        }
    }

    @Override
    public final void setAudioAttributes(androidx.media3.common.d dVar, boolean z10) {
        if (p(35)) {
            k(new l0(2, this, dVar, z10));
            if (this.f9452q.f9509q.equals(dVar)) {
                return;
            }
            this.f9452q = this.f9452q.a(dVar);
            i7.r rVar = new i7.r(dVar, 1);
            e7.p pVar = this.f9446i;
            pVar.c(20, rVar);
            pVar.b();
        }
    }

    @Override
    public final void setDeviceMuted(boolean z10) {
        if (p(26)) {
            k(new j0(this, z10, 2));
            t3 t3Var = this.f9452q;
            if (t3Var.f9513u != z10) {
                this.f9452q = t3Var.c(t3Var.f9512t, z10);
                j0 j0Var = new j0(this, z10, 3);
                e7.p pVar = this.f9446i;
                pVar.c(30, j0Var);
                pVar.b();
            }
        }
    }

    @Override
    public final void setDeviceMuted(final boolean z10, final int i10) {
        if (p(34)) {
            k(new p0() {
                @Override
                public final void b(m mVar, int i11) {
                    mVar.B(this.A.f9440c, i11, z10, i10);
                }
            });
            t3 t3Var = this.f9452q;
            if (t3Var.f9513u != z10) {
                this.f9452q = t3Var.c(t3Var.f9512t, z10);
                j0 j0Var = new j0(this, z10, 0);
                e7.p pVar = this.f9446i;
                pVar.c(30, j0Var);
                pVar.b();
            }
        }
    }

    @Override
    public final void setDeviceVolume(int i10) {
        if (p(25)) {
            k(new w(this, i10, 9));
            t3 t3Var = this.f9452q;
            androidx.media3.common.l lVar = t3Var.f9511s;
            if (t3Var.f9512t == i10 || lVar.f1319b > i10) {
                return;
            }
            int i11 = lVar.f1320c;
            if (i11 == 0 || i10 <= i11) {
                this.f9452q = t3Var.c(i10, t3Var.f9513u);
                w wVar = new w(this, i10, 10);
                e7.p pVar = this.f9446i;
                pVar.c(30, wVar);
                pVar.b();
            }
        }
    }

    @Override
    public final void setDeviceVolume(int i10, int i11) {
        if (p(33)) {
            k(new g0(this, i10, i11, 1));
            t3 t3Var = this.f9452q;
            androidx.media3.common.l lVar = t3Var.f9511s;
            if (t3Var.f9512t == i10 || lVar.f1319b > i10) {
                return;
            }
            int i12 = lVar.f1320c;
            if (i12 == 0 || i10 <= i12) {
                this.f9452q = t3Var.c(i10, t3Var.f9513u);
                w wVar = new w(this, i10, 3);
                e7.p pVar = this.f9446i;
                pVar.c(30, wVar);
                pVar.b();
            }
        }
    }

    @Override
    public final void setMediaItem(androidx.media3.common.q0 q0Var) {
        if (p(31)) {
            k(new f0(this, q0Var, 0));
            G(Collections.singletonList(q0Var), -1, -9223372036854775807L, true);
        }
    }

    @Override
    public final void setMediaItem(androidx.media3.common.q0 q0Var, long j9) {
        if (p(31)) {
            k(new de.g(this, q0Var, j9));
            G(Collections.singletonList(q0Var), -1, j9, false);
        }
    }

    @Override
    public final void setMediaItem(androidx.media3.common.q0 q0Var, boolean z10) {
        if (p(31)) {
            k(new l0(1, this, q0Var, z10));
            G(Collections.singletonList(q0Var), -1, -9223372036854775807L, z10);
        }
    }

    @Override
    public final void setMediaItems(List list) {
        if (p(20)) {
            k(new e0(this, list, 0));
            G(list, -1, -9223372036854775807L, true);
        }
    }

    @Override
    public final void setMediaItems(final List list, final int i10, final long j9) {
        if (p(20)) {
            k(new p0() {
                @Override
                public final void b(m mVar, int i11) {
                    d1 d1Var = this.A.f9440c;
                    fh.q0 q0VarM = fh.t0.m();
                    int i12 = 0;
                    while (true) {
                        List list2 = list;
                        if (i12 >= list2.size()) {
                            mVar.j0(d1Var, i11, new androidx.media3.common.g(q0VarM.g()), i10, j9);
                            return;
                        } else {
                            q0VarM.c(((androidx.media3.common.q0) list2.get(i12)).c(true));
                            i12++;
                        }
                    }
                }
            });
            G(list, i10, j9, false);
        }
    }

    @Override
    public final void setMediaItems(List list, boolean z10) {
        if (p(20)) {
            k(new l0(0, this, list, z10));
            G(list, -1, -9223372036854775807L, z10);
        }
    }

    @Override
    public final void setPlayWhenReady(boolean z10) {
        if (p(1)) {
            k(new j0(this, z10, 4));
            H(z10);
        } else if (z10) {
            e7.a.m("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        }
    }

    @Override
    public final void setPlaybackParameters(androidx.media3.common.z0 z0Var) {
        if (p(13)) {
            k(new ak.a(this, z0Var, 8));
            if (this.f9452q.f9501g.equals(z0Var)) {
                return;
            }
            this.f9452q = this.f9452q.e(z0Var);
            c0 c0Var = new c0(z0Var, 0);
            e7.p pVar = this.f9446i;
            pVar.c(12, c0Var);
            pVar.b();
        }
    }

    @Override
    public final void setPlaybackSpeed(float f3) {
        if (p(13)) {
            k(new h0(this, f3, 0));
            androidx.media3.common.z0 z0Var = this.f9452q.f9501g;
            if (z0Var.f1688a != f3) {
                androidx.media3.common.z0 z0Var2 = new androidx.media3.common.z0(f3, z0Var.f1689b);
                this.f9452q = this.f9452q.e(z0Var2);
                c0 c0Var = new c0(z0Var2, 1);
                e7.p pVar = this.f9446i;
                pVar.c(12, c0Var);
                pVar.b();
            }
        }
    }

    @Override
    public final void setPlaylistMetadata(androidx.media3.common.t0 t0Var) {
        if (p(19)) {
            k(new ak.a(this, t0Var, 10));
            if (this.f9452q.m.equals(t0Var)) {
                return;
            }
            this.f9452q = this.f9452q.g(t0Var);
            i7.n nVar = new i7.n(t0Var, 1);
            e7.p pVar = this.f9446i;
            pVar.c(15, nVar);
            pVar.b();
        }
    }

    @Override
    public final void setRepeatMode(int i10) {
        if (p(15)) {
            k(new w(this, i10, 8));
            t3 t3Var = this.f9452q;
            if (t3Var.f9502h != i10) {
                this.f9452q = t3Var.i(i10);
                androidx.media3.cast.n nVar = new androidx.media3.cast.n(i10, 6);
                e7.p pVar = this.f9446i;
                pVar.c(8, nVar);
                pVar.b();
            }
        }
    }

    @Override
    public final void setShuffleModeEnabled(boolean z10) {
        if (p(14)) {
            k(new j0(this, z10, 1));
            t3 t3Var = this.f9452q;
            if (t3Var.f9503i != z10) {
                this.f9452q = t3Var.k(z10);
                androidx.media3.cast.o oVar = new androidx.media3.cast.o(3, z10);
                e7.p pVar = this.f9446i;
                pVar.c(9, oVar);
                pVar.b();
            }
        }
    }

    @Override
    public final void setTrackSelectionParameters(androidx.media3.common.q2 q2Var) {
        if (p(29)) {
            k(new ak.a(this, q2Var, 11));
            t3 t3Var = this.f9452q;
            if (q2Var != t3Var.G) {
                this.f9452q = t3Var.o(q2Var);
                i7.s sVar = new i7.s(q2Var, 1);
                e7.p pVar = this.f9446i;
                pVar.c(19, sVar);
                pVar.b();
            }
        }
    }

    @Override
    public final void setVideoSurface(Surface surface) {
        if (p(27)) {
            g();
            this.A = surface;
            int i10 = surface == null ? 0 : -1;
            I(surface, i10, i10);
            x(i10, i10);
        }
    }

    @Override
    public final void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        if (p(27)) {
            if (surfaceHolder == null) {
                clearVideoSurface();
                return;
            }
            if (this.B == surfaceHolder) {
                return;
            }
            g();
            this.B = surfaceHolder;
            surfaceHolder.addCallback(this.f9445h);
            Surface surface = surfaceHolder.getSurface();
            if (surface == null || !surface.isValid()) {
                this.A = null;
                I(null, 0, 0);
                x(0, 0);
            } else {
                this.A = surface;
                Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                I(surface, surfaceFrame.width(), surfaceFrame.height());
                x(surfaceFrame.width(), surfaceFrame.height());
            }
        }
    }

    @Override
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        if (p(27)) {
            setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override
    public final void setVideoTextureView(TextureView textureView) {
        if (p(27)) {
            if (textureView == null) {
                clearVideoSurface();
                return;
            }
            if (this.C == textureView) {
                return;
            }
            g();
            this.C = textureView;
            textureView.setSurfaceTextureListener(this.f9445h);
            SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
            if (surfaceTexture == null) {
                I(null, 0, 0);
                x(0, 0);
            } else {
                Surface surface = new Surface(surfaceTexture);
                this.A = surface;
                I(surface, textureView.getWidth(), textureView.getHeight());
                x(textureView.getWidth(), textureView.getHeight());
            }
        }
    }

    @Override
    public final void setVolume(float f3) {
        if (p(24)) {
            k(new h0(this, f3, 1));
            t3 t3Var = this.f9452q;
            if (t3Var.f9506n != f3) {
                this.f9452q = t3Var.p(f3);
                androidx.media3.cast.q qVar = new androidx.media3.cast.q(f3, 2);
                e7.p pVar = this.f9446i;
                pVar.c(22, qVar);
                pVar.b();
            }
        }
    }

    @Override
    public final void stop() {
        if (p(3)) {
            k(new b0(this, 12));
            t3 t3Var = this.f9452q;
            c4 c4Var = this.f9452q.f9497c;
            androidx.media3.common.e1 e1Var = c4Var.f9253a;
            boolean z10 = c4Var.f9254b;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c4 c4Var2 = this.f9452q.f9497c;
            long j9 = c4Var2.f9256d;
            long j10 = c4Var2.f9253a.f1187f;
            int iB = q3.b(j10, j9);
            c4 c4Var3 = this.f9452q.f9497c;
            t3 t3VarJ = t3Var.j(new c4(e1Var, z10, jElapsedRealtime, j9, j10, iB, 0L, c4Var3.f9260h, c4Var3.f9261i, c4Var3.f9253a.f1187f));
            this.f9452q = t3VarJ;
            if (t3VarJ.A != 1) {
                this.f9452q = t3VarJ.f(1, t3VarJ.f9495a);
                j7.e eVar = new j7.e(12);
                e7.p pVar = this.f9446i;
                pVar.c(4, eVar);
                pVar.b();
            }
        }
    }

    public final void u(int i10, int i11, int i12) {
        int i13;
        int i14;
        androidx.media3.common.k2 k2Var = this.f9452q.f9504j;
        int windowCount = k2Var.getWindowCount();
        int iMin = Math.min(i11, windowCount);
        int i15 = iMin - i10;
        int iMin2 = Math.min(i12, windowCount - i15);
        if (i10 >= windowCount || i10 == iMin || i10 == iMin2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i16 = 0; i16 < windowCount; i16++) {
            arrayList.add(k2Var.getWindow(i16, new androidx.media3.common.j2()));
        }
        e7.i0.G(arrayList, i10, iMin, iMin2);
        y(k2Var, arrayList, arrayList2);
        androidx.media3.common.i2 i2VarI = i(arrayList, arrayList2);
        if (i2VarI.isEmpty()) {
            return;
        }
        int iN = n(this.f9452q);
        if (iN >= i10 && iN < iMin) {
            i14 = (iN - i10) + iMin2;
        } else {
            if (iMin > iN || iMin2 <= iN) {
                if (iMin <= iN || iMin2 > iN) {
                    i13 = iN;
                } else {
                    i14 = iN + i15;
                }
                androidx.media3.common.j2 j2Var = new androidx.media3.common.j2();
                J(s(this.f9452q, i2VarI, i13, i2VarI.getWindow(i13, j2Var).f1294n + (this.f9452q.f9497c.f9253a.f1186e - k2Var.getWindow(iN, j2Var).f1294n), getCurrentPosition(), getContentPosition(), 5), 0, null, null, null);
            }
            i14 = iN - i15;
        }
        i13 = i14;
        androidx.media3.common.j2 j2Var2 = new androidx.media3.common.j2();
        J(s(this.f9452q, i2VarI, i13, i2VarI.getWindow(i13, j2Var2).f1294n + (this.f9452q.f9497c.f9253a.f1186e - k2Var.getWindow(iN, j2Var2).f1294n), getCurrentPosition(), getContentPosition(), 5), 0, null, null, null);
    }

    @Override
    public final void unmute() {
        if (p(24)) {
            float f3 = this.f9452q.f9507o;
            k(new h0(this, f3, 2));
            t3 t3Var = this.f9452q;
            float f10 = t3Var.f9506n;
            if (f10 == t3Var.f9507o || f10 != 0.0f) {
                return;
            }
            this.f9452q = t3Var.p(f3);
            androidx.media3.cast.q qVar = new androidx.media3.cast.q(f3, 3);
            e7.p pVar = this.f9446i;
            pVar.c(22, qVar);
            pVar.b();
        }
    }

    public final void v(t3 t3Var, final t3 t3Var2, final Integer num, final Integer num2, final Integer num3, Integer num4) {
        e7.p pVar = this.f9446i;
        if (num != null) {
            final int i10 = 1;
            pVar.c(0, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i10) {
                        case 0:
                            d1Var.m(num.intValue(), t3Var2.f9514v);
                            break;
                        case 1:
                            d1Var.v(t3Var2.f9504j, num.intValue());
                            break;
                        default:
                            t3 t3Var3 = t3Var2;
                            d1Var.U(t3Var3.f9498d, t3Var3.f9499e, num.intValue());
                            break;
                    }
                }
            });
        }
        if (num3 != null) {
            final int i11 = 2;
            pVar.c(11, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i11) {
                        case 0:
                            d1Var.m(num3.intValue(), t3Var2.f9514v);
                            break;
                        case 1:
                            d1Var.v(t3Var2.f9504j, num3.intValue());
                            break;
                        default:
                            t3 t3Var3 = t3Var2;
                            d1Var.U(t3Var3.f9498d, t3Var3.f9499e, num3.intValue());
                            break;
                    }
                }
            });
        }
        androidx.media3.common.q0 q0VarS = t3Var2.s();
        if (num4 != null) {
            pVar.c(1, new ak.a(q0VarS, num4, 12));
        }
        PlaybackException playbackException = t3Var.f9495a;
        PlaybackException playbackException2 = t3Var2.f9495a;
        if (playbackException != playbackException2 && (playbackException == null || !playbackException.a(playbackException2))) {
            pVar.c(10, new j7.b(1, playbackException2));
            if (playbackException2 != null) {
                pVar.c(10, new j7.b(2, playbackException2));
            }
        }
        if (!t3Var.F.equals(t3Var2.F)) {
            final int i12 = 21;
            pVar.c(2, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i12) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
        }
        if (!t3Var.B.equals(t3Var2.B)) {
            final int i13 = 0;
            pVar.c(14, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i13) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
        }
        if (t3Var.f9517y != t3Var2.f9517y) {
            final int i14 = 1;
            pVar.c(3, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i14) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
        }
        if (t3Var.A != t3Var2.A) {
            final int i15 = 2;
            pVar.c(4, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i15) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
        }
        if (num2 != null) {
            final int i16 = 0;
            pVar.c(5, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i16) {
                        case 0:
                            d1Var.m(num2.intValue(), t3Var2.f9514v);
                            break;
                        case 1:
                            d1Var.v(t3Var2.f9504j, num2.intValue());
                            break;
                        default:
                            t3 t3Var3 = t3Var2;
                            d1Var.U(t3Var3.f9498d, t3Var3.f9499e, num2.intValue());
                            break;
                    }
                }
            });
        }
        if (t3Var.f9518z != t3Var2.f9518z) {
            final int i17 = 3;
            pVar.c(6, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i17) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
        }
        if (t3Var.f9516x != t3Var2.f9516x) {
            final int i18 = 4;
            pVar.c(7, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i18) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
        }
        if (!t3Var.f9501g.equals(t3Var2.f9501g)) {
            final int i19 = 5;
            pVar.c(12, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i19) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
        }
        if (t3Var.f9502h != t3Var2.f9502h) {
            final int i20 = 6;
            pVar.c(8, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i20) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
        }
        if (t3Var.f9503i != t3Var2.f9503i) {
            final int i21 = 7;
            pVar.c(9, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i21) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
        }
        if (!t3Var.m.equals(t3Var2.m)) {
            final int i22 = 8;
            pVar.c(15, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i22) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
        }
        if (t3Var.f9506n != t3Var2.f9506n) {
            final int i23 = 9;
            pVar.c(22, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i23) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
        }
        if (!t3Var.f9509q.equals(t3Var2.f9509q)) {
            final int i24 = 10;
            pVar.c(20, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i24) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
        }
        if (t3Var.f9508p != t3Var2.f9508p) {
            final int i25 = 11;
            pVar.c(21, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i25) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
        }
        if (!t3Var.f9510r.f4767a.equals(t3Var2.f9510r.f4767a)) {
            final int i26 = 12;
            pVar.c(27, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i26) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
            final int i27 = 13;
            pVar.c(27, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i27) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
        }
        if (!t3Var.f9511s.equals(t3Var2.f9511s)) {
            final int i28 = 14;
            pVar.c(29, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i28) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
        }
        if (t3Var.f9512t != t3Var2.f9512t || t3Var.f9513u != t3Var2.f9513u) {
            final int i29 = 15;
            pVar.c(30, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i29) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
        }
        if (!t3Var.l.equals(t3Var2.l)) {
            final int i30 = 16;
            pVar.c(25, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i30) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
        }
        if (t3Var.C != t3Var2.C) {
            final int i31 = 17;
            pVar.c(16, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i31) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
        }
        if (t3Var.D != t3Var2.D) {
            final int i32 = 18;
            pVar.c(17, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i32) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
        }
        if (t3Var.E != t3Var2.E) {
            final int i33 = 19;
            pVar.c(18, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i33) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
        }
        if (!t3Var.G.equals(t3Var2.G)) {
            final int i34 = 20;
            pVar.c(19, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i34) {
                        case 0:
                            d1Var.D(t3Var2.B);
                            break;
                        case 1:
                            d1Var.k(t3Var2.f9517y);
                            break;
                        case 2:
                            d1Var.r(t3Var2.A);
                            break;
                        case 3:
                            d1Var.f(t3Var2.f9518z);
                            break;
                        case 4:
                            d1Var.V(t3Var2.f9516x);
                            break;
                        case 5:
                            d1Var.x(t3Var2.f9501g);
                            break;
                        case 6:
                            d1Var.e(t3Var2.f9502h);
                            break;
                        case 7:
                            d1Var.w(t3Var2.f9503i);
                            break;
                        case 8:
                            d1Var.E(t3Var2.m);
                            break;
                        case 9:
                            d1Var.n(t3Var2.f9506n);
                            break;
                        case 10:
                            d1Var.s(t3Var2.f9509q);
                            break;
                        case 11:
                            d1Var.p(t3Var2.f9508p);
                            break;
                        case 12:
                            d1Var.L(t3Var2.f9510r.f4767a);
                            break;
                        case 13:
                            d1Var.t(t3Var2.f9510r);
                            break;
                        case 14:
                            d1Var.M(t3Var2.f9511s);
                            break;
                        case 15:
                            t3 t3Var3 = t3Var2;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 16:
                            d1Var.a(t3Var2.l);
                            break;
                        case 17:
                            d1Var.C(t3Var2.C);
                            break;
                        case TYPE_SINT64_VALUE:
                            d1Var.F(t3Var2.D);
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            d1Var.Q(t3Var2.E);
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            d1Var.G(t3Var2.G);
                            break;
                        default:
                            d1Var.K(t3Var2.F);
                            break;
                    }
                }
            });
        }
        pVar.b();
    }

    public final void w(t3 t3Var, r3 r3Var) {
        if (isConnected()) {
            f4 f4Var = this.f9449n;
            f4Var.getClass();
            boolean z10 = f4Var.f9293a.f() < 6;
            t3 t3Var2 = this.I;
            if (t3Var2 != null) {
                this.I = q3.e(t3Var2, t3Var, r3Var, this.f9461z, z10);
                if (!this.f9448k.isEmpty()) {
                    return;
                }
                t3Var = this.I;
                r3Var = r3.f9408c;
                this.I = null;
            }
            t3 t3Var3 = this.f9452q;
            t3 t3VarE = q3.e(t3Var3, t3Var, r3Var, this.f9461z, z10);
            this.f9452q = t3VarE;
            Integer numValueOf = (t3Var3.f9498d.equals(t3Var.f9498d) && t3Var3.f9499e.equals(t3Var.f9499e)) ? null : Integer.valueOf(t3VarE.f9500f);
            Integer numValueOf2 = !Objects.equals(t3Var3.s(), t3VarE.s()) ? Integer.valueOf(t3VarE.f9496b) : null;
            Integer numValueOf3 = !t3Var3.f9504j.equals(t3VarE.f9504j) ? Integer.valueOf(t3VarE.f9505k) : null;
            int i10 = t3Var3.f9515w;
            int i11 = t3VarE.f9515w;
            v(t3Var3, t3VarE, numValueOf3, (i10 == i11 && t3Var3.f9514v == t3VarE.f9514v) ? null : Integer.valueOf(i11), numValueOf, numValueOf2);
        }
    }

    public final void x(int i10, int i11) {
        e7.v vVar = this.D;
        if (vVar.f5187a == i10 && vVar.f5188b == i11) {
            return;
        }
        this.D = new e7.v(i10, i11);
        this.f9446i.f(24, new i7.p(i10, i11, 1));
    }

    public final void z(int i10, int i11) {
        int windowCount = this.f9452q.f9504j.getWindowCount();
        int iMin = Math.min(i11, windowCount);
        if (i10 >= windowCount || i10 == iMin || windowCount == 0) {
            return;
        }
        boolean z10 = n(this.f9452q) >= i10 && n(this.f9452q) < iMin;
        t3 t3VarR = r(this.f9452q, i10, iMin, false, getCurrentPosition(), getContentPosition());
        int i12 = this.f9452q.f9497c.f9253a.f1183b;
        J(t3VarR, 0, null, z10 ? 4 : null, i12 >= i10 && i12 < iMin ? 3 : null);
    }
}
