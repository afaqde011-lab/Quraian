package po;

import g00.b0;
import l1.q;

public final class a implements u00.n {
    public final int A;
    public final u30.b B;
    public final u00.k C;
    public final u00.k D;
    public final u00.a E;

    public a(u30.b bVar, u00.k kVar, u00.k kVar2, u00.a aVar, int i, int i2) {
        this.A = i2;
        this.B = bVar;
        this.C = kVar;
        this.D = kVar2;
        this.E = aVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = q.K(1);
                n.a(this.B, this.C, this.D, this.E, (l1.j) obj, iK);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iK2 = q.K(1);
                n.j(this.B, this.C, this.D, this.E, (l1.j) obj, iK2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK3 = q.K(1);
                n.k(this.B, this.C, this.D, this.E, (l1.j) obj, iK3);
                break;
        }
        return b0.a;
    }
}
