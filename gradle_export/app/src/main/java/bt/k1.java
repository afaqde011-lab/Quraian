package bt;

import com.mchutov.core.domain.error.ApiException;
import com.mchutov.core.domain.exception.AuthException;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalyticsProvider;

public final class k1 extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final j2 C;

    public k1(int i, j2 j2Var, k00.c cVar) {
        super(2, cVar);
        this.A = i;
        this.C = j2Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                k1 k1Var = new k1(0, this.C, cVar);
                k1Var.B = obj;
                return k1Var;
            case 1:
                k1 k1Var2 = new k1(1, this.C, cVar);
                k1Var2.B = obj;
                return k1Var2;
            default:
                k1 k1Var3 = new k1(2, this.C, cVar);
                k1Var3.B = obj;
                return k1Var3;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                k1 k1Var = (k1) create((a1) obj, (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                k1Var.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                k1 k1Var2 = (k1) create((Throwable) obj, (k00.c) obj2);
                g00.b0 b0Var2 = g00.b0.a;
                k1Var2.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                k1 k1Var3 = (k1) create((Throwable) obj, (k00.c) obj2);
                g00.b0 b0Var3 = g00.b0.a;
                k1Var3.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        String message;
        String message2;
        int i = this.A;
        String strA = null;
        g00.b0 b0Var = g00.b0.a;
        j2 j2Var = this.C;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                ri.t1.O(obj);
                j2Var.i((a1) obj2);
                break;
            case 1:
                Throwable th = (Throwable) obj2;
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                j2Var.p.signInFailed(AuthAnalyticsProvider.APPLE, th);
                if (((th instanceof ApiException) || (th instanceof AuthException)) && (message = th.getMessage()) != null && !r30.k.L0(message)) {
                    strA = message;
                }
                if (strA == null) {
                    strA = j2Var.o.a(2131886156, new Object[0]);
                }
                ab.a0.A0(j2Var, new d0(strA));
                break;
            default:
                Throwable th2 = (Throwable) obj2;
                l00.a aVar3 = l00.a.A;
                ri.t1.O(obj);
                j2Var.p.signInFailed(AuthAnalyticsProvider.GOOGLE, th2);
                if (((th2 instanceof ApiException) || (th2 instanceof AuthException)) && (message2 = th2.getMessage()) != null && !r30.k.L0(message2)) {
                    strA = message2;
                }
                if (strA == null) {
                    strA = j2Var.o.a(2131886174, new Object[0]);
                }
                ab.a0.A0(j2Var, new d0(strA));
                break;
        }
        return b0Var;
    }
}
