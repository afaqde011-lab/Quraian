package zo;

import c50.f;
import ce.c;
import eo.p;
import ep.g;
import g00.i;
import r30.k;
import th.o;
import wo.c0;
import x40.b0;
import x40.q;
import x40.r;

public final class a implements r, t50.a {
    public final Object b = rd.a.I(i.A, new p(this, 28));

    @Override
    public final b0 a(f fVar) {
        String string;
        o oVar = (o) fVar.i;
        if (!b.a(((q) oVar.C).b())) {
            return fVar.f(oVar);
        }
        String strA = ((x40.p) oVar.D).a("Authorization");
        String str = null;
        if (strA == null || k.L0(strA)) {
            string = null;
        } else {
            string = k.j1(k.R0(strA, "Bearer ")).toString();
            if (k.L0(string)) {
                string = null;
            }
        }
        g session = ((c0) this.b.getValue()).a.getSession();
        if (session != null) {
            String str2 = session.a;
            if (!k.L0(str2)) {
                str = str2;
            }
        }
        if (string == null) {
            if (str == null) {
                return fVar.f(oVar);
            }
            string = str;
        }
        c cVarJ = oVar.J();
        cVarJ.z("Authorization", "Bearer ".concat(string));
        return fVar.f(cVarJ.r());
    }
}
