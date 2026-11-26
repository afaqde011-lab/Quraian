package e30;

public final class o extends s0 {
    public final s0 b;
    public final s0 c;

    public o(s0 s0Var, s0 s0Var2) {
        this.b = s0Var;
        this.c = s0Var2;
    }

    @Override
    public final boolean a() {
        return this.b.a() || this.c.a();
    }

    @Override
    public final boolean b() {
        return this.b.b() || this.c.b();
    }

    @Override
    public final k10.h c(k10.h annotations) {
        kotlin.jvm.internal.m.e(annotations, "annotations");
        return this.c.c(this.b.c(annotations));
    }

    @Override
    public final p0 d(w wVar) {
        p0 p0VarD = this.b.d(wVar);
        return p0VarD == null ? this.c.d(wVar) : p0VarD;
    }

    @Override
    public final w f(w topLevelType, a1 position) {
        kotlin.jvm.internal.m.e(topLevelType, "topLevelType");
        kotlin.jvm.internal.m.e(position, "position");
        return this.c.f(this.b.f(topLevelType, position), position);
    }
}
