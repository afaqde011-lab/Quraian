package as;

public final class j0 implements u00.a {
    public final int A;
    public final yt.a B;
    public final u00.k C;

    public j0(yt.a aVar, u00.k kVar, int i) {
        this.A = i;
        this.B = aVar;
        this.C = kVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                yt.a aVar = this.B;
                if (aVar != null) {
                    this.C.invoke(new l(aVar));
                }
                break;
            case 1:
                yt.a aVar2 = this.B;
                if (aVar2 != null) {
                    this.C.invoke(new l(aVar2));
                }
                break;
            case 2:
                yt.a aVar3 = this.B;
                if (aVar3 != null) {
                    this.C.invoke(new nx.o(aVar3));
                }
                break;
            default:
                yt.a aVar4 = this.B;
                if (aVar4 != null) {
                    this.C.invoke(new nx.o(aVar4));
                }
                break;
        }
        return g00.b0.a;
    }
}
