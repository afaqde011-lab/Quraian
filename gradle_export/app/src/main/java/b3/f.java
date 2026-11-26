package b3;

import androidx.compose.ui.node.Owner;
import c3.c3;

public final class f extends kotlin.jvm.internal.n implements u00.n {
    public static final f B;
    public static final f C;
    public static final f D;
    public static final f E;
    public final int A;

    static {
        int i10 = 2;
        B = new f(i10, 0);
        C = new f(i10, 1);
        D = new f(i10, 2);
        E = new f(i10, 3);
    }

    public f(int i10, int i11) {
        super(i10);
        this.A = i11;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Number) obj2).intValue();
                ((l0) ((i) obj)).getClass();
                break;
            case 1:
                ((l0) ((i) obj)).e0((z2.w0) obj2);
                break;
            case 2:
                ((l0) ((i) obj)).f0((b2.r) obj2);
                break;
            default:
                l1.s sVar = (l1.s) obj2;
                l0 l0Var = (l0) ((i) obj);
                l0Var.f2055c0 = sVar;
                a1.n nVar = l0Var.f2059g0;
                l1.q2 q2Var = c3.o1.f2734h;
                v1.h hVar = (v1.h) sVar;
                hVar.getClass();
                l0Var.b0((y3.c) l1.q.D(hVar, q2Var));
                y3.m mVar = (y3.m) l1.q.D(hVar, c3.o1.f2738n);
                if (l0Var.f2053a0 != mVar) {
                    l0Var.f2053a0 = mVar;
                    l0Var.G();
                    l0 l0VarX = l0Var.x();
                    if (l0VarX != null) {
                        l0VarX.E();
                    } else {
                        Owner owner = l0Var.O;
                        if (owner != null) {
                            ((c3.z) owner).invalidate();
                        }
                    }
                    l0Var.F();
                    for (b2.q qVar = (b2.q) nVar.G; qVar != null; qVar = qVar.F) {
                        qVar.j0();
                    }
                }
                l0Var.g0((c3) l1.q.D(hVar, c3.o1.f2744t));
                b2.q qVar2 = (b2.q) nVar.G;
                if ((qVar2.D & 32768) != 0) {
                    while (qVar2 != null) {
                        if ((qVar2.C & 32768) != 0) {
                            ?? E2 = qVar2;
                            ?? eVar = 0;
                            while (E2 != 0) {
                                if (E2 instanceof j) {
                                    b2.q qVar3 = ((b2.q) ((j) E2)).A;
                                    if (qVar3.N) {
                                        q1.c(qVar3);
                                    } else {
                                        qVar3.J = true;
                                    }
                                } else if ((E2.C & 32768) != 0 && (E2 instanceof l)) {
                                    b2.q qVar4 = ((l) E2).P;
                                    int i10 = 0;
                                    E2 = E2;
                                    eVar = eVar;
                                    while (qVar4 != null) {
                                        if ((qVar4.C & 32768) != 0) {
                                            i10++;
                                            eVar = eVar;
                                            if (i10 == 1) {
                                                E2 = qVar4;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new m1.e(0, new b2.q[16]);
                                                }
                                                if (E2 != 0) {
                                                    eVar.b(E2);
                                                    E2 = 0;
                                                }
                                                eVar.b(qVar4);
                                            }
                                        }
                                        qVar4 = qVar4.F;
                                        E2 = E2;
                                        eVar = eVar;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                E2 = m.e(eVar);
                            }
                        }
                        if ((qVar2.D & 32768) != 0) {
                            qVar2 = qVar2.F;
                        }
                    }
                }
                break;
        }
        return g00.b0.a;
    }
}
