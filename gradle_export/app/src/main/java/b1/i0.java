package b1;

import ri.t1;

public final class i0 extends m00.i implements u00.k {
    public final int A;
    public int B;
    public final e0 C;

    public i0(e0 e0Var, k00.c cVar, int i10) {
        super(1, cVar);
        this.A = i10;
        this.C = e0Var;
    }

    public final k00.c create(k00.c cVar) {
        switch (this.A) {
            case 0:
                return new i0(this.C, cVar, 0);
            case 1:
                return new i0(this.C, cVar, 1);
            default:
                return new i0(this.C, cVar, 2);
        }
    }

    public final Object invoke(Object obj) {
        k00.c cVar = (k00.c) obj;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(cVar).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                g00.b0 b0Var = l00.a.A;
                int i10 = this.B;
                g00.b0 b0Var2 = g00.b0.a;
                if (i10 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    this.C.f(this);
                    if (b0Var2 == b0Var) {
                        return b0Var;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0Var2;
            case 1:
                g00.b0 b0Var3 = l00.a.A;
                int i11 = this.B;
                g00.b0 b0Var4 = g00.b0.a;
                if (i11 == 0) {
                    t1.O(obj);
                    e0 e0Var = this.C;
                    boolean zBooleanValue = ((Boolean) e0Var.f1958u.getValue()).booleanValue();
                    this.B = 1;
                    e0Var.e(zBooleanValue, this);
                    if (b0Var4 == b0Var3) {
                        return b0Var3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0Var4;
            default:
                l00.a aVar = l00.a.A;
                int i12 = this.B;
                if (i12 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.s(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
