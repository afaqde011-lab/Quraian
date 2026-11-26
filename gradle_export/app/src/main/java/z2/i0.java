package z2;

import java.util.List;
import java.util.Map;

public final class i0 implements w1, y0 {
    public final l0 A;
    public final q0 B;

    public i0(q0 q0Var) {
        this.B = q0Var;
        this.A = q0Var.H;
    }

    @Override
    public final float A0(float f3) {
        return this.A.c() * f3;
    }

    @Override
    public final List F0(Object obj, u00.n nVar) {
        q0 q0Var = this.B;
        b3.l0 l0Var = q0Var.A;
        u.i0 i0Var = q0Var.G;
        b3.l0 l0Var2 = (b3.l0) i0Var.g(obj);
        if (l0Var2 != null && ((m1.e) ((m1.b) l0Var.p()).B).i(l0Var2) < q0Var.D) {
            return l0Var2.n();
        }
        u.i0 i0Var2 = q0Var.L;
        u.i0 i0Var3 = q0Var.J;
        m1.e eVar = q0Var.M;
        if (eVar.C < q0Var.E) {
            y2.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        b3.l0 l0Var3 = (b3.l0) i0Var.g(obj);
        int i10 = eVar.C;
        int i11 = q0Var.E;
        if (i10 == i11) {
            eVar.b(obj);
        } else {
            Object[] objArr = eVar.A;
            Object obj2 = objArr[i11];
            objArr[i11] = obj;
        }
        q0Var.E++;
        boolean zB = i0Var3.b(obj);
        if (zB || l0Var3 != null) {
            if (!zB && l0Var3 != null) {
                q0Var.k(((m1.e) ((m1.b) l0Var.p()).B).i(l0Var3), ((m1.e) ((m1.b) l0Var.p()).B).C);
                q0Var.O++;
                i0Var.k(obj);
                i0Var3.m(obj, l0Var3);
                i0Var2.m(obj, q0Var.f(obj));
                if (l0Var.J()) {
                    q0Var.h();
                }
            }
            b3.l0 l0Var4 = (b3.l0) i0Var3.g(obj);
            j0 j0Var = l0Var4 != null ? (j0) q0Var.F.g(l0Var4) : null;
            if (j0Var != null && j0Var.f17121d) {
                q0Var.n(l0Var4, obj, false, nVar);
            }
            if ((j0Var != null ? j0Var.f17123f : null) != null) {
                q0Var.d(j0Var, true);
            }
        } else {
            q0Var.l(obj, nVar, false);
            i0Var2.m(obj, q0Var.f(obj));
        }
        b3.l0 l0Var5 = (b3.l0) i0Var3.g(obj);
        if (l0Var5 == null) {
            return h00.x.A;
        }
        List listY0 = l0Var5.f2060h0.f2122p.y0();
        m1.b bVar = (m1.b) listY0;
        int i12 = ((m1.e) bVar.B).C;
        for (int i13 = 0; i13 < i12; i13++) {
            ((b3.c1) bVar.get(i13)).F.f2110b = true;
        }
        return listY0;
    }

    @Override
    public final float H(long j9) {
        return this.A.H(j9);
    }

    @Override
    public final x0 J(int i10, int i11, Map map, u00.k kVar, u00.k kVar2) {
        return this.A.J(i10, i11, map, kVar, kVar2);
    }

    @Override
    public final int R0(float f3) {
        return this.A.R0(f3);
    }

    @Override
    public final long b0(float f3) {
        return this.A.b0(f3);
    }

    @Override
    public final long b1(long j9) {
        return this.A.b1(j9);
    }

    @Override
    public final float c() {
        return this.A.B;
    }

    @Override
    public final float f1(long j9) {
        return this.A.f1(j9);
    }

    @Override
    public final y3.m getLayoutDirection() {
        return this.A.A;
    }

    @Override
    public final float h0(int i10) {
        return this.A.h0(i10);
    }

    @Override
    public final float k0(float f3) {
        return f3 / this.A.c();
    }

    @Override
    public final x0 o0(int i10, int i11, Map map, u00.k kVar) {
        return this.A.J(i10, i11, map, null, kVar);
    }

    @Override
    public final long r(float f3) {
        return this.A.r(f3);
    }

    @Override
    public final long t(long j9) {
        return this.A.t(j9);
    }

    @Override
    public final float t0() {
        return this.A.C;
    }

    @Override
    public final boolean w0() {
        return this.A.w0();
    }
}
