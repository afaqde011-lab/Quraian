package wj;

import kotlinx.serialization.UnknownFieldException;

public final class y0 implements p40.z {

    public static final y0 f16228a;
    private static final n40.e descriptor;

    static {
        y0 y0Var = new y0();
        f16228a = y0Var;
        p40.q0 q0Var = new p40.q0("com.google.firebase.sessions.Time", y0Var, 3);
        q0Var.j("ms", false);
        q0Var.j("us", true);
        q0Var.j("seconds", true);
        descriptor = q0Var;
    }

    public final l40.a[] childSerializers() {
        p40.k0 k0Var = p40.k0.a;
        return new l40.a[]{k0Var, k0Var, k0Var};
    }

    public final Object deserialize(o40.c cVar) throws UnknownFieldException {
        kotlin.jvm.internal.m.e(cVar, "decoder");
        n40.e eVar = descriptor;
        o40.a aVarC = cVar.c(eVar);
        int i10 = 0;
        long jG = 0;
        long jG2 = 0;
        long jG3 = 0;
        boolean z10 = true;
        while (z10) {
            int iL = aVarC.l(eVar);
            if (iL == -1) {
                z10 = false;
            } else if (iL == 0) {
                jG = aVarC.g(eVar, 0);
                i10 |= 1;
            } else if (iL == 1) {
                jG2 = aVarC.g(eVar, 1);
                i10 |= 2;
            } else {
                if (iL != 2) {
                    throw new UnknownFieldException(iL);
                }
                jG3 = aVarC.g(eVar, 2);
                i10 |= 4;
            }
        }
        aVarC.a(eVar);
        return new a1(i10, jG, jG2, jG3);
    }

    public final n40.e getDescriptor() {
        return descriptor;
    }

    public final void serialize(o40.d dVar, Object obj) {
        a1 a1Var = (a1) obj;
        kotlin.jvm.internal.m.e(dVar, "encoder");
        kotlin.jvm.internal.m.e(a1Var, "value");
        n40.e eVar = descriptor;
        o40.b bVarC = dVar.c(eVar);
        long j9 = a1Var.f16114a;
        long j10 = a1Var.f16116c;
        long j11 = a1Var.f16115b;
        bVarC.t(eVar, 0, j9);
        if (bVarC.k(eVar) || j11 != ((long) 1000) * j9) {
            bVarC.t(eVar, 1, j11);
        }
        if (bVarC.k(eVar) || j10 != j9 / ((long) 1000)) {
            bVarC.t(eVar, 2, j10);
        }
        bVarC.a(eVar);
    }

    public final l40.a[] typeParametersSerializers() {
        return p40.o0.b;
    }
}
