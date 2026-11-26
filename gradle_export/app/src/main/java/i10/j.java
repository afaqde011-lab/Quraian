package i10;

import a10.w;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.s;

public final class j extends g10.i {
    public static final w[] h = {a0.a.h(new s(j.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};
    public g10.l f;
    public final d30.i g;

    public j(d30.l lVar) {
        super(lVar);
        h[] hVarArr = h.A;
        this.g = new d30.i(lVar, new a20.a(this, lVar, 21));
    }

    public final o K() {
        return (o) ze.d.A(this.g, h[0]);
    }

    @Override
    public final l10.b d() {
        return K();
    }

    @Override
    public final Iterable m() {
        Iterable iterableM = super.m();
        m10.a0 a0VarL = l();
        kotlin.jvm.internal.m.d(a0VarL, "getBuiltInsModule(...)");
        return h00.q.X0(iterableM, new g(this.d, a0VarL));
    }

    @Override
    public final l10.d q() {
        return K();
    }
}
