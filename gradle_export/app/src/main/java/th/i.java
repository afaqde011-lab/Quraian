package th;

import com.google.crypto.tink.internal.TinkBugException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import yh.w0;

public final class i {

    public static final i f14800b = new i();

    public final AtomicReference f14801a = new AtomicReference(new s(new p10.a(11)));

    public final mh.b a(o oVar) {
        AtomicReference atomicReference = this.f14801a;
        s sVar = (s) atomicReference.get();
        sVar.getClass();
        ai.a aVar = (ai.a) oVar.C;
        if (!sVar.f14816b.containsKey(new q(o.class, aVar))) {
            try {
                e eVar = new e();
                ((w0) oVar.E).ordinal();
                return eVar;
            } catch (GeneralSecurityException e3) {
                throw new TinkBugException("Creating a LegacyProtoKey failed", e3);
            }
        }
        s sVar2 = (s) atomicReference.get();
        sVar2.getClass();
        q qVar = new q(o.class, aVar);
        HashMap map = sVar2.f14816b;
        if (map.containsKey(qVar)) {
            return ((a) map.get(qVar)).f14791b.a(oVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + qVar + " available");
    }

    public final synchronized void b(a aVar) {
        p10.a aVar2 = new p10.a((s) this.f14801a.get());
        aVar2.u(aVar);
        this.f14801a.set(new s(aVar2));
    }

    public final synchronized void c(c cVar) {
        p10.a aVar = new p10.a((s) this.f14801a.get());
        aVar.w(cVar);
        this.f14801a.set(new s(aVar));
    }

    public final synchronized void d(j jVar) {
        p10.a aVar = new p10.a((s) this.f14801a.get());
        aVar.x(jVar);
        this.f14801a.set(new s(aVar));
    }

    public final synchronized void e(k kVar) {
        p10.a aVar = new p10.a((s) this.f14801a.get());
        aVar.y(kVar);
        this.f14801a.set(new s(aVar));
    }
}
