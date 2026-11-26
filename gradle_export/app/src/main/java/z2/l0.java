package z2;

import java.util.List;
import java.util.Map;

public final class l0 implements w1 {
    public y3.m A = y3.m.B;
    public float B;
    public float C;
    public final q0 D;

    public l0(q0 q0Var) {
        this.D = q0Var;
    }

    @Override
    public final List F0(Object obj, u00.n nVar) {
        q0 q0Var = this.D;
        q0Var.h();
        b3.l0 l0Var = q0Var.A;
        b3.f0 f0Var = l0Var.f2060h0.f2112d;
        b3.f0 f0Var2 = b3.f0.A;
        if (f0Var != f0Var2 && f0Var != b3.f0.C && f0Var != b3.f0.B && f0Var != b3.f0.D) {
            y2.a.c("subcompose can only be used inside the measure or layout blocks");
        }
        u.i0 i0Var = q0Var.G;
        Object objG = i0Var.g(obj);
        if (objG == null) {
            objG = (b3.l0) q0Var.J.k(obj);
            if (objG != null) {
                if (q0Var.O <= 0) {
                    y2.a.c("Check failed.");
                }
                q0Var.O--;
            } else {
                objG = q0Var.o(obj);
                if (objG == null) {
                    int i10 = q0Var.D;
                    b3.l0 l0Var2 = new b3.l0(2);
                    l0Var.R = true;
                    l0Var.D(i10, l0Var2);
                    l0Var.R = false;
                    objG = l0Var2;
                }
            }
            i0Var.m(obj, objG);
        }
        b3.l0 l0Var3 = (b3.l0) objG;
        if (h00.q.O0(q0Var.D, l0Var.p()) != l0Var3) {
            int i11 = ((m1.e) ((m1.b) l0Var.p()).B).i(l0Var3);
            if (i11 < q0Var.D) {
                y2.a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i12 = q0Var.D;
            if (i12 != i11) {
                q0Var.k(i11, i12);
            }
        }
        q0Var.D++;
        q0Var.n(l0Var3, obj, false, nVar);
        return (f0Var == f0Var2 || f0Var == b3.f0.C) ? l0Var3.n() : l0Var3.m();
    }

    @Override
    public final x0 J(int i10, int i11, Map map, u00.k kVar, u00.k kVar2) {
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            y2.a.c("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new k0(i10, i11, map, kVar, this, this.D, kVar2);
    }

    @Override
    public final float c() {
        return this.B;
    }

    @Override
    public final y3.m getLayoutDirection() {
        return this.A;
    }

    @Override
    public final float t0() {
        return this.C;
    }

    @Override
    public final boolean w0() {
        b3.f0 f0Var = this.D.A.f2060h0.f2112d;
        return f0Var == b3.f0.D || f0Var == b3.f0.B;
    }
}
