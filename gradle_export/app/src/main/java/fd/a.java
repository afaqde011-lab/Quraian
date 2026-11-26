package fd;

import hb.f;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import rc.g;

public final class a extends n implements u00.a {
    public final int A;
    public final rc.c B;

    public a(rc.c cVar, int i10) {
        super(0);
        this.A = i10;
        this.B = cVar;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                rc.c cVar = this.B;
                return cVar.f13151a.f13178g.M(cVar);
            case 1:
                rc.c cVar2 = this.B;
                g gVar = cVar2.f13151a;
                String str = gVar.f13172a;
                b bVar = gVar.f13180i;
                d dVarG = cVar2.g();
                m.e(cVar2.f(), "logger");
                cd.b bVarF = cVar2.f();
                m.e(str, "apiKey");
                m.e(bVar, "serverZone");
                m.e(dVarG, "storage");
                m.e(bVarF, "logger");
                f fVar = new f();
                new ConcurrentHashMap();
                return fVar;
            default:
                rc.c cVar3 = this.B;
                return cVar3.f13151a.f13177f.a(cVar3);
        }
    }
}
