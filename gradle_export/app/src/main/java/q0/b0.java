package q0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

public final class b0 implements PointerInputEventHandler {

    public final int f12566a;

    public final b1.e0 f12567b;

    public b0(b1.e0 e0Var, int i10) {
        this.f12566a = i10;
        this.f12567b = e0Var;
    }

    @Override
    public final Object invoke(v2.v vVar, k00.c cVar) {
        switch (this.f12566a) {
            case 0:
                b1.e0 e0Var = this.f12567b;
                e0Var.getClass();
                Object objK = a40.c0.k(new a1.f2(e0Var, vVar, null, 1), cVar);
                l00.a aVar = l00.a.A;
                g00.b0 b0Var = g00.b0.a;
                if (objK != aVar) {
                    objK = b0Var;
                }
                return objK == aVar ? objK : b0Var;
            case 1:
                b1.e0 e0Var2 = this.f12567b;
                e0Var2.getClass();
                Object objK2 = a40.c0.k(new b1.c0(e0Var2, vVar, true, null), cVar);
                l00.a aVar2 = l00.a.A;
                g00.b0 b0Var2 = g00.b0.a;
                if (objK2 != aVar2) {
                    objK2 = b0Var2;
                }
                return objK2 == aVar2 ? objK2 : b0Var2;
            default:
                b1.e0 e0Var3 = this.f12567b;
                e0Var3.getClass();
                Object objK3 = a40.c0.k(new b1.c0(e0Var3, vVar, false, null), cVar);
                l00.a aVar3 = l00.a.A;
                g00.b0 b0Var3 = g00.b0.a;
                if (objK3 != aVar3) {
                    objK3 = b0Var3;
                }
                return objK3 == aVar3 ? objK3 : b0Var3;
        }
    }
}
