package vp;

import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.models.StoreProduct;

public final class r extends m00.c {
    public StoreProduct A;
    public Object B;
    public final x C;
    public int D;

    public r(x xVar, m00.c cVar) {
        super(cVar);
        this.C = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) throws PurchasesException {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        Object objV = this.C.v(null, null, this);
        return objV == l00.a.A ? objV : new g00.n(objV);
    }
}
