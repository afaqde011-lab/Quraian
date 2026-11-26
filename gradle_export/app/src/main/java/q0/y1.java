package q0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import d0.f3;
import d0.o2;

public final class y1 implements PointerInputEventHandler {

    public final a40.z f12715a;

    public final l1.z0 f12716b;

    public final f0.i f12717c;

    public final l1.z0 f12718d;

    public y1(a40.z zVar, l1.z0 z0Var, f0.i iVar, l1.z0 z0Var2) {
        this.f12715a = zVar;
        this.f12716b = z0Var;
        this.f12717c = iVar;
        this.f12718d = z0Var2;
    }

    @Override
    public final Object invoke(v2.v vVar, k00.c cVar) {
        x1 x1Var = new x1(this.f12715a, this.f12716b, this.f12717c, null);
        o2 o2Var = new o2(this.f12718d, 22);
        d0.q0 q0Var = f3.f4430a;
        Object objK = a40.c0.k(new a1.f(vVar, x1Var, o2Var, new d0.t1(vVar), (k00.c) null), cVar);
        l00.a aVar = l00.a.A;
        g00.b0 b0Var = g00.b0.a;
        if (objK != aVar) {
            objK = b0Var;
        }
        return objK == aVar ? objK : b0Var;
    }
}
