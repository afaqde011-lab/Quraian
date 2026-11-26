package w50;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m;
import org.koin.core.error.MissingScopeValueException;
import sd.y1;

public final class d extends b {
    public final boolean b;
    public final ConcurrentHashMap c;

    public d(v50.a aVar) {
        super(aVar);
        this.b = true;
        this.c = new ConcurrentHashMap();
    }

    @Override
    public final Object b(y1 y1Var) {
        Object objA;
        if (!m.a(((e60.a) y1Var.b).a, this.a.a) && !m.a((b60.c) y1Var.f, this.a.a)) {
            throw new IllegalStateException(("Wrong Scope qualifier: trying to open instance for " + ((e60.a) y1Var.b).b + " in " + this.a).toString());
        }
        Object obj = this.c.get(((e60.a) y1Var.b).b);
        if (obj != null) {
            return obj;
        }
        synchronized (this) {
            ConcurrentHashMap concurrentHashMap = this.c;
            boolean z = this.b;
            e60.a aVar = (e60.a) y1Var.b;
            String str = aVar.b;
            String str2 = aVar.b;
            objA = concurrentHashMap.get(str);
            if (objA == null) {
                if (!z) {
                    String msg = "No value for scope '" + str2 + "' in " + this.a;
                    m.e(msg, "msg");
                    throw new MissingScopeValueException(msg);
                }
                objA = a(y1Var);
                if (z) {
                    this.c.put(str2, objA);
                }
            }
        }
        return objA;
    }
}
