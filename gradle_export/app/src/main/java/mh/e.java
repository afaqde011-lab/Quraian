package mh;

import a30.x;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

public final class e {

    public static final Logger f10905b = Logger.getLogger(e.class.getName());

    public final ConcurrentHashMap f10906a;

    public e() {
        this.f10906a = new ConcurrentHashMap();
    }

    public e(e eVar) {
        this.f10906a = new ConcurrentHashMap(eVar.f10906a);
    }

    public final synchronized d a(String str) {
        if (!this.f10906a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (d) this.f10906a.get(str);
    }

    public final synchronized void b(x xVar) {
        int iC = xVar.c();
        if (!(iC != 1 ? oi.k.b(iC) : oi.k.a(iC))) {
            throw new GeneralSecurityException("failed to register key manager " + xVar.getClass() + " as it is not FIPS compatible.");
        }
        c(new d(xVar));
    }

    public final synchronized void c(d dVar) {
        try {
            x xVar = dVar.f10904a;
            Class cls = (Class) xVar.D;
            if (!((Map) xVar.C).keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + xVar.toString() + " does not support primitive class " + cls.getName());
            }
            String strI = xVar.i();
            d dVar2 = (d) this.f10906a.get(strI);
            if (dVar2 != null && !dVar2.f10904a.getClass().equals(dVar.f10904a.getClass())) {
                f10905b.warning("Attempted overwrite of a registered key manager for key type ".concat(strI));
                throw new GeneralSecurityException("typeUrl (" + strI + ") is already registered with " + dVar2.f10904a.getClass().getName() + ", cannot be re-registered with " + dVar.f10904a.getClass().getName());
            }
            this.f10906a.putIfAbsent(strI, dVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
