package v8;

import a8.d0;
import a8.r;
import e7.i0;
import java.io.EOFException;
import java.io.IOException;
import ta.c0;

public final class b implements g {
    public final f A;
    public final long B;
    public final long C;
    public final i D;
    public int E;
    public long F;
    public long G;
    public long H;
    public long I;
    public long J;
    public long K;
    public long L;

    public b(i iVar, long j9, long j10, long j11, long j12, boolean z10) {
        c0.s(j9 >= 0 && j10 > j9);
        this.D = iVar;
        this.B = j9;
        this.C = j10;
        if (j11 == j10 - j9 || z10) {
            this.F = j12;
            this.E = 4;
        } else {
            this.E = 0;
        }
        this.A = new f();
    }

    @Override
    public final long d(r rVar) throws IOException {
        long j9;
        long j10;
        long jI;
        int i10 = this.E;
        long j11 = this.C;
        f fVar = this.A;
        if (i10 == 0) {
            j9 = 0;
            long position = rVar.getPosition();
            this.G = position;
            this.E = 1;
            long j12 = j11 - 65307;
            if (j12 > position) {
                return j12;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                if (this.I == this.J) {
                    jI = -1;
                } else {
                    long position2 = rVar.getPosition();
                    if (fVar.b(rVar, this.J)) {
                        fVar.a(rVar, false);
                        rVar.t();
                        long j13 = this.H;
                        long j14 = fVar.f15545b;
                        long j15 = j13 - j14;
                        j10 = 2;
                        int i11 = fVar.f15547d + fVar.f15548e;
                        if (0 > j15 || j15 >= 72000) {
                            if (j15 < 0) {
                                this.J = position2;
                                this.L = j14;
                            } else {
                                this.I = rVar.getPosition() + ((long) i11);
                                this.K = fVar.f15545b;
                            }
                            long j16 = this.J;
                            long j17 = this.I;
                            if (j16 - j17 < 100000) {
                                this.J = j17;
                                jI = j17;
                            } else {
                                long position3 = rVar.getPosition() - (((long) i11) * (j15 <= 0 ? 2L : 1L));
                                long j18 = this.J;
                                long j19 = this.I;
                                jI = i0.i((((j18 - j19) * j15) / (this.L - this.K)) + position3, j19, j18 - 1);
                            }
                        } else {
                            jI = -1;
                        }
                    } else {
                        jI = this.I;
                        if (jI == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                    if (jI != -1) {
                        return jI;
                    }
                    this.E = 3;
                }
                j10 = 2;
                if (jI != -1) {
                    return jI;
                }
                this.E = 3;
            } else {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j10 = 2;
            }
            while (true) {
                fVar.b(rVar, -1L);
                fVar.a(rVar, false);
                if (fVar.f15545b > this.H) {
                    rVar.t();
                    this.E = 4;
                    return -(this.K + j10);
                }
                rVar.u(fVar.f15547d + fVar.f15548e);
                this.I = rVar.getPosition();
                this.K = fVar.f15545b;
            }
        } else {
            j9 = 0;
        }
        fVar.f15544a = 0;
        fVar.f15545b = j9;
        fVar.f15546c = 0;
        fVar.f15547d = 0;
        fVar.f15548e = 0;
        if (!fVar.b(rVar, -1L)) {
            throw new EOFException();
        }
        fVar.a(rVar, false);
        rVar.u(fVar.f15547d + fVar.f15548e);
        long j20 = fVar.f15545b;
        while ((fVar.f15544a & 4) != 4 && fVar.b(rVar, -1L) && rVar.getPosition() < j11 && fVar.a(rVar, true)) {
            try {
                rVar.u(fVar.f15547d + fVar.f15548e);
                j20 = fVar.f15545b;
            } catch (EOFException unused) {
            }
        }
        this.F = j20;
        this.E = 4;
        return this.G;
    }

    @Override
    public final d0 g() {
        if (this.F != 0) {
            return new a(this);
        }
        return null;
    }

    @Override
    public final void l(long j9) {
        this.H = i0.i(j9, 0L, this.F - 1);
        this.E = 2;
        this.I = this.B;
        this.J = this.C;
        this.K = 0L;
        this.L = this.F;
    }
}
