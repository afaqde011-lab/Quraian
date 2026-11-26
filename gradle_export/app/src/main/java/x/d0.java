package x;

public final class d0 implements i {

    public final u f16273a;

    public final p0 f16274b;

    public final long f16275c;

    public d0(u uVar, p0 p0Var, long j9) {
        this.f16273a = uVar;
        this.f16274b = p0Var;
        this.f16275c = j9;
        if (uVar instanceof q1) {
            q1 q1Var = (q1) uVar;
            if (q1Var.f16352a != 0 || q1Var.f16353b != 0) {
                return;
            }
        } else if (!(uVar instanceof z0) || ((z0) uVar).f16389a != 0) {
            return;
        }
        throw new IllegalArgumentException("Animation to be infinitely repeated cannot have a 0-duration");
    }

    @Override
    public final s1 a(r1 r1Var) {
        u1 u1VarA = this.f16273a.a(r1Var);
        s7.w0 w0Var = new s7.w0();
        w0Var.C = u1VarA;
        w0Var.D = this.f16274b;
        w0Var.A = ((long) (u1VarA.v() + u1VarA.q())) * 1000000;
        w0Var.B = this.f16275c * 1000000;
        return w0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            if (kotlin.jvm.internal.m.a(d0Var.f16273a, this.f16273a) && d0Var.f16274b == this.f16274b && d0Var.f16275c == this.f16275c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16275c) + ((this.f16274b.hashCode() + (this.f16273a.hashCode() * 31)) * 31);
    }
}
