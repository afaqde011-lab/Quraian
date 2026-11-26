package c3;

import android.graphics.RenderNode;
import android.view.ViewParent;
import com.google.android.gms.internal.measurement.b5;

public final class v1 implements b3.z1 {
    public l2.b A;
    public final i2.y B;
    public final z C;
    public u00.n D;
    public u00.a E;
    public long F;
    public boolean G;
    public float[] I;
    public boolean J;
    public int N;
    public i2.l0 P;
    public boolean Q;
    public boolean R;
    public boolean T;
    public final float[] H = i2.h0.a();
    public y3.c K = b5.d();
    public y3.m L = y3.m.A;
    public final k2.b M = new k2.b();
    public long O = i2.w0.f7175b;
    public boolean S = true;
    public final b3.a U = new b3.a(this, 10);

    public v1(l2.b bVar, i2.y yVar, z zVar, u00.n nVar, u00.a aVar) {
        this.A = bVar;
        this.B = yVar;
        this.C = zVar;
        this.D = nVar;
        this.E = aVar;
        long j9 = Integer.MAX_VALUE;
        this.F = (j9 & 4294967295L) | (j9 << 32);
    }

    public final float[] a() {
        float[] fArrA = this.I;
        if (fArrA == null) {
            fArrA = i2.h0.a();
            this.I = fArrA;
        }
        if (this.R) {
            this.R = false;
            float[] fArrB = b();
            if (this.S) {
                return fArrB;
            }
            if (!m0.r(fArrB, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] b() {
        boolean z10 = this.Q;
        float[] fArr = this.H;
        if (z10) {
            l2.b bVar = this.A;
            long jX = bVar.f9992v;
            l2.c cVar = bVar.f9973a;
            if ((9223372034707292159L & jX) == 9205357640488583168L) {
                jX = ca.v.x(kh.n.m0(this.F));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jX >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jX & 4294967295L));
            float f3 = cVar.m;
            float f10 = cVar.f10006n;
            float f11 = cVar.f10010r;
            float f12 = cVar.f10005k;
            float f13 = cVar.l;
            double d3 = ((double) 0.0f) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d3);
            float fCos = (float) Math.cos(d3);
            float f14 = -fSin;
            float f15 = (f10 * fCos) - (0.0f * fSin);
            float f16 = (0.0f * fCos) + (f10 * fSin);
            float fSin2 = (float) Math.sin(d3);
            float fCos2 = (float) Math.cos(d3);
            float f17 = -fSin2;
            float f18 = fSin * fSin2;
            float f19 = fSin * fCos2;
            float f20 = fCos * fSin2;
            float f21 = fCos * fCos2;
            float f22 = (f16 * fSin2) + (f3 * fCos2);
            float f23 = (f16 * fCos2) + ((-f3) * fSin2);
            double d5 = ((double) f11) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d5);
            float fCos3 = (float) Math.cos(d5);
            float f24 = -fSin3;
            float f25 = (fCos3 * f18) + (f24 * fCos2);
            float f26 = (f18 * fSin3) + (fCos2 * fCos3);
            float f27 = fSin3 * fCos;
            float f28 = f26 * f12;
            float f29 = f27 * f12;
            float f30 = ((fSin3 * f19) + (fCos3 * f17)) * f12;
            float f31 = f25 * f13;
            float f32 = fCos * fCos3 * f13;
            float f33 = ((fCos3 * f19) + (f24 * f17)) * f13;
            float f34 = f20 * 1.0f;
            float f35 = f14 * 1.0f;
            float f36 = f21 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f28;
                fArr[1] = f29;
                fArr[2] = f30;
                fArr[3] = 0.0f;
                fArr[4] = f31;
                fArr[5] = f32;
                fArr[6] = f33;
                fArr[7] = 0.0f;
                fArr[8] = f34;
                fArr[9] = f35;
                fArr[10] = f36;
                fArr[11] = 0.0f;
                float f37 = -fIntBitsToFloat;
                fArr[12] = ((f28 * f37) - (fIntBitsToFloat2 * f31)) + f22 + fIntBitsToFloat;
                fArr[13] = ((f29 * f37) - (fIntBitsToFloat2 * f32)) + f15 + fIntBitsToFloat2;
                fArr[14] = ((f37 * f30) - (fIntBitsToFloat2 * f33)) + f23;
                fArr[15] = 1.0f;
            }
            this.Q = false;
            this.S = i2.b0.s(fArr);
        }
        return fArr;
    }

    public final long c(boolean z10, long j9) {
        float[] fArrB;
        if (z10) {
            fArrB = a();
            if (fArrB == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrB = b();
        }
        return this.S ? j9 : i2.h0.b(fArrB, j9);
    }

    public final void d(long j9) {
        boolean zN = z.n();
        z zVar = this.C;
        if (zN) {
            zVar.M(-4.0f);
        }
        l2.b bVar = this.A;
        if (!y3.j.b(bVar.f9990t, j9)) {
            bVar.f9990t = j9;
            long j10 = bVar.f9991u;
            l2.c cVar = bVar.f9973a;
            int i10 = (int) (j9 >> 32);
            int i11 = (int) (j9 & 4294967295L);
            cVar.f9997c.setPosition(i10, i11, ((int) (j10 >> 32)) + i10, ((int) (4294967295L & j10)) + i11);
            cVar.f9998d = kh.n.m0(j10);
        }
        ViewParent parent = zVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(zVar, zVar);
        }
    }

    public final void e(long j9) {
        if (y3.l.b(j9, this.F)) {
            return;
        }
        if (z.n()) {
            this.C.M(-4.0f);
        }
        this.F = j9;
        invalidate();
    }

    public final void f() {
        z.n();
        if (this.J) {
            if (!i2.w0.a(this.O, i2.w0.f7175b) && !y3.l.b(this.A.f9991u, this.F)) {
                l2.b bVar = this.A;
                float fB = i2.w0.b(this.O) * ((int) (this.F >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2.w0.c(this.O) * ((int) (this.F & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
                if (!h2.b.b(bVar.f9992v, jFloatToRawIntBits)) {
                    bVar.f9992v = jFloatToRawIntBits;
                    RenderNode renderNode = bVar.f9973a.f9997c;
                    if ((9223372034707292159L & jFloatToRawIntBits) == 9205357640488583168L) {
                        renderNode.resetPivot();
                    } else {
                        renderNode.setPivotX(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
                        renderNode.setPivotY(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                    }
                }
            }
            this.A.e(this.K, this.L, this.F, this.U);
            if (this.J) {
                this.J = false;
                this.C.w(this, false);
            }
        }
    }

    @Override
    public final void invalidate() {
        if (this.J || this.G) {
            return;
        }
        z zVar = this.C;
        zVar.invalidate();
        if (true != this.J) {
            this.J = true;
            zVar.w(this, true);
        }
    }
}
