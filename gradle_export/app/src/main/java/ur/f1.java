package ur;

import ri.t1;

public final class f1 extends m00.i implements u00.n {
    public final int A = 1;
    public boolean B;
    public final r1 C;

    public f1(r1 r1Var, k00.c cVar) {
        super(2, cVar);
        this.C = r1Var;
    }

    public f1(boolean z, r1 r1Var, k00.c cVar) {
        super(2, cVar);
        this.B = z;
        this.C = r1Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new f1(this.B, this.C, cVar);
            default:
                f1 f1Var = new f1(this.C, cVar);
                f1Var.B = ((Boolean) obj).booleanValue();
                return f1Var;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                f1 f1Var = (f1) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                f1Var.invokeSuspend(b0Var);
                return b0Var;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                f1 f1Var2 = (f1) create(bool, (k00.c) obj2);
                g00.b0 b0Var2 = g00.b0.a;
                f1Var2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        r1 r1Var = this.C;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                if (this.B) {
                    r1Var.l(g0.a);
                }
                break;
            default:
                boolean z = this.B;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                r1Var.i(h1.a((h1) r1Var.c.d.getValue(), null, null, false, null, false, null, false, null, null, null, false, null, null, false, false, false, 0, false, null, null, null, null, 0, 0, 0, false, z, false, null, null, null, null, null, null, false, false, null, null, null, null, -67108865, 255));
                break;
        }
        return b0Var;
    }
}
