package k30;

import e30.a0;
import e30.f0;
import e30.h0;
import e30.x0;
import j10.z;
import java.util.List;
import m10.r0;

public final class l implements e {
    public static final l b = new l(0);
    public static final l c = new l(1);
    public final int a;

    public l(int i) {
        this.a = i;
    }

    @Override
    public final boolean a(z10.e eVar) {
        a0 a0VarT;
        switch (this.a) {
            case 0:
                r0 r0Var = (r0) eVar.O().get(1);
                g10.m mVar = g10.n.d;
                kotlin.jvm.internal.m.b(r0Var);
                z zVarJ = u20.d.j(r0Var);
                mVar.getClass();
                j10.e eVarD = j10.w.d(zVarJ, g10.o.R);
                if (eVarD == null) {
                    a0VarT = null;
                } else {
                    h0.B.getClass();
                    h0 h0Var = h0.C;
                    List parameters = eVarD.f().getParameters();
                    kotlin.jvm.internal.m.d(parameters, "getParameters(...)");
                    Object objD1 = h00.q.d1(parameters);
                    kotlin.jvm.internal.m.d(objD1, "single(...)");
                    a0VarT = e30.c.t(h0Var, eVarD, va.a.R(new f0((j10.r0) objD1)));
                }
                if (a0VarT == null) {
                    return false;
                }
                e30.w type = r0Var.getType();
                kotlin.jvm.internal.m.d(type, "getType(...)");
                return f30.d.a.b(a0VarT, x0.g(type, false));
            default:
                List<r0> listO = eVar.O();
                kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
                if (!listO.isEmpty()) {
                    for (r0 r0Var2 : listO) {
                        kotlin.jvm.internal.m.b(r0Var2);
                        if (u20.d.a(r0Var2) || r0Var2.K != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override
    public final String b(z10.e eVar) {
        switch (this.a) {
            case 0:
                break;
        }
        return a.a.J(this, eVar);
    }

    @Override
    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }
}
