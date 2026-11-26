package lc;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import c3.s0;
import com.google.android.gms.internal.measurement.y3;
import fc.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class b implements ec.e, fc.a {

    public final Path f10215a = new Path();

    public final Matrix f10216b = new Matrix();

    public final Matrix f10217c = new Matrix();

    public final dc.a f10218d = new dc.a(1, 0);

    public final dc.a f10219e;

    public final dc.a f10220f;

    public final dc.a f10221g;

    public final dc.a f10222h;

    public final RectF f10223i;

    public final RectF f10224j;

    public final RectF f10225k;
    public final RectF l;
    public final RectF m;

    public final Matrix f10226n;

    public final cc.i f10227o;

    public final e f10228p;

    public final a1.i f10229q;

    public final fc.f f10230r;

    public b f10231s;

    public b f10232t;

    public List f10233u;

    public final ArrayList f10234v;

    public final n f10235w;

    public boolean f10236x;

    public float f10237y;

    public BlurMaskFilter f10238z;

    public b(cc.i iVar, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f10219e = new dc.a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f10220f = new dc.a(mode2);
        dc.a aVar = new dc.a(1, 0);
        this.f10221g = aVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        dc.a aVar2 = new dc.a();
        aVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.f10222h = aVar2;
        this.f10223i = new RectF();
        this.f10224j = new RectF();
        this.f10225k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.f10226n = new Matrix();
        this.f10234v = new ArrayList();
        this.f10236x = true;
        this.f10237y = 0.0f;
        this.f10227o = iVar;
        this.f10228p = eVar;
        String str = eVar.f10241c;
        List list = eVar.f10246h;
        str.concat("#draw");
        if (eVar.f10257u == 3) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        jc.d dVar = eVar.f10247i;
        dVar.getClass();
        n nVar = new n(dVar);
        this.f10235w = nVar;
        nVar.b(this);
        if (list != null && !list.isEmpty()) {
            a1.i iVar2 = new a1.i(list);
            this.f10229q = iVar2;
            Iterator it = ((ArrayList) iVar2.B).iterator();
            while (it.hasNext()) {
                ((fc.e) it.next()).a(this);
            }
            for (fc.e eVar2 : (ArrayList) this.f10229q.C) {
                f(eVar2);
                eVar2.a(this);
            }
        }
        e eVar3 = this.f10228p;
        if (eVar3.f10256t.isEmpty()) {
            if (true != this.f10236x) {
                this.f10236x = true;
                this.f10227o.invalidateSelf();
                return;
            }
            return;
        }
        fc.f fVar = new fc.f(1, eVar3.f10256t);
        this.f10230r = fVar;
        fVar.f5597b = true;
        fVar.a(new fc.a() {
            @Override
            public final void a() {
                b bVar = this.f10214a;
                boolean z10 = bVar.f10230r.i() == 1.0f;
                if (z10 != bVar.f10236x) {
                    bVar.f10236x = z10;
                    bVar.f10227o.invalidateSelf();
                }
            }
        });
        boolean z10 = ((Float) this.f10230r.e()).floatValue() == 1.0f;
        if (z10 != this.f10236x) {
            this.f10236x = z10;
            this.f10227o.invalidateSelf();
        }
        f(this.f10230r);
    }

    @Override
    public final void a() {
        this.f10227o.invalidateSelf();
    }

    @Override
    public final void b(List list, List list2) {
    }

    @Override
    public void c(RectF rectF, Matrix matrix, boolean z10) {
        this.f10223i.set(0.0f, 0.0f, 0.0f, 0.0f);
        g();
        Matrix matrix2 = this.f10226n;
        matrix2.set(matrix);
        if (z10) {
            List list = this.f10233u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((b) this.f10233u.get(size)).f10235w.h());
                }
            } else {
                b bVar = this.f10232t;
                if (bVar != null) {
                    matrix2.preConcat(bVar.f10235w.h());
                }
            }
        }
        matrix2.preConcat(this.f10235w.h());
    }

    @Override
    public final void d(Canvas canvas, Matrix matrix, int i10) {
        float f3;
        RectF rectF;
        Integer num;
        if (this.f10236x) {
            e eVar = this.f10228p;
            if (!eVar.f10258v) {
                g();
                Matrix matrix2 = this.f10216b;
                matrix2.reset();
                matrix2.set(matrix);
                int i11 = 1;
                for (int size = this.f10233u.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((b) this.f10233u.get(size)).f10235w.h());
                }
                y3.D();
                n nVar = this.f10235w;
                fc.f fVar = (fc.f) nVar.f5637n;
                int iIntValue = (int) ((((i10 / 255.0f) * ((fVar == null || (num = (Integer) fVar.e()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
                if (this.f10231s == null && !l()) {
                    matrix2.preConcat(nVar.h());
                    i(canvas, matrix2, iIntValue);
                    y3.D();
                    y3.D();
                    m();
                    return;
                }
                RectF rectF2 = this.f10223i;
                c(rectF2, matrix2, false);
                int i12 = 3;
                if (this.f10231s != null && eVar.f10257u != 3) {
                    RectF rectF3 = this.l;
                    rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                    this.f10231s.c(rectF3, matrix, true);
                    if (!rectF2.intersect(rectF3)) {
                        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
                matrix2.preConcat(nVar.h());
                RectF rectF4 = this.f10225k;
                rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
                boolean zL = l();
                int i13 = 2;
                a1.i iVar = this.f10229q;
                Path path = this.f10215a;
                if (zL) {
                    int size2 = ((List) iVar.D).size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size2) {
                            kc.f fVar2 = (kc.f) ((List) iVar.D).get(i14);
                            Path path2 = (Path) ((fc.e) ((ArrayList) iVar.B).get(i14)).e();
                            if (path2 != null) {
                                path.set(path2);
                                path.transform(matrix2);
                                int iB = e4.f.b(fVar2.f9606a);
                                if (iB != 0) {
                                    if (iB != i11) {
                                        if (iB != i13) {
                                            if (iB == i12) {
                                            }
                                            rectF = this.m;
                                            path.computeBounds(rectF, false);
                                            if (i14 == 0) {
                                                rectF4.set(rectF);
                                            } else {
                                                rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                            }
                                        }
                                    }
                                }
                                if (fVar2.f9609d) {
                                }
                                rectF = this.m;
                                path.computeBounds(rectF, false);
                                if (i14 == 0) {
                                    rectF4.set(rectF);
                                } else {
                                    rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                }
                            }
                            i14++;
                            i11 = 1;
                            i13 = 2;
                            i12 = 3;
                        } else if (!rectF2.intersect(rectF4)) {
                            f3 = 0.0f;
                            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                            break;
                        }
                        f3 = 0.0f;
                        break;
                    }
                } else {
                    f3 = 0.0f;
                }
                float width = canvas.getWidth();
                float height = canvas.getHeight();
                RectF rectF5 = this.f10224j;
                rectF5.set(f3, f3, width, height);
                Matrix matrix3 = this.f10217c;
                canvas.getMatrix(matrix3);
                if (!matrix3.isIdentity()) {
                    matrix3.invert(matrix3);
                    matrix3.mapRect(rectF5);
                }
                if (!rectF2.intersect(rectF5)) {
                    rectF2.set(f3, f3, f3, f3);
                }
                y3.D();
                if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                    dc.a aVar = this.f10218d;
                    aVar.setAlpha(255);
                    s0 s0Var = oc.e.f11922a;
                    canvas.saveLayer(rectF2, aVar);
                    y3.D();
                    y3.D();
                    h(canvas);
                    i(canvas, matrix2, iIntValue);
                    y3.D();
                    if (l()) {
                        dc.a aVar2 = this.f10219e;
                        canvas.saveLayer(rectF2, aVar2);
                        y3.D();
                        y3.D();
                        int i15 = 0;
                        while (true) {
                            List list = (List) iVar.D;
                            ArrayList arrayList = (ArrayList) iVar.B;
                            if (i15 >= list.size()) {
                                break;
                            }
                            kc.f fVar3 = (kc.f) list.get(i15);
                            fc.e eVar2 = (fc.e) arrayList.get(i15);
                            fc.e eVar3 = (fc.e) ((ArrayList) iVar.C).get(i15);
                            int i16 = fVar3.f9606a;
                            boolean z10 = fVar3.f9609d;
                            int iB2 = e4.f.b(i16);
                            int i17 = i15;
                            dc.a aVar3 = this.f10220f;
                            if (iB2 != 0) {
                                if (iB2 == 1) {
                                    if (i17 == 0) {
                                        aVar.setColor(-16777216);
                                        aVar.setAlpha(255);
                                        canvas.drawRect(rectF2, aVar);
                                    }
                                    if (z10) {
                                        canvas.saveLayer(rectF2, aVar3);
                                        y3.D();
                                        canvas.drawRect(rectF2, aVar);
                                        aVar3.setAlpha((int) (((Integer) eVar3.e()).intValue() * 2.55f));
                                        path.set((Path) eVar2.e());
                                        path.transform(matrix2);
                                        canvas.drawPath(path, aVar3);
                                        canvas.restore();
                                    } else {
                                        path.set((Path) eVar2.e());
                                        path.transform(matrix2);
                                        canvas.drawPath(path, aVar3);
                                    }
                                } else if (iB2 != 2) {
                                    if (iB2 == 3 && !arrayList.isEmpty()) {
                                        int i18 = 0;
                                        while (true) {
                                            if (i18 >= list.size()) {
                                                aVar.setAlpha(255);
                                                canvas.drawRect(rectF2, aVar);
                                                break;
                                            } else if (((kc.f) list.get(i18)).f9606a != 4) {
                                                break;
                                            } else {
                                                i18++;
                                            }
                                        }
                                    }
                                } else if (z10) {
                                    canvas.saveLayer(rectF2, aVar2);
                                    y3.D();
                                    canvas.drawRect(rectF2, aVar);
                                    aVar3.setAlpha((int) (((Integer) eVar3.e()).intValue() * 2.55f));
                                    path.set((Path) eVar2.e());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, aVar3);
                                    canvas.restore();
                                } else {
                                    canvas.saveLayer(rectF2, aVar2);
                                    y3.D();
                                    path.set((Path) eVar2.e());
                                    path.transform(matrix2);
                                    aVar.setAlpha((int) (((Integer) eVar3.e()).intValue() * 2.55f));
                                    canvas.drawPath(path, aVar);
                                    canvas.restore();
                                }
                            } else if (z10) {
                                canvas.saveLayer(rectF2, aVar);
                                y3.D();
                                canvas.drawRect(rectF2, aVar);
                                path.set((Path) eVar2.e());
                                path.transform(matrix2);
                                aVar.setAlpha((int) (((Integer) eVar3.e()).intValue() * 2.55f));
                                canvas.drawPath(path, aVar3);
                                canvas.restore();
                            } else {
                                path.set((Path) eVar2.e());
                                path.transform(matrix2);
                                aVar.setAlpha((int) (((Integer) eVar3.e()).intValue() * 2.55f));
                                canvas.drawPath(path, aVar);
                            }
                            i15 = i17 + 1;
                        }
                        canvas.restore();
                        y3.D();
                    }
                    if (this.f10231s != null) {
                        canvas.saveLayer(rectF2, this.f10221g);
                        y3.D();
                        y3.D();
                        h(canvas);
                        this.f10231s.d(canvas, matrix, iIntValue);
                        canvas.restore();
                        y3.D();
                        y3.D();
                    }
                    canvas.restore();
                    y3.D();
                }
                y3.D();
                m();
                return;
            }
        }
        y3.D();
    }

    public final void f(fc.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f10234v.add(eVar);
    }

    public final void g() {
        if (this.f10233u != null) {
            return;
        }
        if (this.f10232t == null) {
            this.f10233u = Collections.EMPTY_LIST;
            return;
        }
        this.f10233u = new ArrayList();
        for (b bVar = this.f10232t; bVar != null; bVar = bVar.f10232t) {
            this.f10233u.add(bVar);
        }
    }

    public final void h(Canvas canvas) {
        RectF rectF = this.f10223i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f10222h);
        y3.D();
    }

    public abstract void i(Canvas canvas, Matrix matrix, int i10);

    public hf.c j() {
        return this.f10228p.f10259w;
    }

    public ce.c k() {
        return this.f10228p.f10260x;
    }

    public final boolean l() {
        a1.i iVar = this.f10229q;
        return (iVar == null || ((ArrayList) iVar.B).isEmpty()) ? false : true;
    }

    public final void m() {
        qj.c cVar = this.f10227o.A.f3106a;
        String str = this.f10228p.f10241c;
        Object obj = cVar.B;
    }

    public void n(float f3) {
        n nVar = this.f10235w;
        fc.f fVar = (fc.f) nVar.f5637n;
        if (fVar != null) {
            fVar.h(f3);
        }
        fc.f fVar2 = (fc.f) nVar.l;
        if (fVar2 != null) {
            fVar2.h(f3);
        }
        fc.f fVar3 = (fc.f) nVar.m;
        if (fVar3 != null) {
            fVar3.h(f3);
        }
        fc.i iVar = (fc.i) nVar.f5631f;
        if (iVar != null) {
            iVar.h(f3);
        }
        fc.e eVar = (fc.e) nVar.f5632g;
        if (eVar != null) {
            eVar.h(f3);
        }
        fc.h hVar = (fc.h) nVar.f5633h;
        if (hVar != null) {
            hVar.h(f3);
        }
        fc.f fVar4 = (fc.f) nVar.f5634i;
        if (fVar4 != null) {
            fVar4.h(f3);
        }
        fc.f fVar5 = (fc.f) nVar.f5635j;
        if (fVar5 != null) {
            fVar5.h(f3);
        }
        fc.f fVar6 = (fc.f) nVar.f5636k;
        if (fVar6 != null) {
            fVar6.h(f3);
        }
        int i10 = 0;
        a1.i iVar2 = this.f10229q;
        if (iVar2 != null) {
            ArrayList arrayList = (ArrayList) iVar2.B;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((fc.e) arrayList.get(i11)).h(f3);
            }
        }
        fc.f fVar7 = this.f10230r;
        if (fVar7 != null) {
            fVar7.h(f3);
        }
        b bVar = this.f10231s;
        if (bVar != null) {
            bVar.n(f3);
        }
        while (true) {
            ArrayList arrayList2 = this.f10234v;
            if (i10 >= arrayList2.size()) {
                return;
            }
            ((fc.e) arrayList2.get(i10)).h(f3);
            i10++;
        }
    }
}
