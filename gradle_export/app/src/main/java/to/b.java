package to;

import a10.h0;
import ab.a0;
import b2.o;
import b2.r;
import c3.g3;
import c3.o1;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g1.l7;
import g1.o3;
import g1.z6;
import h0.c1;
import h0.s;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.z1;
import i2.b0;
import i2.o0;
import i2.t;
import kotlin.NoWhenBranchMatchedException;
import l1.g0;
import l1.m1;
import l1.q;
import l1.r1;
import m3.r0;
import z.n;
import z2.d0;
import z2.w0;

public abstract class b {
    public static final long a = b0.d(4290953922L);
    public static final int b = 0;

    public static final void a(lo.b card, a aVar, r rVar, u00.a aVar2, u00.a aVar3, u00.a aVar4, u00.a aVar5, l1.j jVar, int i, int i2) {
        u00.a aVar6;
        int i3;
        u00.a aVar7;
        int i4;
        u00.a aVar8;
        int i5;
        int i6;
        u00.a aVar9;
        u00.a aVar10;
        u00.a aVar11;
        u00.a aVar12;
        CharSequence charSequenceSubSequence;
        u00.a aVar13;
        long j;
        float f;
        u00.a aVar14;
        kotlin.jvm.internal.m.e(card, "card");
        lo.e eVar = card.e;
        String str = card.d;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-352414760);
        int i7 = i | (g0Var.g(card) ? 4 : 2) | (g0Var.g(aVar) ? 32 : 16) | (g0Var.g(rVar) ? 256 : 128);
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 = i7 | 3072;
            aVar6 = aVar2;
        } else {
            aVar6 = aVar2;
            i3 = i7 | (g0Var.i(aVar6) ? 2048 : 1024);
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i4 = i3 | 24576;
            aVar7 = aVar3;
        } else {
            aVar7 = aVar3;
            i4 = i3 | (g0Var.i(aVar7) ? 16384 : 8192);
        }
        int i11 = i2 & 32;
        if (i11 != 0) {
            i5 = i4 | 196608;
            aVar8 = aVar4;
        } else {
            aVar8 = aVar4;
            i5 = i4 | (g0Var.i(aVar8) ? 131072 : 65536);
        }
        int i12 = i2 & 64;
        if (i12 != 0) {
            i6 = i5 | 1572864;
        } else {
            i6 = i5 | (g0Var.i(aVar5) ? 1048576 : 524288);
        }
        int i13 = i6;
        if (g0Var.S(i13 & 1, (i13 & 599187) != 599186)) {
            u00.a aVar15 = i8 != 0 ? null : aVar6;
            if (i9 != 0) {
                aVar7 = null;
            }
            if (i11 != 0) {
                aVar8 = null;
            }
            u00.a aVar16 = i12 != 0 ? null : aVar5;
            r rVarC = f2.h.c(z1.q(rVar, aVar.a), p0.f.a(24));
            long j2 = dl.a.q;
            o0 o0Var = b0.b;
            r rVarF = n.f(rVarC, j2, o0Var);
            r rVar2 = o.A;
            r rVarV = rVarF.V(aVar15 != null ? w50.c.n(rVar2, true, aVar15) : rVar2);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC2 = b2.a.c(rVarV, g0Var);
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
            q.I(rVarC2, g0Var, fVar4);
            s sVar = s.a;
            u00.a aVar17 = aVar15;
            u00.a aVar18 = aVar8;
            u00.a aVar19 = aVar7;
            h0.a(eVar, sVar.b(), 0.0f, false, 64, true, g0Var, 224256, 4);
            h0.o.a(n.f(sVar.b(), t.b(0.3f, t.b), o0Var), g0Var, 0);
            r rVarD = z1.d(rVar2, 1.0f);
            b2.g gVar2 = b2.b.N;
            h0.d dVar = h0.i.c;
            v vVarA = u.a(dVar, gVar2, g0Var, 48);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC3 = b2.a.c(rVarD, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar2);
            q.I(rVarC3, g0Var, fVar4);
            h0.a(eVar, f2.h.c(z1.m(h0.c.G(rVar2, 0.0f, 28, 0.0f, 18, 5), aVar.b), p0.f.a(8)), 0.0f, false, null, false, g0Var, 0, 60);
            float f2 = 16;
            r rVarG = h0.c.G(z1.d(rVar2, 1.0f), f2, 0.0f, f2, f2, 2);
            v vVarA2 = u.a(dVar, b2.b.M, g0Var, 0);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            r rVarC4 = b2.a.c(rVarG, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA2, g0Var, fVar);
            q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar2);
            q.I(rVarC4, g0Var, fVar4);
            z6.b(card.c, (r) null, dl.a.n, kh.o.z(15), q3.u.L, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(18), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, 1597440, 25008, 239530);
            float f3 = 2;
            h0.c.h(z1.e(rVar2, f3), g0Var);
            boolean zG = g0Var.g(str);
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (zG || objN == obj) {
                int length = str.length() - 1;
                if (length < 0) {
                    charSequenceSubSequence = "";
                    break;
                }
                while (true) {
                    int i14 = length - 1;
                    char cCharAt = str.charAt(length);
                    if (!z3.J(cCharAt) && cCharAt != '.' && cCharAt != 8230) {
                        charSequenceSubSequence = str.subSequence(0, length + 1);
                        break;
                    } else {
                        if (i14 < 0) {
                            charSequenceSubSequence = "";
                            break;
                        }
                        length = i14;
                    }
                }
                objN = charSequenceSubSequence.toString() + "…";
                g0Var.n0(objN);
            }
            String str2 = (String) objN;
            long jZ = kh.o.z(13);
            long jZ2 = kh.o.z(16);
            long j3 = a;
            z6.b(str2, (r) null, j3, jZ, (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, jZ2, 2, false, 2, 2, (u00.k) null, (r0) null, g0Var, 24960, 221616, 206826);
            g0Var = g0Var;
            float f4 = 12;
            h0.c.h(z1.e(rVar2, f4), g0Var);
            r rVarD2 = z1.d(rVar2, 1.0f);
            b2.h hVar = b2.b.K;
            v1 v1VarA = t1.a(h0.i.g, hVar, g0Var, 54);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            r rVarC5 = b2.a.c(rVarD2, g0Var);
            b3.i.c.getClass();
            b3.g gVar3 = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar3);
            } else {
                g0Var.q0();
            }
            b3.f fVar5 = b3.h.f;
            q.I(v1VarA, g0Var, fVar5);
            b3.f fVar6 = b3.h.e;
            q.I(m1VarM4, g0Var, fVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode4);
            b3.f fVar7 = b3.h.g;
            q.I(numValueOf2, g0Var, fVar7);
            b3.e eVar3 = b3.h.h;
            q.E(g0Var, eVar3);
            b3.f fVar8 = b3.h.d;
            q.I(rVarC5, g0Var, fVar8);
            lo.s sVar2 = card.f;
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            b(sVar2, aVar19, new c1(1.0f, false), g0Var, (i13 >> 9) & 112);
            v1 v1VarA2 = t1.a(h0.i.a, hVar, g0Var, 48);
            int iHashCode5 = Long.hashCode(g0Var.T);
            m1 m1VarM5 = g0Var.m();
            r rVarC6 = b2.a.c(rVar2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar3);
            } else {
                g0Var.q0();
            }
            q.I(v1VarA2, g0Var, fVar5);
            q.I(m1VarM5, g0Var, fVar6);
            a1.b.v(iHashCode5, g0Var, fVar7, g0Var, eVar3);
            q.I(rVarC6, g0Var, fVar8);
            lo.i iVar = card.g;
            if (iVar.equals(lo.f.a)) {
                iVar = null;
            }
            if (iVar == null) {
                g0Var.c0(-409156678);
                g0Var.r(false);
                j = j3;
                aVar13 = aVar18;
                f = f2;
            } else {
                g0Var.c0(-409156677);
                Object objN2 = g0Var.N();
                if (objN2 == obj) {
                    objN2 = new pz.m(11);
                    g0Var.n0(objN2);
                }
                aVar13 = aVar18;
                j = j3;
                a0.a(iVar, j, h0.c.C(d0.l(rVar2, (u00.o) objN2).V(aVar13 != null ? w50.c.o(rVar2, false, null, aVar13, 7) : rVar2), f4), f2, 2131231075, 2131231095, f3, g0Var, 1575984, 0);
                f = f2;
                g0Var = g0Var;
                h0.c.h(z1.q(rVar2, 14), g0Var);
                g0Var.r(false);
            }
            if (aVar16 != null) {
                g0Var.c0(-406770235);
                Object objN3 = g0Var.N();
                if (objN3 == obj) {
                    objN3 = new pz.m(12);
                    g0Var.n0(objN3);
                }
                r rVarL = d0.l(rVar2, (u00.o) objN3);
                float f5 = 44;
                float f6 = 10;
                Object objN4 = g0Var.N();
                if (objN4 == obj) {
                    objN4 = new sy.e(10);
                    g0Var.n0(objN4);
                }
                g0 g0Var2 = g0Var;
                aVar14 = aVar16;
                wr.k.u(false, (u00.a) objN4, rVarL, f5, j, false, null, 0, false, aVar14, f6, g0Var2, (1879048192 & (i13 << 9)) | 100690998, 6, 224);
                g0Var = g0Var2;
                g0Var.r(false);
            } else {
                aVar14 = aVar16;
                g0Var.c0(-405457137);
                o3.a(y3.R(2131231396, g0Var, 0), (String) null, z1.n(rVar2, f, 4), j, g0Var, 3512, 0);
                g0Var.r(false);
            }
            g0Var.r(true);
            g0Var.r(true);
            g0Var.r(true);
            g0Var.r(true);
            g0Var.r(true);
            aVar11 = aVar13;
            aVar12 = aVar14;
            aVar10 = aVar19;
            aVar9 = aVar17;
        } else {
            g0Var.V();
            aVar9 = aVar6;
            aVar10 = aVar7;
            aVar11 = aVar8;
            aVar12 = aVar5;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new l7(card, aVar, rVar, aVar9, aVar10, aVar11, aVar12, i, i2);
        }
    }

    public static final void b(lo.s sVar, u00.a aVar, r rVar, l1.j jVar, int i) {
        int i2;
        g00.k kVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-500654897);
        if ((i & 6) == 0) {
            i2 = (g0Var.e(sVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.g(rVar) ? 256 : 128;
        }
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            int iOrdinal = sVar.ordinal();
            if (iOrdinal == 0) {
                kVar = new g00.k(2131231358, 2131886151);
            } else if (iOrdinal == 1) {
                kVar = new g00.k(2131231358, 2131886129);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                kVar = new g00.k(2131231354, 2131886141);
            }
            int iIntValue = ((Number) kVar.A).intValue();
            int iIntValue2 = ((Number) kVar.B).intValue();
            r rVarF = n.f(f2.h.c(rVar, p0.f.a), t.b(0.95f, t.c), b0.b);
            r rVar2 = o.A;
            float f = 12;
            r rVarD = h0.c.D(rVarF.V(aVar != null ? w50.c.o(rVar2, false, null, aVar, 7) : rVar2), f, 8);
            v1 v1VarA = t1.a(h0.i.g(7), b2.b.K, g0Var, 54);
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
            q.I(v1VarA, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC, g0Var, b3.h.d);
            m2.b bVarR = y3.R(iIntValue, g0Var, 0);
            long j = dl.a.L;
            o3.a(bVarR, (String) null, z1.m(rVar2, f), j, g0Var, 440, 0);
            z6.b(z3.U(g0Var, iIntValue2), (r) null, j, kh.o.z(13), q3.u.L, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(16), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, 1597440, 25008, 239530);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.f(i, 22, sVar, aVar, rVar);
        }
    }

    public static final a c(l1.j jVar) {
        float f;
        g0 g0Var = (g0) jVar;
        long jA = ((g3) g0Var.k(o1.u)).a();
        float fH0 = ((y3.c) g0Var.k(o1.h)).h0(Math.min((int) (jA >> 32), (int) (jA & 4294967295L)));
        int iOrdinal = ((gm.a) g0Var.k(dl.e.a)).ordinal();
        if (iOrdinal == 0) {
            f = 0.69f * fH0;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            f = 267;
        }
        float f2 = 0.76f * f;
        return new a(f, f2, 46 + f2 + 115);
    }
}
