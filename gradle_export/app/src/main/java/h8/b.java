package h8;

import a8.f0;
import a8.m;
import a8.q;
import a8.r;
import a8.s;
import a8.u;
import kh.o;

public final class b implements q {

    public final q f6639a;

    public final boolean f6640b;

    public b(int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f6640b = z10;
        if (z10) {
            this.f6639a = new f0(-1, "image/heif", -1);
        } else {
            this.f6639a = new a();
        }
    }

    @Override
    public final void a(s sVar) {
        this.f6639a.a(sVar);
    }

    @Override
    public final void b(long j9, long j10) {
        this.f6639a.b(j9, j10);
    }

    @Override
    public final int d(r rVar, u uVar) {
        return this.f6639a.d(rVar, uVar);
    }

    @Override
    public final boolean e(r rVar) {
        return this.f6640b ? o.P((m) rVar, false) : this.f6639a.e(rVar);
    }

    @Override
    public final void release() {
        this.f6639a.release();
    }
}
