package u2;

import a1.n;
import a40.c0;
import a40.z;
import b2.q;
import b3.j0;
import b3.l;
import b3.l0;
import b3.l2;
import b3.m;
import b3.o2;
import c3.s;
import ri.t1;

public final class i extends q implements o2, a {
    public a O;
    public d P;
    public i Q;
    public final String R;

    public i(a aVar, d dVar) {
        this.O = aVar;
        this.P = dVar == null ? new d() : dVar;
        this.R = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    public final z B1() {
        i iVarC1 = C1();
        z zVarB1 = iVarC1 != null ? iVarC1.B1() : null;
        if (zVarB1 != null && c0.v(zVarB1)) {
            return zVarB1;
        }
        z zVar = this.P.f14924d;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final i C1() {
        n nVar;
        o2 o2Var = null;
        if (!this.N) {
            return null;
        }
        if (!this.A.N) {
            y2.a.c("visitAncestors called on an unattached node");
        }
        q qVar = this.A.E;
        l0 l0VarY = m.y(this);
        loop0: while (l0VarY != null) {
            if ((((q) l0VarY.f2059g0.G).D & 262144) != 0) {
                while (qVar != null) {
                    if ((qVar.C & 262144) != 0) {
                        q qVarE = qVar;
                        m1.e eVar = null;
                        while (qVarE != null) {
                            if (qVarE instanceof o2) {
                                o2 o2Var2 = (o2) qVarE;
                                if (kotlin.jvm.internal.m.a(this.R, o2Var2.o()) && i.class == o2Var2.getClass()) {
                                    o2Var = o2Var2;
                                    break loop0;
                                }
                            }
                            if ((qVarE.C & 262144) != 0 && (qVarE instanceof l)) {
                                int i10 = 0;
                                for (q qVar2 = ((l) qVarE).P; qVar2 != null; qVar2 = qVar2.F) {
                                    if ((qVar2.C & 262144) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            qVarE = qVar2;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new m1.e(0, new q[16]);
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
                            qVarE = m.e(eVar);
                        }
                    }
                    qVar = qVar.E;
                }
            }
            l0VarY = l0VarY.x();
            qVar = (l0VarY == null || (nVar = l0VarY.f2059g0) == null) ? null : (l2) nVar.F;
        }
        return (i) o2Var;
    }

    @Override
    public final java.lang.Object D(long r7, k00.c r9) {
        throw new UnsupportedOperationException("Method not decompiled: u2.i.D(long, k00.c):java.lang.Object");
    }

    @Override
    public final long N0(int i10, long j9, long j10) {
        long jN0 = this.O.N0(i10, j9, j10);
        i iVarC1 = this.N ? C1() : null;
        return h2.b.f(jN0, iVarC1 != null ? iVarC1.N0(i10, h2.b.f(j9, jN0), h2.b.e(j10, jN0)) : 0L);
    }

    @Override
    public final Object a0(long j9, long j10, k00.c cVar) {
        g gVar;
        long j11;
        long j12;
        long j13;
        i iVarC1;
        long j14;
        long j15;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.E = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, (m00.c) cVar);
            }
        } else {
            gVar = new g(this, (m00.c) cVar);
        }
        g gVar2 = gVar;
        Object objA0 = gVar2.C;
        l00.a aVar = l00.a.A;
        int i11 = gVar2.E;
        if (i11 == 0) {
            t1.O(objA0);
            a aVar2 = this.O;
            gVar2.A = j9;
            gVar2.B = j10;
            gVar2.E = 1;
            objA0 = aVar2.a0(j9, j10, gVar2);
            if (objA0 != aVar) {
                j11 = j9;
                j12 = j10;
            }
            return aVar;
        }
        if (i11 == 1) {
            j12 = gVar2.B;
            j11 = gVar2.A;
            t1.O(objA0);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j15 = gVar2.A;
            t1.O(objA0);
        }
        j14 = ((y3.q) objA0).f16602a;
        j13 = j15;
        return new y3.q(y3.q.e(j13, j14));
        j13 = ((y3.q) objA0).f16602a;
        boolean z10 = this.N;
        if (z10) {
            iVarC1 = z10 ? C1() : null;
        } else {
            iVarC1 = this.Q;
        }
        i iVar = iVarC1;
        if (iVar != null) {
            long jE = y3.q.e(j11, j13);
            long jD = y3.q.d(j12, j13);
            gVar2.A = j13;
            gVar2.E = 2;
            objA0 = iVar.a0(jE, jD, gVar2);
            if (objA0 != aVar) {
                j15 = j13;
                j14 = ((y3.q) objA0).f16602a;
                j13 = j15;
            }
            return aVar;
        }
        j14 = 0;
        return new y3.q(y3.q.e(j13, j14));
    }

    @Override
    public final long c0(int i10, long j9) {
        i iVarC1 = this.N ? C1() : null;
        long jC0 = iVarC1 != null ? iVarC1.c0(i10, j9) : 0L;
        return h2.b.f(jC0, this.O.c0(i10, h2.b.e(j9, jC0)));
    }

    @Override
    public final Object o() {
        return this.R;
    }

    @Override
    public final void t1() {
        d dVar = this.P;
        dVar.f14921a = this;
        dVar.f14922b = null;
        this.Q = null;
        dVar.f14923c = new j0(this, 26);
        dVar.f14924d = p1();
    }

    @Override
    public final void u1() {
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        m.C(this, new s(zVar, 1));
        i iVar = (i) ((o2) zVar.A);
        this.Q = iVar;
        d dVar = this.P;
        dVar.f14922b = iVar;
        if (dVar.f14921a == this) {
            dVar.f14921a = null;
        }
    }
}
