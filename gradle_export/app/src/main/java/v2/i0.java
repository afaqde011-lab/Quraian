package v2;

import androidx.compose.ui.input.pointer.CancelTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import c3.c3;
import qd.s0;
import ri.t1;

public final class i0 implements y3.c, k00.c {
    public final j0 A;
    public final a40.k B;
    public a40.k C;
    public l D = l.B;
    public final k00.j E = k00.j.A;
    public final j0 F;

    public i0(j0 j0Var, a40.k kVar) {
        this.F = j0Var;
        this.A = j0Var;
        this.B = kVar;
    }

    @Override
    public final float A0(float f3) {
        return this.A.c() * f3;
    }

    @Override
    public final float H(long j9) {
        return this.A.H(j9);
    }

    @Override
    public final int R0(float f3) {
        return this.A.R0(f3);
    }

    public final Object a(l lVar, m00.a aVar) {
        a40.k kVar = new a40.k(1, s0.j0(aVar));
        kVar.r();
        this.D = lVar;
        this.C = kVar;
        Object objQ = kVar.q();
        l00.a aVar2 = l00.a.A;
        return objQ;
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
        return this.A.c();
    }

    public final long d() {
        j0 j0Var = this.F;
        j0Var.getClass();
        long jB1 = j0Var.b1(b3.m.y(j0Var).f2054b0.e());
        long j9 = j0Var.Y;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jB1 >> 32)) - ((int) (j9 >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jB1 & 4294967295L)) - ((int) (j9 & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    public final c3 f() {
        j0 j0Var = this.F;
        j0Var.getClass();
        return b3.m.y(j0Var).f2054b0;
    }

    @Override
    public final float f1(long j9) {
        return this.A.f1(j9);
    }

    public final k00.i getContext() {
        return this.E;
    }

    @Override
    public final float h0(int i10) {
        return this.A.h0(i10);
    }

    public final Object i(long j9, u00.n nVar, m00.a aVar) {
        g0 g0Var;
        a40.k kVar;
        if (aVar instanceof g0) {
            g0Var = (g0) aVar;
            int i10 = g0Var.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g0Var.D = i10 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, aVar);
            }
        } else {
            g0Var = new g0(this, aVar);
        }
        Object objInvoke = g0Var.B;
        l00.a aVar2 = l00.a.A;
        int i11 = g0Var.D;
        try {
            if (i11 == 0) {
                t1.O(objInvoke);
                if (j9 <= 0 && (kVar = this.C) != null) {
                    kVar.resumeWith(t1.s(new PointerEventTimeoutCancellationException(j9)));
                }
                this = a40.c0.y(this.F.p1(), (k00.i) null, (a40.a0) null, new b1.f(j9, this, (k00.c) null, 6), 3);
                g0Var.A = this;
                g0Var.D = 1;
                objInvoke = nVar.invoke(this, g0Var);
                if (objInvoke == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = g0Var.A;
                t1.O(objInvoke);
            }
            this.i(CancelTimeoutCancellationException.A);
            return objInvoke;
        } catch (Throwable th2) {
            this.i(CancelTimeoutCancellationException.A);
            throw th2;
        }
    }

    public final Object j(long j9, u00.n nVar, m00.a aVar) {
        h0 h0Var;
        if (aVar instanceof h0) {
            h0Var = (h0) aVar;
            int i10 = h0Var.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                h0Var.C = i10 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(this, aVar);
            }
        } else {
            h0Var = new h0(this, aVar);
        }
        Object obj = h0Var.A;
        l00.a aVar2 = l00.a.A;
        int i11 = h0Var.C;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
                return obj;
            }
            t1.O(obj);
            h0Var.C = 1;
            Object objI = i(j9, nVar, h0Var);
            return objI == aVar2 ? aVar2 : objI;
        } catch (PointerEventTimeoutCancellationException unused) {
            return null;
        }
    }

    @Override
    public final float k0(float f3) {
        return f3 / this.A.c();
    }

    @Override
    public final long r(float f3) {
        return this.A.r(f3);
    }

    public final void resumeWith(Object obj) {
        j0 j0Var = this.F;
        synchronized (j0Var.V) {
            j0Var.U.j(this);
        }
        this.B.resumeWith(obj);
    }

    @Override
    public final long t(long j9) {
        return this.A.t(j9);
    }

    @Override
    public final float t0() {
        return this.A.t0();
    }
}
