package s20;

import e30.a0;

public final class i extends g {
    public final n20.b b;
    public final n20.e c;

    public i(n20.b bVar, n20.e eVar) {
        super(new g00.k(bVar, eVar));
        this.b = bVar;
        this.c = eVar;
    }

    @Override
    public final e30.w a(j10.z module) {
        a0 a0VarN;
        kotlin.jvm.internal.m.e(module, "module");
        n20.b bVar = this.b;
        j10.e eVarD = j10.w.d(module, bVar);
        if (eVarD != null) {
            int i = q20.d.a;
            if (!q20.d.l(eVarD, j10.f.C)) {
                eVarD = null;
            }
            if (eVarD != null && (a0VarN = eVarD.n()) != null) {
                return a0VarN;
            }
        }
        g30.k kVar = g30.k.a0;
        String string = bVar.toString();
        String str = this.c.A;
        kotlin.jvm.internal.m.d(str, "toString(...)");
        return g30.l.c(kVar, string, str);
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.f());
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
