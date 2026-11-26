package p40;

import java.util.List;

public final class u0 implements n40.e {
    public final String a;
    public final n40.d b;

    public u0(String str, n40.d kind) {
        kotlin.jvm.internal.m.e(kind, "kind");
        this.a = str;
        this.b = kind;
    }

    @Override
    public final String a() {
        return this.a;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int d(String name) {
        kotlin.jvm.internal.m.e(name, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return kotlin.jvm.internal.m.a(this.a, u0Var.a) && kotlin.jvm.internal.m.a(this.b, u0Var.b);
    }

    @Override
    public final String f(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override
    public final List g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override
    public final List getAnnotations() {
        return h00.x.A;
    }

    @Override
    public final va.a getKind() {
        return this.b;
    }

    @Override
    public final n40.e h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override
    public final boolean i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return g4.c.k(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
