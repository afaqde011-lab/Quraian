package ec;

import java.util.ArrayList;
import java.util.List;

public final class q implements c, fc.a {

    public final boolean f5349a;

    public final ArrayList f5350b = new ArrayList();

    public final int f5351c;

    public final fc.f f5352d;

    public final fc.f f5353e;

    public final fc.f f5354f;

    public q(lc.b bVar, kc.p pVar) {
        this.f5349a = pVar.f9655e;
        this.f5351c = pVar.f9651a;
        fc.e eVarM0 = pVar.f9652b.m0();
        this.f5352d = (fc.f) eVarM0;
        fc.e eVarM1 = pVar.f9653c.m0();
        this.f5353e = (fc.f) eVarM1;
        fc.e eVarM2 = pVar.f9654d.m0();
        this.f5354f = (fc.f) eVarM2;
        bVar.f(eVarM0);
        bVar.f(eVarM1);
        bVar.f(eVarM2);
        eVarM0.a(this);
        eVarM1.a(this);
        eVarM2.a(this);
    }

    @Override
    public final void a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5350b;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((fc.a) arrayList.get(i10)).a();
            i10++;
        }
    }

    @Override
    public final void b(List list, List list2) {
    }

    public final void f(fc.a aVar) {
        this.f5350b.add(aVar);
    }
}
