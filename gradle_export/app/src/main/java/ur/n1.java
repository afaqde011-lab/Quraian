package ur;

import com.mchutov.core.domain.error.ApiException;
import com.mchutov.core.domain.exception.AuthException;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalyticsProvider;
import java.util.List;
import ri.t1;

public final class n1 extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final r1 C;

    public n1(r1 r1Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = r1Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                n1 n1Var = new n1(this.C, cVar, 0);
                n1Var.B = obj;
                return n1Var;
            case 1:
                n1 n1Var2 = new n1(this.C, cVar, 1);
                n1Var2.B = obj;
                return n1Var2;
            default:
                n1 n1Var3 = new n1(this.C, cVar, 2);
                n1Var3.B = obj;
                return n1Var3;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                n1 n1Var = (n1) create((y0) obj, (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                n1Var.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                n1 n1Var2 = (n1) create((Throwable) obj, (k00.c) obj2);
                g00.b0 b0Var2 = g00.b0.a;
                n1Var2.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                n1 n1Var3 = (n1) create((Throwable) obj, (k00.c) obj2);
                g00.b0 b0Var3 = g00.b0.a;
                n1Var3.invokeSuspend(b0Var3);
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
        r1 r1Var = this.C;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                y0 y0Var = (y0) obj2;
                l00.a aVar = l00.a.A;
                t1.O(obj);
                qr.c cVar = y0Var.a;
                qr.t tVar = y0Var.b;
                List list = y0Var.c;
                u30.b bVar = y0Var.d;
                pm.b bVar2 = r1Var.c;
                h1 h1Var = (h1) bVar2.d.getValue();
                qr.q qVar = cVar.a;
                boolean z = cVar.b;
                bx.c cVar2 = cVar.c;
                boolean z2 = cVar.d;
                u30.b bVar3 = cVar.l;
                boolean z3 = cVar.m;
                u30.b bVar4 = cVar.k;
                r1Var.i(h1.a(h1Var, cVar.e, qVar, z, cVar2, z2, bVar, false, ze.d.E(list), cVar.h, cVar.i, cVar.j, bVar4, bVar3, z3, false, false, cVar.u, cVar.v, cVar.n, cVar.o, cVar.p, cVar.q, cVar.r, cVar.s, cVar.t, cVar.w, false, false, null, r1.n(r1Var, tVar.a, ((h1) bVar2.d.getValue()).D.contains(qr.b.D)), tVar.b, tVar.c, tVar.d, tVar.e, false, false, tVar.f, tVar.g, tVar.h, tVar.i, 469811264, 12));
                break;
            case 1:
                Throwable th = (Throwable) obj2;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                r1Var.x.signInFailed(AuthAnalyticsProvider.APPLE, th);
                if (((th instanceof ApiException) || (th instanceof AuthException)) && (message = th.getMessage()) != null && !r30.k.L0(message)) {
                    strA = message;
                }
                if (strA == null) {
                    strA = r1Var.j.a(2131886156, new Object[0]);
                }
                ab.a0.A0(r1Var, new u0(strA));
                break;
            default:
                Throwable th2 = (Throwable) obj2;
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                r1Var.x.signInFailed(AuthAnalyticsProvider.GOOGLE, th2);
                if (((th2 instanceof ApiException) || (th2 instanceof AuthException)) && (message2 = th2.getMessage()) != null && !r30.k.L0(message2)) {
                    strA = message2;
                }
                if (strA == null) {
                    strA = r1Var.j.a(2131886174, new Object[0]);
                }
                ab.a0.A0(r1Var, new u0(strA));
                break;
        }
        return b0Var;
    }
}
