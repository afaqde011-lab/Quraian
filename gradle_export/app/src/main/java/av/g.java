package av;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.a0;

public final class g implements u00.a {
    public final int A;
    public final i B;

    public g(i iVar, int i) {
        this.A = i;
        this.B = iVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                return x5.i(a0.a, gq.a.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
            case 1:
                return x5.i(a0.a, cm.a.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
            case 2:
                return x5.i(a0.a, mv.b.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
            default:
                return this.B;
        }
    }
}
