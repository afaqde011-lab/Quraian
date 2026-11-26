package c30;

import h00.j0;

public final class o implements u00.a {
    public final int A;
    public final p B;
    public final q C;

    public o(p pVar, q qVar, int i) {
        this.A = i;
        this.B = pVar;
        this.C = qVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                return j0.q0(this.B.a.keySet(), this.C.o());
            default:
                return j0.q0(this.B.b.keySet(), this.C.p());
        }
    }
}
