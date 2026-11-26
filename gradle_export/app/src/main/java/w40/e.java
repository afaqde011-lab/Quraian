package w40;

public final class e {
    public float a;
    public float b;

    public e(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.a, eVar.a) == 0 && Float.compare(this.b, eVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vector(x=");
        sb.append(this.a);
        sb.append(", y=");
        return w.c.k(sb, this.b, ')');
    }
}
