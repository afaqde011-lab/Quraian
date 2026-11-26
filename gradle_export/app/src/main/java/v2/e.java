package v2;

import b3.e2;
import b3.j1;
import b3.m2;
import b3.o2;

public abstract class e extends b2.q implements o2, e2, b3.j {
    public b3.n O;
    public a P;
    public boolean Q;

    public e(a aVar, b3.n nVar) {
        this.O = nVar;
        this.P = aVar;
    }

    @Override
    public final void A(k kVar, l lVar, long j9) {
        if (lVar == l.B) {
            ?? r4 = kVar.f15387a;
            int size = r4.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (E1(((s) r4.get(i10)).f15407i)) {
                    int i11 = kVar.f15392f;
                    if (i11 == 4) {
                        this.Q = true;
                        D1();
                        return;
                    } else {
                        if (i11 == 5) {
                            F1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final void B1() {
        a aVar;
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        b3.m.C(this, new d(zVar));
        e eVar = (e) zVar.A;
        if (eVar == null || (aVar = eVar.P) == null) {
            aVar = this.P;
        }
        C1(aVar);
    }

    public abstract void C1(p pVar);

    public final void D1() {
        kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
        vVar.A = true;
        b3.m.E(this, new b3.a(vVar, 27));
        if (vVar.A) {
            B1();
        }
    }

    public abstract boolean E1(int i10);

    public final void F1() {
        if (this.Q) {
            this.Q = false;
            if (this.N) {
                kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
                b3.m.C(this, new c3.s(zVar, 2));
                e eVar = (e) zVar.A;
                if (eVar != null) {
                    eVar.B1();
                } else {
                    C1(null);
                }
            }
        }
    }

    @Override
    public final void X() {
        F1();
    }

    @Override
    public final long p() {
        b3.n nVar = this.O;
        if (nVar == null) {
            return m2.f2082a;
        }
        y3.c cVar = b3.m.y(this).Z;
        int i10 = m2.f2083b;
        return j1.h(cVar.R0(nVar.f2084a), cVar.R0(nVar.f2085b), cVar.R0(nVar.f2086c), cVar.R0(nVar.f2087d));
    }

    @Override
    public final void u1() {
        F1();
    }
}
