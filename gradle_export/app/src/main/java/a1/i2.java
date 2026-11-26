package a1;

public final class i2 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final b1.e0 C;

    public i2(b1.e0 e0Var, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = e0Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new i2(this.C, cVar, 0);
            case 1:
                return new i2(this.C, cVar, 1);
            case 2:
                return new i2(this.C, cVar, 2);
            default:
                i2 i2Var = new i2(this.C, cVar, 3);
                long j9 = ((h2.b) obj).f6544a;
                return i2Var;
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
                return new i2(this.C, (k00.c) obj2, 3).invokeSuspend(g00.b0.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.B;
                if (i10 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    if (this.C.y(this) == aVar) {
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
                g00.b0 b0Var = g00.b0.a;
                if (i11 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    b1.e0 e0Var = this.C;
                    e0Var.getClass();
                    Object objCollect = d40.o.n(l1.q.J(new b1.j(e0Var, 2)), b1.x.A).collect(new b1.g(new kotlin.jvm.internal.x(), new b1.y(e0Var, 0), 2), this);
                    if (objCollect != l00.a.A) {
                        objCollect = b0Var;
                    }
                    if (objCollect != aVar2) {
                        objCollect = b0Var;
                    }
                    if (objCollect == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return b0Var;
            case 2:
                l00.a aVar3 = l00.a.A;
                int i12 = this.B;
                g00.b0 b0Var2 = g00.b0.a;
                if (i12 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    b1.e0 e0Var2 = this.C;
                    e0Var2.getClass();
                    Object objCollect2 = d40.o.p(l1.q.J(new b1.j(e0Var2, 0)), new s0(19), d40.o.b).collect(new b1.y(e0Var2, 1), this);
                    if (objCollect2 != aVar3) {
                        objCollect2 = b0Var2;
                    }
                    if (objCollect2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return b0Var2;
            default:
                g00.b0 b0Var3 = l00.a.A;
                int i13 = this.B;
                g00.b0 b0Var4 = g00.b0.a;
                b1.e0 e0Var3 = this.C;
                if (i13 != 0) {
                    if (i13 == 1) {
                        ri.t1.O(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ri.t1.O(obj);
                    }
                    return b0Var4;
                }
                ri.t1.O(obj);
                this.B = 1;
                e0Var3.z();
                if (b0Var4 == b0Var3) {
                    return b0Var3;
                }
                e1.q qVar = e0Var3.f1947h;
                w2 w2Var = e0Var3.f1940a;
                if (qVar != null) {
                    CharSequence charSequence = w2Var.d().C;
                    long j9 = w2Var.d().D;
                    this.B = 2;
                    Object objC = qVar.c(charSequence, j9, this);
                    if (objC != b0Var3) {
                        objC = b0Var4;
                    }
                    if (objC == b0Var3) {
                        return b0Var3;
                    }
                }
                return b0Var4;
        }
    }
}
