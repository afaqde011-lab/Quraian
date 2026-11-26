package zh;

import s10.w0;
import sd.p1;

public final class h extends g {

    public final long[] f17476d;

    public h(w0 w0Var) {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        super(jArr, jArr2, jArr4);
        this.f17476d = jArr3;
        p1 p1Var = (p1) w0Var.B;
        i.q(jArr, (long[]) p1Var.C, (long[]) p1Var.B);
        i.p(jArr2, (long[]) p1Var.C, (long[]) p1Var.B);
        System.arraycopy((long[]) p1Var.D, 0, jArr3, 0, 10);
        i.j(jArr4, (long[]) w0Var.C, j.f17484b);
    }

    @Override
    public final void a(long[] jArr, long[] jArr2) {
        i.j(jArr, jArr2, this.f17476d);
    }
}
