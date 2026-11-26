package h9;

import a8.n0;
import androidx.media3.common.ParserException;
import g1.c3;

public final class d implements a8.q {

    public final e7.u f6679c;

    public final n0 f6680d;

    public a8.s f6681e;

    public long f6682f;

    public boolean f6684h;

    public boolean f6685i;

    public final e f6677a = new e(0, null, "audio/mp4a-latm", true);

    public final e7.u f6678b = new e7.u(2048);

    public long f6683g = -1;

    public d() {
        e7.u uVar = new e7.u(10);
        this.f6679c = uVar;
        byte[] bArr = uVar.f5182a;
        this.f6680d = new n0(bArr.length, bArr);
    }

    @Override
    public final void a(a8.s sVar) {
        this.f6681e = sVar;
        this.f6677a.c(sVar, new c3(0, 1));
        sVar.q();
    }

    @Override
    public final void b(long j9, long j10) {
        this.f6684h = false;
        this.f6677a.a();
        this.f6682f = j10;
    }

    @Override
    public final int d(a8.r rVar, a8.u uVar) throws ParserException {
        this.f6681e.getClass();
        rVar.getLength();
        e7.u uVar2 = this.f6678b;
        int i10 = rVar.read(uVar2.f5182a, 0, 2048);
        boolean z10 = i10 == -1;
        if (!this.f6685i) {
            this.f6681e.b(new a8.v(-9223372036854775807L));
            this.f6685i = true;
        }
        if (z10) {
            return -1;
        }
        uVar2.N(0);
        uVar2.M(i10);
        boolean z11 = this.f6684h;
        e eVar = this.f6677a;
        if (!z11) {
            eVar.f6709u = this.f6682f;
            this.f6684h = true;
        }
        eVar.b(uVar2);
        return 0;
    }

    @Override
    public final boolean e(a8.r rVar) {
        int i10 = 0;
        while (true) {
            e7.u uVar = this.f6679c;
            rVar.a(0, 10, uVar.f5182a);
            uVar.N(0);
            if (uVar.D() != 4801587) {
                break;
            }
            uVar.O(3);
            int iZ = uVar.z();
            i10 += iZ + 10;
            rVar.m(iZ);
        }
        rVar.t();
        rVar.m(i10);
        if (this.f6683g == -1) {
            this.f6683g = i10;
        }
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        do {
            e7.u uVar2 = this.f6679c;
            a8.m mVar = (a8.m) rVar;
            mVar.i(uVar2.f5182a, 0, 2, false);
            uVar2.N(0);
            if ((uVar2.H() & 65526) == 65520) {
                i12++;
                if (i12 >= 4 && i13 > 188) {
                    return true;
                }
                mVar.i(uVar2.f5182a, 0, 4, false);
                n0 n0Var = this.f6680d;
                n0Var.q(14);
                int i14 = n0Var.i(13);
                if (i14 <= 6) {
                    i11++;
                    mVar.F = 0;
                    mVar.b(i11, false);
                } else {
                    mVar.b(i14 - 6, false);
                    i13 += i14;
                }
            } else {
                i11++;
                mVar.F = 0;
                mVar.b(i11, false);
            }
            i12 = 0;
            i13 = 0;
        } while (i11 - i10 < 8192);
        return false;
    }

    @Override
    public final void release() {
    }
}
