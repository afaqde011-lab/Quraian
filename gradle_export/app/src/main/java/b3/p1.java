package b3;

import android.graphics.BlendModeColorFilter;
import android.graphics.Paint;
import android.graphics.RenderNode;
import android.view.ViewParent;
import androidx.compose.ui.node.Owner;
import com.google.android.gms.cast.Cast;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public abstract class p1 extends u0 implements z2.v0, z2.a0, a2 {

    public static final i2.q0 f2089p0 = new i2.q0();

    public static final w f2090q0 = new w();

    public static final float[] f2091r0 = i2.h0.a();

    public static final i1 f2092s0 = new i1();

    public static final j1 f2093t0 = new j1();
    public final l0 O;
    public boolean P;
    public boolean Q;
    public p1 R;
    public p1 S;
    public boolean T;
    public boolean U;
    public u00.k V;
    public y3.c W;
    public y3.m X;
    public z2.x0 Z;

    public u.c0 f2094a0;

    public float f2096c0;

    public h2.a f2097d0;

    public w f2098e0;

    public boolean f2100g0;

    public boolean f2101h0;

    public l2.b f2102i0;

    public i2.s f2103j0;

    public l1 f2104k0;

    public boolean f2106m0;

    public z1 f2107n0;

    public l2.b f2108o0;
    public float Y = 0.8f;

    public long f2095b0 = 0;

    public i2.t0 f2099f0 = i2.b0.f7111b;

    public final m1 f2105l0 = new m1(this, 1);

    public p1(l0 l0Var) {
        this.O = l0Var;
        this.W = l0Var.Z;
        this.X = l0Var.f2053a0;
    }

    public static p1 U1(z2.a0 a0Var) {
        p1 p1Var;
        z2.s0 s0Var = a0Var instanceof z2.s0 ? (z2.s0) a0Var : null;
        if (s0Var != null && (p1Var = s0Var.A.O) != null) {
            return p1Var;
        }
        kotlin.jvm.internal.m.c(a0Var, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (p1) a0Var;
    }

    @Override
    public final boolean A() {
        return z1().N;
    }

    public final b2.q A1(int i10) {
        boolean zG = q1.g(i10);
        b2.q qVarZ1 = z1();
        if (!zG && (qVarZ1 = qVarZ1.E) == null) {
            return null;
        }
        for (b2.q qVarB1 = B1(zG); qVarB1 != null && (qVarB1.D & i10) != 0; qVarB1 = qVarB1.F) {
            if ((qVarB1.C & i10) != 0) {
                return qVarB1;
            }
            if (qVarB1 == qVarZ1) {
                return null;
            }
        }
        return null;
    }

    public final b2.q B1(boolean z10) {
        b2.q qVarZ1;
        a1.n nVar = this.O.f2059g0;
        if (((p1) nVar.E) == this) {
            return (b2.q) nVar.G;
        }
        if (!z10) {
            p1 p1Var = this.S;
            if (p1Var != null) {
                return p1Var.z1();
            }
            return null;
        }
        p1 p1Var2 = this.S;
        if (p1Var2 == null || (qVarZ1 = p1Var2.z1()) == null) {
            return null;
        }
        return qVarZ1.F;
    }

    public final void C1(b2.q qVar, k1 k1Var, long j9, s sVar, int i10, boolean z10) {
        if (qVar == null) {
            F1(k1Var, j9, sVar, i10, z10);
            return;
        }
        if (!k1Var.d(qVar)) {
            C1(m.d(qVar, k1Var.a()), k1Var, j9, sVar, i10, z10);
            return;
        }
        int i11 = sVar.C;
        u.d0 d0Var = sVar.A;
        sVar.c(i11 + 1, d0Var.f14838b);
        sVar.C++;
        d0Var.a(qVar);
        sVar.B.a(m.a(-1.0f, z10, false));
        C1(m.d(qVar, k1Var.a()), k1Var, j9, sVar, i10, z10);
        sVar.C = i11;
    }

    public final void D1(b2.q qVar, k1 k1Var, long j9, s sVar, int i10, boolean z10, float f3) {
        if (qVar == null) {
            F1(k1Var, j9, sVar, i10, z10);
            return;
        }
        if (!k1Var.d(qVar)) {
            D1(m.d(qVar, k1Var.a()), k1Var, j9, sVar, i10, z10, f3);
            return;
        }
        int i11 = sVar.C;
        u.d0 d0Var = sVar.A;
        sVar.c(i11 + 1, d0Var.f14838b);
        sVar.C++;
        d0Var.a(qVar);
        sVar.B.a(m.a(f3, z10, false));
        N1(m.d(qVar, k1Var.a()), k1Var, j9, sVar, i10, z10, f3, true);
        sVar.C = i11;
    }

    public final void E1(k1 k1Var, long j9, s sVar, int i10, boolean z10) {
        boolean z11;
        boolean z12;
        b2.q qVarA1 = A1(k1Var.a());
        if (!a2(j9)) {
            if (i10 == 1) {
                float fR1 = r1(j9, y1());
                if ((Float.floatToRawIntBits(fR1) & Integer.MAX_VALUE) < 2139095040) {
                    if (sVar.C != va.a.M(sVar)) {
                        if (m.g(sVar.a(), m.a(fR1, false, false)) <= 0) {
                            return;
                        }
                    }
                    D1(qVarA1, k1Var, j9, sVar, i10, false, fR1);
                    return;
                }
                return;
            }
            return;
        }
        if (qVarA1 == null) {
            F1(k1Var, j9, sVar, i10, z10);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < j0() && fIntBitsToFloat2 < i0()) {
            C1(qVarA1, k1Var, j9, sVar, i10, z10);
            return;
        }
        float fR2 = i10 == 1 ? r1(j9, y1()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fR2) & Integer.MAX_VALUE) < 2139095040) {
            if (sVar.C != va.a.M(sVar)) {
                z11 = z10;
                if (m.g(sVar.a(), m.a(fR2, z11, false)) > 0) {
                }
                N1(qVarA1, k1Var, j9, sVar, i10, z11, fR2, z12);
            }
            z11 = z10;
            z12 = true;
            N1(qVarA1, k1Var, j9, sVar, i10, z11, fR2, z12);
        }
        z11 = z10;
        z12 = false;
        N1(qVarA1, k1Var, j9, sVar, i10, z11, fR2, z12);
    }

    @Override
    public final h2.c F(z2.a0 a0Var, boolean z10) {
        if (!z1().N) {
            y2.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!a0Var.A()) {
            y2.a.c("LayoutCoordinates " + a0Var + " is not attached!");
        }
        p1 p1VarU1 = U1(a0Var);
        p1VarU1.I1();
        p1 p1VarV1 = v1(p1VarU1);
        h2.a aVar = this.f2097d0;
        if (aVar == null) {
            aVar = new h2.a();
            this.f2097d0 = aVar;
        }
        aVar.f6540b = 0.0f;
        aVar.f6541c = 0.0f;
        aVar.f6542d = (int) (a0Var.p() >> 32);
        aVar.f6543e = (int) (a0Var.p() & 4294967295L);
        while (p1VarU1 != p1VarV1) {
            p1VarU1.Q1(aVar, z10, false);
            if (aVar.b()) {
                return h2.c.f6545e;
            }
            p1VarU1 = p1VarU1.S;
            kotlin.jvm.internal.m.b(p1VarU1);
        }
        o1(p1VarV1, aVar, z10);
        return new h2.c(aVar.f6540b, aVar.f6541c, aVar.f6542d, aVar.f6543e);
    }

    public void F1(k1 k1Var, long j9, s sVar, int i10, boolean z10) {
        p1 p1Var = this.R;
        if (p1Var != null) {
            p1Var.E1(k1Var, p1Var.w1(true, j9), sVar, i10, z10);
        }
    }

    @Override
    public final long G(long j9) {
        if (!z1().N) {
            y2.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((c3.z) p0.a(this.O)).s(d0(j9));
    }

    public final void G1() {
        z1 z1Var = this.f2107n0;
        if (z1Var != null) {
            z1Var.invalidate();
            return;
        }
        p1 p1Var = this.S;
        if (p1Var != null) {
            p1Var.G1();
        }
    }

    public final boolean H1() {
        if (this.f2107n0 != null && this.Y <= 0.0f) {
            return true;
        }
        p1 p1Var = this.S;
        if (p1Var != null) {
            return p1Var.H1();
        }
        return false;
    }

    public final void I1() {
        this.O.f2060h0.b();
    }

    public final void J1() {
        b2.q qVarZ1;
        boolean zG = q1.g(Cast.MAX_NAMESPACE_LENGTH);
        b2.q qVarB1 = B1(zG);
        if (qVarB1 == null || (qVarB1.A.D & Cast.MAX_NAMESPACE_LENGTH) == 0) {
            return;
        }
        z1.f fVarF = z1.q.f();
        u00.k kVarE = fVarF != null ? fVarF.e() : null;
        z1.f fVarK = z1.q.k(fVarF);
        try {
            if (!zG) {
                qVarZ1 = z1().E;
                if (qVarZ1 == null) {
                }
                z1.q.n(fVarF, fVarK, kVarE);
            }
            qVarZ1 = z1();
            for (b2.q qVarB2 = B1(zG); qVarB2 != null && (qVarB2.D & Cast.MAX_NAMESPACE_LENGTH) != 0; qVarB2 = qVarB2.F) {
                if ((qVarB2.C & Cast.MAX_NAMESPACE_LENGTH) != 0) {
                    ?? E = qVarB2;
                    ?? eVar = 0;
                    while (E != 0) {
                        if (E instanceof d1) {
                            ((d1) E).d(this.C);
                        } else if ((E.C & Cast.MAX_NAMESPACE_LENGTH) != 0 && (E instanceof l)) {
                            b2.q qVar = ((l) E).P;
                            int i10 = 0;
                            E = E;
                            eVar = eVar;
                            while (qVar != null) {
                                if ((qVar.C & Cast.MAX_NAMESPACE_LENGTH) != 0) {
                                    i10++;
                                    eVar = eVar;
                                    if (i10 == 1) {
                                        E = qVar;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new m1.e(0, new b2.q[16]);
                                        }
                                        if (E != 0) {
                                            eVar.b(E);
                                            E = 0;
                                        }
                                        eVar.b(qVar);
                                    }
                                }
                                qVar = qVar.F;
                                E = E;
                                eVar = eVar;
                            }
                            if (i10 == 1) {
                            }
                        }
                        E = m.e(eVar);
                    }
                }
                if (qVarB2 == qVarZ1) {
                    break;
                }
            }
            z1.q.n(fVarF, fVarK, kVarE);
        } catch (Throwable th2) {
            z1.q.n(fVarF, fVarK, kVarE);
            throw th2;
        }
    }

    public final void K1() {
        boolean zG = q1.g(4194304);
        b2.q qVarZ1 = z1();
        if (!zG && (qVarZ1 = qVarZ1.E) == null) {
            return;
        }
        for (b2.q qVarB1 = B1(zG); qVarB1 != null && (qVarB1.D & 4194304) != 0; qVarB1 = qVarB1.F) {
            if ((qVarB1.C & 4194304) != 0) {
                ?? E = qVarB1;
                ?? eVar = 0;
                while (E != 0) {
                    if (E instanceof x) {
                        ((x) E).c1(this);
                    } else if ((E.C & 4194304) != 0 && (E instanceof l)) {
                        b2.q qVar = ((l) E).P;
                        int i10 = 0;
                        E = E;
                        eVar = eVar;
                        while (qVar != null) {
                            if ((qVar.C & 4194304) != 0) {
                                i10++;
                                eVar = eVar;
                                if (i10 == 1) {
                                    E = qVar;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new m1.e(0, new b2.q[16]);
                                    }
                                    if (E != 0) {
                                        eVar.b(E);
                                        E = 0;
                                    }
                                    eVar.b(qVar);
                                }
                            }
                            qVar = qVar.F;
                            E = E;
                            eVar = eVar;
                        }
                        if (i10 == 1) {
                        }
                    }
                    E = m.e(eVar);
                }
            }
            if (qVarB1 == qVarZ1) {
                return;
            }
        }
    }

    public final void L1() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        this.T = true;
        this.f2105l0.invoke();
        R1();
        if (y3.j.b(this.f2095b0, 0L)) {
            return;
        }
        this.O.P(this);
    }

    public final void M1() {
        boolean zG = q1.g(1048576);
        b2.q qVarB1 = B1(zG);
        if (qVarB1 == null || (qVarB1.A.D & 1048576) == 0) {
            return;
        }
        b2.q qVarZ1 = z1();
        if (!zG && (qVarZ1 = qVarZ1.E) == null) {
            return;
        }
        for (b2.q qVarB2 = B1(zG); qVarB2 != null && (qVarB2.D & 1048576) != 0; qVarB2 = qVarB2.F) {
            if ((qVarB2.C & 1048576) != 0) {
                b2.q qVarE = qVarB2;
                m1.e eVar = null;
                while (qVarE != null) {
                    if ((qVarE.C & 1048576) != 0 && (qVarE instanceof l)) {
                        int i10 = 0;
                        for (b2.q qVar = ((l) qVarE).P; qVar != null; qVar = qVar.F) {
                            if ((qVar.C & 1048576) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    qVarE = qVar;
                                } else {
                                    if (eVar == null) {
                                        eVar = new m1.e(0, new b2.q[16]);
                                    }
                                    if (qVarE != null) {
                                        eVar.b(qVarE);
                                        qVarE = null;
                                    }
                                    eVar.b(qVar);
                                }
                            }
                        }
                        if (i10 == 1) {
                        }
                    }
                    qVarE = m.e(eVar);
                }
            }
            if (qVarB2 == qVarZ1) {
                return;
            }
        }
    }

    @Override
    public final u0 N0() {
        return this.R;
    }

    public final void N1(b2.q qVar, k1 k1Var, long j9, s sVar, int i10, boolean z10, float f3, boolean z11) {
        ?? E;
        if (qVar == null) {
            F1(k1Var, j9, sVar, i10, z10);
            return;
        }
        if (!k1Var.d(qVar)) {
            N1(m.d(qVar, k1Var.a()), k1Var, j9, sVar, i10, z10, f3, z11);
            return;
        }
        int i11 = i10;
        if (i11 == 3 || i11 == 4) {
            ?? eVar = 0;
            ?? r4 = qVar;
            while (r4 != 0) {
                if (r4 instanceof e2) {
                    long jP = ((e2) r4).p();
                    int i12 = (int) (j9 >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i12);
                    l0 l0Var = this.O;
                    y3.m mVar = l0Var.f2053a0;
                    int i13 = m2.f2083b;
                    long j10 = Long.MIN_VALUE & jP;
                    if (fIntBitsToFloat < (-((j10 == 0 || mVar == y3.m.A) ? j1.g(0, jP) : j1.g(2, jP)))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i12) >= j0() + ((j10 == 0 || l0Var.f2053a0 == y3.m.A) ? j1.g(2, jP) : j1.g(0, jP))) {
                        break;
                    }
                    int i14 = (int) (j9 & 4294967295L);
                    if (Float.intBitsToFloat(i14) < (-j1.g(1, jP))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i14) >= j1.g(3, jP) + i0()) {
                        break;
                    }
                    n1 n1Var = new n1(this, qVar, k1Var, j9, sVar, i11, z10, f3, z11);
                    u.y yVar = sVar.B;
                    u.d0 d0Var = sVar.A;
                    if (sVar.C == va.a.M(sVar)) {
                        int i15 = sVar.C;
                        sVar.c(i15 + 1, d0Var.f14838b);
                        sVar.C++;
                        d0Var.a(qVar);
                        yVar.a(m.a(0.0f, z10, true));
                        n1Var.invoke();
                        sVar.C = i15;
                        return;
                    }
                    long jA = sVar.a();
                    int i16 = sVar.C;
                    if (!m.p(jA)) {
                        if (m.l(jA) > 0.0f) {
                            int i17 = sVar.C;
                            sVar.c(i17 + 1, d0Var.f14838b);
                            sVar.C++;
                            d0Var.a(qVar);
                            yVar.a(m.a(0.0f, z10, true));
                            n1Var.invoke();
                            sVar.C = i17;
                            return;
                        }
                        return;
                    }
                    int iM = va.a.M(sVar);
                    sVar.C = iM;
                    sVar.c(iM + 1, d0Var.f14838b);
                    sVar.C++;
                    d0Var.a(qVar);
                    yVar.a(m.a(0.0f, z10, true));
                    n1Var.invoke();
                    sVar.C = iM;
                    if (m.l(sVar.a()) < 0.0f) {
                        sVar.c(i16 + 1, sVar.C + 1);
                    }
                    sVar.C = i16;
                    return;
                }
                if ((r4.C & 16) == 0 || !(r4 instanceof l)) {
                    E = m.e(eVar);
                } else {
                    b2.q qVar2 = ((l) r4).P;
                    int i18 = 0;
                    E = r4;
                    eVar = eVar;
                    while (qVar2 != null) {
                        if ((qVar2.C & 16) != 0) {
                            i18++;
                            eVar = eVar;
                            if (i18 == 1) {
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
                    if (i18 != 1) {
                        E = m.e(eVar);
                    }
                }
                i11 = i10;
                r4 = E;
                eVar = eVar;
            }
        }
        if (z11) {
            D1(qVar, k1Var, j9, sVar, i10, z10, f3);
        } else {
            T1(qVar, k1Var, j9, sVar, i10, z10, f3);
        }
    }

    @Override
    public final z2.a0 O0() {
        return this;
    }

    public abstract void O1(i2.s sVar, l2.b bVar);

    public final void P1(long j9, float f3, u00.k kVar, l2.b bVar) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        l0 l0Var = this.O;
        if (bVar != null) {
            if (kVar != null) {
                y2.a.a("both ways to create layers shouldn't be used together");
            }
            if (this.f2108o0 != bVar) {
                this.f2108o0 = null;
                Y1(false, null);
                this.f2108o0 = bVar;
            }
            if (this.f2107n0 == null) {
                Owner ownerA = p0.a(l0Var);
                l1 l1Var = this.f2104k0;
                if (l1Var == null) {
                    l1 l1Var2 = new l1(this, new m1(this, 0), 0);
                    this.f2104k0 = l1Var2;
                    l1Var = l1Var2;
                }
                m1 m1Var = this.f2105l0;
                z1 z1VarI = ((c3.z) ownerA).i(l1Var, m1Var, bVar);
                c3.v1 v1Var = (c3.v1) z1VarI;
                v1Var.e(this.C);
                v1Var.d(j9);
                this.f2107n0 = z1VarI;
                l0Var.f2063k0 = true;
                m1Var.invoke();
            }
        } else {
            if (this.f2108o0 != null) {
                this.f2108o0 = null;
                Y1(false, null);
            }
            Y1(false, kVar);
        }
        if (!y3.j.b(this.f2095b0, j9)) {
            ((c3.z) p0.a(l0Var)).M(-4.0f);
            this.f2095b0 = j9;
            z1 z1Var = this.f2107n0;
            if (z1Var != null) {
                ((c3.v1) z1Var).d(j9);
            } else {
                p1 p1Var = this.S;
                if (p1Var != null) {
                    p1Var.G1();
                }
            }
            l0Var.P(this);
            u0.k1(this);
            Owner owner = l0Var.O;
            if (owner != null) {
                ((c3.z) owner).y(l0Var);
            }
        }
        this.f2096c0 = f3;
        if (this == ((p1) l0Var.f2059g0.E)) {
            ((c3.z) p0.a(l0Var)).getRectManager().e(l0Var);
        }
        if (this.K) {
            return;
        }
        H0(Z0());
    }

    public final void Q1(h2.a aVar, boolean z10, boolean z11) {
        long jFloatToRawIntBits;
        z1 z1Var = this.f2107n0;
        if (z1Var != null) {
            if (this.U) {
                if (z11) {
                    long jY1 = y1();
                    float f3 = aVar.f6540b;
                    float f10 = aVar.f6541c;
                    if (aVar.f6542d >= 0.0f) {
                        long j9 = this.C;
                        if (f3 > ((int) (j9 >> 32)) || aVar.f6543e < 0.0f || f10 > ((int) (j9 & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jY1 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jY1 & 4294967295L));
                            float f11 = (fIntBitsToFloat - (aVar.f6542d - aVar.f6540b)) / 2.0f;
                            if (f11 > 0.0f) {
                                f3 -= f11;
                            } else {
                                float f12 = (-fIntBitsToFloat) / 2.0f;
                                if (f3 < f12) {
                                    f3 = f12;
                                }
                            }
                            float f13 = (fIntBitsToFloat2 - (aVar.f6543e - aVar.f6541c)) / 2.0f;
                            if (f13 > 0.0f) {
                                f10 -= f13;
                            } else {
                                float f14 = (-fIntBitsToFloat2) / 2.0f;
                                if (f10 < f14) {
                                    f10 = f14;
                                }
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
                        }
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    long j10 = this.C;
                    float f15 = (int) (j10 >> 32);
                    int i10 = (int) (jY1 >> 32);
                    float f16 = (int) (j10 & 4294967295L);
                    int i11 = (int) (jY1 & 4294967295L);
                    aVar.a(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i10) + f15, Math.max(f15, Float.intBitsToFloat(i10) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i11) + f16, Math.max(f16, Float.intBitsToFloat(i11) + fIntBitsToFloat4)));
                } else if (z10) {
                    long j11 = this.C;
                    aVar.a(0.0f, 0.0f, (int) (j11 >> 32), (int) (j11 & 4294967295L));
                }
                if (aVar.b()) {
                    return;
                }
            }
            c3.v1 v1Var = (c3.v1) z1Var;
            float[] fArrB = v1Var.b();
            if (!v1Var.S) {
                if (fArrB == null) {
                    aVar.f6540b = 0.0f;
                    aVar.f6541c = 0.0f;
                    aVar.f6542d = 0.0f;
                    aVar.f6543e = 0.0f;
                } else {
                    i2.h0.c(fArrB, aVar);
                }
            }
        }
        long j12 = this.f2095b0;
        float f17 = (int) (j12 >> 32);
        aVar.f6540b += f17;
        aVar.f6542d += f17;
        float f18 = (int) (j12 & 4294967295L);
        aVar.f6541c += f18;
        aVar.f6543e += f18;
    }

    public final void R1() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        if (this.f2107n0 != null) {
            if (this.f2108o0 != null) {
                this.f2108o0 = null;
            }
            Y1(false, null);
            this.O.W(false);
        }
    }

    public final void S1(z2.x0 x0Var) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        p1 p1Var;
        z2.x0 x0Var2 = this.Z;
        if (x0Var != x0Var2) {
            this.Z = x0Var;
            l0 l0Var = this.O;
            int i10 = 0;
            if (x0Var2 == null || x0Var.d() != x0Var2.d() || x0Var.c() != x0Var2.c()) {
                int iD = x0Var.d();
                int iC = x0Var.c();
                z1 z1Var = this.f2107n0;
                if (z1Var != null) {
                    ((c3.v1) z1Var).e((((long) iD) << 32) | (((long) iC) & 4294967295L));
                } else if (l0Var.K() && (p1Var = this.S) != null) {
                    p1Var.G1();
                }
                v0((((long) iC) & 4294967295L) | (((long) iD) << 32));
                if (this.V != null) {
                    Z1(false);
                }
                boolean zG = q1.g(4);
                b2.q qVarZ1 = z1();
                if (zG || (qVarZ1 = qVarZ1.E) != null) {
                    for (b2.q qVarB1 = B1(zG); qVarB1 != null && (qVarB1.D & 4) != 0; qVarB1 = qVarB1.F) {
                        if ((qVarB1.C & 4) != 0) {
                            ?? E = qVarB1;
                            ?? eVar = 0;
                            while (E != 0) {
                                if (E instanceof o) {
                                    ((o) E).e0();
                                } else if ((E.C & 4) != 0 && (E instanceof l)) {
                                    b2.q qVar = ((l) E).P;
                                    int i11 = 0;
                                    E = E;
                                    eVar = eVar;
                                    while (qVar != null) {
                                        if ((qVar.C & 4) != 0) {
                                            i11++;
                                            eVar = eVar;
                                            if (i11 == 1) {
                                                E = qVar;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new m1.e(0, new b2.q[16]);
                                                }
                                                if (E != 0) {
                                                    eVar.b(E);
                                                    E = 0;
                                                }
                                                eVar.b(qVar);
                                            }
                                        }
                                        qVar = qVar.F;
                                        E = E;
                                        eVar = eVar;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                E = m.e(eVar);
                            }
                        }
                        if (qVarB1 == qVarZ1) {
                            break;
                        }
                    }
                }
                Owner owner = l0Var.O;
                if (owner != null) {
                    ((c3.z) owner).y(l0Var);
                }
                l0Var.P(this);
            }
            u.c0 c0Var = this.f2094a0;
            if ((c0Var == null || c0Var.f14835e == 0) && x0Var.a().isEmpty()) {
                return;
            }
            u.c0 c0Var2 = this.f2094a0;
            Map mapA = x0Var.a();
            if (c0Var2 != null && c0Var2.f14835e == mapA.size()) {
                Object[] objArr = c0Var2.f14832b;
                int[] iArr = c0Var2.f14833c;
                long[] jArr = c0Var2.f14831a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i12 = 0;
                loop0: while (true) {
                    long j9 = jArr[i12];
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = i10; i14 < i13; i14++) {
                            if ((255 & j9) < 128) {
                                int i15 = (i12 << 3) + i14;
                                Object obj = objArr[i15];
                                int i16 = iArr[i15];
                                Integer num = (Integer) mapA.get((z2.a) obj);
                                if (num == null || num.intValue() != i16) {
                                    break loop0;
                                }
                            }
                            j9 >>= 8;
                        }
                        if (i13 != 8) {
                            return;
                        }
                    }
                    if (i12 == length) {
                        return;
                    }
                    i12++;
                    i10 = 0;
                }
            }
            l0Var.f2060h0.f2122p.X.f();
            u.c0 c0Var3 = this.f2094a0;
            if (c0Var3 == null) {
                u.c0 c0Var4 = u.n0.f14879a;
                c0Var3 = new u.c0();
                this.f2094a0 = c0Var3;
            }
            c0Var3.a();
            for (Map.Entry entry : x0Var.a().entrySet()) {
                c0Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    @Override
    public final long T(long j9) {
        if (!z1().N) {
            y2.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        z2.a0 a0VarI = z2.d0.i(this);
        c3.z zVar = (c3.z) p0.a(this.O);
        zVar.C();
        return o(a0VarI, h2.b.e(i2.h0.b(zVar.D0, j9), a0VarI.d0(0L)), true);
    }

    public final void T1(b2.q qVar, k1 k1Var, long j9, s sVar, int i10, boolean z10, float f3) {
        int i11;
        if (qVar == null) {
            F1(k1Var, j9, sVar, i10, z10);
            return;
        }
        if (!k1Var.d(qVar)) {
            T1(m.d(qVar, k1Var.a()), k1Var, j9, sVar, i10, z10, f3);
            return;
        }
        if (!k1Var.c(qVar)) {
            N1(m.d(qVar, k1Var.a()), k1Var, j9, sVar, i10, z10, f3, false);
            return;
        }
        o1 o1Var = new o1(this, qVar, k1Var, j9, sVar, i10, z10, f3);
        u.y yVar = sVar.B;
        u.d0 d0Var = sVar.A;
        if (sVar.C != va.a.M(sVar)) {
            long jA = sVar.a();
            int i12 = sVar.C;
            int iM = va.a.M(sVar);
            sVar.C = iM;
            sVar.c(iM + 1, d0Var.f14838b);
            sVar.C++;
            d0Var.a(qVar);
            yVar.a(m.a(f3, z10, false));
            o1Var.invoke();
            sVar.C = iM;
            long jA2 = sVar.a();
            if (sVar.C + 1 >= va.a.M(sVar) || m.g(jA, jA2) <= 0) {
                sVar.c(sVar.C + 1, d0Var.f14838b);
            } else {
                sVar.c(i12 + 1, m.p(jA2) ? sVar.C + 2 : sVar.C + 1);
            }
            sVar.C = i12;
            return;
        }
        int i13 = sVar.C;
        int i14 = i13 + 1;
        sVar.c(i14, d0Var.f14838b);
        sVar.C++;
        d0Var.a(qVar);
        yVar.a(m.a(f3, z10, false));
        o1Var.invoke();
        sVar.C = i13;
        if (i14 == va.a.M(sVar) || m.p(sVar.a())) {
            int i15 = sVar.C;
            int i16 = i15 + 1;
            d0Var.k(i16);
            if (i16 < 0 || i16 >= (i11 = yVar.f14912b)) {
                v.a.d("Index must be between 0 and size");
                throw null;
            }
            long[] jArr = yVar.f14911a;
            long j10 = jArr[i16];
            if (i16 != i11 - 1) {
                h00.n.t0(jArr, jArr, i16, i15 + 2, i11);
            }
            yVar.f14912b--;
        }
    }

    @Override
    public final Object U() {
        l0 l0Var = this.O;
        if (!l0Var.f2059g0.j(64)) {
            return null;
        }
        z1();
        Object objF = null;
        for (b2.q qVar = (l2) l0Var.f2059g0.F; qVar != null; qVar = qVar.E) {
            if ((qVar.C & 64) != 0) {
                ?? E = qVar;
                ?? eVar = 0;
                while (E != 0) {
                    if (E instanceof c2) {
                        objF = ((c2) E).f(l0Var.Z, objF);
                    } else if ((E.C & 64) != 0 && (E instanceof l)) {
                        b2.q qVar2 = ((l) E).P;
                        int i10 = 0;
                        E = E;
                        eVar = eVar;
                        while (qVar2 != null) {
                            if ((qVar2.C & 64) != 0) {
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
                    E = m.e(eVar);
                }
            }
        }
        return objF;
    }

    @Override
    public final long V(z2.a0 a0Var, long j9) {
        return o(a0Var, j9, true);
    }

    @Override
    public final boolean V0() {
        return this.Z != null;
    }

    public final h2.c V1() {
        if (z1().N) {
            z2.a0 a0VarI = z2.d0.i(this);
            h2.a aVar = this.f2097d0;
            if (aVar == null) {
                aVar = new h2.a();
                this.f2097d0 = aVar;
            }
            long jQ1 = q1(y1());
            int i10 = (int) (jQ1 >> 32);
            aVar.f6540b = -Float.intBitsToFloat(i10);
            int i11 = (int) (jQ1 & 4294967295L);
            aVar.f6541c = -Float.intBitsToFloat(i11);
            aVar.f6542d = Float.intBitsToFloat(i10) + j0();
            aVar.f6543e = Float.intBitsToFloat(i11) + i0();
            while (this != a0VarI) {
                this.Q1(aVar, false, true);
                if (!aVar.b()) {
                    this = this.S;
                    kotlin.jvm.internal.m.b(this);
                }
            }
            return new h2.c(aVar.f6540b, aVar.f6541c, aVar.f6542d, aVar.f6543e);
        }
        return h2.c.f6545e;
    }

    @Override
    public final z2.a0 W() {
        boolean z10 = z1().N;
        l0 l0Var = this.O;
        if (!z10) {
            StringBuilder sb2 = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (l0 l0VarX = l0Var; l0VarX != null; l0VarX = l0VarX.x()) {
                sb2.append("\n|");
                sb2.append(l0VarX);
                sb2.append(" isAttached=");
                sb2.append(l0VarX.J());
                sb2.append(" modifier=");
                sb2.append(l0VarX.f2064l0);
                sb2.append(" tail=");
                sb2.append(z1());
            }
            y2.a.c(sb2.toString());
        }
        I1();
        return ((p1) l0Var.f2059g0.E).S;
    }

    @Override
    public final l0 W0() {
        return this.O;
    }

    public final void W1(p1 p1Var, float[] fArr) {
        float[] fArrA;
        if (kotlin.jvm.internal.m.a(p1Var, this)) {
            return;
        }
        p1 p1Var2 = this.S;
        kotlin.jvm.internal.m.b(p1Var2);
        p1Var2.W1(p1Var, fArr);
        if (!y3.j.b(this.f2095b0, 0L)) {
            float[] fArr2 = f2091r0;
            i2.h0.d(fArr2);
            long j9 = this.f2095b0;
            i2.h0.f(fArr2, -((int) (j9 >> 32)), -((int) (j9 & 4294967295L)));
            i2.h0.e(fArr, fArr2);
        }
        z1 z1Var = this.f2107n0;
        if (z1Var == null || (fArrA = ((c3.v1) z1Var).a()) == null) {
            return;
        }
        i2.h0.e(fArr, fArrA);
    }

    public final void X1(p1 p1Var, float[] fArr) {
        while (!this.equals(p1Var)) {
            z1 z1Var = this.f2107n0;
            if (z1Var != null) {
                i2.h0.e(fArr, ((c3.v1) z1Var).b());
            }
            long j9 = this.f2095b0;
            if (!y3.j.b(j9, 0L)) {
                float[] fArr2 = f2091r0;
                i2.h0.d(fArr2);
                i2.h0.f(fArr2, (int) (j9 >> 32), (int) (j9 & 4294967295L));
                i2.h0.e(fArr, fArr2);
            }
            this = this.S;
            kotlin.jvm.internal.m.b(this);
        }
    }

    public final void Y1(boolean z10, u00.k kVar) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        Owner owner;
        m1.e eVar;
        Reference referencePoll;
        if (kVar != null && this.f2108o0 != null) {
            y2.a.a("layerBlock can't be provided when explicitLayer is provided");
        }
        l0 l0Var = this.O;
        boolean z11 = (!z10 && this.V == kVar && kotlin.jvm.internal.m.a(this.W, l0Var.Z) && this.X == l0Var.f2053a0) ? false : true;
        this.W = l0Var.Z;
        this.X = l0Var.f2053a0;
        boolean zJ = l0Var.J();
        m1 m1Var = this.f2105l0;
        if (zJ && kVar != null) {
            this.V = kVar;
            if (this.f2107n0 != null) {
                if (z11) {
                    Z1(true);
                    return;
                }
                return;
            }
            Owner ownerA = p0.a(l0Var);
            l1 l1Var = this.f2104k0;
            if (l1Var == null) {
                l1 l1Var2 = new l1(this, new m1(this, 0), 0);
                this.f2104k0 = l1Var2;
                l1Var = l1Var2;
            }
            z1 z1VarI = ((c3.z) ownerA).i(l1Var, m1Var, null);
            c3.v1 v1Var = (c3.v1) z1VarI;
            v1Var.e(this.C);
            v1Var.d(this.f2095b0);
            this.f2107n0 = z1VarI;
            Z1(true);
            l0Var.f2063k0 = true;
            m1Var.invoke();
            return;
        }
        this.V = null;
        z1 z1Var = this.f2107n0;
        if (z1Var != null) {
            c3.v1 v1Var2 = (c3.v1) z1Var;
            c3.z zVar = v1Var2.C;
            if (!i2.b0.s(v1Var2.b())) {
                l0Var.P(this);
            }
            v1Var2.D = null;
            v1Var2.E = null;
            v1Var2.G = true;
            if (v1Var2.J) {
                v1Var2.J = false;
                zVar.w(v1Var2, false);
            }
            i2.y yVar = v1Var2.B;
            if (yVar != null) {
                yVar.a(v1Var2.A);
                a1.u0 u0Var = zVar.X0;
                do {
                    ReferenceQueue referenceQueue = (ReferenceQueue) u0Var.C;
                    eVar = (m1.e) u0Var.B;
                    referencePoll = referenceQueue.poll();
                    if (referencePoll != null) {
                        eVar.j(referencePoll);
                    }
                } while (referencePoll != null);
                eVar.b(new WeakReference(v1Var2, (ReferenceQueue) u0Var.C));
                zVar.f2797h0.j(v1Var2);
            }
            this.f2107n0 = null;
            l0Var.f2063k0 = true;
            m1Var.invoke();
            if (z1().N && l0Var.K() && (owner = l0Var.O) != null) {
                ((c3.z) owner).y(l0Var);
            }
        }
        this.f2106m0 = false;
    }

    @Override
    public final z2.x0 Z0() {
        z2.x0 x0Var = this.Z;
        if (x0Var != null) {
            return x0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    public final void Z1(boolean z10) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        c3.z zVar;
        long j9;
        char c10;
        int i10;
        c3.z zVar2;
        boolean z11;
        ViewParent parent;
        c3.z zVar3;
        boolean z12;
        a1.u0 u0Var;
        Owner owner;
        i2.l0 l0Var;
        l2.b bVar;
        i2.k0 k0Var;
        i2.g gVar;
        int i11;
        int i12;
        i2.m mVar;
        l2.c cVar;
        Paint paint;
        BlendModeColorFilter blendModeColorFilter;
        u00.a aVar;
        if (this.f2108o0 != null) {
            return;
        }
        z1 z1Var = this.f2107n0;
        if (z1Var == null) {
            if (this.V == null) {
                return;
            }
            y2.a.c("null layer with a non-null layerBlock");
            return;
        }
        u00.k kVar = this.V;
        if (kVar == null) {
            throw a1.b.u("updateLayerParameters requires a non-null layerBlock");
        }
        i2.q0 q0Var = f2089p0;
        q0Var.a();
        l0 l0Var2 = this.O;
        q0Var.Q = l0Var2.Z;
        q0Var.R = l0Var2.f2053a0;
        q0Var.P = kh.n.m0(this.C);
        ((c3.z) p0.a(l0Var2)).getSnapshotObserver().f2003a.d(this, e.E, new k0(kVar, this, 1));
        w wVar = this.f2098e0;
        if (wVar == null) {
            wVar = new w();
            this.f2098e0 = wVar;
        }
        w wVar2 = f2090q0;
        wVar2.getClass();
        wVar2.f2135a = wVar.f2135a;
        wVar2.f2136b = wVar.f2136b;
        wVar2.f2137c = wVar.f2137c;
        wVar2.f2138d = wVar.f2138d;
        wVar2.f2139e = wVar.f2139e;
        wVar2.f2140f = wVar.f2140f;
        wVar2.f2141g = wVar.f2141g;
        wVar2.f2142h = wVar.f2142h;
        wVar2.f2143i = wVar.f2143i;
        float f3 = q0Var.B;
        wVar.f2135a = f3;
        wVar.f2136b = q0Var.C;
        wVar.f2137c = q0Var.E;
        wVar.f2138d = q0Var.F;
        wVar.f2139e = 0.0f;
        wVar.f2140f = 0.0f;
        wVar.f2141g = q0Var.J;
        wVar.f2142h = q0Var.K;
        long j10 = q0Var.L;
        wVar.f2143i = j10;
        c3.v1 v1Var = (c3.v1) z1Var;
        c3.z zVar4 = v1Var.C;
        int i13 = q0Var.A | v1Var.N;
        v1Var.L = q0Var.R;
        v1Var.K = q0Var.Q;
        int i14 = i13 & 4096;
        if (i14 != 0) {
            v1Var.O = j10;
        }
        if ((i13 & 1) != 0) {
            l2.c cVar2 = v1Var.A.f9973a;
            if (cVar2.f10005k != f3) {
                cVar2.f10005k = f3;
                cVar2.f9997c.setScaleX(f3);
            }
        }
        if ((i13 & 2) != 0) {
            l2.b bVar2 = v1Var.A;
            float f10 = q0Var.C;
            l2.c cVar3 = bVar2.f9973a;
            if (cVar3.l != f10) {
                cVar3.l = f10;
                cVar3.f9997c.setScaleY(f10);
            }
        }
        if ((i13 & 4) != 0) {
            v1Var.A.f(q0Var.D);
        }
        if ((i13 & 8) != 0) {
            l2.b bVar3 = v1Var.A;
            float f11 = q0Var.E;
            l2.c cVar4 = bVar3.f9973a;
            if (cVar4.m != f11) {
                cVar4.m = f11;
                cVar4.f9997c.setTranslationX(f11);
            }
        }
        if ((i13 & 16) != 0) {
            l2.b bVar4 = v1Var.A;
            float f12 = q0Var.F;
            l2.c cVar5 = bVar4.f9973a;
            if (cVar5.f10006n != f12) {
                cVar5.f10006n = f12;
                cVar5.f9997c.setTranslationY(f12);
            }
        }
        if ((i13 & 32) != 0) {
            l2.b bVar5 = v1Var.A;
            float f13 = q0Var.G;
            l2.c cVar6 = bVar5.f9973a;
            if (cVar6.f10007o != f13) {
                cVar6.f10007o = f13;
                cVar6.f9997c.setElevation(f13);
                bVar5.f9979g = true;
                bVar5.a();
            }
            if (q0Var.G > 0.0f && !v1Var.T && (aVar = v1Var.E) != null) {
                aVar.invoke();
            }
        }
        if ((i13 & 64) != 0) {
            l2.b bVar6 = v1Var.A;
            long j11 = q0Var.H;
            l2.c cVar7 = bVar6.f9973a;
            if (!i2.t.c(j11, cVar7.f10008p)) {
                cVar7.f10008p = j11;
                cVar7.f9997c.setAmbientShadowColor(i2.b0.C(j11));
            }
        }
        if ((i13 & Cast.MAX_NAMESPACE_LENGTH) != 0) {
            l2.b bVar7 = v1Var.A;
            long j12 = q0Var.I;
            l2.c cVar8 = bVar7.f9973a;
            if (!i2.t.c(j12, cVar8.f10009q)) {
                cVar8.f10009q = j12;
                cVar8.f9997c.setSpotShadowColor(i2.b0.C(j12));
            }
        }
        if ((i13 & 1024) != 0) {
            l2.b bVar8 = v1Var.A;
            float f14 = q0Var.J;
            l2.c cVar9 = bVar8.f9973a;
            if (cVar9.f10010r != f14) {
                cVar9.f10010r = f14;
                cVar9.f9997c.setRotationZ(f14);
            }
        }
        if ((i13 & 256) != 0) {
            l2.c cVar10 = v1Var.A.f9973a;
        }
        if ((i13 & 512) != 0) {
            l2.c cVar11 = v1Var.A.f9973a;
        }
        if ((i13 & 2048) != 0) {
            l2.b bVar9 = v1Var.A;
            float f15 = q0Var.K;
            l2.c cVar12 = bVar9.f9973a;
            if (cVar12.f10011s != f15) {
                cVar12.f10011s = f15;
                cVar12.f9997c.setCameraDistance(f15);
            }
        }
        long j13 = 9205357640488583168L;
        if (i14 != 0) {
            j9 = 4294967295L;
            zVar = zVar4;
            if (i2.w0.a(v1Var.O, i2.w0.f7175b)) {
                l2.b bVar10 = v1Var.A;
                if (!h2.b.b(bVar10.f9992v, 9205357640488583168L)) {
                    bVar10.f9992v = 9205357640488583168L;
                    bVar10.f9973a.f9997c.resetPivot();
                }
                c10 = ' ';
            } else {
                l2.b bVar11 = v1Var.A;
                j13 = 9205357640488583168L;
                c10 = ' ';
                i10 = i13;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2.w0.c(v1Var.O) * ((int) (v1Var.F & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(i2.w0.b(v1Var.O) * ((int) (v1Var.F >> 32)))) << 32);
                if (!h2.b.b(bVar11.f9992v, jFloatToRawIntBits)) {
                    bVar11.f9992v = jFloatToRawIntBits;
                    RenderNode renderNode = bVar11.f9973a.f9997c;
                    if ((9223372034707292159L & jFloatToRawIntBits) == 9205357640488583168L) {
                        renderNode.resetPivot();
                    } else {
                        renderNode.setPivotX(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
                        renderNode.setPivotY(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                    }
                }
            }
            if ((i10 & 16384) != 0) {
                v1Var.A.h(q0Var.N);
            }
            if ((131072 & i10) != 0) {
                v1Var.A.j(q0Var.S);
            }
            if ((262144 & i10) != 0) {
                l2.b bVar12 = v1Var.A;
                mVar = q0Var.T;
                cVar = bVar12.f9973a;
                if (!kotlin.jvm.internal.m.a(cVar.f10004j, mVar)) {
                    cVar.f10004j = mVar;
                    paint = cVar.f9999e;
                    if (paint == null) {
                        paint = new Paint();
                        cVar.f9999e = paint;
                    }
                    if (mVar != null) {
                        blendModeColorFilter = mVar.f7144a;
                    } else {
                        blendModeColorFilter = null;
                    }
                    paint.setColorFilter(blendModeColorFilter);
                    cVar.d();
                }
            }
            if ((524288 & i10) != 0) {
                v1Var.A.g(q0Var.U);
            }
            if ((32768 & i10) != 0) {
                l2.b bVar13 = v1Var.A;
                i11 = q0Var.O;
                if (i11 == 0) {
                    i12 = 0;
                } else if (i11 == 1) {
                    i12 = 1;
                } else {
                    i12 = 2;
                    if (i11 != 2) {
                        throw new IllegalStateException("Not supported composition strategy");
                    }
                }
                bVar13.i(i12);
            }
            if ((i10 & 7963) != 0) {
                v1Var.Q = true;
                v1Var.R = true;
            }
            if (kotlin.jvm.internal.m.a(v1Var.P, q0Var.V)) {
                zVar2 = zVar;
                z11 = false;
            } else {
                l0Var = q0Var.V;
                v1Var.P = l0Var;
                if (l0Var == null) {
                    zVar2 = zVar;
                } else {
                    bVar = v1Var.A;
                    if (l0Var instanceof i2.j0) {
                        h2.c cVar13 = ((i2.j0) l0Var).f7140a;
                        float f16 = cVar13.f6546a;
                        float f17 = cVar13.f6547b;
                        zVar2 = zVar;
                        bVar.k((((long) Float.floatToRawIntBits(f16)) << c10) | (((long) Float.floatToRawIntBits(f17)) & j9), (((long) Float.floatToRawIntBits(cVar13.f6548c - f16)) << c10) | (((long) Float.floatToRawIntBits(cVar13.f6549d - f17)) & j9), 0.0f);
                    } else {
                        zVar2 = zVar;
                        if (l0Var instanceof i2.i0) {
                            i2.g gVar2 = ((i2.i0) l0Var).f7139a;
                            bVar.f9983k = null;
                            bVar.f9981i = j13;
                            bVar.f9980h = 0L;
                            bVar.f9982j = 0.0f;
                            bVar.f9979g = true;
                            bVar.f9984n = false;
                            bVar.l = gVar2;
                            bVar.a();
                        } else {
                            if (l0Var instanceof i2.k0) {
                                throw new NoWhenBranchMatchedException();
                            }
                            k0Var = (i2.k0) l0Var;
                            gVar = k0Var.f7143b;
                            if (gVar != null) {
                                bVar.f9983k = null;
                                bVar.f9981i = 9205357640488583168L;
                                bVar.f9980h = 0L;
                                bVar.f9982j = 0.0f;
                                bVar.f9979g = true;
                                bVar.f9984n = false;
                                bVar.l = gVar;
                                bVar.a();
                            } else {
                                h2.d dVar = k0Var.f7142a;
                                bVar.k((((long) Float.floatToRawIntBits(dVar.f6550a)) << c10) | (((long) Float.floatToRawIntBits(dVar.f6551b)) & j9), (((long) Float.floatToRawIntBits(dVar.b())) << c10) | (((long) Float.floatToRawIntBits(dVar.a())) & j9), Float.intBitsToFloat((int) (dVar.f6557h >> c10)));
                            }
                        }
                    }
                }
                z11 = true;
            }
            v1Var.N = q0Var.A;
            if (i10 == 0 || z11) {
                parent = zVar2.getParent();
                if (parent != null) {
                    zVar3 = zVar2;
                    parent.onDescendantInvalidated(zVar3, zVar3);
                } else {
                    zVar3 = zVar2;
                }
                if (c3.z.n()) {
                    zVar3.M(0.0f);
                }
            }
            boolean z13 = this.U;
            this.U = q0Var.N;
            this.Y = q0Var.D;
            if (wVar2.f2135a != wVar.f2135a && wVar2.f2136b == wVar.f2136b && wVar2.f2137c == wVar.f2137c && wVar2.f2138d == wVar.f2138d && wVar2.f2139e == wVar.f2139e && wVar2.f2140f == wVar.f2140f && wVar2.f2141g == wVar.f2141g && wVar2.f2142h == wVar.f2142h && i2.w0.a(wVar2.f2143i, wVar.f2143i)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10 && ((!z12 || z13 != this.U) && (owner = l0Var2.O) != null)) {
                ((c3.z) owner).y(l0Var2);
            }
            if (z12) {
            }
            l0Var2.P(this);
            if (l0Var2.f2069q0 > 0) {
                c3.z zVar5 = (c3.z) p0.a(l0Var2);
                u0Var = zVar5.f2819y0.f1993e;
                u0Var.getClass();
                if (l0Var2.f2069q0 > 0) {
                    ((m1.e) u0Var.B).b(l0Var2);
                    l0Var2.f2068p0 = true;
                }
                zVar5.F(null);
            }
        }
        zVar = zVar4;
        j9 = 4294967295L;
        c10 = ' ';
        i10 = i13;
        if ((i10 & 16384) != 0) {
            v1Var.A.h(q0Var.N);
        }
        if ((131072 & i10) != 0) {
            v1Var.A.j(q0Var.S);
        }
        if ((262144 & i10) != 0) {
            l2.b bVar14 = v1Var.A;
            mVar = q0Var.T;
            cVar = bVar14.f9973a;
            if (!kotlin.jvm.internal.m.a(cVar.f10004j, mVar)) {
                cVar.f10004j = mVar;
                paint = cVar.f9999e;
                if (paint == null) {
                    paint = new Paint();
                    cVar.f9999e = paint;
                }
                if (mVar != null) {
                    blendModeColorFilter = mVar.f7144a;
                } else {
                    blendModeColorFilter = null;
                }
                paint.setColorFilter(blendModeColorFilter);
                cVar.d();
            }
        }
        if ((524288 & i10) != 0) {
            v1Var.A.g(q0Var.U);
        }
        if ((32768 & i10) != 0) {
            l2.b bVar15 = v1Var.A;
            i11 = q0Var.O;
            if (i11 == 0) {
                i12 = 0;
            } else if (i11 == 1) {
                i12 = 1;
            } else {
                i12 = 2;
                if (i11 != 2) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            bVar15.i(i12);
        }
        if ((i10 & 7963) != 0) {
            v1Var.Q = true;
            v1Var.R = true;
        }
        if (kotlin.jvm.internal.m.a(v1Var.P, q0Var.V)) {
            l0Var = q0Var.V;
            v1Var.P = l0Var;
            if (l0Var == null) {
                zVar2 = zVar;
            } else {
                bVar = v1Var.A;
                if (l0Var instanceof i2.j0) {
                    h2.c cVar14 = ((i2.j0) l0Var).f7140a;
                    float f18 = cVar14.f6546a;
                    float f19 = cVar14.f6547b;
                    zVar2 = zVar;
                    bVar.k((((long) Float.floatToRawIntBits(f18)) << c10) | (((long) Float.floatToRawIntBits(f19)) & j9), (((long) Float.floatToRawIntBits(cVar14.f6548c - f18)) << c10) | (((long) Float.floatToRawIntBits(cVar14.f6549d - f19)) & j9), 0.0f);
                } else {
                    zVar2 = zVar;
                    if (l0Var instanceof i2.i0) {
                        i2.g gVar3 = ((i2.i0) l0Var).f7139a;
                        bVar.f9983k = null;
                        bVar.f9981i = j13;
                        bVar.f9980h = 0L;
                        bVar.f9982j = 0.0f;
                        bVar.f9979g = true;
                        bVar.f9984n = false;
                        bVar.l = gVar3;
                        bVar.a();
                    } else {
                        if (l0Var instanceof i2.k0) {
                            throw new NoWhenBranchMatchedException();
                        }
                        k0Var = (i2.k0) l0Var;
                        gVar = k0Var.f7143b;
                        if (gVar != null) {
                            bVar.f9983k = null;
                            bVar.f9981i = 9205357640488583168L;
                            bVar.f9980h = 0L;
                            bVar.f9982j = 0.0f;
                            bVar.f9979g = true;
                            bVar.f9984n = false;
                            bVar.l = gVar;
                            bVar.a();
                        } else {
                            h2.d dVar2 = k0Var.f7142a;
                            bVar.k((((long) Float.floatToRawIntBits(dVar2.f6550a)) << c10) | (((long) Float.floatToRawIntBits(dVar2.f6551b)) & j9), (((long) Float.floatToRawIntBits(dVar2.b())) << c10) | (((long) Float.floatToRawIntBits(dVar2.a())) & j9), Float.intBitsToFloat((int) (dVar2.f6557h >> c10)));
                        }
                    }
                }
            }
            z11 = true;
        } else {
            zVar2 = zVar;
            z11 = false;
        }
        v1Var.N = q0Var.A;
        if (i10 == 0) {
            parent = zVar2.getParent();
            if (parent != null) {
                zVar3 = zVar2;
                parent.onDescendantInvalidated(zVar3, zVar3);
            } else {
                zVar3 = zVar2;
            }
            if (c3.z.n()) {
                zVar3.M(0.0f);
            }
        } else {
            parent = zVar2.getParent();
            if (parent != null) {
                zVar3 = zVar2;
                parent.onDescendantInvalidated(zVar3, zVar3);
            } else {
                zVar3 = zVar2;
            }
            if (c3.z.n()) {
                zVar3.M(0.0f);
            }
        }
        boolean z14 = this.U;
        this.U = q0Var.N;
        this.Y = q0Var.D;
        if (wVar2.f2135a != wVar.f2135a) {
            z12 = false;
        } else {
            z12 = false;
        }
        if (z10) {
            ((c3.z) owner).y(l0Var2);
        }
        if (z12) {
            l0Var2.P(this);
            if (l0Var2.f2069q0 > 0) {
                c3.z zVar6 = (c3.z) p0.a(l0Var2);
                u0Var = zVar6.f2819y0.f1993e;
                u0Var.getClass();
                if (l0Var2.f2069q0 > 0) {
                    ((m1.e) u0Var.B).b(l0Var2);
                    l0Var2.f2068p0 = true;
                }
                zVar6.F(null);
            }
        }
    }

    public final boolean a2(long j9) throws NoWhenBranchMatchedException {
        boolean z10;
        boolean z11;
        boolean zT;
        if ((((9187343241974906880L ^ (j9 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        z1 z1Var = this.f2107n0;
        if (z1Var == null || !this.U) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        l2.b bVar = ((c3.v1) z1Var).A;
        if (bVar.f9993w) {
            i2.l0 l0VarD = bVar.d();
            if (l0VarD instanceof i2.j0) {
                h2.c cVar = ((i2.j0) l0VarD).f7140a;
                if (cVar.f6546a > fIntBitsToFloat || fIntBitsToFloat >= cVar.f6548c || cVar.f6547b > fIntBitsToFloat2 || fIntBitsToFloat2 >= cVar.f6549d) {
                    z10 = false;
                    z11 = true;
                }
                z10 = false;
                z11 = true;
            } else if (l0VarD instanceof i2.k0) {
                h2.d dVar = ((i2.k0) l0VarD).f7142a;
                float f3 = dVar.f6550a;
                long j10 = dVar.f6555f;
                long j11 = dVar.f6557h;
                long j12 = dVar.f6556g;
                float f10 = dVar.f6553d;
                float f11 = dVar.f6551b;
                z10 = false;
                float f12 = dVar.f6552c;
                z11 = true;
                long j13 = dVar.f6554e;
                if (fIntBitsToFloat >= f3 && fIntBitsToFloat < f12 && fIntBitsToFloat2 >= f11 && fIntBitsToFloat2 < f10) {
                    int i10 = (int) (j13 >> 32);
                    int i11 = (int) (j10 >> 32);
                    if (Float.intBitsToFloat(i11) + Float.intBitsToFloat(i10) <= dVar.b()) {
                        int i12 = (int) (j11 >> 32);
                        int i13 = (int) (j12 >> 32);
                        if (Float.intBitsToFloat(i13) + Float.intBitsToFloat(i12) <= dVar.b()) {
                            int i14 = (int) (j13 & 4294967295L);
                            int i15 = (int) (j11 & 4294967295L);
                            if (Float.intBitsToFloat(i15) + Float.intBitsToFloat(i14) <= dVar.a()) {
                                int i16 = (int) (j10 & 4294967295L);
                                int i17 = (int) (j12 & 4294967295L);
                                if (Float.intBitsToFloat(i17) + Float.intBitsToFloat(i16) <= dVar.a()) {
                                    float fIntBitsToFloat3 = Float.intBitsToFloat(i10) + f3;
                                    float fIntBitsToFloat4 = Float.intBitsToFloat(i14) + f11;
                                    float fIntBitsToFloat5 = f12 - Float.intBitsToFloat(i11);
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i16) + f11;
                                    float fIntBitsToFloat7 = f12 - Float.intBitsToFloat(i13);
                                    float fIntBitsToFloat8 = f10 - Float.intBitsToFloat(i17);
                                    float fIntBitsToFloat9 = f10 - Float.intBitsToFloat(i15);
                                    float fIntBitsToFloat10 = Float.intBitsToFloat(i12) + f3;
                                    if (fIntBitsToFloat < fIntBitsToFloat3 && fIntBitsToFloat2 < fIntBitsToFloat4) {
                                        zT = c3.m0.t(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, dVar.f6554e);
                                    } else if (fIntBitsToFloat < fIntBitsToFloat10 && fIntBitsToFloat2 > fIntBitsToFloat9) {
                                        zT = c3.m0.t(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat10, fIntBitsToFloat9, dVar.f6557h);
                                    } else if (fIntBitsToFloat <= fIntBitsToFloat5 || fIntBitsToFloat2 >= fIntBitsToFloat6) {
                                        zT = (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 <= fIntBitsToFloat8) ? z11 : c3.m0.t(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, dVar.f6556g);
                                    } else {
                                        zT = c3.m0.t(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, dVar.f6555f);
                                    }
                                } else {
                                    i2.g gVarA = i2.j.a();
                                    i2.g.c(gVarA, dVar);
                                    zT = c3.m0.s(fIntBitsToFloat, fIntBitsToFloat2, gVarA);
                                }
                            } else {
                                i2.g gVarA2 = i2.j.a();
                                i2.g.c(gVarA2, dVar);
                                zT = c3.m0.s(fIntBitsToFloat, fIntBitsToFloat2, gVarA2);
                            }
                        } else {
                            i2.g gVarA3 = i2.j.a();
                            i2.g.c(gVarA3, dVar);
                            zT = c3.m0.s(fIntBitsToFloat, fIntBitsToFloat2, gVarA3);
                        }
                    } else {
                        i2.g gVarA4 = i2.j.a();
                        i2.g.c(gVarA4, dVar);
                        zT = c3.m0.s(fIntBitsToFloat, fIntBitsToFloat2, gVarA4);
                    }
                }
            } else {
                z10 = false;
                z11 = true;
                if (!(l0VarD instanceof i2.i0)) {
                    throw new NoWhenBranchMatchedException();
                }
                zT = c3.m0.s(fIntBitsToFloat, fIntBitsToFloat2, ((i2.i0) l0VarD).f7139a);
            }
            zT = z10;
        } else {
            z10 = false;
            z11 = true;
        }
        return zT ? z11 : z10;
    }

    @Override
    public final float c() {
        return this.O.Z.c();
    }

    @Override
    public final long c0(long j9) {
        if (!z1().N) {
            y2.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return o(z2.d0.i(this), ((c3.z) p0.a(this.O)).G(j9), true);
    }

    @Override
    public final u0 c1() {
        return this.S;
    }

    @Override
    public final long d0(long j9) {
        if (!z1().N) {
            y2.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        I1();
        while (this != null) {
            l0 l0Var = this.O;
            if (this == ((p1) l0Var.f2059g0.E) && !l0Var.C) {
                long jB = ((c3.z) p0.a(l0Var)).getRectManager().b(l0Var);
                if (!y3.j.b(jB, 9223372034707292159L)) {
                    return f50.k.y(j9, jB);
                }
            }
            z1 z1Var = this.f2107n0;
            if (z1Var != null) {
                j9 = ((c3.v1) z1Var).c(false, j9);
            }
            j9 = f50.k.y(j9, this.f2095b0);
            this = this.S;
        }
        return j9;
    }

    @Override
    public final long e(long j9) {
        long jD0 = d0(j9);
        c3.z zVar = (c3.z) p0.a(this.O);
        zVar.C();
        return i2.h0.b(zVar.C0, jD0);
    }

    @Override
    public final long e1() {
        return this.f2095b0;
    }

    @Override
    public final void f(z2.a0 a0Var, float[] fArr) {
        p1 p1VarU1 = U1(a0Var);
        p1VarU1.I1();
        p1 p1VarV1 = v1(p1VarU1);
        i2.h0.d(fArr);
        p1VarU1.X1(p1VarV1, fArr);
        W1(p1VarV1, fArr);
    }

    @Override
    public final y3.m getLayoutDirection() {
        return this.O.f2053a0;
    }

    @Override
    public final z2.a0 h() {
        if (!z1().N) {
            y2.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        I1();
        return this.S;
    }

    @Override
    public final void k(float[] fArr) {
        Owner ownerA = p0.a(this.O);
        p1 p1VarU1 = U1(z2.d0.i(this));
        X1(p1VarU1, fArr);
        if (ownerA instanceof v2.f) {
            ((c3.z) ((v2.f) ownerA)).r(fArr);
            return;
        }
        long jG = p1VarU1.G(0L);
        if ((9223372034707292159L & jG) != 9205357640488583168L) {
            i2.h0.f(fArr, Float.intBitsToFloat((int) (jG >> 32)), Float.intBitsToFloat((int) (jG & 4294967295L)));
        }
    }

    @Override
    public final void m1() {
        l2.b bVar = this.f2108o0;
        if (bVar != null) {
            q0(this.f2095b0, this.f2096c0, bVar);
        } else {
            r0(this.f2095b0, this.f2096c0, this.V);
        }
    }

    @Override
    public final long o(z2.a0 a0Var, long j9, boolean z10) {
        if (a0Var instanceof z2.s0) {
            z2.s0 s0Var = (z2.s0) a0Var;
            s0Var.A.O.I1();
            return s0Var.o(this, j9 ^ (-9223372034707292160L), z10) ^ (-9223372034707292160L);
        }
        p1 p1VarU1 = U1(a0Var);
        p1VarU1.I1();
        p1 p1VarV1 = v1(p1VarU1);
        while (p1VarU1 != p1VarV1) {
            z1 z1Var = p1VarU1.f2107n0;
            if (z1Var != null) {
                j9 = ((c3.v1) z1Var).c(false, j9);
            }
            if (z10 || !p1VarU1.I) {
                j9 = f50.k.y(j9, p1VarU1.f2095b0);
            }
            p1VarU1 = p1VarU1.S;
            kotlin.jvm.internal.m.b(p1VarU1);
        }
        return p1(p1VarV1, j9, z10);
    }

    public final void o1(p1 p1Var, h2.a aVar, boolean z10) {
        if (p1Var == this) {
            return;
        }
        p1 p1Var2 = this.S;
        if (p1Var2 != null) {
            p1Var2.o1(p1Var, aVar, z10);
        }
        long j9 = this.f2095b0;
        float f3 = (int) (j9 >> 32);
        aVar.f6540b -= f3;
        aVar.f6542d -= f3;
        float f10 = (int) (j9 & 4294967295L);
        aVar.f6541c -= f10;
        aVar.f6543e -= f10;
        z1 z1Var = this.f2107n0;
        if (z1Var != null) {
            c3.v1 v1Var = (c3.v1) z1Var;
            float[] fArrA = v1Var.a();
            if (!v1Var.S) {
                if (fArrA == null) {
                    aVar.f6540b = 0.0f;
                    aVar.f6541c = 0.0f;
                    aVar.f6542d = 0.0f;
                    aVar.f6543e = 0.0f;
                } else {
                    i2.h0.c(fArrA, aVar);
                }
            }
            if (this.U && z10) {
                long j10 = this.C;
                aVar.a(0.0f, 0.0f, (int) (j10 >> 32), (int) (j10 & 4294967295L));
            }
        }
    }

    @Override
    public final long p() {
        return this.C;
    }

    public final long p1(p1 p1Var, long j9, boolean z10) {
        if (p1Var == this) {
            return j9;
        }
        p1 p1Var2 = this.S;
        return (p1Var2 == null || kotlin.jvm.internal.m.a(p1Var, p1Var2)) ? w1(z10, j9) : w1(z10, p1Var2.p1(p1Var, j9, z10));
    }

    @Override
    public abstract void q0(long j9, float f3, l2.b bVar);

    public final long q1(long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) - j0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L)) - i0();
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L);
    }

    public final float r1(long j9, long j10) {
        if (j0() >= Float.intBitsToFloat((int) (j10 >> 32)) && i0() >= Float.intBitsToFloat((int) (j10 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jQ1 = q1(j10);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jQ1 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jQ1 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j9 >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - j0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - i0()))) & 4294967295L);
        if ((fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) <= fIntBitsToFloat2) {
            return h2.b.d(jFloatToRawIntBits);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void s1(i2.s sVar, l2.b bVar) throws NoWhenBranchMatchedException {
        z1 z1Var = this.f2107n0;
        if (z1Var == null) {
            long j9 = this.f2095b0;
            float f3 = (int) (j9 >> 32);
            float f10 = (int) (j9 & 4294967295L);
            sVar.p(f3, f10);
            t1(sVar, bVar);
            sVar.p(-f3, -f10);
            return;
        }
        c3.v1 v1Var = (c3.v1) z1Var;
        k2.b bVar2 = v1Var.M;
        v1Var.f();
        v1Var.T = v1Var.A.f9973a.f10007o > 0.0f;
        a1.i iVar = bVar2.B;
        iVar.y(sVar);
        iVar.C = bVar;
        rd.a.x(bVar2, v1Var.A);
    }

    @Override
    public final float t0() {
        return this.O.Z.t0();
    }

    public final void t1(i2.s sVar, l2.b bVar) {
        p1 p1Var;
        i2.s sVar2;
        l2.b bVar2;
        b2.q qVarA1 = A1(4);
        if (qVarA1 == null) {
            O1(sVar, bVar);
            return;
        }
        l0 l0Var = this.O;
        l0Var.getClass();
        o0 sharedDrawScope = ((c3.z) p0.a(l0Var)).getSharedDrawScope();
        long jM0 = kh.n.m0(this.C);
        sharedDrawScope.getClass();
        m1.e eVar = null;
        while (qVarA1 != null) {
            if (qVarA1 instanceof o) {
                p1Var = this;
                sVar2 = sVar;
                bVar2 = bVar;
                sharedDrawScope.d(sVar2, jM0, p1Var, (o) qVarA1, bVar2);
            } else {
                p1Var = this;
                sVar2 = sVar;
                bVar2 = bVar;
                if ((qVarA1.C & 4) != 0 && (qVarA1 instanceof l)) {
                    int i10 = 0;
                    for (b2.q qVar = ((l) qVarA1).P; qVar != null; qVar = qVar.F) {
                        if ((qVar.C & 4) != 0) {
                            i10++;
                            if (i10 == 1) {
                                qVarA1 = qVar;
                            } else {
                                if (eVar == null) {
                                    eVar = new m1.e(0, new b2.q[16]);
                                }
                                if (qVarA1 != null) {
                                    eVar.b(qVarA1);
                                    qVarA1 = null;
                                }
                                eVar.b(qVar);
                            }
                        }
                    }
                    if (i10 == 1) {
                    }
                }
                sVar = sVar2;
                this = p1Var;
                bVar = bVar2;
            }
            qVarA1 = m.e(eVar);
            sVar = sVar2;
            this = p1Var;
            bVar = bVar2;
        }
    }

    @Override
    public final boolean u() {
        return (this.f2107n0 == null || this.T || !this.O.J()) ? false : true;
    }

    public abstract void u1();

    public final p1 v1(p1 p1Var) {
        l0 l0VarX = p1Var.O;
        l0 l0Var = this.O;
        if (l0VarX == l0Var) {
            b2.q qVarZ1 = p1Var.z1();
            b2.q qVarZ2 = z1();
            if (!qVarZ2.A.N) {
                y2.a.c("visitLocalAncestors called on an unattached node");
            }
            for (b2.q qVar = qVarZ2.A.E; qVar != null; qVar = qVar.E) {
                if ((qVar.C & 2) != 0 && qVar == qVarZ1) {
                    return p1Var;
                }
            }
            return this;
        }
        while (l0VarX.Q > l0Var.Q) {
            l0VarX = l0VarX.x();
            kotlin.jvm.internal.m.b(l0VarX);
        }
        l0 l0VarX2 = l0Var;
        while (l0VarX2.Q > l0VarX.Q) {
            l0VarX2 = l0VarX2.x();
            kotlin.jvm.internal.m.b(l0VarX2);
        }
        while (l0VarX != l0VarX2) {
            l0VarX = l0VarX.x();
            l0VarX2 = l0VarX2.x();
            if (l0VarX == null || l0VarX2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (l0VarX2 != l0Var) {
            if (l0VarX != p1Var.O) {
                return (u) l0VarX.f2059g0.D;
            }
            return p1Var;
        }
        return this;
    }

    public final long w1(boolean z10, long j9) {
        if (z10 || !this.I) {
            long j10 = this.f2095b0;
            j9 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 >> 32)) - ((int) (j10 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 & 4294967295L)) - ((int) (j10 & 4294967295L)))) & 4294967295L);
        }
        z1 z1Var = this.f2107n0;
        return z1Var != null ? ((c3.v1) z1Var).c(true, j9) : j9;
    }

    public abstract v0 x1();

    public final long y1() {
        return this.W.b1(this.O.f2054b0.e());
    }

    public abstract b2.q z1();
}
