package bt;

import android.content.Context;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import g1.m6;

public final class x0 extends m00.i implements u00.n {
    public final int A = 1;
    public int B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public final Object H;
    public final Object I;
    public Object J;

    public x0(a2 a2Var, u00.a aVar, cq.a aVar2, Context context, xo.a aVar3, u00.k kVar, ol.b bVar, xo.e eVar, k00.c cVar) {
        super(2, cVar);
        this.J = a2Var;
        this.C = aVar;
        this.D = aVar2;
        this.E = context;
        this.F = aVar3;
        this.G = kVar;
        this.H = bVar;
        this.I = eVar;
    }

    public x0(m6 m6Var, hp.b bVar, Context context, xo.a aVar, rp.o oVar, AuthAnalytics authAnalytics, ep.e eVar, ol.b bVar2, k00.c cVar) {
        super(2, cVar);
        this.J = m6Var;
        this.C = bVar;
        this.E = context;
        this.F = aVar;
        this.D = oVar;
        this.G = authAnalytics;
        this.I = eVar;
        this.H = bVar2;
    }

    public x0(m6 m6Var, hp.b bVar, Context context, xo.e eVar, rp.o oVar, AuthAnalytics authAnalytics, ep.e eVar2, ol.b bVar2, k00.c cVar) {
        super(2, cVar);
        this.J = m6Var;
        this.C = bVar;
        this.E = context;
        this.I = eVar;
        this.D = oVar;
        this.F = authAnalytics;
        this.G = eVar2;
        this.H = bVar2;
    }

    public x0(l1.x1 x1Var, d6.r rVar, d40.p1 p1Var, Context context, d6.x1 x1Var2, l6.y yVar, l6.x xVar, k00.c cVar) {
        super(2, cVar);
        this.C = x1Var;
        this.D = rVar;
        this.F = p1Var;
        this.E = context;
        this.G = x1Var2;
        this.H = yVar;
        this.I = xVar;
    }

    public x0(nm.b bVar, androidx.lifecycle.w wVar, jz.d0 d0Var, u00.a aVar, sy.c cVar, Context context, ol.b bVar2, vp.x xVar, k00.c cVar2) {
        super(2, cVar2);
        this.J = bVar;
        this.D = wVar;
        this.F = d0Var;
        this.C = aVar;
        this.G = cVar;
        this.E = context;
        this.H = bVar2;
        this.I = xVar;
    }

    public x0(u00.a aVar, cq.a aVar2, Context context, xo.a aVar3, u00.k kVar, ol.b bVar, xo.e eVar, k00.c cVar) {
        super(2, cVar);
        this.C = aVar;
        this.D = aVar2;
        this.E = context;
        this.F = aVar3;
        this.G = kVar;
        this.H = bVar;
        this.I = eVar;
    }

    public x0(wj.o0 o0Var, wj.j0 j0Var, k00.c cVar) {
        super(2, cVar);
        this.H = o0Var;
        this.I = j0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                x0 x0Var = new x0((u00.a) this.C, (cq.a) this.D, (Context) this.E, (xo.a) this.F, (u00.k) this.G, (ol.b) this.H, (xo.e) this.I, cVar);
                x0Var.J = obj;
                return x0Var;
            case 1:
                return new x0((a2) this.J, (u00.a) this.C, (cq.a) this.D, (Context) this.E, (xo.a) this.F, (u00.k) this.G, (ol.b) this.H, (xo.e) this.I, cVar);
            case 2:
                return new x0((nm.b) this.J, (androidx.lifecycle.w) this.D, (jz.d0) this.F, (u00.a) this.C, (sy.c) this.G, (Context) this.E, (ol.b) this.H, (vp.x) this.I, cVar);
            case 3:
                x0 x0Var2 = new x0((l1.x1) this.C, (d6.r) this.D, (d40.p1) this.F, (Context) this.E, (d6.x1) this.G, (l6.y) this.H, (l6.x) this.I, cVar);
                x0Var2.J = obj;
                return x0Var2;
            case 4:
                return new x0((m6) this.J, (hp.b) this.C, (Context) this.E, (xo.e) this.I, (rp.o) this.D, (AuthAnalytics) this.F, (ep.e) this.G, (ol.b) this.H, cVar);
            case 5:
                return new x0((m6) this.J, (hp.b) this.C, (Context) this.E, (xo.a) this.F, (rp.o) this.D, (AuthAnalytics) this.G, (ep.e) this.I, (ol.b) this.H, cVar);
            default:
                return new x0((wj.o0) this.H, (wj.j0) this.I, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return ((x0) create((g0) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 1:
                return ((x0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 2:
                return ((x0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 3:
                return ((x0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 4:
                return ((x0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 5:
                return ((x0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            default:
                return ((x0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        throw new UnsupportedOperationException("Method not decompiled: bt.x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
