package d0;

public final class a3 extends m00.h implements u00.n {
    public int B;
    public Object C;
    public final a40.z D;
    public final t1 E;
    public final u00.k F;
    public final u00.k G;
    public final u00.o H;
    public final u00.k I;

    public a3(a40.z zVar, t1 t1Var, u00.k kVar, u00.k kVar2, u00.o oVar, u00.k kVar3, k00.c cVar) {
        super(2, cVar);
        this.D = zVar;
        this.E = t1Var;
        this.F = kVar;
        this.G = kVar2;
        this.H = oVar;
        this.I = kVar3;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        a3 a3Var = new a3(this.D, this.E, this.F, this.G, this.H, this.I, cVar);
        a3Var.C = obj;
        return a3Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((v2.i0) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        int i10 = this.B;
        if (i10 == 0) {
            ri.t1.O(obj);
            v2.i0 i0Var = (v2.i0) this.C;
            this.B = 1;
            if (f3.g(i0Var, this.D, this.E, this.F, this.G, this.H, this.I, this) == aVar) {
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
