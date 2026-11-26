package d;

public final class y extends s9.e {

    public final z f4397h;

    public boolean f4398i;

    public y(z zVar, a0 a0Var) {
        super(a0Var, zVar.f4400b, 0);
        this.f4397h = zVar;
        this.f4398i = true;
    }

    @Override
    public final void a() {
        this.f4397h.a();
    }

    @Override
    public final void b() {
        this.f4397h.b();
    }

    @Override
    public final void c(s9.b bVar) {
        this.f4397h.c(new b(bVar));
    }

    @Override
    public final void d(s9.b bVar) {
        kotlin.jvm.internal.m.e(bVar, "event");
        this.f4397h.d(new b(bVar));
    }

    public final void h(boolean z10) {
        this.f4398i = z10;
        g(z10 && this.f4397h.f4400b);
    }
}
