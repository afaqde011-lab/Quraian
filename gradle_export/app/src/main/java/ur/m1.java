package ur;

import java.util.ArrayList;
import ri.t1;

public final class m1 extends m00.i implements u00.n {
    public final int A;
    public final r1 B;

    public m1(r1 r1Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.B = r1Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new m1(this.B, cVar, 0);
            case 1:
                return new m1(this.B, cVar, 1);
            default:
                return new m1(this.B, cVar, 2);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                m1 m1Var = (m1) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                m1Var.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                m1 m1Var2 = (m1) create(bool, (k00.c) obj2);
                g00.b0 b0Var2 = g00.b0.a;
                m1Var2.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                m1 m1Var3 = (m1) create((g00.b0) obj, (k00.c) obj2);
                g00.b0 b0Var3 = g00.b0.a;
                m1Var3.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        r1 r1Var = this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                h1 h1Var = (h1) r1Var.c.d.getValue();
                u30.b bVar = h1Var.D;
                r1Var.getClass();
                ArrayList arrayListQ = r1.q(bVar);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : arrayListQ) {
                    if (((qr.b) obj2) != qr.b.C) {
                        arrayList.add(obj2);
                    }
                }
                r1Var.i(h1.a(h1Var, null, null, false, null, false, null, false, null, null, null, false, null, null, false, false, false, 0, false, null, null, null, null, 0, 0, 0, false, false, false, null, r1.n(r1Var, arrayList, h1Var.D.contains(qr.b.D)), null, null, null, null, false, false, null, null, null, null, -536870913, 255));
                break;
            case 1:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                r1Var.s();
                break;
            default:
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                uu.w wVar = (uu.w) r1Var.d;
                wVar.getClass();
                uu.w.m(wVar, false, 1);
                break;
        }
        return b0Var;
    }
}
