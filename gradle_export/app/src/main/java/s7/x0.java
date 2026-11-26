package s7;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

public final class x0 {

    public final a1.i f13788a;

    public final int f13789b;

    public final e7.u f13790c;

    public w0 f13791d;

    public w0 f13792e;

    public w0 f13793f;

    public long f13794g;

    public x0(a1.i iVar) {
        int i10;
        this.f13788a = iVar;
        synchronized (iVar) {
            i10 = ((i7.g) iVar.D).f7308c.f15848b;
        }
        this.f13789b = i10;
        this.f13790c = new e7.u(32);
        w0 w0Var = new w0(0L, i10);
        this.f13791d = w0Var;
        this.f13792e = w0Var;
        this.f13793f = w0Var;
    }

    public static w0 c(w0 w0Var, long j9, ByteBuffer byteBuffer, int i10) {
        while (j9 >= w0Var.B) {
            w0Var = (w0) w0Var.D;
        }
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (w0Var.B - j9));
            w7.a aVar = (w7.a) w0Var.C;
            byteBuffer.put(aVar.f15842a, ((int) (j9 - w0Var.A)) + aVar.f15843b, iMin);
            i10 -= iMin;
            j9 += (long) iMin;
            if (j9 == w0Var.B) {
                w0Var = (w0) w0Var.D;
            }
        }
        return w0Var;
    }

    public static w0 d(w0 w0Var, long j9, byte[] bArr, int i10) {
        while (j9 >= w0Var.B) {
            w0Var = (w0) w0Var.D;
        }
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (w0Var.B - j9));
            w7.a aVar = (w7.a) w0Var.C;
            System.arraycopy(aVar.f15842a, ((int) (j9 - w0Var.A)) + aVar.f15843b, bArr, i10 - i11, iMin);
            i11 -= iMin;
            j9 += (long) iMin;
            if (j9 == w0Var.B) {
                w0Var = (w0) w0Var.D;
            }
        }
        return w0Var;
    }

    public static w0 e(w0 w0Var, h7.e eVar, com.google.crypto.tink.shaded.protobuf.d dVar, e7.u uVar) {
        if (eVar.c(1073741824)) {
            long j9 = dVar.f4253b;
            int iH = 1;
            uVar.K(1);
            w0 w0VarD = d(w0Var, j9, uVar.f5182a, 1);
            long j10 = j9 + 1;
            byte b7 = uVar.f5182a[0];
            boolean z10 = (b7 & 128) != 0;
            int i10 = b7 & 127;
            h7.c cVar = eVar.D;
            byte[] bArr = cVar.f6608a;
            if (bArr == null) {
                cVar.f6608a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            w0Var = d(w0VarD, j10, cVar.f6608a, i10);
            long j11 = j10 + ((long) i10);
            if (z10) {
                uVar.K(2);
                w0Var = d(w0Var, j11, uVar.f5182a, 2);
                j11 += 2;
                iH = uVar.H();
            }
            int[] iArr = cVar.f6611d;
            if (iArr == null || iArr.length < iH) {
                iArr = new int[iH];
            }
            int[] iArr2 = cVar.f6612e;
            if (iArr2 == null || iArr2.length < iH) {
                iArr2 = new int[iH];
            }
            if (z10) {
                int i11 = iH * 6;
                uVar.K(i11);
                w0Var = d(w0Var, j11, uVar.f5182a, i11);
                j11 += (long) i11;
                uVar.N(0);
                for (int i12 = 0; i12 < iH; i12++) {
                    iArr[i12] = uVar.H();
                    iArr2[i12] = uVar.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = dVar.f4252a - ((int) (j11 - dVar.f4253b));
            }
            a8.k0 k0Var = (a8.k0) dVar.f4254c;
            String str = e7.i0.f5136a;
            byte[] bArr2 = k0Var.f289b;
            byte[] bArr3 = cVar.f6608a;
            int i13 = k0Var.f288a;
            int i14 = k0Var.f290c;
            int i15 = k0Var.f291d;
            cVar.f6613f = iH;
            cVar.f6611d = iArr;
            cVar.f6612e = iArr2;
            cVar.f6609b = bArr2;
            cVar.f6608a = bArr3;
            cVar.f6610c = i13;
            cVar.f6614g = i14;
            cVar.f6615h = i15;
            MediaCodec.CryptoInfo cryptoInfo = cVar.f6616i;
            cryptoInfo.numSubSamples = iH;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i13;
            h7.b bVar = cVar.f6617j;
            bVar.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) bVar.B;
            pattern.set(i14, i15);
            ((MediaCodec.CryptoInfo) bVar.A).setPattern(pattern);
            long j12 = dVar.f4253b;
            int i16 = (int) (j11 - j12);
            dVar.f4253b = j12 + ((long) i16);
            dVar.f4252a -= i16;
        }
        if (!eVar.c(268435456)) {
            eVar.s(dVar.f4252a);
            return c(w0Var, dVar.f4253b, eVar.E, dVar.f4252a);
        }
        uVar.K(4);
        w0 w0VarD2 = d(w0Var, dVar.f4253b, uVar.f5182a, 4);
        int iE = uVar.E();
        dVar.f4253b += 4;
        dVar.f4252a -= 4;
        eVar.s(iE);
        w0 w0VarC = c(w0VarD2, dVar.f4253b, eVar.E, iE);
        dVar.f4253b += (long) iE;
        int i17 = dVar.f4252a - iE;
        dVar.f4252a = i17;
        ByteBuffer byteBuffer = eVar.H;
        if (byteBuffer == null || byteBuffer.capacity() < i17) {
            eVar.H = ByteBuffer.allocate(i17);
        } else {
            eVar.H.clear();
        }
        return c(w0VarC, dVar.f4253b, eVar.H, dVar.f4252a);
    }

    public final void a(long r7) {
        throw new UnsupportedOperationException("Method not decompiled: s7.x0.a(long):void");
    }

    public final int b(int i10) {
        w7.a aVarA;
        w0 w0Var = this.f13793f;
        if (((w7.a) w0Var.C) == null) {
            a1.i iVar = this.f13788a;
            synchronized (iVar) {
                aVarA = ((i7.g) iVar.D).f7308c.a();
                ((HashMap) iVar.B).put(aVarA, (j7.j) iVar.C);
                i7.f fVar = (i7.f) ((i7.g) iVar.D).f7320q.get((j7.j) iVar.C);
                if (fVar != null) {
                    synchronized (fVar) {
                        fVar.f7293d++;
                    }
                }
            }
            w0 w0Var2 = new w0(this.f13793f.B, this.f13789b);
            w0Var.C = aVarA;
            w0Var.D = w0Var2;
        }
        return Math.min(i10, (int) (this.f13793f.B - this.f13794g));
    }
}
