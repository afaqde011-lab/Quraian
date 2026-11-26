package m7;

import java.util.List;

public final class o extends n {

    public final List f10625j;

    public o(j jVar, long j9, long j10, long j11, long j12, List list, long j13, List list2, long j14, long j15) {
        super(jVar, j9, j10, j11, j12, list, j13, j14, j15);
        this.f10625j = list2;
    }

    @Override
    public final long d(long j9) {
        return this.f10625j.size();
    }

    @Override
    public final j h(k kVar, long j9) {
        return (j) this.f10625j.get((int) (j9 - this.f10619d));
    }

    @Override
    public final boolean i() {
        return true;
    }
}
