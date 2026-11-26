package k7;

import a8.n0;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.common.z0;
import androidx.media3.exoplayer.audio.AudioOutput$WriteException;
import androidx.media3.exoplayer.audio.AudioOutputProvider$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import fh.d2;
import fh.q0;
import fh.r0;
import fh.t0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k9.x0;

public final class c0 {

    public static final AtomicInteger f8992c0 = new AtomicInteger();
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public float H;
    public ByteBuffer I;
    public int J;
    public ByteBuffer K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public androidx.media3.common.e S;
    public AudioDeviceInfo T;
    public int U;
    public boolean V;
    public long W;
    public boolean X;
    public boolean Y;
    public long Z;

    public final Context f8993a;

    public long f8994a0;

    public final a1.i f8995b;

    public Handler f8996b0;

    public final w f8997c;

    public final i0 f8998d;

    public final c7.t f8999e;

    public final h0 f9000f;

    public final d2 f9001g;

    public final ArrayDeque f9002h;

    public int f9003i;

    public y f9004j;

    public final b0 f9005k;
    public final b0 l;
    public j7.j m;

    public gi.c f9006n;

    public k0.n f9007o;

    public k0.n f9008p;

    public c7.j f9009q;

    public u f9010r;

    public x f9011s;

    public s f9012t;

    public androidx.media3.common.d f9013u;

    public a0 f9014v;

    public a0 f9015w;

    public z0 f9016x;

    public boolean f9017y;

    public long f9018z;

    public c0(z zVar) {
        int deviceId;
        Context context = (Context) zVar.f9186a;
        this.f8993a = context == null ? null : context.getApplicationContext();
        this.f9013u = androidx.media3.common.d.f1142i;
        this.f8995b = (a1.i) zVar.f9189d;
        this.f9003i = 0;
        this.f9010r = (u) zVar.f9191f;
        w wVar = new w();
        this.f8997c = wVar;
        i0 i0Var = new i0();
        i0Var.m = e7.i0.f5137b;
        this.f8998d = i0Var;
        this.f8999e = new c7.t();
        this.f9000f = new h0();
        this.f9001g = t0.t(i0Var, wVar);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new androidx.media3.common.e();
        z0 z0Var = z0.f1685d;
        this.f9015w = new a0(z0Var, 0L, 0L);
        this.f9016x = z0Var;
        this.f9017y = false;
        this.f9002h = new ArrayDeque();
        this.f9005k = new b0();
        this.l = new b0();
        int i10 = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i10 = deviceId;
        }
        this.U = i10;
    }

    public static int h(int i10, ByteBuffer byteBuffer) {
        int i11;
        int i12;
        byte b7;
        int i13;
        byte b10;
        int i14;
        int i15;
        int i16;
        int i17;
        if (i10 == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i11 = 0;
            } else {
                byte b11 = byteBuffer.get(26);
                int i18 = 28;
                int i19 = 28;
                for (int i20 = 0; i20 < b11; i20++) {
                    i19 += byteBuffer.get(i20 + 27);
                }
                byte b12 = byteBuffer.get(i19 + 26);
                for (int i21 = 0; i21 < b12; i21++) {
                    i18 += byteBuffer.get(i19 + 27 + i21);
                }
                i11 = i19 + i18;
            }
            int i22 = byteBuffer.get(i11 + 26) + 27 + i11;
            return (int) ((a8.b.m(byteBuffer.get(i22), byteBuffer.limit() - i22 > 1 ? byteBuffer.get(i22 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i10 != 30) {
            switch (i10) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iPosition = byteBuffer.position();
                    String str = e7.i0.f5136a;
                    int iReverseBytes = byteBuffer.getInt(iPosition);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        iReverseBytes = Integer.reverseBytes(iReverseBytes);
                    }
                    if ((iReverseBytes & (-2097152)) != -2097152 || (i15 = (iReverseBytes >>> 19) & 3) == 1 || (i16 = (iReverseBytes >>> 17) & 3) == 0) {
                        i14 = -1;
                    } else {
                        int i23 = (iReverseBytes >>> 12) & 15;
                        int i24 = (iReverseBytes >>> 10) & 3;
                        if (i23 == 0 || i23 == 15 || i24 == 3) {
                            i14 = -1;
                        } else {
                            i14 = 1152;
                            if (i16 != 1) {
                                if (i16 != 2) {
                                    if (i16 != 3) {
                                        throw new IllegalArgumentException();
                                    }
                                    i14 = 384;
                                }
                            } else if (i15 != 3) {
                                i14 = 576;
                            }
                        }
                    }
                    if (i14 != -1) {
                        return i14;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i10) {
                        case 14:
                            int iPosition2 = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i25 = iPosition2;
                            while (true) {
                                if (i25 <= iLimit) {
                                    String str2 = e7.i0.f5136a;
                                    int iReverseBytes2 = byteBuffer.getInt(i25 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                    }
                                    if ((iReverseBytes2 & (-2)) == -126718022) {
                                        i17 = i25 - iPosition2;
                                    } else {
                                        i25++;
                                    }
                                } else {
                                    i17 = -1;
                                }
                            }
                            if (i17 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i17) + (((byteBuffer.get((byteBuffer.position() + i17) + 7) & 255) == 187 ? (byte) 1 : (byte) 0) != 0 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int iPosition3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition3);
                            return a8.b.o(new n0(16, bArr)).f240c;
                        case TYPE_SINT64_VALUE:
                            break;
                        default:
                            throw new IllegalStateException(g4.c.f(i10, "Unexpected audio encoding: "));
                    }
                    break;
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return a8.b.f201c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition4 = byteBuffer.position();
        byte b13 = byteBuffer.get(iPosition4);
        if (b13 != -2) {
            if (b13 == -1) {
                i12 = (byteBuffer.get(iPosition4 + 4) & 7) << 4;
                b10 = byteBuffer.get(iPosition4 + 7);
            } else if (b13 != 31) {
                i12 = (byteBuffer.get(iPosition4 + 4) & 1) << 6;
                b7 = byteBuffer.get(iPosition4 + 5);
            } else {
                i12 = (byteBuffer.get(iPosition4 + 5) & 7) << 4;
                b10 = byteBuffer.get(iPosition4 + 6);
            }
            i13 = b10 & 60;
            return (((i13 >> 2) | i12) + 1) * 32;
        }
        i12 = (byteBuffer.get(iPosition4 + 5) & 1) << 6;
        b7 = byteBuffer.get(iPosition4 + 4);
        i13 = b7 & 252;
        return (((i13 >> 2) | i12) + 1) * 32;
    }

    public final void a(long j9) {
        z0 z0Var;
        boolean zU = u();
        boolean z10 = false;
        a1.i iVar = this.f8995b;
        if (zU) {
            z0Var = z0.f1685d;
        } else {
            if (this.V || !k0.n.a(this.f9008p)) {
                z0Var = z0.f1685d;
            } else {
                int i10 = ((androidx.media3.common.t) this.f9008p.f8479c).H;
                z0Var = this.f9016x;
                c7.s sVar = (c7.s) iVar.D;
                float f3 = z0Var.f1688a;
                sVar.getClass();
                ta.c0.s(f3 > 0.0f);
                if (sVar.f2965c != f3) {
                    sVar.f2965c = f3;
                    sVar.f2971i = true;
                }
                float f10 = z0Var.f1689b;
                ta.c0.s(f10 > 0.0f);
                if (sVar.f2966d != f10) {
                    sVar.f2966d = f10;
                    sVar.f2971i = true;
                }
            }
            this.f9016x = z0Var;
        }
        z0 z0Var2 = z0Var;
        if (!this.V && k0.n.a(this.f9008p)) {
            int i11 = ((androidx.media3.common.t) this.f9008p.f8479c).H;
            z10 = this.f9017y;
            ((g0) iVar.C).f9063o = z10;
        }
        this.f9017y = z10;
        this.f9002h.add(new a0(z0Var2, Math.max(0L, j9), e7.i0.O(((k) this.f9008p.f8481e).f9101b, i())));
        c7.j jVar = (c7.j) this.f9008p.f8482f;
        this.f9009q = jVar;
        jVar.a();
        gi.c cVar = this.f9006n;
        if (cVar != null) {
            final boolean z11 = this.f9017y;
            final n nVar = ((e0) cVar.B).f9033e1;
            Handler handler = nVar.f9111a;
            if (handler != null) {
                handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        i7.v vVar = nVar.f9112b;
                        String str = e7.i0.f5136a;
                        i7.z zVar = vVar.A;
                        boolean z12 = zVar.f7480g0;
                        boolean z13 = z11;
                        if (z12 == z13) {
                            return;
                        }
                        zVar.f7480g0 = z13;
                        zVar.m.f(23, new androidx.media3.cast.o(2, z13));
                    }
                });
            }
        }
    }

    public final s b(k kVar) throws AudioSink$InitializationException {
        try {
            return this.f9010r.a(kVar);
        } catch (AudioOutputProvider$InitializationException e3) {
            AudioSink$InitializationException audioSink$InitializationException = new AudioSink$InitializationException(kVar.f9101b, kVar.f9102c, kVar.f9100a, kVar.f9105f, (androidx.media3.common.t) this.f9008p.f8479c, kVar.f9104e, e3);
            gi.c cVar = this.f9006n;
            if (cVar == null) {
                throw audioSink$InitializationException;
            }
            cVar.r(audioSink$InitializationException);
            throw audioSink$InitializationException;
        }
    }

    public final void c(androidx.media3.common.t tVar, int[] iArr) throws AudioSink$ConfigurationException {
        c7.j jVar;
        androidx.media3.common.t tVar2;
        int i10;
        int iP;
        if (this.f9011s == null && this.f8993a != null) {
            x xVar = new x(this);
            this.f9011s = xVar;
            u uVar = this.f9010r;
            uVar.f();
            if (uVar.f9151e == null) {
                e7.p pVar = new e7.p(Thread.currentThread());
                uVar.f9151e = pVar;
                pVar.f5164i = false;
            }
            uVar.f9151e.a(xVar);
        }
        String str = tVar.f1594n;
        int i11 = tVar.F;
        int i12 = tVar.H;
        if ("audio/raw".equals(str)) {
            ta.c0.s(e7.i0.D(i12));
            int iP2 = e7.i0.p(i12) * i11;
            q0 q0Var = new q0(4);
            q0Var.e(this.f9001g);
            q0Var.c(this.f8999e);
            q0Var.d((c7.m[]) this.f8995b.B);
            jVar = new c7.j(q0Var.g());
            if (jVar.equals(this.f9009q)) {
                jVar = this.f9009q;
            }
            int i13 = tVar.I;
            int i14 = tVar.J;
            i0 i0Var = this.f8998d;
            i0Var.f9084i = i13;
            i0Var.f9085j = i14;
            this.f8997c.f9181i = iArr;
            c7.k kVar = new c7.k(tVar.G, i11, i12);
            try {
                t0 t0Var = jVar.f2914a;
                if (kVar.equals(c7.k.f2918e)) {
                    throw new AudioProcessor$UnhandledAudioFormatException(kVar);
                }
                for (int i15 = 0; i15 < t0Var.size(); i15++) {
                    c7.m mVar = (c7.m) t0Var.get(i15);
                    c7.k kVarE = mVar.e(kVar);
                    if (mVar.a()) {
                        ta.c0.A(!kVarE.equals(c7.k.f2918e));
                        kVar = kVarE;
                    }
                }
                int i16 = kVar.f2920b;
                int i17 = kVar.f2921c;
                androidx.media3.common.s sVarA = tVar.a();
                sVarA.G = i17;
                sVarA.F = kVar.f2919a;
                sVarA.E = i16;
                tVar2 = new androidx.media3.common.t(sVarA);
                i10 = iP2;
                iP = e7.i0.p(i17) * i16;
            } catch (AudioProcessor$UnhandledAudioFormatException e3) {
                throw new AudioSink$ConfigurationException(e3, tVar);
            }
        } else {
            jVar = new c7.j(d2.E);
            tVar2 = tVar;
            i10 = -1;
            iP = -1;
        }
        c7.j jVar2 = jVar;
        h hVarG = g(tVar2);
        androidx.media3.common.t tVar3 = hVarG.f9071a;
        try {
            k kVarC = this.f9010r.c(hVarG);
            boolean z10 = kVarC.f9104e;
            if (kVarC.f9100a == 0) {
                throw new AudioSink$ConfigurationException(g4.c.j("Invalid output encoding (isOffload=", ")", z10), tVar3);
            }
            if (kVarC.f9102c == 0) {
                throw new AudioSink$ConfigurationException(g4.c.j("Invalid output channel config (isOffload=", ")", z10), tVar3);
            }
            this.X = false;
            k0.n nVar = new k0.n(tVar, tVar2, i10, iP, kVarC, jVar2);
            if (m()) {
                this.f9007o = nVar;
            } else {
                this.f9008p = nVar;
            }
        } catch (AudioOutputProvider$ConfigurationException e10) {
            throw new AudioSink$ConfigurationException(e10, tVar);
        }
    }

    public final void d(long j9) throws AudioSink$WriteException {
        gi.c cVar;
        i7.c0 c0Var;
        if (this.K == null) {
            return;
        }
        b0 b0Var = this.l;
        if (b0Var.f8988a != null && (f8992c0.get() > 0 || SystemClock.elapsedRealtime() < b0Var.f8990c)) {
            return;
        }
        int iRemaining = this.K.remaining();
        boolean z10 = false;
        try {
            boolean zD = this.f9012t.d(this.J, j9, this.K);
            this.W = SystemClock.elapsedRealtime();
            b0Var.f8988a = null;
            b0Var.f8989b = -9223372036854775807L;
            b0Var.f8990c = -9223372036854775807L;
            if (this.f9012t.c()) {
                if (this.C > 0) {
                    this.Y = false;
                }
                if (this.O && (cVar = this.f9006n) != null && !zD && !this.Y && (c0Var = ((e0) cVar.B).f12424i0) != null) {
                    c0Var.f7245a.f7364s0 = true;
                }
            }
            if (k0.n.a(this.f9008p)) {
                this.B += (long) (iRemaining - this.K.remaining());
            }
            if (zD) {
                if (!k0.n.a(this.f9008p)) {
                    ta.c0.A(this.K == this.I);
                    this.C = (((long) this.D) * ((long) this.J)) + this.C;
                }
                this.K = null;
            }
        } catch (AudioOutput$WriteException e3) {
            boolean z11 = e3.B;
            if (z11) {
                if (i() > 0) {
                    z10 = true;
                } else if (this.f9012t.c()) {
                    if (((k) this.f9008p.f8481e).f9104e) {
                        this.X = true;
                    }
                    z10 = true;
                }
            }
            AudioSink$WriteException audioSink$WriteException = new AudioSink$WriteException(e3.A, (androidx.media3.common.t) this.f9008p.f8479c, z10);
            gi.c cVar2 = this.f9006n;
            if (cVar2 != null) {
                cVar2.r(audioSink$WriteException);
            }
            if (z11) {
                throw audioSink$WriteException;
            }
            b0Var.a(audioSink$WriteException);
        }
    }

    public final boolean e() throws AudioSink$WriteException {
        ByteBuffer byteBuffer;
        if (!this.f9009q.d()) {
            d(Long.MIN_VALUE);
            if (this.K == null) {
                return true;
            }
            return false;
        }
        c7.j jVar = this.f9009q;
        if (jVar.d() && !jVar.f2917d) {
            jVar.f2917d = true;
            ((c7.m) jVar.f2915b.get(0)).f();
        }
        p(Long.MIN_VALUE);
        if (!this.f9009q.c() || ((byteBuffer = this.K) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    public final void f() {
        if (m()) {
            this.f9018z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.f9015w = new a0(this.f9016x, 0L, 0L);
            this.G = 0L;
            this.f9014v = null;
            this.f9002h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.f8998d.f9088o = 0L;
            c7.j jVar = (c7.j) this.f9008p.f8482f;
            this.f9009q = jVar;
            jVar.a();
            this.f9004j = null;
            k0.n nVar = this.f9007o;
            if (nVar != null) {
                this.f9008p = nVar;
                this.f9007o = null;
            }
            f8992c0.incrementAndGet();
            s sVar = this.f9012t;
            if (sVar.f9138e.f9160d.getPlayState() == 3) {
                sVar.f9134a.pause();
            }
            if (sVar.c()) {
                a1.i iVar = sVar.f9141h;
                iVar.getClass();
                ((s) iVar.D).f9134a.unregisterStreamEventCallback((r) iVar.C);
                ((Handler) iVar.B).removeCallbacksAndMessages(null);
            }
            oj.q qVar = sVar.f9137d;
            if (qVar != null) {
                AudioTrack audioTrack = (AudioTrack) qVar.B;
                q qVar2 = (q) qVar.E;
                qVar2.getClass();
                audioTrack.removeOnRoutingChangedListener(qVar2);
                qVar.E = null;
                sVar.f9137d = null;
            }
            AudioTrack audioTrack2 = sVar.f9134a;
            e7.p pVar = sVar.f9142i;
            Handler handlerL = e7.i0.l(null);
            synchronized (s.f9131p) {
                try {
                    if (s.f9132q == null) {
                        s.f9132q = Executors.newSingleThreadScheduledExecutor(new e7.h0());
                    }
                    s.f9133r++;
                    s.f9132q.schedule(new ab.e(audioTrack2, handlerL, pVar, 11), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f9012t = null;
        }
        b0 b0Var = this.l;
        b0Var.f8988a = null;
        b0Var.f8989b = -9223372036854775807L;
        b0Var.f8990c = -9223372036854775807L;
        b0 b0Var2 = this.f9005k;
        b0Var2.f8988a = null;
        b0Var2.f8989b = -9223372036854775807L;
        b0Var2.f8990c = -9223372036854775807L;
        this.Z = 0L;
        this.f8994a0 = 0L;
        Handler handler = this.f8996b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final h g(androidx.media3.common.t tVar) {
        h hVar = new h(tVar);
        hVar.f9072b = this.f9013u;
        hVar.f9074d = this.f9003i != 0;
        hVar.f9073c = this.T;
        hVar.f9075e = this.Q;
        hVar.f9077g = this.V;
        hVar.f9078h = -1;
        hVar.f9076f = this.U;
        return new h(hVar);
    }

    public final long i() {
        if (!k0.n.a(this.f9008p)) {
            return this.C;
        }
        long j9 = this.B;
        long j10 = this.f9008p.f8478b;
        return ((j9 + j10) - 1) / j10;
    }

    public final boolean j(int r21, long r22, java.nio.ByteBuffer r24) {
        throw new UnsupportedOperationException("Method not decompiled: k7.c0.j(int, long, java.nio.ByteBuffer):boolean");
    }

    public final boolean k() {
        if (!m()) {
            return false;
        }
        if (this.f9012t.c() && this.N) {
            return false;
        }
        long jI = i();
        long jA = this.f9012t.a();
        s sVar = this.f9012t;
        sVar.getClass();
        return jI > e7.i0.Q(jA, (long) sVar.f9134a.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    public final boolean l() throws AudioSink$InitializationException {
        s sVarB;
        x0 x0Var;
        b0 b0Var = this.f9005k;
        if (b0Var.f8988a != null && (f8992c0.get() > 0 || SystemClock.elapsedRealtime() < b0Var.f8990c)) {
            return false;
        }
        try {
            sVarB = b((k) this.f9008p.f8481e);
        } catch (AudioSink$InitializationException e3) {
            k kVar = (k) this.f9008p.f8481e;
            if (kVar.f9105f > 1000000) {
                j jVarA = kVar.a();
                jVarA.f9094f = 1000000;
                k kVar2 = new k(jVarA);
                try {
                    sVarB = b(kVar2);
                    k0.n nVar = this.f9008p;
                    this.f9008p = new k0.n((androidx.media3.common.t) nVar.f8479c, (androidx.media3.common.t) nVar.f8480d, nVar.f8477a, nVar.f8478b, kVar2, (c7.j) nVar.f8482f);
                } catch (AudioSink$InitializationException e10) {
                    e3.addSuppressed(e10);
                    if (!((k) this.f9008p.f8481e).f9104e) {
                        throw e3;
                    }
                    this.X = true;
                    throw e3;
                }
            }
            if (!((k) this.f9008p.f8481e).f9104e) {
                throw e3;
            }
            this.X = true;
            throw e3;
        }
        this.f9012t = sVarB;
        y yVar = new y(this, (k) this.f9008p.f8481e);
        this.f9004j = yVar;
        sVarB.f9142i.a(yVar);
        if (this.f9012t.c()) {
            k0.n nVar2 = this.f9008p;
            if (((k) nVar2.f8481e).f9110k) {
                s sVar = this.f9012t;
                androidx.media3.common.t tVar = (androidx.media3.common.t) nVar2.f8479c;
                sVar.f9134a.setOffloadDelayPadding(tVar.I, tVar.J);
            }
        }
        j7.j jVar = this.m;
        if (jVar != null) {
            s sVar2 = this.f9012t;
            sVar2.getClass();
            LogSessionId logSessionIdA = jVar.a();
            if (!logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                sVar2.f9134a.setLogSessionId(logSessionIdA);
            }
        }
        if (m()) {
            this.f9012t.f9134a.setVolume(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.f9012t.f9134a.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.f9012t.f9134a.getAudioSessionId();
        boolean z10 = audioSessionId != this.Q;
        this.Q = audioSessionId;
        gi.c cVar = this.f9006n;
        if (cVar != null) {
            int i10 = ((k) this.f9008p.f8481e).f9100a;
            d0 d0Var = new d0();
            n nVar3 = ((e0) cVar.B).f9033e1;
            Handler handler = nVar3.f9111a;
            if (handler != null) {
                handler.post(new l(nVar3, d0Var, 7));
            }
            if (z10) {
                this.R = true;
                k0.n nVar4 = this.f9008p;
                j jVarA2 = ((k) nVar4.f8481e).a();
                jVarA2.f9096h = this.Q;
                this.f9008p = new k0.n((androidx.media3.common.t) nVar4.f8479c, (androidx.media3.common.t) nVar4.f8480d, nVar4.f8477a, nVar4.f8478b, new k(jVarA2), (c7.j) nVar4.f8482f);
                k0.n nVar5 = this.f9007o;
                if (nVar5 != null) {
                    j jVarA3 = ((k) nVar5.f8481e).a();
                    jVarA3.f9096h = this.Q;
                    this.f9007o = new k0.n((androidx.media3.common.t) nVar5.f8479c, (androidx.media3.common.t) nVar5.f8480d, nVar5.f8477a, nVar5.f8478b, new k(jVarA3), (c7.j) nVar5.f8482f);
                }
                gi.c cVar2 = this.f9006n;
                int i11 = this.Q;
                e0 e0Var = (e0) cVar2.B;
                if (Build.VERSION.SDK_INT >= 35 && (x0Var = e0Var.f9035g1) != null) {
                    x0Var.R(i11);
                }
                n nVar6 = e0Var.f9033e1;
                Handler handler2 = nVar6.f9111a;
                if (handler2 != null) {
                    handler2.post(new i7.a0(nVar6, i11, 1));
                }
            }
        }
        return true;
    }

    public final boolean m() {
        return this.f9012t != null;
    }

    public final void n() {
        this.O = true;
        if (m()) {
            s sVar = this.f9012t;
            v vVar = sVar.f9138e;
            if (vVar.f9175u != -9223372036854775807L) {
                vVar.f9158b.getClass();
                vVar.f9175u = e7.i0.H(SystemClock.elapsedRealtime());
            }
            vVar.f9166j = e7.i0.O(vVar.f9161e, vVar.a());
            vVar.f9164h.a(0);
            if (!sVar.f9143j || sVar.c()) {
                sVar.f9134a.play();
            }
        }
    }

    public final void o() {
        if (this.M) {
            return;
        }
        this.M = true;
        if (this.f9012t.c()) {
            this.N = false;
        }
        s sVar = this.f9012t;
        if (sVar.f9143j) {
            return;
        }
        sVar.f9143j = true;
        v vVar = sVar.f9138e;
        long jB = sVar.b();
        vVar.f9177w = vVar.a();
        vVar.f9158b.getClass();
        vVar.f9175u = e7.i0.H(SystemClock.elapsedRealtime());
        vVar.f9178x = jB;
        sVar.f9134a.stop();
    }

    public final void p(long j9) throws AudioSink$WriteException {
        ByteBuffer byteBuffer;
        d(j9);
        if (this.K != null) {
            return;
        }
        if (!this.f9009q.d()) {
            ByteBuffer byteBuffer2 = this.I;
            if (byteBuffer2 != null) {
                t(byteBuffer2);
                d(j9);
                return;
            }
            return;
        }
        while (!this.f9009q.c()) {
            do {
                c7.j jVar = this.f9009q;
                if (jVar.d()) {
                    ByteBuffer byteBuffer3 = jVar.f2916c[jVar.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        jVar.e(c7.m.f2925a);
                        byteBuffer = jVar.f2916c[jVar.b()];
                    }
                } else {
                    byteBuffer = c7.m.f2925a;
                }
                if (byteBuffer.hasRemaining()) {
                    t(byteBuffer);
                    d(j9);
                } else {
                    ByteBuffer byteBuffer4 = this.I;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    c7.j jVar2 = this.f9009q;
                    ByteBuffer byteBuffer5 = this.I;
                    if (jVar2.d() && !jVar2.f2917d) {
                        jVar2.e(byteBuffer5);
                    }
                }
            } while (this.K == null);
            return;
        }
    }

    public final void q() {
        if (this.f9008p != null) {
            k0.n nVar = this.f9007o;
            if (nVar != null) {
                this.f9008p = nVar;
                this.f9007o = null;
            }
            try {
                k kVarC = this.f9010r.c(g((androidx.media3.common.t) this.f9008p.f8480d));
                k0.n nVar2 = this.f9008p;
                this.f9008p = new k0.n((androidx.media3.common.t) nVar2.f8479c, (androidx.media3.common.t) nVar2.f8480d, nVar2.f8477a, nVar2.f8478b, kVarC, (c7.j) nVar2.f8482f);
            } catch (AudioOutputProvider$ConfigurationException e3) {
                throw new IllegalStateException(new AudioSink$ConfigurationException(e3, (androidx.media3.common.t) this.f9008p.f8479c));
            }
        }
        f();
    }

    public final void r() {
        f();
        r0 r0VarListIterator = this.f9001g.listIterator(0);
        while (r0VarListIterator.hasNext()) {
            ((c7.m) r0VarListIterator.next()).reset();
        }
        this.f8999e.reset();
        this.f9000f.reset();
        c7.j jVar = this.f9009q;
        if (jVar != null) {
            t0 t0Var = jVar.f2914a;
            for (int i10 = 0; i10 < t0Var.size(); i10++) {
                c7.m mVar = (c7.m) t0Var.get(i10);
                c7.l lVar = c7.l.f2923b;
                mVar.flush();
                mVar.reset();
            }
            jVar.f2916c = new ByteBuffer[0];
            c7.k kVar = c7.k.f2918e;
            jVar.f2917d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void s() {
        if (m()) {
            s sVar = this.f9012t;
            z0 z0Var = this.f9016x;
            AudioTrack audioTrack = sVar.f9134a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(z0Var.f1688a).setPitch(z0Var.f1689b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e3) {
                e7.a.n("AudioTrackAudioOutput", "Failed to set playback params", e3);
            }
            v vVar = sVar.f9138e;
            vVar.f9165i = audioTrack.getPlaybackParams().getSpeed();
            vVar.f9164h.a(0);
            vVar.f9167k = 0L;
            vVar.f9174t = 0;
            vVar.f9173s = 0;
            vVar.l = 0L;
            vVar.f9179y = -9223372036854775807L;
            vVar.f9180z = -9223372036854775807L;
            PlaybackParams playbackParams = this.f9012t.f9134a.getPlaybackParams();
            this.f9016x = new z0(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void t(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder;
        int i10;
        byte b7;
        int i11;
        int i12;
        int i13;
        ta.c0.A(this.K == null);
        if (byteBuffer.hasRemaining()) {
            if (k0.n.a(this.f9008p)) {
                int iQ = (int) e7.i0.Q(e7.i0.H(20L), ((k) this.f9008p.f8481e).f9101b, 1000000L, RoundingMode.UP);
                long jI = i();
                long j9 = iQ;
                if (jI >= j9) {
                    byteBufferOrder = byteBuffer;
                } else {
                    k0.n nVar = this.f9008p;
                    int i14 = ((k) nVar.f8481e).f9100a;
                    int i15 = nVar.f8478b;
                    int i16 = (int) jI;
                    byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i16 < iQ) {
                        if (i14 != 2) {
                            if (i14 == 3) {
                                i12 = (byteBuffer.get() & 255) << 24;
                            } else if (i14 == 4) {
                                float fG = e7.i0.g(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i12 = (int) (fG < 0.0f ? (-fG) * (-2.1474836E9f) : fG * 2.1474836E9f);
                            } else if (i14 != 21) {
                                if (i14 == 22) {
                                    i10 = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                    b7 = byteBuffer.get();
                                } else if (i14 == 268435456) {
                                    i10 = (byteBuffer.get() & 255) << 24;
                                    i11 = (byteBuffer.get() & 255) << 16;
                                } else if (i14 == 1342177280) {
                                    i10 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i11 = (byteBuffer.get() & 255) << 8;
                                } else {
                                    if (i14 != 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    i10 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i11 = byteBuffer.get() & 255;
                                }
                                i12 = i10 | i11;
                            } else {
                                i10 = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b7 = byteBuffer.get();
                            }
                            i13 = (int) ((((long) i12) * ((long) i16)) / j9);
                            if (i14 != 2) {
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 24));
                            } else if (i14 != 3) {
                                byteBufferOrder.put((byte) (i13 >> 24));
                            } else if (i14 != 4) {
                                if (i14 != 21) {
                                    byteBufferOrder.put((byte) (i13 >> 8));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                } else if (i14 != 22) {
                                    byteBufferOrder.put((byte) i13);
                                    byteBufferOrder.put((byte) (i13 >> 8));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                } else if (i14 != 268435456) {
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                } else if (i14 != 1342177280) {
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                    byteBufferOrder.put((byte) (i13 >> 8));
                                } else {
                                    if (i14 == 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                    byteBufferOrder.put((byte) (i13 >> 8));
                                    byteBufferOrder.put((byte) i13);
                                }
                            } else if (i13 < 0) {
                                byteBufferOrder.putFloat((-i13) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i13 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + i15) {
                                i16++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i10 = (byteBuffer.get() & 255) << 16;
                            b7 = byteBuffer.get();
                        }
                        i11 = (b7 & 255) << 24;
                        i12 = i10 | i11;
                        i13 = (int) ((((long) i12) * ((long) i16)) / j9);
                        if (i14 != 2) {
                            byteBufferOrder.put((byte) (i13 >> 16));
                            byteBufferOrder.put((byte) (i13 >> 24));
                        } else if (i14 != 3) {
                            byteBufferOrder.put((byte) (i13 >> 24));
                        } else if (i14 != 4) {
                            if (i14 != 21) {
                                byteBufferOrder.put((byte) (i13 >> 8));
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 24));
                            } else if (i14 != 22) {
                                byteBufferOrder.put((byte) i13);
                                byteBufferOrder.put((byte) (i13 >> 8));
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 24));
                            } else if (i14 != 268435456) {
                                byteBufferOrder.put((byte) (i13 >> 24));
                                byteBufferOrder.put((byte) (i13 >> 16));
                            } else if (i14 != 1342177280) {
                                byteBufferOrder.put((byte) (i13 >> 24));
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 8));
                            } else {
                                if (i14 == 1610612736) {
                                    throw new IllegalStateException();
                                }
                                byteBufferOrder.put((byte) (i13 >> 24));
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 8));
                                byteBufferOrder.put((byte) i13);
                            }
                        } else if (i13 < 0) {
                            byteBufferOrder.putFloat((-i13) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i13 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + i15) {
                            i16++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                }
            } else {
                byteBufferOrder = byteBuffer;
            }
            this.K = byteBufferOrder;
        }
    }

    public final boolean u() {
        k0.n nVar = this.f9008p;
        return nVar != null && ((k) nVar.f8481e).f9109j;
    }
}
