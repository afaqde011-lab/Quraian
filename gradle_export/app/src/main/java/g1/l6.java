package g1;

public final class l6 extends m00.i implements u00.p {
    public int A;
    public h1.j B;
    public h1.n0 C;
    public n6 D;
    public final m6 E;
    public final float F;
    public final x.y G;

    public l6(m6 m6Var, float f3, x.y yVar, k00.c cVar) {
        super(4, cVar);
        this.E = m6Var;
        this.F = f3;
        this.G = yVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        float f3 = this.F;
        x.y yVar = this.G;
        l6 l6Var = new l6(this.E, f3, yVar, (k00.c) obj4);
        l6Var.B = (h1.j) obj;
        l6Var.C = (h1.n0) obj2;
        l6Var.D = (n6) obj3;
        return l6Var.invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        int i10 = this.A;
        if (i10 == 0) {
            ri.t1.O(obj);
            h1.j jVar = this.B;
            float fD = this.C.d(this.D);
            if (!Float.isNaN(fD)) {
                kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                m6 m6Var = this.E;
                float fH = Float.isNaN(((l1.e1) m6Var.f5887d.f5635j).h()) ? 0.0f : ((l1.e1) m6Var.f5887d.f5635j).h();
                wVar.A = fH;
                k6 k6Var = new k6(jVar, wVar, 0);
                this.B = null;
                this.C = null;
                this.A = 1;
                if (x.c.d(fH, fD, this.F, this.G, k6Var, this) == aVar) {
                    return aVar;
                }
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
