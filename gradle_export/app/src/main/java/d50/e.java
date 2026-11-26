package d50;

import k50.g0;
import k50.i;
import k50.j;
import k50.k0;
import k50.r;

public final class e implements g0 {
    public final r A;
    public boolean B;
    public final g C;

    public e(g gVar) {
        this.C = gVar;
        this.A = new r(((j) gVar.f).c());
    }

    @Override
    public final k0 c() {
        return this.A;
    }

    @Override
    public final void c0(i iVar, long j) {
        if (this.B) {
            throw new IllegalStateException("closed");
        }
        y40.b.c(iVar.B, 0L, j);
        ((j) this.C.f).c0(iVar, j);
    }

    @Override
    public final void close() {
        if (this.B) {
            return;
        }
        this.B = true;
        r rVar = this.A;
        k0 k0Var = rVar.e;
        rVar.e = k0.d;
        k0Var.a();
        k0Var.b();
        this.C.b = 3;
    }

    @Override
    public final void flush() {
        if (this.B) {
            return;
        }
        ((j) this.C.f).flush();
    }
}
