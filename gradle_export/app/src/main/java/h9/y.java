package h9;

import e7.i0;

public final class y {

    public final int f6926a;

    public final e7.e0 f6927b;

    public final e7.u f6928c;

    public boolean f6929d;

    public boolean f6930e;

    public boolean f6931f;

    public long f6932g;

    public long f6933h;

    public long f6934i;

    public y(int i10) {
        this.f6926a = i10;
        switch (i10) {
            case 1:
                this.f6927b = new e7.e0(0L);
                this.f6932g = -9223372036854775807L;
                this.f6933h = -9223372036854775807L;
                this.f6934i = -9223372036854775807L;
                this.f6928c = new e7.u();
                break;
            default:
                this.f6927b = new e7.e0(0L);
                this.f6932g = -9223372036854775807L;
                this.f6933h = -9223372036854775807L;
                this.f6934i = -9223372036854775807L;
                this.f6928c = new e7.u();
                break;
        }
    }

    public static int b(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static long c(e7.u uVar) {
        int i10 = uVar.f5183b;
        if (uVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        uVar.k(0, 9, bArr);
        uVar.N(i10);
        byte b7 = bArr[0];
        if ((b7 & 196) == 68) {
            byte b10 = bArr[2];
            if ((b10 & 4) == 4) {
                byte b11 = bArr[4];
                if ((b11 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j9 = b7;
                    long j10 = b10;
                    return ((j10 & 3) << 13) | ((j9 & 3) << 28) | (((56 & j9) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j10 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b11) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(a8.r rVar) {
        switch (this.f6926a) {
            case 0:
                byte[] bArr = i0.f5137b;
                e7.u uVar = this.f6928c;
                uVar.getClass();
                uVar.L(bArr.length, bArr);
                this.f6929d = true;
                rVar.t();
                break;
            default:
                byte[] bArr2 = i0.f5137b;
                e7.u uVar2 = this.f6928c;
                uVar2.getClass();
                uVar2.L(bArr2.length, bArr2);
                this.f6929d = true;
                rVar.t();
                break;
        }
    }
}
