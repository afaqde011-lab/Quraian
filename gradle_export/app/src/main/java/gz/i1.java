package gz;

import ri.t1;

public final class i1 extends m00.i implements u00.n {
    public final int A;
    public final m1 B;

    public i1(m1 m1Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.B = m1Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new i1(this.B, cVar, 0);
            default:
                return new i1(this.B, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                i1 i1Var = (i1) create(bool, (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                i1Var.invokeSuspend(b0Var);
                return b0Var;
            default:
                i1 i1Var2 = (i1) create((Throwable) obj, (k00.c) obj2);
                g00.b0 b0Var2 = g00.b0.a;
                i1Var2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        m1 m1Var = this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                m1Var.r();
                break;
            default:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                m1.k(m1Var);
                break;
        }
        return b0Var;
    }
}
