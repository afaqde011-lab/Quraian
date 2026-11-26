package h4;

import java.util.ArrayList;
import java.util.Iterator;

public final class i extends n {
    @Override
    public final void a(d dVar) {
        g4.a aVar = (g4.a) this.f6599b;
        int i10 = aVar.f6095r0;
        e eVar = this.f6605h;
        Iterator it = eVar.l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = ((e) it.next()).f6582g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (i10 == 0 || i10 == 2) {
            eVar.d(i12 + aVar.f6097t0);
        } else {
            eVar.d(i11 + aVar.f6097t0);
        }
    }

    @Override
    public final void d() {
        g4.e eVar = this.f6599b;
        if (eVar instanceof g4.a) {
            e eVar2 = this.f6605h;
            eVar2.f6577b = true;
            ArrayList arrayList = eVar2.l;
            g4.a aVar = (g4.a) eVar;
            int i10 = aVar.f6095r0;
            boolean z10 = aVar.f6096s0;
            int i11 = 0;
            if (i10 == 0) {
                eVar2.f6580e = 4;
                while (i11 < aVar.f6206q0) {
                    g4.e eVar3 = aVar.f6205p0[i11];
                    if (z10 || eVar3.f6134f0 != 8) {
                        e eVar4 = eVar3.f6129d.f6605h;
                        eVar4.f6586k.add(eVar2);
                        arrayList.add(eVar4);
                    }
                    i11++;
                }
                m(this.f6599b.f6129d.f6605h);
                m(this.f6599b.f6129d.f6606i);
                return;
            }
            if (i10 == 1) {
                eVar2.f6580e = 5;
                while (i11 < aVar.f6206q0) {
                    g4.e eVar5 = aVar.f6205p0[i11];
                    if (z10 || eVar5.f6134f0 != 8) {
                        e eVar6 = eVar5.f6129d.f6606i;
                        eVar6.f6586k.add(eVar2);
                        arrayList.add(eVar6);
                    }
                    i11++;
                }
                m(this.f6599b.f6129d.f6605h);
                m(this.f6599b.f6129d.f6606i);
                return;
            }
            if (i10 == 2) {
                eVar2.f6580e = 6;
                while (i11 < aVar.f6206q0) {
                    g4.e eVar7 = aVar.f6205p0[i11];
                    if (z10 || eVar7.f6134f0 != 8) {
                        e eVar8 = eVar7.f6131e.f6605h;
                        eVar8.f6586k.add(eVar2);
                        arrayList.add(eVar8);
                    }
                    i11++;
                }
                m(this.f6599b.f6131e.f6605h);
                m(this.f6599b.f6131e.f6606i);
                return;
            }
            if (i10 != 3) {
                return;
            }
            eVar2.f6580e = 7;
            while (i11 < aVar.f6206q0) {
                g4.e eVar9 = aVar.f6205p0[i11];
                if (z10 || eVar9.f6134f0 != 8) {
                    e eVar10 = eVar9.f6131e.f6606i;
                    eVar10.f6586k.add(eVar2);
                    arrayList.add(eVar10);
                }
                i11++;
            }
            m(this.f6599b.f6131e.f6605h);
            m(this.f6599b.f6131e.f6606i);
        }
    }

    @Override
    public final void e() {
        g4.e eVar = this.f6599b;
        if (eVar instanceof g4.a) {
            int i10 = ((g4.a) eVar).f6095r0;
            e eVar2 = this.f6605h;
            if (i10 == 0 || i10 == 1) {
                eVar.X = eVar2.f6582g;
            } else {
                eVar.Y = eVar2.f6582g;
            }
        }
    }

    @Override
    public final void f() {
        this.f6600c = null;
        this.f6605h.c();
    }

    @Override
    public final boolean k() {
        return false;
    }

    public final void m(e eVar) {
        e eVar2 = this.f6605h;
        eVar2.f6586k.add(eVar);
        eVar.l.add(eVar2);
    }
}
