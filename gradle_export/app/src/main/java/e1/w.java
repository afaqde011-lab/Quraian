package e1;

import g1.b8;
import java.util.Iterator;
import java.util.Set;

public final class w implements u00.a {
    public final int A;
    public final int B;
    public final Object C;

    public w(int i10, Object obj, int i11) {
        this.A = i11;
        this.B = i10;
        this.C = obj;
    }

    public w(Object obj, int i10, int i11) {
        this.A = i11;
        this.C = obj;
        this.B = i10;
    }

    public final Object invoke() {
        Object next;
        switch (this.A) {
            case 0:
                return Integer.valueOf(((m3.n0) ((androidx.media3.common.k) this.C).f1301e).f10497b.d(this.B));
            case 1:
                b8 b8Var = (b8) this.C;
                int iE = b8Var.e();
                int i10 = this.B;
                if (i10 != iE) {
                    b8Var.d(i10);
                }
                return g00.b0.a;
            case 2:
                return new m0.b(this.B, 0.0f, (u00.a) this.C);
            case 3:
                return kh.n.T(Integer.valueOf(this.B), (Integer) this.C);
            case 4:
                Iterator it = ((j0.v) this.C).h().f7781k.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (((j0.o) next).f7786a == this.B) {
                        return (j0.o) next;
                    }
                }
                next = null;
                return (j0.o) next;
            default:
                l1.z0 z0Var = (l1.z0) this.C;
                z0Var.setValue(h00.j0.r0((Set) z0Var.getValue(), Integer.valueOf(this.B)));
                return g00.b0.a;
        }
    }
}
