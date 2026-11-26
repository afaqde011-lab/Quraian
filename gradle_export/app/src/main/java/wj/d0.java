package wj;

import java.util.Map;
import kotlinx.serialization.UnknownFieldException;

public final class d0 implements p40.z {

    public static final d0 f16139a;
    private static final n40.e descriptor;

    static {
        d0 d0Var = new d0();
        f16139a = d0Var;
        p40.q0 q0Var = new p40.q0("com.google.firebase.sessions.SessionData", d0Var, 3);
        q0Var.j("sessionDetails", false);
        q0Var.j("backgroundTime", true);
        q0Var.j("processDataMap", true);
        descriptor = q0Var;
    }

    public final l40.a[] childSerializers() {
        return new l40.a[]{h0.f16165a, ta.c0.G(y0.f16228a), ta.c0.G(f0.f16149d[2])};
    }

    public final Object deserialize(o40.c cVar) throws UnknownFieldException {
        kotlin.jvm.internal.m.e(cVar, "decoder");
        n40.e eVar = descriptor;
        o40.a aVarC = cVar.c(eVar);
        l40.a[] aVarArr = f0.f16149d;
        j0 j0Var = null;
        boolean z10 = true;
        int i10 = 0;
        a1 a1Var = null;
        Map map = null;
        while (z10) {
            int iL = aVarC.l(eVar);
            if (iL == -1) {
                z10 = false;
            } else if (iL == 0) {
                j0Var = (j0) aVarC.s(eVar, 0, h0.f16165a, j0Var);
                i10 |= 1;
            } else if (iL == 1) {
                a1Var = (a1) aVarC.v(eVar, 1, y0.f16228a, a1Var);
                i10 |= 2;
            } else {
                if (iL != 2) {
                    throw new UnknownFieldException(iL);
                }
                map = (Map) aVarC.v(eVar, 2, aVarArr[2], map);
                i10 |= 4;
            }
        }
        aVarC.a(eVar);
        return new f0(i10, j0Var, a1Var, map);
    }

    public final n40.e getDescriptor() {
        return descriptor;
    }

    public final void serialize(o40.d dVar, Object obj) {
        f0 f0Var = (f0) obj;
        kotlin.jvm.internal.m.e(dVar, "encoder");
        kotlin.jvm.internal.m.e(f0Var, "value");
        n40.e eVar = descriptor;
        o40.b bVarC = dVar.c(eVar);
        l40.a[] aVarArr = f0.f16149d;
        h0 h0Var = h0.f16165a;
        j0 j0Var = f0Var.f16150a;
        Map map = f0Var.f16152c;
        a1 a1Var = f0Var.f16151b;
        bVarC.C(eVar, 0, h0Var, j0Var);
        if (bVarC.k(eVar) || a1Var != null) {
            bVarC.x(eVar, 1, y0.f16228a, a1Var);
        }
        if (bVarC.k(eVar) || map != null) {
            bVarC.x(eVar, 2, aVarArr[2], map);
        }
        bVarC.a(eVar);
    }

    public final l40.a[] typeParametersSerializers() {
        return p40.o0.b;
    }
}
