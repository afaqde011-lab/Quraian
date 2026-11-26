package g30;

import g00.p;
import h00.x;
import j10.i0;
import j10.z;
import java.util.Collection;
import java.util.List;

public final class e implements z {
    public static final e A = new e();
    public static final n20.e B;
    public static final x C;
    public static final p D;

    static {
        b[] bVarArr = b.A;
        B = n20.e.g("<Error module>");
        C = x.A;
        D = rd.a.J(d.A);
    }

    @Override
    public final Object D(eh.l capability) {
        kotlin.jvm.internal.m.e(capability, "capability");
        return null;
    }

    @Override
    public final Object G(j10.m mVar, Object obj) {
        return null;
    }

    @Override
    public final j10.k a() {
        return this;
    }

    @Override
    public final g10.i d() {
        return (g10.i) D.getValue();
    }

    @Override
    public final List d0() {
        return C;
    }

    @Override
    public final i0 f0(n20.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override
    public final k10.h getAnnotations() {
        return k10.g.a;
    }

    @Override
    public final n20.e getName() {
        return B;
    }

    @Override
    public final Collection h(n20.c fqName, u00.k kVar) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        return x.A;
    }

    @Override
    public final j10.k l() {
        return null;
    }

    @Override
    public final boolean v(z targetModule) {
        kotlin.jvm.internal.m.e(targetModule, "targetModule");
        return false;
    }
}
