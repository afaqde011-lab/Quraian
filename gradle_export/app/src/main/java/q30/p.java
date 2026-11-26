package q30;

import java.util.Iterator;

public final class p implements j, c {
    public final j a;
    public final int b;
    public final int c;

    public p(j sequence, int i, int i2) {
        kotlin.jvm.internal.m.e(sequence, "sequence");
        this.a = sequence;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            throw new IllegalArgumentException(g4.c.f(i, "startIndex should be non-negative, but is ").toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(g4.c.f(i2, "endIndex should be non-negative, but is ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(w.c.h(i2, i, "endIndex should be not less than startIndex, but was ", " < ").toString());
        }
    }

    @Override
    public final j a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? this : new p(this.a, i3, i + i3);
    }

    @Override
    public final j b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? d.a : new p(this.a, i3 + i, i2);
    }

    @Override
    public final Iterator iterator() {
        return new h(this);
    }
}
