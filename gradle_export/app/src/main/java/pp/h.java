package pp;

import android.content.res.Configuration;
import b2.o;
import b2.r;
import c3.o0;
import c4.v;
import com.google.android.gms.internal.measurement.z3;
import g1.z6;
import gv.y;
import h0.i;
import h0.t1;
import h0.v1;
import h0.z1;
import i2.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import l1.z0;
import m3.r0;
import q3.u;
import qd.s0;
import x3.k;
import x3.l;
import z.n;

public abstract class h {
    public static final float a = 280;

    public static final void a(String str, u00.a aVar, j jVar, int i) {
        g0 g0Var;
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(1424421299);
        int i2 = i | (g0Var2.g(str) ? 4 : 2) | (g0Var2.i(aVar) ? 32 : 16);
        if (g0Var2.S(i2 & 1, (i2 & 19) != 18)) {
            r rVarE = h0.c.E(w50.c.n(n.f(f2.h.c(z1.d(o.A, 1.0f), p0.f.a(12)), dl.a.s, b0.b), true, aVar), 0.0f, 16, 1);
            v1 v1VarA = t1.a(i.e, b2.b.K, g0Var2, 54);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            r rVarC = b2.a.c(rVarE, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(v1VarA, g0Var2, b3.h.f);
            q.I(m1VarM, g0Var2, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.g);
            q.E(g0Var2, b3.h.h);
            q.I(rVarC, g0Var2, b3.h.d);
            z6.b(str, (r) null, dl.a.i, kh.o.z(16), u.B, (q3.i) null, 0L, (l) null, (k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, (i2 & 14) | 1597440, 0, 262058);
            g0Var = g0Var2;
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new l0.g0(str, aVar, i, 14);
        }
    }

    public static final void b(final boolean z, final u00.a aVar, final u00.k kVar, j jVar, final int i) {
        u00.a aVar2;
        u00.k kVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(169059045);
        int i2 = (g0Var.h(z) ? 4 : 2) | i | (g0Var.i(kVar) ? 256 : 128);
        if (!g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            aVar2 = aVar;
            kVar2 = kVar;
            g0Var.V();
        } else {
            if (!z) {
                r1 r1VarT = g0Var.t();
                if (r1VarT != null) {
                    final int i3 = 0;
                    r1VarT.d = new u00.n(z, aVar, kVar, i, i3) {
                        public final int A;
                        public final boolean B;
                        public final u00.a C;
                        public final u00.k D;

                        {
                            this.A = i3;
                        }

                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.A;
                            j jVar2 = (j) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    h.b(this.B, this.C, this.D, jVar2, q.K(49));
                                    break;
                                default:
                                    h.b(this.B, this.C, this.D, jVar2, q.K(49));
                                    break;
                            }
                            return g00.b0.a;
                        }
                    };
                    return;
                }
                return;
            }
            aVar2 = aVar;
            kVar2 = kVar;
            sg.f fVar = cm.a.A;
            Configuration configuration = (Configuration) g0Var.k(o0.a);
            fVar.getClass();
            boolean z2 = sg.f.J(configuration) == cm.a.B;
            s0.G(aVar2, new v(3, !z2), v1.d.d(-233240580, new g(z2, kVar2, 0, (byte) 0), g0Var), g0Var, 390, 0);
        }
        r1 r1VarT2 = g0Var.t();
        if (r1VarT2 != null) {
            final int i4 = 1;
            final u00.k kVar3 = kVar2;
            final u00.a aVar3 = aVar2;
            r1VarT2.d = new u00.n(z, aVar3, kVar3, i, i4) {
                public final int A;
                public final boolean B;
                public final u00.a C;
                public final u00.k D;

                {
                    this.A = i4;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.A;
                    j jVar2 = (j) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            h.b(this.B, this.C, this.D, jVar2, q.K(49));
                            break;
                        default:
                            h.b(this.B, this.C, this.D, jVar2, q.K(49));
                            break;
                    }
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void c(ep.f fVar, u00.k onSexSelected, r rVar, boolean z, j jVar, int i, int i2) {
        boolean z2;
        boolean z3;
        g0 g0Var;
        boolean z4;
        r1 r1VarT;
        boolean z5;
        Object objN;
        Object obj;
        z0 z0Var;
        String strD;
        Object objN2;
        boolean z6;
        Object objN3;
        Object objN4;
        boolean z7;
        Object objN5;
        m.e(onSexSelected, "onSexSelected");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(2076008654);
        int i3 = (g0Var2.e(fVar == null ? -1 : fVar.ordinal()) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= g0Var2.i(onSexSelected) ? 32 : 16;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= g0Var2.h(z2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (g0Var2.S(i3 & 1, z3)) {
                if (i4 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                objN = g0Var2.N();
                obj = l1.i.a;
                if (objN == obj) {
                    objN = q.z(Boolean.FALSE);
                    g0Var2.n0(objN);
                }
                z0Var = (z0) objN;
                r rVarD = z1.d(rVar, 1.0f);
                if (fVar == null) {
                    g0Var2.c0(-1154952276);
                    g0Var2.r(false);
                    strD = null;
                } else {
                    g0Var2.c0(-2115466507);
                    strD = d(fVar, g0Var2);
                    g0Var2.r(false);
                }
                if (strD == null) {
                    strD = "";
                }
                String strU = z3.U(g0Var2, 2131886221);
                v1.c cVar = z5 ? c.d : null;
                objN2 = g0Var2.N();
                if (objN2 == obj) {
                    objN2 = new d(0);
                    g0Var2.n0(objN2);
                }
                u00.k kVar = (u00.k) objN2;
                if ((i3 & 7168) == 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objN3 = g0Var2.N();
                if (z6 || objN3 == obj) {
                    objN3 = new a(z5, z0Var, 1);
                    g0Var2.n0(objN3);
                }
                up.i.e(strD, kVar, rVarD, strU, null, false, false, z5, false, null, null, null, cVar, (u00.a) objN3, null, g0Var2, ((i3 << 15) & 234881024) | 48, 0, 40688);
                g0Var = g0Var2;
                boolean zBooleanValue = ((Boolean) z0Var.getValue()).booleanValue();
                objN4 = g0Var.N();
                if (objN4 == obj) {
                    objN4 = new ct.k(z0Var, 15);
                    g0Var.n0(objN4);
                }
                u00.a aVar = (u00.a) objN4;
                if ((i3 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objN5 = g0Var.N();
                if (z7 || objN5 == obj) {
                    objN5 = new e(onSexSelected, z0Var, 0);
                    g0Var.n0(objN5);
                }
                b(zBooleanValue, aVar, (u00.k) objN5, g0Var, 48);
                z4 = z5;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                z4 = z2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new y(fVar, onSexSelected, rVar, z4, i, i2, 6);
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (g0Var2.S(i3 & 1, z3)) {
            if (i4 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            objN = g0Var2.N();
            obj = l1.i.a;
            if (objN == obj) {
                objN = q.z(Boolean.FALSE);
                g0Var2.n0(objN);
            }
            z0Var = (z0) objN;
            r rVarD2 = z1.d(rVar, 1.0f);
            if (fVar == null) {
                g0Var2.c0(-1154952276);
                g0Var2.r(false);
                strD = null;
            } else {
                g0Var2.c0(-2115466507);
                strD = d(fVar, g0Var2);
                g0Var2.r(false);
            }
            if (strD == null) {
                strD = "";
            }
            String strU2 = z3.U(g0Var2, 2131886221);
            v1.c cVar2 = z5 ? c.d : null;
            objN2 = g0Var2.N();
            if (objN2 == obj) {
                objN2 = new d(0);
                g0Var2.n0(objN2);
            }
            u00.k kVar2 = (u00.k) objN2;
            if ((i3 & 7168) == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            objN3 = g0Var2.N();
            if (z6) {
                objN3 = new a(z5, z0Var, 1);
                g0Var2.n0(objN3);
            } else {
                objN3 = new a(z5, z0Var, 1);
                g0Var2.n0(objN3);
            }
            up.i.e(strD, kVar2, rVarD2, strU2, null, false, false, z5, false, null, null, null, cVar2, (u00.a) objN3, null, g0Var2, ((i3 << 15) & 234881024) | 48, 0, 40688);
            g0Var = g0Var2;
            boolean zBooleanValue2 = ((Boolean) z0Var.getValue()).booleanValue();
            objN4 = g0Var.N();
            if (objN4 == obj) {
                objN4 = new ct.k(z0Var, 15);
                g0Var.n0(objN4);
            }
            u00.a aVar2 = (u00.a) objN4;
            if ((i3 & 112) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            objN5 = g0Var.N();
            if (z7) {
                objN5 = new e(onSexSelected, z0Var, 0);
                g0Var.n0(objN5);
            } else {
                objN5 = new e(onSexSelected, z0Var, 0);
                g0Var.n0(objN5);
            }
            b(zBooleanValue2, aVar2, (u00.k) objN5, g0Var, 48);
            z4 = z5;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            z4 = z2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new y(fVar, onSexSelected, rVar, z4, i, i2, 6);
        }
    }

    public static final String d(ep.f fVar, j jVar) {
        int i;
        int iOrdinal = fVar.ordinal();
        if (iOrdinal == 0) {
            i = 2131886219;
        } else if (iOrdinal == 1) {
            i = 2131886218;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2131886220;
        }
        return z3.U(jVar, i);
    }
}
