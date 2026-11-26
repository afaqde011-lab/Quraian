package bt;

public final class r1 extends m00.i implements u00.o {
    public final int A;
    public int B;
    public d40.j C;
    public Object D;
    public final j2 E;

    public r1(int i, j2 j2Var, k00.c cVar) {
        super(3, cVar);
        this.A = i;
        this.E = j2Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d40.j jVar = (d40.j) obj;
        k00.c cVar = (k00.c) obj3;
        switch (this.A) {
            case 0:
                r1 r1Var = new r1(0, this.E, cVar);
                r1Var.C = jVar;
                r1Var.D = obj2;
                return r1Var.invokeSuspend(g00.b0.a);
            default:
                r1 r1Var2 = new r1(1, this.E, cVar);
                r1Var2.C = jVar;
                r1Var2.D = obj2;
                return r1Var2.invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) throws Throwable {
        d40.i a2Var;
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                g00.b0 b0Var = g00.b0.a;
                if (i == 0) {
                    ri.t1.O(obj);
                    d40.j jVar = this.C;
                    int iIntValue = ((Number) this.D).intValue();
                    d40.i iVarA = this.E.r.a(iIntValue);
                    this.C = null;
                    this.D = null;
                    this.B = 1;
                    if (jVar instanceof d40.r1) {
                        throw ((d40.r1) jVar).A;
                    }
                    Object objCollect = iVarA.collect(new p1(jVar, iIntValue, 0), this);
                    if (objCollect != aVar) {
                        objCollect = b0Var;
                    }
                    if (objCollect != aVar) {
                        objCollect = b0Var;
                    }
                    if (objCollect == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return b0Var;
            default:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    ri.t1.O(obj);
                    d40.j jVar2 = this.C;
                    boolean zBooleanValue = ((Boolean) this.D).booleanValue();
                    j2 j2Var = this.E;
                    if (zBooleanValue) {
                        a2Var = j2Var.v;
                    } else {
                        int iB = j2Var.e.b();
                        Boolean bool = Boolean.FALSE;
                        h00.x xVar = h00.x.A;
                        a2Var = new a2(j2.j(j2Var, xVar, xVar, iB, bool), 1);
                    }
                    this.C = null;
                    this.D = null;
                    this.B = 1;
                    if (d40.o.q(jVar2, a2Var, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
