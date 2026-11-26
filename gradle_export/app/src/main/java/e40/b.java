package e40;

import a40.v1;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import kotlin.jvm.internal.d0;
import qd.s0;

public abstract class b {
    public static final k00.c[] a = new k00.c[0];
    public static final eh.l b = new eh.l("NULL", 2);
    public static final eh.l c = new eh.l("UNINITIALIZED", 2);
    public static final eh.l d = new eh.l("DONE", 2);

    public static final Object a(d40.j jVar, k00.c cVar, u00.a aVar, u00.o oVar, d40.i[] iVarArr) {
        k kVar = new k(jVar, null, aVar, oVar, iVarArr);
        v1 v1Var = new v1(cVar.getContext(), cVar, 1);
        Object objS = z3.S(v1Var, v1Var, kVar);
        return objS == l00.a.A ? objS : b0.a;
    }

    public static d40.i b(m mVar, k00.i iVar, int i, c40.a aVar, int i2) {
        if ((i2 & 1) != 0) {
            iVar = k00.j.A;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            aVar = c40.a.A;
        }
        return mVar.b(iVar, i, aVar);
    }

    public static final Object c(k00.i iVar, Object obj, Object obj2, u00.n nVar, k00.c frame) {
        Object objInvoke;
        Object objN = f40.a.n(iVar, obj2);
        try {
            t tVar = new t(frame, iVar);
            if (nVar == null) {
                objInvoke = s0.u0(nVar, obj, tVar);
            } else {
                d0.d(2, nVar);
                objInvoke = nVar.invoke(obj, tVar);
            }
            f40.a.g(iVar, objN);
            if (objInvoke == l00.a.A) {
                kotlin.jvm.internal.m.e(frame, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            f40.a.g(iVar, objN);
            throw th;
        }
    }
}
