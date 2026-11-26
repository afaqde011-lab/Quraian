package m0;

import com.google.android.gms.cast.Cast;
import l0.j0;
import l1.g0;
import l1.r1;

public final class o implements j0 {

    public final w f10353a;

    public final l0.q f10354b;

    public final c50.h f10355c;

    public o(w wVar, n nVar, c50.h hVar) {
        this.f10353a = wVar;
        this.f10354b = nVar;
        this.f10355c = hVar;
    }

    @Override
    public final int a() {
        return this.f10354b.k().B;
    }

    @Override
    public final Object b(int i10) {
        Object objM = this.f10355c.m(i10);
        return objM == null ? this.f10354b.l(i10) : objM;
    }

    @Override
    public final void d(int i10, Object obj, l1.j jVar, int i11) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1201380429);
        int i12 = (g0Var.e(i10) ? 4 : 2) | i11 | (g0Var.i(obj) ? 32 : 16) | (g0Var.g(this) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        if (g0Var.S(i12 & 1, (i12 & 147) != 146)) {
            l0.q.b(obj, i10, this.f10353a.f10407y, v1.d.d(1142237095, new androidx.media3.cast.e(this, i10, 5), g0Var), g0Var, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112));
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.l(this, i10, obj, i11, 11);
        }
    }

    @Override
    public final int e(Object obj) {
        return this.f10355c.l(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f10354b, ((o) obj).f10354b);
    }

    public final int hashCode() {
        return this.f10354b.hashCode();
    }
}
