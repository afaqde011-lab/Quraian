package a40;

public final class q0 implements b1 {
    public final boolean A;

    public q0(boolean z) {
        this.A = z;
    }

    @Override
    public final boolean a() {
        return this.A;
    }

    @Override
    public final p1 c() {
        return null;
    }

    public final String toString() {
        return g4.c.k(new StringBuilder("Empty{"), this.A ? "Active" : "New", '}');
    }
}
