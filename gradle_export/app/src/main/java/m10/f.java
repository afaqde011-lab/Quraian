package m10;

import e30.x0;
import java.util.List;

public abstract class f extends n implements j10.q0 {
    public final d30.o F;
    public final j10.o G;
    public List H;
    public final e I;

    static {
        kotlin.jvm.internal.a0.a.h(new kotlin.jvm.internal.s(f.class, "constructors", "getConstructors()Ljava/util/Collection;", 0));
    }

    public f(d30.o storageManager, j10.k containingDeclaration, k10.h hVar, n20.e eVar, j10.o visibilityImpl) {
        super(containingDeclaration, hVar, eVar, j10.n0.n);
        kotlin.jvm.internal.m.e(storageManager, "storageManager");
        kotlin.jvm.internal.m.e(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.m.e(visibilityImpl, "visibilityImpl");
        this.F = storageManager;
        this.G = visibilityImpl;
        ((d30.l) storageManager).a(new eo.p(this, 9));
        this.I = new e(this);
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final Object G(j10.m mVar, Object obj) {
        return mVar.s(this, obj);
    }

    @Override
    public final j10.l a() {
        return this;
    }

    @Override
    public final j10.h a() {
        return this;
    }

    @Override
    public final j10.k a() {
        return this;
    }

    @Override
    public final e30.m0 f() {
        return this.I;
    }

    @Override
    public final j10.o getVisibility() {
        return this.G;
    }

    @Override
    public final boolean isExternal() {
        return false;
    }

    @Override
    public final boolean k() {
        return x0.c(((c30.u) this).a1(), new a20.d(this, 22), null);
    }

    @Override
    public final List p() {
        List list = this.H;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.m.k("declaredTypeParametersImpl");
        throw null;
    }

    @Override
    public final boolean p0() {
        return false;
    }

    @Override
    public final String toString() {
        return "typealias " + getName().b();
    }
}
