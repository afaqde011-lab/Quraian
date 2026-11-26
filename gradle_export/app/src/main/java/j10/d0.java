package j10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class d0 extends m10.j {
    public final boolean G;
    public final ArrayList H;
    public final e30.i I;

    public d0(d30.l lVar, g container, n20.e eVar, boolean z, int i) {
        super(lVar, container, eVar, n0.n);
        kotlin.jvm.internal.m.e(container, "container");
        this.G = z;
        z00.e eVarI0 = ab.a0.I0(0, i);
        ArrayList arrayList = new ArrayList(h00.r.q0(eVarI0, 10));
        Iterator it = eVarI0.iterator();
        while (true) {
            z00.d dVar = (z00.d) it;
            if (!dVar.C) {
                this.H = arrayList;
                this.I = new e30.i(this, w.c(this), w50.c.g0(u20.d.j(this).d().e()), lVar);
                return;
            } else {
                int iNextInt = dVar.nextInt();
                arrayList.add(m10.p0.b1(this, e30.a1.C, n20.e.e("T" + iNextInt), iNextInt, lVar));
            }
        }
    }

    @Override
    public final x20.n C(f30.f fVar) {
        return x20.m.b;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final m10.i J() {
        return null;
    }

    @Override
    public final x20.n K() {
        return x20.m.b;
    }

    @Override
    public final e30.m0 f() {
        return this.I;
    }

    @Override
    public final y g() {
        return y.B;
    }

    @Override
    public final k10.h getAnnotations() {
        return k10.g.a;
    }

    @Override
    public final f getKind() {
        return f.A;
    }

    @Override
    public final o getVisibility() {
        o PUBLIC = p.e;
        kotlin.jvm.internal.m.d(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override
    public final Collection i() {
        return h00.z.A;
    }

    @Override
    public final boolean isExternal() {
        return false;
    }

    @Override
    public final boolean isInline() {
        return false;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final s0 j0() {
        return null;
    }

    @Override
    public final boolean k() {
        return this.G;
    }

    @Override
    public final List p() {
        return this.H;
    }

    @Override
    public final boolean p0() {
        return false;
    }

    @Override
    public final boolean s() {
        return false;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override
    public final boolean v0() {
        return false;
    }

    @Override
    public final boolean y() {
        return false;
    }
}
