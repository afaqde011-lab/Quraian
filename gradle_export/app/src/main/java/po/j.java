package po;

import a40.c0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import d0.f3;
import e1.v0;
import g00.b0;
import l1.z0;
import q0.r1;
import v2.v;

public final class j implements PointerInputEventHandler {
    public final int a;
    public final Object b;
    public final Object c;

    public j(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(v vVar, k00.c cVar) {
        switch (this.a) {
            case 0:
                Object objD = f3.d(vVar, (u00.o) null, new iz.h((u00.a) this.b, (z0) this.c, 1), cVar, 7);
                return objD == l00.a.A ? objD : b0.a;
            default:
                Object objK = c0.k(new az.p(vVar, (r1) this.b, (v0) this.c, (k00.c) null, 5), cVar);
                return objK == l00.a.A ? objK : b0.a;
        }
    }
}
