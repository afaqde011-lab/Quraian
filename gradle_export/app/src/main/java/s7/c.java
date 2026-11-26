package s7;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

public final class c implements y, x {
    public final y A;
    public x B;
    public b[] C = new b[0];
    public long D;
    public long E;
    public long F;
    public ClippingMediaSource$IllegalClippingException G;

    public c(y yVar, boolean z10, long j9, long j10) {
        this.A = yVar;
        this.D = z10 ? j9 : -9223372036854775807L;
        this.E = j9;
        this.F = j10;
    }

    @Override
    public final void a(y yVar) {
        if (this.G != null) {
            return;
        }
        x xVar = this.B;
        xVar.getClass();
        xVar.a(this);
    }

    public final boolean b() {
        return this.D != -9223372036854775807L;
    }

    @Override
    public final long c(long j9, i7.l1 l1Var) {
        long j10 = this.E;
        if (j9 == j10) {
            return j10;
        }
        long jI = e7.i0.i(l1Var.f7418a, 0L, j9 - j10);
        long j11 = l1Var.f7419b;
        long j12 = this.F;
        long jI2 = e7.i0.i(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j9);
        if (jI != l1Var.f7418a || jI2 != l1Var.f7419b) {
            l1Var = new i7.l1(jI, jI2);
        }
        return this.A.c(j9, l1Var);
    }

    @Override
    public final void d(c1 c1Var) {
        x xVar = this.B;
        xVar.getClass();
        xVar.d(this);
    }

    @Override
    public final boolean e(i7.m0 m0Var) {
        return this.A.e(m0Var);
    }

    @Override
    public final long g() {
        long jG = this.A.g();
        if (jG != Long.MIN_VALUE) {
            long j9 = this.F;
            if (j9 == Long.MIN_VALUE || jG < j9) {
                return jG;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long i(v7.r[] rVarArr, boolean[] zArr, a1[] a1VarArr, boolean[] zArr2, long j9) {
        long j10;
        this.C = new b[a1VarArr.length];
        a1[] a1VarArr2 = new a1[a1VarArr.length];
        for (int i10 = 0; i10 < a1VarArr.length; i10++) {
            b[] bVarArr = this.C;
            b bVar = (b) a1VarArr[i10];
            bVarArr[i10] = bVar;
            a1VarArr2[i10] = bVar != null ? bVar.A : null;
        }
        long jI = this.A.i(rVarArr, zArr, a1VarArr2, zArr2, j9);
        long j11 = this.F;
        long jMax = Math.max(jI, j9);
        if (j11 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j11);
        }
        if (b()) {
            if (jI >= j9) {
                if (jI != 0) {
                    int length = rVarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            v7.r rVar = rVarArr[i11];
                            if (rVar != null) {
                                androidx.media3.common.t tVarN = rVar.n();
                                if (!androidx.media3.common.x0.a(tVarN.f1594n, tVarN.f1593k)) {
                                }
                            }
                            i11++;
                        }
                    }
                }
                j10 = -9223372036854775807L;
            }
            j10 = jMax;
        } else {
            j10 = -9223372036854775807L;
        }
        this.D = j10;
        for (int i12 = 0; i12 < a1VarArr.length; i12++) {
            a1 a1Var = a1VarArr2[i12];
            if (a1Var == null) {
                this.C[i12] = null;
            } else {
                b[] bVarArr2 = this.C;
                b bVar2 = bVarArr2[i12];
                if (bVar2 == null || bVar2.A != a1Var) {
                    bVarArr2[i12] = new b(this, a1Var);
                }
            }
            a1VarArr[i12] = this.C[i12];
        }
        return jMax;
    }

    @Override
    public final boolean isLoading() {
        return this.A.isLoading();
    }

    @Override
    public final void j() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.G;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        this.A.j();
    }

    @Override
    public final long k(long j9) {
        this.D = -9223372036854775807L;
        for (b bVar : this.C) {
            if (bVar != null) {
                bVar.B = false;
            }
        }
        long jK = this.A.k(j9);
        long j10 = this.E;
        long j11 = this.F;
        long jMax = Math.max(jK, j10);
        return j11 != Long.MIN_VALUE ? Math.min(jMax, j11) : jMax;
    }

    @Override
    public final void m(x xVar, long j9) {
        this.B = xVar;
        this.A.m(this, j9);
    }

    @Override
    public final void o(boolean z10, long j9) {
        this.A.o(z10, j9);
    }

    @Override
    public final long p() {
        if (b()) {
            long j9 = this.D;
            this.D = -9223372036854775807L;
            long jP = p();
            return jP != -9223372036854775807L ? jP : j9;
        }
        long jP2 = this.A.p();
        if (jP2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.E;
        long j11 = this.F;
        long jMax = Math.max(jP2, j10);
        return j11 != Long.MIN_VALUE ? Math.min(jMax, j11) : jMax;
    }

    @Override
    public final l1 s() {
        return this.A.s();
    }

    @Override
    public final long t() {
        long jT = this.A.t();
        if (jT != Long.MIN_VALUE) {
            long j9 = this.F;
            if (j9 == Long.MIN_VALUE || jT < j9) {
                return jT;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void v(long j9) {
        this.A.v(j9);
    }
}
