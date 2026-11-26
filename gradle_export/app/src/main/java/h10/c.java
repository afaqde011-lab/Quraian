package h10;

import e30.a1;
import e30.m0;
import g00.b0;
import g10.p;
import h00.q;
import h00.r;
import h00.x;
import j10.e0;
import j10.n0;
import j10.o;
import j10.s0;
import j10.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m10.p0;
import x20.n;

public final class c extends m10.b {
    public static final n20.b L = new n20.b(p.l, n20.e.e("Function"));
    public static final n20.b M = new n20.b(p.i, n20.e.e("KFunction"));
    public final d30.l E;
    public final e0 F;
    public final k G;
    public final int H;
    public final b I;
    public final e J;
    public final List K;

    public c(d30.l lVar, b30.c containingDeclaration, k kVar, int i) {
        super(lVar, kVar.a(i));
        kotlin.jvm.internal.m.e(containingDeclaration, "containingDeclaration");
        this.E = lVar;
        this.F = containingDeclaration;
        this.G = kVar;
        this.H = i;
        this.I = new b(this);
        this.J = new e(lVar, this);
        ArrayList arrayList = new ArrayList();
        z00.e eVar = new z00.e(1, i, 1);
        ArrayList arrayList2 = new ArrayList(r.q0(eVar, 10));
        Iterator it = eVar.iterator();
        while (true) {
            z00.d dVar = (z00.d) it;
            if (!dVar.C) {
                break;
            }
            int iNextInt = dVar.nextInt();
            arrayList.add(p0.b1(this, a1.D, n20.e.e("P" + iNextInt), arrayList.size(), this.E));
            arrayList2.add(b0.a);
        }
        arrayList.add(p0.b1(this, a1.E, n20.e.e("R"), arrayList.size(), this.E));
        this.K = q.n1(arrayList);
        hb.f fVar = d.A;
        k functionTypeKind = this.G;
        fVar.getClass();
        kotlin.jvm.internal.m.e(functionTypeKind, "functionTypeKind");
        if (functionTypeKind.equals(g.c) || functionTypeKind.equals(j.c) || functionTypeKind.equals(h.c)) {
            return;
        }
        functionTypeKind.equals(i.c);
    }

    @Override
    public final n C(f30.f fVar) {
        return this.J;
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
    public final n K() {
        return x20.m.b;
    }

    @Override
    public final m0 f() {
        return this.I;
    }

    @Override
    public final y g() {
        return y.E;
    }

    @Override
    public final k10.h getAnnotations() {
        return k10.g.a;
    }

    @Override
    public final j10.f getKind() {
        return j10.f.B;
    }

    @Override
    public final o getVisibility() {
        o PUBLIC = j10.p.e;
        kotlin.jvm.internal.m.d(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override
    public final Collection i() {
        return x.A;
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
        return false;
    }

    @Override
    public final j10.k l() {
        return this.F;
    }

    @Override
    public final n0 o() {
        return n0.n;
    }

    @Override
    public final List p() {
        return this.K;
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
        String strB = getName().b();
        kotlin.jvm.internal.m.d(strB, "asString(...)");
        return strB;
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
