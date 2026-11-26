package dn;

import android.graphics.Bitmap;
import g00.b0;
import l1.q;
import u00.n;

public final class h implements n {
    public final int A = 1;
    public final float B;
    public final boolean C;
    public final Object D;
    public final Object E;
    public final Object F;

    public h(float f, boolean z, u00.a aVar, u00.a aVar2, u00.k kVar, int i) {
        this.B = f;
        this.C = z;
        this.D = aVar;
        this.E = aVar2;
        this.F = kVar;
    }

    public h(Bitmap bitmap, String str, boolean z, float f, b6.m mVar, int i) {
        this.D = bitmap;
        this.E = str;
        this.C = z;
        this.B = f;
        this.F = mVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = q.K(1);
                kh.n.v((Bitmap) this.D, (String) this.E, this.C, this.B, (b6.m) this.F, (l1.j) obj, iK);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK2 = q.K(3457);
                c7.i.j(this.B, this.C, (u00.a) this.D, (u00.a) this.E, (u00.k) this.F, (l1.j) obj, iK2);
                break;
        }
        return b0.a;
    }
}
