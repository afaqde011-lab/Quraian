package b3;

public final class o0 implements k2.d {
    public final k2.b A = new k2.b();
    public o B;

    @Override
    public final float A0(float f3) {
        return this.A.c() * f3;
    }

    @Override
    public final void E(long j9, float f3, long j10, int i10) {
        this.A.E(j9, f3, j10, i10);
    }

    @Override
    public final a1.i G0() {
        return this.A.B;
    }

    @Override
    public final float H(long j9) {
        return this.A.H(j9);
    }

    @Override
    public final void K0(long j9, float f3, float f10, long j10, long j11, float f11, k2.h hVar) {
        this.A.K0(j9, f3, f10, j10, j11, f11, hVar);
    }

    @Override
    public final void L(i2.q qVar, long j9, long j10, long j11, float f3, k2.e eVar) {
        this.A.L(qVar, j9, j10, j11, f3, eVar);
    }

    @Override
    public final void M0(long j9, l2.b bVar, u00.k kVar) {
        bVar.e(this, getLayoutDirection(), j9, new n0(this, this.B, kVar, 0));
    }

    @Override
    public final void P(long j9, long j10, long j11, float f3, int i10) {
        this.A.P(j9, j10, j11, f3, i10);
    }

    @Override
    public final void Q0(long j9, long j10, long j11, float f3, k2.e eVar, int i10) {
        this.A.Q0(j9, j10, j11, f3, eVar, i10);
    }

    @Override
    public final int R0(float f3) {
        return this.A.R0(f3);
    }

    @Override
    public final void S(i2.q qVar, long j9, long j10, float f3, k2.e eVar, int i10) {
        this.A.S(qVar, j9, j10, f3, eVar, i10);
    }

    @Override
    public final long Y0() {
        return this.A.Y0();
    }

    public final void a() {
        k2.b bVar = this.A;
        i2.s sVarN = bVar.B.n();
        k kVar = this.B;
        if (kVar == null) {
            throw a1.b.u("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        b2.q qVar = (b2.q) kVar;
        b2.q qVarE = qVar.A.F;
        if (qVarE != null && (qVarE.D & 4) != 0) {
            while (true) {
                if (qVarE != null) {
                    int i10 = qVarE.C;
                    if ((i10 & 2) == 0) {
                        if ((i10 & 4) != 0) {
                            break;
                        } else {
                            qVarE = qVarE.F;
                        }
                    }
                }
                qVarE = null;
                break;
            }
        } else {
            qVarE = null;
            break;
        }
        if (qVarE == null) {
            p1 p1VarV = m.v(kVar, 4);
            if (p1VarV.z1() == qVar.A) {
                p1VarV = p1VarV.R;
                kotlin.jvm.internal.m.b(p1VarV);
            }
            p1VarV.O1(sVarN, (l2.b) bVar.B.C);
            return;
        }
        m1.e eVar = null;
        while (qVarE != null) {
            if (qVarE instanceof o) {
                o oVar = (o) qVarE;
                l2.b bVar2 = (l2.b) bVar.B.C;
                p1 p1VarV2 = m.v(oVar, 4);
                long jM0 = kh.n.m0(p1VarV2.C);
                l0 l0Var = p1VarV2.O;
                l0Var.getClass();
                ((c3.z) p0.a(l0Var)).getSharedDrawScope().d(sVarN, jM0, p1VarV2, oVar, bVar2);
            } else if ((qVarE.C & 4) != 0 && (qVarE instanceof l)) {
                int i11 = 0;
                for (b2.q qVar2 = ((l) qVarE).P; qVar2 != null; qVar2 = qVar2.F) {
                    if ((qVar2.C & 4) != 0) {
                        i11++;
                        if (i11 == 1) {
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
                if (i11 == 1) {
                }
            }
            qVarE = m.e(eVar);
        }
    }

    @Override
    public final long b() {
        return this.A.b();
    }

    @Override
    public final long b0(float f3) {
        return this.A.b0(f3);
    }

    @Override
    public final long b1(long j9) {
        return this.A.b1(j9);
    }

    @Override
    public final float c() {
        return this.A.c();
    }

    public final void d(i2.s sVar, long j9, p1 p1Var, o oVar, l2.b bVar) {
        o oVar2 = this.B;
        this.B = oVar;
        y3.m mVar = p1Var.O.f2053a0;
        k2.b bVar2 = this.A;
        y3.c cVarO = bVar2.B.o();
        a1.i iVar = bVar2.B;
        y3.m mVarP = iVar.p();
        i2.s sVarN = iVar.n();
        long jQ = iVar.q();
        l2.b bVar3 = (l2.b) iVar.C;
        iVar.z(p1Var);
        iVar.B(mVar);
        iVar.y(sVar);
        iVar.C(j9);
        iVar.C = bVar;
        sVar.i();
        try {
            oVar.i(this);
            sVar.q();
            iVar.z(cVarO);
            iVar.B(mVarP);
            iVar.y(sVarN);
            iVar.C(jQ);
            iVar.C = bVar3;
            this.B = oVar2;
        } catch (Throwable th2) {
            sVar.q();
            iVar.z(cVarO);
            iVar.B(mVarP);
            iVar.y(sVarN);
            iVar.C(jQ);
            iVar.C = bVar3;
            throw th2;
        }
    }

    @Override
    public final void d1(i2.d dVar, long j9, float f3, i2.m mVar, int i10) {
        this.A.d1(dVar, j9, f3, mVar, i10);
    }

    @Override
    public final float f1(long j9) {
        return this.A.f1(j9);
    }

    @Override
    public final void g0(i2.g gVar, i2.q qVar, float f3, k2.e eVar, int i10) {
        this.A.g0(gVar, qVar, f3, eVar, i10);
    }

    @Override
    public final y3.m getLayoutDirection() {
        return this.A.A.f8917b;
    }

    @Override
    public final float h0(int i10) {
        return this.A.h0(i10);
    }

    @Override
    public final void h1(i2.g gVar, long j9, float f3, k2.e eVar) {
        this.A.h1(gVar, j9, f3, eVar);
    }

    @Override
    public final float k0(float f3) {
        return f3 / this.A.c();
    }

    @Override
    public final void q(long j9, long j10, long j11, long j12, k2.e eVar) {
        this.A.q(j9, j10, j11, j12, eVar);
    }

    @Override
    public final long r(float f3) {
        return this.A.r(f3);
    }

    @Override
    public final long t(long j9) {
        return this.A.t(j9);
    }

    @Override
    public final float t0() {
        return this.A.t0();
    }

    @Override
    public final void u0(i2.d dVar, long j9, long j10, long j11, float f3, i2.m mVar, int i10) {
        this.A.u0(dVar, j9, j10, j11, f3, mVar, i10);
    }

    @Override
    public final void x(i2.q qVar, float f3, long j9, long j10, k2.e eVar) {
        this.A.x(qVar, f3, j9, j10, eVar);
    }
}
