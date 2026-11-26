package du;

import ri.t1;

public final class p0 extends m00.i implements u00.n {
    public final int A;
    public boolean B;
    public final t0 C;

    public p0(t0 t0Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = t0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                p0 p0Var = new p0(this.C, cVar, 0);
                p0Var.B = ((Boolean) obj).booleanValue();
                return p0Var;
            case 1:
                p0 p0Var2 = new p0(this.C, cVar, 1);
                p0Var2.B = ((Boolean) obj).booleanValue();
                return p0Var2;
            default:
                p0 p0Var3 = new p0(this.C, cVar, 2);
                p0Var3.B = ((Boolean) obj).booleanValue();
                return p0Var3;
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
                p0 p0Var = (p0) create(bool, cVar);
                g00.b0 b0Var = g00.b0.a;
                p0Var.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                p0 p0Var2 = (p0) create(bool, cVar);
                g00.b0 b0Var2 = g00.b0.a;
                p0Var2.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                p0 p0Var3 = (p0) create(bool, cVar);
                g00.b0 b0Var3 = g00.b0.a;
                p0Var3.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        t0 t0Var = this.C;
        switch (i) {
            case 0:
                boolean z = this.B;
                l00.a aVar = l00.a.A;
                t1.O(obj);
                t0Var.i(n0.a((n0) t0Var.c.d.getValue(), false, null, false, false, false, false, false, false, false, false, null, z, null, null, null, 122879));
                break;
            case 1:
                boolean z2 = this.B;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                t0Var.i(n0.a((n0) t0Var.c.d.getValue(), false, null, z2, false, false, false, false, false, false, false, null, false, null, null, null, 131055));
                break;
            default:
                boolean z3 = this.B;
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                t0Var.i(n0.a((n0) t0Var.c.d.getValue(), z3, null, false, false, false, false, false, false, false, false, null, false, null, null, null, 131069));
                break;
        }
        return b0Var;
    }
}
