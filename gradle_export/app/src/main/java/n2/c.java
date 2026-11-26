package n2;

import android.graphics.BlurMaskFilter;
import b3.o0;
import c7.i;
import i2.b0;
import i2.e;
import i2.g;
import i2.i0;
import i2.j0;
import i2.k0;
import i2.l0;
import i2.m;
import i2.t;
import k00.f;
import kotlin.NoWhenBranchMatchedException;

public final class c {

    public final l0 f11006a;

    public g f11007b;

    public m f11008c;

    public long f11009d;

    public long f11010e;

    public long f11011f;

    public y3.m f11012g;

    public float f11013h;

    public final d f11014i;

    public final e f11015j;

    public i2.d f11016k;

    public c(d dVar, l0 l0Var) {
        this.f11006a = l0Var;
        int i10 = t.f7168h;
        this.f11009d = t.f7167g;
        this.f11010e = 0L;
        this.f11011f = 9205357640488583168L;
        this.f11012g = y3.m.A;
        this.f11013h = 1.0f;
        this.f11014i = dVar;
        this.f11015j = b0.g();
    }

    public final void a(o0 o0Var, m mVar, long j9, long j10, float f3) throws NoWhenBranchMatchedException {
        m mVar2;
        char c10;
        long j11;
        i2.d dVarF;
        k2.b bVar = o0Var.A;
        l0 l0Var = this.f11006a;
        if (l0Var instanceof i0) {
            this.f11007b = ((i0) l0Var).f7139a;
            this.f11010e = 0L;
        } else if (l0Var instanceof k0) {
            k0 k0Var = (k0) l0Var;
            h2.d dVar = k0Var.f7142a;
            if (i.M(dVar)) {
                this.f11007b = null;
                this.f11010e = dVar.f6554e;
            } else {
                this.f11007b = k0Var.f7143b;
                this.f11010e = 0L;
            }
        } else {
            if (!(l0Var instanceof j0)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f11007b = null;
            this.f11010e = 0L;
        }
        if (mVar != null) {
            mVar2 = mVar;
        } else if (j10 != 16) {
            m mVar3 = this.f11008c;
            if (mVar3 == null || !t.c(this.f11009d, j10)) {
                mVar3 = new m(j10, 5);
                this.f11009d = j10;
                this.f11008c = mVar3;
            }
            mVar2 = mVar3;
        } else {
            mVar2 = null;
        }
        long j12 = this.f11011f;
        if (j12 != 9205357640488583168L && h2.e.a(j12, j9) && this.f11012g == o0Var.getLayoutDirection() && this.f11013h == bVar.c()) {
            c10 = ' ';
            j11 = 4294967295L;
        } else {
            long j13 = this.f11010e;
            g gVar = this.f11007b;
            d dVar2 = this.f11014i;
            float fA0 = o0Var.A0(dVar2.f11017a);
            float fA1 = o0Var.A0(dVar2.f11018b);
            c10 = ' ';
            j11 = 4294967295L;
            e eVar = this.f11015j;
            if (gVar != null) {
                float f10 = 2;
                float f11 = (f10 * fA1) + (fA0 * f10);
                dVarF = b0.f((int) Math.ceil(Float.intBitsToFloat((int) (j9 >> 32)) + f11), (int) Math.ceil(Float.intBitsToFloat((int) (j9 & 4294967295L)) + f11), 1);
                i2.a aVarA = b0.a(dVarF);
                if (fA1 > 0.0f) {
                    float f12 = fA0 + fA1;
                    aVarA.p(f12, f12);
                    aVarA.b(gVar, f.s(eVar, fA0 > 0.0f ? new BlurMaskFilter(fA0, BlurMaskFilter.Blur.NORMAL) : null, 11));
                    e eVarS = f.s(eVar, fA0 > 0.0f ? new BlurMaskFilter(fA0, BlurMaskFilter.Blur.NORMAL) : null, 3);
                    eVarS.l(fA1 * 2.0f);
                    aVarA.b(gVar, eVarS);
                } else {
                    f.s(eVar, fA0 > 0.0f ? new BlurMaskFilter(fA0, BlurMaskFilter.Blur.NORMAL) : null, 11);
                    aVarA.p(fA0, fA0);
                    aVarA.b(gVar, eVar);
                }
            } else {
                float f13 = 2;
                float f14 = (fA1 * f13) + (fA0 * f13);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) + f14;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L)) + f14;
                i2.d dVarF2 = b0.f((int) Math.ceil(fIntBitsToFloat), (int) Math.ceil(fIntBitsToFloat2), 1);
                b0.a(dVarF2).k(fA0, fA0, fIntBitsToFloat - fA0, fIntBitsToFloat2 - fA0, Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), f.s(eVar, fA0 > 0.0f ? new BlurMaskFilter(fA0, BlurMaskFilter.Blur.NORMAL) : null, 11));
                dVarF = dVarF2;
            }
            this.f11016k = dVarF;
            this.f11011f = j9;
            this.f11012g = o0Var.getLayoutDirection();
            this.f11013h = bVar.c();
        }
        i2.d dVar3 = this.f11016k;
        if (dVar3 != null) {
            d dVar4 = this.f11014i;
            float f15 = -(o0Var.A0(dVar4.f11018b) + o0Var.A0(dVar4.f11017a));
            k2.d.m(o0Var, dVar3, (((long) Float.floatToRawIntBits(f15)) << c10) | (((long) Float.floatToRawIntBits(f15)) & j11), f3, mVar2, 8);
        }
    }
}
