package wr;

import bt.a2;
import d0.g3;
import d0.v1;
import d40.n0;
import ri.t1;
import z.b1;

public final class f extends m00.i implements u00.n {
    public int A;
    public final j0.v B;
    public final int C;
    public final float D;
    public final float E;

    public f(j0.v vVar, int i, float f, float f2, k00.c cVar) {
        super(2, cVar);
        this.B = vVar;
        this.C = i;
        this.D = f;
        this.E = f2;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new f(this.B, this.C, this.D, this.E, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Object objC;
        l00.a aVar = l00.a.A;
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        j0.v vVar = this.B;
        if (i == 0) {
            t1.O(obj);
            a2 a2VarJ = l1.q.J(new el.b(vVar, 13));
            n0 n0Var = new n0(2, null, 3);
            this.A = 1;
            if (d40.o.t(a2VarJ, n0Var, this) != aVar) {
            }
            return aVar;
        }
        if (i == 1) {
            t1.O(obj);
        } else {
            if (i == 2) {
                t1.O(obj);
                this.A = 3;
                if (g3.i(vVar, this.D, this) != aVar) {
                }
                return aVar;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
                return b0Var;
            }
            t1.O(obj);
        }
        this.A = 4;
        int i2 = g.b;
        objC = vVar.c(b1.A, new v1(this.E, (k00.c) null), this);
        if (objC != aVar) {
            objC = b0Var;
        }
        if (objC != aVar) {
            return aVar;
        }
        return b0Var;
        int i3 = this.C - 1;
        this.A = 2;
        if (j0.v.j(vVar, i3, this) != aVar) {
            this.A = 3;
            if (g3.i(vVar, this.D, this) != aVar) {
                this.A = 4;
                int i4 = g.b;
                objC = vVar.c(b1.A, new v1(this.E, (k00.c) null), this);
                if (objC != aVar) {
                    objC = b0Var;
                }
                if (objC != aVar) {
                    return b0Var;
                }
            }
        }
        return aVar;
    }
}
