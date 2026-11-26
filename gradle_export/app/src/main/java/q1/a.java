package q1;

import com.google.android.gms.internal.measurement.y3;
import h00.f;
import java.util.List;

public final class a extends f {
    public final r1.c A;
    public final int B;
    public final int C;

    public a(r1.c cVar, int i10, int i11) {
        this.A = cVar;
        this.B = i10;
        y3.u(i10, i11, cVar.a());
        this.C = i11 - i10;
    }

    public final int a() {
        return this.C;
    }

    public final Object get(int i10) {
        y3.s(i10, this.C);
        return this.A.get(this.B + i10);
    }

    public final List subList(int i10, int i11) {
        y3.u(i10, i11, this.C);
        int i12 = this.B;
        return new a(this.A, i10 + i12, i12 + i11);
    }
}
