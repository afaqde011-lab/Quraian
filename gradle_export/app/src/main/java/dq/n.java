package dq;

import g00.b0;
import ri.t1;

public final class n extends m00.i implements u00.n {
    public final int A;
    public boolean B;
    public final u C;

    public n(u uVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = uVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                n nVar = new n(this.C, cVar, 0);
                nVar.B = ((Boolean) obj).booleanValue();
                return nVar;
            default:
                n nVar2 = new n(this.C, cVar, 1);
                nVar2.B = ((Boolean) obj).booleanValue();
                return nVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        k00.c cVar = (k00.c) obj2;
        switch (i) {
            case 0:
                n nVar = (n) create(bool, cVar);
                b0 b0Var = b0.a;
                nVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                n nVar2 = (n) create(bool, cVar);
                b0 b0Var2 = b0.a;
                nVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        u uVar = this.C;
        switch (i) {
            case 0:
                boolean z = this.B;
                l00.a aVar = l00.a.A;
                t1.O(obj);
                uVar.i(m.a((m) uVar.c.d.getValue(), z, false, null, false, 30));
                break;
            default:
                boolean z2 = this.B;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                uVar.i(m.a((m) uVar.c.d.getValue(), false, z2, null, false, 27));
                break;
        }
        return b0Var;
    }
}
