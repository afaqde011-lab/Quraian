package hw;

import g00.b0;
import ri.t1;
import u00.n;

public final class i extends m00.i implements n {
    public final int A;
    public boolean B;
    public final j C;

    public i(j jVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = jVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                i iVar = new i(this.C, cVar, 0);
                iVar.B = ((Boolean) obj).booleanValue();
                return iVar;
            default:
                i iVar2 = new i(this.C, cVar, 1);
                iVar2.B = ((Boolean) obj).booleanValue();
                return iVar2;
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
                i iVar = (i) create(bool, cVar);
                b0 b0Var = b0.a;
                iVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                i iVar2 = (i) create(bool, cVar);
                b0 b0Var2 = b0.a;
                iVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        j jVar = this.C;
        switch (i) {
            case 0:
                boolean z = this.B;
                l00.a aVar = l00.a.A;
                t1.O(obj);
                jVar.i(f.a((f) jVar.c.d.getValue(), null, false, false, z, 15));
                break;
            default:
                boolean z2 = this.B;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                jVar.i(f.a((f) jVar.c.d.getValue(), null, false, z2, false, 23));
                break;
        }
        return b0Var;
    }
}
