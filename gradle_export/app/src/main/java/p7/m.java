package p7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.common.s;
import androidx.media3.common.t;
import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import b3.g1;
import ca.v;
import com.google.android.gms.internal.play_billing.q1;
import e7.i0;
import fh.e1;
import fh.k2;
import fh.s2;
import i7.c0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import k7.f0;
import n7.q;
import s7.a1;
import sd.y1;

public abstract class m extends i7.a {

    public static final byte[] f12412d1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public int A0;
    public int B0;
    public ByteBuffer C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public int J0;
    public int K0;
    public boolean L0;
    public boolean M0;
    public long N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public final i S;
    public ExoPlaybackException S0;
    public final h T;
    public i7.c T0;
    public final boolean U;
    public l U0;
    public final float V;
    public long V0;
    public final h7.e W;
    public boolean W0;
    public final h7.e X;
    public boolean X0;
    public final h7.e Y;
    public boolean Y0;
    public final f Z;
    public long Z0;

    public final MediaCodec.BufferInfo f12413a0;

    public i7.b f12414a1;

    public final ArrayDeque f12415b0;

    public i7.b f12416b1;

    public final f0 f12417c0;

    public e1 f12418c1;

    public final AtomicInteger f12419d0;

    public t f12420e0;

    public t f12421f0;

    public n7.e f12422g0;

    public n7.e f12423h0;

    public c0 f12424i0;

    public MediaCrypto f12425j0;

    public final long f12426k0;

    public float f12427l0;

    public float f12428m0;

    public g1 f12429n0;

    public t f12430o0;

    public MediaFormat f12431p0;

    public boolean f12432q0;

    public float f12433r0;

    public ArrayDeque f12434s0;

    public MediaCodecRenderer$DecoderInitializationException f12435t0;

    public k f12436u0;

    public boolean f12437v0;

    public boolean f12438w0;

    public boolean f12439x0;

    public long f12440y0;

    public long f12441z0;

    public m(int i10, i iVar, boolean z10, float f3) {
        super(i10);
        h hVar = h.B;
        this.S = iVar;
        this.T = hVar;
        this.U = z10;
        this.V = f3;
        this.f12419d0 = new AtomicInteger();
        this.W = new h7.e(0);
        this.X = new h7.e(0);
        this.Y = new h7.e(2);
        f fVar = new f(2);
        fVar.L = 32;
        this.Z = fVar;
        this.f12413a0 = new MediaCodec.BufferInfo();
        this.f12427l0 = 1.0f;
        this.f12428m0 = 1.0f;
        this.f12426k0 = -9223372036854775807L;
        this.f12415b0 = new ArrayDeque();
        this.U0 = l.f12406f;
        fVar.s(0);
        fVar.E.order(ByteOrder.nativeOrder());
        f0 f0Var = new f0();
        f0Var.f9052a = c7.m.f2925a;
        f0Var.f9054c = 0;
        f0Var.f9053b = 2;
        this.f12417c0 = f0Var;
        this.f12433r0 = -1.0f;
        this.I0 = 0;
        this.A0 = -1;
        this.B0 = -1;
        this.f12441z0 = -9223372036854775807L;
        this.N0 = -9223372036854775807L;
        this.V0 = -9223372036854775807L;
        this.f12440y0 = -9223372036854775807L;
        this.J0 = 0;
        this.K0 = 0;
        this.T0 = new i7.c();
        this.Y0 = false;
        this.Z0 = 0L;
        int i11 = e1.C;
        this.f12418c1 = k2.J;
        i7.b bVar = i7.b.f7221b;
        this.f12414a1 = bVar;
        this.f12416b1 = bVar;
    }

    @Override
    public void A(float f3, float f10) {
        this.f12427l0 = f3;
        this.f12428m0 = f10;
        z0(this.f12430o0);
    }

    public final void A0() throws ExoPlaybackException {
        n7.e eVar = this.f12423h0;
        eVar.getClass();
        h7.a aVarG = eVar.g();
        if (aVarG instanceof q) {
            try {
                MediaCrypto mediaCrypto = this.f12425j0;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((q) aVarG).f11180b);
            } catch (MediaCryptoException e3) {
                throw d(e3, this.f12420e0, false, 6006);
            }
        }
        r0(this.f12423h0);
        this.J0 = 0;
        this.K0 = 0;
    }

    @Override
    public final int B(t tVar) throws ExoPlaybackException {
        try {
            return y0(this.T, tVar);
        } catch (MediaCodecUtil$DecoderQueryException e3) {
            throw d(e3, tVar, false, 4002);
        }
    }

    public final void B0(long j9) {
        t tVar = (t) this.U0.f12410d.U(j9);
        if (tVar == null && this.W0 && this.f12431p0 != null) {
            tVar = (t) this.U0.f12410d.T();
        }
        if (tVar != null) {
            this.f12421f0 = tVar;
        } else if (!this.f12432q0 || this.f12421f0 == null) {
            return;
        }
        t tVar2 = this.f12421f0;
        tVar2.getClass();
        e0(tVar2, this.f12431p0);
        this.f12432q0 = false;
        this.W0 = false;
    }

    @Override
    public final int C() {
        return 8;
    }

    public final void E(MediaFormat mediaFormat) {
        for (Map.Entry entry : this.f12414a1.f7222a.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                mediaFormat.setString(str, null);
            } else if (value instanceof Integer) {
                mediaFormat.setInteger(str, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                mediaFormat.setLong(str, ((Long) value).longValue());
            } else if (value instanceof Float) {
                mediaFormat.setFloat(str, ((Float) value).floatValue());
            } else if (value instanceof String) {
                mediaFormat.setString(str, (String) value);
            } else if (value instanceof ByteBuffer) {
                mediaFormat.setByteBuffer(str, (ByteBuffer) value);
            }
        }
    }

    public final boolean F(long j9, long j10) {
        f fVar;
        ?? r4;
        ?? r28;
        ta.c0.A(!this.P0);
        f fVar2 = this.Z;
        if (fVar2.v()) {
            ByteBuffer byteBuffer = fVar2.E;
            int i10 = this.B0;
            int i11 = fVar2.K;
            long j11 = fVar2.G;
            boolean zV = V(this.L, fVar2.J);
            boolean zC = fVar2.c(4);
            t tVar = this.f12421f0;
            tVar.getClass();
            fVar = fVar2;
            if (k0(j9, j10, null, byteBuffer, i10, 0, i11, j11, zV, zC, tVar)) {
                g0(fVar.J);
                fVar.q();
            }
        }
        fVar = fVar2;
        if (this.O0) {
            this.P0 = true;
            return false;
        }
        ?? r7 = 0;
        boolean z10 = this.F0;
        h7.e eVar = this.Y;
        if (z10) {
            ta.c0.A(fVar.u(eVar));
            this.F0 = false;
        }
        if (this.G0) {
            if (fVar.v()) {
                return true;
            }
            this.E0 = false;
            o0();
            this.G0 = false;
            W();
            if (!this.E0) {
                return false;
            }
        }
        ta.c0.A(!this.O0);
        h7.b bVar = this.C;
        bVar.m();
        eVar.q();
        while (true) {
            eVar.q();
            int iW = w(bVar, eVar, r7);
            if (iW == -5) {
                d0(bVar);
            } else if (iW != -4) {
                if (iW != -3) {
                    throw new IllegalStateException();
                }
                if (j()) {
                    R().f12411e = this.N0;
                }
            } else if (eVar.c(4)) {
                this.O0 = true;
                R().f12411e = this.N0;
            } else {
                this.N0 = Math.max(this.N0, eVar.G);
                if (j() || this.X.c(536870912)) {
                    R().f12411e = this.N0;
                }
                byte[] bArr = null;
                if (this.Q0) {
                    t tVar2 = this.f12420e0;
                    tVar2.getClass();
                    this.f12421f0 = tVar2;
                    if (Objects.equals(tVar2.f1594n, "audio/opus") && !this.f12421f0.f1597q.isEmpty()) {
                        byte[] bArr2 = (byte[]) this.f12421f0.f1597q.get(r7);
                        int i12 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                        s sVarA = this.f12421f0.a();
                        sVarA.H = i12;
                        this.f12421f0 = new t(sVarA);
                    }
                    e0(this.f12421f0, null);
                    this.Q0 = r7;
                }
                eVar.t();
                t tVar3 = this.f12421f0;
                if (tVar3 != null && Objects.equals(tVar3.f1594n, "audio/opus")) {
                    if (eVar.c(268435456)) {
                        eVar.C = this.f12421f0;
                        T(eVar);
                    }
                    if (this.L - eVar.G <= 80000) {
                        ?? r10 = this.f12421f0.f1597q;
                        f0 f0Var = this.f12417c0;
                        f0Var.getClass();
                        eVar.E.getClass();
                        if (eVar.E.limit() - eVar.E.position() != 0) {
                            if (f0Var.f9053b == 2 && (r10.size() == 1 || r10.size() == 3)) {
                                bArr = (byte[]) r10.get(r7);
                            }
                            ByteBuffer byteBuffer2 = eVar.E;
                            int iPosition = byteBuffer2.position();
                            int iLimit = byteBuffer2.limit();
                            int i13 = iLimit - iPosition;
                            int i14 = (i13 + 255) / 255;
                            int i15 = i14 + 27 + i13;
                            if (f0Var.f9053b == 2) {
                                int length = bArr != null ? bArr.length + 28 : 47;
                                i15 = (length == true ? 1 : 0) + 44 + i15;
                                r4 = length;
                            } else {
                                r4 = r7;
                            }
                            if (f0Var.f9052a.capacity() < i15) {
                                f0Var.f9052a = ByteBuffer.allocate(i15).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                f0Var.f9052a.clear();
                            }
                            ByteBuffer byteBuffer3 = f0Var.f9052a;
                            if (f0Var.f9053b == 2) {
                                if (bArr != null) {
                                    f0.a(byteBuffer3, 0L, 0, 1, true);
                                    byteBuffer3.put(v.r(bArr.length));
                                    byteBuffer3.put(bArr);
                                    byteBuffer3.putInt(22, i0.k(byteBuffer3.arrayOffset(), byteBuffer3.array(), bArr.length + 28, 0));
                                    byteBuffer3.position(bArr.length + 28);
                                } else {
                                    byteBuffer3.put(f0.f9050d);
                                }
                                byteBuffer3.put(f0.f9051e);
                                r28 = r4;
                            } else {
                                r28 = r4 == true ? 1 : 0;
                                iLimit = iLimit;
                            }
                            int iM = f0Var.f9054c + ((int) ((a8.b.m(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                            f0Var.f9054c = iM;
                            f0.a(byteBuffer3, iM, f0Var.f9053b, i14, false);
                            for (int i16 = 0; i16 < i14; i16++) {
                                if (i13 >= 255) {
                                    byteBuffer3.put((byte) -1);
                                    i13 -= 255;
                                } else {
                                    byteBuffer3.put((byte) i13);
                                    i13 = 0;
                                }
                            }
                            int i17 = iLimit;
                            while (iPosition < i17) {
                                byteBuffer3.put(byteBuffer2.get(iPosition));
                                iPosition++;
                            }
                            byteBuffer2.position(byteBuffer2.limit());
                            byteBuffer3.flip();
                            if (f0Var.f9053b == 2) {
                                byteBuffer3.putInt(r28 + 66, i0.k(byteBuffer3.arrayOffset() + r28 + 44, byteBuffer3.array(), byteBuffer3.limit() - byteBuffer3.position(), 0));
                            } else {
                                byteBuffer3.putInt(22, i0.k(byteBuffer3.arrayOffset(), byteBuffer3.array(), byteBuffer3.limit() - byteBuffer3.position(), 0));
                            }
                            f0Var.f9053b++;
                            f0Var.f9052a = byteBuffer3;
                            eVar.q();
                            eVar.s(f0Var.f9052a.remaining());
                            eVar.E.put(f0Var.f9052a);
                            eVar.t();
                        }
                    }
                }
                if (fVar.v()) {
                    long j12 = this.L;
                    if (V(j12, fVar.J) == V(j12, eVar.G)) {
                        if (!fVar.u(eVar)) {
                            r7 = 0;
                        }
                    }
                } else if (!fVar.u(eVar)) {
                    r7 = 0;
                }
                this.F0 = true;
            }
            if (fVar.v()) {
                fVar.t();
            }
            return fVar.v() || this.O0 || this.G0;
        }
    }

    public abstract i7.d G(k kVar, t tVar, t tVar2);

    public MediaCodecDecoderException H(IllegalStateException illegalStateException, k kVar) {
        return new MediaCodecDecoderException(illegalStateException, kVar);
    }

    public final boolean I() throws ExoPlaybackException {
        if (!this.L0) {
            A0();
            return true;
        }
        this.J0 = 1;
        this.K0 = 2;
        return true;
    }

    public final boolean J(long j9, long j10) throws ExoPlaybackException {
        int i10;
        int i11;
        long j11;
        int i12;
        MediaFormat mediaFormat;
        MediaCodec.BufferInfo bufferInfo = this.f12413a0;
        g1 g1Var = this.f12429n0;
        g1Var.getClass();
        boolean z10 = true;
        boolean z11 = false;
        if (this.B0 >= 0) {
            j11 = -9223372036854775807L;
        } else {
            ((j) g1Var.f2032f).t();
            e eVar = (e) g1Var.f2031e;
            synchronized (eVar.f12381a) {
                try {
                    eVar.b();
                    if (!(eVar.l > 0 || eVar.m)) {
                        ba.n nVar = eVar.f12385e;
                        int i13 = nVar.f2354b;
                        int i14 = nVar.f2355c;
                        if (!(i13 == i14)) {
                            if (i13 == i14) {
                                throw new ArrayIndexOutOfBoundsException();
                            }
                            int i15 = nVar.f2353a[i13];
                            nVar.f2354b = nVar.f2356d & (i13 + 1);
                            if (i15 >= 0) {
                                eVar.f12388h.getClass();
                                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) eVar.f12386f.remove();
                                i10 = i15;
                                i11 = -2;
                                j11 = -9223372036854775807L;
                                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                            } else {
                                i10 = i15;
                                i11 = -2;
                                j11 = -9223372036854775807L;
                                if (i10 == -2) {
                                    eVar.f12388h = (MediaFormat) eVar.f12387g.remove();
                                }
                            }
                            i12 = i10;
                        }
                    }
                    i12 = -1;
                    i11 = -2;
                    j11 = -9223372036854775807L;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (i12 < 0) {
                if (i12 != i11) {
                    if (this.f12439x0 && (this.O0 || this.J0 == 2)) {
                        j0();
                    }
                    long j12 = this.f12440y0;
                    if (j12 != j11) {
                        long j13 = j12 + 100;
                        this.G.getClass();
                        if (j13 < System.currentTimeMillis()) {
                            j0();
                            return false;
                        }
                    }
                    return false;
                }
                g1 g1Var2 = this.f12429n0;
                g1Var2.getClass();
                e eVar2 = (e) g1Var2.f2031e;
                synchronized (eVar2.f12381a) {
                    mediaFormat = eVar2.f12388h;
                    if (mediaFormat == null) {
                        throw new IllegalStateException();
                    }
                }
                if (!this.f12418c1.isEmpty()) {
                    e1<String> e1Var = this.f12418c1;
                    i7.b bVar = i7.b.f7221b;
                    HashMap map = new HashMap();
                    for (String str : e1Var) {
                        if (mediaFormat.containsKey(str)) {
                            int valueTypeForKey = mediaFormat.getValueTypeForKey(str);
                            if (valueTypeForKey == 1) {
                                map.put(str, Integer.valueOf(mediaFormat.getInteger(str)));
                            } else if (valueTypeForKey == 2) {
                                map.put(str, Long.valueOf(mediaFormat.getLong(str)));
                            } else if (valueTypeForKey == 3) {
                                map.put(str, Float.valueOf(mediaFormat.getFloat(str)));
                            } else if (valueTypeForKey == 4) {
                                map.put(str, mediaFormat.getString(str));
                            } else if (valueTypeForKey == 5) {
                                ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                                if (byteBuffer == null) {
                                    map.put(str, null);
                                } else {
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
                                    byteBufferAllocate.put(byteBuffer.duplicate());
                                    byteBufferAllocate.flip();
                                    map.put(str, byteBufferAllocate);
                                }
                            }
                        }
                    }
                    i7.b bVar2 = new i7.b(map);
                    if (!bVar2.equals(this.f12416b1)) {
                        this.f12416b1 = bVar2;
                        b0(bVar2);
                    }
                }
                this.f12431p0 = mediaFormat;
                this.f12432q0 = true;
                return true;
            }
            bufferInfo.presentationTimeUs -= this.Z0;
            if (this.f12438w0) {
                this.f12438w0 = false;
                g1Var.i(i12);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                j0();
                return false;
            }
            this.B0 = i12;
            ByteBuffer outputBuffer = ((MediaCodec) g1Var.f2030d).getOutputBuffer(i12);
            this.C0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo.offset);
                this.C0.limit(bufferInfo.offset + bufferInfo.size);
            }
            B0(bufferInfo.presentationTimeUs);
        }
        if (!this.Y0 && bufferInfo.presentationTimeUs >= this.L) {
            z10 = false;
        }
        long j14 = this.U0.f12411e;
        if (j14 != j11 && j14 <= bufferInfo.presentationTimeUs) {
            z11 = z10;
        }
        this.D0 = z11;
        ByteBuffer byteBuffer2 = this.C0;
        int i16 = this.B0;
        int i17 = bufferInfo.flags;
        long j15 = bufferInfo.presentationTimeUs;
        t tVar = this.f12421f0;
        tVar.getClass();
        if (!k0(j9, j10, g1Var, byteBuffer2, i16, i17, 1, j15, z10, z11, tVar)) {
            return false;
        }
        g0(bufferInfo.presentationTimeUs);
        boolean z12 = (bufferInfo.flags & 4) != 0;
        if (!z12 && this.M0 && this.D0) {
            this.G.getClass();
            this.f12440y0 = System.currentTimeMillis();
        }
        this.B0 = -1;
        this.C0 = null;
        if (!z12) {
            return true;
        }
        j0();
        return false;
    }

    public final boolean K() throws ExoPlaybackException {
        int iPosition;
        h7.b bVar;
        e eVar;
        oi.p pVar;
        int i10;
        long j9;
        boolean zC;
        int iN;
        long j10;
        long j11;
        h7.c cVar;
        int i11;
        t tVar;
        int i12;
        h7.e eVar2 = this.X;
        g1 g1Var = this.f12429n0;
        if (g1Var != null && this.J0 != 2 && !this.O0) {
            if (this.A0 < 0) {
                ((j) g1Var.f2032f).t();
                e eVar3 = (e) g1Var.f2031e;
                synchronized (eVar3.f12381a) {
                    try {
                        eVar3.b();
                        i12 = -1;
                        if (!(eVar3.l > 0 || eVar3.m)) {
                            ba.n nVar = eVar3.f12384d;
                            int i13 = nVar.f2354b;
                            int i14 = nVar.f2355c;
                            if (!(i13 == i14)) {
                                if (i13 == i14) {
                                    throw new ArrayIndexOutOfBoundsException();
                                }
                                i12 = nVar.f2353a[i13];
                                nVar.f2354b = (i13 + 1) & nVar.f2356d;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.A0 = i12;
                if (i12 >= 0) {
                    eVar2.E = ((MediaCodec) g1Var.f2030d).getInputBuffer(i12);
                    eVar2.q();
                    if (this.J0 == 1) {
                        if (!this.f12439x0) {
                            this.M0 = true;
                            g1Var.g(this.A0, 0, 4, 0L);
                            this.A0 = -1;
                            eVar2.E = null;
                        }
                        this.J0 = 2;
                        return false;
                    }
                    if (this.f12437v0) {
                        this.f12437v0 = false;
                        ByteBuffer byteBuffer = eVar2.E;
                        byteBuffer.getClass();
                        byteBuffer.put(f12412d1);
                        g1Var.g(this.A0, 38, 0, 0L);
                        this.A0 = -1;
                        eVar2.E = null;
                        this.L0 = true;
                        return true;
                    }
                    if (this.I0 == 1) {
                        i11 = 0;
                        while (true) {
                            tVar = this.f12430o0;
                            tVar.getClass();
                            if (i11 < tVar.f1597q.size()) {
                                break;
                            }
                            byte[] bArr = (byte[]) this.f12430o0.f1597q.get(i11);
                            ByteBuffer byteBuffer2 = eVar2.E;
                            byteBuffer2.getClass();
                            byteBuffer2.put(bArr);
                            i11++;
                        }
                        this.I0 = 2;
                    }
                    ByteBuffer byteBuffer3 = eVar2.E;
                    byteBuffer3.getClass();
                    iPosition = byteBuffer3.position();
                    bVar = this.C;
                    bVar.m();
                    try {
                        oi.p pVar2 = new oi.p(this, bVar, 5);
                        eVar = (e) g1Var.f2031e;
                        pVar = new oi.p(g1Var, pVar2, 4);
                        synchronized (eVar.f12381a) {
                            eVar.b();
                            pVar.run();
                        }
                        i10 = this.f12419d0.get();
                        if (i10 == -3) {
                            if (j()) {
                                R().f12411e = this.N0;
                                return false;
                            }
                        } else {
                            if (i10 == -5) {
                                if (this.I0 == 2) {
                                    eVar2.q();
                                    this.I0 = 1;
                                }
                                d0(bVar);
                                return true;
                            }
                            if (eVar2.c(4)) {
                                if (!this.L0 || eVar2.c(1)) {
                                    j9 = eVar2.G;
                                    if (!t0(eVar2)) {
                                        zC = eVar2.c(1073741824);
                                        if (zC) {
                                            cVar = eVar2.D;
                                            if (iPosition == 0) {
                                                cVar.getClass();
                                            } else {
                                                if (cVar.f6611d == null) {
                                                    int[] iArr = new int[1];
                                                    cVar.f6611d = iArr;
                                                    cVar.f6616i.numBytesOfClearData = iArr;
                                                }
                                                int[] iArr2 = cVar.f6611d;
                                                iArr2[0] = iArr2[0] + iPosition;
                                            }
                                        }
                                        if (this.Q0) {
                                            q1 q1Var = R().f12410d;
                                            t tVar2 = this.f12420e0;
                                            tVar2.getClass();
                                            q1Var.f(tVar2, j9);
                                            this.Q0 = false;
                                        }
                                        this.N0 = Math.max(this.N0, j9);
                                        if (j() || eVar2.c(536870912)) {
                                            R().f12411e = this.N0;
                                        }
                                        eVar2.t();
                                        if (eVar2.c(268435456)) {
                                            T(eVar2);
                                        }
                                        if (this.Y0) {
                                            j11 = this.N0;
                                            if (j9 <= j11) {
                                                this.Z0 = (j11 - j9) + 1 + this.Z0;
                                            }
                                            this.N0 = j9;
                                            this.Y0 = false;
                                        }
                                        i0(eVar2);
                                        iN = N(eVar2);
                                        j10 = j9 + this.Z0;
                                        if (zC) {
                                            ((j) g1Var.f2032f).g(this.A0, eVar2.D, j10, iN);
                                        } else {
                                            int i15 = this.A0;
                                            ByteBuffer byteBuffer4 = eVar2.E;
                                            byteBuffer4.getClass();
                                            g1Var.g(i15, byteBuffer4.limit(), iN, j10);
                                        }
                                        this.A0 = -1;
                                        eVar2.E = null;
                                        this.L0 = true;
                                        this.I0 = 0;
                                        this.T0.f7236c++;
                                        return true;
                                    }
                                } else {
                                    eVar2.q();
                                    if (this.I0 == 2) {
                                        this.I0 = 1;
                                        return true;
                                    }
                                }
                                return true;
                            }
                            R().f12411e = this.N0;
                            if (this.I0 == 2) {
                                eVar2.q();
                                this.I0 = 1;
                            }
                            this.O0 = true;
                            if (!this.L0) {
                                j0();
                                return false;
                            }
                            if (!this.f12439x0) {
                                this.M0 = true;
                                g1Var.g(this.A0, 0, 4, 0L);
                                this.A0 = -1;
                                eVar2.E = null;
                                return false;
                            }
                        }
                    } catch (DecoderInputBuffer$InsufficientCapacityException e3) {
                        Z(e3);
                        l0(0);
                        L();
                        return true;
                    }
                }
            } else {
                if (this.J0 == 1) {
                    if (!this.f12439x0) {
                        this.M0 = true;
                        g1Var.g(this.A0, 0, 4, 0L);
                        this.A0 = -1;
                        eVar2.E = null;
                    }
                    this.J0 = 2;
                    return false;
                }
                if (this.f12437v0) {
                    this.f12437v0 = false;
                    ByteBuffer byteBuffer5 = eVar2.E;
                    byteBuffer5.getClass();
                    byteBuffer5.put(f12412d1);
                    g1Var.g(this.A0, 38, 0, 0L);
                    this.A0 = -1;
                    eVar2.E = null;
                    this.L0 = true;
                    return true;
                }
                if (this.I0 == 1) {
                    i11 = 0;
                    while (true) {
                        tVar = this.f12430o0;
                        tVar.getClass();
                        if (i11 < tVar.f1597q.size()) {
                            break;
                            break;
                        }
                        byte[] bArr2 = (byte[]) this.f12430o0.f1597q.get(i11);
                        ByteBuffer byteBuffer6 = eVar2.E;
                        byteBuffer6.getClass();
                        byteBuffer6.put(bArr2);
                        i11++;
                    }
                    this.I0 = 2;
                }
                ByteBuffer byteBuffer7 = eVar2.E;
                byteBuffer7.getClass();
                iPosition = byteBuffer7.position();
                bVar = this.C;
                bVar.m();
                oi.p pVar3 = new oi.p(this, bVar, 5);
                eVar = (e) g1Var.f2031e;
                pVar = new oi.p(g1Var, pVar3, 4);
                synchronized (eVar.f12381a) {
                    eVar.b();
                    pVar.run();
                    i10 = this.f12419d0.get();
                    if (i10 == -3) {
                        if (j()) {
                            R().f12411e = this.N0;
                            return false;
                        }
                    } else {
                        if (i10 == -5) {
                            if (this.I0 == 2) {
                                eVar2.q();
                                this.I0 = 1;
                            }
                            d0(bVar);
                            return true;
                        }
                        if (eVar2.c(4)) {
                            if (this.L0) {
                                j9 = eVar2.G;
                                if (!t0(eVar2)) {
                                    zC = eVar2.c(1073741824);
                                    if (zC) {
                                        cVar = eVar2.D;
                                        if (iPosition == 0) {
                                            cVar.getClass();
                                        } else {
                                            if (cVar.f6611d == null) {
                                                int[] iArr3 = new int[1];
                                                cVar.f6611d = iArr3;
                                                cVar.f6616i.numBytesOfClearData = iArr3;
                                            }
                                            int[] iArr4 = cVar.f6611d;
                                            iArr4[0] = iArr4[0] + iPosition;
                                        }
                                    }
                                    if (this.Q0) {
                                        q1 q1Var2 = R().f12410d;
                                        t tVar3 = this.f12420e0;
                                        tVar3.getClass();
                                        q1Var2.f(tVar3, j9);
                                        this.Q0 = false;
                                    }
                                    this.N0 = Math.max(this.N0, j9);
                                    if (j()) {
                                        R().f12411e = this.N0;
                                    } else {
                                        R().f12411e = this.N0;
                                    }
                                    eVar2.t();
                                    if (eVar2.c(268435456)) {
                                        T(eVar2);
                                    }
                                    if (this.Y0) {
                                        j11 = this.N0;
                                        if (j9 <= j11) {
                                            this.Z0 = (j11 - j9) + 1 + this.Z0;
                                        }
                                        this.N0 = j9;
                                        this.Y0 = false;
                                    }
                                    i0(eVar2);
                                    iN = N(eVar2);
                                    j10 = j9 + this.Z0;
                                    if (zC) {
                                        ((j) g1Var.f2032f).g(this.A0, eVar2.D, j10, iN);
                                    } else {
                                        int i16 = this.A0;
                                        ByteBuffer byteBuffer8 = eVar2.E;
                                        byteBuffer8.getClass();
                                        g1Var.g(i16, byteBuffer8.limit(), iN, j10);
                                    }
                                    this.A0 = -1;
                                    eVar2.E = null;
                                    this.L0 = true;
                                    this.I0 = 0;
                                    this.T0.f7236c++;
                                    return true;
                                }
                            } else {
                                j9 = eVar2.G;
                                if (!t0(eVar2)) {
                                    zC = eVar2.c(1073741824);
                                    if (zC) {
                                        cVar = eVar2.D;
                                        if (iPosition == 0) {
                                            cVar.getClass();
                                        } else {
                                            if (cVar.f6611d == null) {
                                                int[] iArr5 = new int[1];
                                                cVar.f6611d = iArr5;
                                                cVar.f6616i.numBytesOfClearData = iArr5;
                                            }
                                            int[] iArr6 = cVar.f6611d;
                                            iArr6[0] = iArr6[0] + iPosition;
                                        }
                                    }
                                    if (this.Q0) {
                                        q1 q1Var3 = R().f12410d;
                                        t tVar4 = this.f12420e0;
                                        tVar4.getClass();
                                        q1Var3.f(tVar4, j9);
                                        this.Q0 = false;
                                    }
                                    this.N0 = Math.max(this.N0, j9);
                                    if (j()) {
                                        R().f12411e = this.N0;
                                    } else {
                                        R().f12411e = this.N0;
                                    }
                                    eVar2.t();
                                    if (eVar2.c(268435456)) {
                                        T(eVar2);
                                    }
                                    if (this.Y0) {
                                        j11 = this.N0;
                                        if (j9 <= j11) {
                                            this.Z0 = (j11 - j9) + 1 + this.Z0;
                                        }
                                        this.N0 = j9;
                                        this.Y0 = false;
                                    }
                                    i0(eVar2);
                                    iN = N(eVar2);
                                    j10 = j9 + this.Z0;
                                    if (zC) {
                                        ((j) g1Var.f2032f).g(this.A0, eVar2.D, j10, iN);
                                    } else {
                                        int i17 = this.A0;
                                        ByteBuffer byteBuffer9 = eVar2.E;
                                        byteBuffer9.getClass();
                                        g1Var.g(i17, byteBuffer9.limit(), iN, j10);
                                    }
                                    this.A0 = -1;
                                    eVar2.E = null;
                                    this.L0 = true;
                                    this.I0 = 0;
                                    this.T0.f7236c++;
                                    return true;
                                }
                            }
                            return true;
                        }
                        R().f12411e = this.N0;
                        if (this.I0 == 2) {
                            eVar2.q();
                            this.I0 = 1;
                        }
                        this.O0 = true;
                        if (!this.L0) {
                            j0();
                            return false;
                        }
                        if (!this.f12439x0) {
                            this.M0 = true;
                            g1Var.g(this.A0, 0, 4, 0L);
                            this.A0 = -1;
                            eVar2.E = null;
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void L() {
        try {
            g1 g1Var = this.f12429n0;
            g1Var.getClass();
            g1Var.e();
        } finally {
            p0();
        }
    }

    public final List M(boolean z10) {
        t tVar = this.f12420e0;
        tVar.getClass();
        h hVar = this.T;
        ArrayList arrayListP = P(hVar, tVar, z10);
        if (!arrayListP.isEmpty() || !z10) {
            return arrayListP;
        }
        ArrayList arrayListP2 = P(hVar, tVar, false);
        if (!arrayListP2.isEmpty()) {
            e7.a.m("MediaCodecRenderer", "Drm session requires secure decoder for " + tVar.f1594n + ", but no secure decoder available. Trying to proceed with " + arrayListP2 + ".");
        }
        return arrayListP2;
    }

    public int N(h7.e eVar) {
        return 0;
    }

    public abstract float O(float f3, t tVar, t[] tVarArr);

    public abstract ArrayList P(h hVar, t tVar, boolean z10);

    public long Q(long j9, long j10) {
        return super.g(j9, j10);
    }

    public final l R() {
        ArrayDeque arrayDeque = this.f12415b0;
        return !arrayDeque.isEmpty() ? (l) arrayDeque.getLast() : this.U0;
    }

    public abstract y1 S(k kVar, t tVar, MediaCrypto mediaCrypto, float f3);

    public abstract void T(h7.e eVar);

    public final void U(k kVar, MediaCrypto mediaCrypto) {
        this.f12436u0 = kVar;
        t tVar = this.f12420e0;
        tVar.getClass();
        String str = kVar.f12395a;
        float f3 = this.f12428m0;
        t[] tVarArr = this.J;
        tVarArr.getClass();
        float fO = O(f3, tVar, tVarArr);
        if (fO <= this.V) {
            fO = -1.0f;
        }
        this.G.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        y1 y1VarS = S(kVar, tVar, mediaCrypto, fO);
        j7.j jVar = this.F;
        jVar.getClass();
        LogSessionId logSessionIdA = jVar.a();
        if (!logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            ((MediaFormat) y1VarS.f14133b).setString("log-session-id", logSessionIdA.getStringId());
        }
        try {
            Trace.beginSection("createCodec:" + str);
            g1 g1VarV = this.S.v(y1VarS);
            this.f12429n0 = g1VarV;
            o10.b bVar = new o10.b(this, 8);
            e eVar = (e) g1VarV.f2031e;
            synchronized (eVar.f12381a) {
                eVar.f12393o = bVar;
            }
            Trace.endSection();
            this.G.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!kVar.e(tVar)) {
                String strC = t.c(tVar);
                Locale locale = Locale.US;
                e7.a.m("MediaCodecRenderer", a1.b.q("Format exceeds selected codec's capabilities [", strC, ", ", str, "]"));
            }
            this.f12433r0 = fO;
            this.f12430o0 = tVar;
            this.f12439x0 = "Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && kVar.f12400f;
            this.f12429n0.getClass();
            if (this.H == 2) {
                this.G.getClass();
                this.f12441z0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.T0.f7234a++;
            long j9 = jElapsedRealtime2 - jElapsedRealtime;
            if (!this.f12418c1.isEmpty()) {
                g1 g1Var = this.f12429n0;
                g1Var.getClass();
                g1Var.m(new ArrayList(this.f12418c1));
            }
            a0(jElapsedRealtime2, j9, str);
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean V(long j9, long j10) {
        if (j10 >= j9) {
            return false;
        }
        t tVar = this.f12421f0;
        return tVar == null || !Objects.equals(tVar.f1594n, "audio/opus") || j9 - j10 > 80000;
    }

    public final void W() {
        t tVar;
        n7.e eVar;
        if (this.f12429n0 != null || this.E0 || (tVar = this.f12420e0) == null) {
            return;
        }
        String str = tVar.f1594n;
        boolean z10 = true;
        if (this.f12423h0 == null && x0(tVar)) {
            this.E0 = false;
            o0();
            boolean zEquals = "audio/mp4a-latm".equals(str);
            f fVar = this.Z;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                fVar.getClass();
                fVar.L = 32;
            } else {
                fVar.getClass();
                fVar.L = 1;
            }
            this.E0 = true;
            return;
        }
        r0(this.f12423h0);
        if (this.f12422g0 == null) {
            try {
                eVar = this.f12422g0;
                if (eVar == null && (eVar.getState() == 3 || this.f12422g0.getState() == 4)) {
                    n7.e eVar2 = this.f12422g0;
                    str.getClass();
                    if (!eVar2.e(str)) {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                X(this.f12425j0, z10);
            } catch (MediaCodecRenderer$DecoderInitializationException e3) {
                throw d(e3, tVar, false, 4001);
            }
        } else {
            ta.c0.A(this.f12425j0 == null);
            n7.e eVar3 = this.f12422g0;
            h7.a aVarG = eVar3.g();
            if (q.f11178c && (aVarG instanceof q)) {
                int state = eVar3.getState();
                if (state == 1) {
                    DrmSession$DrmSessionException drmSession$DrmSessionExceptionF = eVar3.f();
                    drmSession$DrmSessionExceptionF.getClass();
                    throw d(drmSession$DrmSessionExceptionF, this.f12420e0, false, drmSession$DrmSessionExceptionF.A);
                }
                if (state == 4) {
                    if (aVarG == null) {
                        if (eVar3.f() != null) {
                        }
                    } else if (aVarG instanceof q) {
                        q qVar = (q) aVarG;
                        this.f12425j0 = new MediaCrypto(qVar.f11179a, qVar.f11180b);
                    }
                    eVar = this.f12422g0;
                    if (eVar == null) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    X(this.f12425j0, z10);
                }
            } else {
                if (aVarG == null) {
                    if (eVar3.f() != null) {
                    }
                } else if (aVarG instanceof q) {
                    q qVar2 = (q) aVarG;
                    try {
                        this.f12425j0 = new MediaCrypto(qVar2.f11179a, qVar2.f11180b);
                    } catch (MediaCryptoException e10) {
                        throw d(e10, this.f12420e0, false, 6006);
                    }
                }
                eVar = this.f12422g0;
                if (eVar == null) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                X(this.f12425j0, z10);
            }
        }
        MediaCrypto mediaCrypto = this.f12425j0;
        if (mediaCrypto == null || this.f12429n0 != null) {
            return;
        }
        mediaCrypto.release();
        this.f12425j0 = null;
    }

    public final void X(MediaCrypto mediaCrypto, boolean z10) throws MediaCodecRenderer$DecoderInitializationException {
        t tVar = this.f12420e0;
        tVar.getClass();
        if (this.f12434s0 == null) {
            try {
                List listM = M(z10);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f12434s0 = arrayDeque;
                if (this.U) {
                    arrayDeque.addAll(listM);
                } else {
                    ArrayList arrayList = (ArrayList) listM;
                    if (!arrayList.isEmpty()) {
                        this.f12434s0.add((k) arrayList.get(0));
                    }
                }
                this.f12435t0 = null;
            } catch (MediaCodecUtil$DecoderQueryException e3) {
                throw new MediaCodecRenderer$DecoderInitializationException(tVar, e3, z10, -49998);
            }
        }
        if (this.f12434s0.isEmpty()) {
            throw new MediaCodecRenderer$DecoderInitializationException(tVar, null, z10, -49999);
        }
        ArrayDeque arrayDeque2 = this.f12434s0;
        arrayDeque2.getClass();
        while (this.f12429n0 == null) {
            k kVar = (k) arrayDeque2.peekFirst();
            kVar.getClass();
            if (!Y(tVar) || !v0(kVar)) {
                return;
            }
            try {
                U(kVar, mediaCrypto);
            } catch (Exception e10) {
                e7.a.n("MediaCodecRenderer", "Failed to initialize decoder: " + kVar, e10);
                arrayDeque2.removeFirst();
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException = new MediaCodecRenderer$DecoderInitializationException("Decoder init failed: " + kVar.f12395a + ", " + tVar, e10, tVar.f1594n, z10, kVar, e10 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e10).getDiagnosticInfo() : null);
                Z(mediaCodecRenderer$DecoderInitializationException);
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException2 = this.f12435t0;
                if (mediaCodecRenderer$DecoderInitializationException2 == null) {
                    this.f12435t0 = mediaCodecRenderer$DecoderInitializationException;
                } else {
                    this.f12435t0 = new MediaCodecRenderer$DecoderInitializationException(mediaCodecRenderer$DecoderInitializationException2.getMessage(), mediaCodecRenderer$DecoderInitializationException2.getCause(), mediaCodecRenderer$DecoderInitializationException2.A, mediaCodecRenderer$DecoderInitializationException2.B, mediaCodecRenderer$DecoderInitializationException2.C, mediaCodecRenderer$DecoderInitializationException2.D);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f12435t0;
                }
            }
        }
        this.f12434s0 = null;
    }

    public boolean Y(t tVar) {
        return true;
    }

    public abstract void Z(Exception exc);

    public abstract void a0(long j9, long j10, String str);

    public abstract void b0(i7.b bVar);

    public abstract void c0(String str);

    public i7.d d0(h7.b r13) {
        throw new UnsupportedOperationException("Method not decompiled: p7.m.d0(h7.b):i7.d");
    }

    @Override
    public void e(int i10, Object obj) {
        if (i10 == 11) {
            c0 c0Var = (c0) obj;
            c0Var.getClass();
            this.f12424i0 = c0Var;
            return;
        }
        if (i10 != 21) {
            if (i10 != 22) {
                return;
            }
            obj.getClass();
            e1 e1Var = (e1) obj;
            if (this.f12418c1.equals(e1Var)) {
                return;
            }
            HashSet hashSet = new HashSet(e1Var);
            HashSet hashSet2 = new HashSet();
            s2 it = this.f12418c1.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!hashSet.remove(str)) {
                    hashSet2.add(str);
                }
            }
            g1 g1Var = this.f12429n0;
            if (g1Var != null) {
                if (!hashSet2.isEmpty()) {
                    ((MediaCodec) g1Var.f2030d).unsubscribeFromVendorParameters(new ArrayList(hashSet2));
                }
                if (!hashSet.isEmpty()) {
                    g1Var.m(new ArrayList(hashSet));
                }
            }
            this.f12418c1 = e1Var;
            return;
        }
        obj.getClass();
        i7.b bVar = (i7.b) obj;
        this.f12414a1 = bVar;
        g1 g1Var2 = this.f12429n0;
        if (g1Var2 != null) {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : bVar.f7222a.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof Integer) {
                        bundle.putInt(str2, ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        bundle.putLong(str2, ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        bundle.putFloat(str2, ((Float) value).floatValue());
                    } else if (value instanceof String) {
                        bundle.putString(str2, (String) value);
                    } else if (value instanceof ByteBuffer) {
                        ByteBuffer byteBuffer = (ByteBuffer) value;
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.duplicate().get(bArr);
                        bundle.putByteArray(str2, bArr);
                    }
                }
            }
            g1Var2.k(bundle);
        }
    }

    public abstract void e0(t tVar, MediaFormat mediaFormat);

    public void f0() {
    }

    @Override
    public final long g(long j9, long j10) {
        return Q(j9, j10);
    }

    public void g0(long j9) {
        this.V0 = j9;
        while (true) {
            ArrayDeque arrayDeque = this.f12415b0;
            if (arrayDeque.isEmpty() || j9 < ((l) arrayDeque.peek()).f12407a) {
                return;
            }
            l lVar = (l) arrayDeque.poll();
            lVar.getClass();
            s0(lVar);
            h0();
        }
    }

    public abstract void h0();

    public void i0(h7.e eVar) {
    }

    public final void j0() throws ExoPlaybackException {
        int i10 = this.K0;
        if (i10 == 1) {
            L();
            return;
        }
        if (i10 == 2) {
            L();
            A0();
        } else if (i10 != 3) {
            this.P0 = true;
            n0();
        } else {
            m0();
            W();
        }
    }

    public abstract boolean k0(long j9, long j10, g1 g1Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, t tVar);

    public final boolean l0(int i10) throws ExoPlaybackException {
        h7.b bVar = this.C;
        bVar.m();
        h7.e eVar = this.W;
        eVar.q();
        int iW = w(bVar, eVar, i10 | 4);
        if (iW == -5) {
            d0(bVar);
            return true;
        }
        if (iW != -4 || !eVar.c(4)) {
            return false;
        }
        this.O0 = true;
        j0();
        return false;
    }

    public final void m0() {
        try {
            g1 g1Var = this.f12429n0;
            if (g1Var != null) {
                g1Var.h();
                this.T0.f7235b++;
                k kVar = this.f12436u0;
                kVar.getClass();
                c0(kVar.f12395a);
            }
            this.f12429n0 = null;
            try {
                MediaCrypto mediaCrypto = this.f12425j0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f12425j0 = null;
                r0(null);
                q0();
            }
        } catch (Throwable th2) {
            this.f12429n0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f12425j0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
                this.f12425j0 = null;
                r0(null);
                q0();
            }
        }
    }

    @Override
    public void n() {
        this.f12420e0 = null;
        s0(l.f12406f);
        this.f12415b0.clear();
        if (this.E0) {
            this.E0 = false;
            o0();
        } else {
            if (this.f12429n0 == null) {
                return;
            }
            if (w0()) {
                m0();
            } else if (u0()) {
                L();
            } else {
                this.Y0 = true;
            }
        }
    }

    public abstract void n0();

    public final void o0() {
        this.N0 = -9223372036854775807L;
        R().f12411e = -9223372036854775807L;
        this.V0 = -9223372036854775807L;
        this.G0 = false;
        this.Z.q();
        this.Y.q();
        this.F0 = false;
        f0 f0Var = this.f12417c0;
        f0Var.getClass();
        f0Var.f9052a = c7.m.f2925a;
        f0Var.f9054c = 0;
        f0Var.f9053b = 2;
    }

    @Override
    public void p(long j9, boolean z10, boolean z11) {
        ArrayDeque arrayDeque = this.f12415b0;
        if (!arrayDeque.isEmpty()) {
            this.U0 = (l) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z11) {
            this.O0 = false;
            this.P0 = false;
            this.R0 = false;
            if (this.E0) {
                o0();
            } else if (this.f12429n0 != null) {
                if (w0()) {
                    m0();
                    W();
                } else if (u0()) {
                    L();
                } else {
                    this.Y0 = true;
                }
            }
            if (this.U0.f12410d.a0() > 0) {
                this.Q0 = true;
            }
            this.U0.f12410d.l();
        }
    }

    public void p0() {
        this.A0 = -1;
        this.X.E = null;
        this.B0 = -1;
        this.C0 = null;
        this.N0 = -9223372036854775807L;
        R().f12411e = -9223372036854775807L;
        this.V0 = -9223372036854775807L;
        this.f12441z0 = -9223372036854775807L;
        this.M0 = false;
        this.f12440y0 = -9223372036854775807L;
        this.L0 = false;
        this.f12437v0 = false;
        this.f12438w0 = false;
        this.D0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.I0 = this.H0 ? 1 : 0;
        this.Y0 = false;
        this.Z0 = 0L;
    }

    public final void q0() {
        p0();
        this.S0 = null;
        this.f12434s0 = null;
        this.f12436u0 = null;
        this.f12430o0 = null;
        this.f12431p0 = null;
        this.f12432q0 = false;
        this.f12433r0 = -1.0f;
        this.f12439x0 = false;
        this.H0 = false;
        this.I0 = 0;
    }

    public final void r0(n7.e eVar) {
        n7.e eVar2 = this.f12422g0;
        if (eVar2 != eVar) {
            if (eVar != null) {
                eVar.b(null);
            }
            if (eVar2 != null) {
                eVar2.c(null);
            }
        }
        this.f12422g0 = eVar;
    }

    public final void s0(l lVar) {
        this.U0 = lVar;
        if (lVar.f12409c != -9223372036854775807L) {
            this.W0 = true;
            f0();
        }
    }

    public boolean t0(h7.e eVar) {
        return false;
    }

    @Override
    public void u(androidx.media3.common.t[] r12, long r13, long r15, s7.a0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: p7.m.u(androidx.media3.common.t[], long, long, s7.a0):void");
    }

    public boolean u0() {
        return true;
    }

    public boolean v0(k kVar) {
        return true;
    }

    public boolean w0() {
        int i10 = this.K0;
        if (i10 == 3) {
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        try {
            A0();
            return false;
        } catch (ExoPlaybackException e3) {
            e7.a.n("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e3);
            return true;
        }
    }

    @Override
    public void x(long j9, long j10) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (this.R0) {
            this.R0 = false;
            j0();
        }
        ExoPlaybackException exoPlaybackException = this.S0;
        if (exoPlaybackException != null) {
            this.S0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.P0) {
                n0();
                return;
            }
            if (this.f12420e0 != null || l0(2)) {
                W();
                if (this.E0) {
                    Trace.beginSection("bypassRender");
                    while (F(j9, j10)) {
                    }
                    Trace.endSection();
                } else if (this.f12429n0 != null) {
                    this.G.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (J(j9, j10)) {
                        long j11 = this.f12426k0;
                        if (j11 != -9223372036854775807L) {
                            this.G.getClass();
                            z11 = SystemClock.elapsedRealtime() - jElapsedRealtime < j11;
                        }
                        if (!z11) {
                            break;
                        }
                    }
                    while (K()) {
                        long j12 = this.f12426k0;
                        if (j12 != -9223372036854775807L) {
                            this.G.getClass();
                            z10 = SystemClock.elapsedRealtime() - jElapsedRealtime < j12;
                        }
                        if (!z10) {
                            break;
                        }
                    }
                    Trace.endSection();
                } else {
                    i7.c cVar = this.T0;
                    int i10 = cVar.f7237d;
                    a1 a1Var = this.I;
                    a1Var.getClass();
                    cVar.f7237d = i10 + a1Var.l(j9 - this.K);
                    l0(1);
                }
                synchronized (this.T0) {
                }
            }
        } catch (MediaCodec.CryptoException e3) {
            throw d(e3, this.f12420e0, false, i0.s(e3.getErrorCode()));
        } catch (IllegalStateException e10) {
            boolean z13 = e10 instanceof MediaCodec.CodecException;
            if (!z13) {
                StackTraceElement[] stackTrace = e10.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e10;
                }
            }
            Z(e10);
            if (z13 && ((MediaCodec.CodecException) e10).isRecoverable()) {
                z12 = true;
            }
            if (z12) {
                m0();
            }
            MediaCodecDecoderException mediaCodecDecoderExceptionH = H(e10, this.f12436u0);
            throw d(mediaCodecDecoderExceptionH, this.f12420e0, z12, mediaCodecDecoderExceptionH.A == 1101 ? 4006 : 4003);
        }
    }

    public boolean x0(t tVar) {
        return false;
    }

    public abstract int y0(h hVar, t tVar);

    public final boolean z0(t tVar) {
        if (this.f12429n0 != null && this.K0 != 3 && this.H != 0) {
            float f3 = this.f12428m0;
            tVar.getClass();
            t[] tVarArr = this.J;
            tVarArr.getClass();
            float fO = O(f3, tVar, tVarArr);
            float f10 = this.f12433r0;
            if (f10 != fO) {
                if (fO == -1.0f) {
                    if (this.L0) {
                        this.J0 = 1;
                        this.K0 = 3;
                        return false;
                    }
                    m0();
                    W();
                    return false;
                }
                if (f10 != -1.0f || fO > this.V) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fO);
                    g1 g1Var = this.f12429n0;
                    g1Var.getClass();
                    g1Var.k(bundle);
                    this.f12433r0 = fO;
                }
            }
        }
        return true;
    }
}
