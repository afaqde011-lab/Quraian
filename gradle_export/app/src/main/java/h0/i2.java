package h0;

public final class i2 implements l2 {

    public final String f6414a;

    public final l1.i1 f6415b;

    public i2(u0 u0Var, String str) {
        this.f6414a = str;
        this.f6415b = l1.q.z(u0Var);
    }

    @Override
    public final int a(y3.c cVar, y3.m mVar) {
        return e().f6468c;
    }

    @Override
    public final int b(y3.c cVar) {
        return e().f6469d;
    }

    @Override
    public final int c(y3.c cVar) {
        return e().f6467b;
    }

    @Override
    public final int d(y3.c cVar, y3.m mVar) {
        return e().f6466a;
    }

    public final u0 e() {
        return (u0) this.f6415b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i2) {
            return kotlin.jvm.internal.m.a(e(), ((i2) obj).e());
        }
        return false;
    }

    public final void f(u0 u0Var) {
        this.f6415b.setValue(u0Var);
    }

    public final int hashCode() {
        return this.f6414a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6414a);
        sb2.append("(left=");
        sb2.append(e().f6466a);
        sb2.append(", top=");
        sb2.append(e().f6467b);
        sb2.append(", right=");
        sb2.append(e().f6468c);
        sb2.append(", bottom=");
        return oi.k.l(sb2, e().f6469d, ')');
    }
}
