package j0;

import a1.p1;
import com.google.android.gms.cast.MediaError;
import d0.q1;
import g00.b0;
import l0.b1;

public final class c implements b1 {

    public final l1.w f7747a;

    public final v f7748b;

    public final boolean f7749c;

    public c(v vVar, boolean z10) {
        this.f7748b = vVar;
        this.f7749c = z10;
        this.f7747a = l1.q.r(new el.b(vVar, 8));
    }

    @Override
    public final int a() {
        v vVar = this.f7748b;
        return (int) (vVar.h().f7783o == q1.A ? vVar.h().g() & 4294967295L : vVar.h().g() >> 32);
    }

    @Override
    public final float b() {
        v vVar = this.f7748b;
        return (vVar.f7821e.f7808b.h() * MediaError.DetailedErrorCode.SEGMENT_UNKNOWN) + vVar.f7821e.f7809c.h();
    }

    @Override
    public final int c() {
        v vVar = this.f7748b;
        return (-vVar.h().l) + vVar.h().f7784p;
    }

    @Override
    public final float d() {
        v vVar = this.f7748b;
        int iH = vVar.f7821e.f7808b.h();
        int iH2 = vVar.f7821e.f7809c.h();
        return vVar.d() ? (iH * MediaError.DetailedErrorCode.SEGMENT_UNKNOWN) + iH2 + 100 : (iH * MediaError.DetailedErrorCode.SEGMENT_UNKNOWN) + iH2;
    }

    @Override
    public final Object e(int i10, p1 p1Var) {
        Object objJ = v.j(this.f7748b, i10, p1Var);
        return objJ == l00.a.A ? objJ : b0.a;
    }

    @Override
    public final j3.d f() {
        boolean z10 = this.f7749c;
        l1.w wVar = this.f7747a;
        return z10 ? new j3.d(((Number) wVar.getValue()).intValue(), 1) : new j3.d(1, ((Number) wVar.getValue()).intValue());
    }
}
