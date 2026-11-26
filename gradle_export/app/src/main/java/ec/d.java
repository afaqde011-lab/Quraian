package ec;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public final class d implements e, j, fc.a {

    public final Matrix f5258a;

    public final Path f5259b;

    public final RectF f5260c;

    public final boolean f5261d;

    public final ArrayList f5262e;

    public final cc.i f5263f;

    public final fc.n f5264g;

    public d(cc.i iVar, lc.b bVar, kc.m mVar, cc.a aVar) {
        jc.d dVar;
        String str = mVar.f9635a;
        boolean z10 = mVar.f9637c;
        List list = mVar.f9636b;
        ArrayList arrayList = new ArrayList(list.size());
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            c cVarA = ((kc.b) list.get(i11)).a(iVar, aVar, bVar);
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        while (true) {
            if (i10 >= list.size()) {
                dVar = null;
                break;
            }
            kc.b bVar2 = (kc.b) list.get(i10);
            if (bVar2 instanceof jc.d) {
                dVar = (jc.d) bVar2;
                break;
            }
            i10++;
        }
        this(iVar, bVar, z10, arrayList, dVar);
    }

    public d(cc.i iVar, lc.b bVar, boolean z10, ArrayList arrayList, jc.d dVar) {
        new dc.a();
        new RectF();
        this.f5258a = new Matrix();
        this.f5259b = new Path();
        this.f5260c = new RectF();
        this.f5263f = iVar;
        this.f5261d = z10;
        this.f5262e = arrayList;
        if (dVar != null) {
            fc.n nVar = new fc.n(dVar);
            this.f5264g = nVar;
            nVar.a(bVar);
            nVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof m) {
                arrayList2.add((m) cVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            m mVar = (m) arrayList2.get(size2);
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            if (mVar.f5337i == null) {
                while (listIterator.hasPrevious() && listIterator.previous() != mVar) {
                }
                ArrayList arrayList3 = new ArrayList();
                while (listIterator.hasPrevious()) {
                    arrayList3.add((c) listIterator.previous());
                    listIterator.remove();
                }
                Collections.reverse(arrayList3);
                mVar.f5337i = new d(mVar.f5331c, mVar.f5332d, mVar.f5333e, arrayList3, null);
            }
        }
    }

    @Override
    public final void a() {
        this.f5263f.invalidateSelf();
    }

    @Override
    public final void b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.f5262e;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) arrayList.get(size2);
            cVar.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(cVar);
        }
    }

    @Override
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        Matrix matrix2 = this.f5258a;
        matrix2.set(matrix);
        fc.n nVar = this.f5264g;
        if (nVar != null) {
            matrix2.preConcat(nVar.h());
        }
        RectF rectF2 = this.f5260c;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f5262e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof e) {
                ((e) cVar).c(rectF2, matrix2, z10);
                rectF.union(rectF2);
            }
        }
    }

    @Override
    public final void d(Canvas canvas, Matrix matrix, int i10) {
        if (this.f5261d) {
            return;
        }
        Matrix matrix2 = this.f5258a;
        matrix2.set(matrix);
        fc.n nVar = this.f5264g;
        if (nVar != null) {
            matrix2.preConcat(nVar.h());
            fc.f fVar = (fc.f) nVar.f5637n;
            i10 = (int) (((((fVar == null ? 100 : ((Integer) fVar.e()).intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        this.f5263f.getClass();
        ArrayList arrayList = this.f5262e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof e) {
                ((e) obj).d(canvas, matrix2, i10);
            }
        }
    }

    @Override
    public final Path e() {
        Matrix matrix = this.f5258a;
        matrix.reset();
        fc.n nVar = this.f5264g;
        if (nVar != null) {
            matrix.set(nVar.h());
        }
        Path path = this.f5259b;
        path.reset();
        if (!this.f5261d) {
            ArrayList arrayList = this.f5262e;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) arrayList.get(size);
                if (cVar instanceof j) {
                    path.addPath(((j) cVar).e(), matrix);
                }
            }
        }
        return path;
    }
}
