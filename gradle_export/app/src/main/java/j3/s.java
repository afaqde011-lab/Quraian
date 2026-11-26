package j3;

import b3.j2;
import b3.l0;
import b3.p1;
import java.util.ArrayList;
import java.util.List;
import u.i0;
import z2.d0;

public final class s {

    public final b2.q f7965a;

    public final boolean f7966b;

    public final l0 f7967c;

    public final o f7968d;

    public s f7969e;

    public final int f7970f;

    public s(b2.q qVar, boolean z10, l0 l0Var, o oVar) {
        this.f7965a = qVar;
        this.f7966b = z10;
        this.f7967c = l0Var;
        this.f7968d = oVar;
        this.f7970f = l0Var.B;
    }

    public static List j(int i10, s sVar) {
        return sVar.i((i10 & 1) != 0 ? !sVar.f7966b : false, (i10 & 2) == 0);
    }

    public final h2.c a(p1 p1Var) {
        ?? E;
        s sVarL = l();
        if (sVarL == null) {
            return h2.c.f6545e;
        }
        b2.q qVar = (b2.q) sVarL.f7967c.f2059g0.G;
        if ((qVar.D & 8) == 0) {
            E = 0;
            break;
        }
        loop0: while (true) {
            if (qVar != null) {
                if ((qVar.C & 8) != 0) {
                    E = qVar;
                    ?? eVar = 0;
                    while (E != 0) {
                        if (E instanceof j2) {
                            if (((j2) E).j()) {
                                break loop0;
                            }
                        } else if ((E.C & 8) != 0 && (E instanceof b3.l)) {
                            b2.q qVar2 = ((b3.l) E).P;
                            int i10 = 0;
                            E = E;
                            eVar = eVar;
                            while (qVar2 != null) {
                                if ((qVar2.C & 8) != 0) {
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
                        E = b3.m.e(eVar);
                    }
                }
                if ((qVar.D & 8) != 0) {
                    qVar = qVar.F;
                }
            }
            E = 0;
            break;
        }
        j2 j2Var = (j2) E;
        p1 p1VarV = j2Var != null ? b3.m.v(j2Var, 8) : null;
        return p1VarV == null ? sVarL.a(p1Var) : p1VarV.F(p1Var, true);
    }

    public final s b(k kVar, u00.k kVar2) {
        o oVar = new o();
        oVar.C = false;
        oVar.D = false;
        kVar2.invoke(oVar);
        s sVar = new s(new r(kVar2), false, new l0(this.f7970f + (kVar != null ? 1000000000 : 2000000000), true), oVar);
        sVar.f7969e = this;
        return sVar;
    }

    public final void c(l0 l0Var, ArrayList arrayList) {
        m1.e eVarA = l0Var.A();
        Object[] objArr = eVarA.A;
        int i10 = eVarA.C;
        for (int i11 = 0; i11 < i10; i11++) {
            l0 l0Var2 = (l0) objArr[i11];
            if (l0Var2.J() && !l0Var2.f2070r0) {
                if (l0Var2.f2059g0.j(8)) {
                    arrayList.add(v.a(l0Var2, this.f7966b));
                } else {
                    c(l0Var2, arrayList);
                }
            }
        }
    }

    public final p1 d() {
        if (!o()) {
            j2 j2VarF = f();
            return j2VarF != null ? b3.m.v(j2VarF, 8) : (b3.u) this.f7967c.f2059g0.D;
        }
        s sVarL = l();
        if (sVarL != null) {
            return sVarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            s sVar = (s) arrayList.get(size2);
            if (sVar.p()) {
                arrayList2.add(sVar);
            } else if (!sVar.f7968d.D) {
                sVar.e(arrayList, arrayList2);
            }
        }
    }

    public final j2 f() {
        ?? E;
        boolean z10;
        boolean z11 = this.f7968d.C;
        l0 l0Var = this.f7967c;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        if (!z11) {
            b2.q qVar = (b2.q) l0Var.f2059g0.G;
            if ((qVar.D & 8) != 0) {
                loop3: while (qVar != null) {
                    if ((qVar.C & 8) != 0) {
                        E = qVar;
                        ?? eVar = 0;
                        while (true) {
                            if (E != 0) {
                                if (E instanceof j2) {
                                    if (((j2) E).j()) {
                                        r4 = E;
                                    }
                                } else if ((E.C & 8) != 0 && (E instanceof b3.l)) {
                                    b2.q qVar2 = ((b3.l) E).P;
                                    int i10 = 0;
                                    E = E;
                                    eVar = eVar;
                                    while (qVar2 != null) {
                                        if ((qVar2.C & 8) != 0) {
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
                                E = b3.m.e(eVar);
                            }
                        }
                    }
                    if ((qVar.D & 8) == 0) {
                        break;
                    }
                    qVar = qVar.F;
                }
            }
        } else {
            b2.q qVar3 = (b2.q) l0Var.f2059g0.G;
            if ((qVar3.D & 8) != 0) {
                E = 0;
                while (qVar3 != null) {
                    if ((qVar3.C & 8) != 0) {
                        b2.q qVarE = qVar3;
                        m1.e eVar2 = null;
                        while (qVarE != null) {
                            if (qVarE instanceof j2) {
                                j2 j2Var = (j2) qVarE;
                                ?? r7 = E;
                                if (j2Var.j()) {
                                    r7 = E;
                                    if (j2Var.i1()) {
                                        return j2Var;
                                    }
                                    if (E == 0) {
                                        r7 = j2Var;
                                    }
                                }
                                z10 = false;
                                E = r7;
                            } else {
                                z10 = true;
                                E = E;
                            }
                            if (z10 && (qVarE.C & 8) != 0 && (qVarE instanceof b3.l)) {
                                int i11 = 0;
                                for (b2.q qVar4 = ((b3.l) qVarE).P; qVar4 != null; qVar4 = qVar4.F) {
                                    if ((qVar4.C & 8) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            qVarE = qVar4;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new m1.e(0, new b2.q[16]);
                                            }
                                            if (qVarE != null) {
                                                eVar2.b(qVarE);
                                                qVarE = null;
                                            }
                                            eVar2.b(qVar4);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            qVarE = b3.m.e(eVar2);
                        }
                    }
                    if ((qVar3.D & 8) == 0) {
                        break;
                    }
                    qVar3 = qVar3.F;
                    E = E;
                }
                r4 = E;
            }
        }
        return (j2) r4;
    }

    public final h2.c g() {
        p1 p1VarD = d();
        if (p1VarD != null) {
            if (!p1VarD.z1().N) {
                p1VarD = null;
            }
            if (p1VarD != null) {
                return d0.i(p1VarD).F(p1VarD, true);
            }
        }
        return h2.c.f6545e;
    }

    public final h2.c h() {
        p1 p1VarD = d();
        if (p1VarD != null) {
            if (!p1VarD.z1().N) {
                p1VarD = null;
            }
            if (p1VarD != null) {
                return d0.g(p1VarD, true);
            }
        }
        return h2.c.f6545e;
    }

    public final List i(boolean z10, boolean z11) {
        if (!z10 && this.f7968d.D) {
            return h00.x.A;
        }
        ArrayList arrayList = new ArrayList();
        if (!p()) {
            return s(arrayList, z11);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final o k() {
        boolean zP = p();
        o oVar = this.f7968d;
        if (!zP) {
            return oVar;
        }
        o oVarC = oVar.c();
        r(new ArrayList(), oVarC);
        return oVarC;
    }

    public final s l() {
        l0 l0VarX;
        s sVar = this.f7969e;
        if (sVar != null) {
            return sVar;
        }
        l0 l0Var = this.f7967c;
        boolean z10 = this.f7966b;
        if (!z10) {
            l0VarX = null;
            break;
        }
        l0VarX = l0Var.x();
        while (true) {
            if (l0VarX == null) {
                l0VarX = null;
                break;
            }
            o oVarZ = l0VarX.z();
            if (oVarZ != null && oVarZ.C) {
                break;
            }
            l0VarX = l0VarX.x();
        }
        if (l0VarX == null) {
            for (l0 l0VarX2 = l0Var.x(); l0VarX2 != null; l0VarX2 = l0VarX2.x()) {
                if (l0VarX2.f2059g0.j(8)) {
                    l0VarX = l0VarX2;
                }
            }
            l0VarX = null;
        }
        if (l0VarX == null) {
            return null;
        }
        return v.a(l0VarX, z10);
    }

    public final h2.c m() {
        b3.k kVarF = f();
        if (kVarF == null) {
            return ((b3.u) this.f7967c.f2059g0.D).V1();
        }
        b2.q qVar = ((b2.q) kVarF).A;
        Object objG = this.f7968d.A.g(n.f7941b);
        if (objG == null) {
            objG = null;
        }
        return b3.m.i(qVar, objG != null, true);
    }

    public final o n() {
        return this.f7968d;
    }

    public final boolean o() {
        return this.f7969e != null;
    }

    public final boolean p() {
        return this.f7966b && this.f7968d.C;
    }

    public final boolean q() {
        if (o() || !j(4, this).isEmpty()) {
            return false;
        }
        l0 l0VarX = this.f7967c.x();
        while (l0VarX != null) {
            o oVarZ = l0VarX.z();
            if (oVarZ != null && oVarZ.C) {
                if (l0VarX == null) {
                    return true;
                }
                return false;
            }
            l0VarX = l0VarX.x();
        }
        l0VarX = null;
        if (l0VarX == null) {
            return true;
        }
        return false;
    }

    public final void r(ArrayList arrayList, o oVar) {
        if (this.f7968d.D) {
            return;
        }
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            s sVar = (s) arrayList.get(size2);
            if (!sVar.p()) {
                oVar.h(sVar.f7968d);
                sVar.r(arrayList, oVar);
            }
        }
    }

    public final List s(ArrayList arrayList, boolean z10) {
        if (o()) {
            return h00.x.A;
        }
        c(this.f7967c, arrayList);
        if (z10) {
            o oVar = this.f7968d;
            i0 i0Var = oVar.A;
            Object objG = i0Var.g(w.f8001z);
            if (objG == null) {
                objG = null;
            }
            k kVar = (k) objG;
            if (kVar != null && oVar.C && !arrayList.isEmpty()) {
                arrayList.add(b(kVar, new b3.a(kVar, 18)));
            }
            z zVar = w.f7978a;
            if (i0Var.c(zVar) && !arrayList.isEmpty() && oVar.C) {
                Object objG2 = i0Var.g(zVar);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) h00.q.N0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new b3.a(str, 19)));
                }
            }
        }
        return arrayList;
    }
}
