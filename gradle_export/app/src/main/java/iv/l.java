package iv;

import g00.b0;
import oo.o0;
import oo.z0;
import ta.c0;
import ur.h1;

public final class l implements u00.n {
    public final int A;
    public final int B;
    public final int C;
    public final Object D;
    public final Object E;

    public l(int i, String str, int i2, u00.a aVar, int i3) {
        this.A = 1;
        this.B = i;
        this.D = str;
        this.C = i2;
        this.E = aVar;
    }

    public l(int i, su.e eVar, u00.k kVar, int i2) {
        this.A = 0;
        this.B = i;
        this.D = eVar;
        this.E = kVar;
        this.C = i2;
    }

    public l(b6.m mVar, int i, v1.c cVar, int i2, int i3) {
        this.A = 2;
        this.D = mVar;
        this.B = i;
        this.E = cVar;
        this.C = i3;
    }

    public l(Object obj, b2.r rVar, int i, int i2, int i3) {
        this.A = i3;
        this.D = obj;
        this.E = rVar;
        this.B = i;
        this.C = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(this.C | 1);
                a.k(this.B, (su.e) this.D, (u00.k) this.E, (l1.j) obj, iK);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(1);
                iz.d.f(this.B, (String) this.D, this.C, (u00.a) this.E, (l1.j) obj, iK2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iK3 = l1.q.K(3073);
                c0.d((b6.m) this.D, this.B, (v1.c) this.E, (l1.j) obj, iK3, this.C);
                break;
            case 3:
                ((Integer) obj2).getClass();
                o0.f((z0) this.D, (b2.r) this.E, (l1.j) obj, l1.q.K(this.B | 1), this.C);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ro.f.h((lo.a) this.D, (b2.r) this.E, (l1.j) obj, l1.q.K(this.B | 1), this.C);
                break;
            default:
                ((Integer) obj2).getClass();
                wr.k.c0((h1) this.D, (b2.r) this.E, (l1.j) obj, l1.q.K(this.B | 1), this.C);
                break;
        }
        return b0.a;
    }
}
