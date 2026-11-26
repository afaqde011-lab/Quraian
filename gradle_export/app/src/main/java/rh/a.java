package rh;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import mh.m;
import nh.f;
import nh.h;
import yh.f0;
import yh.r1;

public abstract class a {

    public static final int f13229a = 0;

    static {
        f[] fVarArr = {new f(9, mh.c.class)};
        HashMap map = new HashMap();
        f fVar = fVarArr[0];
        Class cls = fVar.f11318a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(a1.b.m(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map.put(cls, fVar);
        Class cls2 = fVarArr[0].f11318a;
        Collections.unmodifiableMap(map);
        int i10 = r1.CONFIG_NAME_FIELD_NUMBER;
        try {
            m.h(c.f13234b);
            if (qh.a.a()) {
                return;
            }
            m.f(new h(f0.class, new f[]{new f(9, mh.c.class)}, 8), true);
        } catch (GeneralSecurityException e3) {
            throw new ExceptionInInitializerError(e3);
        }
    }
}
