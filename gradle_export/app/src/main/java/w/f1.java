package w;

import com.google.android.gms.internal.measurement.y3;
import kotlin.NoWhenBranchMatchedException;

public final class f1 extends b2.q implements b3.o, a3.c, b3.v1, b3.j, b3.y {
    public h2.c O;
    public boolean P;
    public k1 Q;
    public l2.b R;
    public final a3.d S;

    public f1(k1 k1Var) {
        this.Q = k1Var;
        this.R = (l2.b) k1Var.M.getValue();
        a3.d dVar = new a3.d(h1.f15772a);
        dVar.f170h.setValue(k1Var);
        this.S = dVar;
    }

    public final z2.x0 B1(z2.h hVar, z2.v0 v0Var, long j9) throws NoWhenBranchMatchedException {
        long jP;
        h2.c cVarC = this.Q.a().c();
        if (cVarC == null) {
            ba.v0 v0Var2 = this.Q.e().f15782c;
            v0Var2.i();
            cVarC = v0Var2.d().f((j1) v0Var2.f2440d);
        }
        if (cVarC != null) {
            long jY = kh.n.Y(cVarC.d());
            int i10 = (int) (jY >> 32);
            int i11 = (int) (jY & 4294967295L);
            if (i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE) {
                throw new IllegalArgumentException(("Error: Infinite width/height is invalid. animated bounds: " + this.Q.a().c() + ", current bounds: " + this.Q.e().f15782c.d().c()).toString());
            }
            if (i10 < 0) {
                i10 = 0;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            if (!((i11 >= 0) & (i10 >= 0))) {
                y3.i.a("width and height must be >= 0");
            }
            j9 = y3.b.h(i10, i10, i11, i11);
        }
        z2.l1 l1VarO = v0Var.O(j9);
        if (this.Q.e().f15782c.d().d()) {
            q1 q1Var = (q1) this.Q.F.getValue();
            jP = this.Q.e().f15781b.A.a(b3.m.x(this)).p();
            q1Var.a(jP, (((long) l1VarO.A) << 32) | (((long) l1VarO.B) & 4294967295L));
        } else {
            jP = (((long) l1VarO.A) << 32) | (((long) l1VarO.B) & 4294967295L);
        }
        return hVar.o0((int) (jP >> 32), (int) (jP & 4294967295L), h00.y.A, new e1(this, l1VarO));
    }

    public final z2.a0 C1() {
        z2.a0 a0Var = this.Q.e().f15781b.E;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
    }

    public final void D1(l2.b bVar) {
        if (bVar == null) {
            l2.b bVar2 = this.R;
            if (bVar2 != null) {
                b3.m.w(this).a(bVar2);
            }
        } else {
            this.Q.M.setValue(bVar);
        }
        this.R = bVar;
    }

    public final void E1() {
        me.i iVar = h1.f15772a;
        k1 k1Var = this.Q;
        a3.a aVar = a3.a.f168g;
        a3.d dVar = this.S;
        if (dVar == aVar) {
            y2.a.a("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!dVar.w(iVar)) {
            y2.a.a("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + iVar + " was not found.");
        }
        if (iVar != dVar.f169g) {
            y2.a.c("Check failed.");
        }
        dVar.f170h.setValue(k1Var);
        this.Q.K = (k1) y0(iVar);
        D1(b3.m.w(this).c());
        this.P = false;
        this.Q.L = this;
    }

    @Override
    public final void J0() {
        this.Q.e().e();
        b3.m.t(this, this.Q.e().f15788i);
    }

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) {
        z2.l1 l1VarO = v0Var.O(j9);
        return y0Var.o0(l1VarO.A, l1VarO.B, h00.y.A, new e1(l1VarO, this));
    }

    @Override
    public final void i(b3.o0 o0Var) throws NoWhenBranchMatchedException {
        j1 j1VarE = this.Q.e();
        h2.c cVarC = j1VarE.f15782c.d().c();
        k1 k1Var = this.Q;
        k1Var.J = (!k1Var.g() || cVarC == null) ? null : ((n1) this.Q.H.getValue()).a((r1) this.Q.I.getValue(), cVarC, o0Var.getLayoutDirection(), b3.m.y(this).Z);
        l2.b bVar = (l2.b) this.Q.M.getValue();
        if (bVar == null) {
            throw new IllegalArgumentException(("Error: Layer is null when accessed for shared bounds/element : " + ((Object) j1VarE.f15780a) + ",target: " + this.Q.a().b() + ", is attached: " + this.N).toString());
        }
        k2.d.Z(o0Var, bVar, new g(o0Var, cVarC, j1VarE));
        k1 k1Var2 = this.Q;
        if (!k1Var2.e().f15782c.d().d() || (!k1Var2.g() && k1Var2.f())) {
            rd.a.x(o0Var, bVar);
        }
    }

    @Override
    public final y3 r0() {
        return this.S;
    }

    @Override
    public final void t1() {
        b3.m.t(this, this.Q.e().f15788i);
        E1();
        this.Q.A.setValue(Boolean.TRUE);
    }

    @Override
    public final void u1() {
        z2.a0 a0Var = this.Q.e().f15781b.E;
        if (a0Var != null) {
            this.O = (a0Var.A() && this.P) ? bi.b.g(h2.b.e(b3.m.x(this).d0(0L), a0Var.d0(0L)), kh.n.m0(b3.m.x(this).C)) : null;
        }
        D1(null);
        k1 k1Var = this.Q;
        k1Var.K = null;
        k1Var.L = null;
        k1Var.A.setValue(Boolean.FALSE);
        this.P = false;
    }

    @Override
    public final void v1() {
        this.O = null;
        l2.b bVar = this.R;
        if (bVar != null) {
            b3.m.w(this).a(bVar);
        }
        D1(b3.m.w(this).c());
    }
}
