package la;

import java.util.Collections;
import java.util.HashMap;
import mh.f;
import yh.y;
import yh.z;

public final class c {
    public static final c B;
    public static final c[] C;
    public final f A;

    static {
        y yVarX = z.x();
        yVarX.d();
        z.v((z) yVarX.B, 32);
        z zVar = (z) yVarX.a();
        nh.f[] fVarArr = {new nh.f(3, mh.a.class)};
        HashMap map = new HashMap();
        nh.f fVar = fVarArr[0];
        Class cls = fVar.f11318a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(a1.b.m(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map.put(cls, fVar);
        Class cls2 = fVarArr[0].f11318a;
        Collections.unmodifiableMap(map);
        c cVar = new c(f.b("type.googleapis.com/google.crypto.tink.AesGcmKey", zVar.d(), 1));
        B = cVar;
        C = new c[]{cVar};
    }

    public c(f fVar) {
        super("AES256_GCM", 0);
        this.A = fVar;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) C.clone();
    }
}
