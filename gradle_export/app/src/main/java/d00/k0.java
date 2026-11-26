package d00;

public final class k0 implements u00.k {
    public final int A;
    public final b3.o0 B;

    public k0(b3.o0 o0Var, int i) {
        this.A = i;
        this.B = o0Var;
    }

    public k0(b3.o0 o0Var, l2.b bVar) {
        this.A = 1;
        this.B = o0Var;
    }

    @Override
    public final Object invoke(Object obj) throws Exception {
        k2.d record = (k2.d) obj;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(record, "$this$record");
                h0.b(this.B);
                break;
            case 1:
                kotlin.jvm.internal.m.e(record, "$this$record");
                h0.b(this.B);
                break;
            default:
                kotlin.jvm.internal.m.e(record, "$this$record");
                this.B.a();
                break;
        }
        return g00.b0.a;
    }
}
