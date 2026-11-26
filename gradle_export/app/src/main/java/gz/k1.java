package gz;

import com.revenuecat.purchases.CustomerInfo;
import ri.t1;

public final class k1 extends m00.i implements u00.o {
    public boolean A;
    public CustomerInfo B;
    public final m1 C;

    public k1(m1 m1Var, k00.c cVar) {
        super(3, cVar);
        this.C = m1Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        k1 k1Var = new k1(this.C, (k00.c) obj3);
        k1Var.A = zBooleanValue;
        k1Var.B = (CustomerInfo) obj2;
        return k1Var.invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        boolean z = this.A;
        CustomerInfo customerInfo = this.B;
        l00.a aVar = l00.a.A;
        t1.O(obj);
        Boolean boolValueOf = Boolean.valueOf(z);
        this.C.h.getClass();
        return new g00.k(boolValueOf, vp.x.C(customerInfo, z));
    }
}
