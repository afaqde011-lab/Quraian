package x;

public final class u0 extends m00.i implements u00.n {
    public int A;
    public Object B;
    public final Object C;
    public final Object D;
    public final y0 E;
    public final n1 F;
    public final float G;

    public u0(Object obj, Object obj2, y0 y0Var, n1 n1Var, float f3, k00.c cVar) {
        super(2, cVar);
        this.C = obj;
        this.D = obj2;
        this.E = y0Var;
        this.F = n1Var;
        this.G = f3;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        u0 u0Var = new u0(this.C, this.D, this.E, this.F, this.G, cVar);
        u0Var.B = obj;
        return u0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        y0 y0Var = this.E;
        if (i10 == 0) {
            ri.t1.O(obj);
            a40.z zVar = (a40.z) this.B;
            Object obj2 = this.C;
            Object obj3 = this.D;
            k00.c cVar = null;
            if (kotlin.jvm.internal.m.a(obj2, obj3)) {
                y0Var.P = null;
                if (kotlin.jvm.internal.m.a(y0Var.D.getValue(), obj2)) {
                    return b0Var;
                }
            } else {
                y0.W0(y0Var);
            }
            boolean zA = kotlin.jvm.internal.m.a(obj2, obj3);
            float f3 = this.G;
            if (!zA) {
                n1 n1Var = this.F;
                n1Var.p(obj2);
                n1Var.n(0L);
                y0Var.C.setValue(obj2);
                n1Var.j(f3);
            }
            y0Var.f1(f3);
            if (y0Var.O.i()) {
                a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new l6.d(y0Var, cVar, 20), 3);
            } else {
                y0Var.N = Long.MIN_VALUE;
            }
            this.A = 1;
            if (y0.Z0(y0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
        }
        y0Var.e1();
        return b0Var;
    }
}
