package j60;

import a10.d;
import androidx.lifecycle.a1;
import androidx.lifecycle.c1;
import java.util.HashMap;
import kh.n;
import kotlin.jvm.internal.m;
import me.i;
import org.koin.core.error.ScopeAlreadyCreatedException;

public final class b implements c1 {
    public final d a;
    public final e60.a b;
    public final u00.a c;

    public b(d kClass, e60.a scope, u00.a aVar) {
        m.e(kClass, "kClass");
        m.e(scope, "scope");
        this.a = kClass;
        this.b = scope;
        this.c = aVar;
    }

    public final a1 b(d modelClass, t6.d dVar) throws ScopeAlreadyCreatedException {
        m.e(modelClass, "modelClass");
        a aVar = new a(this.c, dVar);
        s50.a aVar2 = this.b.e;
        i iVar = aVar2.e;
        m.e(iVar, "<this>");
        Object obj = ((HashMap) iVar.B).get(z50.a.A);
        if (obj == null) {
            obj = null;
        }
        if (!m.a(obj, Boolean.TRUE)) {
            e60.a aVar3 = this.b;
            d clazz = this.a;
            aVar3.getClass();
            m.e(clazz, "clazz");
            return (a1) aVar3.f(clazz, aVar, null);
        }
        String str = modelClass.n() + '-' + n.H();
        e60.a aVarB = aVar2.b(str, new b60.c(modelClass), null, k60.a.a);
        d clazz2 = this.a;
        m.e(clazz2, "clazz");
        a1 a1Var = (a1) aVarB.f(clazz2, aVar, null);
        c cVar = new c(str, aVar2);
        v6.b bVar = a1Var.b;
        if (bVar == null) {
            return a1Var;
        }
        if (bVar.d) {
            v6.b.a(cVar);
            return a1Var;
        }
        synchronized (bVar.a) {
            bVar.c.add(cVar);
        }
        return a1Var;
    }
}
