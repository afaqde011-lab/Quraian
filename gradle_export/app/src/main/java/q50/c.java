package q50;

import h.e;
import l1.g0;
import l1.j;
import l1.p0;
import l1.t;

public abstract class c {
    public static final t a;
    public static final t b;

    static {
        new p0(new e(29));
        new p0(new b(0));
        a = new t(new b(1));
        b = new t(new b(2));
    }

    public static final e60.a a(j jVar) {
        t tVar = a;
        try {
            g0 g0Var = (g0) jVar;
            e60.a aVar = (e60.a) ((a) g0Var.k(tVar)).a();
            if (!aVar.j) {
                return aVar;
            }
            a aVar2 = (a) g0Var.k(tVar);
            Object objInvoke = aVar2.a.invoke();
            aVar2.b = objInvoke;
            e60.a aVar3 = (e60.a) objInvoke;
            if (aVar3 != null) {
                return aVar3;
            }
            throw new IllegalStateException(("Can't get Koin scope. Scope '" + aVar + "' is closed").toString());
        } catch (Exception e) {
            a aVar4 = (a) ((g0) jVar).k(tVar);
            Object objInvoke2 = aVar4.a.invoke();
            aVar4.b = objInvoke2;
            e60.a aVar5 = (e60.a) objInvoke2;
            if (aVar5 != null) {
                return aVar5;
            }
            throw new IllegalStateException(("Can't get Koin scope due to error: " + e).toString());
        }
    }

    public static final s50.a b(j jVar) {
        t tVar = b;
        try {
            return (s50.a) ((a) ((g0) jVar).k(tVar)).a();
        } catch (Exception e) {
            a aVar = (a) ((g0) jVar).k(tVar);
            Object objInvoke = aVar.a.invoke();
            aVar.b = objInvoke;
            s50.a aVar2 = (s50.a) objInvoke;
            if (aVar2 != null) {
                return aVar2;
            }
            throw new IllegalStateException(("Can't get Koin context due to error: " + e).toString());
        }
    }
}
