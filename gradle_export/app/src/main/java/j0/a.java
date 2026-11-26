package j0;

import d0.q1;
import java.util.List;

public final class a {

    public int f7740a;

    public boolean f7741b;

    public int f7742c;

    public float f7743d;

    public Object f7744e;

    public static int a(k0.p pVar, boolean z10) {
        return z10 ? ((k0.q) h00.q.T0((List) pVar.m)).f8508a + 1 : ((k0.q) h00.q.L0((List) pVar.m)).f8508a - 1;
    }

    public static int b(n nVar, boolean z10) {
        return z10 ? ((o) h00.q.T0((List) nVar.f7781k)).f7786a + 1 : ((o) h00.q.L0((List) nVar.f7781k)).f7786a - 1;
    }

    public static int c(k0.p pVar, boolean z10) {
        if (z10) {
            k0.q qVar = (k0.q) h00.q.T0((List) pVar.m);
            return (pVar.f8505q == q1.A ? qVar.f8526u : qVar.f8527v) + 1;
        }
        k0.q qVar2 = (k0.q) h00.q.L0((List) pVar.m);
        return (pVar.f8505q == q1.A ? qVar2.f8526u : qVar2.f8527v) - 1;
    }
}
