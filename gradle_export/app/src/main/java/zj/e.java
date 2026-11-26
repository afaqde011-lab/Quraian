package zj;

import kotlinx.serialization.UnknownFieldException;
import p40.e0;
import p40.k0;
import p40.o0;
import p40.q;
import p40.q0;
import p40.z;
import ta.c0;

public final class e implements z {

    public static final e f17514a;
    private static final n40.e descriptor;

    static {
        e eVar = new e();
        f17514a = eVar;
        q0 q0Var = new q0("com.google.firebase.sessions.settings.SessionConfigs", eVar, 5);
        q0Var.j("sessionsEnabled", false);
        q0Var.j("sessionSamplingRate", false);
        q0Var.j("sessionTimeoutSeconds", false);
        q0Var.j("cacheDurationSeconds", false);
        q0Var.j("cacheUpdatedTimeSeconds", false);
        descriptor = q0Var;
    }

    public final l40.a[] childSerializers() {
        l40.a aVarG = c0.G(p40.f.a);
        l40.a aVarG2 = c0.G(q.a);
        e0 e0Var = e0.a;
        return new l40.a[]{aVarG, aVarG2, c0.G(e0Var), c0.G(e0Var), c0.G(k0.a)};
    }

    public final Object deserialize(o40.c cVar) throws UnknownFieldException {
        kotlin.jvm.internal.m.e(cVar, "decoder");
        n40.e eVar = descriptor;
        o40.a aVarC = cVar.c(eVar);
        int i10 = 0;
        Boolean bool = null;
        Double d3 = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        boolean z10 = true;
        while (z10) {
            int iL = aVarC.l(eVar);
            if (iL == -1) {
                z10 = false;
            } else if (iL == 0) {
                bool = (Boolean) aVarC.v(eVar, 0, p40.f.a, bool);
                i10 |= 1;
            } else if (iL == 1) {
                d3 = (Double) aVarC.v(eVar, 1, q.a, d3);
                i10 |= 2;
            } else if (iL == 2) {
                num = (Integer) aVarC.v(eVar, 2, e0.a, num);
                i10 |= 4;
            } else if (iL == 3) {
                num2 = (Integer) aVarC.v(eVar, 3, e0.a, num2);
                i10 |= 8;
            } else {
                if (iL != 4) {
                    throw new UnknownFieldException(iL);
                }
                l = (Long) aVarC.v(eVar, 4, k0.a, l);
                i10 |= 16;
            }
        }
        aVarC.a(eVar);
        return new g(i10, bool, d3, num, num2, l);
    }

    public final n40.e getDescriptor() {
        return descriptor;
    }

    public final void serialize(o40.d dVar, Object obj) {
        g gVar = (g) obj;
        kotlin.jvm.internal.m.e(dVar, "encoder");
        kotlin.jvm.internal.m.e(gVar, "value");
        n40.e eVar = descriptor;
        o40.b bVarC = dVar.c(eVar);
        bVarC.x(eVar, 0, p40.f.a, gVar.f17515a);
        bVarC.x(eVar, 1, q.a, gVar.f17516b);
        e0 e0Var = e0.a;
        bVarC.x(eVar, 2, e0Var, gVar.f17517c);
        bVarC.x(eVar, 3, e0Var, gVar.f17518d);
        bVarC.x(eVar, 4, k0.a, gVar.f17519e);
        bVarC.a(eVar);
    }

    public final l40.a[] typeParametersSerializers() {
        return o0.b;
    }
}
