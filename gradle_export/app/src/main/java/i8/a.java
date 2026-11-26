package i8;

import a8.f0;
import a8.l0;
import a8.q;
import a8.r;
import a8.s;
import a8.u;
import a8.v;
import androidx.media3.common.t;
import androidx.media3.common.x0;
import oi.k;

public final class a implements q {

    public final int f7515a = 0;

    public final Object f7516b;

    public a(int i10) {
        if ((i10 & 1) != 0) {
            this.f7516b = new f0(65496, "image/jpeg", 2);
        } else {
            this.f7516b = new b();
        }
    }

    public a(t tVar) {
        this.f7516b = tVar;
    }

    private final void f() {
    }

    private final void g(long j9, long j10) {
    }

    @Override
    public final void a(s sVar) {
        switch (this.f7515a) {
            case 0:
                ((q) this.f7516b).a(sVar);
                break;
            default:
                l0 l0VarW = sVar.w(0, 3);
                sVar.b(new v(-9223372036854775807L));
                sVar.q();
                t tVar = (t) this.f7516b;
                androidx.media3.common.s sVarA = tVar.a();
                sVarA.m = x0.n("text/x-unknown");
                sVarA.f1500j = tVar.f1594n;
                k.w(sVarA, l0VarW);
                break;
        }
    }

    @Override
    public final void b(long j9, long j10) {
        switch (this.f7515a) {
            case 0:
                ((q) this.f7516b).b(j9, j10);
                break;
        }
    }

    @Override
    public final int d(r rVar, u uVar) {
        switch (this.f7515a) {
            case 0:
                return ((q) this.f7516b).d(rVar, uVar);
            default:
                return rVar.n(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }
    }

    @Override
    public final boolean e(r rVar) {
        switch (this.f7515a) {
            case 0:
                return ((q) this.f7516b).e(rVar);
            default:
                return true;
        }
    }

    @Override
    public final void release() {
        switch (this.f7515a) {
            case 0:
                ((q) this.f7516b).release();
                break;
        }
    }
}
