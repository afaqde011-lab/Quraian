package wj;

import kotlinx.serialization.UnknownFieldException;

public final class h0 implements p40.z {

    public static final h0 f16165a;
    private static final n40.e descriptor;

    static {
        h0 h0Var = new h0();
        f16165a = h0Var;
        p40.q0 q0Var = new p40.q0("com.google.firebase.sessions.SessionDetails", h0Var, 4);
        q0Var.j("sessionId", false);
        q0Var.j("firstSessionId", false);
        q0Var.j("sessionIndex", false);
        q0Var.j("sessionStartTimestampUs", false);
        descriptor = q0Var;
    }

    public final l40.a[] childSerializers() {
        p40.b1 b1Var = p40.b1.a;
        return new l40.a[]{b1Var, b1Var, p40.e0.a, p40.k0.a};
    }

    public final Object deserialize(o40.c cVar) throws UnknownFieldException {
        kotlin.jvm.internal.m.e(cVar, "decoder");
        n40.e eVar = descriptor;
        o40.a aVarC = cVar.c(eVar);
        int i10 = 0;
        int iQ = 0;
        String strT = null;
        String strT2 = null;
        long jG = 0;
        boolean z10 = true;
        while (z10) {
            int iL = aVarC.l(eVar);
            if (iL == -1) {
                z10 = false;
            } else if (iL == 0) {
                strT = aVarC.t(eVar, 0);
                i10 |= 1;
            } else if (iL == 1) {
                strT2 = aVarC.t(eVar, 1);
                i10 |= 2;
            } else if (iL == 2) {
                iQ = aVarC.q(eVar, 2);
                i10 |= 4;
            } else {
                if (iL != 3) {
                    throw new UnknownFieldException(iL);
                }
                jG = aVarC.g(eVar, 3);
                i10 |= 8;
            }
        }
        aVarC.a(eVar);
        return new j0(i10, iQ, jG, strT, strT2);
    }

    public final n40.e getDescriptor() {
        return descriptor;
    }

    public final void serialize(o40.d dVar, Object obj) {
        j0 j0Var = (j0) obj;
        kotlin.jvm.internal.m.e(dVar, "encoder");
        kotlin.jvm.internal.m.e(j0Var, "value");
        n40.e eVar = descriptor;
        o40.b bVarC = dVar.c(eVar);
        bVarC.i(eVar, 0, j0Var.f16180a);
        bVarC.i(eVar, 1, j0Var.f16181b);
        bVarC.w(2, j0Var.f16182c, eVar);
        bVarC.t(eVar, 3, j0Var.f16183d);
        bVarC.a(eVar);
    }

    public final l40.a[] typeParametersSerializers() {
        return p40.o0.b;
    }
}
