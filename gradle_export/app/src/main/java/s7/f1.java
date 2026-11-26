package s7;

import java.io.IOException;

public final class f1 implements a1 {
    public int A;
    public boolean B;
    public final h1 C;

    public f1(h1 h1Var) {
        this.C = h1Var;
    }

    @Override
    public final void a() throws IOException {
        h1 h1Var = this.C;
        if (h1Var.K) {
            return;
        }
        h1Var.I.a();
    }

    @Override
    public final boolean b() {
        return this.C.L;
    }

    public final void c() {
        if (this.B) {
            return;
        }
        h1 h1Var = this.C;
        h1Var.E.i(androidx.media3.common.x0.h(h1Var.J.f1594n), h1Var.J, 0, (Object) null, 0L);
        this.B = true;
    }

    @Override
    public final int l(long j9) {
        c();
        if (j9 <= 0 || this.A == 2) {
            return 0;
        }
        this.A = 2;
        return 1;
    }

    @Override
    public final int n(h7.b bVar, h7.e eVar, int i10) {
        c();
        h1 h1Var = this.C;
        boolean z10 = h1Var.L;
        if (z10 && h1Var.M == null) {
            this.A = 2;
        }
        int i11 = this.A;
        if (i11 == 2) {
            eVar.a(4);
            return -4;
        }
        if ((i10 & 2) != 0 || i11 == 0) {
            bVar.B = h1Var.J;
            this.A = 1;
            return -5;
        }
        if (!z10) {
            return -3;
        }
        h1Var.M.getClass();
        eVar.a(1);
        eVar.G = 0L;
        if ((i10 & 4) == 0) {
            eVar.s(h1Var.N);
            eVar.E.put(h1Var.M, 0, h1Var.N);
        }
        if ((i10 & 1) == 0) {
            this.A = 2;
        }
        return -4;
    }
}
