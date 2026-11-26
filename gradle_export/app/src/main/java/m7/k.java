package m7;

import androidx.media3.common.t;
import fh.t0;
import java.util.ArrayList;
import java.util.List;

public final class k extends m implements l7.j {
    public final n H;

    public k(t tVar, t0 t0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(tVar, t0Var, nVar, arrayList, list, list2);
        this.H = nVar;
    }

    @Override
    public final long B(long j9, long j10) {
        return this.H.b(j9, j10);
    }

    @Override
    public final String a() {
        return null;
    }

    @Override
    public final l7.j b() {
        return this;
    }

    @Override
    public final long c(long j9) {
        return this.H.g(j9);
    }

    @Override
    public final j d() {
        return null;
    }

    @Override
    public final long e(long j9, long j10) {
        return this.H.e(j9, j10);
    }

    @Override
    public final long h(long j9, long j10) {
        return this.H.c(j9, j10);
    }

    @Override
    public final long k(long j9, long j10) {
        n nVar = this.H;
        if (nVar.f10621f != null) {
            return -9223372036854775807L;
        }
        long jB = nVar.b(j9, j10) + nVar.c(j9, j10);
        return (nVar.e(jB, j9) + nVar.g(jB)) - nVar.f10624i;
    }

    @Override
    public final j l(long j9) {
        return this.H.h(this, j9);
    }

    @Override
    public final long o(long j9, long j10) {
        return this.H.f(j9, j10);
    }

    @Override
    public final boolean v() {
        return this.H.i();
    }

    @Override
    public final long x() {
        return this.H.f10619d;
    }

    @Override
    public final long z(long j9) {
        return this.H.d(j9);
    }
}
