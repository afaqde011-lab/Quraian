package g1;

public final class l2 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final j0.v C;

    public l2(j0.v vVar, int i10, k00.c cVar) {
        super(2, cVar);
        this.A = 2;
        this.C = vVar;
        this.B = i10;
    }

    public l2(j0.v vVar, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = vVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new l2(this.C, cVar, 0);
            case 1:
                return new l2(this.C, cVar, 1);
            default:
                return new l2(this.C, this.B, cVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 1:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                l2 l2VarCreate = create((d0.y1) obj, (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                l2VarCreate.invokeSuspend(b0Var);
                return b0Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        j0.v vVar = this.C;
        switch (i10) {
            case 0:
                g00.b0 b0Var2 = l00.a.A;
                int i11 = this.B;
                try {
                    if (i11 == 0) {
                        ri.t1.O(obj);
                        int iH = vVar.f7821e.f7808b.h() + 1;
                        this.B = 1;
                        if (vVar.f(iH, this) == b0Var2) {
                            b0Var = b0Var2;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ri.t1.O(obj);
                    }
                    break;
                } catch (IllegalArgumentException unused) {
                }
                return b0Var;
            case 1:
                g00.b0 b0Var3 = l00.a.A;
                int i12 = this.B;
                try {
                    if (i12 == 0) {
                        ri.t1.O(obj);
                        int iH2 = vVar.f7821e.f7808b.h() - 1;
                        this.B = 1;
                        if (vVar.f(iH2, this) == b0Var3) {
                            b0Var = b0Var3;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ri.t1.O(obj);
                    }
                    break;
                } catch (IllegalArgumentException unused2) {
                }
                return b0Var;
            default:
                l00.a aVar = l00.a.A;
                ri.t1.O(obj);
                vVar.k(this.B);
                return b0Var;
        }
    }
}
