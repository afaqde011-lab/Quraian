package t10;

import kotlin.jvm.internal.m;

public final class h {
    public final int a;
    public final int b;
    public final int c;

    public h(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public h(k20.b field) {
        this(field, 1);
        m.e(field, "field");
    }

    public h(k20.d field, int i) {
        this(field.b, field.c, i);
        m.e(field, "field");
    }
}
