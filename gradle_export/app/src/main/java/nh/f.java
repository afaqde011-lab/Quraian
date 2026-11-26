package nh;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import sd.p1;
import yh.b0;
import yh.f0;
import yh.j0;
import yh.l1;
import yh.o0;
import yh.o1;
import yh.q0;
import yh.t1;

public final class f {

    public final Class f11318a;

    public final int f11319b;

    public f(int i10, Class cls) {
        this.f11319b = i10;
        this.f11318a = cls;
    }

    public final Object a(com.google.crypto.tink.shaded.protobuf.a aVar) throws GeneralSecurityException {
        switch (this.f11319b) {
            case 0:
                yh.h hVar = (yh.h) aVar;
                f[] fVarArr = {new f(1, zh.q.class)};
                HashMap map = new HashMap();
                for (f fVar : fVarArr) {
                    Class cls = fVar.f11318a;
                    if (map.containsKey(cls)) {
                        throw new IllegalArgumentException(a1.b.m(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map.put(cls, fVar);
                }
                if (fVarArr.length > 0) {
                    Class cls2 = fVarArr[0].f11318a;
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                yh.l lVarY = hVar.y();
                f fVar2 = (f) mapUnmodifiableMap.get(zh.q.class);
                if (fVar2 == null) {
                    throw new IllegalArgumentException("Requested primitive class " + zh.q.class.getCanonicalName() + " not supported.");
                }
                zh.q qVar = (zh.q) fVar2.a(lVarY);
                f[] fVarArr2 = {new f(11, mh.i.class)};
                HashMap map2 = new HashMap();
                for (f fVar3 : fVarArr2) {
                    Class cls3 = fVar3.f11318a;
                    if (map2.containsKey(cls3)) {
                        throw new IllegalArgumentException(a1.b.m(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map2.put(cls3, fVar3);
                }
                if (fVarArr2.length > 0) {
                    Class cls4 = fVarArr2[0].f11318a;
                }
                Map mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
                q0 q0VarZ = hVar.z();
                f fVar4 = (f) mapUnmodifiableMap2.get(mh.i.class);
                if (fVar4 != null) {
                    return new zh.l(qVar, (mh.i) fVar4.a(q0VarZ), hVar.z().A().z());
                }
                throw new IllegalArgumentException("Requested primitive class " + mh.i.class.getCanonicalName() + " not supported.");
            case 1:
                yh.l lVar = (yh.l) aVar;
                return new zh.a(lVar.A().x(), lVar.z().h());
            case 2:
                yh.r rVar = (yh.r) aVar;
                return new zh.b(rVar.z().x(), rVar.y().h());
            case 3:
                return new zh.c(0, ((yh.x) aVar).x().h());
            case 4:
                return new ph.a(((b0) aVar).x().h());
            case 5:
                return new zh.c(1, ((j0) aVar).x().h());
            case 6:
                String strW = ((l1) aVar).x().w();
                return mh.h.a(strW).c(strW);
            case 7:
                o1 o1Var = (o1) aVar;
                String strX = o1Var.x().x();
                return new v(o1Var.x().w(), mh.h.a(strX).c(strX));
            case 8:
                return new zh.c(2, ((t1) aVar).x().h());
            case 9:
                return new zh.d(((f0) aVar).x().h());
            case 10:
                yh.b bVar = (yh.b) aVar;
                return new zh.s(new p1(bVar.y().h()), bVar.z().x());
            default:
                q0 q0Var = (q0) aVar;
                o0 o0VarY = q0Var.A().y();
                SecretKeySpec secretKeySpec = new SecretKeySpec(q0Var.z().h(), "HMAC");
                int iZ = q0Var.A().z();
                int iOrdinal = o0VarY.ordinal();
                if (iOrdinal == 1) {
                    return new zh.s(new oe.o("HMACSHA1", secretKeySpec), iZ);
                }
                if (iOrdinal == 2) {
                    return new zh.s(new oe.o("HMACSHA384", secretKeySpec), iZ);
                }
                if (iOrdinal == 3) {
                    return new zh.s(new oe.o("HMACSHA256", secretKeySpec), iZ);
                }
                if (iOrdinal == 4) {
                    return new zh.s(new oe.o("HMACSHA512", secretKeySpec), iZ);
                }
                if (iOrdinal == 5) {
                    return new zh.s(new oe.o("HMACSHA224", secretKeySpec), iZ);
                }
                throw new GeneralSecurityException("unknown hash");
        }
    }
}
