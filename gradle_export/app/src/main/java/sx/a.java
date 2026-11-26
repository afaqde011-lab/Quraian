package sx;

import b2.r;
import bx.c;
import f50.k;
import g00.b0;
import l1.j;
import l1.q;
import u00.n;
import u30.b;
import up.i;
import y3.f;

public final class a implements n {
    public final int A = 0;
    public final boolean B;
    public final boolean C;
    public final u00.a D;
    public final r E;
    public final int F;
    public final Object G;
    public final Object H;
    public final Object I;

    public a(c cVar, u00.a aVar, boolean z, boolean z2, b bVar, r rVar, f fVar, int i, int i2) {
        this.G = cVar;
        this.D = aVar;
        this.B = z;
        this.C = z2;
        this.H = bVar;
        this.E = rVar;
        this.I = fVar;
        this.F = i2;
    }

    public a(String str, String str2, boolean z, boolean z2, n nVar, u00.a aVar, r rVar, int i) {
        this.G = str;
        this.H = str2;
        this.B = z;
        this.C = z2;
        this.I = nVar;
        this.D = aVar;
        this.E = rVar;
        this.F = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = q.K(9);
                k.d((c) this.G, this.D, this.B, this.C, (b) this.H, this.E, (f) this.I, (j) obj, iK, this.F);
                break;
            default:
                ((Integer) obj2).getClass();
                i.d((String) this.G, (String) this.H, this.B, this.C, (n) this.I, this.D, this.E, (j) obj, q.K(this.F | 1));
                break;
        }
        return b0.a;
    }
}
