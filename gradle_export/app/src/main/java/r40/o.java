package r40;

public final class o extends a {
    public final q40.e f;
    public final int g;
    public int h;

    public o(q40.c json, q40.e value) {
        super(json, null);
        kotlin.jvm.internal.m.e(json, "json");
        kotlin.jvm.internal.m.e(value, "value");
        this.f = value;
        this.g = value.A.size();
        this.h = -1;
    }

    @Override
    public final q40.l F(String tag) {
        kotlin.jvm.internal.m.e(tag, "tag");
        return (q40.l) this.f.A.get(Integer.parseInt(tag));
    }

    @Override
    public final String R(n40.e descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return String.valueOf(i);
    }

    @Override
    public final q40.l T() {
        return this.f;
    }

    @Override
    public final int l(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        int i = this.h;
        if (i >= this.g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.h = i2;
        return i2;
    }
}
