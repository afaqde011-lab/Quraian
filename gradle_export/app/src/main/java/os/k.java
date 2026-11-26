package os;

import g00.b0;
import h00.j0;
import java.util.Set;
import ri.t1;

public final class k extends m00.i implements u00.q {
    public boolean A;
    public boolean B;
    public Set C;
    public boolean D;

    @Override
    public final Object invokeSuspend(Object obj) {
        boolean z = this.A;
        boolean z2 = this.B;
        Set setR0 = this.C;
        boolean z3 = this.D;
        l00.a aVar = l00.a.A;
        t1.O(obj);
        if (z) {
            setR0 = j0.r0(setR0, new Integer(7));
        }
        return new ss.p(setR0, z2, z3);
    }

    @Override
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
        k kVar = new k(5, (k00.c) obj5);
        kVar.A = zBooleanValue;
        kVar.B = zBooleanValue2;
        kVar.C = (Set) obj3;
        kVar.D = zBooleanValue3;
        return kVar.invokeSuspend(b0.a);
    }
}
