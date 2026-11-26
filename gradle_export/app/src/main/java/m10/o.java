package m10;

public final class o implements u00.k {
    public final int A;
    public final p B;

    public o(p pVar, int i) {
        this.A = i;
        this.B = pVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                n20.e eVar = (n20.e) obj;
                if (eVar != null) {
                    p pVar = this.B;
                    return pVar.j(eVar, pVar.i().d(eVar, r10.c.F));
                }
                p.h(8);
                throw null;
            default:
                n20.e eVar2 = (n20.e) obj;
                if (eVar2 != null) {
                    p pVar2 = this.B;
                    return pVar2.j(eVar2, pVar2.i().e(eVar2, r10.c.F));
                }
                p.h(4);
                throw null;
        }
    }
}
