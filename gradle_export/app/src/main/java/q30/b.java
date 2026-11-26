package q30;

import h00.b0;
import java.util.Iterator;

public final class b implements j, c {
    public final int a;
    public final j b;
    public final int c;

    public b(j sequence, int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = sequence;
                this.c = i;
                if (i < 0) {
                    throw new IllegalArgumentException(oi.k.h("count must be non-negative, but was ", i, '.').toString());
                }
                return;
            default:
                kotlin.jvm.internal.m.e(sequence, "sequence");
                this.b = sequence;
                this.c = i;
                if (i < 0) {
                    throw new IllegalArgumentException(oi.k.h("count must be non-negative, but was ", i, '.').toString());
                }
                return;
        }
    }

    @Override
    public final j a(int i) {
        switch (this.a) {
            case 0:
                int i2 = this.c;
                int i3 = i2 + i;
                return i3 < 0 ? new b(this, i, 1) : new p(this.b, i2, i3);
            default:
                return i >= this.c ? this : new b(this.b, i, 1);
        }
    }

    @Override
    public final j b(int i) {
        switch (this.a) {
            case 0:
                int i2 = this.c + i;
                return i2 < 0 ? new b(this, i, 0) : new b(this.b, i2, 0);
            default:
                int i3 = this.c;
                return i >= i3 ? d.a : new p(this.b, i, i3);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new b0(this);
            default:
                return new b0(this, (byte) 0);
        }
    }
}
