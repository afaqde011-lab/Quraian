package ec;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.gms.internal.measurement.y3;
import java.util.ArrayList;
import java.util.List;

public abstract class b implements fc.a, c, e {

    public final cc.i f5248e;

    public final lc.b f5249f;

    public final float[] f5251h;

    public final dc.a f5252i;

    public final fc.f f5253j;

    public final fc.f f5254k;
    public final ArrayList l;
    public final fc.f m;

    public final fc.f f5255n;

    public float f5256o;

    public final fc.g f5257p;

    public final PathMeasure f5244a = new PathMeasure();

    public final Path f5245b = new Path();

    public final Path f5246c = new Path();

    public final RectF f5247d = new RectF();

    public final ArrayList f5250g = new ArrayList();

    public b(cc.i iVar, lc.b bVar, Paint.Cap cap, Paint.Join join, float f3, jc.a aVar, jc.b bVar2, ArrayList arrayList, jc.b bVar3) {
        dc.a aVar2 = new dc.a(1, 0);
        this.f5252i = aVar2;
        this.f5256o = 0.0f;
        this.f5248e = iVar;
        this.f5249f = bVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f3);
        this.f5254k = (fc.f) aVar.m0();
        this.f5253j = (fc.f) bVar2.m0();
        if (bVar3 == null) {
            this.m = null;
        } else {
            this.m = (fc.f) bVar3.m0();
        }
        this.l = new ArrayList(arrayList.size());
        this.f5251h = new float[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.l.add(((jc.b) arrayList.get(i10)).m0());
        }
        bVar.f(this.f5254k);
        bVar.f(this.f5253j);
        for (int i11 = 0; i11 < this.l.size(); i11++) {
            bVar.f((fc.e) this.l.get(i11));
        }
        fc.f fVar = this.m;
        if (fVar != null) {
            bVar.f(fVar);
        }
        this.f5254k.a(this);
        this.f5253j.a(this);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((fc.e) this.l.get(i12)).a(this);
        }
        fc.f fVar2 = this.m;
        if (fVar2 != null) {
            fVar2.a(this);
        }
        if (bVar.j() != null) {
            fc.e eVarM0 = ((jc.b) bVar.j().B).m0();
            this.f5255n = (fc.f) eVarM0;
            eVarM0.a(this);
            bVar.f(eVarM0);
        }
        if (bVar.k() != null) {
            this.f5257p = new fc.g(this, bVar, bVar.k());
        }
    }

    @Override
    public final void a() {
        this.f5248e.invalidateSelf();
    }

    @Override
    public final void b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        a aVar = null;
        q qVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList2.get(size);
            if (cVar instanceof q) {
                q qVar2 = (q) cVar;
                if (qVar2.f5351c == 2) {
                    qVar = qVar2;
                }
            }
        }
        if (qVar != null) {
            qVar.f(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f5250g;
            if (size2 < 0) {
                break;
            }
            c cVar2 = (c) list2.get(size2);
            if (cVar2 instanceof q) {
                q qVar3 = (q) cVar2;
                if (qVar3.f5351c == 2) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                    a aVar2 = new a(qVar3);
                    qVar3.f(this);
                    aVar = aVar2;
                } else if (!(cVar2 instanceof j)) {
                    if (aVar == null) {
                        aVar = new a(qVar);
                    }
                    aVar.f5242a.add((j) cVar2);
                }
            } else if (!(cVar2 instanceof j)) {
                if (aVar == null) {
                    aVar = new a(qVar);
                }
                aVar.f5242a.add((j) cVar2);
            }
        }
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    @Override
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f5245b;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5250g;
            if (i10 >= arrayList.size()) {
                RectF rectF2 = this.f5247d;
                path.computeBounds(rectF2, false);
                float fI = this.f5253j.i() / 2.0f;
                rectF2.set(rectF2.left - fI, rectF2.top - fI, rectF2.right + fI, rectF2.bottom + fI);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                y3.D();
                return;
            }
            a aVar = (a) arrayList.get(i10);
            for (int i11 = 0; i11 < aVar.f5242a.size(); i11++) {
                path.addPath(((j) aVar.f5242a.get(i11)).e(), matrix);
            }
            i10++;
        }
    }

    @Override
    public void d(Canvas canvas, Matrix matrix, int i10) {
        float[] fArr;
        int i11;
        float f3;
        BlurMaskFilter blurMaskFilter;
        b bVar = this;
        float[] fArr2 = (float[]) oc.e.f11925d.get();
        boolean z10 = false;
        fArr2[0] = 0.0f;
        int i12 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            y3.D();
            return;
        }
        fc.f fVar = bVar.f5254k;
        float fK = (i10 / 255.0f) * fVar.k(fVar.b(), fVar.c());
        float f10 = 100.0f;
        PointF pointF = oc.d.f11921a;
        int iMax = Math.max(0, Math.min(255, (int) ((fK / 100.0f) * 255.0f)));
        dc.a aVar = bVar.f5252i;
        aVar.setAlpha(iMax);
        aVar.setStrokeWidth(oc.e.d(matrix) * bVar.f5253j.i());
        if (aVar.getStrokeWidth() <= 0.0f) {
            y3.D();
            return;
        }
        ArrayList arrayList = bVar.l;
        if (arrayList.isEmpty()) {
            y3.D();
        } else {
            float fD = oc.e.d(matrix);
            int i13 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = bVar.f5251h;
                if (i13 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((fc.e) arrayList.get(i13)).e()).floatValue();
                fArr[i13] = fFloatValue;
                if (i13 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr[i13] = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr[i13] = 0.1f;
                }
                fArr[i13] = fArr[i13] * fD;
                i13++;
            }
            fc.f fVar2 = bVar.m;
            aVar.setPathEffect(new DashPathEffect(fArr, fVar2 == null ? 0.0f : ((Float) fVar2.e()).floatValue() * fD));
            y3.D();
        }
        fc.f fVar3 = bVar.f5255n;
        if (fVar3 != null) {
            float fFloatValue2 = ((Float) fVar3.e()).floatValue();
            if (fFloatValue2 == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (fFloatValue2 != bVar.f5256o) {
                lc.b bVar2 = bVar.f5249f;
                if (bVar2.f10237y == fFloatValue2) {
                    blurMaskFilter = bVar2.f10238z;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    bVar2.f10238z = blurMaskFilter2;
                    bVar2.f10237y = fFloatValue2;
                    blurMaskFilter = blurMaskFilter2;
                }
                aVar.setMaskFilter(blurMaskFilter);
            }
            bVar.f5256o = fFloatValue2;
        }
        fc.g gVar = bVar.f5257p;
        if (gVar != null) {
            gVar.b(aVar);
        }
        int i14 = 0;
        while (true) {
            ArrayList arrayList2 = bVar.f5250g;
            if (i14 >= arrayList2.size()) {
                y3.D();
                return;
            }
            a aVar2 = (a) arrayList2.get(i14);
            q qVar = aVar2.f5243b;
            ArrayList arrayList3 = aVar2.f5242a;
            Path path = bVar.f5245b;
            if (qVar != null) {
                path.reset();
                for (int size2 = arrayList3.size() - i12; size2 >= 0; size2--) {
                    path.addPath(((j) arrayList3.get(size2)).e(), matrix);
                }
                float fFloatValue3 = ((Float) qVar.f5352d.e()).floatValue() / f10;
                float fFloatValue4 = ((Float) qVar.f5353e.e()).floatValue() / f10;
                float fFloatValue5 = ((Float) qVar.f5354f.e()).floatValue() / 360.0f;
                if (fFloatValue3 >= 0.01f || fFloatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = bVar.f5244a;
                    pathMeasure.setPath(path, z10);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length = pathMeasure.getLength() + length;
                    }
                    float f11 = fFloatValue5 * length;
                    float f12 = (fFloatValue3 * length) + f11;
                    float fMin = Math.min((fFloatValue4 * length) + f11, (f12 + length) - 1.0f);
                    int size3 = arrayList3.size() - i12;
                    float f13 = 0.0f;
                    while (size3 >= 0) {
                        int i15 = i12;
                        Path pathE = ((j) arrayList3.get(size3)).e();
                        Path path2 = bVar.f5246c;
                        path2.set(pathE);
                        path2.transform(matrix);
                        pathMeasure.setPath(path2, z10);
                        float length2 = pathMeasure.getLength();
                        if (fMin > length) {
                            float f14 = fMin - length;
                            if (f14 >= f13 + length2 || f13 >= f14) {
                                f3 = f13 + length2;
                                if (f3 < f12 && f13 <= fMin) {
                                    if (f3 > fMin || f12 >= f13) {
                                        oc.e.a(path2, f12 < f13 ? 0.0f : (f12 - f13) / length2, fMin > f3 ? 1.0f : (fMin - f13) / length2, 0.0f);
                                        canvas.drawPath(path2, aVar);
                                    } else {
                                        canvas.drawPath(path2, aVar);
                                    }
                                }
                            } else {
                                oc.e.a(path2, f12 > length ? (f12 - length) / length2 : 0.0f, Math.min(f14 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path2, aVar);
                            }
                        } else {
                            f3 = f13 + length2;
                            if (f3 < f12) {
                            }
                        }
                        f13 += length2;
                        size3--;
                        bVar = this;
                        i12 = i15;
                        z10 = false;
                    }
                    i11 = i12;
                    y3.D();
                } else {
                    canvas.drawPath(path, aVar);
                    y3.D();
                    i11 = i12;
                }
            } else {
                i11 = i12;
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((j) arrayList3.get(size4)).e(), matrix);
                }
                y3.D();
                canvas.drawPath(path, aVar);
                y3.D();
            }
            i14++;
            bVar = this;
            i12 = i11;
            z10 = false;
            f10 = 100.0f;
        }
    }
}
