package bv;

import com.google.android.gms.internal.measurement.g4;
import java.util.ArrayList;
import java.util.List;

public final class s2 extends m00.i implements u00.q {
    public List A;
    public List B;
    public List C;
    public boolean D;

    @Override
    public final Object invokeSuspend(Object obj) {
        List list = this.A;
        List<yt.b> list2 = this.B;
        List list3 = this.C;
        boolean z = this.D;
        l00.a aVar = l00.a.A;
        ri.t1.O(obj);
        u30.b bVarE = ze.d.E(list);
        ArrayList arrayList = new ArrayList(h00.r.q0(list2, 10));
        for (yt.b bVar : list2) {
            arrayList.add(new g00.k(new Integer(bVar.a), new Long(bVar.b)));
        }
        return new dv.f(bVarE, g4.d0(arrayList), ze.d.E(list3), z);
    }

    @Override
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        s2 s2Var = new s2(5, (k00.c) obj5);
        s2Var.A = (List) obj;
        s2Var.B = (List) obj2;
        s2Var.C = (List) obj3;
        s2Var.D = zBooleanValue;
        return s2Var.invokeSuspend(g00.b0.a);
    }
}
