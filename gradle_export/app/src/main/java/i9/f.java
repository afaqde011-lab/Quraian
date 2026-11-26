package i9;

import a8.c0;
import a8.d0;
import a8.e0;
import com.google.android.material.datepicker.n;
import e7.i0;
import java.math.RoundingMode;

public final class f implements d0 {

    public final n f7556a;

    public final int f7557b;

    public final long f7558c;

    public final long f7559d;

    public final long f7560e;

    public f(n nVar, int i10, long j9, long j10) {
        this.f7556a = nVar;
        this.f7557b = i10;
        this.f7558c = j9;
        long j11 = (j10 - j9) / ((long) nVar.D);
        this.f7559d = j11;
        this.f7560e = g(j11);
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final c0 d(long j9) {
        n nVar = this.f7556a;
        long j10 = (((long) nVar.C) * j9) / (((long) this.f7557b) * 1000000);
        long j11 = this.f7559d;
        long jI = i0.i(j10, 0L, j11 - 1);
        long j12 = ((long) nVar.D) * jI;
        long j13 = this.f7558c;
        long jG = g(jI);
        e0 e0Var = new e0(jG, j12 + j13);
        if (jG >= j9 || jI == j11 - 1) {
            return new c0(e0Var, e0Var);
        }
        long j14 = jI + 1;
        return new c0(e0Var, new e0(g(j14), (((long) nVar.D) * j14) + j13));
    }

    @Override
    public final long f() {
        return this.f7560e;
    }

    public final long g(long j9) {
        long j10 = j9 * ((long) this.f7557b);
        long j11 = this.f7556a.C;
        String str = i0.f5136a;
        return i0.Q(j10, 1000000L, j11, RoundingMode.DOWN);
    }
}
