package ec;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.gms.internal.measurement.y3;
import java.util.ArrayList;
import java.util.List;

public final class g implements e, fc.a, c {

    public final Path f5272a;

    public final dc.a f5273b;

    public final lc.b f5274c;

    public final boolean f5275d;

    public final ArrayList f5276e;

    public final fc.f f5277f;

    public final fc.f f5278g;

    public final cc.i f5279h;

    public final fc.f f5280i;

    public float f5281j;

    public final fc.g f5282k;

    public g(cc.i iVar, lc.b bVar, kc.l lVar) {
        Path path = new Path();
        this.f5272a = path;
        this.f5273b = new dc.a(1, 0);
        this.f5276e = new ArrayList();
        this.f5274c = bVar;
        jc.a aVar = lVar.f9633d;
        jc.a aVar2 = lVar.f9632c;
        this.f5275d = lVar.f9634e;
        this.f5279h = iVar;
        if (bVar.j() != null) {
            fc.e eVarM0 = ((jc.b) bVar.j().B).m0();
            this.f5280i = (fc.f) eVarM0;
            eVarM0.a(this);
            bVar.f(eVarM0);
        }
        if (bVar.k() != null) {
            this.f5282k = new fc.g(this, bVar, bVar.k());
        }
        if (aVar2 == null) {
            this.f5277f = null;
            this.f5278g = null;
            return;
        }
        path.setFillType(lVar.f9631b);
        fc.e eVarM1 = aVar2.m0();
        this.f5277f = (fc.f) eVarM1;
        eVarM1.a(this);
        bVar.f(eVarM1);
        fc.e eVarM2 = aVar.m0();
        this.f5278g = (fc.f) eVarM2;
        eVarM2.a(this);
        bVar.f(eVarM2);
    }

    @Override
    public final void a() {
        this.f5279h.invalidateSelf();
    }

    @Override
    public final void b(List list, List list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = (c) list2.get(i10);
            if (cVar instanceof j) {
                this.f5276e.add((j) cVar);
            }
        }
    }

    @Override
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f5272a;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5276e;
            if (i10 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((j) arrayList.get(i10)).e(), matrix);
                i10++;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, Matrix matrix, int i10) {
        BlurMaskFilter blurMaskFilter;
        if (this.f5275d) {
            return;
        }
        fc.f fVar = this.f5277f;
        int i11 = 0;
        int iMax = (Math.max(0, Math.min(255, (int) ((((i10 / 255.0f) * ((Integer) this.f5278g.e()).intValue()) / 100.0f) * 255.0f))) << 24) | (fVar.k(fVar.b(), fVar.c()) & 16777215);
        dc.a aVar = this.f5273b;
        aVar.setColor(iMax);
        fc.f fVar2 = this.f5280i;
        if (fVar2 != null) {
            float fFloatValue = ((Float) fVar2.e()).floatValue();
            if (fFloatValue == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (fFloatValue != this.f5281j) {
                lc.b bVar = this.f5274c;
                if (bVar.f10237y == fFloatValue) {
                    blurMaskFilter = bVar.f10238z;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    bVar.f10238z = blurMaskFilter2;
                    bVar.f10237y = fFloatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                aVar.setMaskFilter(blurMaskFilter);
            }
            this.f5281j = fFloatValue;
        }
        fc.g gVar = this.f5282k;
        if (gVar != null) {
            gVar.b(aVar);
        }
        Path path = this.f5272a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f5276e;
            if (i11 >= arrayList.size()) {
                canvas.drawPath(path, aVar);
                y3.D();
                return;
            } else {
                path.addPath(((j) arrayList.get(i11)).e(), matrix);
                i11++;
            }
        }
    }
}
