package d0;

public final class q0 extends m00.i implements u00.o {
    public final int A;

    public q0(int i10, k00.c cVar, int i11) {
        super(i10, cVar);
        this.A = i11;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                long j9 = ((h2.b) obj2).f6544a;
                q0 q0Var = new q0(3, (k00.c) obj3, 0);
                g00.b0 b0Var = g00.b0.a;
                q0Var.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                ((Number) obj2).floatValue();
                q0 q0Var2 = new q0(3, (k00.c) obj3, 1);
                g00.b0 b0Var2 = g00.b0.a;
                q0Var2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                long j10 = ((h2.b) obj2).f6544a;
                q0 q0Var3 = new q0(3, (k00.c) obj3, 2);
                g00.b0 b0Var3 = g00.b0.a;
                q0Var3.invokeSuspend(b0Var3);
                return b0Var3;
            default:
                ((Number) obj).intValue();
                new q0(3, (k00.c) obj3, 3).invokeSuspend(g00.b0.a);
                return Boolean.FALSE;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        switch (i10) {
            case 0:
                l00.a aVar = l00.a.A;
                ri.t1.O(obj);
                return b0Var;
            case 1:
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                return b0Var;
            case 2:
                l00.a aVar3 = l00.a.A;
                ri.t1.O(obj);
                return b0Var;
            default:
                l00.a aVar4 = l00.a.A;
                ri.t1.O(obj);
                return Boolean.FALSE;
        }
    }
}
