package lc;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

public final class h extends b {
    public final RectF A;
    public final dc.a B;
    public final float[] C;
    public final Path D;
    public final e E;

    public h(cc.i iVar, e eVar) {
        super(iVar, eVar);
        this.A = new RectF();
        dc.a aVar = new dc.a();
        this.B = aVar;
        this.C = new float[8];
        this.D = new Path();
        this.E = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.l);
    }

    @Override
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        e eVar = this.E;
        float f3 = eVar.f10248j;
        float f10 = eVar.f10249k;
        RectF rectF2 = this.A;
        rectF2.set(0.0f, 0.0f, f3, f10);
        this.f10226n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override
    public final void i(Canvas canvas, Matrix matrix, int i10) {
        e eVar = this.E;
        int iAlpha = Color.alpha(eVar.l);
        if (iAlpha == 0) {
            return;
        }
        fc.f fVar = (fc.f) this.f10235w.f5637n;
        int iIntValue = (int) ((((iAlpha / 255.0f) * (fVar == null ? 100 : ((Integer) fVar.e()).intValue())) / 100.0f) * (i10 / 255.0f) * 255.0f);
        dc.a aVar = this.B;
        aVar.setAlpha(iIntValue);
        if (iIntValue > 0) {
            float[] fArr = this.C;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f3 = eVar.f10248j;
            fArr[2] = f3;
            fArr[3] = 0.0f;
            fArr[4] = f3;
            float f10 = eVar.f10249k;
            fArr[5] = f10;
            fArr[6] = 0.0f;
            fArr[7] = f10;
            matrix.mapPoints(fArr);
            Path path = this.D;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, aVar);
        }
    }
}
