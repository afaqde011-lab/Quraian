package g10;

import e30.a1;
import j10.z;
import m10.a0;
import m10.w;

public final class g implements u00.k {
    public final int A;
    public final i B;

    public g(i iVar, int i) {
        this.A = i;
        this.B = iVar;
    }

    @Override
    public final Object invoke(Object obj) {
        int i = this.A;
        i iVar = this.B;
        switch (i) {
            case 0:
                n20.e eVar = (n20.e) obj;
                a0 a0VarL = iVar.l();
                n20.c cVar = p.l;
                x20.j jVar = ((w) a0VarL.f0(cVar)).H;
                if (jVar == null) {
                    i.a(11);
                    throw null;
                }
                j10.h hVarG = jVar.g(eVar, r10.c.A);
                if (hVarG == null) {
                    throw new AssertionError("Built-in class " + cVar.a(eVar) + " is not found");
                }
                if (hVarG instanceof j10.e) {
                    return (j10.e) hVarG;
                }
                throw new AssertionError("Must be a class descriptor " + eVar + ", but was " + hVarG);
            default:
                z module = (z) obj;
                kotlin.jvm.internal.m.e(module, "module");
                i iVarD = module.d();
                a1 a1Var = a1.C;
                return iVarD.h(iVar.v());
        }
    }
}
