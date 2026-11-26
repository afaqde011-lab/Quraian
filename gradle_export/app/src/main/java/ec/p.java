package ec;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public final class p extends b {

    public final boolean f5347q;

    public final fc.f f5348r;

    public p(cc.i iVar, lc.b bVar, kc.o oVar) {
        int iB = e4.f.b(oVar.f9647f);
        Paint.Cap cap = iB != 0 ? iB != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iB2 = e4.f.b(oVar.f9648g);
        super(iVar, bVar, cap, iB2 != 0 ? iB2 != 1 ? iB2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, oVar.f9649h, oVar.f9645d, oVar.f9646e, oVar.f9643b, oVar.f9642a);
        this.f5347q = oVar.f9650i;
        fc.e eVarM0 = oVar.f9644c.m0();
        this.f5348r = (fc.f) eVarM0;
        eVarM0.a(this);
        bVar.f(eVarM0);
    }

    @Override
    public final void d(Canvas canvas, Matrix matrix, int i10) {
        if (this.f5347q) {
            return;
        }
        fc.f fVar = this.f5348r;
        this.f5252i.setColor(fVar.k(fVar.b(), fVar.c()));
        super.d(canvas, matrix, i10);
    }
}
