package ec;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.google.android.gms.internal.measurement.y3;
import java.util.ArrayList;
import java.util.List;

public final class h implements e, fc.a, c {

    public final boolean f5283a;

    public final u.q f5284b = new u.q((Object) null);

    public final u.q f5285c = new u.q((Object) null);

    public final Path f5286d;

    public final dc.a f5287e;

    public final RectF f5288f;

    public final ArrayList f5289g;

    public final int f5290h;

    public final fc.h f5291i;

    public final fc.f f5292j;

    public final fc.h f5293k;
    public final fc.h l;
    public final cc.i m;

    public final int f5294n;

    public final fc.f f5295o;

    public float f5296p;

    public final fc.g f5297q;

    public h(cc.i iVar, cc.a aVar, lc.b bVar, kc.d dVar) {
        Path path = new Path();
        this.f5286d = path;
        this.f5287e = new dc.a(1, 0);
        this.f5288f = new RectF();
        this.f5289g = new ArrayList();
        this.f5296p = 0.0f;
        this.f5283a = dVar.f9594g;
        this.m = iVar;
        this.f5290h = dVar.f9588a;
        path.setFillType(dVar.f9589b);
        this.f5294n = (int) (aVar.b() / 32.0f);
        fc.e eVarM0 = dVar.f9590c.m0();
        this.f5291i = (fc.h) eVarM0;
        eVarM0.a(this);
        bVar.f(eVarM0);
        fc.e eVarM1 = dVar.f9591d.m0();
        this.f5292j = (fc.f) eVarM1;
        eVarM1.a(this);
        bVar.f(eVarM1);
        fc.e eVarM2 = dVar.f9592e.m0();
        this.f5293k = (fc.h) eVarM2;
        eVarM2.a(this);
        bVar.f(eVarM2);
        fc.e eVarM3 = dVar.f9593f.m0();
        this.l = (fc.h) eVarM3;
        eVarM3.a(this);
        bVar.f(eVarM3);
        if (bVar.j() != null) {
            fc.e eVarM4 = ((jc.b) bVar.j().B).m0();
            this.f5295o = (fc.f) eVarM4;
            eVarM4.a(this);
            bVar.f(eVarM4);
        }
        if (bVar.k() != null) {
            this.f5297q = new fc.g(this, bVar, bVar.k());
        }
    }

    @Override
    public final void a() {
        this.m.invalidateSelf();
    }

    @Override
    public final void b(List list, List list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = (c) list2.get(i10);
            if (cVar instanceof j) {
                this.f5289g.add((j) cVar);
            }
        }
    }

    @Override
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f5286d;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5289g;
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
        Shader radialGradient;
        float f3;
        dc.a aVar;
        fc.f fVar;
        fc.g gVar;
        float fFloatValue;
        if (this.f5283a) {
            return;
        }
        Path path = this.f5286d;
        path.reset();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f5289g;
            if (i11 >= arrayList.size()) {
                break;
            }
            path.addPath(((j) arrayList.get(i11)).e(), matrix);
            i11++;
        }
        path.computeBounds(this.f5288f, false);
        int i12 = this.f5290h;
        fc.h hVar = this.f5291i;
        fc.h hVar2 = this.l;
        fc.h hVar3 = this.f5293k;
        if (i12 != 1) {
            long jF = f();
            u.q qVar = this.f5285c;
            radialGradient = (RadialGradient) qVar.b(jF);
            if (radialGradient == null) {
                PointF pointF = (PointF) hVar3.e();
                PointF pointF2 = (PointF) hVar2.e();
                kc.c cVar = (kc.c) hVar.e();
                int[] iArr = cVar.f9587b;
                float[] fArr = cVar.f9586a;
                float f10 = pointF.x;
                float f11 = pointF.y;
                f3 = 0.0f;
                float fHypot = (float) Math.hypot(pointF2.x - f10, pointF2.y - f11);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                radialGradient = new RadialGradient(f10, f11, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
                qVar.e(radialGradient, jF);
            }
            radialGradient.setLocalMatrix(matrix);
            aVar = this.f5287e;
            aVar.setShader(radialGradient);
            fVar = this.f5295o;
            if (fVar != null) {
                fFloatValue = ((Float) fVar.e()).floatValue();
                if (fFloatValue == f3) {
                    aVar.setMaskFilter(null);
                } else if (fFloatValue != this.f5296p) {
                    aVar.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
                }
                this.f5296p = fFloatValue;
            }
            gVar = this.f5297q;
            if (gVar != null) {
                gVar.b(aVar);
            }
            int iIntValue = (int) ((((i10 / 255.0f) * ((Integer) this.f5292j.e()).intValue()) / 100.0f) * 255.0f);
            PointF pointF3 = oc.d.f11921a;
            aVar.setAlpha(Math.max(0, Math.min(255, iIntValue)));
            canvas.drawPath(path, aVar);
            y3.D();
        }
        long jF2 = f();
        u.q qVar2 = this.f5284b;
        radialGradient = (LinearGradient) qVar2.b(jF2);
        if (radialGradient == null) {
            PointF pointF4 = (PointF) hVar3.e();
            PointF pointF5 = (PointF) hVar2.e();
            kc.c cVar2 = (kc.c) hVar.e();
            radialGradient = new LinearGradient(pointF4.x, pointF4.y, pointF5.x, pointF5.y, cVar2.f9587b, cVar2.f9586a, Shader.TileMode.CLAMP);
            qVar2.e(radialGradient, jF2);
        }
        f3 = 0.0f;
        radialGradient.setLocalMatrix(matrix);
        aVar = this.f5287e;
        aVar.setShader(radialGradient);
        fVar = this.f5295o;
        if (fVar != null) {
            fFloatValue = ((Float) fVar.e()).floatValue();
            if (fFloatValue == f3) {
                aVar.setMaskFilter(null);
            } else if (fFloatValue != this.f5296p) {
                aVar.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f5296p = fFloatValue;
        }
        gVar = this.f5297q;
        if (gVar != null) {
            gVar.b(aVar);
        }
        int iIntValue2 = (int) ((((i10 / 255.0f) * ((Integer) this.f5292j.e()).intValue()) / 100.0f) * 255.0f);
        PointF pointF6 = oc.d.f11921a;
        aVar.setAlpha(Math.max(0, Math.min(255, iIntValue2)));
        canvas.drawPath(path, aVar);
        y3.D();
    }

    public final int f() {
        float f3 = this.f5293k.f5599d;
        float f10 = this.f5294n;
        int iRound = Math.round(f3 * f10);
        int iRound2 = Math.round(this.l.f5599d * f10);
        int iRound3 = Math.round(this.f5291i.f5599d * f10);
        int i10 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }
}
