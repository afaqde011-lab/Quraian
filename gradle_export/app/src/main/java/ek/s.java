package ek;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public abstract class s extends bk.a0 {

    public final u f5453a;

    public s(u uVar) {
        this.f5453a = uVar;
    }

    @Override
    public final Object b(ik.a aVar) throws IOException {
        if (aVar.t0() == 9) {
            aVar.p0();
            return null;
        }
        Object objD = d();
        Map map = this.f5453a.f5456a;
        try {
            aVar.i();
            while (aVar.G()) {
                r rVar = (r) map.get(aVar.n0());
                if (rVar == null) {
                    aVar.z0();
                } else {
                    f(objD, aVar, rVar);
                }
            }
            aVar.x();
            return e(objD);
        } catch (IllegalAccessException e3) {
            k00.f fVar = gk.c.f6361a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
        } catch (IllegalStateException e10) {
            throw new JsonSyntaxException(e10);
        }
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.G();
            return;
        }
        bVar.l();
        try {
            Iterator it = this.f5453a.f5457b.iterator();
            while (it.hasNext()) {
                ((r) it.next()).a(bVar, obj);
            }
            bVar.x();
        } catch (IllegalAccessException e3) {
            k00.f fVar = gk.c.f6361a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, ik.a aVar, r rVar);
}
