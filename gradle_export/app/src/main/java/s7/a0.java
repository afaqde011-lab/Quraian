package s7;

public final class a0 {

    public final Object f13644a;

    public final int f13645b;

    public final int f13646c;

    public final long f13647d;

    public final int f13648e;

    public a0(Object obj) {
        this(obj, -1L);
    }

    public a0(Object obj, int i10, int i11, long j9, int i12) {
        this.f13644a = obj;
        this.f13645b = i10;
        this.f13646c = i11;
        this.f13647d = j9;
        this.f13648e = i12;
    }

    public a0(Object obj, long j9) {
        this(obj, -1, -1, j9, -1);
    }

    public a0(Object obj, long j9, int i10) {
        this(obj, -1, -1, j9, i10);
    }

    public final a0 a(Object obj) {
        if (this.f13644a.equals(obj)) {
            return this;
        }
        return new a0(obj, this.f13645b, this.f13646c, this.f13647d, this.f13648e);
    }

    public final boolean b() {
        return this.f13645b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f13644a.equals(a0Var.f13644a) && this.f13645b == a0Var.f13645b && this.f13646c == a0Var.f13646c && this.f13647d == a0Var.f13647d && this.f13648e == a0Var.f13648e;
    }

    public final int hashCode() {
        return ((((((((this.f13644a.hashCode() + 527) * 31) + this.f13645b) * 31) + this.f13646c) * 31) + ((int) this.f13647d)) * 31) + this.f13648e;
    }
}
