package a1;

import c3.c3;
import com.google.protobuf.RuntimeVersion;
import java.util.HashMap;
import java.util.HashSet;

public final class n implements n0 {
    public final int A;
    public Object B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public Object I;
    public Object J;
    public Object K;

    public n() {
        this.A = 3;
    }

    public n(b3.l0 l0Var) {
        this.A = 1;
        this.B = l0Var;
        b3.h1 h1Var = new b3.h1(0);
        h1Var.D = -1;
        this.C = h1Var;
        b3.u uVar = new b3.u(l0Var);
        this.D = uVar;
        this.E = uVar;
        b3.l2 l2Var = uVar.f2133u0;
        this.F = l2Var;
        this.G = l2Var;
        this.J = new m1.e(0, new b2.r[16]);
    }

    public n(i7.z zVar, i7.v vVar, e7.b0 b0Var, int i10, int i11, int i12, int i13) {
        this.A = 2;
        this.B = zVar;
        this.D = vVar;
        this.E = b0Var;
        this.F = new androidx.media3.common.h2();
        this.G = b0Var.a(zVar.f7503t, new e7.l(this, 1));
        this.H = new e7.x(this, i10);
        this.I = new e7.y(this, i11);
        this.J = new e7.z(this, i12);
        this.K = new e7.a0(this, i13);
        e7.w wVar = new e7.w(this);
        this.C = wVar;
        zVar.m.a(wVar);
    }

    public n(oe.o oVar, w2 w2Var, l9.f0 f0Var, u00.k kVar, b0 b0Var, s2 s2Var, u00.a aVar, c3 c3Var, u00.k kVar2) {
        this.A = 0;
        this.C = oVar;
        this.D = w2Var;
        this.E = f0Var;
        this.F = kVar;
        this.H = b0Var;
        this.I = s2Var;
        this.J = aVar;
        this.K = c3Var;
        this.G = kVar2;
        this.B = oVar;
    }

    public static final void c(n nVar, b2.q qVar, b3.p1 p1Var) {
        for (b2.q qVar2 = qVar.E; qVar2 != null; qVar2 = qVar2.E) {
            if (qVar2 == ((b3.h1) nVar.C)) {
                b3.l0 l0VarX = ((b3.l0) nVar.B).x();
                p1Var.S = l0VarX != null ? (b3.u) l0VarX.f2059g0.D : null;
                nVar.E = p1Var;
                return;
            } else {
                if ((qVar2.C & 2) != 0) {
                    return;
                }
                qVar2.A1(p1Var);
            }
        }
    }

    public static b2.q g(b2.p pVar, b2.q qVar) {
        b2.q qVarD;
        if (pVar instanceof b3.e1) {
            qVarD = ((b3.e1) pVar).d();
            qVarD.C = b3.q1.f(qVarD);
        } else {
            b3.c cVar = new b3.c();
            cVar.C = b3.q1.d(pVar);
            cVar.O = pVar;
            cVar.P = new HashSet();
            qVarD = cVar;
        }
        if (qVarD.N) {
            y2.a.c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        qVarD.I = true;
        b2.q qVar2 = qVar.F;
        if (qVar2 != null) {
            qVar2.E = qVarD;
            qVarD.F = qVar2;
        }
        qVar.F = qVarD;
        qVarD.E = qVar;
        return qVarD;
    }

    public static b2.q h(b2.q qVar) {
        boolean z10 = qVar.N;
        if (z10) {
            u.c0 c0Var = b3.q1.f2124a;
            if (!z10) {
                y2.a.c("autoInvalidateRemovedNode called on unattached node");
            }
            b3.q1.a(qVar, -1, 2);
            qVar.y1();
            qVar.s1();
        }
        b2.q qVar2 = qVar.F;
        b2.q qVar3 = qVar.E;
        if (qVar2 != null) {
            qVar2.E = qVar3;
            qVar.F = null;
        }
        if (qVar3 != null) {
            qVar3.F = qVar2;
            qVar.E = null;
        }
        kotlin.jvm.internal.m.b(qVar3);
        return qVar3;
    }

    public static void n(b2.p pVar, b2.p pVar2, b2.q qVar) {
        if ((pVar instanceof b3.e1) && (pVar2 instanceof b3.e1)) {
            kotlin.jvm.internal.m.c(qVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((b3.e1) pVar2).i(qVar);
            if (qVar.N) {
                b3.q1.c(qVar);
                return;
            } else {
                qVar.J = true;
                return;
            }
        }
        if (!(qVar instanceof b3.c)) {
            y2.a.c("Unknown Modifier.Node type");
            return;
        }
        b3.c cVar = (b3.c) qVar;
        boolean z10 = cVar.N;
        if (z10) {
            if (!z10) {
                y2.a.c("unInitializeModifier called on unattached node");
            }
            if ((cVar.C & 8) != 0) {
                ((c3.z) b3.m.z(cVar)).B();
            }
        }
        cVar.O = pVar2;
        cVar.C = b3.q1.d(pVar2);
        if (cVar.N) {
            cVar.B1(false);
        }
        if (qVar.N) {
            b3.q1.c(qVar);
        } else {
            qVar.J = true;
        }
    }

    @Override
    public int a() {
        return ((oe.o) this.C).a();
    }

    @Override
    public long b(long j9) {
        return ((oe.o) this.B).b(j9);
    }

    @Override
    public long d(long j9) {
        return ((oe.o) this.B).d(j9);
    }

    public void e(String str, String str2) {
        HashMap map = (HashMap) this.G;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public xd.h f() {
        String strJ = ((String) this.B) == null ? " transportName" : RuntimeVersion.SUFFIX;
        if (((xd.l) this.D) == null) {
            strJ = strJ.concat(" encodedPayload");
        }
        if (((Long) this.E) == null) {
            strJ = w.c.j(strJ, " eventMillis");
        }
        if (((Long) this.F) == null) {
            strJ = w.c.j(strJ, " uptimeMillis");
        }
        if (((HashMap) this.G) == null) {
            strJ = w.c.j(strJ, " autoMetadata");
        }
        if (strJ.isEmpty()) {
            return new xd.h((String) this.B, (Integer) this.C, (xd.l) this.D, ((Long) this.E).longValue(), ((Long) this.F).longValue(), (HashMap) this.G, (Integer) this.H, (String) this.I, (byte[]) this.J, (byte[]) this.K);
        }
        throw new IllegalStateException("Missing required properties:".concat(strJ));
    }

    public void i(u00.k kVar) {
        oe.o oVar = (oe.o) this.B;
        oVar.A++;
        ((m1.e) oVar.D).b(kVar);
        oVar.e();
    }

    public boolean j(int i10) {
        return (((b2.q) this.G).D & i10) != 0;
    }

    public void k() {
        for (b2.q qVar = (b2.q) this.G; qVar != null; qVar = qVar.F) {
            qVar.x1();
            if (qVar.I) {
                u.c0 c0Var = b3.q1.f2124a;
                if (!qVar.N) {
                    y2.a.c("autoInvalidateInsertedNode called on unattached node");
                }
                b3.q1.a(qVar, -1, 1);
            }
            if (qVar.J) {
                b3.q1.c(qVar);
            }
            qVar.I = false;
            qVar.J = false;
        }
    }

    public void l(int r32, m1.e r33, m1.e r34, b2.q r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: a1.n.l(int, m1.e, m1.e, b2.q, boolean):void");
    }

    public void m() {
        b3.b0 b0Var;
        b3.z1 z1Var;
        b3.l0 l0Var = (b3.l0) this.B;
        b3.p1 p1Var = (b3.u) this.D;
        for (b2.q qVar = ((b3.l2) this.F).E; qVar != null; qVar = qVar.E) {
            b3.y yVarF = b3.m.f(qVar);
            if (yVarF != null) {
                b3.p1 p1Var2 = qVar.H;
                if (p1Var2 != null) {
                    b0Var = (b3.b0) p1Var2;
                    b3.y yVar = b0Var.f1999u0;
                    b0Var.c2(yVarF);
                    if (yVar != qVar && (z1Var = b0Var.f2107n0) != null) {
                        ((c3.v1) z1Var).invalidate();
                    }
                } else {
                    b0Var = new b3.b0(l0Var, yVarF);
                    qVar.A1(b0Var);
                }
                p1Var.S = b0Var;
                b0Var.R = p1Var;
                p1Var = b0Var;
            } else {
                qVar.A1(p1Var);
            }
        }
        b3.l0 l0VarX = l0Var.x();
        p1Var.S = l0VarX != null ? (b3.u) l0VarX.f2059g0.D : null;
        this.E = p1Var;
    }

    public String toString() {
        switch (this.A) {
            case 1:
                StringBuilder sb2 = new StringBuilder("[");
                b2.q qVar = (b2.q) this.G;
                b3.l2 l2Var = (b3.l2) this.F;
                if (qVar == l2Var) {
                    sb2.append("]");
                } else {
                    while (qVar != null && qVar != l2Var) {
                        sb2.append(String.valueOf(qVar));
                        if (qVar.F == l2Var) {
                            sb2.append("]");
                        } else {
                            sb2.append(",");
                            qVar = qVar.F;
                        }
                    }
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
