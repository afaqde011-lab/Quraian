package e30;

public abstract class p0 implements h30.k {
    public abstract a1 a();

    public abstract w b();

    public abstract boolean c();

    public abstract p0 d(f30.f fVar);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return c() == p0Var.c() && a() == p0Var.a() && b().equals(p0Var.b());
    }

    public final int hashCode() {
        int iHashCode = a().hashCode();
        if (x0.l(b())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (c() ? 17 : b().hashCode());
    }

    public final String toString() {
        if (c()) {
            return "*";
        }
        if (a() == a1.C) {
            return b().toString();
        }
        return a() + " " + b();
    }
}
