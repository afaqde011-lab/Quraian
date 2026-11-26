package ec;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

public final class o implements j, fc.a {

    public final boolean f5342b;

    public final cc.i f5343c;

    public final fc.l f5344d;

    public boolean f5345e;

    public final Path f5341a = new Path();

    public final db.g f5346f = new db.g(1, (byte) 0);

    public o(cc.i iVar, lc.b bVar, kc.n nVar) {
        this.f5342b = nVar.f9641d;
        this.f5343c = iVar;
        fc.l lVar = new fc.l((List) nVar.f9640c.B);
        this.f5344d = lVar;
        bVar.f(lVar);
        lVar.a(this);
    }

    @Override
    public final void a() {
        this.f5345e = false;
        this.f5343c.invalidateSelf();
    }

    @Override
    public final void b(List list, List list2) {
        ArrayList arrayList = null;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i10 >= arrayList2.size()) {
                this.f5344d.f5621j = arrayList;
                return;
            }
            c cVar = (c) arrayList2.get(i10);
            if (cVar instanceof q) {
                q qVar = (q) cVar;
                if (qVar.f5351c == 1) {
                    this.f5346f.B.add(qVar);
                    qVar.f(this);
                } else if (!(cVar instanceof n)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((n) cVar);
                }
            } else if (!(cVar instanceof n)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((n) cVar);
            }
            i10++;
        }
    }

    @Override
    public final Path e() {
        boolean z10 = this.f5345e;
        Path path = this.f5341a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f5342b) {
            this.f5345e = true;
            return path;
        }
        Path path2 = (Path) this.f5344d.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f5346f.h(path);
        this.f5345e = true;
        return path;
    }
}
