package x;

public final class h1 implements e {

    public final s1 f16293a;

    public final r1 f16294b;

    public Object f16295c;

    public Object f16296d;

    public o f16297e;

    public o f16298f;

    public final o f16299g;

    public long f16300h;

    public o f16301i;

    public h1(i iVar, Float f3, Float f10) {
        this(iVar, c.f16258k, f3, f10, null);
    }

    public h1(i iVar, r1 r1Var, Object obj, Object obj2, o oVar) {
        this.f16293a = iVar.a(r1Var);
        this.f16294b = r1Var;
        this.f16295c = obj2;
        this.f16296d = obj;
        this.f16297e = (o) r1Var.f16363a.invoke(obj);
        u00.k kVar = r1Var.f16363a;
        this.f16298f = (o) kVar.invoke(obj2);
        this.f16299g = oVar != null ? c.k(oVar) : ((o) kVar.invoke(obj)).c();
        this.f16300h = -1L;
    }

    @Override
    public final boolean a() {
        return this.f16293a.a();
    }

    @Override
    public final long b() {
        if (this.f16300h < 0) {
            this.f16300h = this.f16293a.b(this.f16297e, this.f16298f, this.f16299g);
        }
        return this.f16300h;
    }

    @Override
    public final r1 c() {
        return this.f16294b;
    }

    @Override
    public final o d(long j9) {
        if (!e(j9)) {
            return this.f16293a.c(j9, this.f16297e, this.f16298f, this.f16299g);
        }
        o oVar = this.f16301i;
        if (oVar != null) {
            return oVar;
        }
        o oVarM = this.f16293a.m(this.f16297e, this.f16298f, this.f16299g);
        this.f16301i = oVarM;
        return oVarM;
    }

    @Override
    public final Object f(long j9) {
        if (e(j9)) {
            return this.f16295c;
        }
        o oVarR = this.f16293a.r(j9, this.f16297e, this.f16298f, this.f16299g);
        int iB = oVarR.b();
        for (int i10 = 0; i10 < iB; i10++) {
            if (Float.isNaN(oVarR.a(i10))) {
                o0.b("AnimationVector cannot contain a NaN. " + oVarR + ". Animation: " + this + ", playTimeNanos: " + j9);
            }
        }
        return this.f16294b.f16364b.invoke(oVarR);
    }

    @Override
    public final Object g() {
        return this.f16295c;
    }

    public final void h(Object obj) {
        if (kotlin.jvm.internal.m.a(obj, this.f16296d)) {
            return;
        }
        this.f16296d = obj;
        this.f16297e = (o) this.f16294b.f16363a.invoke(obj);
        this.f16301i = null;
        this.f16300h = -1L;
    }

    public final void i(Object obj) {
        if (kotlin.jvm.internal.m.a(this.f16295c, obj)) {
            return;
        }
        this.f16295c = obj;
        this.f16298f = (o) this.f16294b.f16363a.invoke(obj);
        this.f16301i = null;
        this.f16300h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f16296d + " -> " + this.f16295c + ",initial velocity: " + this.f16299g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.f16293a;
    }
}
