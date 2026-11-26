package ea;

import d0.i2;

public final class t implements b {
    public final ma.b A;
    public final String B;
    public final kotlin.jvm.internal.j C;
    public final g00.p D = rd.a.J(new a1.z(this, 26));

    public t(ma.b bVar, String str, u00.n nVar) {
        this.A = bVar;
        this.B = str;
        this.C = (kotlin.jvm.internal.j) nVar;
    }

    @Override
    public final void close() throws Exception {
        g00.p pVar = this.D;
        if (pVar.isInitialized()) {
            ((ma.a) pVar.getValue()).close();
        }
    }

    @Override
    public final Object j(boolean z10, u00.n nVar, m00.c cVar) {
        s sVar = (s) cVar.getContext().get(s.B);
        r rVar = sVar != null ? sVar.A : null;
        if (rVar != null) {
            return nVar.invoke(rVar, cVar);
        }
        r rVar2 = new r(this.C, (ma.a) this.D.getValue());
        return a40.c0.J(new i2(nVar, rVar2, (k00.c) null), new s(rVar2), cVar);
    }
}
