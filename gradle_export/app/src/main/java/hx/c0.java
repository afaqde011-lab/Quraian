package hx;

import java.util.List;
import ri.t1;

public final class c0 extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final e0 C;

    public c0(e0 e0Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = e0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                c0 c0Var = new c0(this.C, cVar, 0);
                c0Var.B = obj;
                return c0Var;
            case 1:
                c0 c0Var2 = new c0(this.C, cVar, 1);
                c0Var2.B = obj;
                return c0Var2;
            case 2:
                c0 c0Var3 = new c0(this.C, cVar, 2);
                c0Var3.B = obj;
                return c0Var3;
            default:
                c0 c0Var4 = new c0(this.C, cVar, 3);
                c0Var4.B = obj;
                return c0Var4;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                c0 c0Var = (c0) create((g00.q) obj, (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                c0Var.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                c0 c0Var2 = (c0) create((List) obj, (k00.c) obj2);
                g00.b0 b0Var2 = g00.b0.a;
                c0Var2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                c0 c0Var3 = (c0) create((List) obj, (k00.c) obj2);
                g00.b0 b0Var3 = g00.b0.a;
                c0Var3.invokeSuspend(b0Var3);
                return b0Var3;
            default:
                c0 c0Var4 = (c0) create((g00.k) obj, (k00.c) obj2);
                g00.b0 b0Var4 = g00.b0.a;
                c0Var4.invokeSuspend(b0Var4);
                return b0Var4;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        e0 e0Var = this.C;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                g00.q qVar = (g00.q) obj2;
                l00.a aVar = l00.a.A;
                t1.O(obj);
                e0Var.i(x.a((x) e0Var.c.d.getValue(), false, false, false, null, false, false, null, null, null, ((Boolean) qVar.A).booleanValue(), ze.d.E((List) qVar.B), ze.d.E((List) qVar.C), 2047));
                break;
            case 1:
                List list = (List) obj2;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                pm.b bVar = e0Var.c;
                e0Var.i(x.a((x) bVar.d.getValue(), false, ((x) bVar.d.getValue()).b && list.isEmpty(), false, ze.d.E(list), false, false, null, null, null, false, null, null, 16365));
                break;
            case 2:
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                e0Var.i(x.a((x) e0Var.c.d.getValue(), false, false, false, null, !((List) obj2).isEmpty(), false, null, null, null, false, null, null, 16319));
                break;
            default:
                g00.k kVar = (g00.k) obj2;
                l00.a aVar4 = l00.a.A;
                t1.O(obj);
                List list2 = (List) kVar.A;
                List list3 = (List) kVar.B;
                e0Var.j = list2;
                e0Var.i(x.a((x) e0Var.c.d.getValue(), false, false, false, null, false, false, null, null, ze.d.E(list3), false, null, null, 15359));
                break;
        }
        return b0Var;
    }
}
