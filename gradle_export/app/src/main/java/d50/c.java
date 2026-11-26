package d50;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import x40.q;

public final class c extends a {
    public final q D;
    public long E;
    public boolean F;
    public final g G;

    public c(g gVar, q url) {
        super(gVar);
        m.e(url, "url");
        this.G = gVar;
        this.D = url;
        this.E = -1L;
        this.F = true;
    }

    @Override
    public final void close() {
        boolean zT;
        if (this.B) {
            return;
        }
        if (this.F) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = y40.b.a;
            m.e(timeUnit, "timeUnit");
            try {
                zT = y40.b.t(this, 100);
            } catch (IOException unused) {
                zT = false;
            }
            if (!zT) {
                ((b50.m) this.G.d).k();
                a();
            }
        }
        this.B = true;
    }

    @Override
    public final long s(k50.i r12, long r13) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: d50.c.s(k50.i, long):long");
    }
}
