package mk;

import android.graphics.BlurMaskFilter;
import b2.q;
import b3.o;
import b3.o0;
import i2.b0;
import i2.j;
import i2.k0;
import i2.l0;
import i2.y;
import jk.k;
import jk.l;
import y3.m;

public final class c extends q implements o {
    public l O;
    public u00.a P;
    public l2.b Q;
    public final i2.e R;
    public i2.g S;
    public final a8.l T;

    public c(l lVar, u00.a aVar) {
        this.O = lVar;
        this.P = aVar;
        i2.e eVarG = b0.g();
        eVarG.m(1);
        this.R = eVarG;
        this.T = new a8.l(4);
    }

    @Override
    public final void i(o0 o0Var) {
        i2.g gVarA;
        a aVar = (a) this.P.invoke();
        if (aVar != null) {
            float f3 = aVar.f10930a;
            h hVar = aVar.f10933d;
            if (f3 > 0.0f) {
                k2.b bVar = o0Var.A;
                o0Var.a();
                l2.b bVar2 = this.Q;
                if (bVar2 != null) {
                    long jB = bVar.b();
                    m layoutDirection = o0Var.getLayoutDirection();
                    long jCeil = (((long) (((int) Math.ceil(Float.intBitsToFloat((int) (jB >> 32)))) + 2)) << 32) | (((long) (((int) Math.ceil(Float.intBitsToFloat((int) (jB & 4294967295L)))) + 2)) & 4294967295L);
                    l0 l0VarA = ((k) this.O.f8325g).a(jB, layoutDirection, o0Var);
                    if (l0VarA instanceof k0) {
                        gVarA = this.S;
                        if (gVarA == null) {
                            gVarA = j.a();
                            this.S = gVarA;
                        }
                    } else {
                        gVarA = null;
                    }
                    long jA = hVar.a();
                    i2.e eVar = this.R;
                    eVar.e(jA);
                    float fA0 = o0Var.A0(f3);
                    float fD = h2.e.d(bVar.b()) / 2.0f;
                    if (fA0 > fD) {
                        fA0 = fD;
                    }
                    eVar.l(((float) Math.ceil(fA0)) * 2.0f);
                    float fA1 = o0Var.A0(aVar.f10931b);
                    eVar.f7120a.setMaskFilter(fA1 > 0 ? new BlurMaskFilter(fA1, BlurMaskFilter.Blur.NORMAL) : null);
                    eVar.i(hVar.b(o0Var, (k) this.O.f8325g, this.T));
                    bVar2.f(aVar.f10932c);
                    bVar2.g(hVar.c());
                    o0Var.M0(jCeil, bVar2, new b1.l(l0VarA, gVarA, this, 21));
                    ((hf.c) bVar.B.B).I(-1.0f, -1.0f);
                    try {
                        rd.a.x(o0Var, bVar2);
                        return;
                    } finally {
                        ((hf.c) bVar.B.B).I(1.0f, 1.0f);
                    }
                }
                return;
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
        this.Q = b3.m.w(this).c();
    }

    @Override
    public final void u1() {
        y yVarW = b3.m.w(this);
        l2.b bVar = this.Q;
        if (bVar != null) {
            yVarW.a(bVar);
            this.Q = null;
        }
        this.S = null;
        this.T.A.clear();
    }
}
