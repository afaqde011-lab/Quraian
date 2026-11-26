package bv;

public final class h implements g1 {
    public final float a;

    public h(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Float.compare(this.a, ((h) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "OnChangeSurahSoundVolume(value=" + this.a + ")";
    }
}
