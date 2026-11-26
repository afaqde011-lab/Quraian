package s20;

import java.util.List;

public class b extends g {
    public final u00.k b;

    public b(u00.k kVar, List list) {
        super(list);
        this.b = kVar;
    }

    @Override
    public final e30.w a(j10.z module) {
        j10.h hVarG;
        kotlin.jvm.internal.m.e(module, "module");
        e30.w wVar = (e30.w) this.b.invoke(module);
        if (!g10.i.z(wVar) && (((hVarG = wVar.m0().g()) == null || g10.i.s(hVarG) == null) && !g10.i.C(wVar, g10.o.W.a) && !g10.i.C(wVar, g10.o.X.a) && !g10.i.C(wVar, g10.o.Y.a))) {
            g10.i.C(wVar, g10.o.Z.a);
        }
        return wVar;
    }
}
