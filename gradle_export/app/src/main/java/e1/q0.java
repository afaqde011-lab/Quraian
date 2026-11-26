package e1;

import ri.t1;

public final class q0 extends m00.i implements u00.k {
    public final int A;
    public final v0 B;

    public q0(v0 v0Var, k00.c cVar, int i10) {
        super(1, cVar);
        this.A = i10;
        this.B = v0Var;
    }

    public final k00.c create(k00.c cVar) {
        switch (this.A) {
            case 0:
                return new q0(this.B, cVar, 0);
            case 1:
                return new q0(this.B, cVar, 1);
            case 2:
                return new q0(this.B, cVar, 2);
            default:
                return new q0(this.B, cVar, 3);
        }
    }

    public final Object invoke(Object obj) {
        k00.c cVar = (k00.c) obj;
        switch (this.A) {
            case 0:
                q0 q0VarCreate = create(cVar);
                g00.b0 b0Var = g00.b0.a;
                q0VarCreate.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                q0 q0VarCreate2 = create(cVar);
                g00.b0 b0Var2 = g00.b0.a;
                q0VarCreate2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                q0 q0VarCreate3 = create(cVar);
                g00.b0 b0Var3 = g00.b0.a;
                q0VarCreate3.invokeSuspend(b0Var3);
                return b0Var3;
            default:
                q0 q0VarCreate4 = create(cVar);
                g00.b0 b0Var4 = g00.b0.a;
                q0VarCreate4.invokeSuspend(b0Var4);
                return b0Var4;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        v0 v0Var = this.B;
        switch (i10) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                v0Var.B = false;
                break;
            case 1:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                v0Var.f();
                break;
            case 2:
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                v0Var.d(v0Var.B);
                break;
            default:
                l00.a aVar4 = l00.a.A;
                t1.O(obj);
                v0Var.p();
                break;
        }
        return b0Var;
    }
}
