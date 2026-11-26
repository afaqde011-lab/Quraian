package za;

public final class x extends j0 {
    public x(Class cls) {
        super(cls);
        kotlin.jvm.internal.m.e(cls, "workerClass");
    }

    @Override
    public final k0 c() {
        if (this.f17383a && this.f17385c.f7013j.f17359d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        return new y(this.f17384b, this.f17385c, this.f17386d);
    }

    @Override
    public final j0 d() {
        return this;
    }
}
