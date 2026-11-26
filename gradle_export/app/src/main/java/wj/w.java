package wj;

import kotlinx.serialization.UnknownFieldException;

public final class w implements p40.z {

    public static final w f16215a;
    private static final n40.e descriptor;

    static {
        w wVar = new w();
        f16215a = wVar;
        p40.q0 q0Var = new p40.q0("com.google.firebase.sessions.ProcessData", wVar, 2);
        q0Var.j("pid", false);
        q0Var.j("uuid", false);
        descriptor = q0Var;
    }

    public final l40.a[] childSerializers() {
        return new l40.a[]{p40.e0.a, p40.b1.a};
    }

    public final Object deserialize(o40.c cVar) throws UnknownFieldException {
        kotlin.jvm.internal.m.e(cVar, "decoder");
        n40.e eVar = descriptor;
        o40.a aVarC = cVar.c(eVar);
        String strT = null;
        boolean z10 = true;
        int i10 = 0;
        int iQ = 0;
        while (z10) {
            int iL = aVarC.l(eVar);
            if (iL == -1) {
                z10 = false;
            } else if (iL == 0) {
                iQ = aVarC.q(eVar, 0);
                i10 |= 1;
            } else {
                if (iL != 1) {
                    throw new UnknownFieldException(iL);
                }
                strT = aVarC.t(eVar, 1);
                i10 |= 2;
            }
        }
        aVarC.a(eVar);
        return new y(i10, strT, iQ);
    }

    public final n40.e getDescriptor() {
        return descriptor;
    }

    public final void serialize(o40.d dVar, Object obj) {
        y yVar = (y) obj;
        kotlin.jvm.internal.m.e(dVar, "encoder");
        kotlin.jvm.internal.m.e(yVar, "value");
        n40.e eVar = descriptor;
        o40.b bVarC = dVar.c(eVar);
        bVarC.w(0, yVar.f16226a, eVar);
        bVarC.i(eVar, 1, yVar.f16227b);
        bVarC.a(eVar);
    }

    public final l40.a[] typeParametersSerializers() {
        return p40.o0.b;
    }
}
