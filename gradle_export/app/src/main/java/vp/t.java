package vp;

import android.app.Activity;
import com.revenuecat.purchases.PurchasesException;

public final class t extends m00.c {
    public Activity A;
    public String B;
    public Object C;
    public final x D;
    public int E;

    public t(x xVar, m00.c cVar) {
        super(cVar);
        this.D = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) throws PurchasesException {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object objX = this.D.x(null, null, this);
        return objX == l00.a.A ? objX : new g00.n(objX);
    }
}
