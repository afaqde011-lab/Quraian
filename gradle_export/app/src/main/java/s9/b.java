package s9;

public final class b {

    public final int f13905a;

    public final float f13906b;

    public final float f13907c;

    public final float f13908d;

    public final long f13909e;

    public b(float f3, float f10, float f11, int i10, long j9) {
        this.f13905a = i10;
        this.f13906b = f3;
        this.f13907c = f10;
        this.f13908d = f11;
        this.f13909e = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f13907c == bVar.f13907c && this.f13908d == bVar.f13908d && this.f13906b == bVar.f13906b && this.f13905a == bVar.f13905a && this.f13909e == bVar.f13909e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13909e) + w.c.d(this.f13905a, w.c.c(this.f13906b, w.c.c(this.f13908d, Float.hashCode(this.f13907c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f13907c + ", touchY=" + this.f13908d + ", progress=" + this.f13906b + ", swipeEdge=" + this.f13905a + ", frameTimeMillis=" + this.f13909e + ')';
    }
}
