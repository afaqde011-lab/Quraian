package kn;

import b2.r;
import b6.m;
import g00.b0;
import l1.j;
import l1.q;
import u00.n;

public final class a implements n {
    public final int A = 1;
    public final float B;
    public final float C;
    public final Object D;
    public final Object E;

    public a(String str, float f, r rVar, float f2, int i) {
        this.D = str;
        this.B = f;
        this.E = rVar;
        this.C = f2;
    }

    public a(ln.b bVar, float f, float f2, m mVar, int i) {
        this.D = bVar;
        this.B = f;
        this.C = f2;
        this.E = mVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = q.K(385);
                f50.c.d((ln.b) this.D, this.B, this.C, (m) this.E, (j) obj, iK);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK2 = q.K(1);
                sm.a.a((String) this.D, this.B, (r) this.E, this.C, (j) obj, iK2);
                break;
        }
        return b0.a;
    }
}
