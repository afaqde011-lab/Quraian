package r9;

import a40.z;
import g00.b0;
import kotlin.jvm.internal.m;
import m00.i;
import ri.t1;
import u00.n;
import x.n0;
import x.n1;
import x.s0;
import x.y0;

public final class h extends i implements n {
    public int A;
    public final float B;
    public final float C;
    public final y0 D;
    public final q9.c E;

    public h(float f3, float f10, y0 y0Var, q9.c cVar, k00.c cVar2) {
        super(2, cVar2);
        this.B = f3;
        this.C = f10;
        this.D = y0Var;
        this.E = cVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        return new h(this.B, this.C, this.D, this.E, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((z) obj, (k00.c) obj2).invokeSuspend(b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objA;
        l00.a aVar = l00.a.A;
        int i10 = this.A;
        b0 b0Var = b0.a;
        y0 y0Var = this.D;
        float f3 = this.C;
        float f10 = this.B;
        if (i10 == 0) {
            t1.O(obj);
            if (f10 != f3) {
                this.A = 1;
                if (y0Var.d1(f10, y0Var.C.getValue(), this) != aVar) {
                }
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            return b0Var;
        }
        t1.O(obj);
        if (f10 == f3) {
            this.A = 2;
            n1 n1Var = y0Var.F;
            if (n1Var == null) {
                objA = b0Var;
            } else {
                Object value = y0Var.D.getValue();
                q9.c cVar = this.E;
                if ((m.a(value, cVar) && m.a(y0Var.C.getValue(), cVar)) || (objA = n0.a(y0Var.M, new s0(y0Var, cVar, n1Var, (k00.c) null), this)) != aVar) {
                    objA = b0Var;
                }
            }
            if (objA == aVar) {
                return aVar;
            }
        }
        return b0Var;
    }
}
