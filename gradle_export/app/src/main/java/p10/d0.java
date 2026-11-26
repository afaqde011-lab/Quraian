package p10;

import java.lang.annotation.Annotation;
import java.util.Collection;

public final class d0 extends s implements e20.b {
    public final b0 a;
    public final Annotation[] b;
    public final String c;
    public final boolean d;

    public d0(b0 b0Var, Annotation[] reflectAnnotations, String str, boolean z) {
        kotlin.jvm.internal.m.e(reflectAnnotations, "reflectAnnotations");
        this.a = b0Var;
        this.b = reflectAnnotations;
        this.c = str;
        this.d = z;
    }

    @Override
    public final e a(n20.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        return rd.a.B(this.b, fqName);
    }

    @Override
    public final Collection getAnnotations() {
        return rd.a.E(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(d0.class.getName());
        sb.append(": ");
        sb.append(this.d ? "vararg " : "");
        String str = this.c;
        sb.append(str != null ? n20.e.d(str) : null);
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }
}
