package qx;

import d40.p1;
import g00.b0;
import java.util.List;
import ri.t1;

public final class r extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final t C;

    public r(t tVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = tVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                r rVar = new r(this.C, cVar, 0);
                rVar.B = obj;
                return rVar;
            default:
                r rVar2 = new r(this.C, cVar, 1);
                rVar2.B = obj;
                return rVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                r rVar = (r) create((g00.k) obj, (k00.c) obj2);
                b0 b0Var = b0.a;
                rVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                r rVar2 = (r) create((u30.b) obj, (k00.c) obj2);
                b0 b0Var2 = b0.a;
                rVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        t tVar = this.C;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                g00.k kVar = (g00.k) obj2;
                l00.a aVar = l00.a.A;
                t1.O(obj);
                tVar.i(o.a((o) tVar.c.d.getValue(), null, null, null, false, false, 0.0f, 0.0f, ((Boolean) kVar.A).booleanValue(), ze.d.E((List) kVar.B), 2047));
                break;
            default:
                u30.b bVar = (u30.b) obj2;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                pm.b bVar2 = tVar.c;
                String str = ((o) bVar2.d.getValue()).g;
                p1 p1Var = bVar2.d;
                o oVar = (o) p1Var.getValue();
                u30.b bVarK = t.k(bVar, str);
                h00.b bVar3 = (h00.b) bVar;
                boolean z = bVar3.a() >= 10 ? ((o) p1Var.getValue()).h : false;
                if (bVar3.a() < 10) {
                    str = "";
                }
                tVar.i(o.a(oVar, bVar, bVarK, str, z, false, 0.0f, 0.0f, false, null, 7974));
                break;
        }
        return b0Var;
    }
}
