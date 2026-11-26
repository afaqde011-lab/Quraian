package yg;

import dh.y;
import java.util.Objects;
import xf.n;

public final class j {

    public final long f16882a;

    public final long f16883b;

    public final k f16884c;

    public j(k kVar, long j9, long j10) {
        this.f16882a = j9;
        this.f16883b = j10;
        Objects.requireNonNull(kVar);
        this.f16884c = kVar;
    }

    public final n a(m mVar) {
        g gVar = this.f16884c.f16885a;
        long j9 = this.f16883b;
        gVar.f16875a.b("requestExpressIntegrityToken(%s)", Long.valueOf(j9));
        xf.g gVar2 = new xf.g();
        d dVar = new d(gVar, gVar2, mVar, this.f16882a, j9, gVar2);
        dh.c cVar = gVar.f16879e;
        cVar.getClass();
        cVar.a().post(new y(cVar, gVar2, gVar2, dVar));
        return gVar2.f16565a;
    }
}
