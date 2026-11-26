package androidx.media3.cast;

import b2.r;
import g00.b0;
import hv.t;

public final class f implements u00.n {
    public final int A;
    public final Object B;
    public final int C;
    public final int D;

    public f(r rVar, int i10, int i11, int i12) {
        this.A = i12;
        this.B = rVar;
        this.C = i10;
        this.D = i11;
    }

    public f(Object obj, int i10, int i11, int i12, int i13) {
        this.A = i13;
        this.C = i10;
        this.D = i11;
        this.B = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return MediaRouteButtonKt.MediaRouteButton$lambda$0((r) this.B, this.C, this.D, (l1.j) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                t.b((r) this.B, (l1.j) obj, l1.q.K(this.C | 1), this.D);
                return b0.a;
            case 2:
                ((Integer) obj2).getClass();
                kz.a.e((r) this.B, (l1.j) obj, l1.q.K(this.C | 1), this.D);
                return b0.a;
            case 3:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(1);
                mu.n.a((r) this.B, this.C, this.D, (l1.j) obj, iK);
                return b0.a;
            case 4:
                ((Integer) obj2).getClass();
                mz.a.c((r) this.B, (l1.j) obj, l1.q.K(this.C | 1), this.D);
                return b0.a;
            case 5:
                ((Integer) obj2).getClass();
                mz.a.i((r) this.B, (l1.j) obj, l1.q.K(this.C | 1), this.D);
                return b0.a;
            case 6:
                ((Integer) obj2).getClass();
                mz.a.j((r) this.B, (l1.j) obj, l1.q.K(this.C | 1), this.D);
                return b0.a;
            default:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(1);
                iz.d.a(this.C, this.D, (u00.a) this.B, (l1.j) obj, iK2);
                return b0.a;
        }
    }
}
