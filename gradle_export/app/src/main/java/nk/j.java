package nk;

import android.graphics.BlurMaskFilter;
import b2.q;
import b3.o;
import b3.o0;
import i2.b0;
import i2.l0;
import i2.s;
import i2.y;
import jk.k;
import jk.l;
import y3.m;

public final class j extends q implements o {
    public l O;
    public u00.a P;
    public l2.b Q;
    public final i2.e R = b0.g();

    public j(l lVar, u00.a aVar) {
        this.O = lVar;
        this.P = aVar;
    }

    @Override
    public final void i(o0 o0Var) {
        f fVar = (f) this.P.invoke();
        if (fVar == null) {
            o0Var.a();
            return;
        }
        long j9 = fVar.f11377b;
        float f3 = fVar.f11376a;
        l2.b bVar = this.Q;
        if (bVar != null) {
            k2.b bVar2 = o0Var.A;
            long jB = bVar2.b();
            m layoutDirection = o0Var.getLayoutDirection();
            final float fA0 = o0Var.A0(f3);
            final float fA1 = o0Var.A0(y3.g.a(j9));
            final float fA2 = o0Var.A0(y3.g.b(j9));
            float f10 = 4.0f * fA0;
            long jCeil = (((long) ((int) Math.ceil((Float.intBitsToFloat((int) (jB >> 32)) + f10) + fA1))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (jB & 4294967295L)) + f10 + fA2))) & 4294967295L);
            final l0 l0VarA = ((k) this.O.f8325g).a(jB, layoutDirection, o0Var);
            long j10 = fVar.f11378c;
            i2.e eVar = this.R;
            eVar.e(j10);
            float fA3 = o0Var.A0(f3);
            eVar.f7120a.setMaskFilter(fA3 > 0.0f ? new BlurMaskFilter(fA3, BlurMaskFilter.Blur.NORMAL) : null);
            bVar.f(fVar.f11379d);
            bVar.g(fVar.f11380e);
            o0Var.M0(jCeil, bVar, new u00.k() {
                public final Object invoke(Object obj) {
                    l0 l0Var = l0VarA;
                    j jVar = this;
                    k2.d dVar = (k2.d) obj;
                    kotlin.jvm.internal.m.e(dVar, "$this$record");
                    float f11 = fA0 * 2.0f;
                    float f12 = fA1;
                    float f13 = f11 + f12;
                    float f14 = fA2;
                    float f15 = f11 + f14;
                    ((hf.c) dVar.G0().B).I(f13, f15);
                    try {
                        s sVarN = dVar.G0().n();
                        b0.l(sVarN, l0Var, jVar.R);
                        sVarN.p(-f12, -f14);
                        b0.l(sVarN, l0Var, h.f11381a);
                        sVarN.p(f12, f14);
                        return g00.b0.a;
                    } finally {
                        ((hf.c) dVar.G0().B).I(-f13, -f15);
                    }
                }
            });
            float f11 = 2.0f * (-fA0);
            ((hf.c) bVar2.B.B).I(f11, f11);
            try {
                rd.a.x(o0Var, bVar);
                float f12 = -f11;
                ((hf.c) bVar2.B.B).I(f12, f12);
            } catch (Throwable th2) {
                float f13 = -f11;
                ((hf.c) bVar2.B.B).I(f13, f13);
                throw th2;
            }
        }
        o0Var.a();
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final void t1() {
        l2.b bVarC = b3.m.w(this).c();
        bVarC.i(1);
        this.Q = bVarC;
    }

    @Override
    public final void u1() {
        y yVarW = b3.m.w(this);
        l2.b bVar = this.Q;
        if (bVar != null) {
            yVarW.a(bVar);
            this.Q = null;
        }
    }
}
