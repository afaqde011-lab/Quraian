package dh;

import java.util.Objects;
import l9.f0;

public final class y extends x {
    public final xf.g B;
    public final yg.f C;
    public final c D;

    public y(c cVar, xf.g gVar, xf.g gVar2, yg.f fVar) {
        super(gVar);
        this.B = gVar2;
        this.C = fVar;
        Objects.requireNonNull(cVar);
        this.D = cVar;
    }

    @Override
    public final void b() {
        c cVar = this.D;
        synchronized (cVar.f4882f) {
            try {
                xf.g gVar = this.B;
                cVar.f4881e.add(gVar);
                gVar.f16565a.b(new f0(cVar, gVar, 20));
                if (cVar.l.getAndIncrement() > 0) {
                    cVar.f4878b.b("Already connected to the service.", new Object[0]);
                }
                c.b(cVar, this.C);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
