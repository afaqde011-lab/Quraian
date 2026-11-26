package os;

import a40.c0;
import g00.b0;
import java.time.LocalDate;

public final class b implements d40.j {
    public final int A;
    public final x B;

    public b(x xVar, int i) {
        this.A = i;
        this.B = xVar;
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        Object objJ;
        switch (this.A) {
            case 0:
                g00.k kVar = (g00.k) obj;
                b0 b0Var = b0.a;
                boolean zBooleanValue = ((Boolean) kVar.A).booleanValue();
                boolean zBooleanValue2 = ((Boolean) kVar.B).booleanValue();
                x xVar = this.B;
                boolean z = xVar.F && !zBooleanValue;
                xVar.F = zBooleanValue;
                if (!zBooleanValue) {
                    objJ = x.b(xVar, z, cVar);
                    if (objJ != l00.a.A) {
                        return b0Var;
                    }
                } else {
                    if (zBooleanValue2) {
                        xVar.u();
                        if (!this.B.E) {
                            return b0Var;
                        }
                        x xVar2 = this.B;
                        c0.y(xVar2.p, null, null, new a(0, null, xVar2), 3);
                        return b0Var;
                    }
                    objJ = xVar.j(cVar);
                    if (objJ != l00.a.A) {
                        return b0Var;
                    }
                }
                return objJ;
            default:
                ss.v vVar = (ss.v) obj;
                LocalDate localDateNow = LocalDate.now();
                kotlin.jvm.internal.m.d(localDateNow, "now(...)");
                String strZ = f50.c.z(localDateNow);
                this.B.l.h(strZ, vVar != null ? new Long(x.d(vVar, strZ)) : null);
                return b0.a;
        }
    }
}
