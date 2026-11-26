package a3;

import a1.n;
import b2.q;
import b3.k;
import b3.l;
import b3.l0;
import b3.l2;
import b3.m;
import com.google.android.gms.internal.measurement.y3;
import m1.e;
import me.i;

public interface c extends k {
    default y3 r0() {
        return a.f168g;
    }

    default Object y0(i iVar) {
        n nVar;
        q qVar = (q) this;
        if (!qVar.A.N) {
            y2.a.a("ModifierLocal accessed from an unattached node");
        }
        if (!qVar.A.N) {
            y2.a.c("visitAncestors called on an unattached node");
        }
        q qVar2 = qVar.A.E;
        l0 l0VarY = m.y(this);
        while (l0VarY != null) {
            if ((((q) l0VarY.f2059g0.G).D & 32) != 0) {
                while (qVar2 != null) {
                    if ((qVar2.C & 32) != 0) {
                        ?? E = qVar2;
                        ?? eVar = 0;
                        while (E != 0) {
                            if (E instanceof c) {
                                c cVar = (c) E;
                                if (cVar.r0().w(iVar)) {
                                    return cVar.r0().F(iVar);
                                }
                            } else if ((E.C & 32) != 0 && (E instanceof l)) {
                                q qVar3 = ((l) E).P;
                                int i10 = 0;
                                E = E;
                                eVar = eVar;
                                while (qVar3 != null) {
                                    if ((qVar3.C & 32) != 0) {
                                        i10++;
                                        eVar = eVar;
                                        if (i10 == 1) {
                                            E = qVar3;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new e(0, new q[16]);
                                            }
                                            if (E != 0) {
                                                eVar.b(E);
                                                E = 0;
                                            }
                                            eVar.b(qVar3);
                                        }
                                    }
                                    qVar3 = qVar3.F;
                                    E = E;
                                    eVar = eVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            E = m.e(eVar);
                        }
                    }
                    qVar2 = qVar2.E;
                }
            }
            l0VarY = l0VarY.x();
            qVar2 = (l0VarY == null || (nVar = l0VarY.f2059g0) == null) ? null : (l2) nVar.F;
        }
        return ((u00.a) iVar.B).invoke();
    }
}
