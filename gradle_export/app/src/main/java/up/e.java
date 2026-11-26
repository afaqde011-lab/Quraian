package up;

import b2.r;
import g00.b0;
import l1.j;
import l1.q;
import u00.n;

public final class e implements n {
    public final int A;
    public final u00.a B;
    public final boolean C;
    public final ip.a D;
    public final r E;
    public final r F;
    public final v1.c G;
    public final int H;

    public e(int i, int i2, r rVar, r rVar2, ip.a aVar, u00.a aVar2, v1.c cVar, boolean z) {
        this.A = i2;
        this.B = aVar2;
        this.C = z;
        this.D = aVar;
        this.E = rVar;
        this.F = rVar2;
        this.G = cVar;
        this.H = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                f.c(this.B, this.C, this.D, this.E, this.F, this.G, (j) obj, q.K(this.H | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                f.b(this.B, this.C, this.D, this.E, this.F, this.G, (j) obj, q.K(this.H | 1));
                break;
        }
        return b0.a;
    }
}
