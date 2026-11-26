package k7;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.LoudnessCodecController;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.z0;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import b3.g1;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import fh.d2;
import fh.t0;
import i7.i1;
import i7.n0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import k9.x0;
import sd.y1;

public final class e0 extends p7.m implements n0 {

    public final n f9033e1;

    public final c0 f9034f1;

    public final x0 f9035g1;

    public int f9036h1;

    public boolean f9037i1;

    public androidx.media3.common.t f9038j1;

    public androidx.media3.common.t f9039k1;

    public long f9040l1;

    public boolean f9041m1;

    public boolean f9042n1;

    public boolean f9043o1;

    public int f9044p1;

    public boolean f9045q1;

    public long f9046r1;

    public e0(Context context, p7.i iVar, boolean z10, Handler handler, i7.v vVar, c0 c0Var) {
        super(1, iVar, z10, 44100.0f);
        x0 x0Var = Build.VERSION.SDK_INT >= 35 ? new x0(25, (byte) 0) : null;
        context.getApplicationContext();
        this.f9034f1 = c0Var;
        this.f9035g1 = x0Var;
        this.f9044p1 = -1000;
        this.f9033e1 = new n(handler, vVar, 0);
        this.f9046r1 = -9223372036854775807L;
        c0Var.f9006n = new gi.c(this, 14);
    }

    public final int C0(androidx.media3.common.t tVar) {
        g gVarA;
        c0 c0Var = this.f9034f1;
        if (c0Var.X) {
            gVarA = g.f9055d;
        } else {
            i iVarB = c0Var.f9010r.b(c0Var.g(tVar));
            f fVar = new f();
            fVar.f9047a = iVarB.f9080a;
            fVar.f9048b = iVarB.f9081b;
            fVar.f9049c = iVarB.f9082c;
            gVarA = fVar.a();
        }
        if (!gVarA.f9056a) {
            return 0;
        }
        int i10 = gVarA.f9057b ? 1536 : 512;
        return gVarA.f9058c ? i10 | 2048 : i10;
    }

    public final void D0() {
        long j9;
        long jMax;
        long j10;
        k();
        c0 c0Var = this.f9034f1;
        a1.i iVar = c0Var.f8995b;
        if (!c0Var.m() || c0Var.F) {
            j9 = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(c0Var.f9012t.a(), e7.i0.O(((k) c0Var.f9008p.f8481e).f9101b, c0Var.i()));
            ArrayDeque arrayDeque = c0Var.f9002h;
            while (!arrayDeque.isEmpty() && jMin >= ((a0) arrayDeque.getFirst()).f8981c) {
                c0Var.f9015w = (a0) arrayDeque.remove();
            }
            a0 a0Var = c0Var.f9015w;
            long jQ = jMin - a0Var.f8981c;
            long jU = e7.i0.u(a0Var.f8979a.f1688a, jQ);
            if (arrayDeque.isEmpty()) {
                c7.s sVar = (c7.s) iVar.D;
                if (!sVar.a()) {
                    j9 = Long.MIN_VALUE;
                } else if (sVar.f2974n >= MediaStatus.COMMAND_QUEUE_REPEAT_ALL) {
                    long j11 = sVar.m;
                    c7.r rVar = sVar.f2972j;
                    rVar.getClass();
                    long jO = j11 - ((long) (rVar.f2957i.o() * (rVar.f2958j * rVar.f2950b)));
                    int i10 = sVar.f2970h.f2919a;
                    int i11 = sVar.f2969g.f2919a;
                    if (i10 == i11) {
                        jQ = e7.i0.Q(jQ, jO, sVar.f2974n, RoundingMode.DOWN);
                        j9 = Long.MIN_VALUE;
                    } else {
                        j9 = Long.MIN_VALUE;
                        jQ = e7.i0.Q(jQ, jO * ((long) i10), sVar.f2974n * ((long) i11), RoundingMode.DOWN);
                    }
                } else {
                    j9 = Long.MIN_VALUE;
                    jQ = (long) (((double) sVar.f2965c) * jQ);
                }
                a0 a0Var2 = c0Var.f9015w;
                j10 = a0Var2.f8980b + jQ;
                a0Var2.f8982d = jQ - jU;
            } else {
                j9 = Long.MIN_VALUE;
                a0 a0Var3 = c0Var.f9015w;
                j10 = a0Var3.f8980b + jU + a0Var3.f8982d;
            }
            long j12 = ((g0) iVar.C).f9065q;
            jMax = e7.i0.O(((k) c0Var.f9008p.f8481e).f9101b, j12) + j10;
            long j13 = c0Var.Z;
            if (j12 > j13) {
                long jO2 = e7.i0.O(((k) c0Var.f9008p.f8481e).f9101b, j12 - j13);
                c0Var.Z = j12;
                c0Var.f8994a0 += jO2;
                if (c0Var.f8996b0 == null) {
                    c0Var.f8996b0 = new Handler(Looper.myLooper());
                }
                c0Var.f8996b0.removeCallbacksAndMessages(null);
                c0Var.f8996b0.postDelayed(new androidx.lifecycle.i0(c0Var, 25), 100L);
            }
        }
        if (jMax != j9) {
            if (!this.f9041m1) {
                jMax = Math.max(this.f9040l1, jMax);
            }
            this.f9040l1 = jMax;
            this.f9041m1 = false;
        }
    }

    @Override
    public final i7.d G(p7.k kVar, androidx.media3.common.t tVar, androidx.media3.common.t tVar2) {
        i7.d dVarB = kVar.b(tVar, tVar2);
        int i10 = dVarB.f7269e;
        if (this.f12423h0 == null && x0(tVar2)) {
            i10 |= 32768;
        }
        "OMX.google.raw.decoder".equals(kVar.f12395a);
        if (tVar2.f1595o > this.f9036h1) {
            i10 |= 64;
        }
        int i11 = i10;
        return new i7.d(kVar.f12395a, tVar, tVar2, i11 != 0 ? 0 : dVarB.f7268d, i11);
    }

    @Override
    public final float O(float f3, androidx.media3.common.t tVar, androidx.media3.common.t[] tVarArr) {
        int iMax = -1;
        for (androidx.media3.common.t tVar2 : tVarArr) {
            int i10 = tVar2.G;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f3;
    }

    @Override
    public final ArrayList P(p7.h hVar, androidx.media3.common.t tVar, boolean z10) {
        d2 d2VarS;
        if (tVar.f1594n == null) {
            d2VarS = d2.E;
        } else {
            c0 c0Var = this.f9034f1;
            int i10 = c0Var.f9010r.b(c0Var.g(tVar)).f9083d;
            if (i10 == 1 || i10 == 2) {
                List listC = p7.p.c("audio/raw", false, false);
                p7.k kVar = listC.isEmpty() ? null : (p7.k) listC.get(0);
                if (kVar != null) {
                    d2VarS = t0.s(kVar);
                } else {
                    d2VarS = p7.p.e(hVar, tVar, z10, false);
                }
            } else {
                d2VarS = p7.p.e(hVar, tVar, z10, false);
            }
        }
        HashMap map = p7.p.f12445a;
        ArrayList arrayList = new ArrayList(d2VarS);
        Collections.sort(arrayList, new fg.d(new t(tVar, 17), 3));
        return arrayList;
    }

    @Override
    public final long Q(long j9, long j10) {
        long jQ;
        c0 c0Var = this.f9034f1;
        boolean z10 = c0Var.k() && this.f9046r1 != -9223372036854775807L;
        if (this.f9045q1) {
            if (!c0Var.m()) {
                jQ = -9223372036854775807L;
            } else if (k0.n.a(c0Var.f9008p)) {
                jQ = e7.i0.O(((k) c0Var.f9008p.f8481e).f9101b, c0Var.f9012t.f9134a.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = c0Var.f9012t.f9134a.getBufferSizeInFrames();
                int iK = a8.b.k(((k) c0Var.f9008p.f8481e).f9100a);
                ta.c0.A(iK != -2147483647);
                jQ = e7.i0.Q(bufferSizeInFrames, 1000000L, iK, RoundingMode.DOWN);
            }
            if (z10 && jQ != -9223372036854775807L) {
                float fMin = Math.min(jQ, this.f9046r1 - j9);
                z0 z0Var = c0Var.f9016x;
                float f3 = z0Var != null ? z0Var.f1688a : 1.0f;
                this.G.getClass();
                return Math.max(NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS, ((long) ((fMin / f3) / 2.0f)) - (e7.i0.H(SystemClock.elapsedRealtime()) - j10));
            }
        } else if (z10 || this.P0) {
            return 1000000L;
        }
        return NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS;
    }

    @Override
    public final y1 S(p7.k kVar, androidx.media3.common.t tVar, MediaCrypto mediaCrypto, float f3) {
        Pair pairB;
        androidx.media3.common.t[] tVarArr = this.J;
        tVarArr.getClass();
        String str = kVar.f12395a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = tVar.f1595o;
        String str2 = tVar.f1594n;
        int i10 = tVar.F;
        if (tVarArr.length != 1) {
            for (androidx.media3.common.t tVar2 : tVarArr) {
                if (kVar.b(tVar, tVar2).f7268d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, tVar2.f1595o);
                }
            }
        }
        this.f9036h1 = iMax;
        this.f9037i1 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = kVar.f12397c;
        int i11 = this.f9036h1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i10);
        int i12 = tVar.G;
        mediaFormat.setInteger("sample-rate", i12);
        e7.a.l(mediaFormat, tVar.f1597q);
        e7.a.k(mediaFormat, "max-input-size", i11);
        mediaFormat.setInteger("priority", 0);
        if (f3 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f3);
        }
        if ("audio/ac4".equals(str2) && (pairB = e7.e.b(tVar)) != null) {
            e7.a.k(mediaFormat, "profile", ((Integer) pairB.first).intValue());
            e7.a.k(mediaFormat, "level", ((Integer) pairB.second).intValue());
        }
        int i13 = Build.VERSION.SDK_INT;
        androidx.media3.common.s sVar = new androidx.media3.common.s();
        sVar.m = androidx.media3.common.x0.n("audio/raw");
        sVar.E = i10;
        sVar.F = i12;
        sVar.G = 4;
        androidx.media3.common.t tVar3 = new androidx.media3.common.t(sVar);
        c0 c0Var = this.f9034f1;
        int i14 = c0Var.f9010r.b(c0Var.g(tVar3)).f9083d;
        if (i14 != 1 && i14 == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        mediaFormat.setInteger("max-output-channel-count", 99);
        if (i13 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f9044p1));
        }
        E(mediaFormat);
        this.f9039k1 = (!"audio/raw".equals(kVar.f12396b) || "audio/raw".equals(str2)) ? null : tVar;
        return new y1(kVar, mediaFormat, tVar, (Surface) null, mediaCrypto, this.f9035g1);
    }

    @Override
    public final void T(h7.e eVar) {
        k0.n nVar;
        androidx.media3.common.t tVar = eVar.C;
        if (tVar != null && Objects.equals(tVar.f1594n, "audio/opus") && this.E0) {
            ByteBuffer byteBuffer = eVar.H;
            byteBuffer.getClass();
            androidx.media3.common.t tVar2 = eVar.C;
            tVar2.getClass();
            int i10 = tVar2.I;
            if (byteBuffer.remaining() == 8) {
                int i11 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                c0 c0Var = this.f9034f1;
                s sVar = c0Var.f9012t;
                if (sVar == null || !sVar.c() || (nVar = c0Var.f9008p) == null || !((k) nVar.f8481e).f9110k) {
                    return;
                }
                c0Var.f9012t.f9134a.setOffloadDelayPadding(i10, i11);
            }
        }
    }

    @Override
    public final void Z(Exception exc) {
        e7.a.e("MediaCodecAudioRenderer", "Audio codec error", exc);
        n nVar = this.f9033e1;
        Handler handler = nVar.f9111a;
        if (handler != null) {
            handler.post(new l(nVar, exc, 0));
        }
    }

    @Override
    public final long a() {
        if (this.H == 2) {
            D0();
        }
        return this.f9040l1;
    }

    @Override
    public final void a0(long j9, long j10, String str) {
        n nVar = this.f9033e1;
        Handler handler = nVar.f9111a;
        if (handler != null) {
            handler.post(new l(nVar, str, j9, j10));
        }
    }

    @Override
    public final boolean b() {
        boolean z10 = this.f9043o1;
        this.f9043o1 = false;
        return z10;
    }

    @Override
    public final void b0(i7.b bVar) {
        n nVar = this.f9033e1;
        Handler handler = nVar.f9111a;
        if (handler != null) {
            handler.post(new ji.a(nVar, bVar, 7));
        }
    }

    @Override
    public final void c0(String str) {
        n nVar = this.f9033e1;
        Handler handler = nVar.f9111a;
        if (handler != null) {
            handler.post(new l(nVar, str, 5));
        }
    }

    @Override
    public final i7.d d0(h7.b bVar) {
        androidx.media3.common.t tVar = (androidx.media3.common.t) bVar.B;
        tVar.getClass();
        this.f9038j1 = tVar;
        i7.d dVarD0 = super.d0(bVar);
        n nVar = this.f9033e1;
        Handler handler = nVar.f9111a;
        if (handler != null) {
            handler.post(new l(nVar, tVar, dVarD0));
        }
        return dVarD0;
    }

    @Override
    public final void e(int i10, Object obj) {
        x0 x0Var;
        c0 c0Var = this.f9034f1;
        if (i10 == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (c0Var.H != fFloatValue) {
                c0Var.H = fFloatValue;
                if (c0Var.m()) {
                    c0Var.f9012t.f9134a.setVolume(c0Var.H);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            androidx.media3.common.d dVar = (androidx.media3.common.d) obj;
            dVar.getClass();
            if (c0Var.f9013u.equals(dVar)) {
                return;
            }
            c0Var.f9013u = dVar;
            if (c0Var.V) {
                return;
            }
            c0Var.q();
            return;
        }
        if (i10 == 6) {
            androidx.media3.common.e eVar = (androidx.media3.common.e) obj;
            eVar.getClass();
            if (c0Var.S.equals(eVar)) {
                return;
            }
            if (c0Var.f9012t != null) {
                c0Var.S.getClass();
            }
            c0Var.S = eVar;
            return;
        }
        if (i10 == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            c0Var.T = audioDeviceInfo;
            s sVar = c0Var.f9012t;
            if (sVar != null) {
                sVar.f9134a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i10 == 16) {
            obj.getClass();
            this.f9044p1 = ((Integer) obj).intValue();
            g1 g1Var = this.f12429n0;
            if (g1Var != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f9044p1));
                g1Var.k(bundle);
                return;
            }
            return;
        }
        if (i10 == 9) {
            obj.getClass();
            c0Var.f9017y = ((Boolean) obj).booleanValue();
            a0 a0Var = new a0(c0Var.u() ? z0.f1685d : c0Var.f9016x, -9223372036854775807L, -9223372036854775807L);
            if (c0Var.m()) {
                c0Var.f9014v = a0Var;
                return;
            } else {
                c0Var.f9015w = a0Var;
                return;
            }
        }
        if (i10 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (c0Var.R) {
                if (c0Var.Q == iIntValue) {
                    c0Var.R = false;
                    if (c0Var.Q != iIntValue) {
                        c0Var.Q = iIntValue;
                        c0Var.P = iIntValue != 0;
                        c0Var.q();
                    }
                }
            } else if (c0Var.Q != iIntValue) {
                c0Var.Q = iIntValue;
                c0Var.P = iIntValue != 0;
                c0Var.q();
            }
            if (Build.VERSION.SDK_INT < 35 || (x0Var = this.f9035g1) == null) {
                return;
            }
            x0Var.R(iIntValue);
            return;
        }
        if (i10 == 19) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            AtomicInteger atomicInteger = c0.f8992c0;
            if (iIntValue2 == 0 || iIntValue2 == -1) {
                iIntValue2 = -1;
            }
            if (c0Var.U == iIntValue2) {
                return;
            }
            c0Var.U = iIntValue2;
            c0Var.q();
            return;
        }
        if (i10 != 20) {
            super.e(i10, obj);
            return;
        }
        obj.getClass();
        u uVar = (u) obj;
        if (uVar.equals(c0Var.f9010r)) {
            return;
        }
        c0Var.f9010r.d();
        c0Var.f9010r = uVar;
        x xVar = c0Var.f9011s;
        if (xVar != null) {
            uVar.f();
            if (uVar.f9151e == null) {
                e7.p pVar = new e7.p(Thread.currentThread());
                uVar.f9151e = pVar;
                pVar.f5164i = false;
            }
            uVar.f9151e.a(xVar);
        }
        c0Var.q();
    }

    @Override
    public final void e0(androidx.media3.common.t tVar, MediaFormat mediaFormat) throws ExoPlaybackException {
        int iW;
        androidx.media3.common.t tVar2 = this.f9039k1;
        int[] iArr = null;
        if (tVar2 != null) {
            tVar = tVar2;
        } else if (this.f12429n0 != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(tVar.f1594n)) {
                iW = tVar.H;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iW = mediaFormat.getInteger("pcm-encoding");
            } else {
                iW = mediaFormat.containsKey("v-bits-per-sample") ? e7.i0.w(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            androidx.media3.common.s sVar = new androidx.media3.common.s();
            sVar.m = androidx.media3.common.x0.n("audio/raw");
            sVar.G = iW;
            sVar.H = tVar.I;
            sVar.I = tVar.J;
            sVar.f1501k = tVar.l;
            sVar.f1491a = tVar.f1583a;
            sVar.f1492b = tVar.f1584b;
            sVar.f1493c = t0.o(tVar.f1585c);
            sVar.f1494d = tVar.f1586d;
            sVar.f1495e = tVar.f1587e;
            sVar.f1496f = tVar.f1588f;
            sVar.E = mediaFormat.getInteger("channel-count");
            sVar.F = mediaFormat.getInteger("sample-rate");
            tVar = new androidx.media3.common.t(sVar);
            if (this.f9037i1) {
                int i10 = tVar.F;
                if (i10 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i10 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i10 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i10 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i10 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            boolean z10 = this.E0;
            c0 c0Var = this.f9034f1;
            if (z10) {
                i1 i1Var = this.D;
                i1Var.getClass();
                if (i1Var.f7373a != 0) {
                    i1 i1Var2 = this.D;
                    i1Var2.getClass();
                    c0Var.f9003i = i1Var2.f7373a;
                } else {
                    c0Var.f9003i = 0;
                }
            } else {
                c0Var.f9003i = 0;
            }
            c0Var.c(tVar, iArr);
        } catch (AudioSink$ConfigurationException e3) {
            throw d(e3, e3.A, false, 5001);
        }
    }

    @Override
    public final void f0() {
        this.f9034f1.getClass();
    }

    @Override
    public final z0 getPlaybackParameters() {
        return this.f9034f1.f9016x;
    }

    @Override
    public final n0 h() {
        return this;
    }

    @Override
    public final void h0() {
        this.f9034f1.E = true;
    }

    @Override
    public final String i() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public final boolean k() {
        if (!this.P0) {
            return false;
        }
        c0 c0Var = this.f9034f1;
        if (c0Var.m()) {
            return c0Var.L && !c0Var.k();
        }
        return true;
    }

    @Override
    public final boolean k0(long j9, long j10, g1 g1Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, androidx.media3.common.t tVar) throws ExoPlaybackException {
        int i13;
        int i14;
        byteBuffer.getClass();
        this.f9046r1 = -9223372036854775807L;
        if (this.f9039k1 != null && (i11 & 2) != 0) {
            g1Var.getClass();
            g1Var.i(i10);
            return true;
        }
        c0 c0Var = this.f9034f1;
        if (z10) {
            if (g1Var != null) {
                g1Var.i(i10);
            }
            this.T0.f7239f += i12;
            c0Var.E = true;
            return true;
        }
        try {
            if (!c0Var.j(i12, j11, byteBuffer)) {
                this.f9046r1 = j11;
                return false;
            }
            if (g1Var != null) {
                g1Var.i(i10);
            }
            this.T0.f7238e += i12;
            return true;
        } catch (AudioSink$InitializationException e3) {
            androidx.media3.common.t tVar2 = this.f9038j1;
            if (this.E0) {
                i1 i1Var = this.D;
                i1Var.getClass();
                if (i1Var.f7373a != 0) {
                    i14 = 5004;
                } else {
                    i14 = 5001;
                }
            } else {
                i14 = 5001;
            }
            throw d(e3, tVar2, e3.A, i14);
        } catch (AudioSink$WriteException e10) {
            if (this.E0) {
                i1 i1Var2 = this.D;
                i1Var2.getClass();
                if (i1Var2.f7373a != 0) {
                    i13 = 5003;
                } else {
                    i13 = 5002;
                }
            } else {
                i13 = 5002;
            }
            throw d(e10, tVar, e10.B, i13);
        }
    }

    @Override
    public final boolean m() {
        return this.f9034f1.k();
    }

    @Override
    public final void n() {
        n nVar = this.f9033e1;
        this.f9042n1 = true;
        this.f9038j1 = null;
        this.f9046r1 = -9223372036854775807L;
        try {
            this.f9034f1.f();
            try {
                super.n();
            } finally {
                nVar.a(this.T0);
            }
        } catch (Throwable th2) {
            try {
                super.n();
                throw th2;
            } finally {
                nVar.a(this.T0);
            }
        }
    }

    @Override
    public final void n0() throws ExoPlaybackException {
        try {
            c0 c0Var = this.f9034f1;
            if (!c0Var.L && c0Var.m() && c0Var.e()) {
                c0Var.o();
                c0Var.L = true;
            }
            long j9 = this.U0.f12411e;
            if (j9 != -9223372036854775807L) {
                this.f9046r1 = j9;
            }
        } catch (AudioSink$WriteException e3) {
            throw d(e3, e3.C, e3.B, this.E0 ? 5003 : 5002);
        }
    }

    @Override
    public final void o(boolean z10, boolean z11) {
        i7.c cVar = new i7.c();
        this.T0 = cVar;
        n nVar = this.f9033e1;
        Handler handler = nVar.f9111a;
        if (handler != null) {
            handler.post(new l(nVar, cVar, 6));
        }
        i1 i1Var = this.D;
        i1Var.getClass();
        boolean z12 = i1Var.f7374b;
        c0 c0Var = this.f9034f1;
        if (z12) {
            ta.c0.A(c0Var.P);
            if (!c0Var.V) {
                c0Var.V = true;
                c0Var.q();
            }
        } else if (c0Var.V) {
            c0Var.V = false;
            c0Var.q();
        }
        j7.j jVar = this.F;
        jVar.getClass();
        c0Var.m = jVar;
        e7.b0 b0Var = this.G;
        b0Var.getClass();
        c0Var.f9010r.f9152f = b0Var;
    }

    @Override
    public final void p(long j9, boolean z10, boolean z11) {
        super.p(j9, z10, z11);
        this.f9034f1.f();
        this.f9040l1 = j9;
        this.f9046r1 = -9223372036854775807L;
        this.f9043o1 = false;
        this.f9041m1 = true;
    }

    @Override
    public final void q() {
        x0 x0Var;
        this.f9034f1.f9010r.d();
        if (Build.VERSION.SDK_INT < 35 || (x0Var = this.f9035g1) == null) {
            return;
        }
        ((HashSet) x0Var.B).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) x0Var.D;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override
    public final void r() {
        c0 c0Var = this.f9034f1;
        this.f9043o1 = false;
        this.f9046r1 = -9223372036854775807L;
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
                if (this.f9042n1) {
                    this.f9042n1 = false;
                    c0Var.r();
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
            if (this.f9042n1) {
                this.f9042n1 = false;
                c0Var.r();
            }
            throw th3;
        }
    }

    @Override
    public final void s() {
        this.f9034f1.n();
        this.f9045q1 = true;
    }

    @Override
    public final void setPlaybackParameters(z0 z0Var) {
        c0 c0Var = this.f9034f1;
        c0Var.getClass();
        c0Var.f9016x = new z0(e7.i0.g(z0Var.f1688a, 0.1f, 8.0f), e7.i0.g(z0Var.f1689b, 0.1f, 8.0f));
        if (c0Var.u()) {
            c0Var.s();
            return;
        }
        a0 a0Var = new a0(z0Var, -9223372036854775807L, -9223372036854775807L);
        if (c0Var.m()) {
            c0Var.f9014v = a0Var;
        } else {
            c0Var.f9015w = a0Var;
        }
    }

    @Override
    public final void t() {
        D0();
        this.f9045q1 = false;
        c0 c0Var = this.f9034f1;
        c0Var.O = false;
        if (c0Var.m()) {
            s sVar = c0Var.f9012t;
            v vVar = sVar.f9138e;
            vVar.f9167k = 0L;
            vVar.f9174t = 0;
            vVar.f9173s = 0;
            vVar.l = 0L;
            vVar.f9179y = -9223372036854775807L;
            vVar.f9180z = -9223372036854775807L;
            if (vVar.f9175u == -9223372036854775807L) {
                vVar.f9164h.a(0);
            }
            vVar.f9177w = vVar.a();
            if (!sVar.f9143j || sVar.c()) {
                sVar.f9134a.pause();
            }
        }
    }

    @Override
    public final boolean x0(androidx.media3.common.t tVar) {
        i1 i1Var = this.D;
        i1Var.getClass();
        if (i1Var.f7373a != 0) {
            int iC0 = C0(tVar);
            if ((iC0 & 512) != 0) {
                i1 i1Var2 = this.D;
                i1Var2.getClass();
                if (i1Var2.f7373a == 2 || (iC0 & 1024) != 0 || (tVar.I == 0 && tVar.J == 0)) {
                    return true;
                }
            }
        }
        c0 c0Var = this.f9034f1;
        int i10 = c0Var.f9010r.b(c0Var.g(tVar)).f9083d;
        return i10 == 1 || i10 == 2;
    }

    @Override
    public final int y0(p7.h hVar, androidx.media3.common.t tVar) {
        int iC0;
        d2 d2VarS;
        p7.k kVar;
        boolean z10;
        int i10;
        boolean z11 = true;
        int iC = i7.a.c(1, 0, 0, 0);
        String str = tVar.f1594n;
        String str2 = tVar.f1594n;
        if (!androidx.media3.common.x0.j(str)) {
            return i7.a.c(0, 0, 0, 0);
        }
        int i11 = tVar.O;
        boolean z12 = i11 != 0;
        boolean z13 = i11 == 0 || i11 == 2;
        int i12 = 8;
        c0 c0Var = this.f9034f1;
        if (z13) {
            if (z12) {
                List listC = p7.p.c("audio/raw", false, false);
                if ((listC.isEmpty() ? null : (p7.k) listC.get(0)) == null) {
                    iC0 = 0;
                }
            }
            iC0 = C0(tVar);
            int i13 = c0Var.f9010r.b(c0Var.g(tVar)).f9083d;
            if (i13 == 1 || i13 == 2) {
                return i7.a.c(4, 8, 32, iC0);
            }
        } else {
            iC0 = 0;
        }
        if ("audio/raw".equals(str2) && (i10 = c0Var.f9010r.b(c0Var.g(tVar)).f9083d) != 1 && i10 != 2) {
            return iC;
        }
        int i14 = tVar.F;
        int i15 = tVar.G;
        androidx.media3.common.s sVar = new androidx.media3.common.s();
        sVar.m = androidx.media3.common.x0.n("audio/raw");
        sVar.E = i14;
        sVar.F = i15;
        sVar.G = 2;
        int i16 = c0Var.f9010r.b(c0Var.g(new androidx.media3.common.t(sVar))).f9083d;
        if (i16 != 1 && i16 != 2) {
            return iC;
        }
        if (str2 == null) {
            d2VarS = d2.E;
        } else {
            int i17 = c0Var.f9010r.b(c0Var.g(tVar)).f9083d;
            if (i17 == 1 || i17 == 2) {
                List listC2 = p7.p.c("audio/raw", false, false);
                p7.k kVar2 = listC2.isEmpty() ? null : (p7.k) listC2.get(0);
                d2VarS = kVar2 != null ? t0.s(kVar2) : p7.p.e(hVar, tVar, false, false);
            }
        }
        if (d2VarS.isEmpty()) {
            return iC;
        }
        if (!z13) {
            return i7.a.c(2, 0, 0, 0);
        }
        p7.k kVar3 = (p7.k) d2VarS.get(0);
        boolean zE = kVar3.e(tVar);
        if (!zE) {
            int i18 = 1;
            while (true) {
                if (i18 >= d2VarS.D) {
                    kVar = kVar3;
                    z10 = true;
                    z11 = zE;
                    break;
                }
                kVar = (p7.k) d2VarS.get(i18);
                if (kVar.e(tVar)) {
                    z10 = false;
                    break;
                }
                i18++;
            }
        } else {
            kVar = kVar3;
            z10 = true;
            z11 = zE;
            break;
        }
        int i19 = z11 ? 4 : 3;
        if (z11 && kVar.f(tVar)) {
            i12 = 16;
        }
        return iC0 | (kVar.f12401g ? 64 : 0) | i19 | i12 | 32 | (z10 ? Cast.MAX_NAMESPACE_LENGTH : 0);
    }
}
