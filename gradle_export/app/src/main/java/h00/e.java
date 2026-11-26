package h00;

import java.util.List;
import java.util.RandomAccess;

public final class e extends f implements RandomAccess {
    public final f A;
    public final int B;
    public final int C;

    public e(f fVar, int i, int i2) {
        this.A = fVar;
        this.B = i;
        rd.a.j(i, i2, fVar.a());
        this.C = i2 - i;
    }

    @Override
    public final int a() {
        return this.C;
    }

    @Override
    public final Object get(int i) {
        int i2 = this.C;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(w.c.h(i, i2, "index: ", ", size: "));
        }
        return this.A.get(this.B + i);
    }

    @Override
    public final List subList(int i, int i2) {
        rd.a.j(i, i2, this.C);
        int i3 = this.B;
        return new e(this.A, i + i3, i3 + i2);
    }
}
