package p40;

import java.util.List;

public abstract class h0 implements n40.e {
    public final n40.e a;

    public h0(n40.e eVar) {
        this.a = eVar;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int d(String name) {
        kotlin.jvm.internal.m.e(name, "name");
        Integer numY0 = r30.r.y0(name);
        if (numY0 != null) {
            return numY0.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return kotlin.jvm.internal.m.a(this.a, h0Var.a) && kotlin.jvm.internal.m.a(a(), h0Var.a());
    }

    @Override
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override
    public final List g(int i) {
        if (i >= 0) {
            return h00.x.A;
        }
        StringBuilder sbQ = oi.k.q("Illegal index ", i, ", ");
        sbQ.append(a());
        sbQ.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbQ.toString().toString());
    }

    @Override
    public final List getAnnotations() {
        return h00.x.A;
    }

    @Override
    public final va.a getKind() {
        return n40.i.d;
    }

    @Override
    public final n40.e h(int i) {
        if (i >= 0) {
            return this.a;
        }
        StringBuilder sbQ = oi.k.q("Illegal index ", i, ", ");
        sbQ.append(a());
        sbQ.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbQ.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    @Override
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbQ = oi.k.q("Illegal index ", i, ", ");
        sbQ.append(a());
        sbQ.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbQ.toString().toString());
    }

    @Override
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return a() + '(' + this.a + ')';
    }
}
