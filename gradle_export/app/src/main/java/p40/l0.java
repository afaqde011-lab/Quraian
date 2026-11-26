package p40;

import java.util.List;

public final class l0 implements n40.e {
    public static final l0 a = new l0();

    @Override
    public final String a() {
        return "kotlin.Nothing";
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int d(String name) {
        kotlin.jvm.internal.m.e(name, "name");
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override
    public final String f(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override
    public final List g(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override
    public final List getAnnotations() {
        return h00.x.A;
    }

    @Override
    public final va.a getKind() {
        return n40.i.f;
    }

    @Override
    public final n40.e h(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final int hashCode() {
        return (n40.i.f.hashCode() * 31) - 1818355776;
    }

    @Override
    public final boolean i(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
