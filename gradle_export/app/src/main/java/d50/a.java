package d50;

import java.io.IOException;
import k50.i;
import k50.i0;
import k50.k;
import k50.k0;
import k50.r;
import kotlin.jvm.internal.m;

public abstract class a implements i0 {
    public final r A;
    public boolean B;
    public final g C;

    public a(g gVar) {
        this.C = gVar;
        this.A = new r(((k) gVar.e).c());
    }

    public final void a() {
        g gVar = this.C;
        int i = gVar.b;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + gVar.b);
        }
        r rVar = this.A;
        k0 k0Var = rVar.e;
        rVar.e = k0.d;
        k0Var.a();
        k0Var.b();
        gVar.b = 6;
    }

    @Override
    public final k0 c() {
        return this.A;
    }

    @Override
    public long s(i sink, long j) throws IOException {
        g gVar = this.C;
        m.e(sink, "sink");
        try {
            return ((k) gVar.e).s(sink, j);
        } catch (IOException e) {
            ((b50.m) gVar.d).k();
            a();
            throw e;
        }
    }
}
