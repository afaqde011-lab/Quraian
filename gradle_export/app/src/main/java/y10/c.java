package y10;

import g00.k;
import g10.o;
import h00.d0;
import kh.n;
import kotlin.jvm.internal.m;
import oj.q;
import x10.v;

public abstract class c {
    public static final n20.e a = n20.e.e("message");
    public static final n20.e b = n20.e.e("allowedTargets");
    public static final n20.e c = n20.e.e("value");
    public static final Object d = d0.R(new k(o.t, v.c), new k(o.w, v.d), new k(o.x, v.f));

    public static z10.g a(n20.c kotlinName, e20.b annotationOwner, q c2) {
        p10.e eVarA;
        m.e(kotlinName, "kotlinName");
        m.e(annotationOwner, "annotationOwner");
        m.e(c2, "c");
        if (kotlinName.equals(o.m)) {
            n20.c DEPRECATED_ANNOTATION = v.e;
            m.d(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            p10.e eVarA2 = annotationOwner.a(DEPRECATED_ANNOTATION);
            if (eVarA2 != null) {
                return new g(eVarA2, c2);
            }
        }
        n20.c cVar = (n20.c) d.get(kotlinName);
        if (cVar == null || (eVarA = annotationOwner.a(cVar)) == null) {
            return null;
        }
        return b(c2, eVarA, false);
    }

    public static z10.g b(q c2, p10.e annotation, boolean z) {
        m.e(annotation, "annotation");
        m.e(c2, "c");
        n20.b bVarA = p10.d.a(k00.f.D(k00.f.z(annotation.a)));
        n20.c TARGET_ANNOTATION = v.c;
        m.d(TARGET_ANNOTATION, "TARGET_ANNOTATION");
        if (bVarA.equals(n.n0(TARGET_ANNOTATION))) {
            return new j(annotation, c2);
        }
        n20.c RETENTION_ANNOTATION = v.d;
        m.d(RETENTION_ANNOTATION, "RETENTION_ANNOTATION");
        if (bVarA.equals(n.n0(RETENTION_ANNOTATION))) {
            return new i(annotation, c2);
        }
        n20.c DOCUMENTED_ANNOTATION = v.f;
        m.d(DOCUMENTED_ANNOTATION, "DOCUMENTED_ANNOTATION");
        if (bVarA.equals(n.n0(DOCUMENTED_ANNOTATION))) {
            return new b(c2, annotation, o.x);
        }
        n20.c DEPRECATED_ANNOTATION = v.e;
        m.d(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
        if (bVarA.equals(n.n0(DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new b20.f(c2, annotation, z);
    }
}
