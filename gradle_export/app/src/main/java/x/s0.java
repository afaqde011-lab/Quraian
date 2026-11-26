package x;

public final class s0 extends m00.i implements u00.k {
    public final int A = 0;
    public int B;
    public final y0 C;
    public final Object D;
    public final n1 E;

    public s0(n1 n1Var, y0 y0Var, Object obj, k00.c cVar) {
        super(1, cVar);
        this.E = n1Var;
        this.C = y0Var;
        this.D = obj;
    }

    public s0(y0 y0Var, Object obj, n1 n1Var, k00.c cVar) {
        super(1, cVar);
        this.C = y0Var;
        this.D = obj;
        this.E = n1Var;
    }

    public final k00.c create(k00.c cVar) {
        switch (this.A) {
            case 0:
                return new s0(this.E, this.C, this.D, cVar);
            default:
                return new s0(this.C, this.D, this.E, cVar);
        }
    }

    public final Object invoke(Object obj) {
        k00.c cVar = (k00.c) obj;
        switch (this.A) {
            case 0:
                break;
        }
        return create(cVar).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        float f3;
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.B;
                n1 n1Var = this.E;
                if (i10 == 0) {
                    ri.t1.O(obj);
                    a1.f fVar = new a1.f(this.C, this.D, n1Var, null);
                    this.B = 1;
                    if (a40.c0.k(fVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                n1Var.i();
                return g00.b0.a;
            default:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                n1 n1Var2 = this.E;
                if (i11 == 0) {
                    ri.t1.O(obj);
                    y0 y0Var = this.C;
                    y0Var.b1();
                    l1.i1 i1Var = y0Var.C;
                    y0Var.N = Long.MIN_VALUE;
                    y0Var.f1(0.0f);
                    Object value = y0Var.D.getValue();
                    Object obj2 = this.D;
                    if (kotlin.jvm.internal.m.a(obj2, value)) {
                        f3 = -4.0f;
                    } else {
                        f3 = kotlin.jvm.internal.m.a(obj2, i1Var.getValue()) ? -5.0f : -3.0f;
                    }
                    n1Var2.p(obj2);
                    n1Var2.n(0L);
                    i1Var.setValue(obj2);
                    y0Var.f1(0.0f);
                    y0Var.R0(obj2);
                    n1Var2.j(f3);
                    if (f3 == -3.0f) {
                        this.B = 1;
                        if (y0.Z0(y0Var, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                n1Var2.i();
                return g00.b0.a;
        }
    }
}
