package z2;

import android.os.Handler;
import android.view.ViewGroup;
import b3.p2;
import c3.u3;
import java.util.List;
import kotlin.KotlinNothingValueException;

public final class q0 implements l1.f {
    public final b3.l0 A;
    public l1.n B;
    public x1 C;
    public int D;
    public int E;
    public final u.i0 F;
    public final u.i0 G;
    public final l0 H;
    public final i0 I;
    public final u.i0 J;
    public final u.u0 K;
    public final u.i0 L;
    public final m1.e M;
    public int N;
    public int O;
    public final String P;

    public q0(b3.l0 l0Var, x1 x1Var) {
        this.A = l0Var;
        this.C = x1Var;
        long[] jArr = u.q0.f14885a;
        this.F = new u.i0();
        this.G = new u.i0();
        this.H = new l0(this);
        this.I = new i0(this);
        this.J = new u.i0();
        this.K = new u.u0();
        this.L = new u.i0();
        this.M = new m1.e(0, new Object[16]);
        this.P = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static final void c(q0 q0Var, Object obj) {
        b3.l0 l0Var = q0Var.A;
        q0Var.h();
        b3.l0 l0Var2 = (b3.l0) q0Var.J.k(obj);
        if (l0Var2 != null) {
            if (q0Var.O <= 0) {
                y2.a.c("No pre-composed items to dispose");
            }
            int i10 = ((m1.e) ((m1.b) l0Var.p()).B).i(l0Var2);
            if (i10 < ((m1.e) ((m1.b) l0Var.p()).B).C - q0Var.O) {
                y2.a.c("Item is not in pre-composed item range");
            }
            q0Var.N++;
            q0Var.O--;
            j0 j0Var = (j0) q0Var.F.g(l0Var2);
            if (j0Var != null) {
                e(j0Var);
            }
            int i11 = (((m1.e) ((m1.b) l0Var.p()).B).C - q0Var.O) - q0Var.N;
            q0Var.k(i10, i11);
            q0Var.g(i11);
        }
        if (q0Var.M.h(obj)) {
            b3.l0.X(l0Var, true, 6);
        }
    }

    public static void e(j0 j0Var) {
        u.j0 j0Var2;
        l1.k1 k1Var = j0Var.f17123f;
        if (k1Var != null) {
            k1Var.f9887h.set(l1.l1.B);
            v1.i iVar = k1Var.f9890k;
            if (iVar.f15338d.h()) {
                j0Var2 = iVar.f15338d;
                u.j0 j0Var3 = u.r0.f14890a;
                iVar.f15338d = new u.j0();
                iVar.f15337c.g();
            } else {
                j0Var2 = null;
            }
            iVar.b();
            l1.p pVar = k1Var.f9880a;
            pVar.Q = null;
            if (j0Var2 != null) {
                pVar.U.f15345k = j0Var2;
                pVar.W = 2;
            }
            j0Var.f17123f = null;
            l1.p pVar2 = j0Var.f17120c;
            if (pVar2 != null) {
                pVar2.dispose();
            }
            j0Var.f17120c = null;
        }
    }

    @Override
    public final void a() {
        l1.p pVar;
        b3.l0 l0Var = this.A;
        l0Var.R = true;
        u.i0 i0Var = this.F;
        Object[] objArr = i0Var.f14858c;
        long[] jArr = i0Var.f14856a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128 && (pVar = ((j0) objArr[(i10 << 3) + i12]).f17120c) != null) {
                            pVar.dispose();
                        }
                        j9 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        l0Var.R();
        l0Var.R = false;
        i0Var.a();
        this.G.a();
        this.O = 0;
        this.N = 0;
        this.J.a();
        h();
    }

    @Override
    public final void b() {
        j(true);
    }

    public final void d(j0 j0Var, boolean z10) {
        l1.k1 k1Var = j0Var.f17123f;
        if (k1Var != null) {
            z1.f fVarF = z1.q.f();
            u00.k kVarE = fVarF != null ? fVarF.e() : null;
            z1.f fVarK = z1.q.k(fVarF);
            try {
                b3.l0 l0Var = this.A;
                l0Var.R = true;
                if (z10) {
                    while (!k1Var.c()) {
                        try {
                            k1Var.e(new uh.k(15));
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                k1Var.a();
                j0Var.f17123f = null;
                l0Var.R = false;
                z1.q.n(fVarF, fVarK, kVarE);
            } catch (Throwable th3) {
                z1.q.n(fVarF, fVarK, kVarE);
                throw th3;
            }
        }
    }

    public final t1 f(Object obj) {
        return !this.A.J() ? new o0() : new p0(this, obj);
    }

    public final void g(int i10) {
        boolean z10;
        boolean z11 = false;
        this.N = 0;
        List listP = this.A.p();
        m1.b bVar = (m1.b) listP;
        int i11 = (((m1.e) bVar.B).C - this.O) - 1;
        if (i10 <= i11) {
            this.K.clear();
            if (i10 <= i11) {
                int i12 = i10;
                while (true) {
                    Object objG = this.F.g((b3.l0) bVar.get(i12));
                    kotlin.jvm.internal.m.b(objG);
                    ((u.f0) this.K.B).a(((j0) objG).f17118a);
                    if (i12 == i11) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.C.g(this.K);
            z1.f fVarF = z1.q.f();
            u00.k kVarE = fVarF != null ? fVarF.e() : null;
            z1.f fVarK = z1.q.k(fVarF);
            z10 = false;
            while (i11 >= i10) {
                try {
                    b3.l0 l0Var = (b3.l0) ((m1.b) listP).get(i11);
                    Object objG2 = this.F.g(l0Var);
                    kotlin.jvm.internal.m.b(objG2);
                    j0 j0Var = (j0) objG2;
                    Object obj = j0Var.f17118a;
                    if (((u.f0) this.K.B).c(obj)) {
                        this.N++;
                        if (((Boolean) j0Var.f17124g.getValue()).booleanValue()) {
                            b3.q0 q0Var = l0Var.f2060h0;
                            b3.c1 c1Var = q0Var.f2122p;
                            b3.h0 h0Var = b3.h0.C;
                            c1Var.L = h0Var;
                            b3.y0 y0Var = q0Var.f2123q;
                            if (y0Var != null) {
                                y0Var.J = h0Var;
                            }
                            m(j0Var, false);
                            if (j0Var.f17125h) {
                                z10 = true;
                            }
                        }
                    } else {
                        b3.l0 l0Var2 = this.A;
                        l0Var2.R = true;
                        this.F.k(l0Var);
                        l1.p pVar = j0Var.f17120c;
                        if (pVar != null) {
                            pVar.dispose();
                        }
                        this.A.S(i11, 1);
                        l0Var2.R = false;
                    }
                    this.G.k(obj);
                    i11--;
                } catch (Throwable th2) {
                    z1.q.n(fVarF, fVarK, kVarE);
                    throw th2;
                }
            }
            z1.q.n(fVarF, fVarK, kVarE);
        } else {
            z10 = false;
        }
        if (z10) {
            synchronized (z1.l.f17038c) {
                u.j0 j0Var2 = z1.l.f17045j.f17005h;
                if (j0Var2 != null && j0Var2.h()) {
                    z11 = true;
                }
            }
            if (z11) {
                z1.l.a();
            }
        }
        h();
    }

    public final void h() {
        int i10 = ((m1.e) ((m1.b) this.A.p()).B).C;
        u.i0 i0Var = this.F;
        if (i0Var.f14860e != i10) {
            y2.a.a("Inconsistency between the count of nodes tracked by the state (" + i0Var.f14860e + ") and the children count on the SubcomposeLayout (" + i10 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i10 - this.N) - this.O < 0) {
            StringBuilder sbQ = oi.k.q("Incorrect state. Total children ", i10, ". Reusable children ");
            sbQ.append(this.N);
            sbQ.append(". Precomposed children ");
            sbQ.append(this.O);
            y2.a.a(sbQ.toString());
        }
        u.i0 i0Var2 = this.J;
        if (i0Var2.f14860e == this.O) {
            return;
        }
        y2.a.a("Incorrect state. Precomposed children " + this.O + ". Map size " + i0Var2.f14860e);
    }

    @Override
    public final void i() {
        j(false);
    }

    public final void j(boolean z10) {
        this.O = 0;
        this.J.a();
        List listP = this.A.p();
        int i10 = ((m1.e) ((m1.b) listP).B).C;
        if (this.N != i10) {
            this.N = i10;
            z1.f fVarF = z1.q.f();
            u00.k kVarE = fVarF != null ? fVarF.e() : null;
            z1.f fVarK = z1.q.k(fVarF);
            for (int i11 = 0; i11 < i10; i11++) {
                try {
                    b3.l0 l0Var = (b3.l0) ((m1.b) listP).get(i11);
                    j0 j0Var = (j0) this.F.g(l0Var);
                    if (j0Var != null && ((Boolean) j0Var.f17124g.getValue()).booleanValue()) {
                        b3.q0 q0Var = l0Var.f2060h0;
                        b3.c1 c1Var = q0Var.f2122p;
                        b3.h0 h0Var = b3.h0.C;
                        c1Var.L = h0Var;
                        b3.y0 y0Var = q0Var.f2123q;
                        if (y0Var != null) {
                            y0Var.J = h0Var;
                        }
                        m(j0Var, z10);
                        j0Var.f17118a = d0.f17098a;
                    }
                } catch (Throwable th2) {
                    z1.q.n(fVarF, fVarK, kVarE);
                    throw th2;
                }
            }
            z1.q.n(fVarF, fVarK, kVarE);
            this.G.a();
        }
        h();
    }

    public final void k(int i10, int i11) {
        b3.l0 l0Var = this.A;
        l0Var.R = true;
        l0Var.N(i10, i11, 1);
        l0Var.R = false;
    }

    public final void l(Object obj, u00.n nVar, boolean z10) {
        b3.l0 l0Var = this.A;
        if (l0Var.J()) {
            h();
            if (this.G.c(obj)) {
                return;
            }
            this.L.k(obj);
            u.i0 i0Var = this.J;
            Object objG = i0Var.g(obj);
            if (objG == null) {
                objG = o(obj);
                if (objG != null) {
                    k(((m1.e) ((m1.b) l0Var.p()).B).i(objG), ((m1.e) ((m1.b) l0Var.p()).B).C);
                    this.O++;
                } else {
                    int i10 = ((m1.e) ((m1.b) l0Var.p()).B).C;
                    b3.l0 l0Var2 = new b3.l0(2);
                    l0Var.R = true;
                    l0Var.D(i10, l0Var2);
                    l0Var.R = false;
                    this.O++;
                    objG = l0Var2;
                }
                i0Var.m(obj, objG);
            }
            n((b3.l0) objG, obj, z10, nVar);
        }
    }

    public final void m(j0 j0Var, boolean z10) {
        l1.p pVar;
        if (z10 || !j0Var.f17125h) {
            j0Var.f17124g = l1.q.z(Boolean.FALSE);
        } else {
            j0Var.f17124g.setValue(Boolean.FALSE);
        }
        if (j0Var.f17123f != null) {
            e(j0Var);
            return;
        }
        if (z10) {
            l1.p pVar2 = j0Var.f17120c;
            if (pVar2 != null) {
                pVar2.o();
                return;
            }
            return;
        }
        b3.y1 outOfFrameExecutor = ((c3.z) b3.p0.a(this.A)).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (j0Var.f17125h || (pVar = j0Var.f17120c) == null) {
                return;
            }
            pVar.o();
            return;
        }
        q1 q1Var = new q1(j0Var, 1);
        c3.z zVar = (c3.z) outOfFrameExecutor;
        h00.m mVar = zVar.I;
        boolean zIsEmpty = mVar.isEmpty();
        mVar.addLast(q1Var);
        if (zIsEmpty) {
            Handler handler = zVar.getHandler();
            if (handler == null) {
                throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
            handler.postAtFrontOfQueue(zVar.J);
        }
    }

    public final void n(b3.l0 l0Var, Object obj, boolean z10, u00.n nVar) {
        boolean z11;
        l1.p pVar;
        u.i0 i0Var = this.F;
        Object objG = i0Var.g(l0Var);
        Object obj2 = objG;
        if (objG == null) {
            v1.c cVar = n.f17140a;
            j0 j0Var = new j0();
            j0Var.f17118a = obj;
            j0Var.f17119b = cVar;
            j0Var.f17120c = null;
            j0Var.f17124g = l1.q.z(Boolean.TRUE);
            i0Var.m(l0Var, j0Var);
            obj2 = j0Var;
        }
        j0 j0Var2 = (j0) obj2;
        boolean z12 = j0Var2.f17119b != nVar;
        if (j0Var2.f17123f != null) {
            if (z12) {
                e(j0Var2);
            } else if (z10) {
                return;
            } else {
                d(j0Var2, true);
            }
        }
        l1.p pVar2 = j0Var2.f17120c;
        if (pVar2 != null) {
            synchronized (pVar2.D) {
                z11 = pVar2.N.f14860e > 0;
            }
        } else {
            z11 = true;
        }
        if (z12 || z11 || j0Var2.f17121d) {
            j0Var2.f17119b = nVar;
            if (j0Var2.f17123f != null) {
                y2.a.a("new subcompose call while paused composition is still active");
            }
            z1.f fVarF = z1.q.f();
            u00.k kVarE = fVarF != null ? fVarF.e() : null;
            z1.f fVarK = z1.q.k(fVarF);
            try {
                b3.l0 l0Var2 = this.A;
                l0Var2.R = true;
                l1.p pVar3 = j0Var2.f17120c;
                l1.n nVar2 = this.B;
                if (nVar2 == null) {
                    y2.a.d("parent composition reference not set");
                    throw new KotlinNothingValueException();
                }
                if (pVar3 == null) {
                    if (z10) {
                        ViewGroup.LayoutParams layoutParams = u3.f2764a;
                        pVar = new l1.p(nVar2, new p2(l0Var));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = u3.f2764a;
                        pVar = new l1.p(nVar2, new p2(l0Var));
                    }
                    pVar3 = pVar;
                } else {
                    if (pVar3.W == 3) {
                        if (z10) {
                            ViewGroup.LayoutParams layoutParams3 = u3.f2764a;
                            pVar = new l1.p(nVar2, new p2(l0Var));
                        } else {
                            ViewGroup.LayoutParams layoutParams4 = u3.f2764a;
                            pVar = new l1.p(nVar2, new p2(l0Var));
                        }
                        pVar3 = pVar;
                    }
                }
                j0Var2.f17120c = pVar3;
                u00.n cVar2 = j0Var2.f17119b;
                if (((c3.z) b3.p0.a(this.A)).getOutOfFrameExecutor() != null) {
                    j0Var2.f17125h = false;
                } else {
                    j0Var2.f17125h = true;
                    cVar2 = new v1.c(new b3.l1(j0Var2, cVar2, 5), 1524156494, true);
                }
                if (z10) {
                    if (j0Var2.f17122e) {
                        pVar3.l();
                        pVar3.s();
                        j0Var2.f17123f = pVar3.n(true, cVar2);
                    } else {
                        j0Var2.f17123f = pVar3.n(pVar3.l(), cVar2);
                    }
                } else if (j0Var2.f17122e) {
                    pVar3.l();
                    pVar3.s();
                    l1.g0 g0Var = pVar3.V;
                    g0Var.f9865z = 0;
                    g0Var.f9864y = true;
                    pVar3.A.a(pVar3, cVar2);
                    g0Var.u();
                } else {
                    pVar3.A(cVar2);
                }
                j0Var2.f17122e = false;
                l0Var2.R = false;
                z1.q.n(fVarF, fVarK, kVarE);
                j0Var2.f17121d = false;
            } catch (Throwable th2) {
                z1.q.n(fVarF, fVarK, kVarE);
                throw th2;
            }
        }
    }

    public final b3.l0 o(Object obj) {
        u.i0 i0Var;
        int i10;
        if (this.N == 0) {
            return null;
        }
        m1.b bVar = (m1.b) this.A.p();
        int i11 = ((m1.e) bVar.B).C - this.O;
        int i12 = i11 - this.N;
        int i13 = i11 - 1;
        int i14 = i13;
        while (true) {
            i0Var = this.F;
            if (i14 < i12) {
                i10 = -1;
                break;
            }
            Object objG = i0Var.g((b3.l0) bVar.get(i14));
            kotlin.jvm.internal.m.b(objG);
            if (kotlin.jvm.internal.m.a(((j0) objG).f17118a, obj)) {
                i10 = i14;
                break;
            }
            i14--;
        }
        if (i10 == -1) {
            while (true) {
                if (i13 < i12) {
                    i14 = i13;
                    break;
                }
                Object objG2 = i0Var.g((b3.l0) bVar.get(i13));
                kotlin.jvm.internal.m.b(objG2);
                j0 j0Var = (j0) objG2;
                Object obj2 = j0Var.f17118a;
                if (obj2 == d0.f17098a || this.C.e(obj, obj2)) {
                    j0Var.f17118a = obj;
                    i14 = i13;
                    i10 = i14;
                    break;
                }
                i13--;
            }
        }
        if (i10 == -1) {
            return null;
        }
        if (i14 != i12) {
            k(i14, i12);
        }
        this.N--;
        b3.l0 l0Var = (b3.l0) bVar.get(i12);
        Object objG3 = i0Var.g(l0Var);
        kotlin.jvm.internal.m.b(objG3);
        j0 j0Var2 = (j0) objG3;
        j0Var2.f17124g = l1.q.z(Boolean.TRUE);
        j0Var2.f17122e = true;
        j0Var2.f17121d = true;
        return l0Var;
    }
}
