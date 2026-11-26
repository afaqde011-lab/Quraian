package qo;

import g00.b0;

public final class q implements u00.n {
    public final int A = 0;
    public final int B;
    public final u00.a C;
    public final float D;
    public final int E;
    public final Object F;
    public final Object G;

    public q(String str, u00.a aVar, b2.r rVar, float f, int i, int i2) {
        this.F = str;
        this.C = aVar;
        this.G = rVar;
        this.D = f;
        this.B = i;
        this.E = i2;
    }

    public q(mr.g gVar, int i, u00.a aVar, u00.a aVar2, float f, int i2) {
        this.F = gVar;
        this.B = i;
        this.C = aVar;
        this.G = aVar2;
        this.D = f;
        this.E = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                z.c((String) this.F, this.C, (b2.r) this.G, this.D, (l1.j) obj, l1.q.K(this.B | 1), this.E);
                break;
            default:
                ((Integer) obj2).getClass();
                wr.k.Y((mr.g) this.F, this.B, this.C, (u00.a) this.G, this.D, (l1.j) obj, l1.q.K(this.E | 1));
                break;
        }
        return b0.a;
    }
}
