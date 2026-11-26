package bv;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

public final class n1 implements PointerInputEventHandler {
    public final int a;
    public final u00.k b;

    public n1(int i, u00.k kVar) {
        this.a = i;
        this.b = kVar;
    }

    public final Object invoke(v2.v vVar, k00.c cVar) {
        switch (this.a) {
            case 0:
                Object objB1 = ((v2.j0) vVar).B1(new m1(0, null, this.b), cVar);
                return objB1 == l00.a.A ? objB1 : g00.b0.a;
            default:
                Object objD = d0.f3.d(vVar, (u00.o) null, new as.d0(7, this.b), cVar, 7);
                return objD == l00.a.A ? objD : g00.b0.a;
        }
    }
}
