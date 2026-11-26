package g2;

public final class t {

    public static final t f6091b = new t();

    public static final t f6092c = new t();

    public static final t f6093d = new t();

    public final m1.e f6094a = new m1.e(0, new v[16]);

    public static void a(t tVar) {
        tVar.getClass();
        if (tVar == f6091b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (tVar == f6092c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        m1.e eVar = tVar.f6094a;
        int i10 = eVar.C;
        if (i10 == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = eVar.A;
        for (int i11 = 0; i11 < i10; i11++) {
            b2.q qVar = (b2.q) ((v) objArr[i11]);
            if (!qVar.A.N) {
                y2.a.c("visitChildren called on an unattached node");
            }
            m1.e eVar2 = new m1.e(0, new b2.q[16]);
            b2.q qVar2 = qVar.A;
            b2.q qVar3 = qVar2.F;
            if (qVar3 == null) {
                b3.m.b(eVar2, qVar2);
            } else {
                eVar2.b(qVar3);
            }
            while (true) {
                int i12 = eVar2.C;
                if (i12 == 0) {
                    break;
                }
                b2.q qVarE = (b2.q) eVar2.k(i12 - 1);
                if ((qVarE.D & 1024) == 0) {
                    b3.m.b(eVar2, qVarE);
                } else {
                    while (qVarE != null) {
                        if ((qVarE.C & 1024) != 0) {
                            m1.e eVar3 = null;
                            while (qVarE != null) {
                                if (qVarE instanceof a0) {
                                    if (((a0) qVarE).I1(7)) {
                                        break;
                                    }
                                } else if ((qVarE.C & 1024) != 0 && (qVarE instanceof b3.l)) {
                                    int i13 = 0;
                                    for (b2.q qVar4 = ((b3.l) qVarE).P; qVar4 != null; qVar4 = qVar4.F) {
                                        if ((qVar4.C & 1024) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                qVarE = qVar4;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new m1.e(0, new b2.q[16]);
                                                }
                                                if (qVarE != null) {
                                                    eVar3.b(qVarE);
                                                    qVarE = null;
                                                }
                                                eVar3.b(qVar4);
                                            }
                                        }
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                qVarE = b3.m.e(eVar3);
                            }
                            break;
                        }
                        qVarE = qVarE.F;
                    }
                }
            }
        }
    }
}
