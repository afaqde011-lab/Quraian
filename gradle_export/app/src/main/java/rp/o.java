package rp;

import ab.a0;
import androidx.lifecycle.u0;
import com.mchutov.core.domain.error.ApiException;
import com.mchutov.core.domain.exception.AuthException;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import ep.p;
import kotlin.NoWhenBranchMatchedException;
import ta.c0;

public final class o extends vm.a {
    public final bp.g d;
    public final pm.c e;
    public final hp.b f;
    public final AuthAnalytics g;

    public o(bp.g gVar, pm.c cVar, hp.b bVar, AuthAnalytics authAnalytics) {
        super(new m(0));
        this.d = gVar;
        this.e = cVar;
        this.f = bVar;
        this.g = authAnalytics;
    }

    public static final void j(o oVar, p pVar, String str) {
        hp.b bVar = oVar.f;
        if (kotlin.jvm.internal.m.a(pVar, ep.n.a)) {
            oVar.g.signInCompleted(str);
            bVar.a();
            a0.A0(oVar, new e(oVar.e.a(2131886222, new Object[0])));
        } else {
            if (!(pVar instanceof ep.o)) {
                throw new NoWhenBranchMatchedException();
            }
            ep.o oVar2 = (ep.o) pVar;
            bVar.b(oVar2.a, oVar2.b, oVar2.d, bVar.c, oVar2.c);
        }
    }

    public static final void k(o oVar, Throwable th, int i) {
        String message;
        String strA = null;
        if (((th instanceof ApiException) || (th instanceof AuthException)) && (message = th.getMessage()) != null && !r30.k.L0(message)) {
            strA = message;
        }
        if (strA == null) {
            strA = oVar.e.a(i, new Object[0]);
        }
        a0.A0(oVar, new d(strA));
    }

    public final void l(c cVar) {
        k00.c cVar2 = null;
        if (cVar instanceof b) {
            c0.M(u0.i(this), (k00.i) null, new n(this, null, 1), (u00.k) null, new pz.k(this, ((b) cVar).a, cVar2, 8), 27);
        } else {
            if (!(cVar instanceof a)) {
                throw new NoWhenBranchMatchedException();
            }
            c0.M(u0.i(this), (k00.i) null, new n(this, null, 0), (u00.k) null, new pz.k(this, ((a) cVar).a, cVar2, 7), 27);
        }
    }
}
