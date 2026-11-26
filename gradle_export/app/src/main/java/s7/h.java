package s7;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import k9.n1;

public final class h implements g0, n7.i {
    public final Object A;
    public c50.h B;
    public n7.h C;
    public final j D;

    public h(j jVar, Object obj) {
        this.D = jVar;
        this.B = new c50.h((CopyOnWriteArrayList) jVar.f13639c.D, 0, (a0) null);
        this.C = new n7.h(jVar.f13640d.f11170c, 0, null);
        this.A = obj;
    }

    @Override
    public final void B(int i10, a0 a0Var, int i11) {
        if (a(i10, a0Var)) {
            this.C.c(i11);
        }
    }

    @Override
    public final void O(int i10, a0 a0Var, gj.e eVar) {
        if (a(i10, a0Var)) {
            this.C.a(eVar);
        }
    }

    public final boolean a(int i10, a0 a0Var) {
        a0 a0VarT;
        Object obj = this.A;
        j jVar = this.D;
        if (a0Var != null) {
            a0VarT = jVar.t(obj, a0Var);
            if (a0VarT == null) {
                return false;
            }
        } else {
            a0VarT = null;
        }
        int iV = jVar.v(i10, obj);
        c50.h hVar = this.B;
        if (hVar.B != iV || !Objects.equals((a0) hVar.C, a0VarT)) {
            this.B = new c50.h((CopyOnWriteArrayList) jVar.f13639c.D, iV, a0VarT);
        }
        n7.h hVar2 = this.C;
        if (hVar2.f11168a == iV && Objects.equals(hVar2.f11169b, a0VarT)) {
            return true;
        }
        this.C = new n7.h(jVar.f13640d.f11170c, iV, a0VarT);
        return true;
    }

    @Override
    public final void b(int i10, a0 a0Var, r rVar, w wVar) {
        if (a(i10, a0Var)) {
            c50.h hVar = this.B;
            w wVarE = e(wVar, a0Var);
            hVar.getClass();
            hVar.h(new d0(hVar, rVar, wVarE, 0));
        }
    }

    @Override
    public final void c(int i10, a0 a0Var, r rVar, w wVar, int i11) {
        if (a(i10, a0Var)) {
            c50.h hVar = this.B;
            w wVarE = e(wVar, a0Var);
            hVar.getClass();
            hVar.h(new n1(hVar, rVar, wVarE, i11));
        }
    }

    @Override
    public final void d(int i10, a0 a0Var) {
        if (a(i10, a0Var)) {
            this.C.e();
        }
    }

    public final w e(w wVar, a0 a0Var) {
        long j9 = wVar.f13786f;
        j jVar = this.D;
        Object obj = this.A;
        long jU = jVar.u(obj, j9);
        long j10 = wVar.f13787g;
        long jU2 = jVar.u(obj, j10);
        return (jU == j9 && jU2 == j10) ? wVar : new w(wVar.f13781a, wVar.f13782b, wVar.f13783c, wVar.f13784d, wVar.f13785e, jU, jU2);
    }

    @Override
    public final void i(int i10, a0 a0Var) {
        if (a(i10, a0Var)) {
            this.C.b();
        }
    }

    @Override
    public final void j(int i10, a0 a0Var, r rVar, w wVar) {
        if (a(i10, a0Var)) {
            c50.h hVar = this.B;
            w wVarE = e(wVar, a0Var);
            hVar.getClass();
            hVar.h(new d0(hVar, rVar, wVarE, 1));
        }
    }

    @Override
    public final void o(int i10, a0 a0Var, w wVar) {
        if (a(i10, a0Var)) {
            c50.h hVar = this.B;
            w wVarE = e(wVar, a0Var);
            a0 a0Var2 = (a0) hVar.C;
            a0Var2.getClass();
            hVar.h(new ce.a(hVar, a0Var2, wVarE, 11));
        }
    }

    @Override
    public final void q(int i10, a0 a0Var, w wVar) {
        if (a(i10, a0Var)) {
            c50.h hVar = this.B;
            w wVarE = e(wVar, a0Var);
            hVar.getClass();
            hVar.h(new c0(hVar, wVarE, 0));
        }
    }

    @Override
    public final void y(int i10, a0 a0Var, final r rVar, w wVar, final IOException iOException, final boolean z10) {
        if (a(i10, a0Var)) {
            final c50.h hVar = this.B;
            final w wVarE = e(wVar, a0Var);
            hVar.getClass();
            hVar.h(new e7.h() {
                @Override
                public final void accept(Object obj) {
                    g0 g0Var = (g0) obj;
                    c50.h hVar2 = hVar;
                    g0Var.y(hVar2.B, (a0) hVar2.C, rVar, wVarE, iOException, z10);
                }
            });
        }
    }

    @Override
    public final void z(int i10, a0 a0Var, Exception exc) {
        if (a(i10, a0Var)) {
            this.C.d(exc);
        }
    }
}
