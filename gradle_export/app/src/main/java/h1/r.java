package h1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import g1.k8;

public final class r implements PointerInputEventHandler {

    public final int f6525a;

    public final k8 f6526b;

    public r(k8 k8Var, int i10) {
        this.f6525a = i10;
        this.f6526b = k8Var;
    }

    @Override
    public final Object invoke(v2.v vVar, k00.c cVar) {
        switch (this.f6525a) {
            case 0:
                Object objK = a40.c0.k(new q(vVar, this.f6526b, null, 0), cVar);
                return objK == l00.a.A ? objK : g00.b0.a;
            default:
                Object objK2 = a40.c0.k(new q(vVar, this.f6526b, null, 1), cVar);
                return objK2 == l00.a.A ? objK2 : g00.b0.a;
        }
    }
}
