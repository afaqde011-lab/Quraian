package k0;

import a1.p1;
import com.google.android.gms.cast.MediaError;
import d0.q1;
import l0.b1;
import s10.w0;

public final class b0 implements b1 {

    public final y f8458a;

    public b0(y yVar) {
        this.f8458a = yVar;
    }

    @Override
    public final int a() {
        y yVar = this.f8458a;
        return (int) (yVar.g().f8505q == q1.A ? yVar.g().g() & 4294967295L : yVar.g().g() >> 32);
    }

    @Override
    public final float b() {
        y yVar = this.f8458a;
        return (yVar.f8546d.f7808b.h() * MediaError.DetailedErrorCode.SEGMENT_UNKNOWN) + yVar.f8546d.f7809c.h();
    }

    @Override
    public final int c() {
        y yVar = this.f8458a;
        return (-yVar.g().f8502n) + yVar.g().f8506r;
    }

    @Override
    public final float d() {
        y yVar = this.f8458a;
        int iH = yVar.f8546d.f7808b.h();
        int iH2 = yVar.f8546d.f7809c.h();
        return yVar.d() ? (iH * MediaError.DetailedErrorCode.SEGMENT_UNKNOWN) + iH2 + 100 : (iH * MediaError.DetailedErrorCode.SEGMENT_UNKNOWN) + iH2;
    }

    @Override
    public final Object e(int i10, p1 p1Var) {
        w0 w0Var = y.f8542w;
        y yVar = this.f8458a;
        yVar.getClass();
        Object objC = yVar.c(z.b1.A, new a1.a0(yVar, i10, (k00.c) null), p1Var);
        l00.a aVar = l00.a.A;
        g00.b0 b0Var = g00.b0.a;
        if (objC != aVar) {
            objC = b0Var;
        }
        return objC == aVar ? objC : b0Var;
    }

    @Override
    public final j3.d f() {
        return new j3.d(-1, -1);
    }
}
