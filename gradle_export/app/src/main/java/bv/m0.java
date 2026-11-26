package bv;

public final class m0 implements g1 {
    public final float a;

    public m0(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && Float.compare(this.a, ((m0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "OnPlaybackSpeedSelected(speed=" + this.a + ")";
    }
}
