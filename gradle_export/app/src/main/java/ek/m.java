package ek;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;

public class m extends bk.a0 {

    public static final m f5435a = new m();

    private m() {
    }

    public static bk.q d(ik.a aVar, int i10) {
        int iB = e4.f.b(i10);
        if (iB == 5) {
            return new bk.t(aVar.r0());
        }
        if (iB == 6) {
            return new bk.t(new dk.j(aVar.r0()));
        }
        if (iB == 7) {
            return new bk.t(Boolean.valueOf(aVar.S()));
        }
        if (iB != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(g4.c.t(i10)));
        }
        aVar.p0();
        return bk.r.A;
    }

    public static void e(ik.b bVar, bk.q qVar) throws IOException {
        if (qVar == null || (qVar instanceof bk.r)) {
            bVar.G();
            return;
        }
        if (qVar instanceof bk.t) {
            bk.t tVarC = qVar.c();
            Serializable serializable = tVarC.A;
            if (serializable instanceof Number) {
                bVar.n0(tVarC.i());
                return;
            } else if (serializable instanceof Boolean) {
                bVar.p0(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(tVarC.e()));
                return;
            } else {
                bVar.o0(tVarC.e());
                return;
            }
        }
        boolean z10 = qVar instanceof bk.n;
        if (z10) {
            bVar.i();
            if (!z10) {
                throw new IllegalStateException("Not a JSON Array: " + qVar);
            }
            Iterator it = ((bk.n) qVar).A.iterator();
            while (it.hasNext()) {
                e(bVar, (bk.q) it.next());
            }
            bVar.v();
            return;
        }
        if (!(qVar instanceof bk.s)) {
            throw new IllegalArgumentException("Couldn't write " + qVar.getClass());
        }
        bVar.l();
        Iterator it2 = ((dk.l) qVar.b().A.entrySet()).iterator();
        while (((dk.k) it2).hasNext()) {
            dk.m mVarB = ((dk.k) it2).b();
            bVar.A((String) mVarB.getKey());
            e(bVar, (bk.q) mVarB.getValue());
        }
        bVar.x();
    }

    @Override
    public final Object b(ik.a aVar) throws IOException {
        bk.q nVar;
        bk.q nVar2;
        int iT0 = aVar.t0();
        int iB = e4.f.b(iT0);
        if (iB == 0) {
            aVar.a();
            nVar = new bk.n();
        } else if (iB != 2) {
            nVar = null;
        } else {
            aVar.i();
            nVar = new bk.s();
        }
        if (nVar == null) {
            return d(aVar, iT0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.G()) {
                String strN0 = nVar instanceof bk.s ? aVar.n0() : null;
                int iT1 = aVar.t0();
                int iB2 = e4.f.b(iT1);
                if (iB2 == 0) {
                    aVar.a();
                    nVar2 = new bk.n();
                } else if (iB2 != 2) {
                    nVar2 = null;
                } else {
                    aVar.i();
                    nVar2 = new bk.s();
                }
                boolean z10 = nVar2 != null;
                if (nVar2 == null) {
                    nVar2 = d(aVar, iT1);
                }
                if (nVar instanceof bk.n) {
                    ((bk.n) nVar).A.add(nVar2);
                } else {
                    ((bk.s) nVar).A.put(strN0, nVar2);
                }
                if (z10) {
                    arrayDeque.addLast(nVar);
                    nVar = nVar2;
                }
            } else {
                if (nVar instanceof bk.n) {
                    aVar.v();
                } else {
                    aVar.x();
                }
                if (arrayDeque.isEmpty()) {
                    return nVar;
                }
                nVar = (bk.q) arrayDeque.removeLast();
            }
        }
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        e(bVar, (bk.q) obj);
    }
}
