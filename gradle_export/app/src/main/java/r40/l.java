package r40;

public final class l extends a {
    public final q40.l f;

    public l(q40.c json, q40.l value, String str) {
        super(json, str);
        kotlin.jvm.internal.m.e(json, "json");
        kotlin.jvm.internal.m.e(value, "value");
        this.f = value;
        this.a.add("primitive");
    }

    @Override
    public final q40.l F(String tag) {
        kotlin.jvm.internal.m.e(tag, "tag");
        if (tag == "primitive") {
            return this.f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override
    public final q40.l T() {
        return this.f;
    }

    @Override
    public final int l(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return 0;
    }
}
