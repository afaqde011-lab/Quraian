package g1;

public final class d8 implements b8 {

    public final boolean f5756a;

    public final l1.i1 f5757b;

    public final l1.f1 f5758c;

    public final l1.f1 f5759d;

    public d8(int i10, int i11, boolean z10) {
        if (i10 < 0 || i10 >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range");
        }
        if (i11 < 0 || i11 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range");
        }
        this.f5756a = z10;
        this.f5757b = l1.q.z(new a8(0));
        this.f5758c = new l1.f1(i10);
        this.f5759d = new l1.f1(i11);
    }

    @Override
    public final void a(int i10) {
        this.f5758c.i(i10);
    }

    @Override
    public final void b(int i10) {
        this.f5759d.i(i10);
    }

    @Override
    public final int c() {
        return this.f5759d.h();
    }

    @Override
    public final void d(int i10) {
        this.f5757b.setValue(new a8(i10));
    }

    @Override
    public final int e() {
        return ((a8) this.f5757b.getValue()).f5727a;
    }

    @Override
    public final boolean f() {
        return this.f5756a;
    }

    @Override
    public final int g() {
        return this.f5758c.h();
    }
}
