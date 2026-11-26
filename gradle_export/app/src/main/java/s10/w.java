package s10;

public final class w extends e0 {
    public final boolean a;

    public w(boolean z) {
        this.a = z;
    }

    @Override
    public final Object a() {
        return Boolean.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.a == ((w) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
