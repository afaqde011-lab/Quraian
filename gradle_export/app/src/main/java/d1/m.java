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
import java.util.HashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import m3.i0;
import m3.m0;
import m3.n0;
import m3.r0;
import m3.u;
import z2.l1;
import z2.v0;
import z2.x0;
import z2.y0;

public final class m extends q implements y, o, j2 {
    public String O;
    public r0 P;
    public q3.h Q;
    public int R;
    public boolean S;
    public int T;
    public int U;
    public HashMap V;
    public e W;
    public r0 X;
    public k Y;
    public l Z;

    public final e B1() {
        r0 r0Var = this.X;
        if (r0Var == null) {
            r0Var = this.P;
        }
        r0 r0Var2 = r0Var;
        if (this.W == null) {
            this.W = new e(this.O, r0Var2, this.Q, this.R, this.S, this.T, this.U);
        }
        e eVar = this.W;
        kotlin.jvm.internal.m.b(eVar);
        return eVar;
    }

    public final e C1(y0 y0Var) {
        e eVarB1;
        if (D1(1)) {
            r0 r0Var = this.X;
            if (r0Var == null) {
                r0Var = this.P;
            }
            B1().f(this.O, r0Var, this.Q, this.R, this.S, this.T, this.U);
        }
        l lVar = this.Z;
        if (lVar == null) {
            eVarB1 = B1();
        } else {
            if (!lVar.f4586c) {
                lVar = null;
            }
            if (lVar == null || (eVarB1 = lVar.f4587d) == null) {
                eVarB1 = B1();
            }
        }
        eVarB1.d(y0Var);
        return eVarB1;
    }

    public final boolean D1(int i10) {
        r0 r0Var = this.X;
        r0 r0Var2 = this.P;
        b3.m.B(this, "StyleOuterNode", new bw.b(17));
        this.X = r0Var2;
        if (r0Var == null) {
            return false;
        }
        return !r0Var.equals(r0Var2);
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
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            e eVarC1 = C1(y0Var);
            boolean zB = eVarC1.b(j9, y0Var.getLayoutDirection());
            u uVar = eVarC1.f4571n;
            if (uVar != null) {
                uVar.b();
            }
            m3.b bVar = eVarC1.f4569j;
            kotlin.jvm.internal.m.b(bVar);
            n3.i iVar = bVar.f10416d;
            long j10 = eVarC1.l;
            if (zB) {
                b3.m.v(this, 2).G1();
                HashMap map = this.V;
                if (map == null) {
                    map = new HashMap(2);
                    this.V = map;
                }
                map.put(z2.d.f17096a, Integer.valueOf(Math.round(iVar.d(0))));
                map.put(z2.d.f17097b, Integer.valueOf(Math.round(iVar.d(iVar.f11044g - 1))));
            }
            int i10 = (int) (j10 >> 32);
            int i11 = (int) (j10 & 4294967295L);
            l1 l1VarO = v0Var.O(g4.G(i10, i10, i11, i11));
            HashMap map2 = this.V;
            kotlin.jvm.internal.m.b(map2);
            return y0Var.o0(i10, i11, map2, new q2(l1VarO, 2));
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public final void i(o0 o0Var) throws KotlinNothingValueException {
        e eVarB1;
        if (this.N) {
            l lVar = this.Z;
            if (lVar == null) {
                eVarB1 = B1();
            } else {
                if (!lVar.f4586c) {
                    lVar = null;
                }
                if (lVar == null || (eVarB1 = lVar.f4587d) == null) {
                    eVarB1 = B1();
                }
            }
            m3.b bVar = eVarB1.f4569j;
            if (bVar == null) {
                g0.a.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.W + ", textSubstitution=" + this.Z + ')');
                throw new KotlinNothingValueException();
            }
            s sVarN = o0Var.A.B.n();
            boolean z10 = eVarB1.f4570k;
            if (z10) {
                long j9 = eVarB1.l;
                sVarN.i();
                sVarN.o(0.0f, 0.0f, (int) (j9 >> 32), (int) (j9 & 4294967295L), 1);
            }
            try {
                D1(2);
                r0 r0Var = this.X;
                if (r0Var == null) {
                    r0Var = this.P;
                }
                i0 i0Var = r0Var.f10522a;
                x3.l lVar2 = i0Var.m;
                if (lVar2 == null) {
                    lVar2 = x3.l.f16417b;
                }
                x3.l lVar3 = lVar2;
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
                    bVar.g(sVarN, qVarB, r0Var.f10522a.f10457a.c(), s0Var2, lVar3, eVar2);
                } else {
                    long jC = t.f7167g;
                    if (jC == 16) {
                        jC = r0Var.c() != 16 ? r0Var.c() : t.f7162b;
                    }
                    bVar.f(sVarN, jC, s0Var2, lVar3, eVar2);
                }
            } finally {
                if (z10) {
                    sVarN.q();
                }
            }
        }
    }

    @Override
    public final void m1(a0 a0Var) {
        k kVar = this.Y;
        ?? r4 = kVar;
        if (kVar == null) {
            final int i10 = 0;
            ?? r7 = new u00.k(this) {
                public final m B;

                {
                    this.B = this;
                }

                public final Object invoke(Object obj) {
                    y3.c cVar;
                    n0 n0Var;
                    boolean z10;
                    switch (i10) {
                        case 0:
                            List list = (List) obj;
                            m mVar = this.B;
                            e eVarB1 = mVar.B1();
                            r0 r0VarF = r0.f(mVar.P, t.f7167g, 0L, null, null, 0L, null, 0, 0L, 16777214);
                            y3.m mVar2 = eVarB1.f4572o;
                            n0 n0Var2 = null;
                            if (mVar2 == null || (cVar = eVarB1.f4568i) == null) {
                                n0Var = null;
                            } else {
                                m3.h hVar = new m3.h(eVarB1.f4560a);
                                if (eVarB1.f4569j == null || eVarB1.f4571n == null) {
                                    n0Var = null;
                                } else {
                                    long j9 = eVarB1.f4573p & (-8589934589L);
                                    int i11 = eVarB1.f4565f;
                                    boolean z11 = eVarB1.f4564e;
                                    int i12 = eVarB1.f4563d;
                                    q3.h hVar2 = eVarB1.f4562c;
                                    x xVar = x.A;
                                    n0Var = new n0(new m0(hVar, r0VarF, xVar, i11, z11, i12, cVar, mVar2, hVar2, j9), new m3.q(new ce.c(hVar, r0VarF, (List) xVar, cVar, hVar2), j9, eVarB1.f4565f, eVarB1.f4563d), eVarB1.l);
                                }
                            }
                            if (n0Var != null) {
                                list.add(n0Var);
                                n0Var2 = n0Var;
                            }
                            return Boolean.valueOf(n0Var2 != null);
                        case 1:
                            String str = ((m3.h) obj).B;
                            m mVar3 = this.B;
                            l lVar = mVar3.Z;
                            if (lVar == null) {
                                l lVar2 = new l(mVar3.O, str);
                                e eVar = new e(str, mVar3.P, mVar3.Q, mVar3.R, mVar3.S, mVar3.T, mVar3.U);
                                eVar.d(mVar3.B1().f4568i);
                                lVar2.f4587d = eVar;
                                mVar3.Z = lVar2;
                            } else if (!kotlin.jvm.internal.m.a(str, lVar.f4585b)) {
                                lVar.f4585b = str;
                                e eVar2 = lVar.f4587d;
                                if (eVar2 != null) {
                                    eVar2.f(str, mVar3.P, mVar3.Q, mVar3.R, mVar3.S, mVar3.T, mVar3.U);
                                }
                            }
                            b3.m.o(mVar3);
                            b3.m.n(mVar3);
                            b3.m.m(mVar3);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            m mVar4 = this.B;
                            l lVar3 = mVar4.Z;
                            if (lVar3 == null) {
                                z10 = false;
                            } else {
                                lVar3.f4586c = zBooleanValue;
                                b3.m.o(mVar4);
                                b3.m.n(mVar4);
                                b3.m.m(mVar4);
                                z10 = true;
                            }
                            return Boolean.valueOf(z10);
                    }
                }
            };
            this.Y = r7;
            r4 = r7;
        }
        m3.h hVar = new m3.h(this.O);
        w[] wVarArr = j3.y.f8004a;
        a0Var.a(j3.w.C, va.a.R(hVar));
        l lVar = this.Z;
        if (lVar != null) {
            boolean z10 = lVar.f4586c;
            z zVar = j3.w.E;
            w[] wVarArr2 = j3.y.f8004a;
            w wVar = wVarArr2[17];
            a0Var.a(zVar, Boolean.valueOf(z10));
            m3.h hVar2 = new m3.h(lVar.f4585b);
            z zVar2 = j3.w.D;
            w wVar2 = wVarArr2[16];
            a0Var.a(zVar2, hVar2);
        }
        final int i11 = 1;
        a0Var.a(n.l, new j3.a(null, new u00.k(this) {
            public final m B;

            {
                this.B = this;
            }

            public final Object invoke(Object obj) {
                y3.c cVar;
                n0 n0Var;
                boolean z11;
                switch (i11) {
                    case 0:
                        List list = (List) obj;
                        m mVar = this.B;
                        e eVarB1 = mVar.B1();
                        r0 r0VarF = r0.f(mVar.P, t.f7167g, 0L, null, null, 0L, null, 0, 0L, 16777214);
                        y3.m mVar2 = eVarB1.f4572o;
                        n0 n0Var2 = null;
                        if (mVar2 == null || (cVar = eVarB1.f4568i) == null) {
                            n0Var = null;
                        } else {
                            m3.h hVar3 = new m3.h(eVarB1.f4560a);
                            if (eVarB1.f4569j == null || eVarB1.f4571n == null) {
                                n0Var = null;
                            } else {
                                long j9 = eVarB1.f4573p & (-8589934589L);
                                int i12 = eVarB1.f4565f;
                                boolean z12 = eVarB1.f4564e;
                                int i13 = eVarB1.f4563d;
                                q3.h hVar4 = eVarB1.f4562c;
                                x xVar = x.A;
                                n0Var = new n0(new m0(hVar3, r0VarF, xVar, i12, z12, i13, cVar, mVar2, hVar4, j9), new m3.q(new ce.c(hVar3, r0VarF, (List) xVar, cVar, hVar4), j9, eVarB1.f4565f, eVarB1.f4563d), eVarB1.l);
                            }
                        }
                        if (n0Var != null) {
                            list.add(n0Var);
                            n0Var2 = n0Var;
                        }
                        return Boolean.valueOf(n0Var2 != null);
                    case 1:
                        String str = ((m3.h) obj).B;
                        m mVar3 = this.B;
                        l lVar2 = mVar3.Z;
                        if (lVar2 == null) {
                            l lVar3 = new l(mVar3.O, str);
                            e eVar = new e(str, mVar3.P, mVar3.Q, mVar3.R, mVar3.S, mVar3.T, mVar3.U);
                            eVar.d(mVar3.B1().f4568i);
                            lVar3.f4587d = eVar;
                            mVar3.Z = lVar3;
                        } else if (!kotlin.jvm.internal.m.a(str, lVar2.f4585b)) {
                            lVar2.f4585b = str;
                            e eVar2 = lVar2.f4587d;
                            if (eVar2 != null) {
                                eVar2.f(str, mVar3.P, mVar3.Q, mVar3.R, mVar3.S, mVar3.T, mVar3.U);
                            }
                        }
                        b3.m.o(mVar3);
                        b3.m.n(mVar3);
                        b3.m.m(mVar3);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        m mVar4 = this.B;
                        l lVar4 = mVar4.Z;
                        if (lVar4 == null) {
                            z11 = false;
                        } else {
                            lVar4.f4586c = zBooleanValue;
                            b3.m.o(mVar4);
                            b3.m.n(mVar4);
                            b3.m.m(mVar4);
                            z11 = true;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        }));
        final int i12 = 2;
        a0Var.a(n.m, new j3.a(null, new u00.k(this) {
            public final m B;

            {
                this.B = this;
            }

            public final Object invoke(Object obj) {
                y3.c cVar;
                n0 n0Var;
                boolean z11;
                switch (i12) {
                    case 0:
                        List list = (List) obj;
                        m mVar = this.B;
                        e eVarB1 = mVar.B1();
                        r0 r0VarF = r0.f(mVar.P, t.f7167g, 0L, null, null, 0L, null, 0, 0L, 16777214);
                        y3.m mVar2 = eVarB1.f4572o;
                        n0 n0Var2 = null;
                        if (mVar2 == null || (cVar = eVarB1.f4568i) == null) {
                            n0Var = null;
                        } else {
                            m3.h hVar3 = new m3.h(eVarB1.f4560a);
                            if (eVarB1.f4569j == null || eVarB1.f4571n == null) {
                                n0Var = null;
                            } else {
                                long j9 = eVarB1.f4573p & (-8589934589L);
                                int i13 = eVarB1.f4565f;
                                boolean z12 = eVarB1.f4564e;
                                int i14 = eVarB1.f4563d;
                                q3.h hVar4 = eVarB1.f4562c;
                                x xVar = x.A;
                                n0Var = new n0(new m0(hVar3, r0VarF, xVar, i13, z12, i14, cVar, mVar2, hVar4, j9), new m3.q(new ce.c(hVar3, r0VarF, (List) xVar, cVar, hVar4), j9, eVarB1.f4565f, eVarB1.f4563d), eVarB1.l);
                            }
                        }
                        if (n0Var != null) {
                            list.add(n0Var);
                            n0Var2 = n0Var;
                        }
                        return Boolean.valueOf(n0Var2 != null);
                    case 1:
                        String str = ((m3.h) obj).B;
                        m mVar3 = this.B;
                        l lVar2 = mVar3.Z;
                        if (lVar2 == null) {
                            l lVar3 = new l(mVar3.O, str);
                            e eVar = new e(str, mVar3.P, mVar3.Q, mVar3.R, mVar3.S, mVar3.T, mVar3.U);
                            eVar.d(mVar3.B1().f4568i);
                            lVar3.f4587d = eVar;
                            mVar3.Z = lVar3;
                        } else if (!kotlin.jvm.internal.m.a(str, lVar2.f4585b)) {
                            lVar2.f4585b = str;
                            e eVar2 = lVar2.f4587d;
                            if (eVar2 != null) {
                                eVar2.f(str, mVar3.P, mVar3.Q, mVar3.R, mVar3.S, mVar3.T, mVar3.U);
                            }
                        }
                        b3.m.o(mVar3);
                        b3.m.n(mVar3);
                        b3.m.m(mVar3);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        m mVar4 = this.B;
                        l lVar4 = mVar4.Z;
                        if (lVar4 == null) {
                            z11 = false;
                        } else {
                            lVar4.f4586c = zBooleanValue;
                            b3.m.o(mVar4);
                            b3.m.n(mVar4);
                            b3.m.m(mVar4);
                            z11 = true;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        }));
        a0Var.a(n.f7951n, new j3.a(null, new a1.z(this, 18)));
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
