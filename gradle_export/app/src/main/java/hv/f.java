package hv;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import d0.f3;
import d0.o2;
import g00.b0;
import l1.z0;

public final class f implements PointerInputEventHandler {
    public final int a;
    public final z0 b;

    public f(z0 z0Var, int i) {
        this.a = i;
        this.b = z0Var;
    }

    public final Object invoke(v2.v vVar, k00.c cVar) {
        switch (this.a) {
            case 0:
                Object objD = f3.d(vVar, (u00.o) null, new o2(this.b, 8), cVar, 7);
                return objD == l00.a.A ? objD : b0.a;
            default:
                Object objD2 = f3.d(vVar, (u00.o) null, new o2(this.b, 9), cVar, 7);
                return objD2 == l00.a.A ? objD2 : b0.a;
        }
    }
}
