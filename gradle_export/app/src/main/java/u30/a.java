package u30;

import c7.i;
import java.util.List;

public final class a extends h00.f implements b {
    public final v30.a A;
    public final int B;
    public final int C;

    public a(v30.a aVar, int i, int i2) {
        this.A = aVar;
        this.B = i;
        i.q(i, i2, aVar.a());
        this.C = i2 - i;
    }

    @Override
    public final int a() {
        return this.C;
    }

    @Override
    public final Object get(int i) {
        i.o(i, this.C);
        return this.A.get(this.B + i);
    }

    @Override
    public final List subList(int i, int i2) {
        i.q(i, i2, this.C);
        int i3 = this.B;
        return new a(this.A, i + i3, i3 + i2);
    }
}
