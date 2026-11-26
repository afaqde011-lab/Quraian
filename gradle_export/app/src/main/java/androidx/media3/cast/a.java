package androidx.media3.cast;

import android.content.Context;
import android.text.TextUtils;
import android.view.Menu;
import fh.q0;
import fh.t0;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import k9.a2;
import k9.d1;
import k9.d4;
import k9.p0;
import k9.p3;
import k9.s1;
import k9.s2;
import k9.t2;
import kh.r;
import kh.v;
import l9.x;
import ta.c0;

public final class a implements d4.i, fe.a, p0, s2, e7.h {
    public final int A;
    public final Object B;
    public final Object C;

    public a(Object obj, int i10, Object obj2) {
        this.B = obj;
        this.A = i10;
        this.C = obj2;
    }

    public a(Object obj, Object obj2, int i10) {
        this.B = obj;
        this.C = obj2;
        this.A = i10;
    }

    @Override
    public void a(a2 a2Var) {
        t2 t2Var = (t2) this.B;
        x xVar = (x) this.C;
        if (TextUtils.isEmpty(xVar.A)) {
            e7.a.m("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        v vVarR = t2Var.f9463f.r(a2Var, t0.s(k9.p.k(xVar)));
        vVarR.a(new r(vVarR, new c50.h(t2Var, a2Var, this.A), 0), kh.p.A);
    }

    @Override
    public void accept(Object obj) {
        d4 d4Var;
        s1 s1Var = (s1) this.B;
        a2 a2Var = (a2) this.C;
        try {
            d4Var = (d4) ((v) obj).get();
            c0.w(d4Var, "SessionResult must not be null");
        } catch (InterruptedException | ExecutionException e3) {
            e7.a.n("MediaSessionStub", "Session operation failed", e3);
            d4Var = new d4(e3.getCause() instanceof UnsupportedOperationException ? -6 : -1);
        } catch (CancellationException e10) {
            e7.a.n("MediaSessionStub", "Session operation cancelled", e10);
            d4Var = new d4(1);
        }
        p3.m2(s1Var, a2Var, this.A, d4Var);
    }

    @Override
    public void b(k9.m mVar, int i10) {
        k9.t0 t0Var = (k9.t0) this.B;
        List list = (List) this.C;
        d1 d1Var = t0Var.f9440c;
        q0 q0VarM = t0.m();
        for (int i11 = 0; i11 < list.size(); i11++) {
            q0VarM.c(((androidx.media3.common.q0) list.get(i11)).c(true));
        }
        mVar.S0(d1Var, i10, this.A, new androidx.media3.common.g(q0VarM.g()));
    }

    @Override
    public Object h(d4.h hVar) {
        return MediaRouteButtonFactory.lambda$setUpMediaRouteButton$0((Context) this.B, (Menu) this.C, this.A, hVar);
    }

    @Override
    public Object i() {
        a30.k kVar = (a30.k) this.B;
        ((a1.i) kVar.d).x((xd.i) this.C, this.A + 1, false);
        return null;
    }
}
