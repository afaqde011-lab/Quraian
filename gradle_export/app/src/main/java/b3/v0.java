package b3;

import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;

public abstract class v0 extends u0 implements z2.v0 {
    public final p1 O;
    public LinkedHashMap Q;
    public z2.x0 S;
    public final u.c0 T;
    public long P = 0;
    public final z2.s0 R = new z2.s0(this);

    public v0(p1 p1Var) {
        this.O = p1Var;
        u.c0 c0Var = u.n0.f14879a;
        this.T = new u.c0();
    }

    public static final void o1(v0 v0Var, z2.x0 x0Var) {
        LinkedHashMap linkedHashMap;
        if (x0Var != null) {
            v0Var.v0((((long) x0Var.c()) & 4294967295L) | (((long) x0Var.d()) << 32));
        } else {
            v0Var.v0(0L);
        }
        if (!kotlin.jvm.internal.m.a(v0Var.S, x0Var) && x0Var != null && ((((linkedHashMap = v0Var.Q) != null && !linkedHashMap.isEmpty()) || !x0Var.a().isEmpty()) && !kotlin.jvm.internal.m.a(x0Var.a(), v0Var.Q))) {
            y0 y0Var = v0Var.O.O.f2060h0.f2123q;
            kotlin.jvm.internal.m.b(y0Var);
            y0Var.R.f();
            LinkedHashMap linkedHashMap2 = v0Var.Q;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                v0Var.Q = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(x0Var.a());
        }
        v0Var.S = x0Var;
    }

    @Override
    public final u0 N0() {
        p1 p1Var = this.O.R;
        if (p1Var != null) {
            return p1Var.x1();
        }
        return null;
    }

    @Override
    public final z2.a0 O0() {
        return this.R;
    }

    @Override
    public final Object U() {
        return this.O.U();
    }

    @Override
    public final boolean V0() {
        return this.S != null;
    }

    @Override
    public final l0 W0() {
        return this.O.O;
    }

    @Override
    public final z2.x0 Z0() throws KotlinNothingValueException {
        z2.x0 x0Var = this.S;
        if (x0Var != null) {
            return x0Var;
        }
        throw a1.b.u("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override
    public final float c() {
        return this.O.c();
    }

    @Override
    public final u0 c1() {
        p1 p1Var = this.O.S;
        if (p1Var != null) {
            return p1Var.x1();
        }
        return null;
    }

    @Override
    public final long e1() {
        return this.P;
    }

    @Override
    public final y3.m getLayoutDirection() {
        return this.O.O.f2053a0;
    }

    @Override
    public final void m1() {
        r0(this.P, 0.0f, null);
    }

    public final long p1() {
        return (((long) this.A) << 32) | (((long) this.B) & 4294967295L);
    }

    public void q1() {
        Z0().b();
    }

    @Override
    public final void r0(long j9, float f3, u00.k kVar) {
        r1(j9);
        if (this.J) {
            return;
        }
        q1();
    }

    public final void r1(long j9) {
        if (!y3.j.b(this.P, j9)) {
            this.P = j9;
            p1 p1Var = this.O;
            y0 y0Var = p1Var.O.f2060h0.f2123q;
            if (y0Var != null) {
                y0Var.H0();
            }
            u0.k1(p1Var);
        }
        if (this.K) {
            return;
        }
        H0(Z0());
    }

    public final long s1(v0 v0Var, boolean z10) {
        long jD = 0;
        while (!this.equals(v0Var)) {
            if (!this.I || !z10) {
                jD = y3.j.d(jD, this.P);
            }
            p1 p1Var = this.O.S;
            kotlin.jvm.internal.m.b(p1Var);
            this = p1Var.x1();
            kotlin.jvm.internal.m.b(this);
        }
        return jD;
    }

    @Override
    public final float t0() {
        return this.O.t0();
    }

    @Override
    public final boolean w0() {
        return true;
    }
}
