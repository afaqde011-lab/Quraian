package d6;

public final class o0 extends m00.i implements u00.p {
    public final int A;
    public int B;
    public r C;
    public boolean D;

    public o0(int i10, k00.c cVar, int i11) {
        super(i10, cVar);
        this.A = i11;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        r rVar = (r) obj2;
        Boolean bool = (Boolean) obj3;
        switch (this.A) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                o0 o0Var = new o0(4, (k00.c) obj4, 0);
                o0Var.C = rVar;
                o0Var.D = zBooleanValue;
                return o0Var.invokeSuspend(g00.b0.a);
            default:
                boolean zBooleanValue2 = bool.booleanValue();
                o0 o0Var2 = new o0(4, (k00.c) obj4, 1);
                o0Var2.C = rVar;
                o0Var2.D = zBooleanValue2;
                return o0Var2.invokeSuspend(g00.b0.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.B;
                g00.b0 b0Var = g00.b0.a;
                if (i10 == 0) {
                    ri.t1.O(obj);
                    r rVar = this.C;
                    if (this.D) {
                        this.B = 1;
                        Object objF = rVar.f(l.f4669a, this);
                        if (objF != aVar) {
                            objF = b0Var;
                        }
                        if (objF == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return b0Var;
            default:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return obj;
                }
                ri.t1.O(obj);
                r rVar2 = this.C;
                if (this.D) {
                    return null;
                }
                this.B = 1;
                Object objG = rVar2.g(this);
                return objG == aVar2 ? aVar2 : objG;
        }
    }
}
