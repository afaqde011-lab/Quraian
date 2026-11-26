package vp;

import com.revenuecat.purchases.PurchasesException;

public final class s extends m00.c {
    public Object A;
    public final x B;
    public int C;

    public s(x xVar, m00.c cVar) {
        super(cVar);
        this.B = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) throws PurchasesException {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objW = this.B.w(null, null, this);
        return objW == l00.a.A ? objW : new g00.n(objW);
    }
}
