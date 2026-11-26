package d0;

public final class r2 extends m00.i implements u00.n {
    public u2 A;
    public kotlin.jvm.internal.y B;
    public long C;
    public int D;
    public Object E;
    public final u2 F;
    public final kotlin.jvm.internal.y G;
    public final long H;

    public r2(u2 u2Var, kotlin.jvm.internal.y yVar, long j9, k00.c cVar) {
        super(2, cVar);
        this.F = u2Var;
        this.G = yVar;
        this.H = j9;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        r2 r2Var = new r2(this.F, this.G, this.H, cVar);
        r2Var.E = obj;
        return r2Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((s2) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        u2 u2Var;
        kotlin.jvm.internal.y yVar;
        u2 u2Var2;
        long j9;
        l00.a aVar = l00.a.A;
        int i10 = this.D;
        if (i10 == 0) {
            ri.t1.O(obj);
            s2 s2Var = (s2) this.E;
            u2Var = this.F;
            q2 q2Var = new q2(u2Var, s2Var);
            t0 t0Var = u2Var.f4514c;
            yVar = this.G;
            long j10 = yVar.A;
            q1 q1Var = u2Var.f4515d;
            q1 q1Var2 = q1.B;
            long j11 = this.H;
            float fD = u2Var.d(q1Var == q1Var2 ? y3.q.b(j11) : y3.q.c(j11));
            this.E = u2Var;
            this.A = u2Var;
            this.B = yVar;
            this.C = j10;
            this.D = 1;
            obj = t0Var.a(q2Var, fD, this);
            if (obj == aVar) {
                return aVar;
            }
            u2Var2 = u2Var;
            j9 = j10;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j9 = this.C;
            yVar = this.B;
            u2Var = this.A;
            u2Var2 = (u2) this.E;
            ri.t1.O(obj);
        }
        float fD2 = u2Var2.d(((Number) obj).floatValue());
        yVar.A = u2Var.f4515d == q1.B ? y3.q.a(fD2, 0.0f, 2, j9) : y3.q.a(0.0f, fD2, 1, j9);
        return g00.b0.a;
    }
}
