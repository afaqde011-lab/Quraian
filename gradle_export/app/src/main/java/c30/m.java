package c30;

public final class m implements u00.a {
    public final int A;
    public final u00.a B;

    public m(int i, u00.a aVar) {
        this.A = i;
        this.B = aVar;
    }

    @Override
    public final Object invoke() {
        int i = this.A;
        u00.a aVar = this.B;
        switch (i) {
            case 0:
                return h00.q.r1((Iterable) aVar.invoke());
            default:
                x20.n nVar = (x20.n) aVar.invoke();
                return nVar instanceof x20.j ? ((x20.j) nVar).h() : nVar;
        }
    }
}
