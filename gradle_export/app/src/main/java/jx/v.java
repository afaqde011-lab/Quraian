package jx;

import d40.p1;
import g00.b0;
import java.util.List;
import ri.t1;

public final class v extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final x C;

    public v(x xVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = xVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                v vVar = new v(this.C, cVar, 0);
                vVar.B = obj;
                return vVar;
            default:
                v vVar2 = new v(this.C, cVar, 1);
                vVar2.B = obj;
                return vVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                v vVar = (v) create((g00.k) obj, (k00.c) obj2);
                b0 b0Var = b0.a;
                vVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                v vVar2 = (v) create((u30.b) obj, (k00.c) obj2);
                b0 b0Var2 = b0.a;
                vVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        x xVar = this.C;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                g00.k kVar = (g00.k) obj2;
                l00.a aVar = l00.a.A;
                t1.O(obj);
                xVar.i(s.a((s) xVar.c.d.getValue(), null, null, null, false, false, 0.0f, 0.0f, ((Boolean) kVar.A).booleanValue(), ze.d.E((List) kVar.B), 1023));
                break;
            default:
                u30.b bVar = (u30.b) obj2;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                pm.b bVar2 = xVar.c;
                String str = ((s) bVar2.d.getValue()).f;
                p1 p1Var = bVar2.d;
                s sVar = (s) p1Var.getValue();
                u30.b bVarK = x.k(bVar, str);
                h00.b bVar3 = (h00.b) bVar;
                boolean z = bVar3.a() >= 10 ? ((s) p1Var.getValue()).g : false;
                if (bVar3.a() < 10) {
                    str = "";
                }
                xVar.i(s.a(sVar, bVar, bVarK, str, z, false, 0.0f, 0.0f, false, null, 3974));
                break;
        }
        return b0Var;
    }
}
