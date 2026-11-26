package d0;

public final class i3 {

    public final long f4437a;

    public final long f4438b;

    public final boolean f4439c;

    public i3(long j9, long j10, boolean z10) {
        this.f4437a = j9;
        this.f4438b = j10;
        this.f4439c = z10;
    }

    public final i3 a(i3 i3Var) {
        return new i3(h2.b.f(this.f4437a, i3Var.f4437a), Math.max(this.f4438b, i3Var.f4438b), this.f4439c || i3Var.f4439c);
    }
}
