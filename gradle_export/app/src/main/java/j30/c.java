package j30;

import e30.a1;
import e30.f0;
import e30.m0;
import e30.n0;
import e30.p0;
import kotlin.jvm.internal.m;

public final class c extends n0 {
    @Override
    public final p0 g(m0 key) {
        m.e(key, "key");
        r20.b bVar = key instanceof r20.b ? (r20.b) key : null;
        if (bVar == null) {
            return null;
        }
        if (bVar.t().c()) {
            return new f0(bVar.t().b(), a1.E);
        }
        return bVar.t();
    }
}
