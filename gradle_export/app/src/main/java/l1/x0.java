package l1;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;

public final class x0 extends f5.c {
    public final u.i0 C;
    public final ArrayList D;
    public final u.j0 E;
    public final u.i0 F;
    public final y8.g G;

    public x0() {
        super(5);
        this.C = va.a.n();
        this.D = new ArrayList();
        u.j0 j0Var = u.r0.f14890a;
        this.E = new u.j0();
        this.F = new u.i0();
        a1.y1 y1Var = new a1.y1(this, 27);
        z1.l.e(z1.l.f17036a);
        synchronized (z1.l.f17038c) {
            z1.l.f17043h = h00.q.Z0(y1Var, (Collection) z1.l.f17043h);
        }
        this.G = new y8.g(y1Var, 2);
    }

    @Override
    public final void B0(c40.w wVar) {
        this.D.add(new v0(wVar));
    }

    @Override
    public final void C0() {
        synchronized (this.B) {
            try {
                ArrayList arrayList = this.D;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    w0 w0Var = (w0) arrayList.get(i10);
                    if (w0Var instanceof u0) {
                        va.a.g(this.C, ((u0) w0Var).f9939a, ((u0) w0Var).f9940b);
                    } else {
                        if (!(w0Var instanceof v0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        va.a.c0(this.C, ((v0) w0Var).f9948a);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.D.clear();
    }

    @Override
    public final void G0() {
        this.G.a();
        this.D.clear();
        this.F.a();
        synchronized (this.B) {
            this.C.a();
        }
    }

    @Override
    public final u00.k P0(c40.w wVar) {
        u.i0 i0Var = this.F;
        u00.k v0Var = (u00.k) i0Var.g(wVar);
        if (v0Var == null) {
            v0Var = new h1.v0(this, wVar, 20);
            int iF = i0Var.f(wVar);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = i0Var.f14858c;
            Object obj = objArr[iF];
            i0Var.f14857b[iF] = wVar;
            objArr[iF] = v0Var;
        }
        return v0Var;
    }
}
