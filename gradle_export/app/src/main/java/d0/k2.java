package d0;

public final class k2 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final m2 C;
    public long D;

    public k2(m2 m2Var, long j9, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = m2Var;
        this.D = j9;
    }

    public k2(m2 m2Var, k00.c cVar) {
        super(2, cVar);
        this.A = 3;
        this.C = m2Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new k2(this.C, this.D, cVar, 0);
            case 1:
                return new k2(this.C, this.D, cVar, 1);
            case 2:
                return new k2(this.C, this.D, cVar, 2);
            default:
                k2 k2Var = new k2(this.C, cVar);
                k2Var.D = ((h2.b) obj).f6544a;
                return k2Var;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 1:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 2:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                long j9 = ((h2.b) obj).f6544a;
                k2 k2Var = new k2(this.C, (k00.c) obj2);
                k2Var.D = j9;
                return k2Var.invokeSuspend(g00.b0.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.B;
                if (i10 == 0) {
                    ri.t1.O(obj);
                    u2 u2Var = this.C.f4454n0;
                    z.b1 b1Var = z.b1.B;
                    j2 j2Var = new j2(this.D, null);
                    this.B = 1;
                    if (u2Var.f(b1Var, j2Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                if (i11 == 0) {
                    ri.t1.O(obj);
                    u2 u2Var2 = this.C.f4454n0;
                    long j9 = this.D;
                    this.B = 1;
                    if (u2Var2.b(j9, false, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 2:
                l00.a aVar3 = l00.a.A;
                int i12 = this.B;
                if (i12 == 0) {
                    ri.t1.O(obj);
                    u2 u2Var3 = this.C.f4454n0;
                    long j10 = this.D;
                    this.B = 1;
                    if (u2Var3.b(j10, true, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar4 = l00.a.A;
                int i13 = this.B;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return obj;
                }
                ri.t1.O(obj);
                long j11 = this.D;
                u2 u2Var4 = this.C.f4454n0;
                this.B = 1;
                Object objA = e2.a(u2Var4, j11, this);
                return objA == aVar4 ? aVar4 : objA;
        }
    }
}
