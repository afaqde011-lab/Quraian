package pl;

public final class p {
    public float a;
    public float b;
    public float c;
    public float d;
    public int e;
    public float f;
    public float g;
    public float h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.a, pVar.a) == 0 && Float.compare(this.b, pVar.b) == 0 && Float.compare(this.c, pVar.c) == 0 && Float.compare(this.d, pVar.d) == 0 && this.e == pVar.e && Float.compare(this.f, pVar.f) == 0 && Float.compare(this.g, pVar.g) == 0 && Float.compare(this.h, pVar.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + w.c.c(this.g, w.c.c(this.f, w.c.d(this.e, w.c.c(this.d, w.c.c(this.c, w.c.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "SpoilerParticle(x=" + this.a + ", y=" + this.b + ", vx=" + this.c + ", vy=" + this.d + ", alpha=" + this.e + ", radius=" + this.f + ", life=" + this.g + ", maxLife=" + this.h + ")";
    }
}
