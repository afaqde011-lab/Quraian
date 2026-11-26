package vp;

import com.revenuecat.purchases.PurchasesException;

public final class q extends m00.c {
    public Object A;
    public final x B;
    public int C;

    public q(x xVar, m00.c cVar) {
        super(cVar);
        this.B = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) throws PurchasesException {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objU = this.B.u(null, null, this);
        return objU == l00.a.A ? objU : new g00.n(objU);
    }
}
