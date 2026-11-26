package g2;

import android.os.Trace;
import b3.k0;
import b3.l0;
import b3.l2;
import b3.v1;
import c3.o1;
import com.google.android.gms.internal.measurement.y3;
import kotlin.NoWhenBranchMatchedException;

public final class a0 extends b2.q implements b3.j, b3.x, v1, a3.c, b3.k {
    public final boolean O;
    public final u00.n P;
    public boolean Q;
    public boolean R;
    public final int S;

    public a0(int i10, u00.n nVar, int i11) {
        i10 = (i11 & 1) != 0 ? 1 : i10;
        boolean z10 = (i11 & 2) == 0;
        nVar = (i11 & 4) != 0 ? null : nVar;
        this.O = z10;
        this.P = nVar;
        this.S = i10;
    }

    public final boolean B1(int i10) throws NoWhenBranchMatchedException {
        int iOrdinal = d.v(this, i10).ordinal();
        if (iOrdinal == 0) {
            return d.w(this);
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void C1(y yVar, y yVar2) {
        a1.n nVar;
        u00.n nVar2;
        n nVar3 = (n) ((c3.z) b3.m.z(this)).getFocusOwner();
        a0 a0VarG = nVar3.g();
        if (!yVar.equals(yVar2) && (nVar2 = this.P) != null) {
            nVar2.invoke(yVar, yVar2);
        }
        b2.q qVar = this.A;
        if (!qVar.N) {
            y2.a.c("visitAncestors called on an unattached node");
        }
        b2.q qVar2 = this.A;
        l0 l0VarY = b3.m.y(this);
        while (l0VarY != null) {
            if ((((b2.q) l0VarY.f2059g0.G).D & 5120) != 0) {
                while (qVar2 != null) {
                    int i10 = qVar2.C;
                    if ((i10 & 5120) != 0) {
                        if (qVar2 != qVar && (i10 & 1024) != 0) {
                            return;
                        }
                        if ((i10 & 4096) != 0) {
                            ?? E = qVar2;
                            ?? eVar = 0;
                            while (E != 0) {
                                if (E instanceof g) {
                                    g gVar = (g) E;
                                    if (a0VarG == nVar3.g()) {
                                        gVar.F(yVar2);
                                    }
                                } else if ((E.C & 4096) != 0 && (E instanceof b3.l)) {
                                    b2.q qVar3 = ((b3.l) E).P;
                                    int i11 = 0;
                                    E = E;
                                    eVar = eVar;
                                    while (qVar3 != null) {
                                        if ((qVar3.C & 4096) != 0) {
                                            i11++;
                                            eVar = eVar;
                                            if (i11 == 1) {
                                                E = qVar3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new m1.e(0, new b2.q[16]);
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
                                    if (i11 == 1) {
                                    }
                                }
                                E = b3.m.e(eVar);
                            }
                        }
                    }
                    qVar2 = qVar2.E;
                }
            }
            l0VarY = l0VarY.x();
            qVar2 = (l0VarY == null || (nVar = l0VarY.f2059g0) == null) ? null : (l2) nVar.F;
        }
    }

    public final r D1() {
        boolean z10;
        a1.n nVar;
        r rVar = new r();
        rVar.f6080a = true;
        t tVar = t.f6091b;
        rVar.f6081b = tVar;
        rVar.f6082c = tVar;
        rVar.f6083d = tVar;
        rVar.f6084e = tVar;
        rVar.f6085f = tVar;
        rVar.f6086g = tVar;
        rVar.f6087h = tVar;
        rVar.f6088i = tVar;
        rVar.f6089j = q.B;
        rVar.f6090k = q.C;
        rVar.l = o.f6079a;
        int i10 = this.S;
        if (i10 == 1) {
            z10 = true;
        } else if (i10 == 0) {
            z10 = !(((r2.a) ((r2.c) ((r2.b) b3.m.h(this, o1.m))).f13044a.getValue()).f13043a == 1);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z10 = false;
        }
        rVar.f6080a = z10;
        b2.q qVar = this.A;
        if (!qVar.N) {
            y2.a.c("visitAncestors called on an unattached node");
        }
        b2.q qVar2 = this.A;
        l0 l0VarY = b3.m.y(this);
        loop0: while (l0VarY != null) {
            if ((((b2.q) l0VarY.f2059g0.G).D & 3072) != 0) {
                while (qVar2 != null) {
                    int i11 = qVar2.C;
                    if ((i11 & 3072) != 0) {
                        if (qVar2 != qVar && (i11 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i11 & 2048) != 0) {
                            ?? E = qVar2;
                            ?? eVar = 0;
                            while (E != 0) {
                                if (E instanceof s) {
                                    ((s) E).q0(rVar);
                                } else if ((E.C & 2048) != 0 && (E instanceof b3.l)) {
                                    b2.q qVar3 = ((b3.l) E).P;
                                    int i12 = 0;
                                    E = E;
                                    eVar = eVar;
                                    while (qVar3 != null) {
                                        if ((qVar3.C & 2048) != 0) {
                                            i12++;
                                            eVar = eVar;
                                            if (i12 == 1) {
                                                E = qVar3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new m1.e(0, new b2.q[16]);
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
                                    if (i12 == 1) {
                                    }
                                }
                                E = b3.m.e(eVar);
                            }
                        }
                    }
                    qVar2 = qVar2.E;
                }
            }
            l0VarY = l0VarY.x();
            qVar2 = (l0VarY == null || (nVar = l0VarY.f2059g0) == null) ? null : (l2) nVar.F;
        }
        return rVar;
    }

    public final h2.c E1(z2.a0 a0Var) {
        h2.c cVar = D1().l;
        if (cVar != o.f6079a) {
            return a0Var == null ? cVar : cVar.j(a0Var.o(b3.m.x(this), 0L, (6 & 4) != 0));
        }
        return a0Var != null ? a0Var.F(b3.m.x(this), false) : bi.b.g(0L, kh.n.m0(b3.m.x(this).C));
    }

    public final l0.t F1() {
        a1.n nVar;
        Object obj;
        if (!this.A.N) {
            y2.a.c("visitAncestors called on an unattached node");
        }
        b2.q qVar = this.A.E;
        l0 l0VarY = b3.m.y(this);
        loop0: while (l0VarY != null) {
            if ((((b2.q) l0VarY.f2059g0.G).D & 8388640) != 0) {
                while (qVar != null) {
                    int i10 = qVar.C;
                    if ((i10 & 8388640) != 0) {
                        if ((8388608 & i10) != 0) {
                            if (!(qVar instanceof l0.t)) {
                                if (qVar instanceof b3.l) {
                                    qVar = null;
                                    for (b2.q qVar2 = ((b3.l) qVar).P; qVar2 != null; qVar2 = qVar2.F) {
                                        if (qVar2 instanceof l0.t) {
                                            qVar = qVar2;
                                        }
                                    }
                                } else {
                                    qVar = null;
                                }
                            }
                            l0.t tVar = (l0.t) qVar;
                            if (tVar != null) {
                                return tVar;
                            }
                        } else if ((i10 & 32) == 0) {
                            continue;
                        } else {
                            if (qVar instanceof a3.c) {
                                obj = qVar;
                            } else if (qVar instanceof b3.l) {
                                obj = null;
                                for (b2.q qVar3 = ((b3.l) qVar).P; qVar3 != null; qVar3 = qVar3.F) {
                                    if (qVar3 instanceof a3.c) {
                                        obj = qVar3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            a3.c cVar = (a3.c) obj;
                            if (cVar != null) {
                                y3 y3VarR0 = cVar.r0();
                                me.i iVar = z2.l.f17134a;
                                if (y3VarR0.w(iVar)) {
                                    return (l0.t) cVar.r0().F(iVar);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    qVar = qVar.E;
                }
            }
            l0VarY = l0VarY.x();
            qVar = (l0VarY == null || (nVar = l0VarY.f2059g0) == null) ? null : (l2) nVar.F;
        }
        return null;
    }

    public final y G1() {
        a0 a0VarG;
        a1.n nVar;
        if (this.N && (a0VarG = ((n) ((c3.z) b3.m.z(this)).getFocusOwner()).g()) != null) {
            if (this == a0VarG) {
                return y.A;
            }
            if (a0VarG.N) {
                if (!a0VarG.A.N) {
                    y2.a.c("visitAncestors called on an unattached node");
                }
                b2.q qVar = a0VarG.A.E;
                l0 l0VarY = b3.m.y(a0VarG);
                while (l0VarY != null) {
                    if ((((b2.q) l0VarY.f2059g0.G).D & 1024) != 0) {
                        while (qVar != null) {
                            if ((qVar.C & 1024) != 0) {
                                b2.q qVarE = qVar;
                                m1.e eVar = null;
                                while (qVarE != null) {
                                    if (qVarE instanceof a0) {
                                        if (this == ((a0) qVarE)) {
                                            return y.B;
                                        }
                                    } else if ((qVarE.C & 1024) != 0 && (qVarE instanceof b3.l)) {
                                        int i10 = 0;
                                        for (b2.q qVar2 = ((b3.l) qVarE).P; qVar2 != null; qVar2 = qVar2.F) {
                                            if ((qVar2.C & 1024) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    qVarE = qVar2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new m1.e(0, new b2.q[16]);
                                                    }
                                                    if (qVarE != null) {
                                                        eVar.b(qVarE);
                                                        qVarE = null;
                                                    }
                                                    eVar.b(qVar2);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    qVarE = b3.m.e(eVar);
                                }
                            }
                            qVar = qVar.E;
                        }
                    }
                    l0VarY = l0VarY.x();
                    qVar = (l0VarY == null || (nVar = l0VarY.f2059g0) == null) ? null : (l2) nVar.F;
                }
            }
            return y.C;
        }
        return y.C;
    }

    public final void H1() throws NoWhenBranchMatchedException {
        int iOrdinal = G1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        b3.m.t(this, new k0(zVar, (b2.q) this, 8));
        Object obj = zVar.A;
        if (obj == null) {
            kotlin.jvm.internal.m.k("focusProperties");
            throw null;
        }
        if (((p) obj).a()) {
            return;
        }
        ((n) ((c3.z) b3.m.z(this)).getFocusOwner()).c(8, true, true);
    }

    public final boolean I1(int i10) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return D1().f6080a ? B1(i10) : d.h(this, i10, new c3.w(i10, 4));
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public final void J0() throws NoWhenBranchMatchedException {
        H1();
    }

    @Override
    public final void c1(z2.a0 a0Var) {
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final void u1() throws NoWhenBranchMatchedException {
        int iOrdinal = G1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                l focusOwner = ((c3.z) b3.m.z(this)).getFocusOwner();
                a0 a0VarF = d.f(this);
                if (a0VarF == null || !a0VarF.O) {
                    return;
                }
                n nVar = (n) focusOwner;
                nVar.f6071a.E();
                nVar.f6074d.a();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        n nVar2 = (n) ((c3.z) b3.m.z(this)).getFocusOwner();
        nVar2.c(8, true, false);
        if (this.O) {
            nVar2.f6071a.E();
        }
        nVar2.f6074d.a();
    }

    @Override
    public final void v1() {
        if (G1().a()) {
            ((n) ((c3.z) b3.m.z(this)).getFocusOwner()).c(8, true, true);
        }
    }
}
