package m10;

import e30.x0;
import java.util.List;

public final class a implements u00.a {
    public final int A;
    public final b B;

    public a(b bVar, int i) {
        this.A = i;
        this.B = bVar;
    }

    @Override
    public final Object invoke() {
        int i = this.A;
        b bVar = this.B;
        switch (i) {
            case 0:
                x20.n nVarO0 = bVar.o0();
                a20.d dVar = new a20.d(this, 21);
                g30.i iVar = x0.a;
                if (g30.l.f(bVar)) {
                    return g30.l.c(g30.k.K, bVar.toString());
                }
                e30.m0 m0VarF = bVar.f();
                if (m0VarF == null) {
                    x0.a(12);
                    throw null;
                }
                if (nVarO0 == null) {
                    x0.a(13);
                    throw null;
                }
                List listD = x0.d(m0VarF.getParameters());
                e30.h0.B.getClass();
                return e30.c.w(e30.h0.C, m0VarF, listD, false, nVarO0, dVar);
            case 1:
                return new x20.i(bVar.o0());
            default:
                return new u(bVar);
        }
    }
}
