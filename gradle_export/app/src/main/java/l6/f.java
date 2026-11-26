package l6;

import c3.w0;
import g1.l0;
import l1.q0;

public final class f implements q0 {
    public final a40.z A;
    public final h.e B;
    public final w0 C;
    public final Object D;
    public int E;
    public long F;
    public a40.k G;

    public f(y yVar) {
        h.e eVar = new h.e(12);
        this.A = yVar;
        this.B = eVar;
        this.C = new w0(new l0(this, 18));
        this.D = new Object();
        this.E = 5;
    }

    public final void b() {
        synchronized (this.D) {
            a40.k kVar = this.G;
            if (kVar != null) {
                kVar.h((Throwable) null);
            }
        }
    }

    @Override
    public final Object b0(u00.k kVar, k00.c cVar) {
        return this.C.b0(kVar, cVar);
    }

    public final Object fold(Object obj, u00.n nVar) {
        return nVar.invoke(obj, this);
    }

    public final k00.g get(k00.h hVar) {
        return rd.a.C(this, hVar);
    }

    public final k00.i minusKey(k00.h hVar) {
        return rd.a.K(this, hVar);
    }

    public final k00.i plus(k00.i iVar) {
        return rd.a.P(this, iVar);
    }
}
