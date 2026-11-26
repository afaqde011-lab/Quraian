package k9;

import android.os.Bundle;
import java.util.List;
import java.util.Objects;

public final class k3 implements z1 {
    public final k A;
    public final int B;

    public k3(k kVar, int i10) {
        this.A = kVar;
        this.B = i10;
    }

    @Override
    public final void a(int i10) {
        this.A.a(i10);
    }

    @Override
    public final void b(int i10, int i11, int i12) {
        this.A.b(i10, i11, i12);
    }

    @Override
    public final void d(int i10, a4 a4Var, androidx.media3.common.b1 b1Var) {
        this.A.g1(i10, a4Var.b(), b1Var.c());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != k3.class) {
            return false;
        }
        return Objects.equals(this.A.asBinder(), ((k3) obj).A.asBinder());
    }

    @Override
    public final void f(int i10, c4 c4Var, boolean z10, boolean z11, int i11) {
        this.A.A0(i10, c4Var.a(z10, z11).c(i11));
    }

    @Override
    public final void g() {
        com.google.android.gms.internal.measurement.z3.v(this.A);
    }

    public final int hashCode() {
        return Objects.hash(this.A.asBinder());
    }

    @Override
    public final void i(int i10, List list) {
        int i11 = this.B;
        int i12 = 0;
        k kVar = this.A;
        if (i11 >= 7) {
            fh.q0 q0VarM = fh.t0.m();
            while (i12 < list.size()) {
                q0VarM.c(((b) list.get(i12)).o());
                i12++;
            }
            kVar.O0(i10, q0VarM.g());
            return;
        }
        fh.d2 d2VarJ = b.j(list, true, true);
        fh.q0 q0VarM2 = fh.t0.m();
        while (i12 < d2VarJ.D) {
            q0VarM2.c(((b) d2VarJ.get(i12)).o());
            i12++;
        }
        kVar.k(i10, q0VarM2.g());
    }

    @Override
    public final void j(int r8, k9.q r9) {
        throw new UnsupportedOperationException("Method not decompiled: k9.k3.j(int, k9.q):void");
    }

    @Override
    public final void m(int i10, z3 z3Var) {
        this.A.D0(i10, z3Var.b(), Bundle.EMPTY);
    }

    @Override
    public final void p(int i10, int i11, String str, e1 e1Var) {
        this.A.V1(i10, str, i11, e1Var == null ? null : e1Var.b());
    }

    @Override
    public final void r(int i10, t3 t3Var, androidx.media3.common.b1 b1Var, boolean z10, boolean z11) {
        Bundle bundleT;
        int i11 = this.B;
        ta.c0.A(i11 != 0);
        boolean z12 = z10 || !b1Var.a(17);
        boolean z13 = z11 || !b1Var.a(30);
        k kVar = this.A;
        if (i11 < 2) {
            kVar.R1(i10, t3Var.q(b1Var, z10, true).t(i11), z12);
            return;
        }
        t3 t3VarQ = t3Var.q(b1Var, z10, z11);
        if (kVar instanceof d1) {
            bundleT = new Bundle();
            bundleT.putBinder(t3.f9493o0, new s3(t3VarQ));
        } else {
            bundleT = t3VarQ.t(i11);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(r3.f9409d, z12);
        bundle.putBoolean(r3.f9410e, z13);
        kVar.J0(i10, bundleT, bundle);
    }

    @Override
    public final void s(int i10, androidx.media3.common.b1 b1Var) {
        this.A.x0(i10, b1Var.c());
    }

    @Override
    public final void t(int i10, int i11, String str, e1 e1Var) {
        this.A.Y0(i10, str, i11, e1Var == null ? null : e1Var.b());
    }

    @Override
    public final void u(int i10, d4 d4Var) {
        this.A.b2(i10, d4Var.b());
    }
}
