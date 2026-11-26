package oo;

public final class y implements a0 {
    public final float a;

    public y(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Float.compare(this.a, ((y) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "OnSpeedSelected(speed=" + this.a + ")";
    }
}
