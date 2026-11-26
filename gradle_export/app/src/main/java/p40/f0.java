package p40;

import java.util.List;

public final class f0 implements n40.e {
    public final n40.e a;
    public final n40.e b;

    public f0(n40.e keyDesc, n40.e valueDesc) {
        kotlin.jvm.internal.m.e(keyDesc, "keyDesc");
        kotlin.jvm.internal.m.e(valueDesc, "valueDesc");
        this.a = keyDesc;
        this.b = valueDesc;
    }

    @Override
    public final String a() {
        return "kotlin.collections.LinkedHashMap";
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
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override
    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return kotlin.jvm.internal.m.a(this.a, f0Var.a) && kotlin.jvm.internal.m.a(this.b, f0Var.b);
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
        throw new IllegalArgumentException(g4.c.i("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override
    public final List getAnnotations() {
        return h00.x.A;
    }

    @Override
    public final va.a getKind() {
        return n40.i.e;
    }

    @Override
    public final n40.e h(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(g4.c.i("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.a;
        }
        if (i2 == 1) {
            return this.b;
        }
        throw new IllegalStateException("Unreached");
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 710441009) * 31);
    }

    @Override
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(g4.c.i("Illegal index ", i, ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.a + ", " + this.b + ')';
    }
}
