package s7;

import android.os.Bundle;
import tf.e4;
import tf.i2;
import tf.i3;
import tf.j3;
import tf.t2;
import x.s1;
import x.u1;

public final class w0 implements v8.g, s1 {
    public long A;
    public long B;
    public Object C;
    public Object D;

    public w0(long j9, int i10) {
        ta.c0.A(((w7.a) this.C) == null);
        this.A = j9;
        this.B = j9 + ((long) i10);
    }

    public w0(String str, byte[] bArr, long j9, long j10) {
        this.C = str;
        this.D = bArr;
        this.A = j9;
        this.B = j10;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long b(x.o oVar, x.o oVar2, x.o oVar3) {
        return Long.MAX_VALUE;
    }

    @Override
    public x.o c(long j9, x.o oVar, x.o oVar2, x.o oVar3) {
        return ((u1) this.C).c(e(j9), oVar, oVar2, f(j9, oVar, oVar3, oVar2));
    }

    @Override
    public long d(a8.r rVar) {
        long j9 = this.B;
        if (j9 < 0) {
            return -1L;
        }
        long j10 = -(j9 + 2);
        this.B = -1L;
        return j10;
    }

    public long e(long j9) {
        long j10 = this.B;
        if (j9 + j10 <= 0) {
            return 0L;
        }
        long j11 = j9 + j10;
        long j12 = this.A;
        long j13 = j11 / j12;
        return (((x.p0) this.D) == x.p0.A || j13 % ((long) 2) == 0) ? j11 - (j13 * j12) : ((j13 + 1) * j12) - j11;
    }

    public x.o f(long j9, x.o oVar, x.o oVar2, x.o oVar3) {
        long j10 = this.B;
        long j11 = j9 + j10;
        long j12 = this.A;
        return j11 > j12 ? ((u1) this.C).c(j12 - j10, oVar, oVar3, oVar2) : oVar2;
    }

    @Override
    public a8.d0 g() {
        ta.c0.A(this.A != -1);
        return new a8.v((a8.w) this.C, this.A, 0);
    }

    public boolean h(long j9, boolean z10, boolean z11) {
        j3 j3Var = (j3) this.D;
        j3Var.V0();
        j3Var.W0();
        tf.h1 h1Var = (tf.h1) j3Var.B;
        boolean zA = h1Var.a();
        tf.q0 q0Var = h1Var.F;
        if (zA) {
            tf.w0 w0Var = h1Var.E;
            tf.h1.e(w0Var);
            i7.m1 m1Var = w0Var.Q;
            h1Var.K.getClass();
            m1Var.f(System.currentTimeMillis());
        }
        long j10 = j9 - this.A;
        if (!z10 && j10 < 1000) {
            tf.h1.g(q0Var);
            q0Var.O.c(Long.valueOf(j10), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z11) {
            j10 = j9 - this.B;
            this.B = j9;
        }
        tf.h1.g(q0Var);
        q0Var.O.c(Long.valueOf(j10), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j10);
        boolean z12 = !h1Var.D.j1();
        t2 t2Var = h1Var.L;
        tf.h1.f(t2Var);
        e4.M1(t2Var.b1(z12), bundle, true);
        if (!z11) {
            i2 i2Var = h1Var.M;
            tf.h1.f(i2Var);
            i2Var.c1("auto", "_e", bundle);
        }
        this.A = j9;
        i3 i3Var = (i3) this.C;
        i3Var.c();
        i3Var.b(((Long) tf.b0.f14587q0.a(null)).longValue());
        return true;
    }

    @Override
    public void l(long j9) {
        long[] jArr = (long[]) ((l9.f0) this.D).B;
        this.B = jArr[e7.i0.e(jArr, j9, true)];
    }

    @Override
    public x.o r(long j9, x.o oVar, x.o oVar2, x.o oVar3) {
        return ((u1) this.C).r(e(j9), oVar, oVar2, f(j9, oVar, oVar3, oVar2));
    }
}
