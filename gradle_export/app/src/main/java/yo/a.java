package yo;

import eo.p;
import g00.i;
import kotlin.jvm.internal.m;
import r30.k;
import th.o;
import x40.b0;
import x40.c;
import x40.e0;
import x40.q;
import zo.b;

public final class a implements c, t50.a {
    public final Object b = rd.a.I(i.A, new p(this, 27));

    @Override
    public final o a(e0 e0Var, b0 response) {
        String string;
        String strB;
        m.e(response, "response");
        o oVar = response.A;
        int i = 1;
        for (b0 b0Var = response.J; b0Var != null; b0Var = b0Var.J) {
            i++;
        }
        if (i < 2 && b.a(((q) oVar.C).b())) {
            String strA = ((x40.p) oVar.D).a("Authorization");
            if (strA == null || k.L0(strA)) {
                string = null;
            } else {
                string = k.j1(k.R0(strA, "Bearer ")).toString();
                if (k.L0(string)) {
                    string = null;
                }
            }
            if (string != null && (strB = ((bp.b) this.b.getValue()).b(string)) != null && !strB.equals(string)) {
                ce.c cVarJ = oVar.J();
                cVarJ.z("Authorization", "Bearer ".concat(strB));
                return cVarJ.r();
            }
        }
        return null;
    }
}
