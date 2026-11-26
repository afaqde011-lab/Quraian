package t7;

import s7.a1;
import s7.z0;

public final class f implements a1 {
    public final h A;
    public final z0 B;
    public final int C;
    public boolean D;
    public final h E;

    public f(h hVar, h hVar2, z0 z0Var, int i10) {
        this.E = hVar;
        this.A = hVar2;
        this.B = z0Var;
        this.C = i10;
    }

    @Override
    public final void a() {
    }

    @Override
    public final boolean b() {
        h hVar = this.E;
        return !hVar.y() && this.B.s(hVar.Y);
    }

    public final void c() {
        if (this.D) {
            return;
        }
        h hVar = this.E;
        c50.h hVar2 = hVar.G;
        int[] iArr = hVar.B;
        int i10 = this.C;
        hVar2.i(iArr[i10], hVar.C[i10], 0, (Object) null, hVar.T);
        this.D = true;
    }

    @Override
    public final int l(long j9) {
        h hVar = this.E;
        if (hVar.y()) {
            return 0;
        }
        boolean z10 = hVar.Y;
        z0 z0Var = this.B;
        int iR = z0Var.r(z10, j9);
        a aVar = hVar.V;
        if (aVar != null) {
            iR = Math.min(iR, aVar.a(this.C + 1) - z0Var.p());
        }
        z0Var.z(iR);
        if (iR > 0) {
            c();
        }
        return iR;
    }

    @Override
    public final int n(h7.b bVar, h7.e eVar, int i10) {
        h hVar = this.E;
        if (hVar.y()) {
            return -3;
        }
        a aVar = hVar.V;
        z0 z0Var = this.B;
        if (aVar != null && aVar.a(this.C + 1) <= z0Var.p()) {
            return -3;
        }
        c();
        return z0Var.v(bVar, eVar, i10, hVar.Y);
    }
}
