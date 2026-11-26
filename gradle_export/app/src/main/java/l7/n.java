package l7;

import androidx.media3.common.t;
import e7.i0;
import s7.a1;

public final class n implements a1 {
    public final t A;
    public long[] C;
    public boolean D;
    public m7.g E;
    public boolean F;
    public int G;
    public final h1.l B = new h1.l(12);
    public long H = -9223372036854775807L;

    public n(m7.g gVar, t tVar, boolean z10) {
        this.A = tVar;
        this.E = gVar;
        this.C = gVar.f10603b;
        c(gVar, z10);
    }

    @Override
    public final void a() {
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final void c(m7.g gVar, boolean z10) {
        int i10 = this.G;
        long j9 = -9223372036854775807L;
        long j10 = i10 == 0 ? -9223372036854775807L : this.C[i10 - 1];
        this.D = z10;
        this.E = gVar;
        long[] jArr = gVar.f10603b;
        this.C = jArr;
        long j11 = this.H;
        if (j11 == -9223372036854775807L) {
            if (j10 != -9223372036854775807L) {
                this.G = i0.b(jArr, j10, false);
            }
        } else {
            int iB = i0.b(jArr, j11, true);
            this.G = iB;
            if (this.D && iB == this.C.length) {
                j9 = j11;
            }
            this.H = j9;
        }
    }

    @Override
    public final int l(long j9) {
        int iMax = Math.max(this.G, i0.b(this.C, j9, true));
        int i10 = iMax - this.G;
        this.G = iMax;
        return i10;
    }

    @Override
    public final int n(h7.b bVar, h7.e eVar, int i10) {
        int i11 = this.G;
        boolean z10 = i11 == this.C.length;
        if (z10 && !this.D) {
            eVar.B = 4;
            return -4;
        }
        if ((i10 & 2) != 0 || !this.F) {
            bVar.B = this.A;
            this.F = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.G = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] bArrO0 = this.B.O0(this.E.f10602a[i11]);
            eVar.s(bArrO0.length);
            eVar.E.put(bArrO0);
        }
        eVar.G = this.C[i11];
        eVar.B = 1;
        return -4;
    }
}
