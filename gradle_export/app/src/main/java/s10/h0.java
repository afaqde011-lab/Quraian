package s10;

public final class h0 extends e0 {
    public final String a;

    public h0(String value) {
        kotlin.jvm.internal.m.e(value, "value");
        this.a = value;
    }

    @Override
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && kotlin.jvm.internal.m.a(this.a, ((h0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
