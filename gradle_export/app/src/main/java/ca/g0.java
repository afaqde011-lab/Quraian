package ca;

import android.database.SQLException;
import java.util.Set;
import ri.t1;

public final class g0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;
    public final l0 D;

    public g0(l0 l0Var, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.D = l0Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                g0 g0Var = new g0(this.D, cVar, 0);
                g0Var.C = obj;
                return g0Var;
            default:
                g0 g0Var2 = new g0(this.D, cVar, 1);
                g0Var2.C = obj;
                return g0Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return create((ea.m) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                return create((b0) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.B;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return obj;
                }
                t1.O(obj);
                ea.m mVar = (ea.m) this.C;
                this.B = 1;
                Object objA = l0.a(this.D, mVar, this);
                return objA == aVar ? aVar : objA;
            default:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                try {
                    if (i11 != 0) {
                        if (i11 == 1) {
                            b0Var = (b0) this.C;
                            t1.O(obj);
                        } else {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t1.O(obj);
                        }
                        return (Set) obj;
                    }
                    t1.O(obj);
                    b0Var = (b0) this.C;
                    this.C = b0Var;
                    this.B = 1;
                    obj = b0Var.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        a0 a0Var = a0.B;
                        g0 g0Var = new g0(this.D, null, 0);
                        this.C = null;
                        this.B = 2;
                        obj = b0Var.a(a0Var, g0Var, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        return (Set) obj;
                    }
                } catch (SQLException unused) {
                }
                return h00.z.A;
        }
    }
}
