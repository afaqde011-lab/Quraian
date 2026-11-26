package wj;

import android.content.Context;

public final class m implements yj.b {
    public final int A;
    public final nf.c B;

    public m(nf.c cVar, int i10) {
        this.A = i10;
        this.B = cVar;
    }

    public final Object get() {
        switch (this.A) {
            case 0:
                return new l((ij.b) this.B.A);
            default:
                return new zj.a((Context) this.B.A);
        }
    }
}
