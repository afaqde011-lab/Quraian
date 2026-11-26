package d1;

import a1.q2;
import a10.w;
import android.os.Trace;
import b2.q;
import b3.j2;
import b3.o;
import b3.o0;
import b3.u0;
import b3.y;
import com.google.android.gms.internal.measurement.g4;
import h00.x;
import i2.s;
import i2.s0;
import i2.t;
import j3.a0;
import j3.n;
import j3.z;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m3.i0;
import m3.m0;
import m3.n0;
import m3.r0;
import z2.l1;
import z2.v0;
import z2.x0;
import z2.y0;

public final class i extends q implements y, o, j2 {
    public m3.h O;
    public r0 P;
    public q3.h Q;
    public u00.k R;
    public int S;
    public boolean T;
    public int U;
    public int V;
    public List W;
    public u00.k X;
    public u00.k Y;
    public Map Z;

    public d f4581a0;

    public g f4582b0;

    public h f4583c0;

    public final d B1() {
        if (this.f4581a0 == null) {
            this.f4581a0 = new d(this.O, this.P, this.Q, this.S, this.T, this.U, this.V, this.W);
        }
        d dVar = this.f4581a0;
        kotlin.jvm.internal.m.b(dVar);
        return dVar;
    }

    public final d C1(y3.c cVar) {
        d dVar;
        h hVar = this.f4583c0;
        if (hVar != null && hVar.f4579c && (dVar = hVar.f4580d) != null) {
            dVar.d(cVar);
            return dVar;
        }
        d dVarB1 = B1();
        dVarB1.d(cVar);
        return dVarB1;
    }

    @Override
    public final int G(u0 u0Var, v0 v0Var, int i10) {
        return q0.q.r(C1(u0Var).e(u0Var.getLayoutDirection()).c());
    }

    @Override
    public final int T(u0 u0Var, v0 v0Var, int i10) {
        return q0.q.r(C1(u0Var).e(u0Var.getLayoutDirection()).l());
    }

    @Override
    public final int d0(u0 u0Var, v0 v0Var, int i10) {
        return C1(u0Var).a(i10, u0Var.getLayoutDirection());
    }

    @Override
    public final x0 e(y0 y0Var, v0 v0Var, long j9) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            d dVarC1 = C1(y0Var);
            boolean zC = dVarC1.c(j9, y0Var.getLayoutDirection());
            n0 n0Var = dVarC1.f4556n;
            if (n0Var == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + dVarC1);
            }
            long j10 = n0Var.f10498c;
            n0Var.f10497b.f10510a.b();
            if (zC) {
                b3.m.v(this, 2).G1();
                u00.k kVar = this.R;
                if (kVar != null) {
                    kVar.invoke(n0Var);
                }
                Map linkedHashMap = this.Z;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(z2.d.f17096a, Integer.valueOf(Math.round(n0Var.f10499d)));
                linkedHashMap.put(z2.d.f17097b, Integer.valueOf(Math.round(n0Var.f10500e)));
                this.Z = linkedHashMap;
            }
            u00.k kVar2 = this.X;
            if (kVar2 != null) {
                kVar2.invoke(n0Var.f10501f);
            }
            int i10 = (int) (j10 >> 32);
            int i11 = (int) (j10 & 4294967295L);
            l1 l1VarO = v0Var.O(g4.G(i10, i10, i11, i11));
            Map map = this.Z;
            kotlin.jvm.internal.m.b(map);
            x0 x0VarO0 = y0Var.o0(i10, i11, map, new q2(l1VarO, 1));
            Trace.endSection();
            return x0VarO0;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override
    public final void i(o0 o0Var) {
        if (this.N) {
            s sVarN = o0Var.A.B.n();
            d dVarC1 = C1(o0Var);
            n0 n0Var = dVarC1.f4556n;
            if (n0Var == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + dVarC1);
            }
            m3.q qVar = n0Var.f10497b;
            boolean z10 = true;
            boolean z11 = n0Var.d() && this.S != 3;
            if (z11) {
                long j9 = n0Var.f10498c;
                h2.c cVarG = bi.b.g(0L, (((long) Float.floatToRawIntBits((int) (j9 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j9 & 4294967295L))) & 4294967295L));
                sVarN.i();
                s.s(sVarN, cVarG);
            }
            try {
                r0 r0Var = this.P;
                i0 i0Var = r0Var.f10522a;
                x3.l lVar = i0Var.m;
                if (lVar == null) {
                    lVar = x3.l.f16417b;
                }
                x3.l lVar2 = lVar;
                s0 s0Var = i0Var.f10468n;
                if (s0Var == null) {
                    s0Var = s0.f7158d;
                }
                s0 s0Var2 = s0Var;
                k2.e eVar = i0Var.f10470p;
                if (eVar == null) {
                    eVar = k2.g.f8922a;
                }
                k2.e eVar2 = eVar;
                i2.q qVarB = r0Var.b();
                if (qVarB != null) {
                    qVar.j(sVarN, qVarB, this.P.f10522a.f10457a.c(), s0Var2, lVar2, eVar2);
                } else {
                    long jC = t.f7167g;
                    if (jC == 16) {
                        jC = this.P.c() != 16 ? this.P.c() : t.f7162b;
                    }
                    qVar.i(sVarN, jC, s0Var2, lVar2, eVar2);
                }
                if (z11) {
                    sVarN.q();
                }
                h hVar = this.f4583c0;
                if (!((hVar == null || !hVar.f4579c) ? f50.k.r(this.O) : false)) {
                    List list = this.W;
                    if (list != null && !list.isEmpty()) {
                        z10 = false;
                    }
                    if (z10) {
                        return;
                    }
                }
                o0Var.a();
            } catch (Throwable th2) {
                if (!z11) {
                    throw th2;
                }
                sVarN.q();
                throw th2;
            }
        }
    }

    @Override
    public final void m1(a0 a0Var) {
        g gVar = this.f4582b0;
        ?? r4 = gVar;
        if (gVar == null) {
            final int i10 = 0;
            ?? r7 = new u00.k(this) {
                public final i B;

                {
                    this.B = this;
                }

                public final Object invoke(Object obj) {
                    n0 n0Var;
                    boolean z10;
                    switch (i10) {
                        case 0:
                            List list = (List) obj;
                            i iVar = this.B;
                            n0 n0Var2 = iVar.B1().f4556n;
                            if (n0Var2 != null) {
                                m0 m0Var = n0Var2.f10496a;
                                n0Var = new n0(new m0(m0Var.f10483a, r0.f(iVar.P, t.f7167g, 0L, null, null, 0L, null, 0, 0L, 16777214), m0Var.f10485c, m0Var.f10486d, m0Var.f10487e, m0Var.f10488f, m0Var.f10489g, m0Var.f10490h, m0Var.f10491i, m0Var.f10492j), n0Var2.f10497b, n0Var2.f10498c);
                                list.add(n0Var);
                            } else {
                                n0Var = null;
                            }
                            return Boolean.valueOf(n0Var != null);
                        case 1:
                            m3.h hVar = (m3.h) obj;
                            i iVar2 = this.B;
                            h hVar2 = iVar2.f4583c0;
                            x xVar = x.A;
                            if (hVar2 == null) {
                                h hVar3 = new h(iVar2.O, hVar);
                                d dVar = new d(hVar, iVar2.P, iVar2.Q, iVar2.S, iVar2.T, iVar2.U, iVar2.V, xVar);
                                dVar.d(iVar2.B1().f4554j);
                                hVar3.f4580d = dVar;
                                iVar2.f4583c0 = hVar3;
                            } else if (!kotlin.jvm.internal.m.a(hVar, hVar2.f4578b)) {
                                hVar2.f4578b = hVar;
                                d dVar2 = hVar2.f4580d;
                                if (dVar2 != null) {
                                    r0 r0Var = iVar2.P;
                                    q3.h hVar4 = iVar2.Q;
                                    int i11 = iVar2.S;
                                    boolean z11 = iVar2.T;
                                    int i12 = iVar2.U;
                                    int i13 = iVar2.V;
                                    dVar2.f4545a = hVar;
                                    boolean zD = r0Var.d(dVar2.f4555k);
                                    dVar2.f4555k = r0Var;
                                    if (!zD) {
                                        dVar2.f4559q <<= 2;
                                        dVar2.l = null;
                                        dVar2.f4556n = null;
                                        dVar2.f4558p = -1;
                                        dVar2.f4557o = -1;
                                    }
                                    dVar2.f4546b = hVar4;
                                    dVar2.f4547c = i11;
                                    dVar2.f4548d = z11;
                                    dVar2.f4549e = i12;
                                    dVar2.f4550f = i13;
                                    dVar2.f4551g = xVar;
                                    dVar2.f4559q = (dVar2.f4559q << 2) | 2;
                                    dVar2.l = null;
                                    dVar2.f4556n = null;
                                    dVar2.f4558p = -1;
                                    dVar2.f4557o = -1;
                                }
                            }
                            b3.m.o(iVar2);
                            b3.m.n(iVar2);
                            b3.m.m(iVar2);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            i iVar3 = this.B;
                            h hVar5 = iVar3.f4583c0;
                            if (hVar5 == null) {
                                z10 = false;
                            } else {
                                u00.k kVar = iVar3.Y;
                                if (kVar != null) {
                                    kVar.invoke(hVar5);
                                }
                                h hVar6 = iVar3.f4583c0;
                                if (hVar6 != null) {
                                    hVar6.f4579c = zBooleanValue;
                                }
                                b3.m.o(iVar3);
                                b3.m.n(iVar3);
                                b3.m.m(iVar3);
                                z10 = true;
                            }
                            return Boolean.valueOf(z10);
                    }
                }
            };
            this.f4582b0 = r7;
            r4 = r7;
        }
        m3.h hVar = this.O;
        w[] wVarArr = j3.y.f8004a;
        a0Var.a(j3.w.C, va.a.R(hVar));
        h hVar2 = this.f4583c0;
        if (hVar2 != null) {
            m3.h hVar3 = hVar2.f4578b;
            z zVar = j3.w.D;
            w[] wVarArr2 = j3.y.f8004a;
            w wVar = wVarArr2[16];
            a0Var.a(zVar, hVar3);
            boolean z10 = hVar2.f4579c;
            z zVar2 = j3.w.E;
            w wVar2 = wVarArr2[17];
            a0Var.a(zVar2, Boolean.valueOf(z10));
        }
        final int i11 = 1;
        a0Var.a(n.l, new j3.a(null, new u00.k(this) {
            public final i B;

            {
                this.B = this;
            }

            public final Object invoke(Object obj) {
                n0 n0Var;
                boolean z11;
                switch (i11) {
                    case 0:
                        List list = (List) obj;
                        i iVar = this.B;
                        n0 n0Var2 = iVar.B1().f4556n;
                        if (n0Var2 != null) {
                            m0 m0Var = n0Var2.f10496a;
                            n0Var = new n0(new m0(m0Var.f10483a, r0.f(iVar.P, t.f7167g, 0L, null, null, 0L, null, 0, 0L, 16777214), m0Var.f10485c, m0Var.f10486d, m0Var.f10487e, m0Var.f10488f, m0Var.f10489g, m0Var.f10490h, m0Var.f10491i, m0Var.f10492j), n0Var2.f10497b, n0Var2.f10498c);
                            list.add(n0Var);
                        } else {
                            n0Var = null;
                        }
                        return Boolean.valueOf(n0Var != null);
                    case 1:
                        m3.h hVar4 = (m3.h) obj;
                        i iVar2 = this.B;
                        h hVar5 = iVar2.f4583c0;
                        x xVar = x.A;
                        if (hVar5 == null) {
                            h hVar6 = new h(iVar2.O, hVar4);
                            d dVar = new d(hVar4, iVar2.P, iVar2.Q, iVar2.S, iVar2.T, iVar2.U, iVar2.V, xVar);
                            dVar.d(iVar2.B1().f4554j);
                            hVar6.f4580d = dVar;
                            iVar2.f4583c0 = hVar6;
                        } else if (!kotlin.jvm.internal.m.a(hVar4, hVar5.f4578b)) {
                            hVar5.f4578b = hVar4;
                            d dVar2 = hVar5.f4580d;
                            if (dVar2 != null) {
                                r0 r0Var = iVar2.P;
                                q3.h hVar7 = iVar2.Q;
                                int i12 = iVar2.S;
                                boolean z12 = iVar2.T;
                                int i13 = iVar2.U;
                                int i14 = iVar2.V;
                                dVar2.f4545a = hVar4;
                                boolean zD = r0Var.d(dVar2.f4555k);
                                dVar2.f4555k = r0Var;
                                if (!zD) {
                                    dVar2.f4559q <<= 2;
                                    dVar2.l = null;
                                    dVar2.f4556n = null;
                                    dVar2.f4558p = -1;
                                    dVar2.f4557o = -1;
                                }
                                dVar2.f4546b = hVar7;
                                dVar2.f4547c = i12;
                                dVar2.f4548d = z12;
                                dVar2.f4549e = i13;
                                dVar2.f4550f = i14;
                                dVar2.f4551g = xVar;
                                dVar2.f4559q = (dVar2.f4559q << 2) | 2;
                                dVar2.l = null;
                                dVar2.f4556n = null;
                                dVar2.f4558p = -1;
                                dVar2.f4557o = -1;
                            }
                        }
                        b3.m.o(iVar2);
                        b3.m.n(iVar2);
                        b3.m.m(iVar2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        i iVar3 = this.B;
                        h hVar8 = iVar3.f4583c0;
                        if (hVar8 == null) {
                            z11 = false;
                        } else {
                            u00.k kVar = iVar3.Y;
                            if (kVar != null) {
                                kVar.invoke(hVar8);
                            }
                            h hVar9 = iVar3.f4583c0;
                            if (hVar9 != null) {
                                hVar9.f4579c = zBooleanValue;
                            }
                            b3.m.o(iVar3);
                            b3.m.n(iVar3);
                            b3.m.m(iVar3);
                            z11 = true;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        }));
        final int i12 = 2;
        a0Var.a(n.m, new j3.a(null, new u00.k(this) {
            public final i B;

            {
                this.B = this;
            }

            public final Object invoke(Object obj) {
                n0 n0Var;
                boolean z11;
                switch (i12) {
                    case 0:
                        List list = (List) obj;
                        i iVar = this.B;
                        n0 n0Var2 = iVar.B1().f4556n;
                        if (n0Var2 != null) {
                            m0 m0Var = n0Var2.f10496a;
                            n0Var = new n0(new m0(m0Var.f10483a, r0.f(iVar.P, t.f7167g, 0L, null, null, 0L, null, 0, 0L, 16777214), m0Var.f10485c, m0Var.f10486d, m0Var.f10487e, m0Var.f10488f, m0Var.f10489g, m0Var.f10490h, m0Var.f10491i, m0Var.f10492j), n0Var2.f10497b, n0Var2.f10498c);
                            list.add(n0Var);
                        } else {
                            n0Var = null;
                        }
                        return Boolean.valueOf(n0Var != null);
                    case 1:
                        m3.h hVar4 = (m3.h) obj;
                        i iVar2 = this.B;
                        h hVar5 = iVar2.f4583c0;
                        x xVar = x.A;
                        if (hVar5 == null) {
                            h hVar6 = new h(iVar2.O, hVar4);
                            d dVar = new d(hVar4, iVar2.P, iVar2.Q, iVar2.S, iVar2.T, iVar2.U, iVar2.V, xVar);
                            dVar.d(iVar2.B1().f4554j);
                            hVar6.f4580d = dVar;
                            iVar2.f4583c0 = hVar6;
                        } else if (!kotlin.jvm.internal.m.a(hVar4, hVar5.f4578b)) {
                            hVar5.f4578b = hVar4;
                            d dVar2 = hVar5.f4580d;
                            if (dVar2 != null) {
                                r0 r0Var = iVar2.P;
                                q3.h hVar7 = iVar2.Q;
                                int i13 = iVar2.S;
                                boolean z12 = iVar2.T;
                                int i14 = iVar2.U;
                                int i15 = iVar2.V;
                                dVar2.f4545a = hVar4;
                                boolean zD = r0Var.d(dVar2.f4555k);
                                dVar2.f4555k = r0Var;
                                if (!zD) {
                                    dVar2.f4559q <<= 2;
                                    dVar2.l = null;
                                    dVar2.f4556n = null;
                                    dVar2.f4558p = -1;
                                    dVar2.f4557o = -1;
                                }
                                dVar2.f4546b = hVar7;
                                dVar2.f4547c = i13;
                                dVar2.f4548d = z12;
                                dVar2.f4549e = i14;
                                dVar2.f4550f = i15;
                                dVar2.f4551g = xVar;
                                dVar2.f4559q = (dVar2.f4559q << 2) | 2;
                                dVar2.l = null;
                                dVar2.f4556n = null;
                                dVar2.f4558p = -1;
                                dVar2.f4557o = -1;
                            }
                        }
                        b3.m.o(iVar2);
                        b3.m.n(iVar2);
                        b3.m.m(iVar2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        i iVar3 = this.B;
                        h hVar8 = iVar3.f4583c0;
                        if (hVar8 == null) {
                            z11 = false;
                        } else {
                            u00.k kVar = iVar3.Y;
                            if (kVar != null) {
                                kVar.invoke(hVar8);
                            }
                            h hVar9 = iVar3.f4583c0;
                            if (hVar9 != null) {
                                hVar9.f4579c = zBooleanValue;
                            }
                            b3.m.o(iVar3);
                            b3.m.n(iVar3);
                            b3.m.m(iVar3);
                            z11 = true;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        }));
        a0Var.a(n.f7951n, new j3.a(null, new a1.z(this, 17)));
        j3.y.a(a0Var, r4);
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final int z(u0 u0Var, v0 v0Var, int i10) {
        return C1(u0Var).a(i10, u0Var.getLayoutDirection());
    }
}
