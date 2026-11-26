package a1;

import android.os.CancellationSignal;
import java.util.concurrent.CancellationException;

public final class k0 implements CancellationSignal.OnCancelListener {

    public final int f72a;

    public final Object f73b;

    public k0(Object obj, int i10) {
        this.f72a = i10;
        this.f73b = obj;
    }

    @Override
    public final void onCancel() {
        int i10 = this.f72a;
        Object obj = this.f73b;
        switch (i10) {
            case 0:
                w2 w2Var = (w2) obj;
                z0.g gVar = w2Var.f135a;
                h1.l lVar = w2Var.f136b;
                c1.c cVar = c1.c.A;
                gVar.f16994b.a().w();
                z0.a aVar = gVar.f16994b;
                aVar.G = null;
                w2Var.l(aVar);
                z0.g.a(gVar, lVar, true, cVar);
                gVar.f(true);
                break;
            case 1:
                e1.v0 v0Var = (e1.v0) obj;
                if (v0Var != null) {
                    q0.j1 j1Var = v0Var.f5018d;
                    if (j1Var != null) {
                        j1Var.e(m3.q0.f10518b);
                    }
                    q0.j1 j1Var2 = v0Var.f5018d;
                    if (j1Var2 != null) {
                        j1Var2.f(m3.q0.f10518b);
                    }
                }
                break;
            default:
                ((a40.u1) obj).i((CancellationException) null);
                break;
        }
    }
}
