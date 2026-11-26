package j2;

public abstract class c {

    public final String f7860a;

    public final long f7861b;

    public final int f7862c;

    public c(String str, long j9, int i10) {
        this.f7860a = str;
        this.f7861b = j9;
        this.f7862c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i10);

    public abstract float b(int i10);

    public boolean c() {
        return false;
    }

    public abstract long d(float f3, float f10, float f11);

    public abstract float e(float f3, float f10, float f11);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f7862c == cVar.f7862c && kotlin.jvm.internal.m.a(this.f7860a, cVar.f7860a)) {
            return b.a(this.f7861b, cVar.f7861b);
        }
        return false;
    }

    public abstract long f(float f3, float f10, float f11, float f12, c cVar);

    public int hashCode() {
        int iHashCode = this.f7860a.hashCode() * 31;
        int i10 = b.f7859e;
        return w.c.f(iHashCode, this.f7861b, 31) + this.f7862c;
    }

    public final String toString() {
        return this.f7860a + " (id=" + this.f7862c + ", model=" + ((Object) b.b(this.f7861b)) + ')';
    }
}
