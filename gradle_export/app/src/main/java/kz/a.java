package kz;

import as.p0;
import b2.o;
import b2.r;
import c3.o1;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g1.i1;
import g1.o3;
import g1.z6;
import h0.c1;
import h0.i;
import h0.s;
import h0.t1;
import h0.v;
import h0.v1;
import h0.w;
import h0.z1;
import i2.b0;
import i2.o0;
import i2.t;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import m3.r0;
import q3.u;
import x3.k;
import x3.l;
import z.n;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new jk.c(16), -49608062, false);

    public static final void a(u00.a onClick, r rVar, j jVar, int i) {
        m.e(onClick, "onClick");
        g0 g0Var = (g0) jVar;
        g0Var.e0(605874946);
        int i2 = (g0Var.i(onClick) ? 4 : 2) | i | (g0Var.g(rVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            boolean z = g0Var.k(dl.e.a) == gm.a.B;
            r rVarD = z1.d(rVar, 1.0f);
            long j = dl.a.U;
            r rVarC = h0.c.C(w50.c.n(n.f(rVarD, t.b(0.1f, j), p0.f.a(24)), true, onClick), 16);
            v1 v1VarA = t1.a(i.a, b2.b.K, g0Var, 48);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC2 = b2.a.c(rVarC, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(v1VarA, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC2, g0Var, b3.h.d);
            m2.b bVarR = y3.R(2131231347, g0Var, 0);
            o oVar = o.A;
            o3.a(bVarR, (String) null, z1.m(oVar, 20), j, g0Var, 440, 0);
            String strU = z3.U(g0Var, 2131886717);
            long jZ = z ? kh.o.z(18) : kh.o.z(15);
            long jZ2 = z ? kh.o.z(21) : kh.o.z(20);
            u uVar = u.B;
            r rVarG = h0.c.G(oVar, 8, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            z6.b(strU, rVarG.V(new c1(1.0f, true)), j, jZ, uVar, (q3.i) null, 0L, (l) null, (k) null, jZ2, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1572864, 0, 260008);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ev.m(onClick, rVar, i, 5);
        }
    }

    public static final void b(r rVar, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1926824398);
        int i2 = (g0Var.g(rVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            boolean z = g0Var.k(dl.e.a) == gm.a.B;
            r rVarC = h0.c.C(n.f(f2.h.c(z1.d(rVar, 1.0f), p0.f.a(24)), t.b(0.1f, dl.a.i), b0.b), 16);
            v1 v1VarA = t1.a(i.g(8), b2.b.J, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC2 = b2.a.c(rVarC, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(v1VarA, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC2, g0Var, b3.h.d);
            m2.b bVarR = y3.R(2131231347, g0Var, 0);
            long j = dl.a.k;
            o3.a(bVarR, (String) null, z1.m(o.A, 20), j, g0Var, 440, 0);
            String strU = z3.U(g0Var, 2131886718);
            long jZ = kh.o.z(z ? 18 : 15);
            long jZ2 = z ? kh.o.z(21) : kh.o.z(20);
            u uVar = u.B;
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            k00.f.a(strU, new c1(1.0f, true), j, jZ, new y3.o(jZ2), uVar, null, 2, 0.0f, null, g0Var, 12779520, 832);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.b(rVar, i, 20);
        }
    }

    public static final void c(final u00.a onClick, u00.a onDismiss, final r rVar, j jVar, final int i) {
        u00.a aVar;
        m.e(onClick, "onClick");
        m.e(onDismiss, "onDismiss");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-536743358);
        int i2 = i | (g0Var.i(onClick) ? 4 : 2) | (g0Var.i(onDismiss) ? 32 : 16) | (g0Var.g(rVar) ? 256 : 128);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            boolean z = g0Var.k(dl.e.a) == gm.a.B;
            r rVarC = f2.h.c(z1.d(rVar, 1.0f), p0.f.a(24));
            long j = dl.a.i;
            long jB = t.b(0.08f, j);
            o0 o0Var = b0.b;
            r rVarC2 = h0.c.C(w50.c.n(n.f(rVarC, jB, o0Var), true, onClick), 16);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC3 = b2.a.c(rVarC2, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            q.I(w0VarD, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC3, g0Var, fVar4);
            o oVar = o.A;
            boolean z2 = z;
            r rVarD = z1.d(oVar, 1.0f);
            v1 v1VarA = t1.a(i.g(12), b2.b.K, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC4 = b2.a.c(rVarD, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(v1VarA, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC4, g0Var, fVar4);
            r rVarF = n.f(f2.h.c(z1.m(oVar, 44), p0.f.a), t.b(0.12f, j), o0Var);
            w0 w0VarD2 = h0.o.d(b2.b.E, false);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            r rVarC5 = b2.a.c(rVarF, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD2, g0Var, fVar);
            q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC5, g0Var, fVar4);
            float f = 20;
            o3.a(y3.R(2131231356, g0Var, 0), (String) null, z1.m(oVar, f), j, g0Var, 440, 0);
            g0Var.r(true);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            r rVarG = h0.c.G(new c1(1.0f, true), 0.0f, 0.0f, f, 0.0f, 11);
            v vVarA = h0.u.a(i.g(4), b2.b.M, g0Var, 6);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            r rVarC6 = b2.a.c(rVarG, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, fVar);
            q.I(m1VarM4, g0Var, fVar2);
            a1.b.v(iHashCode4, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC6, g0Var, fVar4);
            String strU = z3.U(g0Var, 2131886725);
            long j2 = dl.a.k;
            k00.f.a(strU, null, j2, z2 ? kh.o.z(18) : kh.o.z(16), new y3.o(z2 ? kh.o.z(21) : kh.o.z(20)), u.D, null, 1, 0.0f, null, g0Var, 12779520, 834);
            k00.f.a(z3.U(g0Var, 2131886724), null, t.b(0.5f, j2), kh.o.z(z2 ? 15 : 13), new y3.o(kh.o.z(18)), u.B, null, 2, 0.0f, null, g0Var, 12804096, 834);
            g0Var = g0Var;
            g0Var.r(true);
            g0Var.r(true);
            aVar = onDismiss;
            o3.a(y3.R(2131231104, g0Var, 0), (String) null, w50.c.o(z1.m(s.a.a(oVar, b2.b.C), 14), false, null, aVar, 7), dl.a.p, g0Var, 56, 0);
            g0Var.r(true);
        } else {
            aVar = onDismiss;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            final int i3 = 1;
            final u00.a aVar2 = aVar;
            r1VarT.d = new u00.n(onClick, aVar2, rVar, i, i3) {
                public final int A;
                public final u00.a B;
                public final u00.a C;
                public final r D;

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
                            y3.i(this.B, this.C, this.D, jVar2, q.K(1));
                            break;
                        default:
                            kz.a.c(this.B, this.C, this.D, jVar2, q.K(1));
                            break;
                    }
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void d(r rVar, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1255932070);
        int i2 = (g0Var.g(rVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            h0.c.a(f2.h.c(rVar, b0.b), b2.b.E, false, v1.d.d(-612808068, new p0(((y3.c) g0Var.k(o1.h)).A0(100), 7), g0Var), g0Var, 3120, 4);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.b(rVar, i, 21);
        }
    }

    public static final void e(r rVar, j jVar, int i, int i2) {
        r rVar2;
        int i3;
        g0 g0Var = (g0) jVar;
        g0Var.e0(994361288);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = i | (g0Var.g(rVar2) ? 4 : 2);
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        if (g0Var.S(i3 & 1, (i3 & 3) != 2)) {
            r rVar3 = o.A;
            r rVar4 = i4 != 0 ? rVar3 : rVar2;
            float f = 10;
            float fA0 = ((y3.c) g0Var.k(o1.h)).A0(f);
            p0.e eVar = p0.f.a;
            long j = dl.a.i;
            r rVarG = n.g(f2.h.c(rVar4, eVar), 1, t.b(0.22f, j), eVar);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarG, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            q.I(w0VarD, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar2 = b3.h.h;
            q.E(g0Var, eVar2);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC, g0Var, fVar4);
            r rVar5 = rVar4;
            h0.c.a(s.a.b(), (b2.d) null, false, v1.d.d(-550524764, new p0(fA0, 8), g0Var), g0Var, 3072, 6);
            float f2 = 22;
            r rVarD = h0.c.D(rVar3, f2, 14);
            v1 v1VarA = t1.a(i.g(f), b2.b.K, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarD, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(v1VarA, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar2);
            q.I(rVarC2, g0Var, fVar4);
            o3.a(y3.R(2131231427, g0Var, 0), (String) null, z1.m(rVar3, f2), j, g0Var, 440, 0);
            z6.b(z3.U(g0Var, 2131887023), (r) null, j, kh.o.z(22), u.D, (q3.i) null, 0L, (l) null, (k) null, kh.o.z(26), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 260010);
            g0Var = g0Var;
            g0Var.r(true);
            g0Var.r(true);
            rVar2 = rVar5;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new androidx.media3.cast.f(rVar2, i, i2, 2);
        }
    }

    public static final void f(String label, String value, r rVar, long j, String str, j jVar, int i, int i2) {
        String str2;
        int i3;
        boolean z;
        String str3;
        long j2;
        r rVar2;
        r1 r1VarT;
        int i4;
        r rVar3;
        int i5;
        String str4;
        long j3;
        r rVar4;
        boolean z2;
        long jZ;
        int i6;
        int i7;
        long jZ2;
        b3.g gVar;
        long j4;
        u uVar;
        String str5;
        m.e(label, "label");
        m.e(value, "value");
        g0 g0Var = (g0) jVar;
        g0Var.e0(872734494);
        long j5 = j;
        int i8 = i | (g0Var.g(label) ? 4 : 2) | (g0Var.g(value) ? 32 : 16) | 384 | (((i2 & 8) == 0 && g0Var.f(j5)) ? 2048 : 1024);
        if ((i2 & 16) == 0) {
            str2 = str;
            int i9 = g0Var.g(str2) ? 16384 : 8192;
            i3 = i8 | i9;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i3 & 1, z)) {
                g0Var.X();
                i4 = i & 1;
                rVar3 = o.A;
                if (i4 != 0 || g0Var.A()) {
                    if ((i2 & 8) != 0) {
                        j5 = dl.a.k;
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        str2 = new String();
                        i3 &= -57345;
                    }
                    i5 = i3;
                    str4 = str2;
                    j3 = j5;
                    rVar4 = rVar3;
                } else {
                    g0Var.V();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i5 = i3;
                    str4 = str2;
                    j3 = j5;
                    rVar4 = rVar;
                }
                g0Var.s();
                if (g0Var.k(dl.e.a) == gm.a.B) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    jZ = kh.o.z(18);
                } else {
                    jZ = kh.o.z(16);
                }
                if (z2) {
                    i6 = 21;
                } else {
                    i6 = 22;
                }
                long jZ3 = kh.o.z(i6);
                if (z2) {
                    i7 = 15;
                } else {
                    i7 = 13;
                }
                jZ2 = kh.o.z(i7);
                float f = 12;
                r rVarD = h0.c.D(z1.d(rVar4, 1.0f), 16, f);
                long j6 = jZ;
                v1 v1VarA = t1.a(i.g, b2.b.K, g0Var, 54);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                r rVarC = b2.a.c(rVarD, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                b3.f fVar = b3.h.f;
                q.I(v1VarA, g0Var, fVar);
                b3.f fVar2 = b3.h.e;
                q.I(m1VarM, g0Var, fVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                b3.f fVar3 = b3.h.g;
                q.I(numValueOf, g0Var, fVar3);
                b3.e eVar = b3.h.h;
                q.E(g0Var, eVar);
                b3.f fVar4 = b3.h.d;
                q.I(rVarC, g0Var, fVar4);
                j4 = dl.a.k;
                r rVar5 = rVar4;
                long jB = t.b(0.5f, j4);
                uVar = u.B;
                z6.b(label, h0.c.G(rVar3, 0.0f, 0.0f, f, 0.0f, 11), jB, j6, uVar, (q3.i) null, 0L, (l) null, (k) null, jZ3, 0, false, 1, 0, (u00.k) null, (r0) null, g0Var, (i5 & 14) | 1572912, 24576, 243624);
                g0Var = g0Var;
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                h0.c.h(new c1(1.0f, true), g0Var);
                v vVarA = h0.u.a(i.g(2), b2.b.O, g0Var, 54);
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                r rVarC2 = b2.a.c(rVar3, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(vVarA, g0Var, fVar);
                q.I(m1VarM2, g0Var, fVar2);
                a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
                q.I(rVarC2, g0Var, fVar4);
                int i11 = i5 >> 3;
                long j7 = j3;
                k00.f.a(value, null, j7, j6, new y3.o(jZ3), u.C, new k(6), 1, 0.0f, null, g0Var, (i11 & 14) | 12779520 | (i11 & 896), 770);
                if (r30.k.L0(str4)) {
                    str5 = str4;
                    g0Var.c0(-478226498);
                    g0Var.r(false);
                } else {
                    g0Var.c0(-478641123);
                    str5 = str4;
                    z6.b(str5, (r) null, t.b(0.5f, j4), jZ2, uVar, (q3.i) null, 0L, (l) null, new k(6), kh.o.z(18), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, ((i5 >> 12) & 14) | 1572864, 25008, 238506);
                    g0Var = g0Var;
                    g0Var.r(false);
                }
                g0Var.r(true);
                g0Var.r(true);
                j2 = j7;
                str3 = str5;
                rVar2 = rVar5;
            } else {
                g0Var.V();
                str3 = str2;
                j2 = j5;
                rVar2 = rVar;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new i1(label, value, rVar2, j2, str3, i, i2);
            }
        }
        str2 = str;
        i3 = i8 | i9;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (g0Var.S(i3 & 1, z)) {
            g0Var.X();
            i4 = i & 1;
            rVar3 = o.A;
            if (i4 != 0) {
                if ((i2 & 8) != 0) {
                    j5 = dl.a.k;
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    str2 = new String();
                    i3 &= -57345;
                }
                i5 = i3;
                str4 = str2;
                j3 = j5;
                rVar4 = rVar3;
            } else {
                if ((i2 & 8) != 0) {
                    j5 = dl.a.k;
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    str2 = new String();
                    i3 &= -57345;
                }
                i5 = i3;
                str4 = str2;
                j3 = j5;
                rVar4 = rVar3;
            }
            g0Var.s();
            if (g0Var.k(dl.e.a) == gm.a.B) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                jZ = kh.o.z(18);
            } else {
                jZ = kh.o.z(16);
            }
            if (z2) {
                i6 = 21;
            } else {
                i6 = 22;
            }
            long jZ4 = kh.o.z(i6);
            if (z2) {
                i7 = 15;
            } else {
                i7 = 13;
            }
            jZ2 = kh.o.z(i7);
            float f2 = 12;
            r rVarD2 = h0.c.D(z1.d(rVar4, 1.0f), 16, f2);
            long j8 = jZ;
            v1 v1VarA2 = t1.a(i.g, b2.b.K, g0Var, 54);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            r rVarC3 = b2.a.c(rVarD2, g0Var);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar5 = b3.h.f;
            q.I(v1VarA2, g0Var, fVar5);
            b3.f fVar6 = b3.h.e;
            q.I(m1VarM3, g0Var, fVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            b3.f fVar7 = b3.h.g;
            q.I(numValueOf2, g0Var, fVar7);
            b3.e eVar2 = b3.h.h;
            q.E(g0Var, eVar2);
            b3.f fVar8 = b3.h.d;
            q.I(rVarC3, g0Var, fVar8);
            j4 = dl.a.k;
            r rVar6 = rVar4;
            long jB2 = t.b(0.5f, j4);
            uVar = u.B;
            z6.b(label, h0.c.G(rVar3, 0.0f, 0.0f, f2, 0.0f, 11), jB2, j8, uVar, (q3.i) null, 0L, (l) null, (k) null, jZ4, 0, false, 1, 0, (u00.k) null, (r0) null, g0Var, (i5 & 14) | 1572912, 24576, 243624);
            g0Var = g0Var;
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            h0.c.h(new c1(1.0f, true), g0Var);
            v vVarA2 = h0.u.a(i.g(2), b2.b.O, g0Var, 54);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            r rVarC4 = b2.a.c(rVar3, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA2, g0Var, fVar5);
            q.I(m1VarM4, g0Var, fVar6);
            a1.b.v(iHashCode4, g0Var, fVar7, g0Var, eVar2);
            q.I(rVarC4, g0Var, fVar8);
            int i12 = i5 >> 3;
            long j9 = j3;
            k00.f.a(value, null, j9, j8, new y3.o(jZ4), u.C, new k(6), 1, 0.0f, null, g0Var, (i12 & 14) | 12779520 | (i12 & 896), 770);
            if (r30.k.L0(str4)) {
                g0Var.c0(-478641123);
                str5 = str4;
                z6.b(str5, (r) null, t.b(0.5f, j4), jZ2, uVar, (q3.i) null, 0L, (l) null, new k(6), kh.o.z(18), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, ((i5 >> 12) & 14) | 1572864, 25008, 238506);
                g0Var = g0Var;
                g0Var.r(false);
            } else {
                str5 = str4;
                g0Var.c0(-478226498);
                g0Var.r(false);
            }
            g0Var.r(true);
            g0Var.r(true);
            j2 = j9;
            str3 = str5;
            rVar2 = rVar6;
        } else {
            g0Var.V();
            str3 = str2;
            j2 = j5;
            rVar2 = rVar;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new i1(label, value, rVar2, j2, str3, i, i2);
        }
    }

    public static final void g(final r rVar, final v1.c cVar, j jVar, final int i) {
        int i2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-602798422);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(cVar) ? 32 : 16;
        }
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            r rVarE = h0.c.E(n.f(f2.h.c(z1.d(rVar, 1.0f), p0.f.a(24)), t.b(0.08f, dl.a.i), b0.b), 0.0f, 4, 1);
            int i3 = (i2 << 6) & 7168;
            v vVarA = h0.u.a(i.c, b2.b.M, g0Var, 0);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarE, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC, g0Var, b3.h.d);
            cVar.invoke(w.a, g0Var, Integer.valueOf(((i3 >> 6) & 112) | 6));
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            final int i4 = 0;
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    j jVar2 = (j) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            a.g(rVar, cVar, jVar2, q.K(i | 1));
                            break;
                        case 1:
                            v0.g.c(rVar, cVar, jVar2, q.K(i | 1));
                            break;
                        case 2:
                            v0.g.d(rVar, cVar, jVar2, q.K(i | 1));
                            break;
                        case 3:
                            v0.i.d(rVar, cVar, jVar2, q.K(i | 1));
                            break;
                        case 4:
                            v0.g.b(rVar, cVar, jVar2, q.K(i | 1));
                            break;
                        default:
                            v0.g.a(rVar, cVar, jVar2, q.K(i | 1));
                            break;
                    }
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void h(int i, String title, u00.a onClick, r rVar, u00.n nVar, j jVar, int i2, int i3) {
        r rVar2;
        int i4;
        u00.n nVar2;
        r rVar3;
        m.e(title, "title");
        m.e(onClick, "onClick");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1150626004);
        int i5 = (g0Var.e(i) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i5 |= g0Var.g(title) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= g0Var.i(onClick) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 = i5 | 3072;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i4 = i5 | (g0Var.g(rVar2) ? 2048 : 1024);
        }
        int i7 = i4 | 221184;
        if (g0Var.S(i7 & 1, (74899 & i7) != 74898)) {
            r rVar4 = o.A;
            r rVar5 = i6 != 0 ? rVar4 : rVar2;
            boolean z = g0Var.k(dl.e.a) == gm.a.B;
            float f = 16;
            r rVarD = h0.c.D(w50.c.n(n.f(f2.h.c(z1.d(rVar5, 1.0f), p0.f.a(24)), t.b(0.08f, dl.a.i), b0.b), true, onClick), f, f);
            v1 v1VarA = t1.a(i.g(12), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC, g0Var, fVar4);
            m2.b bVarR = y3.R(i, g0Var, i7 & 14);
            long j = dl.a.k;
            r rVar6 = rVar5;
            o3.a(bVarR, (String) null, z1.m(rVar4, 20), j, g0Var, 440, 0);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            v vVarA = h0.u.a(i.g(4), b2.b.M, g0Var, 6);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(c1Var, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC2, g0Var, fVar4);
            z6.b(title, (r) null, j, z ? kh.o.z(18) : kh.o.z(16), u.C, (q3.i) null, 0L, (l) null, (k) null, z ? kh.o.z(21) : kh.o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, ((i7 >> 3) & 14) | 1572864, 0, 260010);
            g0Var = g0Var;
            g0Var.c0(1964650567);
            g0Var.r(false);
            g0Var.r(true);
            u00.n nVar3 = a;
            nVar3.invoke(g0Var, 6);
            g0Var.r(true);
            rVar3 = rVar6;
            nVar2 = nVar3;
        } else {
            g0Var.V();
            nVar2 = nVar;
            rVar3 = rVar2;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b6.q(i, title, onClick, rVar3, nVar2, i2, i3);
        }
    }
}
