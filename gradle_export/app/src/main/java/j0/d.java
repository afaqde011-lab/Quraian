package j0;

import java.util.List;
import ri.t1;

public final class d implements l0.u {

    public final v f7750a;

    public d(v vVar) {
        this.f7750a = vVar;
    }

    @Override
    public final int a() {
        return this.f7750a.h().f7782n;
    }

    @Override
    public final int b() {
        return Math.min(a() - 1, ((o) h00.q.T0((List) this.f7750a.h().f7781k)).f7786a);
    }

    @Override
    public final int c() {
        int i10;
        v vVar = this.f7750a;
        if (vVar.h().f7781k.isEmpty()) {
            return 0;
        }
        int iZ = t1.z(vVar.h());
        int iT = kh.o.T(vVar.h());
        if (iT != 0 && (i10 = iZ / iT) >= 1) {
            return i10;
        }
        return 1;
    }

    @Override
    public final boolean d() {
        return !this.f7750a.h().f7781k.isEmpty();
    }

    @Override
    public final int e() {
        return Math.max(0, this.f7750a.f7821e.f7808b.h());
    }
}
