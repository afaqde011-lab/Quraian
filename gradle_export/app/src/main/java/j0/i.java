package j0;

import com.google.android.gms.cast.Cast;
import l0.j0;
import l1.g0;
import l1.r1;

public final class i implements j0 {

    public final v f7756a;

    public final h f7757b;

    public final b f7758c;

    public final c50.h f7759d;

    public i(v vVar, h hVar, b bVar, c50.h hVar2) {
        this.f7756a = vVar;
        this.f7757b = hVar;
        this.f7758c = bVar;
        this.f7759d = hVar2;
    }

    @Override
    public final int a() {
        return this.f7757b.k().B;
    }

    @Override
    public final Object b(int i10) {
        Object objM = this.f7759d.m(i10);
        return objM == null ? this.f7757b.l(i10) : objM;
    }

    @Override
    public final Object c(int i10) {
        return this.f7757b.j(i10);
    }

    @Override
    public final void d(int i10, Object obj, l1.j jVar, int i11) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-462424778);
        int i12 = (g0Var.e(i10) ? 4 : 2) | i11 | (g0Var.i(obj) ? 32 : 16) | (g0Var.g(this) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        if (g0Var.S(i12 & 1, (i12 & 147) != 146)) {
            l0.q.b(obj, i10, this.f7756a.f7833s, v1.d.d(-824725566, new androidx.media3.cast.e(this, i10, 2), g0Var), g0Var, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112));
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.l(this, i10, obj, i11, 6);
        }
    }

    @Override
    public final int e(Object obj) {
        return this.f7759d.l(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f7757b, ((i) obj).f7757b);
    }

    public final int hashCode() {
        return this.f7757b.hashCode();
    }
}
