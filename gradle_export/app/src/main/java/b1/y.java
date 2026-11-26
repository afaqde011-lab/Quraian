package b1;

import a40.u1;
import java.util.concurrent.CancellationException;

public final class y implements d40.j {
    public final int A;
    public final e0 B;

    public y(e0 e0Var, int i10) {
        this.A = i10;
        this.B = e0Var;
    }

    public final Object emit(Object obj, k00.c cVar) {
        u1 u1Var;
        int i10 = this.A;
        e0 e0Var = this.B;
        g00.b0 b0Var = g00.b0.a;
        switch (i10) {
            case 0:
                e0Var.w(false);
                e0Var.x(k0.A);
                break;
            default:
                if (((h2.c) obj) == null) {
                    w0.j jVar = e0Var.f1945f.f15828a;
                    if (jVar != null && (u1Var = jVar.U) != null) {
                        u1Var.i((CancellationException) null);
                        jVar.U = null;
                    }
                } else {
                    e0Var.f1945f.a();
                    l00.a aVar = l00.a.A;
                }
                break;
        }
        return b0Var;
    }
}
