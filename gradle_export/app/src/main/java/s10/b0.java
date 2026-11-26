package s10;

public final class b0 extends e0 {
    public final float a;

    public b0(float f) {
        this.a = f;
    }

    @Override
    public final Object a() {
        return Float.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Float.compare(this.a, ((b0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
