package h9;

import g1.c3;

public final class c implements a8.q {

    public final b f6668a = new b(0, 1, null, "audio/ac4");

    public final e7.u f6669b = new e7.u(16384);

    public boolean f6670c;

    @Override
    public final void a(a8.s sVar) {
        this.f6668a.c(sVar, new c3(0, 1));
        sVar.q();
        sVar.b(new a8.v(-9223372036854775807L));
    }

    @Override
    public final void b(long j9, long j10) {
        this.f6670c = false;
        this.f6668a.a();
    }

    @Override
    public final int d(a8.r rVar, a8.u uVar) {
        e7.u uVar2 = this.f6669b;
        int i10 = rVar.read(uVar2.f5182a, 0, 16384);
        if (i10 == -1) {
            return -1;
        }
        uVar2.N(0);
        uVar2.M(i10);
        boolean z10 = this.f6670c;
        b bVar = this.f6668a;
        if (!z10) {
            bVar.f6667o = 0L;
            this.f6670c = true;
        }
        bVar.b(uVar2);
        return 0;
    }

    @Override
    public final boolean e(a8.r rVar) {
        a8.m mVar;
        int i10;
        e7.u uVar = new e7.u(10);
        int i11 = 0;
        while (true) {
            mVar = (a8.m) rVar;
            mVar.i(uVar.f5182a, 0, 10, false);
            uVar.N(0);
            if (uVar.D() != 4801587) {
                break;
            }
            uVar.O(3);
            int iZ = uVar.z();
            i11 += iZ + 10;
            mVar.b(iZ, false);
        }
        mVar.F = 0;
        mVar.b(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            mVar.i(uVar.f5182a, 0, 7, false);
            uVar.N(0);
            int iH = uVar.H();
            if (iH == 44096 || iH == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = uVar.f5182a;
                if (bArr.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (iH == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    break;
                }
                mVar.b(i10 - 7, false);
            } else {
                mVar.F = 0;
                i13++;
                if (i13 - i11 >= 8192) {
                    break;
                }
                mVar.b(i13, false);
                i12 = 0;
            }
        }
        return false;
    }

    @Override
    public final void release() {
    }
}
