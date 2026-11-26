package ec;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

public final class k implements j, fc.a, c {

    public final cc.i f5308b;

    public final int f5309c;

    public final boolean f5310d;

    public final boolean f5311e;

    public final fc.f f5312f;

    public final fc.e f5313g;

    public final fc.f f5314h;

    public final fc.f f5315i;

    public final fc.f f5316j;

    public final fc.f f5317k;
    public final fc.f l;

    public boolean f5318n;

    public final Path f5307a = new Path();
    public final db.g m = new db.g(1, (byte) 0);

    public k(cc.i iVar, lc.b bVar, kc.h hVar) {
        this.f5308b = iVar;
        int i10 = hVar.f9611a;
        this.f5309c = i10;
        this.f5310d = hVar.f9619i;
        this.f5311e = hVar.f9620j;
        fc.e eVarM0 = hVar.f9612b.m0();
        this.f5312f = (fc.f) eVarM0;
        fc.e eVarM1 = hVar.f9613c.m0();
        this.f5313g = eVarM1;
        fc.e eVarM2 = hVar.f9614d.m0();
        this.f5314h = (fc.f) eVarM2;
        fc.e eVarM3 = hVar.f9616f.m0();
        this.f5316j = (fc.f) eVarM3;
        fc.e eVarM4 = hVar.f9618h.m0();
        this.l = (fc.f) eVarM4;
        if (i10 == 1) {
            this.f5315i = (fc.f) hVar.f9615e.m0();
            this.f5317k = (fc.f) hVar.f9617g.m0();
        } else {
            this.f5315i = null;
            this.f5317k = null;
        }
        bVar.f(eVarM0);
        bVar.f(eVarM1);
        bVar.f(eVarM2);
        bVar.f(eVarM3);
        bVar.f(eVarM4);
        if (i10 == 1) {
            bVar.f(this.f5315i);
            bVar.f(this.f5317k);
        }
        eVarM0.a(this);
        eVarM1.a(this);
        eVarM2.a(this);
        eVarM3.a(this);
        eVarM4.a(this);
        if (i10 == 1) {
            this.f5315i.a(this);
            this.f5317k.a(this);
        }
    }

    @Override
    public final void a() {
        this.f5318n = false;
        this.f5308b.invalidateSelf();
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
                    this.m.B.add(qVar);
                    qVar.f(this);
                }
            }
            i10++;
        }
    }

    @Override
    public final android.graphics.Path e() {
        throw new UnsupportedOperationException("Method not decompiled: ec.k.e():android.graphics.Path");
    }
}
