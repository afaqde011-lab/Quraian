package b3;

public final class i1 implements k1 {
    @Override
    public final int a() {
        return 16;
    }

    @Override
    public final boolean b(s sVar, l0 l0Var) {
        p1 p1Var = (p1) l0Var.f2059g0.E;
        p1Var.getClass();
        b2.q qVarB1 = p1Var.B1(q1.g(16));
        if (qVarB1 != null && qVarB1.N) {
            if (!qVarB1.A.N) {
                y2.a.c("visitLocalDescendants called on an unattached node");
            }
            b2.q qVar = qVarB1.A;
            if ((qVar.D & 16) != 0) {
                while (qVar != null) {
                    if ((qVar.C & 16) != 0) {
                        ?? E = qVar;
                        ?? eVar = 0;
                        while (E != 0) {
                            if (E instanceof e2) {
                                if (((e2) E).Z0()) {
                                    sVar.C = sVar.A.f14838b - 1;
                                    return true;
                                }
                            } else if ((E.C & 16) != 0 && (E instanceof l)) {
                                b2.q qVar2 = ((l) E).P;
                                int i10 = 0;
                                E = E;
                                eVar = eVar;
                                while (qVar2 != null) {
                                    if ((qVar2.C & 16) != 0) {
                                        i10++;
                                        eVar = eVar;
                                        if (i10 == 1) {
                                            E = qVar2;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new m1.e(0, new b2.q[16]);
                                            }
                                            if (E != 0) {
                                                eVar.b(E);
                                                E = 0;
                                            }
                                            eVar.b(qVar2);
                                        }
                                    }
                                    qVar2 = qVar2.F;
                                    E = E;
                                    eVar = eVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            E = m.e(eVar);
                        }
                    }
                    qVar = qVar.F;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean c(b2.q qVar) {
        ?? eVar = 0;
        while (qVar != 0) {
            if (qVar instanceof e2) {
                ((e2) qVar).f0();
            } else if ((qVar.C & 16) != 0 && (qVar instanceof l)) {
                b2.q qVar2 = ((l) qVar).P;
                int i10 = 0;
                eVar = eVar;
                qVar = qVar;
                while (qVar2 != null) {
                    if ((qVar2.C & 16) != 0) {
                        i10++;
                        eVar = eVar;
                        if (i10 == 1) {
                            qVar = qVar2;
                        } else {
                            if (eVar == 0) {
                                eVar = new m1.e(0, new b2.q[16]);
                            }
                            if (qVar != 0) {
                                eVar.b(qVar);
                                qVar = 0;
                            }
                            eVar.b(qVar2);
                        }
                    }
                    qVar2 = qVar2.F;
                    eVar = eVar;
                    qVar = qVar;
                }
                if (i10 == 1) {
                }
            }
            qVar = m.e(eVar);
        }
        return false;
    }

    @Override
    public final void e(l0 l0Var, long j9, s sVar, int i10, boolean z10) {
        l0Var.C(j9, sVar, i10, z10);
    }

    @Override
    public final boolean f(l0 l0Var) {
        return true;
    }
}
