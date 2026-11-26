package a8;

import androidx.media3.common.v0;
import androidx.media3.common.x0;
import java.nio.ByteOrder;
import java.util.Collections;

public final class w {

    public final int f311a;

    public final int f312b;

    public final int f313c;

    public final int f314d;

    public final int f315e;

    public final int f316f;

    public final int f317g;

    public final int f318h;

    public final int f319i;

    public final long f320j;

    public final l9.f0 f321k;
    public final v0 l;

    public w(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j9, l9.f0 f0Var, v0 v0Var) {
        this.f311a = i10;
        this.f312b = i11;
        this.f313c = i12;
        this.f314d = i13;
        this.f315e = i14;
        this.f316f = d(i14);
        this.f317g = i15;
        this.f318h = i16;
        this.f319i = a(i16);
        this.f320j = j9;
        this.f321k = f0Var;
        this.l = v0Var;
    }

    public w(int i10, byte[] bArr) {
        n0 n0Var = new n0(bArr.length, bArr);
        n0Var.q(i10 * 8);
        this.f311a = n0Var.i(16);
        this.f312b = n0Var.i(16);
        this.f313c = n0Var.i(24);
        this.f314d = n0Var.i(24);
        int i11 = n0Var.i(20);
        this.f315e = i11;
        this.f316f = d(i11);
        this.f317g = n0Var.i(3) + 1;
        int i12 = n0Var.i(5) + 1;
        this.f318h = i12;
        this.f319i = a(i12);
        this.f320j = n0Var.k(36);
        this.f321k = null;
        this.l = null;
    }

    public static int a(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 != 24) {
            return i10 != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j9 = this.f320j;
        if (j9 == 0) {
            return -9223372036854775807L;
        }
        return (j9 * 1000000) / ((long) this.f315e);
    }

    public final androidx.media3.common.t c(byte[] bArr, v0 v0Var) {
        bArr[4] = -128;
        int i10 = this.f314d;
        if (i10 <= 0) {
            i10 = -1;
        }
        v0 v0Var2 = this.l;
        if (v0Var2 != null) {
            v0Var = v0Var2.b(v0Var);
        }
        androidx.media3.common.s sVar = new androidx.media3.common.s();
        sVar.m = x0.n("audio/flac");
        sVar.f1502n = i10;
        sVar.E = this.f317g;
        sVar.F = this.f315e;
        String str = e7.i0.f5136a;
        sVar.G = e7.i0.w(this.f318h, ByteOrder.LITTLE_ENDIAN);
        sVar.f1504p = Collections.singletonList(bArr);
        sVar.f1501k = v0Var;
        return new androidx.media3.common.t(sVar);
    }
}
