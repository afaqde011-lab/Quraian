package bt;

import java.util.ArrayList;
import java.util.Iterator;

public final class h1 extends m00.i implements u00.p {
    public ss.v A;
    public k2 B;
    public int C;
    public final j2 D;

    public h1(j2 j2Var, k00.c cVar) {
        super(4, cVar);
        this.D = j2Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj3).intValue();
        h1 h1Var = new h1(this.D, (k00.c) obj4);
        h1Var.A = (ss.v) obj;
        h1Var.B = (k2) obj2;
        h1Var.C = iIntValue;
        return h1Var.invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int iA;
        Integer num;
        ss.v vVar = this.A;
        k2 k2Var = this.B;
        int i = this.C;
        l00.a aVar = l00.a.A;
        ri.t1.O(obj);
        ys.c cVar = k2Var.a;
        ArrayList arrayList = k2Var.c;
        j2 j2Var = this.D;
        is.m1 m1Var = j2Var.e;
        boolean zIsAuthorized = j2Var.l.a.isAuthorized();
        int iD = 0;
        if (vVar != null) {
            iA = vVar.b;
        } else {
            iA = zIsAuthorized ? 0 : m1Var.a();
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer num2 = new Integer(((rs.c) it.next()).d);
            while (it.hasNext()) {
                Integer num3 = new Integer(((rs.c) it.next()).d);
                if (num2.compareTo(num3) < 0) {
                    num2 = num3;
                }
            }
            num = num2;
        } else {
            num = null;
        }
        int iIntValue = num != null ? num.intValue() / 60 : 0;
        if (vVar != null) {
            iD = vVar.c;
        } else if (!zIsAuthorized) {
            iD = m1Var.d();
        }
        return new ys.b(cVar, i, iA, iD, iIntValue);
    }
}
