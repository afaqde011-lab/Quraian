package lp;

import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.g4;
import g00.b0;
import jp.x;
import l1.q;
import u00.n;

public final class h implements n {
    public final int A;
    public final x B;
    public final boolean C;
    public final u00.k D;
    public final int E;

    public h(int i11, int i12, x xVar, u00.k kVar, boolean z11) {
        this.A = i12;
        this.B = xVar;
        this.C = z11;
        this.D = kVar;
        this.E = i11;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                g4.g(this.B, this.C, this.D, jVar, q.K(this.E | 1));
                break;
            case 1:
                b5.e(this.B, this.C, this.D, jVar, q.K(this.E | 1));
                break;
            default:
                f50.k.a(this.B, this.C, this.D, jVar, q.K(this.E | 1));
                break;
        }
        return b0.f7770a;
    }
}
