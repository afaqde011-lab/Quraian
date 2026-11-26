package c20;

import a1.u0;
import e30.a1;
import e30.f0;
import e30.p0;
import e30.w;
import e30.x0;
import j10.r0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;

public final class e {
    public static p0 a(r0 r0Var, a typeAttr, u0 typeParameterUpperBoundEraser, w wVar) {
        m.e(typeAttr, "typeAttr");
        m.e(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        if (!typeAttr.c) {
            typeAttr = a.a(typeAttr, b.A, false, null, null, 61);
        }
        int iOrdinal = typeAttr.b.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new f0(wVar, a1.C);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!r0Var.F().B) {
            return new f0(u20.d.e(r0Var).o(), a1.C);
        }
        List parameters = wVar.m0().getParameters();
        m.d(parameters, "getParameters(...)");
        return !parameters.isEmpty() ? new f0(wVar, a1.E) : x0.k(r0Var, typeAttr);
    }
}
