package rp;

import com.mchutov.quranify.auth.presentation.analytics.AuthAnalyticsProvider;
import g00.b0;
import ri.t1;

public final class n extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final o C;

    public n(o oVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = oVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                n nVar = new n(this.C, cVar, 0);
                nVar.B = obj;
                return nVar;
            default:
                n nVar2 = new n(this.C, cVar, 1);
                nVar2.B = obj;
                return nVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        Throwable th = (Throwable) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                n nVar = (n) create(th, cVar);
                b0 b0Var = b0.a;
                nVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                n nVar2 = (n) create(th, cVar);
                b0 b0Var2 = b0.a;
                nVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        o oVar = this.C;
        Throwable th = (Throwable) this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                oVar.g.signInFailed(AuthAnalyticsProvider.APPLE, th);
                o.k(oVar, th, 2131886156);
                break;
            default:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                oVar.g.signInFailed(AuthAnalyticsProvider.GOOGLE, th);
                o.k(oVar, th, 2131886174);
                break;
        }
        return b0Var;
    }
}
