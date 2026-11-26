package m0;

import d0.q1;
import java.util.concurrent.CancellationException;
import l1.e1;

public final class a implements u2.a {
    public final w A;

    public a(w wVar) {
        q1 q1Var = q1.A;
        this.A = wVar;
    }

    @Override
    public final long N0(int i10, long j9, long j10) {
        if (i10 != 2) {
            return 0L;
        }
        q1 q1Var = q1.A;
        if (Float.intBitsToFloat((int) (j10 >> 32)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override
    public final Object a0(long j9, long j10, k00.c cVar) {
        q1 q1Var = q1.A;
        q1 q1Var2 = q1.A;
        return new y3.q(y3.q.a(0.0f, 0.0f, 1, j10));
    }

    @Override
    public final long c0(int i10, long j9) {
        q1 q1Var = q1.A;
        if (i10 != 1) {
            return 0L;
        }
        w wVar = this.A;
        a2.o oVar = wVar.f10388d;
        a2.o oVar2 = wVar.f10388d;
        if (Math.abs(((e1) oVar.D).h()) <= 1.0E-6d) {
            return 0L;
        }
        int i11 = (int) (j9 >> 32);
        if (Math.abs(Float.intBitsToFloat(i11)) <= 0.0f) {
            return 0L;
        }
        q qVarK = wVar.k();
        float fH = ((e1) oVar2.D).h() * wVar.m();
        float f3 = ((qVarK.f10366b + qVarK.f10367c) * (-Math.signum(((e1) oVar2.D).h()))) + fH;
        if (((e1) oVar2.D).h() > 0.0f) {
            fH = f3;
            f3 = fH;
        }
        float f10 = -wVar.f10395k.e(-ab.a0.x(Float.intBitsToFloat(i11), fH, f3));
        q1 q1Var2 = q1.A;
        return (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 & 4294967295L)))) & 4294967295L);
    }
}
