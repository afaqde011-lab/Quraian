package d0;

public final class x1 extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final float C;
    public final Object D;

    public x1(Object obj, float f3, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.D = obj;
        this.C = f3;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                x1 x1Var = new x1((kotlin.jvm.internal.w) this.D, this.C, cVar, 0);
                x1Var.B = obj;
                return x1Var;
            default:
                x1 x1Var2 = new x1((tm.e) this.D, this.C, cVar, 1);
                x1Var2.B = obj;
                return x1Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                x1 x1VarCreate = create((y1) obj, (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                x1VarCreate.invokeSuspend(b0Var);
                return b0Var;
            default:
                x1 x1VarCreate2 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var2 = g00.b0.a;
                x1VarCreate2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        float f3 = this.C;
        Object obj2 = this.D;
        switch (i10) {
            case 0:
                l00.a aVar = l00.a.A;
                ri.t1.O(obj);
                ((kotlin.jvm.internal.w) obj2).A = ((y1) this.B).a(f3);
                break;
            default:
                a40.z zVar = (a40.z) this.B;
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                ta.c0.M(zVar, null, null, null, new tm.a((tm.e) obj2, f3, (k00.c) null, 1), 31);
                break;
        }
        return b0Var;
    }
}
