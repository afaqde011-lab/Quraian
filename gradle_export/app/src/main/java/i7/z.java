package i7;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.h2;
import androidx.media3.common.j2;
import androidx.media3.common.k2;
import androidx.media3.common.p2;
import androidx.media3.common.q2;
import androidx.media3.common.s2;
import androidx.media3.common.w2;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.exoplayer.image.ImageOutput;
import b3.i2;
import fh.d2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public final class z extends androidx.media3.common.f implements ExoPlayer {
    public final a8.o0 A;
    public final long B;
    public final i2 C;
    public final a1.n D;
    public final a1.i E;
    public final h1.l F;
    public final h1.l G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public fh.e1 N;
    public final k1 O;
    public l1 P;
    public s7.d1 Q;
    public boolean R;
    public androidx.media3.common.b1 S;
    public androidx.media3.common.t0 T;
    public androidx.media3.common.t0 U;
    public Object V;
    public Surface W;
    public SurfaceHolder X;
    public z7.k Y;
    public boolean Z;

    public TextureView f7468a0;

    public final v7.u f7469b;

    public final int f7470b0;

    public final androidx.media3.common.b1 f7471c;

    public e7.v f7472c0;

    public final e7.g f7473d;

    public androidx.media3.common.d f7474d0;

    public final Context f7475e;

    public float f7476e0;

    public final z f7477f;

    public float f7478f0;

    public final a[] f7479g;

    public boolean f7480g0;

    public final a[] f7481h;

    public d7.c f7482h0;

    public final c3.b f7483i;

    public final boolean f7484i0;

    public final e7.d0 f7485j;

    public boolean f7486j0;

    public final q f7487k;

    public final int f7488k0;
    public final i0 l;

    public boolean f7489l0;
    public final e7.p m;

    public final androidx.media3.common.l f7490m0;

    public final CopyOnWriteArraySet f7491n;

    public w2 f7492n0;

    public final h2 f7493o;

    public final long f7494o0;

    public final ArrayList f7495p;

    public final long f7496p0;

    public final boolean f7497q;

    public final long f7498q0;

    public final s7.z f7499r;

    public androidx.media3.common.t0 f7500r0;

    public final j7.f f7501s;

    public c1 f7502s0;

    public final Looper f7503t;

    public int f7504t0;

    public final w7.d f7505u;

    public long f7506u0;

    public final e7.b0 f7507v;

    public final v f7508w;

    public final w f7509x;

    public final c7.c f7510y;

    public final e7.l0 f7511z;

    static {
        androidx.media3.common.r0.a("media3.exoplayer");
    }

    public z(l lVar) throws Throwable {
        z zVar;
        Looper looper = lVar.f7396i;
        ?? fVar = new androidx.media3.common.f();
        fVar.f7473d = new e7.g();
        try {
            e7.a.h("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(fVar)) + " [AndroidXMedia3/1.9.0] [" + e7.i0.f5136a + "]");
            Context context = lVar.f7388a;
            e7.b0 b0Var = lVar.f7389b;
            fVar.f7475e = context.getApplicationContext();
            lVar.f7395h.getClass();
            fVar.f7501s = new j7.f(b0Var);
            fVar.f7488k0 = lVar.f7397j;
            fVar.f7474d0 = lVar.f7398k;
            fVar.f7470b0 = lVar.l;
            fVar.f7480g0 = false;
            fVar.B = lVar.f7406u;
            v vVar = new v(fVar);
            fVar.f7508w = vVar;
            fVar.f7509x = new w();
            a[] aVarArrA = ((i) lVar.f7390c.get()).a(new Handler(looper), vVar, vVar, vVar, vVar);
            fVar.f7479g = aVarArrA;
            int i10 = 1;
            ta.c0.A(aVarArrA.length > 0);
            fVar.f7481h = new a[aVarArrA.length];
            int i11 = 0;
            while (true) {
                a[] aVarArr = fVar.f7481h;
                if (i11 >= aVarArr.length) {
                    break;
                }
                int i12 = fVar.f7479g[i11].B;
                aVarArr[i11] = null;
                i11++;
                zVar.f7473d.d();
                throw th;
            }
            c3.b bVar = (c3.b) lVar.f7392e.get();
            fVar.f7483i = bVar;
            fVar.f7499r = (s7.z) lVar.f7391d.get();
            w7.d dVar = (w7.d) lVar.f7394g.get();
            fVar.f7505u = dVar;
            fVar.f7497q = lVar.m;
            fVar.P = lVar.f7399n;
            fVar.f7494o0 = lVar.f7401p;
            fVar.f7496p0 = lVar.f7402q;
            fVar.f7498q0 = lVar.f7403r;
            fVar.O = lVar.f7400o;
            fVar.R = false;
            fVar.f7503t = looper;
            fVar.f7507v = b0Var;
            fVar.f7477f = fVar;
            fVar.m = new e7.p(looper, b0Var, new q(fVar, i10));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            fVar.f7491n = copyOnWriteArraySet;
            fVar.f7495p = new ArrayList();
            fVar.Q = new s7.d1();
            a[] aVarArr2 = fVar.f7479g;
            v7.u uVar = new v7.u(new i1[aVarArr2.length], new v7.r[aVarArr2.length], s2.f1554b, null);
            fVar.f7469b = uVar;
            fVar.f7493o = new h2();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            for (int i13 : new int[]{1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32}) {
                ta.c0.A(!false);
                sparseBooleanArray.append(i13, true);
            }
            ta.c0.A(!false);
            sparseBooleanArray.append(29, true);
            ta.c0.A(!false);
            androidx.media3.common.r rVar = new androidx.media3.common.r(sparseBooleanArray);
            fVar.f7471c = new androidx.media3.common.b1(rVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i14 = 0; i14 < rVar.f1465a.size(); i14++) {
                int iB = rVar.b(i14);
                ta.c0.A(!false);
                sparseBooleanArray2.append(iB, true);
            }
            ta.c0.A(!false);
            sparseBooleanArray2.append(4, true);
            ta.c0.A(!false);
            sparseBooleanArray2.append(10, true);
            ta.c0.A(!false);
            fVar.S = new androidx.media3.common.b1(new androidx.media3.common.r(sparseBooleanArray2));
            fVar.f7485j = b0Var.a(looper, null);
            q qVar = new q(fVar, 2);
            fVar.f7487k = qVar;
            fVar.f7502s0 = c1.k(uVar);
            fVar.f7501s.c0(fVar, looper);
            j7.j jVar = new j7.j(lVar.B);
            i0 i0Var = new i0(fVar.f7475e, fVar.f7479g, fVar.f7481h, bVar, uVar, (k0) lVar.f7393f.get(), dVar, fVar.H, fVar.I, fVar.f7501s, fVar.P, lVar.f7404s, lVar.f7405t, fVar.R, looper, b0Var, qVar, jVar, fVar.f7509x);
            Looper looper2 = i0Var.J;
            e7.d0 d0Var = i0Var.H;
            fVar.l = i0Var;
            fVar.f7476e0 = 1.0f;
            fVar.H = 0;
            androidx.media3.common.t0 t0Var = androidx.media3.common.t0.K;
            fVar.T = t0Var;
            fVar.U = t0Var;
            fVar.f7500r0 = t0Var;
            fVar.f7504t0 = -1;
            fVar.f7482h0 = d7.c.f4764d;
            fVar.f7484i0 = true;
            fVar.addListener(fVar.f7501s);
            Handler handler = new Handler(looper);
            j7.f fVar2 = fVar.f7501s;
            w7.g gVar = (w7.g) dVar;
            gVar.getClass();
            fVar2.getClass();
            o10.b bVar2 = gVar.f15863c;
            bVar2.getClass();
            CopyOnWriteArrayList<w7.c> copyOnWriteArrayList = (CopyOnWriteArrayList) bVar2.B;
            for (w7.c cVar : copyOnWriteArrayList) {
                if (cVar.f15845b == fVar2) {
                    cVar.f15846c = true;
                    copyOnWriteArrayList.remove(cVar);
                }
            }
            copyOnWriteArrayList.add(new w7.c(handler, fVar2));
            copyOnWriteArraySet.add(fVar.f7508w);
            int i15 = Build.VERSION.SDK_INT;
            try {
                Context context2 = fVar.f7475e;
                boolean z10 = lVar.f7411z;
                e7.d0 d0VarA = b0Var.a(looper2, null);
                a1.i iVar = null;
                com.revenuecat.purchases.c cVar2 = new com.revenuecat.purchases.c(context2, z10, (Object) fVar, jVar, 1);
                fVar = fVar;
                d0VarA.d(cVar2);
                q qVar2 = new q(fVar, 3);
                i2 i2Var = new i2();
                i2Var.f2045b = b0Var.a(looper2, null);
                i2Var.f2046c = b0Var.a(looper, null);
                i2Var.f2048e = 0;
                i2Var.f2049f = 0;
                i2Var.f2047d = qVar2;
                fVar.C = i2Var;
                i2Var.u(new androidx.lifecycle.i0((Object) fVar, 19));
                Context context3 = lVar.f7388a;
                Looper looper3 = lVar.f7396i;
                v vVar2 = fVar.f7508w;
                c7.c cVar3 = new c7.c();
                cVar3.B = context3.getApplicationContext();
                cVar3.D = b0Var.a(looper2, null);
                cVar3.C = new c7.b(cVar3, b0Var.a(looper3, null), vVar2);
                fVar.f7510y = cVar3;
                cVar3.o(false);
                boolean z11 = (lVar.f7407v == Integer.MAX_VALUE || lVar.f7408w == Integer.MAX_VALUE || lVar.f7409x == Integer.MAX_VALUE || lVar.f7410y == Integer.MAX_VALUE) ? false : true;
                e7.l0 l0Var = new e7.l0(context, looper2, b0Var);
                fVar.f7511z = l0Var;
                if (l0Var.f5147a != z11) {
                    l0Var.f5147a = z11;
                    l0Var.e(z11, l0Var.f5148b);
                }
                a8.o0 o0Var = new a8.o0();
                new sg.f(context.getApplicationContext());
                b0Var.a(looper2, null);
                b0Var.a(Looper.getMainLooper(), null);
                fVar.A = o0Var;
                fVar.f7490m0 = androidx.media3.common.l.f1313e;
                fVar.f7492n0 = w2.f1669d;
                fVar.f7472c0 = e7.v.f5185c;
                fVar.E = i15 >= 34 ? new a1.i((z) fVar, context) : iVar;
                fVar.F = new h1.l(3);
                fVar.G = new h1.l(3);
                fVar.D = new a1.n(fVar, fVar.f7508w, fVar.f7507v, lVar.f7407v, lVar.f7408w, lVar.f7409x, lVar.f7410y);
                d0Var.b(38, fVar.O).b();
                androidx.media3.common.d dVar2 = fVar.f7474d0;
                d0Var.getClass();
                e7.c0 c0VarC = e7.d0.c();
                c0VarC.f5118a = d0Var.f5120a.obtainMessage(31, 0, 0, dVar2);
                c0VarC.b();
                fVar.r(1, 3, fVar.f7474d0);
                fVar.r(2, 4, Integer.valueOf(fVar.f7470b0));
                fVar.r(2, 5, 0);
                fVar.r(1, 9, Boolean.valueOf(fVar.f7480g0));
                fVar.r(6, 8, fVar.f7509x);
                fVar.r(-1, 16, Integer.valueOf(fVar.f7488k0));
                fVar.f7473d.d();
            } catch (Throwable th2) {
                th = th2;
                zVar = fVar;
            }
        } catch (Throwable th3) {
            th = th3;
            zVar = fVar;
        }
    }

    public static long k(c1 c1Var) {
        j2 j2Var = new j2();
        h2 h2Var = new h2();
        c1Var.f7247a.getPeriodByUid(c1Var.f7248b.f13644a, h2Var);
        long j9 = c1Var.f7249c;
        return j9 == -9223372036854775807L ? c1Var.f7247a.getWindow(h2Var.f1233c, j2Var).l : h2Var.f1235e + j9;
    }

    public static c1 l(c1 c1Var, int i10) {
        c1 c1VarH = c1Var.h(i10);
        return (i10 == 1 || i10 == 4) ? c1VarH.b(false) : c1VarH;
    }

    public final void A() {
        this.f7473d.b();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f7503t;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = e7.i0.f5136a;
            Locale locale = Locale.US;
            String strQ = a1.b.q("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f7484i0) {
                throw new IllegalStateException(strQ);
            }
            e7.a.n("ExoPlayerImpl", strQ, this.f7486j0 ? null : new IllegalStateException());
            this.f7486j0 = true;
        }
    }

    @Override
    public final void addListener(androidx.media3.common.d1 d1Var) {
        d1Var.getClass();
        this.m.a(d1Var);
    }

    @Override
    public final void addMediaItems(int i10, List list) {
        A();
        ArrayList arrayListE = e(list);
        A();
        ta.c0.s(i10 >= 0);
        int iMin = Math.min(i10, this.f7495p.size());
        if (!this.f7502s0.f7247a.isEmpty()) {
            y(c(this.f7502s0, iMin, arrayListE), 0, false, 5, -9223372036854775807L, -1, false);
            return;
        }
        boolean z10 = this.f7504t0 == -1;
        A();
        s(arrayListE, -1, -9223372036854775807L, z10);
    }

    public final c1 c(c1 c1Var, int i10, ArrayList arrayList) {
        k2 k2Var = c1Var.f7247a;
        this.J++;
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.f7495p;
            if (i11 >= size) {
                this.Q = this.Q.a(i10, arrayList2.size());
                h1 h1Var = new h1(arrayList3, this.Q);
                c1 c1VarM = m(c1Var, h1Var, j(k2Var, h1Var, i(c1Var), g(c1Var)));
                s7.d1 d1Var = this.Q;
                e7.d0 d0Var = this.l.H;
                d0 d0Var2 = new d0(arrayList2, d1Var, -1, -9223372036854775807L);
                d0Var.getClass();
                e7.c0 c0VarC = e7.d0.c();
                c0VarC.f5118a = d0Var.f5120a.obtainMessage(18, i10, 0, d0Var2);
                c0VarC.b();
                return c1VarM;
            }
            a1 a1Var = new a1((s7.a) arrayList.get(i11), this.f7497q);
            arrayList2.add(a1Var);
            arrayList3.add(i11 + i10, new x(a1Var.f7217b, a1Var.f7216a));
            i11++;
        }
    }

    @Override
    public final void clearVideoSurface() {
        A();
        q();
        u(null);
        o(0, 0);
    }

    @Override
    public final void clearVideoSurface(Surface surface) {
        A();
        if (surface == null || surface != this.V) {
            return;
        }
        clearVideoSurface();
    }

    @Override
    public final void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        A();
        if (surfaceHolder == null || surfaceHolder != this.X) {
            return;
        }
        clearVideoSurface();
    }

    @Override
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        A();
        clearVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override
    public final void clearVideoTextureView(TextureView textureView) {
        A();
        if (textureView == null || textureView != this.f7468a0) {
            return;
        }
        clearVideoSurface();
    }

    public final androidx.media3.common.t0 d() {
        k2 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return this.f7500r0;
        }
        androidx.media3.common.q0 q0Var = currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).f1285c;
        androidx.media3.common.s0 s0VarA = this.f7500r0.a();
        s0VarA.b(q0Var.f1416d);
        return new androidx.media3.common.t0(s0VarA);
    }

    @Override
    public final void decreaseDeviceVolume() {
        A();
    }

    @Override
    public final void decreaseDeviceVolume(int i10) {
        A();
    }

    public final ArrayList e(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f7499r.a((androidx.media3.common.q0) list.get(i10)));
        }
        return arrayList;
    }

    public final f1 f(e1 e1Var) {
        int i10 = i(this.f7502s0);
        k2 k2Var = this.f7502s0.f7247a;
        if (i10 == -1) {
            i10 = 0;
        }
        i0 i0Var = this.l;
        return new f1(i0Var, e1Var, k2Var, i10, i0Var.J);
    }

    public final long g(c1 c1Var) {
        s7.a0 a0Var = c1Var.f7248b;
        long j9 = c1Var.f7249c;
        k2 k2Var = c1Var.f7247a;
        if (!a0Var.b()) {
            return e7.i0.W(h(c1Var));
        }
        Object obj = c1Var.f7248b.f13644a;
        h2 h2Var = this.f7493o;
        k2Var.getPeriodByUid(obj, h2Var);
        if (j9 == -9223372036854775807L) {
            return e7.i0.W(k2Var.getWindow(i(c1Var), this.window).l);
        }
        return e7.i0.W(j9) + e7.i0.W(h2Var.f1235e);
    }

    @Override
    public final Looper getApplicationLooper() {
        return this.f7503t;
    }

    @Override
    public final androidx.media3.common.d getAudioAttributes() {
        A();
        return this.f7474d0;
    }

    @Override
    public final int getAudioSessionId() {
        Object obj;
        A();
        i2 i2Var = this.C;
        i2Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == ((e7.d0) i2Var.f2046c).f5120a.getLooper()) {
            obj = i2Var.f2048e;
        } else {
            ta.c0.A(looperMyLooper == ((e7.d0) i2Var.f2045b).f5120a.getLooper());
            obj = i2Var.f2049f;
        }
        return ((Integer) obj).intValue();
    }

    @Override
    public final androidx.media3.common.b1 getAvailableCommands() {
        A();
        return this.S;
    }

    @Override
    public final long getBufferedPosition() {
        A();
        if (!isPlayingAd()) {
            return getContentBufferedPosition();
        }
        c1 c1Var = this.f7502s0;
        return c1Var.f7257k.equals(c1Var.f7248b) ? e7.i0.W(this.f7502s0.f7261q) : getDuration();
    }

    @Override
    public final long getContentBufferedPosition() {
        A();
        if (this.f7502s0.f7247a.isEmpty()) {
            return this.f7506u0;
        }
        c1 c1Var = this.f7502s0;
        if (c1Var.f7257k.f13647d != c1Var.f7248b.f13647d) {
            return e7.i0.W(c1Var.f7247a.getWindow(getCurrentMediaItemIndex(), this.window).m);
        }
        long j9 = c1Var.f7261q;
        if (this.f7502s0.f7257k.b()) {
            c1 c1Var2 = this.f7502s0;
            h2 periodByUid = c1Var2.f7247a.getPeriodByUid(c1Var2.f7257k.f13644a, this.f7493o);
            long jD = periodByUid.d(this.f7502s0.f7257k.f13645b);
            j9 = jD == Long.MIN_VALUE ? periodByUid.f1234d : jD;
        }
        c1 c1Var3 = this.f7502s0;
        k2 k2Var = c1Var3.f7247a;
        Object obj = c1Var3.f7257k.f13644a;
        h2 h2Var = this.f7493o;
        k2Var.getPeriodByUid(obj, h2Var);
        return e7.i0.W(j9 + h2Var.f1235e);
    }

    @Override
    public final long getContentPosition() {
        A();
        return g(this.f7502s0);
    }

    @Override
    public final int getCurrentAdGroupIndex() {
        A();
        if (isPlayingAd()) {
            return this.f7502s0.f7248b.f13645b;
        }
        return -1;
    }

    @Override
    public final int getCurrentAdIndexInAdGroup() {
        A();
        if (isPlayingAd()) {
            return this.f7502s0.f7248b.f13646c;
        }
        return -1;
    }

    @Override
    public final d7.c getCurrentCues() {
        A();
        return this.f7482h0;
    }

    @Override
    public final int getCurrentMediaItemIndex() {
        A();
        int i10 = i(this.f7502s0);
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    @Override
    public final int getCurrentPeriodIndex() {
        A();
        if (!this.f7502s0.f7247a.isEmpty()) {
            c1 c1Var = this.f7502s0;
            return c1Var.f7247a.getIndexOfPeriod(c1Var.f7248b.f13644a);
        }
        int i10 = this.f7504t0;
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    @Override
    public final long getCurrentPosition() {
        A();
        return e7.i0.W(h(this.f7502s0));
    }

    @Override
    public final k2 getCurrentTimeline() {
        A();
        return this.f7502s0.f7247a;
    }

    @Override
    public final s2 getCurrentTracks() {
        A();
        return this.f7502s0.f7255i.f15531d;
    }

    @Override
    public final androidx.media3.common.l getDeviceInfo() {
        A();
        return this.f7490m0;
    }

    @Override
    public final int getDeviceVolume() {
        A();
        return 0;
    }

    @Override
    public final long getDuration() {
        A();
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        c1 c1Var = this.f7502s0;
        s7.a0 a0Var = c1Var.f7248b;
        k2 k2Var = c1Var.f7247a;
        Object obj = a0Var.f13644a;
        h2 h2Var = this.f7493o;
        k2Var.getPeriodByUid(obj, h2Var);
        return e7.i0.W(h2Var.a(a0Var.f13645b, a0Var.f13646c));
    }

    @Override
    public final long getMaxSeekToPreviousPosition() {
        A();
        return this.f7498q0;
    }

    @Override
    public final androidx.media3.common.t0 getMediaMetadata() {
        A();
        return this.T;
    }

    @Override
    public final boolean getPlayWhenReady() {
        A();
        return this.f7502s0.l;
    }

    @Override
    public final androidx.media3.common.z0 getPlaybackParameters() {
        A();
        return this.f7502s0.f7259o;
    }

    @Override
    public final int getPlaybackState() {
        A();
        return this.f7502s0.f7251e;
    }

    @Override
    public final int getPlaybackSuppressionReason() {
        A();
        return this.f7502s0.f7258n;
    }

    @Override
    public final PlaybackException getPlayerError() {
        A();
        return this.f7502s0.f7252f;
    }

    @Override
    public final androidx.media3.common.t0 getPlaylistMetadata() {
        A();
        return this.U;
    }

    @Override
    public final int getRepeatMode() {
        A();
        return this.H;
    }

    @Override
    public final long getSeekBackIncrement() {
        A();
        return this.f7494o0;
    }

    @Override
    public final long getSeekForwardIncrement() {
        A();
        return this.f7496p0;
    }

    @Override
    public final boolean getShuffleModeEnabled() {
        A();
        return this.I;
    }

    @Override
    public final e7.v getSurfaceSize() {
        A();
        return this.f7472c0;
    }

    @Override
    public final long getTotalBufferedDuration() {
        A();
        return e7.i0.W(this.f7502s0.f7262r);
    }

    @Override
    public final q2 getTrackSelectionParameters() {
        A();
        v7.j jVarV = ((v7.p) this.f7483i).v();
        if (!this.M) {
            return jVarV;
        }
        jVarV.getClass();
        v7.i iVar = new v7.i(jVarV);
        iVar.m(this.N);
        return new v7.j(iVar);
    }

    @Override
    public final w2 getVideoSize() {
        A();
        return this.f7492n0;
    }

    @Override
    public final float getVolume() {
        A();
        return this.f7476e0;
    }

    public final long h(c1 c1Var) {
        if (c1Var.f7247a.isEmpty()) {
            return e7.i0.H(this.f7506u0);
        }
        long jL = c1Var.f7260p ? c1Var.l() : c1Var.f7263s;
        if (c1Var.f7248b.b()) {
            return jL;
        }
        k2 k2Var = c1Var.f7247a;
        Object obj = c1Var.f7248b.f13644a;
        h2 h2Var = this.f7493o;
        k2Var.getPeriodByUid(obj, h2Var);
        return jL + h2Var.f1235e;
    }

    public final int i(c1 c1Var) {
        return c1Var.f7247a.isEmpty() ? this.f7504t0 : c1Var.f7247a.getPeriodByUid(c1Var.f7248b.f13644a, this.f7493o).f1233c;
    }

    @Override
    public final void increaseDeviceVolume() {
        A();
    }

    @Override
    public final void increaseDeviceVolume(int i10) {
        A();
    }

    @Override
    public final boolean isDeviceMuted() {
        A();
        return false;
    }

    @Override
    public final boolean isLoading() {
        A();
        return this.f7502s0.f7253g;
    }

    @Override
    public final boolean isPlayingAd() {
        A();
        return this.f7502s0.f7248b.b();
    }

    @Override
    public final boolean isScrubbingModeEnabled() {
        A();
        return this.M;
    }

    public final Pair j(k2 k2Var, h1 h1Var, int i10, long j9) {
        if (k2Var.isEmpty() || h1Var.isEmpty()) {
            boolean z10 = !k2Var.isEmpty() && h1Var.isEmpty();
            return n(h1Var, z10 ? -1 : i10, z10 ? -9223372036854775807L : j9);
        }
        Pair<Object, Long> periodPositionUs = k2Var.getPeriodPositionUs(this.window, this.f7493o, i10, e7.i0.H(j9));
        Object obj = periodPositionUs.first;
        if (h1Var.getIndexOfPeriod(obj) != -1) {
            return periodPositionUs;
        }
        int iW = i0.W(this.window, this.f7493o, this.H, this.I, obj, k2Var, h1Var);
        return iW != -1 ? n(h1Var, iW, e7.i0.W(h1Var.getWindow(iW, this.window).l)) : n(h1Var, -1, -9223372036854775807L);
    }

    public final c1 m(c1 c1Var, k2 k2Var, Pair pair) {
        List list;
        ta.c0.s(k2Var.isEmpty() || pair != null);
        k2 k2Var2 = c1Var.f7247a;
        long jG = g(c1Var);
        c1 c1VarJ = c1Var.j(k2Var);
        if (k2Var.isEmpty()) {
            s7.a0 a0Var = c1.f7246u;
            long jH = e7.i0.H(this.f7506u0);
            c1 c1VarC = c1VarJ.d(a0Var, jH, jH, jH, 0L, s7.l1.f13708d, this.f7469b, d2.E).c(a0Var);
            c1VarC.f7261q = c1VarC.f7263s;
            return c1VarC;
        }
        Object obj = c1VarJ.f7248b.f13644a;
        String str = e7.i0.f5136a;
        boolean zEquals = obj.equals(pair.first);
        s7.a0 a0Var2 = !zEquals ? new s7.a0(pair.first) : c1VarJ.f7248b;
        long jLongValue = ((Long) pair.second).longValue();
        long jH2 = e7.i0.H(jG);
        if (!k2Var2.isEmpty()) {
            jH2 -= k2Var2.getPeriodByUid(obj, this.f7493o).f1235e;
            if (zEquals && jH2 - jLongValue == 1 && jH2 == k2Var2.getPeriodByUid(obj, this.f7493o).f1234d) {
                jH2--;
            }
        }
        if (!zEquals || jLongValue < jH2) {
            s7.a0 a0Var3 = a0Var2;
            ta.c0.A(!a0Var3.b());
            s7.l1 l1Var = !zEquals ? s7.l1.f13708d : c1VarJ.f7254h;
            v7.u uVar = !zEquals ? this.f7469b : c1VarJ.f7255i;
            if (zEquals) {
                list = c1VarJ.f7256j;
            } else {
                fh.r0 r0Var = fh.t0.B;
                list = d2.E;
            }
            c1 c1VarC2 = c1VarJ.d(a0Var3, jLongValue, jLongValue, jLongValue, 0L, l1Var, uVar, list).c(a0Var3);
            c1VarC2.f7261q = jLongValue;
            return c1VarC2;
        }
        if (jLongValue != jH2) {
            s7.a0 a0Var4 = a0Var2;
            ta.c0.A(!a0Var4.b());
            long jMax = Math.max(0L, c1VarJ.f7262r - (jLongValue - jH2));
            long j9 = c1VarJ.f7261q;
            if (c1VarJ.f7257k.equals(c1VarJ.f7248b)) {
                j9 = jLongValue + jMax;
            }
            c1 c1VarD = c1VarJ.d(a0Var4, jLongValue, jLongValue, jLongValue, jMax, c1VarJ.f7254h, c1VarJ.f7255i, c1VarJ.f7256j);
            c1VarD.f7261q = j9;
            return c1VarD;
        }
        int indexOfPeriod = k2Var.getIndexOfPeriod(c1VarJ.f7257k.f13644a);
        if (indexOfPeriod != -1 && k2Var.getPeriod(indexOfPeriod, this.f7493o).f1233c == k2Var.getPeriodByUid(a0Var2.f13644a, this.f7493o).f1233c) {
            return c1VarJ;
        }
        k2Var.getPeriodByUid(a0Var2.f13644a, this.f7493o);
        long jA = a0Var2.b() ? this.f7493o.a(a0Var2.f13645b, a0Var2.f13646c) : this.f7493o.f1234d;
        s7.a0 a0Var5 = a0Var2;
        c1 c1VarC3 = c1VarJ.d(a0Var5, c1VarJ.f7263s, c1VarJ.f7263s, c1VarJ.f7250d, jA - c1VarJ.f7263s, c1VarJ.f7254h, c1VarJ.f7255i, c1VarJ.f7256j).c(a0Var5);
        c1VarC3.f7261q = jA;
        return c1VarC3;
    }

    @Override
    public final void moveMediaItems(int i10, int i11, int i12) {
        A();
        ta.c0.s(i10 >= 0 && i10 <= i11 && i12 >= 0);
        ArrayList arrayList = this.f7495p;
        int size = arrayList.size();
        int iMin = Math.min(i11, size);
        int iMin2 = Math.min(i12, size - (iMin - i10));
        if (i10 >= size || i10 == iMin || i10 == iMin2) {
            return;
        }
        k2 currentTimeline = getCurrentTimeline();
        this.J++;
        e7.i0.G(arrayList, i10, iMin, iMin2);
        s7.d1 d1Var = this.Q;
        d1Var.getClass();
        this.Q = d1Var;
        h1 h1Var = new h1(arrayList, this.Q);
        c1 c1Var = this.f7502s0;
        c1 c1VarM = m(c1Var, h1Var, j(currentTimeline, h1Var, i(c1Var), g(this.f7502s0)));
        s7.d1 d1Var2 = this.Q;
        i0 i0Var = this.l;
        i0Var.getClass();
        i0Var.H.b(19, new e0(i10, iMin, iMin2, d1Var2)).b();
        y(c1VarM, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void mute() {
        A();
        if (this.f7476e0 != 0.0f) {
            setVolume(0.0f);
        }
    }

    public final Pair n(k2 k2Var, int i10, long j9) {
        if (k2Var.isEmpty()) {
            this.f7504t0 = i10;
            if (j9 == -9223372036854775807L) {
                j9 = 0;
            }
            this.f7506u0 = j9;
            return null;
        }
        if (i10 == -1 || i10 >= k2Var.getWindowCount()) {
            i10 = k2Var.getFirstWindowIndex(this.I);
            j9 = e7.i0.W(k2Var.getWindow(i10, this.window).l);
        }
        return k2Var.getPeriodPositionUs(this.window, this.f7493o, i10, e7.i0.H(j9));
    }

    public final void o(int i10, int i11) {
        e7.v vVar = this.f7472c0;
        if (i10 == vVar.f5187a && i11 == vVar.f5188b) {
            return;
        }
        this.f7472c0 = new e7.v(i10, i11);
        this.m.f(24, new p(i10, i11, 0));
        r(2, 14, new e7.v(i10, i11));
    }

    public final c1 p(c1 c1Var, int i10, int i11) {
        int i12 = i(c1Var);
        long jG = g(c1Var);
        k2 k2Var = c1Var.f7247a;
        ArrayList arrayList = this.f7495p;
        int size = arrayList.size();
        this.J++;
        for (int i13 = i11 - 1; i13 >= i10; i13--) {
            arrayList.remove(i13);
        }
        s7.d1 d1Var = this.Q;
        int i14 = i11 - i10;
        int[] iArr = d1Var.f13658b;
        int[] iArr2 = new int[iArr.length - i14];
        int i15 = 0;
        for (int i16 = 0; i16 < iArr.length; i16++) {
            int i17 = iArr[i16];
            if (i17 < i10 || i17 >= i11) {
                int i18 = i16 - i15;
                if (i17 >= i10) {
                    i17 -= i14;
                }
                iArr2[i18] = i17;
            } else {
                i15++;
            }
        }
        this.Q = new s7.d1(iArr2, new Random(d1Var.f13657a.nextLong()));
        h1 h1Var = new h1(arrayList, this.Q);
        c1 c1VarM = m(c1Var, h1Var, j(k2Var, h1Var, i12, jG));
        int i19 = c1VarM.f7251e;
        if (i19 != 1 && i19 != 4 && i10 < i11 && i11 == size && i12 >= c1VarM.f7247a.getWindowCount()) {
            c1VarM = l(c1VarM, 4);
        }
        s7.d1 d1Var2 = this.Q;
        e7.d0 d0Var = this.l.H;
        d0Var.getClass();
        e7.c0 c0VarC = e7.d0.c();
        c0VarC.f5118a = d0Var.f5120a.obtainMessage(20, i10, i11, d1Var2);
        c0VarC.b();
        return c1VarM;
    }

    @Override
    public final void prepare() {
        A();
        c1 c1Var = this.f7502s0;
        if (c1Var.f7251e != 1) {
            return;
        }
        c1 c1VarF = c1Var.f(null);
        c1 c1VarL = l(c1VarF, c1VarF.f7247a.isEmpty() ? 4 : 2);
        this.J++;
        e7.d0 d0Var = this.l.H;
        d0Var.getClass();
        e7.c0 c0VarC = e7.d0.c();
        c0VarC.f5118a = d0Var.f5120a.obtainMessage(29);
        c0VarC.b();
        y(c1VarL, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void q() {
        z7.k kVar = this.Y;
        v vVar = this.f7508w;
        if (kVar != null) {
            f1 f1VarF = f(this.f7509x);
            ta.c0.A(!f1VarF.f7303j);
            f1VarF.f7297d = 10000;
            ta.c0.A(!f1VarF.f7303j);
            f1VarF.f7298e = null;
            f1VarF.b();
            this.Y.A.remove(vVar);
            this.Y = null;
        }
        TextureView textureView = this.f7468a0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != vVar) {
                e7.a.m("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f7468a0.setSurfaceTextureListener(null);
            }
            this.f7468a0 = null;
        }
        SurfaceHolder surfaceHolder = this.X;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(vVar);
            this.X = null;
        }
    }

    public final void r(int i10, int i11, Object obj) {
        for (a aVar : this.f7479g) {
            if (i10 == -1 || aVar.B == i10) {
                f1 f1VarF = f(aVar);
                ta.c0.A(!f1VarF.f7303j);
                f1VarF.f7297d = i11;
                ta.c0.A(!f1VarF.f7303j);
                f1VarF.f7298e = obj;
                f1VarF.b();
            }
        }
        for (a aVar2 : this.f7481h) {
            if (aVar2 != null && (i10 == -1 || aVar2.B == i10)) {
                f1 f1VarF2 = f(aVar2);
                ta.c0.A(!f1VarF2.f7303j);
                f1VarF2.f7297d = i11;
                ta.c0.A(!f1VarF2.f7303j);
                f1VarF2.f7298e = obj;
                f1VarF2.b();
            }
        }
    }

    @Override
    public final void release() {
        boolean zC;
        Context context;
        e7.a.h("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.0] [" + e7.i0.f5136a + "] [" + androidx.media3.common.r0.b() + "]");
        A();
        this.f7510y.o(false);
        this.f7511z.f(false);
        this.A.a(false);
        a1.i iVar = this.E;
        if (iVar != null && Build.VERSION.SDK_INT >= 34 && (context = (Context) ((WeakReference) iVar.B).get()) != null) {
            context.unregisterDeviceIdChangeListener((y) iVar.C);
        }
        a1.n nVar = this.D;
        ((e7.d0) nVar.G).f5120a.removeCallbacksAndMessages(null);
        ((z) nVar.B).removeListener((e7.w) nVar.C);
        i0 i0Var = this.l;
        if (i0Var.f7355j0 || !i0Var.J.getThread().isAlive()) {
            zC = true;
        } else {
            i0Var.f7355j0 = true;
            e7.g gVar = new e7.g(i0Var.Q);
            i0Var.H.b(7, gVar).b();
            zC = gVar.c(i0Var.V);
        }
        if (!zC) {
            this.m.f(10, new du.w(19));
        }
        this.m.d();
        this.f7485j.f5120a.removeCallbacksAndMessages(null);
        w7.d dVar = this.f7505u;
        j7.f fVar = this.f7501s;
        CopyOnWriteArrayList<w7.c> copyOnWriteArrayList = (CopyOnWriteArrayList) ((w7.g) dVar).f15863c.B;
        for (w7.c cVar : copyOnWriteArrayList) {
            if (cVar.f15845b == fVar) {
                cVar.f15846c = true;
                copyOnWriteArrayList.remove(cVar);
            }
        }
        c1 c1Var = this.f7502s0;
        if (c1Var.f7260p) {
            this.f7502s0 = c1Var.a();
        }
        c1 c1VarL = l(this.f7502s0, 1);
        this.f7502s0 = c1VarL;
        c1 c1VarC = c1VarL.c(c1VarL.f7248b);
        this.f7502s0 = c1VarC;
        c1VarC.f7261q = c1VarC.f7263s;
        this.f7502s0.f7262r = 0L;
        j7.f fVar2 = this.f7501s;
        e7.d0 d0Var = fVar2.H;
        d0Var.getClass();
        d0Var.d(new androidx.lifecycle.i0(fVar2, 22));
        q();
        Surface surface = this.W;
        if (surface != null) {
            surface.release();
            this.W = null;
        }
        this.f7482h0 = d7.c.f4764d;
        this.f7489l0 = true;
    }

    @Override
    public final void removeListener(androidx.media3.common.d1 d1Var) {
        A();
        d1Var.getClass();
        this.m.e(d1Var);
    }

    @Override
    public final void removeMediaItems(int i10, int i11) {
        A();
        ta.c0.s(i10 >= 0 && i11 >= i10);
        int size = this.f7495p.size();
        int iMin = Math.min(i11, size);
        if (i10 >= size || i10 == iMin) {
            return;
        }
        c1 c1VarP = p(this.f7502s0, i10, iMin);
        y(c1VarP, 0, !c1VarP.f7248b.f13644a.equals(this.f7502s0.f7248b.f13644a), 4, h(c1VarP), -1, false);
    }

    @Override
    public final void replaceMediaItems(int i10, int i11, List list) {
        A();
        ta.c0.s(i10 >= 0 && i11 >= i10);
        ArrayList arrayList = this.f7495p;
        int size = arrayList.size();
        if (i10 > size) {
            return;
        }
        int iMin = Math.min(i11, size);
        if (iMin - i10 == list.size()) {
            int i12 = i10;
            while (true) {
                if (i12 >= iMin) {
                    this.J++;
                    e7.d0 d0Var = this.l.H;
                    d0Var.getClass();
                    e7.c0 c0VarC = e7.d0.c();
                    c0VarC.f5118a = d0Var.f5120a.obtainMessage(27, i10, iMin, list);
                    c0VarC.b();
                    for (int i13 = i10; i13 < iMin; i13++) {
                        x xVar = (x) arrayList.get(i13);
                        xVar.f7466c = new g1(xVar.f7466c, (androidx.media3.common.q0) list.get(i13 - i10));
                    }
                    y(this.f7502s0.j(new h1(arrayList, this.Q)), 0, false, 4, -9223372036854775807L, -1, false);
                    return;
                }
                if (!((x) arrayList.get(i12)).f7465b.f13714k.a((androidx.media3.common.q0) list.get(i12 - i10))) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        ArrayList arrayListE = e(list);
        if (!this.f7502s0.f7247a.isEmpty()) {
            c1 c1VarP = p(c(this.f7502s0, iMin, arrayListE), i10, iMin);
            y(c1VarP, 0, !c1VarP.f7248b.f13644a.equals(this.f7502s0.f7248b.f13644a), 4, h(c1VarP), -1, false);
        } else {
            boolean z10 = this.f7504t0 == -1;
            A();
            s(arrayListE, -1, -9223372036854775807L, z10);
        }
    }

    public final void s(ArrayList arrayList, int i10, long j9, boolean z10) {
        long j10;
        int i11;
        int i12;
        c1 c1VarL;
        boolean z11;
        int firstWindowIndex = i10;
        int i13 = i(this.f7502s0);
        long currentPosition = getCurrentPosition();
        this.J++;
        ArrayList arrayList2 = this.f7495p;
        arrayList2.clear();
        ArrayList arrayList3 = new ArrayList();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            a1 a1Var = new a1((s7.a) arrayList.get(i14), this.f7497q);
            arrayList3.add(a1Var);
            arrayList2.add(i14, new x(a1Var.f7217b, a1Var.f7216a));
        }
        s7.d1 d1Var = this.Q;
        int size = arrayList3.size();
        d1Var.getClass();
        this.Q = new s7.d1(new Random(d1Var.f13657a.nextLong())).a(0, size);
        h1 h1Var = new h1(arrayList2, this.Q);
        boolean zIsEmpty = h1Var.isEmpty();
        int i15 = h1Var.f7336c;
        if (!zIsEmpty && firstWindowIndex >= i15) {
            throw new IllegalSeekPositionException();
        }
        if (!z10) {
            if (firstWindowIndex == -1) {
                i11 = i13;
                j10 = currentPosition;
            } else {
                j10 = j9;
            }
            c1 c1VarM = m(this.f7502s0, h1Var, n(h1Var, i11, j10));
            i12 = c1VarM.f7251e;
            if (i12 == 1) {
                i12 = 1;
            } else if (!h1Var.isEmpty()) {
                i12 = 4;
            } else if (i11 != -1) {
                if (i11 >= i15) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
            }
            c1VarL = l(c1VarM, i12);
            this.l.H.b(17, new d0(arrayList3, this.Q, i11, e7.i0.H(j10))).b();
            if (!this.f7502s0.f7248b.f13644a.equals(c1VarL.f7248b.f13644a) || this.f7502s0.f7247a.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            y(c1VarL, 0, z11, 4, h(c1VarL), -1, false);
        }
        firstWindowIndex = h1Var.getFirstWindowIndex(this.I);
        j10 = -9223372036854775807L;
        i11 = firstWindowIndex;
        c1 c1VarM2 = m(this.f7502s0, h1Var, n(h1Var, i11, j10));
        i12 = c1VarM2.f7251e;
        if (i12 == 1) {
            i12 = 1;
        } else if (!h1Var.isEmpty()) {
            i12 = 4;
        } else if (i11 != -1) {
            if (i11 >= i15) {
                i12 = 4;
            } else {
                i12 = 2;
            }
        }
        c1VarL = l(c1VarM2, i12);
        this.l.H.b(17, new d0(arrayList3, this.Q, i11, e7.i0.H(j10))).b();
        if (this.f7502s0.f7248b.f13644a.equals(c1VarL.f7248b.f13644a)) {
            z11 = false;
        } else {
            z11 = false;
        }
        y(c1VarL, 0, z11, 4, h(c1VarL), -1, false);
    }

    @Override
    public final void seekTo(int i10, long j9, int i11, boolean z10) {
        A();
        if (i10 == -1) {
            return;
        }
        ta.c0.s(i10 >= 0);
        k2 k2Var = this.f7502s0.f7247a;
        if (k2Var.isEmpty() || i10 < k2Var.getWindowCount()) {
            j7.f fVar = this.f7501s;
            if (!fVar.I) {
                j7.a aVarW = fVar.W();
                fVar.I = true;
                fVar.b0(aVarW, -1, new j2.n(24));
            }
            this.J++;
            if (isPlayingAd()) {
                e7.a.m("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                ba.s sVar = new ba.s(this.f7502s0);
                sVar.f(1);
                z zVar = this.f7487k.B;
                zVar.f7485j.d(new ab.f(zVar, sVar, 19));
                return;
            }
            c1 c1VarH = this.f7502s0;
            int i12 = c1VarH.f7251e;
            if (i12 == 3 || (i12 == 4 && !k2Var.isEmpty())) {
                c1VarH = this.f7502s0.h(2);
            }
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            c1 c1VarM = m(c1VarH, k2Var, n(k2Var, i10, j9));
            this.l.H.b(3, new h0(k2Var, i10, e7.i0.H(j9))).b();
            y(c1VarM, 0, true, 1, h(c1VarM), currentMediaItemIndex, z10);
        }
    }

    @Override
    public final void setAudioAttributes(androidx.media3.common.d dVar, boolean z10) {
        A();
        if (this.f7489l0) {
            return;
        }
        boolean zEquals = Objects.equals(this.f7474d0, dVar);
        e7.p pVar = this.m;
        if (!zEquals) {
            this.f7474d0 = dVar;
            r(1, 3, dVar);
            pVar.c(20, new r(dVar, 0));
        }
        androidx.media3.common.d dVar2 = this.f7474d0;
        e7.d0 d0Var = this.l.H;
        d0Var.getClass();
        e7.c0 c0VarC = e7.d0.c();
        c0VarC.f5118a = d0Var.f5120a.obtainMessage(31, z10 ? 1 : 0, 0, dVar2);
        c0VarC.b();
        pVar.b();
    }

    @Override
    public final void setDeviceMuted(boolean z10) {
        A();
    }

    @Override
    public final void setDeviceMuted(boolean z10, int i10) {
        A();
    }

    @Override
    public final void setDeviceVolume(int i10) {
        A();
    }

    @Override
    public final void setDeviceVolume(int i10, int i11) {
        A();
    }

    @Override
    public final void setImageOutput(ImageOutput imageOutput) {
        A();
        r(4, 15, imageOutput);
    }

    @Override
    public final void setMediaItems(List list, int i10, long j9) {
        A();
        ArrayList arrayListE = e(list);
        A();
        s(arrayListE, i10, j9, false);
    }

    @Override
    public final void setMediaItems(List list, boolean z10) {
        A();
        ArrayList arrayListE = e(list);
        A();
        s(arrayListE, -1, -9223372036854775807L, z10);
    }

    @Override
    public final void setPlayWhenReady(boolean z10) {
        A();
        x(1, z10);
    }

    @Override
    public final void setPlaybackParameters(androidx.media3.common.z0 z0Var) {
        A();
        if (z0Var == null) {
            z0Var = androidx.media3.common.z0.f1685d;
        }
        if (this.f7502s0.f7259o.equals(z0Var)) {
            return;
        }
        c1 c1VarG = this.f7502s0.g(z0Var);
        this.J++;
        this.l.H.b(4, z0Var).b();
        y(c1VarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void setPlaylistMetadata(androidx.media3.common.t0 t0Var) {
        A();
        t0Var.getClass();
        if (t0Var.equals(this.U)) {
            return;
        }
        this.U = t0Var;
        this.m.f(15, new q(this, 0));
    }

    @Override
    public final void setRepeatMode(int i10) {
        A();
        if (this.H != i10) {
            this.H = i10;
            this.l.H.a(11, i10, 0).b();
            androidx.media3.cast.n nVar = new androidx.media3.cast.n(i10, 2);
            e7.p pVar = this.m;
            pVar.c(8, nVar);
            w();
            pVar.b();
        }
    }

    @Override
    public final void setScrubbingModeEnabled(boolean z10) {
        q2 q2VarB;
        A();
        if (z10 == this.M) {
            return;
        }
        this.M = z10;
        k1 k1Var = this.O;
        if (!k1Var.f7387a.isEmpty()) {
            c3.b bVar = this.f7483i;
            bVar.getClass();
            v7.j jVarV = ((v7.p) bVar).v();
            if (z10) {
                this.N = jVarV.I;
                fh.e1 e1Var = k1Var.f7387a;
                p2 p2VarA = jVarV.a();
                fh.s2 it = e1Var.iterator();
                while (it.hasNext()) {
                    p2VarA.l(((Integer) it.next()).intValue(), true);
                }
                q2VarB = p2VarA.b();
            } else {
                jVarV.getClass();
                v7.i iVar = new v7.i(jVarV);
                iVar.m(this.N);
                v7.j jVar = new v7.j(iVar);
                this.N = null;
                q2VarB = jVar;
            }
            if (!q2VarB.equals(jVarV)) {
                bVar.q(q2VarB);
            }
        }
        this.l.H.b(36, Boolean.valueOf(z10)).b();
        c1 c1Var = this.f7502s0;
        x(c1Var.m, c1Var.l);
    }

    @Override
    public final void setShuffleModeEnabled(boolean z10) {
        A();
        if (this.I != z10) {
            this.I = z10;
            this.l.H.a(12, z10 ? 1 : 0, 0).b();
            androidx.media3.cast.o oVar = new androidx.media3.cast.o(1, z10);
            e7.p pVar = this.m;
            pVar.c(9, oVar);
            w();
            pVar.b();
        }
    }

    @Override
    public final void setTrackSelectionParameters(q2 q2Var) {
        q2 q2VarB;
        A();
        c3.b bVar = this.f7483i;
        bVar.getClass();
        q2 trackSelectionParameters = getTrackSelectionParameters();
        if (this.M) {
            this.N = q2Var.I;
            fh.e1 e1Var = this.O.f7387a;
            p2 p2VarA = q2Var.a();
            fh.s2 it = e1Var.iterator();
            while (it.hasNext()) {
                p2VarA.l(((Integer) it.next()).intValue(), true);
            }
            q2VarB = p2VarA.b();
        } else {
            q2VarB = q2Var;
        }
        if (!q2VarB.equals(((v7.p) bVar).v())) {
            bVar.q(q2VarB);
        }
        if (trackSelectionParameters.equals(q2Var)) {
            return;
        }
        this.m.f(19, new s(q2Var, 0));
    }

    @Override
    public final void setVideoSurface(Surface surface) {
        A();
        q();
        u(surface);
        int i10 = surface == null ? 0 : -1;
        o(i10, i10);
    }

    @Override
    public final void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        A();
        if (surfaceHolder == null) {
            clearVideoSurface();
            return;
        }
        q();
        this.Z = true;
        this.X = surfaceHolder;
        surfaceHolder.addCallback(this.f7508w);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            u(null);
            o(0, 0);
        } else {
            u(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            o(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        A();
        if (surfaceView instanceof y7.s) {
            q();
            u(surfaceView);
            t(surfaceView.getHolder());
            return;
        }
        if (!(surfaceView instanceof z7.k)) {
            setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
            return;
        }
        q();
        this.Y = (z7.k) surfaceView;
        f1 f1VarF = f(this.f7509x);
        ta.c0.A(!f1VarF.f7303j);
        f1VarF.f7297d = 10000;
        z7.k kVar = this.Y;
        ta.c0.A(!f1VarF.f7303j);
        f1VarF.f7298e = kVar;
        f1VarF.b();
        this.Y.A.add(this.f7508w);
        u(this.Y.getVideoSurface());
        t(surfaceView.getHolder());
    }

    @Override
    public final void setVideoTextureView(TextureView textureView) {
        A();
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        q();
        this.f7468a0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            e7.a.m("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f7508w);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            u(null);
            o(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            u(surface);
            this.W = surface;
            o(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override
    public final void setVolume(float f3) {
        A();
        float fG = e7.i0.g(f3, 0.0f, 1.0f);
        float f10 = this.f7476e0;
        if (f10 == fG) {
            return;
        }
        if (fG != 0.0f) {
            f10 = fG;
        }
        this.f7478f0 = f10;
        this.f7476e0 = fG;
        this.l.H.b(32, Float.valueOf(fG)).b();
        this.m.f(22, new androidx.media3.cast.q(fG, 1));
    }

    @Override
    public final void stop() {
        A();
        v(null);
        this.f7482h0 = new d7.c(this.f7502s0.f7263s, d2.E);
    }

    public final void t(SurfaceHolder surfaceHolder) {
        this.Z = false;
        this.X = surfaceHolder;
        surfaceHolder.addCallback(this.f7508w);
        Surface surface = this.X.getSurface();
        if (surface == null || !surface.isValid()) {
            o(0, 0);
        } else {
            Rect surfaceFrame = this.X.getSurfaceFrame();
            o(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void u(Object obj) {
        Object obj2 = this.V;
        boolean zC = true;
        boolean z10 = (obj2 == null || obj2 == obj) ? false : true;
        long j9 = z10 ? this.B : -9223372036854775807L;
        i0 i0Var = this.l;
        if (!i0Var.f7355j0 && i0Var.J.getThread().isAlive()) {
            e7.g gVar = new e7.g(i0Var.Q);
            i0Var.H.b(30, new Pair(obj, gVar)).b();
            if (j9 != -9223372036854775807L) {
                zC = gVar.c(j9);
            }
        }
        if (z10) {
            Object obj3 = this.V;
            Surface surface = this.W;
            if (obj3 == surface) {
                surface.release();
                this.W = null;
            }
        }
        this.V = obj;
        if (zC) {
            return;
        }
        v(new ExoPlaybackException(2, 1003, new ExoTimeoutException("Detaching surface timed out.")));
    }

    @Override
    public final void unmute() {
        A();
        if (this.f7476e0 == 0.0f) {
            float f3 = this.f7478f0;
            if (f3 != 0.0f) {
                setVolume(f3);
            }
        }
    }

    public final void v(ExoPlaybackException exoPlaybackException) {
        c1 c1Var = this.f7502s0;
        c1 c1VarC = c1Var.c(c1Var.f7248b);
        c1VarC.f7261q = c1VarC.f7263s;
        c1VarC.f7262r = 0L;
        c1 c1VarL = l(c1VarC, 1);
        if (exoPlaybackException != null) {
            c1VarL = c1VarL.f(exoPlaybackException);
        }
        c1 c1Var2 = c1VarL;
        this.J++;
        e7.d0 d0Var = this.l.H;
        d0Var.getClass();
        e7.c0 c0VarC = e7.d0.c();
        c0VarC.f5118a = d0Var.f5120a.obtainMessage(6);
        c0VarC.b();
        y(c1Var2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void w() {
        androidx.media3.common.b1 b1Var = this.S;
        androidx.media3.common.b1 b1VarO = e7.i0.o(this.f7477f, this.f7471c);
        this.S = b1VarO;
        if (b1VarO.equals(b1Var)) {
            return;
        }
        this.m.c(13, new q(this, 4));
    }

    public final void x(int i10, boolean z10) {
        int i11;
        if (this.M) {
            i11 = 4;
        } else {
            i11 = (this.f7502s0.f7258n != 1 || z10) ? 0 : 1;
        }
        c1 c1VarA = this.f7502s0;
        if (c1VarA.l == z10 && c1VarA.f7258n == i11 && c1VarA.m == i10) {
            return;
        }
        this.J++;
        if (c1VarA.f7260p) {
            c1VarA = c1VarA.a();
        }
        c1 c1VarE = c1VarA.e(i10, i11, z10);
        this.l.H.a(1, z10 ? 1 : 0, i10 | (i11 << 4)).b();
        y(c1VarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void y(final c1 c1Var, int i10, boolean z10, int i11, long j9, int i12, boolean z11) {
        int i13;
        Pair pair;
        int i14;
        androidx.media3.common.q0 q0Var;
        int i15;
        int i16;
        Object obj;
        androidx.media3.common.q0 q0Var2;
        Object obj2;
        long j10;
        long j11;
        long jK;
        long jK2;
        Object obj3;
        androidx.media3.common.q0 q0Var3;
        Object obj4;
        c1 c1Var2 = this.f7502s0;
        this.f7502s0 = c1Var;
        boolean zEquals = c1Var2.f7247a.equals(c1Var.f7247a);
        h2 h2Var = this.f7493o;
        k2 k2Var = c1Var2.f7247a;
        s7.a0 a0Var = c1Var2.f7248b;
        k2 k2Var2 = c1Var.f7247a;
        s7.a0 a0Var2 = c1Var.f7248b;
        if (k2Var2.isEmpty() && k2Var.isEmpty()) {
            pair = new Pair(Boolean.FALSE, -1);
            i13 = 2;
        } else {
            i13 = 2;
            if (k2Var2.isEmpty() != k2Var.isEmpty()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else if (!k2Var.getWindow(k2Var.getPeriodByUid(a0Var.f13644a, h2Var).f1233c, this.window).f1283a.equals(k2Var2.getWindow(k2Var2.getPeriodByUid(a0Var2.f13644a, h2Var).f1233c, this.window).f1283a)) {
                if (z10 && i11 == 0) {
                    i14 = 1;
                } else if (z10 && i11 == 1) {
                    i14 = 2;
                } else {
                    if (zEquals) {
                        throw new IllegalStateException();
                    }
                    i14 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i14));
            } else if (z10 && i11 == 0 && a0Var.f13647d < a0Var2.f13647d) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = (z10 && i11 == 1 && z11) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            q0Var = c1Var.f7247a.isEmpty() ? null : c1Var.f7247a.getWindow(c1Var.f7247a.getPeriodByUid(c1Var.f7248b.f13644a, this.f7493o).f1233c, this.window).f1285c;
            this.f7500r0 = androidx.media3.common.t0.K;
        } else {
            q0Var = null;
        }
        if (zBooleanValue || !c1Var2.f7256j.equals(c1Var.f7256j)) {
            androidx.media3.common.s0 s0VarA = this.f7500r0.a();
            List list = c1Var.f7256j;
            for (int i17 = 0; i17 < list.size(); i17++) {
                androidx.media3.common.v0 v0Var = (androidx.media3.common.v0) list.get(i17);
                int i18 = 0;
                while (true) {
                    androidx.media3.common.u0[] u0VarArr = v0Var.f1660a;
                    if (i18 < u0VarArr.length) {
                        u0VarArr[i18].b(s0VarA);
                        i18++;
                    }
                }
            }
            this.f7500r0 = new androidx.media3.common.t0(s0VarA);
        }
        androidx.media3.common.t0 t0VarD = d();
        boolean zEquals2 = t0VarD.equals(this.T);
        this.T = t0VarD;
        boolean z12 = c1Var2.l != c1Var.l;
        boolean z13 = c1Var2.f7251e != c1Var.f7251e;
        if (z13 || z12) {
            z();
        }
        boolean z14 = c1Var2.f7253g != c1Var.f7253g;
        if (!zEquals) {
            this.m.c(0, new androidx.media3.common.k1(c1Var, i10, 1));
        }
        if (z10) {
            h2 h2Var2 = new h2();
            if (c1Var2.f7247a.isEmpty()) {
                i15 = i12;
                i16 = i15;
                obj = null;
                q0Var2 = null;
                obj2 = null;
            } else {
                Object obj5 = c1Var2.f7248b.f13644a;
                c1Var2.f7247a.getPeriodByUid(obj5, h2Var2);
                int i19 = h2Var2.f1233c;
                int indexOfPeriod = c1Var2.f7247a.getIndexOfPeriod(obj5);
                obj = c1Var2.f7247a.getWindow(i19, this.window).f1283a;
                obj2 = obj5;
                i15 = i19;
                i16 = indexOfPeriod;
                q0Var2 = this.window.f1285c;
            }
            if (i11 == 0) {
                if (c1Var2.f7248b.b()) {
                    s7.a0 a0Var3 = c1Var2.f7248b;
                    jK = h2Var2.a(a0Var3.f13645b, a0Var3.f13646c);
                    jK2 = k(c1Var2);
                } else {
                    if (c1Var2.f7248b.f13648e != -1) {
                        jK = k(this.f7502s0);
                    } else {
                        j10 = h2Var2.f1235e;
                        j11 = h2Var2.f1234d;
                        jK = j10 + j11;
                    }
                    jK2 = jK;
                }
            } else if (c1Var2.f7248b.b()) {
                jK = c1Var2.f7263s;
                jK2 = k(c1Var2);
            } else {
                j10 = h2Var2.f1235e;
                j11 = c1Var2.f7263s;
                jK = j10 + j11;
                jK2 = jK;
            }
            long jW = e7.i0.W(jK);
            long jW2 = e7.i0.W(jK2);
            s7.a0 a0Var4 = c1Var2.f7248b;
            androidx.media3.common.e1 e1Var = new androidx.media3.common.e1(obj, i15, q0Var2, obj2, i16, jW, jW2, a0Var4.f13645b, a0Var4.f13646c);
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            int currentPeriodIndex = getCurrentPeriodIndex();
            if (this.f7502s0.f7247a.isEmpty()) {
                obj3 = null;
                q0Var3 = null;
                obj4 = null;
            } else {
                c1 c1Var3 = this.f7502s0;
                Object obj6 = c1Var3.f7248b.f13644a;
                c1Var3.f7247a.getPeriodByUid(obj6, this.f7493o);
                currentPeriodIndex = this.f7502s0.f7247a.getIndexOfPeriod(obj6);
                obj4 = obj6;
                obj3 = this.f7502s0.f7247a.getWindow(currentMediaItemIndex, this.window).f1283a;
                q0Var3 = this.window.f1285c;
            }
            int i20 = currentPeriodIndex;
            long jW3 = e7.i0.W(j9);
            long jW4 = this.f7502s0.f7248b.b() ? e7.i0.W(k(this.f7502s0)) : jW3;
            s7.a0 a0Var5 = this.f7502s0.f7248b;
            this.m.c(11, new androidx.media3.common.i1(i11, e1Var, new androidx.media3.common.e1(obj3, currentMediaItemIndex, q0Var3, obj4, i20, jW3, jW4, a0Var5.f13645b, a0Var5.f13646c), 1));
        } else {
            z12 = z12;
        }
        if (zBooleanValue) {
            this.m.c(1, new androidx.media3.common.j1(q0Var, iIntValue, 1));
        }
        if (c1Var2.f7252f != c1Var.f7252f) {
            final int i21 = 7;
            this.m.c(10, new e7.m() {
                @Override
                public final void invoke(Object obj7) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj7;
                    switch (i21) {
                        case 0:
                            c1 c1Var4 = c1Var;
                            d1Var.g(c1Var4.f7253g);
                            d1Var.k(c1Var4.f7253g);
                            break;
                        case 1:
                            c1 c1Var5 = c1Var;
                            d1Var.N(c1Var5.f7251e, c1Var5.l);
                            break;
                        case 2:
                            d1Var.r(c1Var.f7251e);
                            break;
                        case 3:
                            c1 c1Var6 = c1Var;
                            d1Var.m(c1Var6.m, c1Var6.l);
                            break;
                        case 4:
                            d1Var.f(c1Var.f7258n);
                            break;
                        case 5:
                            d1Var.V(c1Var.m());
                            break;
                        case 6:
                            d1Var.x(c1Var.f7259o);
                            break;
                        case 7:
                            d1Var.P(c1Var.f7252f);
                            break;
                        case 8:
                            d1Var.R(c1Var.f7252f);
                            break;
                        default:
                            d1Var.K(c1Var.f7255i.f15531d);
                            break;
                    }
                }
            });
            if (c1Var.f7252f != null) {
                final int i22 = 8;
                this.m.c(10, new e7.m() {
                    @Override
                    public final void invoke(Object obj7) {
                        androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj7;
                        switch (i22) {
                            case 0:
                                c1 c1Var4 = c1Var;
                                d1Var.g(c1Var4.f7253g);
                                d1Var.k(c1Var4.f7253g);
                                break;
                            case 1:
                                c1 c1Var5 = c1Var;
                                d1Var.N(c1Var5.f7251e, c1Var5.l);
                                break;
                            case 2:
                                d1Var.r(c1Var.f7251e);
                                break;
                            case 3:
                                c1 c1Var6 = c1Var;
                                d1Var.m(c1Var6.m, c1Var6.l);
                                break;
                            case 4:
                                d1Var.f(c1Var.f7258n);
                                break;
                            case 5:
                                d1Var.V(c1Var.m());
                                break;
                            case 6:
                                d1Var.x(c1Var.f7259o);
                                break;
                            case 7:
                                d1Var.P(c1Var.f7252f);
                                break;
                            case 8:
                                d1Var.R(c1Var.f7252f);
                                break;
                            default:
                                d1Var.K(c1Var.f7255i.f15531d);
                                break;
                        }
                    }
                });
            }
        }
        v7.u uVar = c1Var2.f7255i;
        v7.u uVar2 = c1Var.f7255i;
        if (uVar != uVar2) {
            c3.b bVar = this.f7483i;
            Object obj7 = uVar2.f15532e;
            bVar.getClass();
            final int i23 = 9;
            this.m.c(i13, new e7.m() {
                @Override
                public final void invoke(Object obj8) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj8;
                    switch (i23) {
                        case 0:
                            c1 c1Var4 = c1Var;
                            d1Var.g(c1Var4.f7253g);
                            d1Var.k(c1Var4.f7253g);
                            break;
                        case 1:
                            c1 c1Var5 = c1Var;
                            d1Var.N(c1Var5.f7251e, c1Var5.l);
                            break;
                        case 2:
                            d1Var.r(c1Var.f7251e);
                            break;
                        case 3:
                            c1 c1Var6 = c1Var;
                            d1Var.m(c1Var6.m, c1Var6.l);
                            break;
                        case 4:
                            d1Var.f(c1Var.f7258n);
                            break;
                        case 5:
                            d1Var.V(c1Var.m());
                            break;
                        case 6:
                            d1Var.x(c1Var.f7259o);
                            break;
                        case 7:
                            d1Var.P(c1Var.f7252f);
                            break;
                        case 8:
                            d1Var.R(c1Var.f7252f);
                            break;
                        default:
                            d1Var.K(c1Var.f7255i.f15531d);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.m.c(14, new n(this.T, 0));
        }
        if (z14) {
            final int i24 = 0;
            this.m.c(3, new e7.m() {
                @Override
                public final void invoke(Object obj8) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj8;
                    switch (i24) {
                        case 0:
                            c1 c1Var4 = c1Var;
                            d1Var.g(c1Var4.f7253g);
                            d1Var.k(c1Var4.f7253g);
                            break;
                        case 1:
                            c1 c1Var5 = c1Var;
                            d1Var.N(c1Var5.f7251e, c1Var5.l);
                            break;
                        case 2:
                            d1Var.r(c1Var.f7251e);
                            break;
                        case 3:
                            c1 c1Var6 = c1Var;
                            d1Var.m(c1Var6.m, c1Var6.l);
                            break;
                        case 4:
                            d1Var.f(c1Var.f7258n);
                            break;
                        case 5:
                            d1Var.V(c1Var.m());
                            break;
                        case 6:
                            d1Var.x(c1Var.f7259o);
                            break;
                        case 7:
                            d1Var.P(c1Var.f7252f);
                            break;
                        case 8:
                            d1Var.R(c1Var.f7252f);
                            break;
                        default:
                            d1Var.K(c1Var.f7255i.f15531d);
                            break;
                    }
                }
            });
        }
        if (z13 || z12) {
            final int i25 = 1;
            this.m.c(-1, new e7.m() {
                @Override
                public final void invoke(Object obj8) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj8;
                    switch (i25) {
                        case 0:
                            c1 c1Var4 = c1Var;
                            d1Var.g(c1Var4.f7253g);
                            d1Var.k(c1Var4.f7253g);
                            break;
                        case 1:
                            c1 c1Var5 = c1Var;
                            d1Var.N(c1Var5.f7251e, c1Var5.l);
                            break;
                        case 2:
                            d1Var.r(c1Var.f7251e);
                            break;
                        case 3:
                            c1 c1Var6 = c1Var;
                            d1Var.m(c1Var6.m, c1Var6.l);
                            break;
                        case 4:
                            d1Var.f(c1Var.f7258n);
                            break;
                        case 5:
                            d1Var.V(c1Var.m());
                            break;
                        case 6:
                            d1Var.x(c1Var.f7259o);
                            break;
                        case 7:
                            d1Var.P(c1Var.f7252f);
                            break;
                        case 8:
                            d1Var.R(c1Var.f7252f);
                            break;
                        default:
                            d1Var.K(c1Var.f7255i.f15531d);
                            break;
                    }
                }
            });
        }
        if (z13) {
            final int i26 = 2;
            this.m.c(4, new e7.m() {
                @Override
                public final void invoke(Object obj8) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj8;
                    switch (i26) {
                        case 0:
                            c1 c1Var4 = c1Var;
                            d1Var.g(c1Var4.f7253g);
                            d1Var.k(c1Var4.f7253g);
                            break;
                        case 1:
                            c1 c1Var5 = c1Var;
                            d1Var.N(c1Var5.f7251e, c1Var5.l);
                            break;
                        case 2:
                            d1Var.r(c1Var.f7251e);
                            break;
                        case 3:
                            c1 c1Var6 = c1Var;
                            d1Var.m(c1Var6.m, c1Var6.l);
                            break;
                        case 4:
                            d1Var.f(c1Var.f7258n);
                            break;
                        case 5:
                            d1Var.V(c1Var.m());
                            break;
                        case 6:
                            d1Var.x(c1Var.f7259o);
                            break;
                        case 7:
                            d1Var.P(c1Var.f7252f);
                            break;
                        case 8:
                            d1Var.R(c1Var.f7252f);
                            break;
                        default:
                            d1Var.K(c1Var.f7255i.f15531d);
                            break;
                    }
                }
            });
        }
        if (z12 || c1Var2.m != c1Var.m) {
            final int i27 = 3;
            this.m.c(5, new e7.m() {
                @Override
                public final void invoke(Object obj8) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj8;
                    switch (i27) {
                        case 0:
                            c1 c1Var4 = c1Var;
                            d1Var.g(c1Var4.f7253g);
                            d1Var.k(c1Var4.f7253g);
                            break;
                        case 1:
                            c1 c1Var5 = c1Var;
                            d1Var.N(c1Var5.f7251e, c1Var5.l);
                            break;
                        case 2:
                            d1Var.r(c1Var.f7251e);
                            break;
                        case 3:
                            c1 c1Var6 = c1Var;
                            d1Var.m(c1Var6.m, c1Var6.l);
                            break;
                        case 4:
                            d1Var.f(c1Var.f7258n);
                            break;
                        case 5:
                            d1Var.V(c1Var.m());
                            break;
                        case 6:
                            d1Var.x(c1Var.f7259o);
                            break;
                        case 7:
                            d1Var.P(c1Var.f7252f);
                            break;
                        case 8:
                            d1Var.R(c1Var.f7252f);
                            break;
                        default:
                            d1Var.K(c1Var.f7255i.f15531d);
                            break;
                    }
                }
            });
        }
        if (c1Var2.f7258n != c1Var.f7258n) {
            final int i28 = 4;
            this.m.c(6, new e7.m() {
                @Override
                public final void invoke(Object obj8) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj8;
                    switch (i28) {
                        case 0:
                            c1 c1Var4 = c1Var;
                            d1Var.g(c1Var4.f7253g);
                            d1Var.k(c1Var4.f7253g);
                            break;
                        case 1:
                            c1 c1Var5 = c1Var;
                            d1Var.N(c1Var5.f7251e, c1Var5.l);
                            break;
                        case 2:
                            d1Var.r(c1Var.f7251e);
                            break;
                        case 3:
                            c1 c1Var6 = c1Var;
                            d1Var.m(c1Var6.m, c1Var6.l);
                            break;
                        case 4:
                            d1Var.f(c1Var.f7258n);
                            break;
                        case 5:
                            d1Var.V(c1Var.m());
                            break;
                        case 6:
                            d1Var.x(c1Var.f7259o);
                            break;
                        case 7:
                            d1Var.P(c1Var.f7252f);
                            break;
                        case 8:
                            d1Var.R(c1Var.f7252f);
                            break;
                        default:
                            d1Var.K(c1Var.f7255i.f15531d);
                            break;
                    }
                }
            });
        }
        if (c1Var2.m() != c1Var.m()) {
            final int i29 = 5;
            this.m.c(7, new e7.m() {
                @Override
                public final void invoke(Object obj8) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj8;
                    switch (i29) {
                        case 0:
                            c1 c1Var4 = c1Var;
                            d1Var.g(c1Var4.f7253g);
                            d1Var.k(c1Var4.f7253g);
                            break;
                        case 1:
                            c1 c1Var5 = c1Var;
                            d1Var.N(c1Var5.f7251e, c1Var5.l);
                            break;
                        case 2:
                            d1Var.r(c1Var.f7251e);
                            break;
                        case 3:
                            c1 c1Var6 = c1Var;
                            d1Var.m(c1Var6.m, c1Var6.l);
                            break;
                        case 4:
                            d1Var.f(c1Var.f7258n);
                            break;
                        case 5:
                            d1Var.V(c1Var.m());
                            break;
                        case 6:
                            d1Var.x(c1Var.f7259o);
                            break;
                        case 7:
                            d1Var.P(c1Var.f7252f);
                            break;
                        case 8:
                            d1Var.R(c1Var.f7252f);
                            break;
                        default:
                            d1Var.K(c1Var.f7255i.f15531d);
                            break;
                    }
                }
            });
        }
        if (!c1Var2.f7259o.equals(c1Var.f7259o)) {
            final int i30 = 6;
            this.m.c(12, new e7.m() {
                @Override
                public final void invoke(Object obj8) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj8;
                    switch (i30) {
                        case 0:
                            c1 c1Var4 = c1Var;
                            d1Var.g(c1Var4.f7253g);
                            d1Var.k(c1Var4.f7253g);
                            break;
                        case 1:
                            c1 c1Var5 = c1Var;
                            d1Var.N(c1Var5.f7251e, c1Var5.l);
                            break;
                        case 2:
                            d1Var.r(c1Var.f7251e);
                            break;
                        case 3:
                            c1 c1Var6 = c1Var;
                            d1Var.m(c1Var6.m, c1Var6.l);
                            break;
                        case 4:
                            d1Var.f(c1Var.f7258n);
                            break;
                        case 5:
                            d1Var.V(c1Var.m());
                            break;
                        case 6:
                            d1Var.x(c1Var.f7259o);
                            break;
                        case 7:
                            d1Var.P(c1Var.f7252f);
                            break;
                        case 8:
                            d1Var.R(c1Var.f7252f);
                            break;
                        default:
                            d1Var.K(c1Var.f7255i.f15531d);
                            break;
                    }
                }
            });
        }
        w();
        this.m.b();
        if (c1Var2.f7260p != c1Var.f7260p) {
            Iterator it = this.f7491n.iterator();
            while (it.hasNext()) {
                ((v) it.next()).A.z();
            }
        }
    }

    public final void z() {
        int playbackState = getPlaybackState();
        a8.o0 o0Var = this.A;
        e7.l0 l0Var = this.f7511z;
        boolean z10 = false;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                A();
                boolean z11 = this.f7502s0.f7260p;
                if (getPlayWhenReady() && !z11) {
                    z10 = true;
                }
                l0Var.f(z10);
                o0Var.a(getPlayWhenReady());
                return;
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        l0Var.f(false);
        o0Var.a(false);
    }
}
