package ec;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

public final class l implements fc.a, c, j {

    public final boolean f5321c;

    public final cc.i f5322d;

    public final fc.e f5323e;

    public final fc.e f5324f;

    public final fc.f f5325g;

    public boolean f5328j;

    public final Path f5319a = new Path();

    public final RectF f5320b = new RectF();

    public final db.g f5326h = new db.g(1, (byte) 0);

    public fc.e f5327i = null;

    public l(cc.i iVar, lc.b bVar, kc.i iVar2) {
        this.f5321c = iVar2.f9623c;
        this.f5322d = iVar;
        fc.e eVarM0 = iVar2.f9624d.m0();
        this.f5323e = eVarM0;
        fc.e eVarM1 = ((jc.e) iVar2.f9625e).m0();
        this.f5324f = eVarM1;
        fc.e eVarM2 = iVar2.f9622b.m0();
        this.f5325g = (fc.f) eVarM2;
        bVar.f(eVarM0);
        bVar.f(eVarM1);
        bVar.f(eVarM2);
        eVarM0.a(this);
        eVarM1.a(this);
        eVarM2.a(this);
    }

    @Override
    public final void a() {
        this.f5328j = false;
        this.f5322d.invalidateSelf();
    }

    @Override
    public final void b(List list, List list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i10 >= arrayList.size()) {
                return;
            }
            c cVar = (c) arrayList.get(i10);
            if (cVar instanceof q) {
                q qVar = (q) cVar;
                if (qVar.f5351c == 1) {
                    this.f5326h.B.add(qVar);
                    qVar.f(this);
                } else if (cVar instanceof n) {
                    this.f5327i = ((n) cVar).f5339b;
                }
            } else if (cVar instanceof n) {
                this.f5327i = ((n) cVar).f5339b;
            }
            i10++;
        }
    }

    @Override
    public final android.graphics.Path e() {
        throw new UnsupportedOperationException("Method not decompiled: ec.l.e():android.graphics.Path");
    }
}
