package bh;

import l9.f0;

public final class i extends g {
    public final xf.g B;
    public final ah.f C;
    public final l D;

    public i(l lVar, xf.g gVar, xf.g gVar2, ah.f fVar) {
        super(gVar);
        this.B = gVar2;
        this.C = fVar;
        this.D = lVar;
    }

    @Override
    public final void a() {
        synchronized (this.D.f2512f) {
            try {
                l lVar = this.D;
                xf.g gVar = this.B;
                lVar.f2511e.add(gVar);
                gVar.f16565a.b(new f0(lVar, gVar, 10));
                if (this.D.f2517k.getAndIncrement() > 0) {
                    this.D.f2508b.g("Already connected to the service.", new Object[0]);
                }
                l.b(this.D, this.C);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
