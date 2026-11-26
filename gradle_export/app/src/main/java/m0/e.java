package m0;

import a1.p1;
import d0.q1;
import l0.b1;
import ri.t1;

public final class e implements b1 {

    public final w f10319a;

    public final boolean f10320b;

    public e(w wVar, boolean z10) {
        this.f10319a = wVar;
        this.f10320b = z10;
    }

    @Override
    public final int a() {
        w wVar = this.f10319a;
        return (int) (wVar.k().f10369e == q1.A ? wVar.k().g() & 4294967295L : wVar.k().g() >> 32);
    }

    @Override
    public final float b() {
        return t1.t(this.f10319a);
    }

    @Override
    public final int c() {
        w wVar = this.f10319a;
        return (-wVar.k().f10370f) + wVar.k().f10368d;
    }

    @Override
    public final float d() {
        w wVar = this.f10319a;
        return z.a(wVar.k(), wVar.l());
    }

    @Override
    public final Object e(int i10, p1 p1Var) {
        Object objR = w.r(this.f10319a, i10, p1Var);
        return objR == l00.a.A ? objR : g00.b0.a;
    }

    @Override
    public final j3.d f() {
        boolean z10 = this.f10320b;
        w wVar = this.f10319a;
        return z10 ? new j3.d(wVar.l(), 1) : new j3.d(1, wVar.l());
    }
}
