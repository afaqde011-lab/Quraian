package kn;

import g00.b0;
import l1.j;
import l1.q;
import qr.u;
import u00.n;
import wr.h0;

public final class d implements n {
    public final int A;
    public final float B;
    public final Object C;

    public d(Object obj, float f, int i, int i2) {
        this.A = i2;
        this.C = obj;
        this.B = f;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = q.K(1);
                kh.n.g((ln.c) this.C, this.B, (j) obj, iK);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iK2 = q.K(1);
                mx.a.b((String) this.C, this.B, (j) obj, iK2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iK3 = q.K(1);
                pn.d.a((qn.b) this.C, this.B, (j) obj, iK3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iK4 = q.K(1);
                pn.a.a((qn.a) this.C, this.B, (j) obj, iK4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK5 = q.K(1);
                h0.b((u) this.C, this.B, (j) obj, iK5);
                break;
        }
        return b0.a;
    }
}
