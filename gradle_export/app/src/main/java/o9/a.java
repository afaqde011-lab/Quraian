package o9;

import java.util.Collection;

public final class a {

    public final f f11728a;

    public a(f fVar) {
        this.f11728a = fVar;
    }

    public void a(p pVar, m mVar, Collection collection) {
        f fVar = this.f11728a;
        if (pVar != fVar.f11801z || mVar == null) {
            if (pVar == fVar.f11782e) {
                if (mVar != null) {
                    fVar.q(fVar.f11781d, mVar);
                }
                x xVarA = fVar.f11781d.a();
                if (xVarA != null) {
                    xVarA.p(collection);
                    return;
                }
                return;
            }
            return;
        }
        a0 a0Var = fVar.f11800y.f11737a;
        String strD = mVar.d();
        x xVar = new x(a0Var, strD, fVar.b(a0Var, strD));
        xVar.i(mVar);
        if (fVar.f11781d == xVar) {
            return;
        }
        fVar.k(fVar, xVar, fVar.f11801z, 3, true, fVar.f11800y, collection);
        fVar.f11800y = null;
        fVar.f11801z = null;
    }
}
