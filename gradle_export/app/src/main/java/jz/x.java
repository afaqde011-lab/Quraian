package jz;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Offerings;
import ri.t1;

public final class x extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final d0 C;

    public x(d0 d0Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = d0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                x xVar = new x(this.C, cVar, 0);
                xVar.B = obj;
                return xVar;
            default:
                x xVar2 = new x(this.C, cVar, 1);
                xVar2.B = obj;
                return xVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                x xVar = (x) create(obj, (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                xVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                x xVar2 = (x) create((g00.q) obj, (k00.c) obj2);
                g00.b0 b0Var2 = g00.b0.a;
                xVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        d0 d0Var = this.C;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                d0Var.h(new g(obj2));
                break;
            default:
                g00.q qVar = (g00.q) obj2;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                z zVarM = d0Var.m((CustomerInfo) qVar.A, (Offerings) qVar.B, ((Boolean) qVar.C).booleanValue());
                pm.b bVar = d0Var.c;
                d0Var.q(z.a(zVarM, null, null, null, ((z) bVar.d.getValue()).t, ((z) bVar.d.getValue()).u, 524287));
                break;
        }
        return b0Var;
    }
}
