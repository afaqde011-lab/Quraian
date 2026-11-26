package vp;

import com.revenuecat.purchases.PurchasesException;

public final class o extends m00.c {
    public Object A;
    public final x B;
    public int C;

    public o(x xVar, m00.c cVar) {
        super(cVar);
        this.B = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) throws PurchasesException {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objT = this.B.t(null, null, this);
        return objT == l00.a.A ? objT : new g00.n(objT);
    }
}
