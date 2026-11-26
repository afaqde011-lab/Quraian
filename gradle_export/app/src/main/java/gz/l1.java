package gz;

import ri.t1;

public final class l1 extends m00.i implements u00.k {
    public final int A;
    public final m1 B;

    public l1(m1 m1Var, k00.c cVar, int i) {
        super(1, cVar);
        this.A = i;
        this.B = m1Var;
    }

    @Override
    public final k00.c create(k00.c cVar) {
        switch (this.A) {
            case 0:
                return new l1(this.B, cVar, 0);
            case 1:
                return new l1(this.B, cVar, 1);
            default:
                return new l1(this.B, cVar, 2);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        k00.c cVar = (k00.c) obj;
        switch (this.A) {
            case 0:
                l1 l1Var = (l1) create(cVar);
                g00.b0 b0Var = g00.b0.a;
                l1Var.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                l1 l1Var2 = (l1) create(cVar);
                g00.b0 b0Var2 = g00.b0.a;
                l1Var2.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                l1 l1Var3 = (l1) create(cVar);
                g00.b0 b0Var3 = g00.b0.a;
                l1Var3.invokeSuspend(b0Var3);
                return b0Var3;
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
                m1Var.i(g1.a((g1) m1Var.c.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 267386879));
                break;
            case 1:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                m1Var.i(g1.a((g1) m1Var.c.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268434943));
                break;
            default:
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                m1Var.i(g1.a((g1) m1Var.c.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 264241151));
                break;
        }
        return b0Var;
    }
}
