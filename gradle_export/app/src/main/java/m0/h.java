package m0;

import qd.s0;

public final class h implements l0.u {

    public final w f10333a;

    public h(w wVar) {
        this.f10333a = wVar;
    }

    @Override
    public final int a() {
        return this.f10333a.l();
    }

    @Override
    public final int b() {
        w wVar = this.f10333a;
        return Math.min(wVar.l() - 1, ((f) h00.q.T0(wVar.k().f10365a)).f10321a);
    }

    @Override
    public final int c() {
        int i10;
        w wVar = this.f10333a;
        if (wVar.k().f10365a.size() == 0) {
            return 0;
        }
        int iH0 = s0.h0(wVar.k());
        int i11 = wVar.k().f10366b + wVar.k().f10367c;
        if (i11 != 0 && (i10 = iH0 / i11) >= 1) {
            return i10;
        }
        return 1;
    }

    @Override
    public final boolean d() {
        return !this.f10333a.k().f10365a.isEmpty();
    }

    @Override
    public final int e() {
        return Math.max(0, this.f10333a.f10389e);
    }
}
