package d0;

public final class h1 implements u00.a {
    public final int A;
    public final c40.l B;

    public h1(c40.l lVar, int i10) {
        this.A = i10;
        this.B = lVar;
    }

    public final Object invoke() {
        int i10 = this.A;
        c40.l lVar = this.B;
        switch (i10) {
            case 0:
                return (i1) c40.o.a(lVar.c());
            default:
                return (i3) c40.o.a(lVar.c());
        }
    }
}
