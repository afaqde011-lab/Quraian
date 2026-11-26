package d00;

import a1.e1;
import android.content.Context;
import android.os.Trace;
import android.view.View;
import android.view.WindowId;
import b3.o2;
import b3.p1;
import b3.v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l1.i1;
import ri.t1;

public final class n0 extends b2.q implements b3.j, b3.p, b3.x, v1, b3.o, o2 {
    public x0 O;
    public u00.k P;
    public boolean R;
    public final u.e0 V;
    public long W;
    public long X;
    public long Y;
    public WindowId Z;
    public final Object a0;
    public List b0;
    public final g00.p c0;
    public c1 d0;
    public final Object e0;
    public androidx.datastore.core.a f0;
    public int Q = 16;
    public final s0 S = s0.a;
    public long T = 9205357640488583168L;
    public h2.c U = h2.c.e;

    public n0(x0 x0Var, u00.k kVar) {
        this.O = x0Var;
        this.P = kVar;
        u.e0 e0Var = new u.e0();
        e0Var.a = u.q0.a;
        e0Var.b = v.a.c;
        e0Var.c = u.p.a;
        e0Var.c(u.q0.d(6));
        this.V = e0Var;
        this.W = 9205357640488583168L;
        this.X = 9205357640488583168L;
        this.Y = 0L;
        g00.i iVar = g00.i.C;
        final int i = 0;
        this.a0 = rd.a.I(iVar, new u00.a(this) {
            public final n0 B;

            {
                this.B = this;
            }

            @Override
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new r0(this.B);
                    default:
                        return new i0(this.B);
                }
            }
        });
        this.b0 = h00.x.A;
        this.c0 = rd.a.J(new a2.f(19));
        this.d0 = b.a;
        final int i2 = 1;
        this.e0 = rd.a.I(iVar, new u00.a(this) {
            public final n0 B;

            {
                this.B = this;
            }

            @Override
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new r0(this.B);
                    default:
                        return new i0(this.B);
                }
            }
        });
    }

    public final c B1() {
        return (c) this.c0.getValue();
    }

    public final r0 C1() {
        return (r0) this.a0.getValue();
    }

    public final void D1(z2.a0 a0Var) {
        u0 u0Var;
        if (((b2.q) this).N) {
            x0 x0Var = this.O;
            if (x0Var == null || (u0Var = (u0) x0Var.b.getValue()) == null) {
                u0Var = u0.A;
            }
            long jE = h0.e(a0Var, u0Var);
            if (!h2.b.b(jE, this.T)) {
                this.Q |= 2;
                this.T = jE;
            }
            long jM0 = kh.n.m0(a0Var.p());
            if (!h2.e.a(jM0, this.W)) {
                this.Q |= 8;
                this.W = jM0;
            }
            this.Z = ((View) b3.m.h(this, c3.o0.f)).getWindowId();
            z2.a0 a0VarI = z2.d0.i(a0Var);
            h2.c cVarG = bi.b.g(h0.e(a0VarI, u0Var), kh.n.m0(a0VarI.p()));
            if (!cVarG.equals(this.U)) {
                this.Q |= 2;
                this.U = cVarG;
            }
            J1();
        }
    }

    public final void E1(e00.d dVar) {
        if (dVar.equals(this.d0)) {
            return;
        }
        try {
            q0.b(this, this.d0);
        } catch (Throwable th) {
            t1.s(th);
        }
        this.d0 = dVar;
        q0.a(this, dVar);
    }

    public final void F1(List list) {
        ?? r2;
        if (list.equals(this.b0)) {
            return;
        }
        this.Q |= 16;
        Iterator it = this.b0.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            r2 = this.e0;
            if (!zHasNext) {
                break;
            } else {
                ((c) it.next()).e.remove((i0) r2.getValue());
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((c) it2.next()).e.add((i0) r2.getValue());
        }
        this.b0 = list;
    }

    public final void G1(long j) {
        if (h2.b.b(j, this.Y)) {
            return;
        }
        this.Q |= 64;
        this.Y = j;
    }

    public final void H1(long j) {
        if (h2.e.a(j, this.X)) {
            return;
        }
        this.Q |= 32;
        this.X = j;
    }

    public final void I1() {
        throw new UnsupportedOperationException("Method not decompiled: d00.n0.I1():void");
    }

    public final void J0() {
        b3.m.t(this, new av.k(0, this, n0.class, "updateEffect", "updateEffect()V", 0, 4));
    }

    public final void J1() {
        boolean z;
        List list;
        Iterator it;
        Iterator it2;
        Iterator it3;
        kh.o.n("HazeEffectNode-updateEffect");
        try {
            if (((b2.q) this).N) {
                this.d0.i(C1());
                this.Z = ((View) b3.m.h(this, c3.o0.f)).getWindowId();
                x0 x0Var = this.O;
                if (x0Var != null) {
                }
                x0 x0Var2 = this.O;
                if (x0Var2 != null) {
                }
                u00.k kVar = this.P;
                if (kVar != null) {
                    kVar.invoke(this);
                }
                x0 x0Var3 = this.O;
                ?? r2 = this.e0;
                if (x0Var3 != null) {
                    h00.x xVar = x0Var3.c;
                    if ((this.Q & 16) == 16) {
                        Iterator it4 = this.b0.iterator();
                        while (it4.hasNext()) {
                            ((c) it4.next()).e.remove((i0) r2.getValue());
                        }
                        o2 o2VarJ = b3.m.j(this, y0.B);
                        w0 w0Var = o2VarJ instanceof w0 ? (w0) o2VarJ : null;
                        if (w0Var == null || !kotlin.jvm.internal.m.a(w0Var.P, this.O)) {
                            w0Var = null;
                        }
                        if (xVar == null) {
                            xVar = h00.x.A;
                        }
                        q30.f fVar = new q30.f(h00.q.D0(xVar), true, new l0(this, w0Var));
                        ArrayList arrayList = new ArrayList();
                        Iterator it5 = fVar.iterator();
                        while (true) {
                            q30.e eVar = (q30.e) it5;
                            if (!eVar.hasNext()) {
                                break;
                            } else {
                                arrayList.add(eVar.next());
                            }
                        }
                        if (arrayList.size() > 1) {
                            h00.u.t0(arrayList, new m0());
                        }
                        F1(arrayList);
                    }
                } else {
                    B1().b.setValue(new h2.e(this.W));
                    B1().c(this.T);
                    B1().d = this.Z;
                    F1(va.a.R(B1()));
                }
                if (x0Var3 != null) {
                    i1 i1Var = x0Var3.b;
                    u0 u0VarG = h0.g((u0) x0Var3.a.getValue(), this.b0, this.Z);
                    if (((u0) i1Var.getValue()) != u0VarG) {
                        i1Var.setValue(u0VarG);
                        if ((this.Q & 2043) != 0) {
                            b3.m.m(this);
                        }
                    } else {
                        if ((this.Q & q0.c) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            I1();
                        }
                        list = this.b0;
                        if (list != null || !list.isEmpty()) {
                            it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!kotlin.jvm.internal.m.a(((c) it.next()).d, this.Z)) {
                                        it2 = this.b0.iterator();
                                        while (it2.hasNext()) {
                                            ((c) it2.next()).e.add((i0) r2.getValue());
                                        }
                                    }
                                }
                                if ((this.Q & q0.b) != 0) {
                                    long j = 9205357640488583168L;
                                    if (x0Var3 == null && !this.b0.isEmpty()) {
                                        long j2 = this.W;
                                        if (j2 != 9205357640488583168L) {
                                            long j3 = this.T;
                                            if ((j3 & 9223372034707292159L) != 9205357640488583168L) {
                                                h2.c cVarE = this.d0.e(bi.b.g(j3, j2), b3.m.y(this).Z);
                                                if (this.d0.g()) {
                                                    float fMax = Float.NEGATIVE_INFINITY;
                                                    float fMin = Float.POSITIVE_INFINITY;
                                                    float fMin2 = Float.POSITIVE_INFINITY;
                                                    float fMax2 = Float.NEGATIVE_INFINITY;
                                                    for (c cVar : this.b0) {
                                                        h2.c cVarG = (((h2.e) cVar.b.getValue()).a == j || (cVar.b() & 9223372034707292159L) == j) ? null : bi.b.g(cVar.b(), ((h2.e) cVar.b.getValue()).a);
                                                        if (cVarG != null) {
                                                            fMin = Math.min(fMin, cVarG.a);
                                                            fMin2 = Math.min(fMin2, cVarG.b);
                                                            fMax = Math.max(fMax, cVarG.c);
                                                            fMax2 = Math.max(fMax2, cVarG.d);
                                                        }
                                                        j = j;
                                                    }
                                                    cVarE = new h2.c(Math.max(cVarE.a, fMin), Math.max(cVarE.b, fMin2), Math.min(cVarE.c, fMax), Math.min(cVarE.d, fMax2));
                                                }
                                                h2.c cVarF = cVarE.f(this.U);
                                                float f = cVarF.c - cVarF.a;
                                                float f2 = 0.0f;
                                                if (f < 0.0f) {
                                                    f = 0.0f;
                                                }
                                                float f3 = cVarF.d - cVarF.b;
                                                if (f3 >= 0.0f) {
                                                    f2 = f3;
                                                }
                                                H1((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
                                                G1(h2.b.e(this.T, cVarF.e()));
                                            } else if (x0Var3 == null) {
                                                H1(this.W);
                                                G1(0L);
                                            } else {
                                                H1(this.W);
                                                G1(0L);
                                            }
                                        } else if (x0Var3 == null) {
                                            H1(this.W);
                                            G1(0L);
                                        } else {
                                            H1(this.W);
                                            G1(0L);
                                        }
                                    } else if (x0Var3 == null || this.W == 9205357640488583168L || this.d0.f()) {
                                        H1(this.W);
                                        G1(0L);
                                    } else {
                                        h2.c cVarG2 = bi.b.g(0L, this.W);
                                        h2.c cVarE2 = this.d0.e(cVarG2, b3.m.y(this).Z);
                                        H1(cVarE2.d());
                                        G1(h2.b.e(cVarG2.e(), cVarE2.e()));
                                    }
                                }
                                if ((this.Q & 2043) != 0) {
                                    b3.m.m(this);
                                }
                            }
                        }
                        it3 = this.b0.iterator();
                        while (it3.hasNext()) {
                            ((c) it3.next()).e.remove((i0) r2.getValue());
                        }
                        if ((this.Q & q0.b) != 0) {
                            long j4 = 9205357640488583168L;
                            if (x0Var3 == null) {
                                if (x0Var3 == null) {
                                    H1(this.W);
                                    G1(0L);
                                } else {
                                    H1(this.W);
                                    G1(0L);
                                }
                            } else if (x0Var3 == null) {
                                H1(this.W);
                                G1(0L);
                            } else {
                                H1(this.W);
                                G1(0L);
                            }
                        }
                        if ((this.Q & 2043) != 0) {
                            b3.m.m(this);
                        }
                    }
                } else {
                    if ((this.Q & q0.c) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        I1();
                    }
                    list = this.b0;
                    if (list != null) {
                        it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                it3 = this.b0.iterator();
                                while (it3.hasNext()) {
                                    ((c) it3.next()).e.remove((i0) r2.getValue());
                                }
                            } else if (!kotlin.jvm.internal.m.a(((c) it.next()).d, this.Z)) {
                                it2 = this.b0.iterator();
                                while (it2.hasNext()) {
                                    ((c) it2.next()).e.add((i0) r2.getValue());
                                }
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                it3 = this.b0.iterator();
                                while (it3.hasNext()) {
                                    ((c) it3.next()).e.remove((i0) r2.getValue());
                                }
                            } else if (!kotlin.jvm.internal.m.a(((c) it.next()).d, this.Z)) {
                                it2 = this.b0.iterator();
                                while (it2.hasNext()) {
                                    ((c) it2.next()).e.add((i0) r2.getValue());
                                }
                            }
                        }
                    }
                    if ((this.Q & q0.b) != 0) {
                        long j5 = 9205357640488583168L;
                        if (x0Var3 == null) {
                            if (x0Var3 == null) {
                                H1(this.W);
                                G1(0L);
                            } else {
                                H1(this.W);
                                G1(0L);
                            }
                        } else if (x0Var3 == null) {
                            H1(this.W);
                            G1(0L);
                        } else {
                            H1(this.W);
                            G1(0L);
                        }
                    }
                    if ((this.Q & 2043) != 0) {
                        b3.m.m(this);
                    }
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void W(p1 p1Var) {
        D1(p1Var);
    }

    public final void c1(z2.a0 coordinates) {
        kotlin.jvm.internal.m.e(coordinates, "coordinates");
        z1.f fVarF = z1.q.f();
        u00.k kVarE = fVarF != null ? fVarF.e() : null;
        z1.f fVarK = z1.q.k(fVarF);
        try {
            if ((this.T & 9223372034707292159L) == 9205357640488583168L) {
                D1(coordinates);
            }
        } finally {
            z1.q.n(fVarF, fVarK, kVarE);
        }
    }

    public final void i(b3.o0 o0Var) {
        try {
            if (((b2.q) this).N) {
                Iterator it = this.b0.iterator();
                while (it.hasNext()) {
                    if (((c) it.next()).g) {
                        throw new IllegalArgumentException("Modifier.haze nodes can not draw Modifier.hazeChild nodes. This should not happen if you are providing correct values for zIndex on Modifier.haze. Alternatively you can use can `canDrawArea` to to filter out parent areas.");
                    }
                }
                if (this.W == 9205357640488583168L || this.X == 9205357640488583168L) {
                    h0.b(o0Var);
                } else if (this.O != null) {
                    if (!this.b0.isEmpty()) {
                        this.d0.b(o0Var, C1());
                    }
                    h0.b(o0Var);
                } else {
                    l2.b bVarA = B1().a();
                    if (bVarA == null) {
                        bVarA = b3.m.w(this).c();
                        B1().f.setValue(bVarA);
                    } else {
                        if (bVarA.s) {
                            bVarA = null;
                        }
                        if (bVarA == null) {
                            bVarA = b3.m.w(this).c();
                            B1().f.setValue(bVarA);
                        }
                    }
                    o0Var.M0(kh.n.k0(o0Var.A.b()), bVarA, new k0(o0Var, 0));
                    if (this.d0.d(C1())) {
                        rd.a.x(o0Var, bVarA);
                    }
                    this.d0.b(o0Var, C1());
                }
            }
            this.Q = 0;
            this.R = false;
        } catch (Throwable th) {
            this.Q = 0;
            this.R = false;
            throw th;
        }
    }

    public final Object o() {
        return y0.A;
    }

    public final boolean q1() {
        return false;
    }

    public final void t1() {
        q0.a(this, this.d0);
        Context context = h0.f(this);
        e1 e1Var = new e1(this, 10);
        kotlin.jvm.internal.m.e(context, "context");
        a1 a1Var = new a1(e1Var, 0);
        context.registerComponentCallbacks(a1Var);
        this.f0 = new androidx.datastore.core.a(context, a1Var, 2);
        if (((b2.q) this).N) {
            J0();
        }
    }

    public final void u1() {
        androidx.datastore.core.a aVar = this.f0;
        if (aVar != null) {
            aVar.dispose();
        }
        this.f0 = null;
        c cVarB1 = B1();
        l2.b bVarA = cVarB1.a();
        if (bVarA != null) {
            b3.m.w(this).a(bVarA);
        }
        cVarB1.f.setValue((Object) null);
        q0.b(this, this.d0);
    }
}
