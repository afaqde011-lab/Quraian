package ek;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public final class b extends bk.a0 {

    public static final a f5397c = new a();

    public final Class f5398a;

    public final n f5399b;

    public b(bk.m mVar, bk.a0 a0Var, Class cls) {
        this.f5399b = new n(mVar, a0Var, cls);
        this.f5398a = cls;
    }

    @Override
    public final Object b(ik.a aVar) throws IOException {
        if (aVar.t0() == 9) {
            aVar.p0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.G()) {
            arrayList.add(this.f5399b.f5438c.b(aVar));
        }
        aVar.v();
        int size = arrayList.size();
        Class cls = this.f5398a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.G();
            return;
        }
        bVar.i();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f5399b.c(bVar, Array.get(obj, i10));
        }
        bVar.v();
    }
}
