package wj;

import android.content.Context;

public final class b0 implements yj.b {
    public final int A = 0;
    public final f00.a B;
    public final nf.c C;

    public b0(nf.c cVar, yj.c cVar2) {
        this.C = cVar;
        this.B = cVar2;
    }

    public b0(yj.c cVar, nf.c cVar2) {
        this.B = cVar;
        this.C = cVar2;
    }

    public final Object get() {
        switch (this.A) {
            case 0:
                return new a0((Context) this.C.A, (c1) this.B.get());
            default:
                return new zj.d((b) this.B.get(), (k00.i) this.C.A);
        }
    }
}
