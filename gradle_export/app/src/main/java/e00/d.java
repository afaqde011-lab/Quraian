package e00;

import d00.b1;
import d00.c1;
import d00.n0;
import d00.r0;
import d00.s0;
import h00.x;
import i2.o0;
import java.util.List;
import l1.i1;
import ta.c0;

public final class d implements c1 {
    public boolean a;
    public boolean b = true;
    public final i1 c = l1.q.z(new d00.a(0));
    public c d = new w(this);
    public float e = Float.NaN;
    public float f = -1.0f;
    public final long g = i2.t.g;
    public final x h = x.A;
    public final l i = l.a;
    public final float j = 1.0f;
    public final o0 k = f.b;
    public i l;
    public final i m;

    public d() {
        i iVar = i.e;
        this.l = iVar;
        this.m = iVar;
    }

    @Override
    public final void a(r0 context, b1 level) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(level, "level");
        this.d.a(context, level);
        ?? r1 = e.a;
        if (r1.isInitialized()) {
            ((u.s) r1.getValue()).h(-1);
        }
    }

    @Override
    public final void b(b3.o0 o0Var, r0 context) {
        kotlin.jvm.internal.m.e(context, "context");
        try {
            if (this.b) {
                c cVarW = c0.W(this, context, o0Var);
                if (!cVarW.equals(this.d)) {
                    if (this.a) {
                        this.d.c();
                    }
                    this.d = cVarW;
                }
                this.b = false;
            }
            this.d.b(o0Var, context);
        } finally {
            p(0);
        }
    }

    @Override
    public final void c(r0 context) {
        kotlin.jvm.internal.m.e(context, "context");
        if (this.a) {
            return;
        }
        this.a = true;
        this.d.getClass();
    }

    @Override
    public final boolean d(r0 context) {
        kotlin.jvm.internal.m.e(context, "context");
        return this.d instanceof w;
    }

    @Override
    public final h2.c e(h2.c cVar, y3.c density) {
        kotlin.jvm.internal.m.e(density, "density");
        float fK = k();
        if (Float.isNaN(fK)) {
            fK = 0;
        }
        float fA0 = density.A0(fK);
        return fA0 >= 1.0f ? new h2.c(cVar.a - fA0, cVar.b - fA0, cVar.c + fA0, cVar.d + fA0) : cVar;
    }

    @Override
    public final boolean f() {
        return this.k != null;
    }

    @Override
    public final boolean g() {
        return j() != 16 && i2.t.d(j()) < 0.9f;
    }

    @Override
    public final void h(r0 context) {
        kotlin.jvm.internal.m.e(context, "context");
        if (this.a) {
            this.a = false;
            this.d.c();
        }
    }

    @Override
    public final void i(r0 context) {
        kotlin.jvm.internal.m.e(context, "context");
        l1.t local = j.a;
        kotlin.jvm.internal.m.e(local, "local");
        n0 n0Var = context.a;
        i value = (i) b3.m.h(n0Var, local);
        kotlin.jvm.internal.m.e(value, "value");
        if (!kotlin.jvm.internal.m.a(this.l, value)) {
            i iVar = this.l;
            if (!kotlin.jvm.internal.m.a(iVar != null ? iVar.b : null, value.b)) {
                p(m() | 32);
            }
            l lVar = l.a;
            if (!kotlin.jvm.internal.m.a(iVar != null ? lVar : null, lVar)) {
                p(m() | 32);
            }
            if (!kotlin.jvm.internal.m.a(iVar != null ? new i2.t(iVar.a) : null, new i2.t(value.a))) {
                p(m() | 16);
            }
            Float fValueOf = iVar != null ? Float.valueOf(iVar.d) : null;
            float f = value.d;
            if (fValueOf == null || fValueOf.floatValue() != f) {
                p(m() | 4);
            }
            if (!kotlin.jvm.internal.m.a(iVar != null ? new y3.f(iVar.c) : null, new y3.f(value.c))) {
                p(m() | 2);
            }
            this.l = value;
        }
        if ((m() & 1023) != 0) {
            this.b = true;
            b3.m.m(n0Var);
        }
    }

    public final long j() {
        long j = this.g;
        if (j == 16) {
            j = this.m.a;
        }
        return j != 16 ? j : this.l.a;
    }

    public final float k() {
        float f = this.e;
        if (Float.isNaN(f)) {
            f = this.m.c;
        }
        return !Float.isNaN(f) ? f : this.l.c;
    }

    public final List l() {
        this.h.getClass();
        List list = this.m.b;
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            return list;
        }
        List list2 = this.l.b;
        List list3 = list2.isEmpty() ? null : list2;
        return list3 == null ? x.A : list3;
    }

    public final int m() {
        return ((d00.a) this.c.getValue()).a;
    }

    public final float n() {
        float f = this.f;
        if (0.0f > f || f > 1.0f) {
            f = this.m.d;
        }
        return (0.0f > f || f > 1.0f) ? this.l.d : f;
    }

    public final float o(s0 scale) {
        kotlin.jvm.internal.m.e(scale, "scale");
        return 1.0f;
    }

    public final void p(int i) {
        this.c.setValue(new d00.a(i));
    }
}
