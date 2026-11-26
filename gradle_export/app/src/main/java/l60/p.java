package l60;

public final class p extends r {
    public final int d;
    public final f e;

    public p(a1.b0 b0Var, x40.e eVar, m mVar, f fVar, int i) {
        super(b0Var, eVar, mVar);
        this.d = i;
        this.e = fVar;
    }

    @Override
    public final Object a(y yVar, Object[] objArr) {
        int i = this.d;
        f fVar = this.e;
        switch (i) {
            case 0:
                return fVar.a(yVar);
            default:
                d dVar = (d) fVar.a(yVar);
                k00.c cVar = (k00.c) objArr[objArr.length - 1];
                try {
                    a40.k kVar = new a40.k(1, qd.s0.j0(cVar));
                    kVar.r();
                    kVar.u(new t(dVar, 2));
                    dVar.l(new k40.b(kVar, 2));
                    Object objQ = kVar.q();
                    l00.a aVar = l00.a.A;
                    return objQ;
                } catch (Exception e) {
                    w0.q(e, cVar);
                    return l00.a.A;
                }
        }
    }
}
