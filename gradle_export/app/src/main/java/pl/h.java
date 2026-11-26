package pl;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import d0.f3;
import g00.b0;
import l1.z0;
import v2.v;

public final class h implements PointerInputEventHandler {
    public final int a;
    public final z0 b;
    public final z0 c;

    public h(z0 z0Var, z0 z0Var2, int i) {
        this.a = i;
        this.b = z0Var;
        this.c = z0Var2;
    }

    public final Object invoke(v vVar, k00.c cVar) {
        switch (this.a) {
            case 0:
                Object objD = f3.d(vVar, (u00.o) null, new eq.h(this.b, this.c, 1), cVar, 7);
                return objD == l00.a.A ? objD : b0.a;
            default:
                Object objD2 = f3.d(vVar, (u00.o) null, new eq.h(this.b, this.c, 2), cVar, 7);
                return objD2 == l00.a.A ? objD2 : b0.a;
        }
    }
}
