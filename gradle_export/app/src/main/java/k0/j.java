package k0;

import com.google.android.gms.cast.Cast;
import l0.j0;
import l1.g0;
import l1.r1;

public final class j implements j0 {

    public final y f8473a;

    public final i f8474b;

    public final c50.h f8475c;

    public j(y yVar, i iVar, c50.h hVar) {
        this.f8473a = yVar;
        this.f8474b = iVar;
        this.f8475c = hVar;
    }

    @Override
    public final int a() {
        return this.f8474b.k().B;
    }

    @Override
    public final Object b(int i10) {
        Object objM = this.f8475c.m(i10);
        return objM == null ? this.f8474b.l(i10) : objM;
    }

    @Override
    public final Object c(int i10) {
        return this.f8474b.j(i10);
    }

    @Override
    public final void d(int i10, Object obj, l1.j jVar, int i11) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1493551140);
        int i12 = (g0Var.e(i10) ? 4 : 2) | i11 | (g0Var.i(obj) ? 32 : 16) | (g0Var.g(this) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        if (g0Var.S(i12 & 1, (i12 & 147) != 146)) {
            l0.q.b(obj, i10, this.f8473a.f8557q, v1.d.d(726189336, new androidx.media3.cast.e(this, i10, 4), g0Var), g0Var, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112));
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.l(this, i10, obj, i11, 7);
        }
    }

    @Override
    public final int e(Object obj) {
        return this.f8475c.l(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f8474b, ((j) obj).f8474b);
    }

    public final int hashCode() {
        return this.f8474b.hashCode();
    }
}
