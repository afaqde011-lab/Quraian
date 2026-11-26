package a1;

import android.view.KeyEvent;
import android.view.autofill.AutofillValue;
import c3.g3;
import com.google.android.gms.cast.CastDevice;
import com.google.protobuf.RuntimeVersion;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

public final class j2 extends b3.l implements b3.o, c3.n2, b3.j2, b3.p, b3.e2, t2.e, b3.j, a3.c, b3.v1, b3.x, g2.s {
    public w2 Q;
    public s2 R;
    public b1.e0 S;
    public h1.l T;
    public boolean U;
    public q0.i1 V;
    public qp.b W;
    public boolean X;
    public f0.i Y;
    public boolean Z;

    public d40.w0 f59a0;

    public final z.g0 f60b0;

    public final v2.j0 f61c0;

    public e0 f62d0;

    public final e2.g f63e0;

    public g3 f64f0;

    public a40.u1 f65g0;

    public final i f66h0;

    public final c2 f67i0;

    public final x1 f68j0;

    public a40.u1 f69k0;

    public final w1 f70l0;

    public final l1.i1 f71m0;

    public j2(w2 w2Var, s2 s2Var, b1.e0 e0Var, h1.l lVar, boolean z10, q0.i1 i1Var, qp.b bVar, boolean z11, f0.i iVar, boolean z12, d40.w0 w0Var) {
        this.Q = w2Var;
        this.R = s2Var;
        this.S = e0Var;
        this.T = lVar;
        this.U = z10;
        this.V = i1Var;
        this.W = bVar;
        this.X = z11;
        this.Y = iVar;
        this.Z = z12;
        this.f59a0 = w0Var;
        e0Var.m = new w1(this, 6);
        int i10 = 2;
        this.f60b0 = new z.g0(iVar, new x1(this, 0), i10);
        v2.j0 j0VarA = v2.f0.a(new g2(this, 0));
        B1(j0VarA);
        this.f61c0 = j0VarA;
        w1 w1Var = new w1(this, 8);
        y1 y1Var = new y1(this, 0);
        e2.g gVar = new e2.g(new b2.v(new e1(w1Var, i10), new k2(new x1(this, 1), y1Var, new x1(this, 2), new x1(this, 3), new x1(this, 4), new x1(this, 5)), 8), 1);
        B1(gVar);
        this.f63e0 = gVar;
        this.f66h0 = new i(0);
        this.f67i0 = new c2(this);
        this.f68j0 = new x1(this, 6);
        this.f70l0 = new w1(this, 7);
        this.f71m0 = l1.q.z(Boolean.FALSE);
    }

    @Override
    public final void A(v2.k kVar, v2.l lVar, long j9) {
        this.f61c0.A(kVar, lVar, j9);
    }

    public final boolean E1(int i10) {
        if (i10 == 6) {
            ((g2.n) ((g2.l) b3.m.h(this, c3.o1.f2735i))).h(1, true);
            return true;
        }
        if (i10 == 5) {
            ((g2.n) ((g2.l) b3.m.h(this, c3.o1.f2735i))).h(2, true);
            return true;
        }
        if (i10 != 7) {
            return false;
        }
        ((c3.p1) J1()).a();
        return true;
    }

    public final void F1() {
        a40.u1 u1Var = this.f69k0;
        if (u1Var != null) {
            u1Var.i((CancellationException) null);
        }
        this.f69k0 = null;
        d40.w0 w0Var = this.f59a0;
        if (w0Var != null) {
            w0Var.a();
        }
    }

    public final void G1() {
        e0 e0Var = this.f62d0;
        if (e0Var != null) {
            this.Y.b(new f0(e0Var));
            this.f62d0 = null;
        }
    }

    public final boolean H1() {
        g3 g3Var;
        return this.f60b0.V.G1().a() && (g3Var = this.f64f0) != null && ((c3.f2) g3Var).b();
    }

    public final boolean I1(int i10) {
        qp.b bVar;
        if (i10 == 0 || i10 == 1 || (bVar = this.W) == null) {
            return E1(i10);
        }
        new z1(this, i10, 0);
        switch (bVar.a) {
            case 0:
                ((u00.a) bVar.b).invoke();
                return true;
            case 1:
                ((u00.a) bVar.b).invoke();
                return true;
            default:
                c3.t2 t2Var = (c3.t2) bVar.b;
                if (t2Var != null) {
                    ((c3.p1) t2Var).a();
                }
                return true;
        }
    }

    @Override
    public final void J0() {
        b3.m.t(this, new w1(this, 4));
    }

    public final c3.t2 J1() {
        c3.t2 t2Var = (c3.t2) b3.m.h(this, c3.o1.f2741q);
        if (t2Var != null) {
            return t2Var;
        }
        throw new IllegalStateException("No software keyboard controller");
    }

    public final void K1(boolean z10) {
        if (!z10) {
            Boolean bool = this.V.f12629e;
            if (!(bool != null ? bool.booleanValue() : true)) {
                return;
            }
        }
        b0.a.a(this);
        this.f69k0 = a40.c0.y(p1(), (k00.i) null, (a40.a0) null, new b2(this, null, 5), 3);
    }

    @Override
    public final boolean O(KeyEvent keyEvent) throws NoWhenBranchMatchedException {
        boolean z10;
        float fIntBitsToFloat;
        q0.e1 e1Var;
        boolean zI1;
        boolean z11;
        q0.e1 e1Var2;
        z0.b bVar;
        x2 x2Var;
        h2.c cVarF;
        Integer numA;
        w2 w2Var = this.Q;
        s2 s2Var = this.R;
        b1.e0 e0Var = this.S;
        c3.t2 t2VarJ1 = J1();
        boolean z12 = this.U;
        boolean z13 = this.X;
        i iVar = this.f66h0;
        iVar.getClass();
        b1.i iVar2 = (b1.i) iVar.B;
        if (t2.d.c(keyEvent) == 2 && keyEvent.isFromSource(257) && (!x0.w(keyEvent) || !q0.q.A(keyEvent))) {
            e0Var.v(false);
        }
        long jA = t2.d.a(keyEvent.getKeyCode());
        if (t2.d.c(keyEvent) == 1) {
            u.a0 a0Var = (u.a0) iVar.D;
            if (a0Var != null && a0Var.a(jA)) {
                u.a0 a0Var2 = (u.a0) iVar.D;
                if (a0Var2 != null) {
                    a0Var2.e(jA);
                }
                return true;
            }
        } else if (t2.d.c(keyEvent) != 0 || q0.q.A(keyEvent)) {
            if (!q0.q.A(keyEvent) || (numA = ((q0.x0) iVar.C).a(keyEvent)) == null) {
                q0.e1 e1VarB = q0.q.f12678c.b(keyEvent);
                if (e1VarB == null || (e1VarB.A && !z12)) {
                    z10 = false;
                } else {
                    m3.n0 n0VarC = s2Var.c();
                    z2.a0 a0VarE = s2Var.e();
                    if (a0VarE == null) {
                        fIntBitsToFloat = Float.NaN;
                    } else {
                        if (!a0VarE.A()) {
                            a0VarE = null;
                        }
                        if (a0VarE == null) {
                            fIntBitsToFloat = Float.NaN;
                        } else {
                            z2.a0 a0VarB = s2Var.b();
                            if (a0VarB == null) {
                                cVarF = null;
                            } else {
                                if (!a0VarB.A()) {
                                    a0VarB = null;
                                }
                                if (a0VarB != null) {
                                    cVarF = a0VarB.F(a0VarE, true);
                                } else {
                                    cVarF = null;
                                }
                            }
                            if (cVarF != null) {
                                fIntBitsToFloat = Float.intBitsToFloat((int) (cVarF.d() & 4294967295L));
                            } else {
                                fIntBitsToFloat = Float.NaN;
                            }
                        }
                    }
                    b1.b bVar2 = new b1.b(w2Var, n0VarC, x0.w(keyEvent), fIntBitsToFloat, iVar2);
                    l1.i1 i1Var = w2Var.f139e;
                    z0.g gVar = w2Var.f135a;
                    int iOrdinal = e1VarB.ordinal();
                    String str = bVar2.f1932j;
                    switch (iOrdinal) {
                        case 0:
                            e1Var = e1VarB;
                            iVar2.f1965b = Float.NaN;
                            if (str.length() > 0) {
                                if (m3.q0.d(bVar2.f1930h)) {
                                    if (bVar2.b()) {
                                        bVar2.j();
                                    } else {
                                        bVar2.g();
                                    }
                                } else if (bVar2.b()) {
                                    int iG = m3.q0.g(bVar2.f1930h);
                                    bVar2.f1930h = m3.h0.b(iG, iG);
                                } else {
                                    int iF = m3.q0.f(bVar2.f1930h);
                                    bVar2.f1930h = m3.h0.b(iF, iF);
                                }
                            }
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2 || e1Var == q0.e1.DOWN || e1Var == q0.e1.LEFT_CHAR || e1Var == q0.e1.RIGHT_CHAR) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = zI1;
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 1:
                            e1Var = e1VarB;
                            iVar2.f1965b = Float.NaN;
                            if (str.length() > 0) {
                                if (m3.q0.d(bVar2.f1930h)) {
                                    if (bVar2.b()) {
                                        bVar2.g();
                                    } else {
                                        bVar2.j();
                                    }
                                } else if (bVar2.b()) {
                                    int iF2 = m3.q0.f(bVar2.f1930h);
                                    bVar2.f1930h = m3.h0.b(iF2, iF2);
                                } else {
                                    int iG2 = m3.q0.g(bVar2.f1930h);
                                    bVar2.f1930h = m3.h0.b(iG2, iG2);
                                }
                            }
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 2:
                            e1Var = e1VarB;
                            if (bVar2.b()) {
                                bVar2.i();
                            } else {
                                bVar2.l();
                            }
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 3:
                            e1Var = e1VarB;
                            if (bVar2.b()) {
                                bVar2.l();
                            } else {
                                bVar2.i();
                            }
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 4:
                            e1Var = e1VarB;
                            bVar2.h();
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 5:
                            e1Var = e1VarB;
                            bVar2.k();
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 6:
                            e1Var = e1VarB;
                            bVar2.p();
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 7:
                            e1Var = e1VarB;
                            bVar2.o();
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 8:
                            e1Var = e1VarB;
                            if (bVar2.b()) {
                                bVar2.p();
                            } else {
                                bVar2.o();
                            }
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 9:
                            e1Var = e1VarB;
                            if (bVar2.b()) {
                                bVar2.o();
                            } else {
                                bVar2.p();
                            }
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 10:
                            e1Var = e1VarB;
                            bVar2.q();
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 11:
                            e1Var = e1VarB;
                            bVar2.e();
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 12:
                            e1Var = e1VarB;
                            ((c3.p1) t2VarJ1).b();
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 13:
                            e1Var = e1VarB;
                            bVar2.r();
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 14:
                            e1Var = e1VarB;
                            bVar2.f();
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 15:
                            e1Var = e1VarB;
                            bVar2.n();
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 16:
                            e1Var = e1VarB;
                            bVar2.m();
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 17:
                        case TYPE_SINT64_VALUE:
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            e1Var = e1VarB;
                            this.f68j0.invoke(e1Var);
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            iVar2.f1965b = Float.NaN;
                            if (str.length() > 0) {
                                long j9 = bVar2.f1930h;
                                int i10 = m3.q0.f10519c;
                                int i11 = (int) (j9 & 4294967295L);
                                int iOffsetByCodePoints = -1;
                                if (i11 > 0) {
                                    v5.g gVarX = q0.q.x();
                                    if (gVarX != null) {
                                        int iB = gVarX.b(str, i11 - 1);
                                        if (iB >= 0) {
                                            iOffsetByCodePoints = iB;
                                        } else if (i11 > 0) {
                                            iOffsetByCodePoints = Character.offsetByCodePoints(str, i11, -1);
                                        }
                                    } else if (i11 > 0) {
                                        iOffsetByCodePoints = Character.offsetByCodePoints(str, i11, -1);
                                    }
                                }
                                long jO = kh.o.o(iOffsetByCodePoints, i11, w2Var);
                                int i12 = (int) (jO >> 32);
                                x2 x2VarR = k00.f.r(jO);
                                if (i12 != i11 || !m3.q0.d(bVar2.f1930h)) {
                                    bVar2.f1930h = m3.h0.b(i12, i12);
                                }
                                if (x2VarR != null) {
                                    bVar2.f1931i = x2VarR;
                                }
                            }
                            bVar2.a();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            bVar2.g();
                            bVar2.a();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            bVar2.l();
                            bVar2.a();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 23:
                            bVar2.i();
                            bVar2.a();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 24:
                            bVar2.p();
                            bVar2.a();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 25:
                            bVar2.o();
                            bVar2.a();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case RuntimeVersion.MINOR:
                            iVar2.f1965b = Float.NaN;
                            if (str.length() > 0) {
                                bVar2.f1930h = m3.h0.b(0, str.length());
                            }
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 27:
                            if (bVar2.b()) {
                                bVar2.j();
                            } else {
                                bVar2.g();
                            }
                            bVar2.s();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 28:
                            if (bVar2.b()) {
                                bVar2.g();
                            } else {
                                bVar2.j();
                            }
                            bVar2.s();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 29:
                            bVar2.q();
                            bVar2.s();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 30:
                            bVar2.e();
                            bVar2.s();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 31:
                            bVar2.r();
                            bVar2.s();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                            bVar2.f();
                            bVar2.s();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 33:
                            bVar2.n();
                            bVar2.s();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 34:
                            bVar2.m();
                            bVar2.s();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 35:
                            if (bVar2.b()) {
                                bVar2.l();
                            } else {
                                bVar2.i();
                            }
                            bVar2.s();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 36:
                            if (bVar2.b()) {
                                bVar2.i();
                            } else {
                                bVar2.l();
                            }
                            bVar2.s();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 37:
                            bVar2.h();
                            bVar2.s();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 38:
                            bVar2.k();
                            bVar2.s();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 39:
                            bVar2.p();
                            bVar2.s();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 40:
                            bVar2.o();
                            bVar2.s();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 41:
                            if (bVar2.b()) {
                                bVar2.p();
                            } else {
                                bVar2.o();
                            }
                            bVar2.s();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 42:
                            if (bVar2.b()) {
                                bVar2.o();
                            } else {
                                bVar2.p();
                            }
                            bVar2.s();
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 43:
                            iVar2.f1965b = Float.NaN;
                            if (str.length() > 0) {
                                long j10 = bVar2.f1930h;
                                int i13 = m3.q0.f10519c;
                                int i14 = (int) (j10 & 4294967295L);
                                bVar2.f1930h = m3.h0.b(i14, i14);
                            }
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 44:
                            if (z13) {
                                zI1 = I1(this.V.a());
                            } else {
                                w2.h(w2Var, "\n", !x0.w(keyEvent), 4);
                                zI1 = true;
                            }
                            e1Var = e1VarB;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 45:
                            if (z13) {
                                z11 = false;
                            } else {
                                w2.h(w2Var, "\t", !x0.w(keyEvent), 4);
                                z11 = true;
                            }
                            zI1 = z11;
                            e1Var = e1VarB;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 46:
                            z0.g gVar2 = gVar.f16998f.a;
                            q3.e0 e0Var2 = gVar2.f16993a;
                            c1.e eVar = (c1.e) e0Var2.B;
                            z1.p pVar = eVar.f2608b;
                            if (!pVar.isEmpty() || ((c1.d) ((l1.i1) e0Var2.C).getValue()) != null) {
                                e0Var2.k();
                                if (pVar.isEmpty()) {
                                    g0.a.c("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.");
                                }
                                Object objY0 = h00.v.y0(pVar);
                                eVar.f2609c.add(objY0);
                                c1.d dVar = (c1.d) objY0;
                                gVar2.f16994b.a().w();
                                z0.a aVar = gVar2.f16994b;
                                int i15 = dVar.f2599a;
                                aVar.c(i15, dVar.f2601c.length() + i15, dVar.f2600b);
                                long j11 = dVar.f2602d;
                                z0.h.i(aVar, (int) (j11 >> 32), (int) (j11 & 4294967295L));
                                gVar2.i(gVar2.d(), z0.a.g(gVar2.f16994b, 0L, null, 15), true);
                            }
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 47:
                            z0.g gVar3 = gVar.f16998f.a;
                            q3.e0 e0Var3 = gVar3.f16993a;
                            c1.e eVar2 = (c1.e) e0Var3.B;
                            z1.p pVar2 = eVar2.f2609c;
                            if (!pVar2.isEmpty() && ((c1.d) ((l1.i1) e0Var3.C).getValue()) == null) {
                                if (pVar2.isEmpty()) {
                                    g0.a.c("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.");
                                }
                                Object objY1 = h00.v.y0(pVar2);
                                eVar2.f2608b.add(objY1);
                                c1.d dVar2 = (c1.d) objY1;
                                gVar3.f16994b.a().w();
                                z0.a aVar2 = gVar3.f16994b;
                                int i16 = dVar2.f2599a;
                                aVar2.c(i16, dVar2.f2600b.length() + i16, dVar2.f2601c);
                                long j12 = dVar2.f2603e;
                                z0.h.i(aVar2, (int) (j12 >> 32), (int) (j12 & 4294967295L));
                                gVar3.i(gVar3.d(), z0.a.g(gVar3.f16994b, 0L, null, 15), true);
                            }
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        case 48:
                            e1Var = e1VarB;
                            zI1 = true;
                            e1Var2 = q0.e1.UP;
                            bVar = bVar2.f1928f;
                            if (e1Var != e1Var2) {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            } else {
                                z10 = !m3.q0.c(bVar.D, bVar2.f1930h);
                            }
                            if (!m3.q0.c(bVar2.f1930h, bVar.D)) {
                                w2Var.j(bVar2.f1930h);
                            }
                            x2Var = bVar2.f1931i;
                            if (x2Var != null) {
                                if (!m3.q0.d(gVar.d().D)) {
                                    i1Var.setValue(new g1(bVar2.f1929g.f45a, x2Var));
                                } else {
                                    i1Var.setValue(new g1(x2Var, x2Var));
                                }
                            }
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                String string = new StringBuilder(2).appendCodePoint(numA.intValue()).toString();
                if (z12) {
                    w2.h(w2Var, string, !x0.w(keyEvent), 4);
                    iVar2.f1965b = Float.NaN;
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                u.a0 a0Var3 = (u.a0) iVar.D;
                if (a0Var3 == null) {
                    a0Var3 = new u.a0(3);
                    iVar.D = a0Var3;
                }
                a0Var3.d(jA);
            }
            return z10;
        }
        return false;
    }

    @Override
    public final void W(b3.p1 p1Var) {
        this.R.f120e.setValue(p1Var);
        if (this.U) {
            this.f60b0.W(p1Var);
        }
    }

    @Override
    public final void X() {
        this.f61c0.X();
    }

    @Override
    public final void c1(z2.a0 a0Var) {
        this.f63e0.getClass();
    }

    @Override
    public final void d(long j9) {
        this.f63e0.R = j9;
    }

    @Override
    public final void i(b3.o0 o0Var) {
        o0Var.a();
        if (((Boolean) this.f71m0.getValue()).booleanValue()) {
            i2.q v0Var = (i2.q) b3.m.h(this, q0.g.f12614a);
            long j9 = ((i2.t) b3.m.h(this, q0.g.f12615b)).f7169a;
            if (!i2.t.c(j9, i2.b0.c(1308617531))) {
                v0Var = new i2.v0(j9);
            }
            k2.d.m0(o0Var, v0Var, 0L, 0L, 0.0f, null, 0, 126);
        }
    }

    @Override
    public final boolean i1() {
        return true;
    }

    @Override
    public final boolean k(KeyEvent keyEvent) {
        w2 w2Var = this.Q;
        b1.e0 e0Var = this.S;
        J1();
        this.f66h0.getClass();
        if (m3.q0.d(w2Var.d().D) || keyEvent.getKeyCode() != 4 || t2.d.c(keyEvent) != 1) {
            return false;
        }
        w2 w2Var2 = e0Var.f1940a;
        if (!m3.q0.d(w2Var2.d().D)) {
            z0.g gVar = w2Var2.f135a;
            h1.l lVar = w2Var2.f136b;
            c1.c cVar = c1.c.A;
            gVar.f16994b.a().w();
            z0.a aVar = gVar.f16994b;
            int i10 = (int) (aVar.D & 4294967295L);
            z0.h.i(aVar, i10, i10);
            z0.g.a(gVar, lVar, true, cVar);
            gVar.f(true);
        }
        e0Var.w(false);
        e0Var.x(b1.k0.A);
        return true;
    }

    @Override
    public final void m1(j3.a0 a0Var) {
        z0.b bVarD = this.Q.f135a.d();
        long j9 = bVarD.D;
        m3.h hVar = new m3.h(this.Q.f135a.d().C.toString());
        a10.w[] wVarArr = j3.y.f8004a;
        j3.z zVar = j3.w.F;
        a10.w[] wVarArr2 = j3.y.f8004a;
        a10.w wVar = wVarArr2[18];
        a0Var.a(zVar, hVar);
        m3.h hVar2 = new m3.h(bVarD.C.toString());
        j3.z zVar2 = j3.w.G;
        a10.w wVar2 = wVarArr2[19];
        a0Var.a(zVar2, hVar2);
        j3.z zVar3 = j3.w.H;
        a10.w wVar3 = wVarArr2[20];
        a0Var.a(zVar3, new m3.q0(j9));
        m3.q0 q0Var = this.Q.f135a.d().E;
        j3.z zVar4 = j3.w.I;
        a10.w wVar4 = wVarArr2[21];
        a0Var.a(zVar4, q0Var);
        j3.g gVar = new j3.g(((Boolean) this.Q.f135a.f16997e.getValue()).booleanValue());
        j3.z zVar5 = j3.w.M;
        a10.w wVar5 = wVarArr2[27];
        a0Var.a(zVar5, gVar);
        boolean z10 = this.U;
        g00.b0 b0Var = g00.b0.a;
        if (!z10) {
            a0Var.a(j3.w.f7987j, b0Var);
        }
        if (this.Z) {
            a0Var.a(j3.w.N, b0Var);
        }
        final boolean z11 = this.U;
        j3.z zVar6 = j3.w.Q;
        a10.w wVar6 = wVarArr2[28];
        a0Var.a(zVar6, Boolean.valueOf(z11));
        j3.y.d(a0Var, c2.k.f2615a);
        j3.y.g(a0Var, new c2.f(AutofillValue.forText(bVarD)));
        final int i10 = 0;
        j3.y.b(a0Var, new u00.k() {
            public final Object invoke(Object obj) {
                boolean z12;
                boolean z13;
                switch (i10) {
                    case 0:
                        c2.f fVar = (c2.f) obj;
                        if (z11) {
                            AutofillValue autofillValue = fVar.f2612a;
                            k00.c cVar = null;
                            CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                            j2 j2Var = this;
                            if (textValue != null) {
                                j2Var.Q.g(textValue);
                            }
                            j2Var.f71m0.setValue(Boolean.TRUE);
                            a40.c0.y(j2Var.p1(), (k00.i) null, (a40.a0) null, new b2(j2Var, cVar, 3), 3);
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        return Boolean.valueOf(z12);
                    case 1:
                        m3.h hVar3 = (m3.h) obj;
                        if (z11) {
                            this.Q.g(hVar3);
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        return Boolean.valueOf(z13);
                    default:
                        m3.h hVar4 = (m3.h) obj;
                        boolean z14 = false;
                        if (z11) {
                            w2.h(this.Q, hVar4, false, 12);
                            z14 = true;
                        }
                        return Boolean.valueOf(z14);
                }
            }
        });
        int i11 = this.V.f12627c;
        int i12 = 7;
        if (i11 == 6) {
            c2.m.f2621a.getClass();
            j3.y.f(a0Var, c2.l.f2619c);
        } else if (i11 == 7 || i11 == 8) {
            c2.m.f2621a.getClass();
            j3.y.f(a0Var, c2.l.f2618b);
        } else if (i11 == 4) {
            c2.m.f2621a.getClass();
            j3.y.f(a0Var, c2.l.f2620d);
        }
        j3.y.a(a0Var, new x1(this, i12));
        final int i13 = 2;
        final int i14 = 1;
        if (z11) {
            a0Var.a(j3.n.f7950k, new j3.a(null, new u00.k() {
                public final Object invoke(Object obj) {
                    boolean z12;
                    boolean z13;
                    switch (i14) {
                        case 0:
                            c2.f fVar = (c2.f) obj;
                            if (z11) {
                                AutofillValue autofillValue = fVar.f2612a;
                                k00.c cVar = null;
                                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                                j2 j2Var = this;
                                if (textValue != null) {
                                    j2Var.Q.g(textValue);
                                }
                                j2Var.f71m0.setValue(Boolean.TRUE);
                                a40.c0.y(j2Var.p1(), (k00.i) null, (a40.a0) null, new b2(j2Var, cVar, 3), 3);
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            return Boolean.valueOf(z12);
                        case 1:
                            m3.h hVar3 = (m3.h) obj;
                            if (z11) {
                                this.Q.g(hVar3);
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            return Boolean.valueOf(z13);
                        default:
                            m3.h hVar4 = (m3.h) obj;
                            boolean z14 = false;
                            if (z11) {
                                w2.h(this.Q, hVar4, false, 12);
                                z14 = true;
                            }
                            return Boolean.valueOf(z14);
                    }
                }
            }));
            a0Var.a(j3.n.f7952o, new j3.a(null, new u00.k() {
                public final Object invoke(Object obj) {
                    boolean z12;
                    boolean z13;
                    switch (i13) {
                        case 0:
                            c2.f fVar = (c2.f) obj;
                            if (z11) {
                                AutofillValue autofillValue = fVar.f2612a;
                                k00.c cVar = null;
                                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                                j2 j2Var = this;
                                if (textValue != null) {
                                    j2Var.Q.g(textValue);
                                }
                                j2Var.f71m0.setValue(Boolean.TRUE);
                                a40.c0.y(j2Var.p1(), (k00.i) null, (a40.a0) null, new b2(j2Var, cVar, 3), 3);
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            return Boolean.valueOf(z12);
                        case 1:
                            m3.h hVar3 = (m3.h) obj;
                            if (z11) {
                                this.Q.g(hVar3);
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            return Boolean.valueOf(z13);
                        default:
                            m3.h hVar4 = (m3.h) obj;
                            boolean z14 = false;
                            if (z11) {
                                w2.h(this.Q, hVar4, false, 12);
                                z14 = true;
                            }
                            return Boolean.valueOf(z14);
                    }
                }
            }));
        }
        a0Var.a(j3.n.f7949j, new j3.a(null, new w(this, i14)));
        int iA = this.V.a();
        j3.y.c(a0Var, iA, new z1(this, iA, i14));
        a0Var.a(j3.n.f7941b, new j3.a(null, new w1(this, 10)));
        a0Var.a(j3.n.f7942c, new j3.a(null, new w1(this, i14)));
        if (!m3.q0.d(j9) && !this.Z) {
            a0Var.a(j3.n.f7954q, new j3.a(null, new w1(this, i13)));
            if (this.U) {
                a0Var.a(j3.n.f7955r, new j3.a(null, new w1(this, 3)));
            }
        }
        if (z11) {
            a0Var.a(j3.n.f7956s, new j3.a(null, new w1(this, 9)));
        }
        h1.l lVar = this.T;
        if (lVar != null) {
            lVar.getClass();
        }
        if (this.U) {
            this.f60b0.m1(a0Var);
        }
    }

    @Override
    public final void q0(g2.p pVar) {
        z2.a0 a0VarB;
        b1.e0 e0Var = this.S;
        s2 s2Var = e0Var.f1941b;
        m3.n0 n0VarC = s2Var.c();
        h2.c cVarD = h2.c.f6545e;
        if (n0VarC != null) {
            if (e0Var.f1943d) {
                z0.b bVarD = e0Var.f1940a.d();
                if (m3.q0.d(bVarD.D)) {
                    cVarD = e0Var.c(n0VarC, bVarD);
                } else {
                    long j9 = bVarD.D;
                    if (!m3.q0.d(j9)) {
                        int i10 = (int) (j9 >> 32);
                        m3.q qVar = n0VarC.f10497b;
                        int iD = qVar.d(i10);
                        int i11 = (int) (4294967295L & j9);
                        int iD2 = qVar.d(i11);
                        if (iD == iD2) {
                            float fE = n0VarC.e(i10, true);
                            float fE2 = n0VarC.e(i11, true);
                            cVarD = new h2.c(Math.min(fE, fE2), qVar.f(iD), Math.max(fE, fE2), qVar.b(iD2));
                        } else {
                            cVarD = n0VarC.j(m3.q0.g(j9), m3.q0.f(j9)).d();
                        }
                    }
                }
                z2.a0 a0VarE = s2Var.e();
                if (a0VarE != null) {
                    if (!a0VarE.A()) {
                        a0VarE = null;
                    }
                    if (a0VarE != null && (a0VarB = s2Var.b()) != null) {
                        z2.a0 a0Var = a0VarB.A() ? a0VarB : null;
                        if (a0Var != null) {
                            cVarD = cVarD.j(a0Var.F(a0VarE, false).e());
                        }
                    }
                }
            } else {
                cVarD = g2.o.f6079a;
            }
        }
        pVar.c(cVarD);
    }

    @Override
    public final void t1() {
        b3.m.t(this, new w1(this, 4));
        this.S.f1951n = this.f70l0;
        if (this.U) {
            B1(this.f60b0);
        }
    }

    @Override
    public final void u1() {
        F1();
        this.S.f1951n = null;
    }
}
