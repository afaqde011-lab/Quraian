package l0;

import java.util.List;
import java.util.Map;
import z2.w1;

public final class o0 implements z2.y0 {
    public final i0 A;
    public final w1 B;
    public final j0 C;
    public final u.w D;

    public o0(i0 i0Var, w1 w1Var) {
        this.A = i0Var;
        this.B = w1Var;
        this.C = (j0) i0Var.f9749b.invoke();
        u.m.a();
        this.D = new u.w();
    }

    @Override
    public final float A0(float f3) {
        return this.B.A0(f3);
    }

    @Override
    public final float H(long j9) {
        return this.B.H(j9);
    }

    @Override
    public final z2.x0 J(int i10, int i11, Map map, u00.k kVar, u00.k kVar2) {
        return this.B.J(i10, i11, map, kVar, kVar2);
    }

    @Override
    public final int R0(float f3) {
        return this.B.R0(f3);
    }

    public final List a(int i10) {
        u.w wVar = this.D;
        List list = (List) wVar.b(i10);
        if (list != null) {
            return list;
        }
        j0 j0Var = this.C;
        Object objB = j0Var.b(i10);
        List listF0 = this.B.F0(objB, this.A.a(i10, objB, j0Var.c(i10)));
        wVar.i(i10, listF0);
        return listF0;
    }

    @Override
    public final long b0(float f3) {
        return this.B.b0(f3);
    }

    @Override
    public final long b1(long j9) {
        return this.B.b1(j9);
    }

    @Override
    public final float c() {
        return this.B.c();
    }

    @Override
    public final float f1(long j9) {
        return this.B.f1(j9);
    }

    @Override
    public final y3.m getLayoutDirection() {
        return this.B.getLayoutDirection();
    }

    @Override
    public final float h0(int i10) {
        return this.B.h0(i10);
    }

    @Override
    public final float k0(float f3) {
        return this.B.k0(f3);
    }

    @Override
    public final z2.x0 o0(int i10, int i11, Map map, u00.k kVar) {
        return this.B.o0(i10, i11, map, kVar);
    }

    @Override
    public final long r(float f3) {
        return this.B.r(f3);
    }

    @Override
    public final long t(long j9) {
        return this.B.t(j9);
    }

    @Override
    public final float t0() {
        return this.B.t0();
    }

    @Override
    public final boolean w0() {
        return this.B.w0();
    }
}
