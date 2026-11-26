package bt;

public final class c1 extends m00.i implements u00.k {
    public final int A;
    public final j2 B;

    public c1(int i, j2 j2Var, k00.c cVar) {
        super(1, cVar);
        this.A = i;
        this.B = j2Var;
    }

    @Override
    public final k00.c create(k00.c cVar) {
        switch (this.A) {
            case 0:
                return new c1(0, this.B, cVar);
            default:
                return new c1(1, this.B, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        k00.c cVar = (k00.c) obj;
        switch (this.A) {
            case 0:
                c1 c1Var = (c1) create(cVar);
                g00.b0 b0Var = g00.b0.a;
                c1Var.invokeSuspend(b0Var);
                return b0Var;
            default:
                c1 c1Var2 = (c1) create(cVar);
                g00.b0 b0Var2 = g00.b0.a;
                c1Var2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        j2 j2Var = this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                ri.t1.O(obj);
                j2Var.i(a1.a((a1) j2Var.c.d.getValue(), null, false, false, null, false, false, false, false, null, null, null, null, null, null, null, 0, null, false, false, false, false, false, false, 16777167));
                break;
            default:
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                j2Var.i(a1.a((a1) j2Var.c.d.getValue(), null, false, false, null, false, false, false, false, null, null, null, null, null, null, null, 0, null, false, false, false, false, false, false, 14680063));
                break;
        }
        return b0Var;
    }
}
