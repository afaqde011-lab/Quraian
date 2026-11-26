package p20;

public final class f implements u00.a {
    public final int A;
    public final h B;
    public final g10.i C;

    public f(h hVar, g10.i iVar, int i) {
        this.A = i;
        this.B = hVar;
        this.C = iVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                h hVar = this.B;
                return r30.k.e1(hVar.p().a(this.C.j(g10.o.C), hVar), "Collection");
            default:
                h hVar2 = this.B;
                return r30.k.e1(hVar2.p().a(this.C.k("Array"), hVar2), "Array");
        }
    }
}
