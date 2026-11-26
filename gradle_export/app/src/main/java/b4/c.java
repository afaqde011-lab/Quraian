package b4;

import g00.b0;

public final class c extends kotlin.jvm.internal.n implements u00.k {
    public static final c B;
    public static final c C;
    public static final c D;
    public static final c E;
    public final int A;

    static {
        int i10 = 1;
        B = new c(i10, 0);
        C = new c(i10, 1);
        D = new c(i10, 2);
        E = new c(i10, 3);
    }

    public c(int i10, int i11) {
        super(i10);
        this.A = i11;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                j jVar = (j) obj;
                jVar.getHandler().post(new a(1, jVar.R));
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return b0.a;
    }
}
