package ek;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

public final class c extends bk.a0 {

    public final int f5400a = 0;

    public final Object f5401b;

    public final Object f5402c;

    public c(n nVar, dk.o oVar) {
        this.f5401b = nVar;
        this.f5402c = oVar;
    }

    public c(t0 t0Var, Class cls) {
        this.f5402c = t0Var;
        this.f5401b = cls;
    }

    @Override
    public final Object b(ik.a aVar) throws IOException {
        switch (this.f5400a) {
            case 0:
                if (aVar.t0() == 9) {
                    aVar.p0();
                    return null;
                }
                Collection collection = (Collection) ((dk.o) this.f5402c).j();
                aVar.a();
                while (aVar.G()) {
                    collection.add(((n) this.f5401b).f5438c.b(aVar));
                }
                aVar.v();
                return collection;
            default:
                Class cls = (Class) this.f5401b;
                Object objB = ((t0) this.f5402c).C.b(aVar);
                if (objB == null || cls.isInstance(objB)) {
                    return objB;
                }
                throw new JsonSyntaxException("Expected a " + cls.getName() + " but was " + objB.getClass().getName() + "; at path " + aVar.F(true));
        }
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        switch (this.f5400a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    bVar.i();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((n) this.f5401b).c(bVar, it.next());
                    }
                    bVar.v();
                } else {
                    bVar.G();
                }
                break;
            default:
                ((t0) this.f5402c).C.c(bVar, obj);
                break;
        }
    }
}
