package g10;

import e30.a1;
import j10.u;
import j10.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m10.b0;
import m10.p0;

public abstract class q {
    public static final b0 a;

    static {
        g30.l lVar = g30.l.a;
        i10.m mVar = new i10.m(g30.l.b, p.f, 1);
        j10.f fVar = j10.f.A;
        n20.e eVarG = p.g.a.g();
        d30.b bVar = d30.l.e;
        b0 b0Var = new b0(mVar, eVarG, bVar);
        b0Var.H = y.E;
        j10.o oVar = j10.p.e;
        if (oVar == null) {
            b0.P(9);
            throw null;
        }
        b0Var.I = oVar;
        List listR = va.a.R(p0.b1(b0Var, a1.D, n20.e.e("T"), 0, bVar));
        if (b0Var.K != null) {
            throw new IllegalStateException("Type parameters are already set for " + b0Var.getName());
        }
        ArrayList arrayList = new ArrayList(listR);
        b0Var.K = arrayList;
        b0Var.J = new e30.i(b0Var, arrayList, b0Var.L, b0Var.M);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            b0.P(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((m10.i) ((u) it.next())).H = b0Var.n();
        }
        a = b0Var;
    }
}
