package x;

public final class v0 extends m00.i implements u00.k {
    public int A;
    public final Object B;
    public final Object C;
    public final y0 D;
    public final n1 E;
    public final float F;

    public v0(Object obj, Object obj2, y0 y0Var, n1 n1Var, float f3, k00.c cVar) {
        super(1, cVar);
        this.B = obj;
        this.C = obj2;
        this.D = y0Var;
        this.E = n1Var;
        this.F = f3;
    }

    public final k00.c create(k00.c cVar) {
        return new v0(this.B, this.C, this.D, this.E, this.F, cVar);
    }

    public final Object invoke(Object obj) {
        return create((k00.c) obj).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        int i10 = this.A;
        if (i10 == 0) {
            ri.t1.O(obj);
            u0 u0Var = new u0(this.B, this.C, this.D, this.E, this.F, null);
            this.A = 1;
            if (a40.c0.k(u0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
        }
        return g00.b0.a;
    }
}
