package h0;

public final class t0 implements n1 {

    public final l2 f6462a;

    public final y3.c f6463b;

    public t0(l2 l2Var, y3.c cVar) {
        this.f6462a = l2Var;
        this.f6463b = cVar;
    }

    @Override
    public final float a() {
        l2 l2Var = this.f6462a;
        y3.c cVar = this.f6463b;
        return cVar.h0(l2Var.b(cVar));
    }

    @Override
    public final float b(y3.m mVar) {
        l2 l2Var = this.f6462a;
        y3.c cVar = this.f6463b;
        return cVar.h0(l2Var.d(cVar, mVar));
    }

    @Override
    public final float c() {
        l2 l2Var = this.f6462a;
        y3.c cVar = this.f6463b;
        return cVar.h0(l2Var.c(cVar));
    }

    @Override
    public final float d(y3.m mVar) {
        l2 l2Var = this.f6462a;
        y3.c cVar = this.f6463b;
        return cVar.h0(l2Var.a(cVar, mVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return kotlin.jvm.internal.m.a(this.f6462a, t0Var.f6462a) && kotlin.jvm.internal.m.a(this.f6463b, t0Var.f6463b);
    }

    public final int hashCode() {
        return this.f6463b.hashCode() + (this.f6462a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f6462a + ", density=" + this.f6463b + ')';
    }
}
