package k2;

import a1.i;
import android.graphics.Paint;
import i2.b0;
import i2.q;
import i2.s;
import i2.t;
import kotlin.NoWhenBranchMatchedException;
import y3.m;

public final class b implements d {
    public final a A;
    public final i B;
    public i2.e C;
    public i2.e D;

    public b() {
        m mVar = m.A;
        a aVar = new a();
        aVar.f8916a = c.f8920a;
        aVar.f8917b = mVar;
        aVar.f8918c = f.f8921a;
        aVar.f8919d = 0L;
        this.A = aVar;
        this.B = new i(this);
    }

    public static i2.e a(b bVar, long j9, e eVar, float f3, int i10) throws NoWhenBranchMatchedException {
        i2.e eVarF = bVar.f(eVar);
        if (f3 != 1.0f) {
            j9 = t.b(t.d(j9) * f3, j9);
        }
        Paint paint = eVarF.f7120a;
        if (!t.c(b0.c(paint.getColor()), j9)) {
            eVarF.e(j9);
        }
        if (eVarF.f7122c != null) {
            eVarF.i(null);
        }
        if (!kotlin.jvm.internal.m.a(eVarF.f7123d, (Object) null)) {
            eVarF.f(null);
        }
        if (eVarF.f7121b != i10) {
            eVarF.d(i10);
        }
        if (paint.isFilterBitmap()) {
            return eVarF;
        }
        eVarF.g(1);
        return eVarF;
    }

    @Override
    public final void E(long j9, float f3, long j10, int i10) {
        this.A.f8918c.f(f3, j10, a(this, j9, g.f8922a, 1.0f, i10));
    }

    @Override
    public final i G0() {
        return this.B;
    }

    @Override
    public final void K0(long j9, float f3, float f10, long j10, long j11, float f11, h hVar) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        this.A.f8918c.r(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i11), f3, f10, a(this, j9, hVar, f11, 3));
    }

    @Override
    public final void L(q qVar, long j9, long j10, long j11, float f3, e eVar) {
        int i10 = (int) (j9 >> 32);
        int i11 = (int) (j9 & 4294967295L);
        this.A.f8918c.k(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), d(qVar, eVar, f3, null, 3, 1));
    }

    @Override
    public final void P(long j9, long j10, long j11, float f3, int i10) {
        s sVar = this.A.f8918c;
        i2.e eVarG = this.D;
        if (eVarG == null) {
            eVarG = b0.g();
            eVarG.m(1);
            this.D = eVarG;
        }
        Paint paint = eVarG.f7120a;
        if (!t.c(b0.c(paint.getColor()), j9)) {
            eVarG.e(j9);
        }
        if (eVarG.f7122c != null) {
            eVarG.i(null);
        }
        if (!kotlin.jvm.internal.m.a(eVarG.f7123d, (Object) null)) {
            eVarG.f(null);
        }
        if (eVarG.f7121b != i10) {
            eVarG.d(i10);
        }
        if (paint.getStrokeWidth() != f3) {
            eVarG.l(f3);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (eVarG.a() != 0) {
            eVarG.j(0);
        }
        if (eVarG.b() != 0) {
            eVarG.k(0);
        }
        if (!kotlin.jvm.internal.m.a(eVarG.f7124e, (Object) null)) {
            eVarG.h(null);
        }
        if (!paint.isFilterBitmap()) {
            eVarG.g(1);
        }
        sVar.l(j10, j11, eVarG);
    }

    @Override
    public final void Q0(long j9, long j10, long j11, float f3, e eVar, int i10) {
        int i11 = (int) (j10 >> 32);
        int i12 = (int) (j10 & 4294967295L);
        this.A.f8918c.a(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (4294967295L & j11)) + Float.intBitsToFloat(i12), a(this, j9, eVar, f3, i10));
    }

    @Override
    public final void S(q qVar, long j9, long j10, float f3, e eVar, int i10) {
        int i11 = (int) (j9 >> 32);
        int i12 = (int) (j9 & 4294967295L);
        this.A.f8918c.a(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (4294967295L & j10)) + Float.intBitsToFloat(i12), d(qVar, eVar, f3, null, i10, 1));
    }

    @Override
    public final float c() {
        return this.A.f8916a.c();
    }

    public final i2.e d(q qVar, e eVar, float f3, i2.m mVar, int i10, int i11) throws NoWhenBranchMatchedException {
        i2.e eVarF = f(eVar);
        if (qVar != null) {
            qVar.a(f3, b(), eVarF);
        } else {
            Paint paint = eVarF.f7120a;
            if (eVarF.f7122c != null) {
                eVarF.i(null);
            }
            long jC = b0.c(paint.getColor());
            long j9 = t.f7162b;
            if (!t.c(jC, j9)) {
                eVarF.e(j9);
            }
            if (paint.getAlpha() / 255.0f != f3) {
                eVarF.c(f3);
            }
        }
        if (!kotlin.jvm.internal.m.a(eVarF.f7123d, mVar)) {
            eVarF.f(mVar);
        }
        if (eVarF.f7121b != i10) {
            eVarF.d(i10);
        }
        if (eVarF.f7120a.isFilterBitmap() == i11) {
            return eVarF;
        }
        eVarF.g(i11);
        return eVarF;
    }

    @Override
    public final void d1(i2.d dVar, long j9, float f3, i2.m mVar, int i10) {
        this.A.f8918c.g(dVar, j9, d(null, g.f8922a, f3, mVar, i10, 1));
    }

    public final void e(q qVar, long j9, long j10, float f3, float f10) {
        s sVar = this.A.f8918c;
        i2.e eVarG = this.D;
        if (eVarG == null) {
            eVarG = b0.g();
            eVarG.m(1);
            this.D = eVarG;
        }
        Paint paint = eVarG.f7120a;
        if (qVar != null) {
            qVar.a(f10, b(), eVarG);
        } else if (paint.getAlpha() / 255.0f != f10) {
            eVarG.c(f10);
        }
        if (!kotlin.jvm.internal.m.a(eVarG.f7123d, (Object) null)) {
            eVarG.f(null);
        }
        if (eVarG.f7121b != 3) {
            eVarG.d(3);
        }
        if (paint.getStrokeWidth() != f3) {
            eVarG.l(f3);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (eVarG.a() != 0) {
            eVarG.j(0);
        }
        if (eVarG.b() != 0) {
            eVarG.k(0);
        }
        if (!kotlin.jvm.internal.m.a(eVarG.f7124e, (Object) null)) {
            eVarG.h(null);
        }
        if (!paint.isFilterBitmap()) {
            eVarG.g(1);
        }
        sVar.l(j9, j10, eVarG);
    }

    public final i2.e f(e eVar) throws NoWhenBranchMatchedException {
        if (kotlin.jvm.internal.m.a(eVar, g.f8922a)) {
            i2.e eVar2 = this.C;
            if (eVar2 != null) {
                return eVar2;
            }
            i2.e eVarG = b0.g();
            eVarG.m(0);
            this.C = eVarG;
            return eVarG;
        }
        if (!(eVar instanceof h)) {
            throw new NoWhenBranchMatchedException();
        }
        i2.e eVarG2 = this.D;
        if (eVarG2 == null) {
            eVarG2 = b0.g();
            eVarG2.m(1);
            this.D = eVarG2;
        }
        Paint paint = eVarG2.f7120a;
        float strokeWidth = paint.getStrokeWidth();
        h hVar = (h) eVar;
        i2.h hVar2 = hVar.f8927e;
        float f3 = hVar.f8923a;
        if (strokeWidth != f3) {
            eVarG2.l(f3);
        }
        int iA = eVarG2.a();
        int i10 = hVar.f8925c;
        if (iA != i10) {
            eVarG2.j(i10);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f10 = hVar.f8924b;
        if (strokeMiter != f10) {
            paint.setStrokeMiter(f10);
        }
        int iB = eVarG2.b();
        int i11 = hVar.f8926d;
        if (iB != i11) {
            eVarG2.k(i11);
        }
        if (!kotlin.jvm.internal.m.a(eVarG2.f7124e, hVar2)) {
            eVarG2.h(hVar2);
        }
        return eVarG2;
    }

    @Override
    public final void g0(i2.g gVar, q qVar, float f3, e eVar, int i10) {
        this.A.f8918c.b(gVar, d(qVar, eVar, f3, null, i10, 1));
    }

    @Override
    public final m getLayoutDirection() {
        return this.A.f8917b;
    }

    @Override
    public final void h1(i2.g gVar, long j9, float f3, e eVar) {
        this.A.f8918c.b(gVar, a(this, j9, eVar, f3, 3));
    }

    @Override
    public final void q(long j9, long j10, long j11, long j12, e eVar) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        this.A.f8918c.k(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), a(this, j9, eVar, 1.0f, 3));
    }

    @Override
    public final float t0() {
        return this.A.f8916a.t0();
    }

    @Override
    public final void u0(i2.d dVar, long j9, long j10, long j11, float f3, i2.m mVar, int i10) {
        this.A.f8918c.n(dVar, j9, j10, j11, d(null, g.f8922a, f3, mVar, 3, i10));
    }

    @Override
    public final void x(q qVar, float f3, long j9, long j10, e eVar) {
        int i10 = (int) (j9 >> 32);
        int i11 = (int) (j9 & 4294967295L);
        this.A.f8918c.r(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i11), 180.0f, f3, d(qVar, eVar, 1.0f, null, 3, 1));
    }
}
