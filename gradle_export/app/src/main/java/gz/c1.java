package gz;

import com.mchutov.core.domain.error.ApiException;
import com.mchutov.core.domain.exception.AuthException;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalyticsProvider;
import ri.t1;

public final class c1 extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final m1 C;

    public c1(m1 m1Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = m1Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                c1 c1Var = new c1(this.C, cVar, 0);
                c1Var.B = obj;
                return c1Var;
            case 1:
                c1 c1Var2 = new c1(this.C, cVar, 1);
                c1Var2.B = obj;
                return c1Var2;
            case 2:
                c1 c1Var3 = new c1(this.C, cVar, 2);
                c1Var3.B = obj;
                return c1Var3;
            default:
                c1 c1Var4 = new c1(this.C, cVar, 3);
                c1Var4.B = obj;
                return c1Var4;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                c1 c1Var = (c1) create(obj, (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                c1Var.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                c1 c1Var2 = (c1) create((g00.k) obj, (k00.c) obj2);
                g00.b0 b0Var2 = g00.b0.a;
                c1Var2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                c1 c1Var3 = (c1) create((Throwable) obj, (k00.c) obj2);
                g00.b0 b0Var3 = g00.b0.a;
                c1Var3.invokeSuspend(b0Var3);
                return b0Var3;
            default:
                c1 c1Var4 = (c1) create((Throwable) obj, (k00.c) obj2);
                g00.b0 b0Var4 = g00.b0.a;
                c1Var4.invokeSuspend(b0Var4);
                return b0Var4;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        String message;
        String message2;
        int i = this.A;
        String strA = null;
        g00.b0 b0Var = g00.b0.a;
        m1 m1Var = this.C;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                m1Var.l(new y(obj2));
                break;
            case 1:
                g00.k kVar = (g00.k) obj2;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                m1Var.i(g1.a((g1) m1Var.c.d.getValue(), ((Boolean) kVar.A).booleanValue(), (xp.a) kVar.B, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268435443));
                break;
            case 2:
                Throwable th = (Throwable) obj2;
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                m1Var.r.signInFailed(AuthAnalyticsProvider.APPLE, th);
                if (((th instanceof ApiException) || (th instanceof AuthException)) && (message = th.getMessage()) != null && !r30.k.L0(message)) {
                    strA = message;
                }
                if (strA == null) {
                    strA = m1Var.d.a(2131886156, new Object[0]);
                }
                ab.a0.A0(m1Var, new s0(strA));
                break;
            default:
                Throwable th2 = (Throwable) obj2;
                l00.a aVar4 = l00.a.A;
                t1.O(obj);
                m1Var.r.signInFailed(AuthAnalyticsProvider.GOOGLE, th2);
                if (((th2 instanceof ApiException) || (th2 instanceof AuthException)) && (message2 = th2.getMessage()) != null && !r30.k.L0(message2)) {
                    strA = message2;
                }
                if (strA == null) {
                    strA = m1Var.d.a(2131886174, new Object[0]);
                }
                ab.a0.A0(m1Var, new s0(strA));
                break;
        }
        return b0Var;
    }
}
