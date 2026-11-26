package a30;

import j10.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import yh.w0;

public abstract class x implements l1.a {
    public final int A;
    public final Object B;
    public final Object C;
    public Object D;

    public x(Class cls, nh.f[] fVarArr) {
        this.A = 2;
        this.B = cls;
        HashMap map = new HashMap();
        for (nh.f fVar : fVarArr) {
            Class cls2 = fVar.a;
            if (map.containsKey(cls2)) {
                throw new IllegalArgumentException(a1.b.m(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            map.put(cls2, fVar);
        }
        if (fVarArr.length > 0) {
            this.D = fVarArr[0].a;
        } else {
            this.D = Void.class;
        }
        this.C = Collections.unmodifiableMap(map);
    }

    public x(Object obj) {
        this.A = 1;
        this.B = obj;
        this.C = new ArrayList();
        this.D = obj;
    }

    public x(k20.g gVar, h9.f fVar, n0 n0Var) {
        this.A = 0;
        this.B = gVar;
        this.C = fVar;
        this.D = n0Var;
    }

    public void a() {
        ((ArrayList) this.C).clear();
        this.D = this.B;
        r();
    }

    public abstract n20.c b();

    public int c() {
        return 1;
    }

    public void e(Object obj) {
        ((ArrayList) this.C).add(this.D);
        this.D = obj;
    }

    public abstract String i();

    public Object k(com.google.crypto.tink.shaded.protobuf.a aVar, Class cls) {
        nh.f fVar = (nh.f) ((Map) this.C).get(cls);
        if (fVar != null) {
            return fVar.a(aVar);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public void l() {
        this.D = l1.q.A((ArrayList) this.C);
    }

    public abstract f5.c m();

    public Object p() {
        return this.D;
    }

    public abstract w0 q();

    public abstract void r();

    public abstract com.google.crypto.tink.shaded.protobuf.a s(com.google.crypto.tink.shaded.protobuf.i iVar);

    public abstract void t(com.google.crypto.tink.shaded.protobuf.a aVar);

    public String toString() {
        switch (this.A) {
            case 0:
                return getClass().getSimpleName() + ": " + b();
            default:
                return super.toString();
        }
    }
}
