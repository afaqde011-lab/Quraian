package h0;

public final class d2 implements l2 {

    public final l2 f6398a;

    public final l2 f6399b;

    public d2(l2 l2Var, l2 l2Var2) {
        this.f6398a = l2Var;
        this.f6399b = l2Var2;
    }

    @Override
    public final int a(y3.c cVar, y3.m mVar) {
        return Math.max(this.f6398a.a(cVar, mVar), this.f6399b.a(cVar, mVar));
    }

    @Override
    public final int b(y3.c cVar) {
        return Math.max(this.f6398a.b(cVar), this.f6399b.b(cVar));
    }

    @Override
    public final int c(y3.c cVar) {
        return Math.max(this.f6398a.c(cVar), this.f6399b.c(cVar));
    }

    @Override
    public final int d(y3.c cVar, y3.m mVar) {
        return Math.max(this.f6398a.d(cVar, mVar), this.f6399b.d(cVar, mVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return kotlin.jvm.internal.m.a(d2Var.f6398a, this.f6398a) && kotlin.jvm.internal.m.a(d2Var.f6399b, this.f6399b);
    }

    public final int hashCode() {
        return (this.f6399b.hashCode() * 31) + this.f6398a.hashCode();
    }

    public final String toString() {
        return "(" + this.f6398a + " ∪ " + this.f6399b + ')';
    }
}
