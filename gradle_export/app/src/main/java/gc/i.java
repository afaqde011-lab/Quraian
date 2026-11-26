package gc;

public final class i extends kotlin.jvm.internal.n implements u00.a {
    public final int A;
    public final j B;

    public i(j jVar, int i10) {
        super(0);
        this.A = i10;
        this.B = jVar;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                j jVar = this.B;
                return Boolean.valueOf((((cc.a) jVar.B.getValue()) == null && ((Throwable) jVar.C.getValue()) == null) ? false : true);
            case 1:
                return Boolean.valueOf(((Throwable) this.B.C.getValue()) != null);
            case 2:
                j jVar2 = this.B;
                return Boolean.valueOf(((cc.a) jVar2.B.getValue()) == null && ((Throwable) jVar2.C.getValue()) == null);
            default:
                return Boolean.valueOf(((cc.a) this.B.B.getValue()) != null);
        }
    }
}
