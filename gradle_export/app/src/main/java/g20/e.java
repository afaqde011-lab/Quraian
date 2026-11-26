package g20;

import c30.x;
import i20.f0;
import j10.e0;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class e {
    public static final Set b = w50.c.g0(h20.a.CLASS);
    public static final Set c = h00.n.X0(new h20.a[]{h20.a.FILE_FACADE, h20.a.MULTIFILE_CLASS_PART});
    public static final k20.f d;
    public static final k20.f e;
    public a30.i a;

    static {
        new k20.f(new int[]{1, 1, 2}, false);
        d = new k20.f(new int[]{1, 1, 11}, false);
        e = new k20.f(new int[]{1, 1, 13}, false);
    }

    public final c30.r a(e0 e0Var, o10.c kotlinClass) {
        g00.k kVarI;
        kotlin.jvm.internal.m.e(kotlinClass, "kotlinClass");
        d50.g gVar = kotlinClass.b;
        String[] strArr = (String[]) gVar.e;
        if (strArr == null) {
            strArr = (String[]) gVar.f;
        }
        if (strArr != null) {
            if (!c.contains((h20.a) gVar.c)) {
                strArr = null;
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            k20.f fVar = (k20.f) gVar.d;
            String[] strArr2 = (String[]) gVar.g;
            if (strArr2 != null) {
                try {
                    try {
                        kVarI = m20.g.i(strArr, strArr2);
                    } catch (InvalidProtocolBufferException e2) {
                        throw new IllegalStateException("Could not read data from " + kotlinClass.a(), e2);
                    }
                } catch (Throwable th) {
                    c().c.getClass();
                    if (fVar.b(e())) {
                        throw th;
                    }
                    kVarI = null;
                }
                if (kVarI != null) {
                    m20.f fVar2 = (m20.f) kVarI.A;
                    f0 f0Var = (f0) kVarI.B;
                    d(kotlinClass);
                    g gVar2 = new g(kotlinClass, f0Var, fVar2, f(kotlinClass), b(kotlinClass));
                    return new c30.r(e0Var, f0Var, fVar2, fVar, gVar2, c(), "scope for " + gVar2 + " in " + e0Var, d.A);
                }
            }
        }
        return null;
    }

    public final c30.j b(o10.c cVar) {
        c().c.getClass();
        int i = cVar.b.b;
        return ((i & 16) == 0 || (i & 32) != 0) ? c30.j.A : c30.j.B;
    }

    public final a30.i c() {
        a30.i iVar = this.a;
        if (iVar != null) {
            return iVar;
        }
        kotlin.jvm.internal.m.k("components");
        throw null;
    }

    public final a30.p d(o10.c cVar) {
        c().c.getClass();
        if (((k20.f) cVar.b.d).b(e())) {
            return null;
        }
        k20.f fVar = (k20.f) cVar.b.d;
        k20.f fVar2 = k20.f.g;
        k20.f fVarE = e();
        k20.f fVarE2 = e();
        boolean z = fVar.f;
        fVarE2.getClass();
        k20.f fVar3 = z ? fVar2 : k20.f.h;
        int i = fVar3.b;
        int i2 = fVarE2.b;
        if (i <= i2 && (i < i2 || fVar3.c <= fVarE2.c)) {
            fVar3 = fVarE2;
        }
        return new a30.p(fVar, fVar2, fVarE, fVar3, cVar.a());
    }

    public final k20.f e() {
        c().c.getClass();
        return k20.f.g;
    }

    public final boolean f(o10.c cVar) {
        c().c.getClass();
        c().c.getClass();
        d50.g gVar = cVar.b;
        return (gVar.b & 2) != 0 && ((k20.f) gVar.d).equals(d);
    }

    public final a30.d g(o10.c cVar) {
        g00.k kVarF;
        d50.g gVar = cVar.b;
        String[] strArr = (String[]) gVar.e;
        if (strArr == null) {
            strArr = (String[]) gVar.f;
        }
        if (strArr != null) {
            if (!b.contains((h20.a) gVar.c)) {
                strArr = null;
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            k20.f fVar = (k20.f) gVar.d;
            String[] strArr2 = (String[]) gVar.g;
            try {
                if (strArr2 != null) {
                    try {
                        kVarF = m20.g.f(strArr, strArr2);
                        if (kVarF != null) {
                            m20.f fVar2 = (m20.f) kVarF.A;
                            i20.k kVar = (i20.k) kVarF.B;
                            d(cVar);
                            return new a30.d(fVar2, kVar, fVar, new o(cVar, new x(f(cVar)), b(cVar)));
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        throw new IllegalStateException("Could not read data from " + cVar.a(), e2);
                    }
                }
            } catch (Throwable th) {
                c().c.getClass();
                if (fVar.b(e())) {
                    throw th;
                }
                kVarF = null;
            }
        }
        return null;
    }
}
