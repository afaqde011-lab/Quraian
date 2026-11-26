package x;

public final class d1 implements s1 {
    public final s1 A;
    public final long B;

    public d1(s1 s1Var, long j9) {
        this.A = s1Var;
        this.B = j9;
    }

    @Override
    public final boolean a() {
        return this.A.a();
    }

    @Override
    public final long b(o oVar, o oVar2, o oVar3) {
        return this.A.b(oVar, oVar2, oVar3) + this.B;
    }

    @Override
    public final o c(long j9, o oVar, o oVar2, o oVar3) {
        long j10 = this.B;
        return j9 < j10 ? oVar3 : this.A.c(j9 - j10, oVar, oVar2, oVar3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return d1Var.B == this.B && kotlin.jvm.internal.m.a(d1Var.A, this.A);
    }

    public final int hashCode() {
        return Long.hashCode(this.B) + (this.A.hashCode() * 31);
    }

    @Override
    public final o r(long j9, o oVar, o oVar2, o oVar3) {
        long j10 = this.B;
        return j9 < j10 ? oVar : this.A.r(j9 - j10, oVar, oVar2, oVar3);
    }
}
