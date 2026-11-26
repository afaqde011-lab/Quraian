package d50;

import k50.g0;
import k50.i;
import k50.j;
import k50.k0;
import k50.r;

public final class b implements g0 {
    public final r A;
    public boolean B;
    public final g C;

    public b(g gVar) {
        this.C = gVar;
        this.A = new r(((j) gVar.f).c());
    }

    @Override
    public final k0 c() {
        return this.A;
    }

    @Override
    public final void c0(i iVar, long j) {
        j jVar = (j) this.C.f;
        if (this.B) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        jVar.Q(j);
        jVar.K("\r\n");
        jVar.c0(iVar, j);
        jVar.K("\r\n");
    }

    @Override
    public final synchronized void close() {
        if (this.B) {
            return;
        }
        this.B = true;
        ((j) this.C.f).K("0\r\n\r\n");
        r rVar = this.A;
        k0 k0Var = rVar.e;
        rVar.e = k0.d;
        k0Var.a();
        k0Var.b();
        this.C.b = 3;
    }

    @Override
    public final synchronized void flush() {
        if (this.B) {
            return;
        }
        ((j) this.C.f).flush();
    }
}
