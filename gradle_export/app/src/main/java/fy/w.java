package fy;

import ri.t1;

public final class w extends m00.i implements u00.n {
    public final int A;
    public boolean B;
    public final c0 C;

    public w(c0 c0Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = c0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                w wVar = new w(this.C, cVar, 0);
                wVar.B = ((Boolean) obj).booleanValue();
                return wVar;
            default:
                w wVar2 = new w(this.C, cVar, 1);
                wVar2.B = ((Boolean) obj).booleanValue();
                return wVar2;
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
                w wVar = (w) create(bool, cVar);
                g00.b0 b0Var = g00.b0.a;
                wVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                w wVar2 = (w) create(bool, cVar);
                g00.b0 b0Var2 = g00.b0.a;
                wVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        c0 c0Var = this.C;
        switch (i) {
            case 0:
                boolean z = this.B;
                l00.a aVar = l00.a.A;
                t1.O(obj);
                c0Var.i(u.a((u) c0Var.c.d.getValue(), null, null, null, null, z, false, null, null, null, 495));
                c0Var.n();
                break;
            default:
                boolean z2 = this.B;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                c0Var.i(u.a((u) c0Var.c.d.getValue(), null, null, null, null, false, z2, null, null, null, 479));
                c0Var.n();
                break;
        }
        return b0Var;
    }
}
