package k10;

import e30.a0;
import e30.w;
import j10.n0;
import java.util.Map;

public final class c implements b {
    public final w a;
    public final Map b;
    public final n0 c;

    public c(a0 a0Var, Map map, n0 n0Var) {
        if (a0Var == null) {
            c(0);
            throw null;
        }
        if (map == null) {
            c(1);
            throw null;
        }
        this.a = a0Var;
        this.b = map;
        this.c = n0Var;
    }

    public static void c(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final n20.c a() {
        j10.e eVarD = u20.d.d(this);
        if (eVarD != null) {
            if (g30.l.f(eVarD)) {
                eVarD = null;
            }
            if (eVarD != null) {
                return u20.d.c(eVarD);
            }
        }
        return null;
    }

    @Override
    public final Map b() {
        Map map = this.b;
        if (map != null) {
            return map;
        }
        c(4);
        throw null;
    }

    @Override
    public final w getType() {
        w wVar = this.a;
        if (wVar != null) {
            return wVar;
        }
        c(3);
        throw null;
    }

    @Override
    public final n0 o() {
        n0 n0Var = this.c;
        if (n0Var != null) {
            return n0Var;
        }
        c(5);
        throw null;
    }

    public final String toString() {
        return p20.h.c.x(this, null);
    }
}
