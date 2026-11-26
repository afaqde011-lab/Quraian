package y7;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.h2;
import androidx.media3.common.k2;
import androidx.media3.common.v2;
import androidx.media3.common.w2;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.video.MediaCodecVideoDecoderException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import b3.g1;
import com.google.android.gms.cast.Cast;
import e7.i0;
import fh.d2;
import fh.r0;
import fh.t0;
import i7.i1;
import i7.k1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import k9.x0;
import s7.a1;
import sd.y1;

public final class h extends p7.m {
    public static final int[] W1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean X1;
    public static boolean Y1;
    public int A1;
    public long B1;
    public int C1;
    public int D1;
    public int E1;
    public k1 F1;
    public long G1;
    public boolean H1;
    public long I1;
    public int J1;
    public long K1;
    public w2 L1;
    public w2 M1;
    public int N1;
    public boolean O1;
    public int P1;
    public oe.l Q1;
    public t R1;
    public long S1;
    public long T1;
    public boolean U1;
    public int V1;

    public final Context f16673e1;

    public final boolean f16674f1;

    public final k7.n f16675g1;

    public final int f16676h1;

    public final boolean f16677i1;

    public final u f16678j1;

    public final l50.d f16679k1;

    public final long f16680l1;

    public final v f16681m1;

    public final PriorityQueue f16682n1;

    public a8.d f16683o1;

    public boolean f16684p1;

    public boolean f16685q1;

    public c0 f16686r1;

    public boolean f16687s1;

    public int f16688t1;

    public List f16689u1;

    public Surface f16690v1;

    public j f16691w1;

    public e7.v f16692x1;

    public boolean f16693y1;

    public int f16694z1;

    public h(g gVar) {
        super(2, gVar.f16667c, gVar.f16669e, 30.0f);
        Context applicationContext = gVar.f16665a.getApplicationContext();
        this.f16673e1 = applicationContext;
        this.f16676h1 = gVar.f16672h;
        this.f16686r1 = null;
        this.f16675g1 = new k7.n(gVar.f16670f, gVar.f16671g, 1);
        this.f16674f1 = this.f16686r1 == null;
        this.f16678j1 = new u(applicationContext, this, gVar.f16668d);
        this.f16679k1 = new l50.d();
        this.f16677i1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.f16692x1 = e7.v.f5185c;
        this.f16694z1 = 1;
        this.A1 = 0;
        this.L1 = w2.f1669d;
        this.P1 = 0;
        this.M1 = null;
        this.N1 = -1000;
        this.S1 = -9223372036854775807L;
        this.T1 = -9223372036854775807L;
        this.f16682n1 = new PriorityQueue();
        this.f16680l1 = -9223372036854775807L;
        this.f16681m1 = null;
        this.F1 = null;
    }

    public static boolean C0(String str) {
        boolean z10 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (h.class) {
            try {
                if (!X1) {
                    String str2 = Build.MODEL;
                    str2.getClass();
                    switch (str2) {
                        case "AFTJMST12":
                        case "AFTKMST12":
                        case "AFTA":
                        case "AFTN":
                        case "AFTR":
                        case "AFTEU011":
                        case "AFTEU014":
                        case "AFTSO001":
                        case "AFTEUFF014":
                            z10 = true;
                            break;
                    }
                    Y1 = z10;
                    X1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return Y1;
    }

    public static int D0(p7.k kVar, androidx.media3.common.t tVar) {
        int i10 = tVar.f1601u;
        int i11 = tVar.f1602v;
        if (i10 != -1 && i11 != -1) {
            String str = tVar.f1594n;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair pairB = e7.e.b(tVar);
                if (pairB == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = "video/avc";
                    } else if (iIntValue == 1024) {
                        str = "video/av01";
                    } else {
                        str = "video/hevc";
                    }
                }
            }
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return ((i10 * i11) * 3) / 4;
                case "video/hevc":
                    return Math.max(2097152, ((i10 * i11) * 3) / 4);
                case "video/avc":
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !kVar.f12400f)))) {
                        return ((i0.f(i11, 16) * i0.f(i10, 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i10 * i11) * 3) / 8;
            }
        }
        return -1;
    }

    public static List E0(Context context, p7.h hVar, androidx.media3.common.t tVar, boolean z10, boolean z11) {
        String str = tVar.f1594n;
        if (str == null) {
            return d2.E;
        }
        if ("video/dolby-vision".equals(str) && !w50.c.z(context)) {
            String strA = p7.p.a(tVar);
            List listB = strA == null ? d2.E : hVar.b(strA, z10, z11);
            if (!listB.isEmpty()) {
                return listB;
            }
        }
        return p7.p.e(hVar, tVar, z10, z11);
    }

    public static int F0(p7.k kVar, androidx.media3.common.t tVar) {
        int i10 = tVar.f1595o;
        List list = tVar.f1597q;
        if (i10 == -1) {
            return D0(kVar, tVar);
        }
        int size = list.size();
        int length = 0;
        for (int i11 = 0; i11 < size; i11++) {
            length += ((byte[]) list.get(i11)).length;
        }
        return tVar.f1595o + length;
    }

    @Override
    public final void A(float f3, float f10) {
        super.A(f3, f10);
        c0 c0Var = this.f16686r1;
        if (c0Var != null) {
            c0Var.setPlaybackSpeed(f3);
        } else {
            this.f16678j1.h(f3);
        }
        v vVar = this.f16681m1;
        if (vVar != null) {
            vVar.c(f3);
        }
    }

    @Override
    public final boolean D(long j9) {
        if (this.N0 == -9223372036854775807L || j9 < this.G1) {
            return false;
        }
        long j10 = this.V0;
        return j10 == -9223372036854775807L || j9 > j10;
    }

    @Override
    public final i7.d G(p7.k kVar, androidx.media3.common.t tVar, androidx.media3.common.t tVar2) {
        i7.d dVarB = kVar.b(tVar, tVar2);
        int i10 = dVarB.f7269e;
        a8.d dVar = this.f16683o1;
        dVar.getClass();
        if (tVar2.f1601u > dVar.f238a || tVar2.f1602v > dVar.f239b) {
            i10 |= 256;
        }
        if (F0(kVar, tVar2) > dVar.f240c) {
            i10 |= 64;
        }
        int i11 = i10;
        return new i7.d(kVar.f12395a, tVar, tVar2, i11 != 0 ? 0 : dVarB.f7268d, i11);
    }

    public final Surface G0(p7.k kVar) {
        boolean z10;
        i iVar;
        int i10;
        RuntimeException runtimeException;
        Error error;
        c0 c0Var = this.f16686r1;
        if (c0Var != null) {
            return c0Var.c();
        }
        Surface surface = this.f16690v1;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && kVar.f12402h) {
            return null;
        }
        ta.c0.A(O0(kVar));
        j jVar = this.f16691w1;
        if (jVar != null && jVar.A != kVar.f12400f && jVar != null) {
            jVar.release();
            this.f16691w1 = null;
        }
        if (this.f16691w1 == null) {
            boolean z11 = kVar.f12400f;
            boolean z12 = false;
            if (z11) {
                if (!j.a()) {
                    z10 = false;
                }
                ta.c0.A(z10);
                iVar = new i("ExoPlayer:PlaceholderSurface");
                if (z11) {
                    i10 = j.D;
                } else {
                    i10 = 0;
                }
                iVar.start();
                Handler handler = new Handler(iVar.getLooper(), iVar);
                iVar.B = handler;
                iVar.A = new e7.j(handler);
                synchronized (iVar) {
                    iVar.B.obtainMessage(1, i10, 0).sendToTarget();
                    while (iVar.E == null && iVar.D == null && iVar.C == null) {
                        try {
                            iVar.wait();
                        } catch (InterruptedException unused) {
                            z12 = true;
                        }
                    }
                }
                if (z12) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = iVar.D;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = iVar.C;
                if (error == null) {
                    throw error;
                }
                j jVar2 = iVar.E;
                jVar2.getClass();
                this.f16691w1 = jVar2;
            } else {
                int i11 = j.D;
            }
            z10 = true;
            ta.c0.A(z10);
            iVar = new i("ExoPlayer:PlaceholderSurface");
            if (z11) {
                i10 = j.D;
            } else {
                i10 = 0;
            }
            iVar.start();
            Handler handler2 = new Handler(iVar.getLooper(), iVar);
            iVar.B = handler2;
            iVar.A = new e7.j(handler2);
            synchronized (iVar) {
                iVar.B.obtainMessage(1, i10, 0).sendToTarget();
                while (iVar.E == null) {
                    iVar.wait();
                }
                if (z12) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = iVar.D;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = iVar.C;
                if (error == null) {
                    throw error;
                }
                j jVar3 = iVar.E;
                jVar3.getClass();
                this.f16691w1 = jVar3;
            }
        }
        return this.f16691w1;
    }

    @Override
    public final MediaCodecDecoderException H(IllegalStateException illegalStateException, p7.k kVar) {
        Surface surface = this.f16690v1;
        MediaCodecVideoDecoderException mediaCodecVideoDecoderException = new MediaCodecVideoDecoderException(illegalStateException, kVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecVideoDecoderException;
    }

    public final boolean H0(p7.k kVar) {
        if (this.f16686r1 != null) {
            return true;
        }
        Surface surface = this.f16690v1;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && kVar.f12402h) || O0(kVar);
        }
        return true;
    }

    public final boolean I0(h7.e eVar) {
        if (j() || eVar.c(536870912)) {
            return true;
        }
        long j9 = this.T1;
        return j9 == -9223372036854775807L || j9 - (eVar.G - this.U0.f12409c) <= 100000;
    }

    public final void J0() {
        if (this.C1 > 0) {
            this.G.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j9 = jElapsedRealtime - this.B1;
            int i10 = this.C1;
            k7.n nVar = this.f16675g1;
            Handler handler = nVar.f9111a;
            if (handler != null) {
                handler.post(new z(nVar, i10, j9));
            }
            this.C1 = 0;
            this.B1 = jElapsedRealtime;
        }
    }

    public final void K0() {
        g1 g1Var;
        if (this.O1 && (g1Var = this.f12429n0) != null) {
            this.Q1 = new oe.l(this, g1Var);
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            g1Var.k(bundle);
        }
    }

    public final void L0(g1 g1Var, int i10, long j9) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        ((MediaCodec) g1Var.f2030d).releaseOutputBuffer(i10, j9);
        Trace.endSection();
        this.T0.f7238e++;
        this.D1 = 0;
        if (this.f16686r1 == null) {
            w2 w2Var = this.L1;
            boolean zEquals = w2Var.equals(w2.f1669d);
            k7.n nVar = this.f16675g1;
            if (!zEquals && !w2Var.equals(this.M1)) {
                this.M1 = w2Var;
                nVar.b(w2Var);
            }
            u uVar = this.f16678j1;
            boolean z10 = uVar.f16729e != 3;
            uVar.f16729e = 3;
            uVar.l.getClass();
            uVar.f16731g = i0.H(SystemClock.elapsedRealtime());
            if (!z10 || (surface = this.f16690v1) == null) {
                return;
            }
            Handler handler = nVar.f9111a;
            if (handler != null) {
                handler.post(new oi.r(nVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f16693y1 = true;
        }
    }

    public final void M0(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f16690v1;
        k7.n nVar = this.f16675g1;
        if (surface2 == surface) {
            if (surface != null) {
                w2 w2Var = this.M1;
                if (w2Var != null) {
                    nVar.b(w2Var);
                }
                Surface surface3 = this.f16690v1;
                if (surface3 == null || !this.f16693y1 || (handler = nVar.f9111a) == null) {
                    return;
                }
                handler.post(new oi.r(nVar, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.f16690v1 = surface;
        c0 c0Var = this.f16686r1;
        u uVar = this.f16678j1;
        if (c0Var == null) {
            uVar.g(surface);
        }
        this.f16693y1 = false;
        int i10 = this.H;
        g1 g1Var = this.f12429n0;
        if (g1Var != null && this.f16686r1 == null) {
            p7.k kVar = this.f12436u0;
            kVar.getClass();
            if (!H0(kVar) || this.f16684p1) {
                m0();
                W();
            } else {
                Surface surfaceG0 = G0(kVar);
                if (surfaceG0 != null) {
                    ((MediaCodec) g1Var.f2030d).setOutputSurface(surfaceG0);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    ((MediaCodec) g1Var.f2030d).detachOutputSurface();
                }
            }
        }
        if (surface != null) {
            w2 w2Var2 = this.M1;
            if (w2Var2 != null) {
                nVar.b(w2Var2);
            }
        } else {
            this.M1 = null;
            c0 c0Var2 = this.f16686r1;
            if (c0Var2 != null) {
                c0Var2.i();
            }
        }
        if (i10 == 2) {
            c0 c0Var3 = this.f16686r1;
            if (c0Var3 != null) {
                c0Var3.o(true);
            } else {
                uVar.c(true);
            }
        }
        K0();
    }

    @Override
    public final int N(h7.e eVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.F1 == null && !this.O1) || eVar.G >= this.L || I0(eVar)) ? 0 : 32;
        }
        return 0;
    }

    public final boolean N0(long j9, long j10, boolean z10, boolean z11) {
        if (this.f16686r1 != null && this.f16674f1) {
            j10 -= -this.S1;
        }
        if (j9 < -500000 && !z10) {
            a1 a1Var = this.I;
            a1Var.getClass();
            int iL = a1Var.l(j10 - this.K);
            if (iL != 0) {
                this.G1 = j10;
                PriorityQueue priorityQueue = this.f16682n1;
                if (z11) {
                    i7.c cVar = this.T0;
                    int i10 = cVar.f7237d + iL;
                    cVar.f7237d = i10;
                    cVar.f7239f += this.E1;
                    cVar.f7237d = priorityQueue.size() + i10;
                } else {
                    this.T0.f7243j++;
                    Q0(priorityQueue.size() + iL, this.E1);
                }
                if (this.f12429n0 != null) {
                    if (w0()) {
                        m0();
                        W();
                    } else if (u0()) {
                        L();
                    } else {
                        this.Y0 = true;
                    }
                }
                c0 c0Var = this.f16686r1;
                if (c0Var != null) {
                    c0Var.k(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final float O(float f3, androidx.media3.common.t tVar, androidx.media3.common.t[] tVarArr) {
        p7.k kVar;
        float fMax = -1.0f;
        for (androidx.media3.common.t tVar2 : tVarArr) {
            float f10 = tVar2.f1605y;
            if (f10 != -1.0f) {
                fMax = Math.max(fMax, f10);
            }
        }
        float f11 = fMax == -1.0f ? -1.0f : fMax * f3;
        if (this.F1 == null || (kVar = this.f12436u0) == null) {
            return f11;
        }
        int i10 = tVar.f1601u;
        int i11 = tVar.f1602v;
        float f12 = -3.4028235E38f;
        if (kVar.f12403i) {
            float f13 = kVar.l;
            if (f13 != -3.4028235E38f && kVar.f12404j == i10 && kVar.f12405k == i11) {
                f12 = f13;
            } else {
                float f14 = 1024.0f;
                if (!kVar.g(i10, i11, 1024.0f)) {
                    f12 = 0.0f;
                    while (true) {
                        float f15 = f14 - f12;
                        if (Math.abs(f15) <= 5.0f) {
                            break;
                        }
                        float f16 = (f15 / 2.0f) + f12;
                        if (kVar.g(i10, i11, f16)) {
                            f12 = f16;
                        } else {
                            f14 = f16;
                        }
                    }
                } else {
                    f12 = 1024.0f;
                }
                kVar.l = f12;
                kVar.f12404j = i10;
                kVar.f12405k = i11;
            }
        }
        return f11 != -1.0f ? Math.max(f11, f12) : f12;
    }

    public final boolean O0(p7.k kVar) {
        if (this.O1 || C0(kVar.f12395a)) {
            return false;
        }
        return !kVar.f12400f || j.a();
    }

    @Override
    public final ArrayList P(p7.h hVar, androidx.media3.common.t tVar, boolean z10) {
        List listE0 = E0(this.f16673e1, hVar, tVar, z10, this.O1);
        HashMap map = p7.p.f12445a;
        ArrayList arrayList = new ArrayList(listE0);
        Collections.sort(arrayList, new fg.d(new k7.t(tVar, 17), 3));
        return arrayList;
    }

    public final void P0(g1 g1Var, int i10) {
        Trace.beginSection("skipVideoBuffer");
        g1Var.i(i10);
        Trace.endSection();
        this.T0.f7239f++;
    }

    public final void Q0(int i10, int i11) {
        i7.c cVar = this.T0;
        cVar.f7241h += i10;
        int i12 = i10 + i11;
        cVar.f7240g += i12;
        this.C1 += i12;
        int i13 = this.D1 + i12;
        this.D1 = i13;
        cVar.f7242i = Math.max(i13, cVar.f7242i);
        int i14 = this.f16676h1;
        if (i14 <= 0 || this.C1 < i14) {
            return;
        }
        J0();
    }

    public final void R0(s7.a0 a0Var) {
        k2 k2Var = this.P;
        if (k2Var.isEmpty()) {
            this.T1 = -9223372036854775807L;
            return;
        }
        int indexOfPeriod = k2Var.getIndexOfPeriod(a0Var.f13644a);
        if (indexOfPeriod == -1) {
            this.T1 = -9223372036854775807L;
        } else {
            this.T1 = k2Var.getPeriod(indexOfPeriod, new h2()).f1234d;
        }
    }

    @Override
    public final y1 S(p7.k kVar, androidx.media3.common.t tVar, MediaCrypto mediaCrypto, float f3) {
        androidx.media3.common.i iVar;
        int i10;
        a8.d dVar;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        byte b7;
        boolean z10;
        Pair pairB;
        int iD0;
        String str = kVar.f12397c;
        androidx.media3.common.t[] tVarArr = this.J;
        tVarArr.getClass();
        int i11 = tVar.f1601u;
        float f10 = tVar.f1605y;
        androidx.media3.common.i iVar2 = tVar.D;
        int i12 = tVar.f1602v;
        int iF0 = F0(kVar, tVar);
        if (tVarArr.length == 1) {
            if (iF0 != -1 && (iD0 = D0(kVar, tVar)) != -1) {
                iF0 = Math.min((int) (iF0 * 1.5f), iD0);
            }
            dVar = new a8.d(i11, i12, iF0);
            iVar = iVar2;
            i10 = i12;
        } else {
            int length = tVarArr.length;
            int iMax = i11;
            int iMax2 = i12;
            int i13 = 0;
            boolean z11 = false;
            while (i13 < length) {
                androidx.media3.common.t tVar2 = tVarArr[i13];
                androidx.media3.common.t[] tVarArr2 = tVarArr;
                if (iVar2 != null && tVar2.D == null) {
                    androidx.media3.common.s sVarA = tVar2.a();
                    sVarA.C = iVar2;
                    tVar2 = new androidx.media3.common.t(sVarA);
                }
                i7.d dVarB = kVar.b(tVar, tVar2);
                int i14 = length;
                int i15 = tVar2.f1602v;
                if (dVarB.f7268d != 0) {
                    int i16 = tVar2.f1601u;
                    b7 = -1;
                    z11 |= i16 == -1 || i15 == -1;
                    iMax = Math.max(iMax, i16);
                    iMax2 = Math.max(iMax2, i15);
                    iF0 = Math.max(iF0, F0(kVar, tVar2));
                } else {
                    b7 = -1;
                }
                length = i14;
                i13++;
                tVarArr = tVarArr2;
            }
            if (z11) {
                e7.a.m("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z12 = i12 > i11;
                int i17 = z12 ? i12 : i11;
                boolean z13 = z12;
                int i18 = z12 ? i11 : i12;
                float f11 = i18 / i17;
                int i19 = 0;
                while (true) {
                    iVar = iVar2;
                    if (i19 < 9) {
                        int i20 = W1[i19];
                        int i21 = i19;
                        int i22 = (int) (i20 * f11);
                        if (i20 > i17 && i22 > i18) {
                            if (!z13) {
                                i22 = i20;
                            }
                            if (!z13) {
                                i20 = i22;
                            }
                            int i23 = i18;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = kVar.f12398d;
                            if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                point = null;
                            } else {
                                int widthAlignment = videoCapabilities.getWidthAlignment();
                                int heightAlignment = videoCapabilities.getHeightAlignment();
                                point = new Point(i0.f(i22, widthAlignment) * widthAlignment, i0.f(i20, heightAlignment) * heightAlignment);
                            }
                            if (point != null) {
                                i10 = i12;
                                if (kVar.g(point.x, point.y, f10)) {
                                }
                            } else {
                                i10 = i12;
                            }
                            i19 = i21 + 1;
                            i12 = i10;
                            iVar2 = iVar;
                            i18 = i23;
                            i17 = i17;
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            androidx.media3.common.s sVarA2 = tVar.a();
                            sVarA2.f1508t = iMax;
                            sVarA2.f1509u = iMax2;
                            iF0 = Math.max(iF0, D0(kVar, new androidx.media3.common.t(sVarA2)));
                            e7.a.m("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                        }
                    }
                    i10 = i12;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        androidx.media3.common.s sVarA3 = tVar.a();
                        sVarA3.f1508t = iMax;
                        sVarA3.f1509u = iMax2;
                        iF0 = Math.max(iF0, D0(kVar, new androidx.media3.common.t(sVarA3)));
                        e7.a.m("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                    }
                }
            } else {
                iVar = iVar2;
                i10 = i12;
            }
            dVar = new a8.d(iMax, iMax2, iF0);
        }
        this.f16683o1 = dVar;
        int i24 = this.O1 ? this.P1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i11);
        mediaFormat.setInteger("height", i10);
        e7.a.l(mediaFormat, tVar.f1597q);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        e7.a.k(mediaFormat, "rotation-degrees", tVar.f1606z);
        if (iVar != null) {
            androidx.media3.common.i iVar3 = iVar;
            e7.a.k(mediaFormat, "color-transfer", iVar3.f1245c);
            e7.a.k(mediaFormat, "color-standard", iVar3.f1243a);
            e7.a.k(mediaFormat, "color-range", iVar3.f1244b);
            byte[] bArr = iVar3.f1246d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(tVar.f1594n) && (pairB = e7.e.b(tVar)) != null) {
            e7.a.k(mediaFormat, "profile", ((Integer) pairB.first).intValue());
        }
        mediaFormat.setInteger("max-width", dVar.f238a);
        mediaFormat.setInteger("max-height", dVar.f239b);
        e7.a.k(mediaFormat, "max-input-size", dVar.f240c);
        mediaFormat.setInteger("priority", 0);
        if (f3 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f3);
        }
        if (this.f16677i1) {
            z10 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z10 = true;
        }
        if (i24 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z10);
            mediaFormat.setInteger("audio-session-id", i24);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.N1));
        }
        E(mediaFormat);
        Surface surfaceG0 = G0(kVar);
        if (this.f16686r1 != null && !i0.E(this.f16673e1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new y1(kVar, mediaFormat, tVar, surfaceG0, mediaCrypto, (x0) null);
    }

    public final void S0(long j9) {
        i7.c cVar = this.T0;
        cVar.f7244k += j9;
        cVar.l++;
        this.I1 += j9;
        this.J1++;
    }

    @Override
    public final void T(h7.e eVar) {
        if (this.f16685q1) {
            ByteBuffer byteBuffer = eVar.H;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b7 = byteBuffer.get();
                short s6 = byteBuffer.getShort();
                short s10 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b7 == -75 && s6 == 60 && s10 == 1 && b10 == 4) {
                    if (b11 == 0 || b11 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        g1 g1Var = this.f12429n0;
                        g1Var.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        g1Var.k(bundle);
                    }
                }
            }
        }
    }

    @Override
    public final boolean Y(androidx.media3.common.t tVar) throws ExoPlaybackException {
        c0 c0Var = this.f16686r1;
        if (c0Var == null || c0Var.isInitialized()) {
            return true;
        }
        try {
            return this.f16686r1.s(tVar);
        } catch (VideoSink$VideoSinkException e3) {
            throw d(e3, tVar, false, 7000);
        }
    }

    @Override
    public final void Z(Exception exc) {
        e7.a.e("MediaCodecVideoRenderer", "Video codec error", exc);
        k7.n nVar = this.f16675g1;
        Handler handler = nVar.f9111a;
        if (handler != null) {
            handler.post(new z(nVar, exc, 1));
        }
    }

    @Override
    public final void a0(long j9, long j10, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        k7.n nVar = this.f16675g1;
        Handler handler = nVar.f9111a;
        if (handler != null) {
            str2 = str;
            handler.post(new z(nVar, str2, j9, j10));
        } else {
            str2 = str;
        }
        this.f16684p1 = C0(str2);
        p7.k kVar = this.f12436u0;
        kVar.getClass();
        boolean z10 = false;
        if ("video/x-vnd.on2.vp9".equals(kVar.f12396b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = kVar.f12398d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z10 = true;
                    break;
                }
            }
        }
        this.f16685q1 = z10;
        K0();
    }

    @Override
    public final void b0(i7.b bVar) {
        k7.n nVar = this.f16675g1;
        Handler handler = nVar.f9111a;
        if (handler != null) {
            handler.post(new oi.p(nVar, bVar, 12));
        }
    }

    @Override
    public final void c0(String str) {
        k7.n nVar = this.f16675g1;
        Handler handler = nVar.f9111a;
        if (handler != null) {
            handler.post(new z(nVar, str, 2));
        }
    }

    @Override
    public final i7.d d0(h7.b bVar) {
        i7.d dVarD0 = super.d0(bVar);
        androidx.media3.common.t tVar = (androidx.media3.common.t) bVar.B;
        tVar.getClass();
        k7.n nVar = this.f16675g1;
        Handler handler = nVar.f9111a;
        if (handler != null) {
            handler.post(new z(nVar, tVar, dVarD0));
        }
        v vVar = this.f16681m1;
        if (vVar != null) {
            vVar.b();
        }
        return dVarD0;
    }

    @Override
    public final void e(int i10, Object obj) {
        if (i10 == 1) {
            M0(obj);
            return;
        }
        if (i10 == 7) {
            obj.getClass();
            t tVar = (t) obj;
            this.R1 = tVar;
            c0 c0Var = this.f16686r1;
            if (c0Var != null) {
                c0Var.a(tVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.P1 != iIntValue) {
                this.P1 = iIntValue;
                if (this.O1) {
                    m0();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f16694z1 = iIntValue2;
            g1 g1Var = this.f12429n0;
            if (g1Var != null) {
                g1Var.l(iIntValue2);
                return;
            }
            return;
        }
        if (i10 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.A1 = iIntValue3;
            c0 c0Var2 = this.f16686r1;
            if (c0Var2 != null) {
                c0Var2.h(iIntValue3);
                return;
            }
            x xVar = this.f16678j1.f16726b;
            if (xVar.f16755j == iIntValue3) {
                return;
            }
            xVar.f16755j = iIntValue3;
            xVar.d(true);
            return;
        }
        if (i10 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(v2.f1662a)) {
                c0 c0Var3 = this.f16686r1;
                if (c0Var3 == null || !c0Var3.isInitialized()) {
                    return;
                }
                this.f16686r1.q();
                return;
            }
            this.f16689u1 = list;
            c0 c0Var4 = this.f16686r1;
            if (c0Var4 != null) {
                c0Var4.l(list);
                return;
            }
            return;
        }
        if (i10 == 14) {
            obj.getClass();
            e7.v vVar = (e7.v) obj;
            if (vVar.f5187a == 0 || vVar.f5188b == 0) {
                return;
            }
            this.f16692x1 = vVar;
            c0 c0Var5 = this.f16686r1;
            if (c0Var5 != null) {
                Surface surface = this.f16690v1;
                surface.getClass();
                c0Var5.n(surface, vVar);
                return;
            }
            return;
        }
        switch (i10) {
            case 16:
                obj.getClass();
                this.N1 = ((Integer) obj).intValue();
                g1 g1Var2 = this.f12429n0;
                if (g1Var2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.N1));
                    g1Var2.k(bundle);
                }
                break;
            case 17:
                Surface surface2 = this.f16690v1;
                M0(null);
                obj.getClass();
                ((h) obj).e(1, surface2);
                break;
            case TYPE_SINT64_VALUE:
                boolean z10 = this.F1 != null;
                k1 k1Var = (k1) obj;
                this.F1 = k1Var;
                if (z10 != (k1Var != null)) {
                    z0(this.f12430o0);
                }
                break;
            default:
                super.e(i10, obj);
                break;
        }
    }

    @Override
    public final void e0(androidx.media3.common.t tVar, MediaFormat mediaFormat) {
        int integer;
        int i10;
        g1 g1Var = this.f12429n0;
        if (g1Var != null) {
            g1Var.l(this.f16694z1);
        }
        if (this.O1) {
            i10 = tVar.f1601u;
            integer = tVar.f1602v;
        } else {
            mediaFormat.getClass();
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i10 = integer2;
        }
        float f3 = tVar.A;
        int i11 = tVar.f1606z;
        if (i11 == 90 || i11 == 270) {
            f3 = 1.0f / f3;
            int i12 = integer;
            integer = i10;
            i10 = i12;
        }
        this.L1 = new w2(f3, i10, integer);
        c0 c0Var = this.f16686r1;
        if (c0Var == null || !this.U1) {
            this.f16678j1.f(tVar.f1605y);
        } else {
            androidx.media3.common.s sVarA = tVar.a();
            sVarA.f1508t = i10;
            sVarA.f1509u = integer;
            sVarA.f1514z = f3;
            androidx.media3.common.t tVar2 = new androidx.media3.common.t(sVarA);
            int i13 = this.f16688t1;
            List list = this.f16689u1;
            if (list == null) {
                r0 r0Var = t0.B;
                list = d2.E;
            }
            c0Var.j(tVar2, this.U0.f12408b, i13, list);
            this.f16688t1 = 2;
        }
        this.U1 = false;
    }

    @Override
    public final void f() {
        c0 c0Var = this.f16686r1;
        if (c0Var == null) {
            u uVar = this.f16678j1;
            if (uVar.f16729e == 0) {
                uVar.f16729e = 1;
                return;
            }
            return;
        }
        int i10 = this.f16688t1;
        if (i10 == 0 || i10 == 1) {
            this.f16688t1 = 0;
        } else {
            c0Var.u();
        }
    }

    @Override
    public final void g0(long j9) {
        super.g0(j9);
        if (this.O1) {
            return;
        }
        this.E1--;
    }

    @Override
    public final void h0() {
        c0 c0Var = this.f16686r1;
        if (c0Var != null) {
            c0Var.g();
            if (this.S1 == -9223372036854775807L) {
                this.S1 = this.U0.f12408b;
            }
            this.f16686r1.f(-this.S1);
        } else {
            this.f16678j1.e(2);
        }
        this.U1 = true;
        K0();
    }

    @Override
    public final String i() {
        return "MediaCodecVideoRenderer";
    }

    @Override
    public final void i0(h7.e eVar) {
        this.V1 = 0;
        int iN = N(eVar);
        if ((Build.VERSION.SDK_INT < 34 || (iN & 32) == 0) && !this.O1) {
            this.E1++;
        }
    }

    @Override
    public final boolean k() {
        if (!this.P0) {
            return false;
        }
        c0 c0Var = this.f16686r1;
        return c0Var == null || c0Var.b();
    }

    @Override
    public final boolean k0(long j9, long j10, g1 g1Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, androidx.media3.common.t tVar) {
        int i13;
        g1Var.getClass();
        long j12 = j11 - this.U0.f12409c;
        int i14 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f16682n1;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j11) {
                break;
            }
            i14++;
            priorityQueue.poll();
        }
        Q0(i14, 0);
        c0 c0Var = this.f16686r1;
        if (c0Var != null) {
            if (!z10 || z11) {
                return c0Var.r(j11, new f(this, g1Var, i10, j12));
            }
            P0(g1Var, i10);
            return true;
        }
        int iA = this.f16678j1.a(j11, j9, j10, this.U0.f12408b, z10, z11, this.f16679k1);
        l50.d dVar = this.f16679k1;
        v vVar = this.f16681m1;
        if (vVar != null && iA != 5 && iA != 4) {
            vVar.a(j11, dVar.a);
        }
        if (iA == 0) {
            this.G.getClass();
            long jNanoTime = System.nanoTime();
            t tVar2 = this.R1;
            if (tVar2 != null) {
                tVar2.b(j12, jNanoTime, tVar, this.f12431p0);
            }
            L0(g1Var, i10, jNanoTime);
            S0(dVar.a);
            return true;
        }
        if (iA == 1) {
            long j13 = dVar.b;
            long j14 = dVar.a;
            if (j13 == this.K1) {
                P0(g1Var, i10);
            } else {
                t tVar3 = this.R1;
                if (tVar3 != null) {
                    i13 = i10;
                    tVar3.b(j12, j13, tVar, this.f12431p0);
                } else {
                    i13 = i10;
                }
                L0(g1Var, i13, j13);
            }
            S0(j14);
            this.K1 = j13;
            return true;
        }
        if (iA == 2) {
            Trace.beginSection("dropVideoBuffer");
            g1Var.i(i10);
            Trace.endSection();
            Q0(0, 1);
            S0(dVar.a);
            return true;
        }
        if (iA == 3) {
            P0(g1Var, i10);
            S0(dVar.a);
            return true;
        }
        if (iA == 4 || iA == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(iA));
    }

    @Override
    public final boolean m() {
        boolean zB;
        boolean z10 = false;
        if (this.f12420e0 != null) {
            if (j()) {
                zB = this.N;
            } else {
                a1 a1Var = this.I;
                a1Var.getClass();
                zB = a1Var.b();
            }
            if (zB) {
                z10 = true;
            } else {
                if (this.B0 >= 0) {
                    z10 = true;
                } else if (this.f12441z0 != -9223372036854775807L) {
                    this.G.getClass();
                    if (SystemClock.elapsedRealtime() < this.f12441z0) {
                        z10 = true;
                    }
                }
            }
        }
        c0 c0Var = this.f16686r1;
        if (c0Var != null) {
            return c0Var.p(z10);
        }
        if (z10 && (this.f12429n0 == null || this.O1)) {
            return true;
        }
        return this.f16678j1.b(z10);
    }

    @Override
    public final void n() {
        i7.c cVar;
        k7.n nVar = this.f16675g1;
        this.M1 = null;
        this.T1 = -9223372036854775807L;
        K0();
        this.f16693y1 = false;
        this.Q1 = null;
        this.H1 = true;
        try {
            super.n();
            cVar = this.T0;
            nVar.getClass();
            synchronized (cVar) {
            }
        } finally {
            cVar = this.T0;
            nVar.getClass();
            synchronized (cVar) {
                Handler handler = nVar.f9111a;
                if (handler != null) {
                    handler.post(new oi.p(nVar, cVar, 14));
                }
                nVar.b(w2.f1669d);
            }
        }
    }

    @Override
    public final void n0() {
        c0 c0Var = this.f16686r1;
        if (c0Var != null) {
            c0Var.g();
        }
    }

    @Override
    public final void o(boolean z10, boolean z11) {
        c0 c0Var;
        this.T0 = new i7.c();
        i1 i1Var = this.D;
        i1Var.getClass();
        boolean z12 = i1Var.f7374b;
        ta.c0.A((z12 && this.P1 == 0) ? false : true);
        if (this.O1 != z12) {
            this.O1 = z12;
            m0();
        }
        i7.c cVar = this.T0;
        k7.n nVar = this.f16675g1;
        Handler handler = nVar.f9111a;
        if (handler != null) {
            handler.post(new z(nVar, cVar, 5));
        }
        boolean z13 = this.f16687s1;
        u uVar = this.f16678j1;
        if (!z13) {
            if (this.f16689u1 != null && this.f16686r1 == null) {
                k kVar = new k(this.f16673e1, uVar);
                kVar.f16698d = true;
                long j9 = this.f16680l1;
                kVar.f16701g = j9 != -9223372036854775807L ? -j9 : -9223372036854775807L;
                e7.b0 b0Var = this.G;
                b0Var.getClass();
                kVar.f16699e = b0Var;
                ta.c0.A(!kVar.f16700f);
                if (kVar.f16697c == null) {
                    kVar.f16697c = new n();
                }
                p pVar = new p(kVar);
                kVar.f16700f = true;
                if (1 >= pVar.f16724q) {
                    pVar.f16724q = 1;
                }
                SparseArray sparseArray = pVar.f16712c;
                if (i0.j(sparseArray, 0)) {
                    c0Var = (c0) sparseArray.get(0);
                } else {
                    l lVar = new l(pVar, pVar.f16710a);
                    pVar.f16716g.add(lVar);
                    sparseArray.put(0, lVar);
                    c0Var = lVar;
                }
                this.f16686r1 = c0Var;
            }
            this.f16687s1 = true;
        }
        c0 c0Var2 = this.f16686r1;
        if (c0Var2 == null) {
            e7.b0 b0Var2 = this.G;
            b0Var2.getClass();
            uVar.l = b0Var2;
            uVar.e(!z11 ? 1 : 0);
            return;
        }
        c0Var2.t(new e(this));
        t tVar = this.R1;
        if (tVar != null) {
            this.f16686r1.a(tVar);
        }
        if (this.f16690v1 != null && !this.f16692x1.equals(e7.v.f5185c)) {
            this.f16686r1.n(this.f16690v1, this.f16692x1);
        }
        this.f16686r1.h(this.A1);
        this.f16686r1.setPlaybackSpeed(this.f12427l0);
        List list = this.f16689u1;
        if (list != null) {
            this.f16686r1.l(list);
        }
        this.f16688t1 = !z11 ? 1 : 0;
        this.X0 = true;
    }

    @Override
    public final void p(long j9, boolean z10, boolean z11) {
        c0 c0Var = this.f16686r1;
        if (c0Var != null && !z10) {
            c0Var.k(true);
        }
        if (z11) {
            this.G1 = j9;
        }
        super.p(j9, z10, z11);
        c0 c0Var2 = this.f16686r1;
        u uVar = this.f16678j1;
        if (c0Var2 == null) {
            uVar.f16726b.b();
            uVar.f16732h = -9223372036854775807L;
            uVar.f16730f = -9223372036854775807L;
            uVar.f16729e = Math.min(uVar.f16729e, 1);
            uVar.f16733i = -9223372036854775807L;
        }
        v vVar = this.f16681m1;
        if (vVar != null) {
            vVar.b();
        }
        if (z10) {
            c0 c0Var3 = this.f16686r1;
            if (c0Var3 != null) {
                c0Var3.o(false);
            } else {
                uVar.c(false);
            }
        }
        K0();
        this.D1 = 0;
    }

    @Override
    public final void p0() {
        super.p0();
        this.f16682n1.clear();
        this.E1 = 0;
        this.V1 = 0;
        this.H1 = false;
    }

    @Override
    public final void q() {
        c0 c0Var = this.f16686r1;
        if (c0Var == null || !this.f16674f1) {
            return;
        }
        c0Var.release();
    }

    @Override
    public final void r() {
        try {
            try {
                this.E0 = false;
                o0();
                m0();
                n7.e eVar = this.f12423h0;
                if (eVar != null) {
                    eVar.c(null);
                }
                this.f12423h0 = null;
                this.f16687s1 = false;
                this.S1 = -9223372036854775807L;
                j jVar = this.f16691w1;
                if (jVar != null) {
                    jVar.release();
                    this.f16691w1 = null;
                }
            } catch (Throwable th2) {
                n7.e eVar2 = this.f12423h0;
                if (eVar2 != null) {
                    eVar2.c(null);
                }
                this.f12423h0 = null;
                throw th2;
            }
        } catch (Throwable th3) {
            this.f16687s1 = false;
            this.S1 = -9223372036854775807L;
            j jVar2 = this.f16691w1;
            if (jVar2 != null) {
                jVar2.release();
                this.f16691w1 = null;
            }
            throw th3;
        }
    }

    @Override
    public final void s() {
        this.C1 = 0;
        this.G.getClass();
        this.B1 = SystemClock.elapsedRealtime();
        this.I1 = 0L;
        this.J1 = 0;
        c0 c0Var = this.f16686r1;
        if (c0Var != null) {
            c0Var.e();
        } else {
            this.f16678j1.d();
        }
    }

    @Override
    public final void t() {
        J0();
        int i10 = this.J1;
        if (i10 != 0) {
            k7.n nVar = this.f16675g1;
            long j9 = this.I1;
            Handler handler = nVar.f9111a;
            if (handler != null) {
                handler.post(new z(nVar, j9, i10));
            }
            this.I1 = 0L;
            this.J1 = 0;
        }
        c0 c0Var = this.f16686r1;
        if (c0Var != null) {
            c0Var.d();
        } else {
            u uVar = this.f16678j1;
            uVar.f16728d = false;
            uVar.f16733i = -9223372036854775807L;
            x xVar = uVar.f16726b;
            xVar.f16749d = false;
            w wVar = xVar.f16748c;
            if (wVar != null) {
                wVar.f16742b.unregisterDisplayListener(wVar);
                wVar.f16745e.removeCallbacksAndMessages(null);
                wVar.f16741a.removeVsyncCallback(wVar);
                wVar.f16743c = -9223372036854775807L;
                wVar.f16744d = -9223372036854775807L;
            }
            xVar.a();
        }
        v vVar = this.f16681m1;
        if (vVar != null) {
            vVar.b();
        }
    }

    @Override
    public final boolean t0(h7.e eVar) {
        boolean z10;
        long j9;
        boolean z11 = false;
        if (!I0(eVar)) {
            long j10 = eVar.G;
            boolean z12 = j10 < this.L;
            v vVar = this.f16681m1;
            if (vVar != null) {
                long j11 = vVar.f16737a;
                if (j11 == -9223372036854775807L) {
                    j9 = -9223372036854775807L;
                } else {
                    j9 = (long) (((j10 - j11) * vVar.f16739c) + vVar.f16738b);
                }
                if (j9 == -9223372036854775807L || j9 >= this.f16680l1) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            if ((z12 || z10) && !eVar.c(268435456)) {
                if (eVar.c(67108864)) {
                    eVar.q();
                    z11 = true;
                }
                if (z11) {
                    if (z12) {
                        this.T0.f7237d++;
                    } else {
                        this.f16682n1.add(Long.valueOf(eVar.G));
                        this.V1++;
                    }
                }
                return z11;
            }
        }
        return false;
    }

    @Override
    public final void u(androidx.media3.common.t[] tVarArr, long j9, long j10, s7.a0 a0Var) {
        super.u(tVarArr, j9, j10, a0Var);
        R0(a0Var);
        v vVar = this.f16681m1;
        if (vVar != null) {
            vVar.b();
        }
    }

    @Override
    public final boolean u0() {
        boolean z10;
        androidx.media3.common.t tVar = this.f12430o0;
        long j9 = this.T1;
        if (j9 != -9223372036854775807L) {
            if (this.Z0 + 1 + j9 > Long.MAX_VALUE - (this.U0.f12409c + j9)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        return this.F1 == null || this.H1 || this.O1 || (tVar != null && tVar.f1596p > 0) || z10 || this.U0.f12411e != -9223372036854775807L;
    }

    @Override
    public final void v() {
        s7.a0 a0Var = this.Q;
        if (a0Var != null) {
            R0(a0Var);
        }
    }

    @Override
    public final boolean v0(p7.k kVar) {
        return H0(kVar);
    }

    @Override
    public final boolean w0() {
        p7.k kVar = this.f12436u0;
        if (this.f16686r1 != null && kVar != null) {
            String str = kVar.f12395a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.w0();
    }

    @Override
    public final void x(long j9, long j10) throws ExoPlaybackException {
        c0 c0Var = this.f16686r1;
        if (c0Var != null) {
            try {
                c0Var.m(j9, j10);
            } catch (VideoSink$VideoSinkException e3) {
                throw d(e3, e3.A, false, 7001);
            }
        }
        super.x(j9, j10);
    }

    @Override
    public final int y0(p7.h hVar, androidx.media3.common.t tVar) {
        boolean z10;
        int i10 = 0;
        if (!androidx.media3.common.x0.m(tVar.f1594n)) {
            return i7.a.c(0, 0, 0, 0);
        }
        boolean z11 = tVar.f1598r != null;
        Context context = this.f16673e1;
        List listE0 = E0(context, hVar, tVar, z11, false);
        if (z11 && listE0.isEmpty()) {
            listE0 = E0(context, hVar, tVar, false, false);
        }
        if (listE0.isEmpty()) {
            return i7.a.c(1, 0, 0, 0);
        }
        int i11 = tVar.O;
        if (i11 != 0 && i11 != 2) {
            return i7.a.c(2, 0, 0, 0);
        }
        p7.k kVar = (p7.k) listE0.get(0);
        boolean zE = kVar.e(tVar);
        if (!zE) {
            int i12 = 1;
            while (true) {
                if (i12 >= listE0.size()) {
                    z10 = true;
                    break;
                }
                p7.k kVar2 = (p7.k) listE0.get(i12);
                if (kVar2.e(tVar)) {
                    z10 = false;
                    zE = true;
                    kVar = kVar2;
                    break;
                }
                i12++;
            }
        } else {
            z10 = true;
            break;
        }
        int i13 = 3;
        int i14 = zE ? 4 : 3;
        int i15 = kVar.f(tVar) ? 16 : 8;
        int i16 = kVar.f12401g ? 64 : 0;
        int i17 = z10 ? Cast.MAX_NAMESPACE_LENGTH : 0;
        if ("video/dolby-vision".equals(tVar.f1594n) && !w50.c.z(context)) {
            i17 = 256;
        }
        if (zE) {
            List listE1 = E0(context, hVar, tVar, z11, true);
            if (!listE1.isEmpty()) {
                HashMap map = p7.p.f12445a;
                ArrayList arrayList = new ArrayList(listE1);
                Collections.sort(arrayList, new fg.d(new k7.t(tVar, 17), i13));
                p7.k kVar3 = (p7.k) arrayList.get(0);
                if (kVar3.e(tVar) && kVar3.f(tVar)) {
                    i10 = 32;
                }
            }
        }
        return i14 | i15 | i10 | i16 | i17;
    }
}
