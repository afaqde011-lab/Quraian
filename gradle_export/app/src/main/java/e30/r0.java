package e30;

public final class r0 extends s0 {
    public final int b;
    public final s0 c;

    public r0(s0 s0Var, int i) {
        this.b = i;
        this.c = s0Var;
    }

    @Override
    public boolean a() {
        switch (this.b) {
            case 1:
                return this.c.a();
            default:
                return super.a();
        }
    }

    @Override
    public boolean b() {
        switch (this.b) {
            case 1:
                return true;
            default:
                return super.b();
        }
    }

    @Override
    public final k10.h c(k10.h annotations) {
        switch (this.b) {
            case 0:
                kotlin.jvm.internal.m.e(annotations, "annotations");
                break;
            default:
                kotlin.jvm.internal.m.e(annotations, "annotations");
                break;
        }
        return this.c.c(annotations);
    }

    @Override
    public final p0 d(w wVar) {
        switch (this.b) {
            case 0:
                return this.c.d(wVar);
            default:
                p0 p0VarD = this.c.d(wVar);
                if (p0VarD == null) {
                    return null;
                }
                j10.h hVarG = wVar.m0().g();
                return ab.a0.H(p0VarD, hVarG instanceof j10.r0 ? (j10.r0) hVarG : null);
        }
    }

    @Override
    public final boolean e() {
        switch (this.b) {
            case 0:
                break;
        }
        return this.c.e();
    }

    @Override
    public final w f(w topLevelType, a1 position) {
        switch (this.b) {
            case 0:
                kotlin.jvm.internal.m.e(topLevelType, "topLevelType");
                kotlin.jvm.internal.m.e(position, "position");
                break;
            default:
                kotlin.jvm.internal.m.e(topLevelType, "topLevelType");
                kotlin.jvm.internal.m.e(position, "position");
                break;
        }
        return this.c.f(topLevelType, position);
    }
}
