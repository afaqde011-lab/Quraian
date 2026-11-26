package x;

public final class q1 implements u {

    public final int f16352a;

    public final int f16353b;

    public final v f16354c;

    public q1(int i10, int i11, v vVar) {
        this.f16352a = i10;
        this.f16353b = i11;
        this.f16354c = vVar;
    }

    @Override
    public final s1 a(r1 r1Var) {
        return new bg.b(this.f16352a, this.f16353b, this.f16354c);
    }

    @Override
    public final u1 a(r1 r1Var) {
        return new bg.b(this.f16352a, this.f16353b, this.f16354c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q1) {
            q1 q1Var = (q1) obj;
            if (q1Var.f16352a == this.f16352a && q1Var.f16353b == this.f16353b && kotlin.jvm.internal.m.a(q1Var.f16354c, this.f16354c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f16354c.hashCode() + (this.f16352a * 31)) * 31) + this.f16353b;
    }
}
