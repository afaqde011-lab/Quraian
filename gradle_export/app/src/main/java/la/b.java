package la;

import java.util.Collections;
import java.util.HashMap;
import mh.f;
import yh.g0;
import yh.h0;

public final class b {
    public static final b B;
    public static final b[] C;
    public final f A;

    static {
        g0 g0VarX = h0.x();
        g0VarX.d();
        h0.v((h0) g0VarX.B);
        h0 h0Var = (h0) g0VarX.a();
        nh.f[] fVarArr = {new nh.f(9, mh.c.class)};
        HashMap map = new HashMap();
        nh.f fVar = fVarArr[0];
        Class cls = fVar.f11318a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(a1.b.m(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map.put(cls, fVar);
        Class cls2 = fVarArr[0].f11318a;
        Collections.unmodifiableMap(map);
        b bVar = new b(f.b("type.googleapis.com/google.crypto.tink.AesSivKey", h0Var.d(), 1));
        B = bVar;
        C = new b[]{bVar};
    }

    public b(f fVar) {
        super("AES256_SIV", 0);
        this.A = fVar;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) C.clone();
    }
}
