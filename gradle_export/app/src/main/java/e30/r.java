package e30;

import kotlin.NoWhenBranchMatchedException;

public final class r extends q implements j {
    public r(a0 lowerBound, a0 upperBound) {
        super(lowerBound, upperBound);
        kotlin.jvm.internal.m.e(lowerBound, "lowerBound");
        kotlin.jvm.internal.m.e(upperBound, "upperBound");
    }

    @Override
    public final z0 A0(f30.f kotlinTypeRefiner) {
        kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        a0 type = this.B;
        kotlin.jvm.internal.m.e(type, "type");
        a0 type2 = this.C;
        kotlin.jvm.internal.m.e(type2, "type");
        return new r(type, type2);
    }

    @Override
    public final z0 B0(h0 newAttributes) {
        kotlin.jvm.internal.m.e(newAttributes, "newAttributes");
        return c.f(this.B.B0(newAttributes), this.C.B0(newAttributes));
    }

    @Override
    public final z0 C(w replacement) {
        z0 z0VarF;
        kotlin.jvm.internal.m.e(replacement, "replacement");
        z0 z0VarY0 = replacement.y0();
        if (z0VarY0 instanceof q) {
            z0VarF = z0VarY0;
        } else {
            if (!(z0VarY0 instanceof a0)) {
                throw new NoWhenBranchMatchedException();
            }
            a0 a0Var = (a0) z0VarY0;
            z0VarF = c.f(a0Var, a0Var.z0(true));
        }
        return c.i(z0VarF, z0VarY0);
    }

    @Override
    public final a0 C0() {
        return this.B;
    }

    @Override
    public final String D0(p20.h hVar, p20.h hVar2) {
        boolean zN = hVar2.a.n();
        a0 a0Var = this.C;
        a0 a0Var2 = this.B;
        if (!zN) {
            return hVar.F(hVar.X(a0Var2), hVar.X(a0Var), ab.a0.c0(this));
        }
        return "(" + hVar.X(a0Var2) + ".." + hVar.X(a0Var) + ')';
    }

    @Override
    public final boolean P() {
        a0 a0Var = this.B;
        return (a0Var.m0().g() instanceof j10.r0) && kotlin.jvm.internal.m.a(a0Var.m0(), this.C.m0());
    }

    @Override
    public final String toString() {
        return "(" + this.B + ".." + this.C + ')';
    }

    @Override
    public final w A0(f30.f kotlinTypeRefiner) {
        kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        a0 type = this.B;
        kotlin.jvm.internal.m.e(type, "type");
        a0 type2 = this.C;
        kotlin.jvm.internal.m.e(type2, "type");
        return new r(type, type2);
    }

    @Override
    public final z0 z0(boolean z) {
        return c.f(this.B.z0(z), this.C.z0(z));
    }
}
