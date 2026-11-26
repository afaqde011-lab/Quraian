package h9;

import g1.c3;

public final class a implements a8.q {

    public final b f6641a = new b("audio/ac3");

    public final e7.u f6642b = new e7.u(2786);

    public boolean f6643c;

    @Override
    public final void a(a8.s sVar) {
        this.f6641a.c(sVar, new c3(0, 1));
        sVar.q();
        sVar.b(new a8.v(-9223372036854775807L));
    }

    @Override
    public final void b(long j9, long j10) {
        this.f6643c = false;
        this.f6641a.a();
    }

    @Override
    public final int d(a8.r rVar, a8.u uVar) {
        e7.u uVar2 = this.f6642b;
        int i10 = rVar.read(uVar2.f5182a, 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        uVar2.N(0);
        uVar2.M(i10);
        boolean z10 = this.f6643c;
        b bVar = this.f6641a;
        if (!z10) {
            bVar.f6667o = 0L;
            this.f6643c = true;
        }
        bVar.b(uVar2);
        return 0;
    }

    @Override
    public final boolean e(a8.r rVar) {
        a8.m mVar;
        int iF;
        e7.u uVar = new e7.u(10);
        int i10 = 0;
        while (true) {
            mVar = (a8.m) rVar;
            mVar.i(uVar.f5182a, 0, 10, false);
            uVar.N(0);
            if (uVar.D() != 4801587) {
                break;
            }
            uVar.O(3);
            int iZ = uVar.z();
            i10 += iZ + 10;
            mVar.b(iZ, false);
        }
        mVar.F = 0;
        mVar.b(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            mVar.i(uVar.f5182a, 0, 6, false);
            uVar.N(0);
            if (uVar.H() != 2935) {
                mVar.F = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    break;
                }
                mVar.b(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = uVar.f5182a;
                if (bArr.length < 6) {
                    iF = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iF = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b7 = bArr[4];
                    iF = a8.b.f((b7 & 192) >> 6, b7 & 63);
                }
                if (iF == -1) {
                    break;
                }
                mVar.b(iF - 6, false);
            }
        }
        return false;
    }

    @Override
    public final void release() {
    }
}
