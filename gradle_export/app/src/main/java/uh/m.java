package uh;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import yh.r1;

public abstract class m {
    static {
        nh.f[] fVarArr = {new nh.f(11, mh.i.class)};
        HashMap map = new HashMap();
        nh.f fVar = fVarArr[0];
        Class cls = fVar.f11318a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(a1.b.m(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map.put(cls, fVar);
        Class cls2 = fVarArr[0].f11318a;
        Collections.unmodifiableMap(map);
        int i10 = r1.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e3) {
            throw new ExceptionInInitializerError(e3);
        }
    }

    public static void a() {
        mh.m.h(p.f15294c);
        mh.m.h(h.f15278a);
        mh.m.f(new b(), true);
        th.k kVar = l.f15285a;
        th.i iVar = th.i.f14800b;
        iVar.e(l.f15285a);
        iVar.d(l.f15286b);
        iVar.c(l.f15287c);
        iVar.b(l.f15288d);
        th.h hVar = th.h.f14798b;
        hVar.b(b.G);
        if (qh.a.a()) {
            return;
        }
        mh.m.f(new b(yh.b.class, new nh.f[]{new nh.f(10, mh.i.class)}), true);
        iVar.e(e.f15274a);
        iVar.d(e.f15275b);
        iVar.c(e.f15276c);
        iVar.b(e.f15277d);
        hVar.b(b.F);
    }
}
